package gc;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f142283b;

    public /* synthetic */ e(ac.e eVar, int i) {
        this.f142282a = i;
        this.f142283b = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f142282a) {
            case 0:
                String packageName = ((Context) this.f142283b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new l((Context) this.f142283b.get(), Integer.valueOf(l.d).intValue(), "com.google.android.datatransport.events");
        }
    }
}
