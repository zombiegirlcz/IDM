package rg;

import aed.f;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sg.d;
import tg.m;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements GoogleMap.OnCameraIdleListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug.c f253989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ug.b f253990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ug.b f253991c;
    public final d d;
    public m e;
    public final GoogleMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CameraPosition f253992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f253993h;
    public final ReentrantReadWriteLock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f253994j;
    public f k;

    public c(Context context, GoogleMap googleMap) {
        ug.c cVar = new ug.c(googleMap);
        this.i = new ReentrantReadWriteLock();
        this.f = googleMap;
        this.f253989a = cVar;
        this.f253991c = new ug.b(cVar);
        this.f253990b = new ug.b(cVar);
        this.e = new m(context, googleMap, this);
        sg.c cVar2 = new sg.c(new sg.b());
        d dVar = new d(11);
        dVar.f262571b = cVar2;
        this.d = dVar;
        this.f253993h = new b(this);
        this.e.c();
    }

    public final void a() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.i;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f253993h.cancel(true);
            b bVar = new b(this);
            this.f253993h = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f.getCameraPosition().zoom));
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public final void onCameraIdle() {
        Object obj2 = this.e;
        if (obj2 instanceof GoogleMap.OnCameraIdleListener) {
            ((GoogleMap.OnCameraIdleListener) obj2).onCameraIdle();
        }
        GoogleMap googleMap = this.f;
        googleMap.getCameraPosition();
        this.d.getClass();
        CameraPosition cameraPosition = this.f253992g;
        if (cameraPosition == null || cameraPosition.zoom != googleMap.getCameraPosition().zoom) {
            this.f253992g = googleMap.getCameraPosition();
            a();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public final void onInfoWindowClick(Marker marker) {
        this.f253989a.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        return this.f253989a.onMarkerClick(marker);
    }
}
