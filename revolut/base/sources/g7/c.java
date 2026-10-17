package g7;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f141022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f141023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f141024c;
    public Object d;

    public c(Context context) {
        this.f141022a = 1;
        this.f141023b = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f141024c = activityManager;
        this.d = new mp.r(context.getResources().getDisplayMetrics(), 10);
        if (activityManager.isLowRamDevice()) {
            this.f141022a = BitmapDescriptorFactory.HUE_RED;
        }
    }

    @Override // g7.b
    public s7.a a() {
        return (s7.a) this.f141024c;
    }

    public s7.a b(float f) {
        List list = (List) this.f141023b;
        s7.a aVar = (s7.a) a0.d.e(1, list);
        if (f >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            s7.a aVar2 = (s7.a) list.get(size);
            if (((s7.a) this.f141024c) != aVar2 && f >= aVar2.b() && f < aVar2.a()) {
                return aVar2;
            }
        }
        return (s7.a) list.get(0);
    }

    @Override // g7.b
    public float e() {
        return ((s7.a) ((List) this.f141023b).get(0)).b();
    }

    @Override // g7.b
    public boolean i(float f) {
        s7.a aVar = (s7.a) this.d;
        s7.a aVar2 = (s7.a) this.f141024c;
        if (aVar == aVar2 && this.f141022a == f) {
            return true;
        }
        this.d = aVar2;
        this.f141022a = f;
        return false;
    }

    @Override // g7.b
    public boolean isEmpty() {
        return false;
    }

    @Override // g7.b
    public boolean k(float f) {
        s7.a aVar = (s7.a) this.f141024c;
        if (f >= aVar.b() && f < aVar.a()) {
            return !((s7.a) this.f141024c).c();
        }
        this.f141024c = b(f);
        return true;
    }

    @Override // g7.b
    public float o() {
        return ((s7.a) a0.d.e(1, (List) this.f141023b)).a();
    }

    public c(List list) {
        this.d = null;
        this.f141022a = -1.0f;
        this.f141023b = list;
        this.f141024c = b(BitmapDescriptorFactory.HUE_RED);
    }
}
