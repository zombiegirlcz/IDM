package xo0;

import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f307559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f307560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f307561c;
    public final float d;
    public final float e;
    public l f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f307563h;
    public float i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f307562g = new Path();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f307564j = true;

    public m(float f, float f4, float f5, float f6, float f32) {
        this.f307559a = f;
        this.f307560b = f4;
        this.f307561c = f5;
        this.d = f6;
        this.e = f32;
    }

    public final Path a() {
        boolean z = this.f307564j;
        Path path = this.f307562g;
        if (z) {
            path.reset();
            l lVar = this.f;
            if (lVar != null) {
                lVar.g(path, new k(this.i, this.f307563h, this.d, this.e), new k(this.f307560b, this.f307559a, this.f307561c, BitmapDescriptorFactory.HUE_RED));
            }
            this.f307564j = false;
        }
        return path;
    }
}
