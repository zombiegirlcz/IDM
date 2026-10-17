package ac;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3006b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f3005a = i;
        this.f3006b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f3005a) {
            case 0:
                return new gpk.c((Context) ((e) this.f3006b).f3006b, new ah.a(6), new af.f(6));
            default:
                return this.f3006b;
        }
    }
}
