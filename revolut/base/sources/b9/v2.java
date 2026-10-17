package b9;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class v2 extends g4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13491a = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f13492b;

    public v2(w2 w2Var) {
        this.f13492b = w2Var;
    }

    @Override // g4i.a
    public final void r(String str) {
        this.f13491a = ((u2) this.f13492b.d).d.measureText(str) + this.f13491a;
    }
}
