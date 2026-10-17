package mp;

import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class m implements ee0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f207705a;

    public final de0.a a() {
        phm.a aVar = (phm.a) j6.a.i((Context) this.f207705a.f207710c, c21.e.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((c21.b) ((c21.e) aVar2.b())).b();
        }
        throw new IllegalStateException(a0.d.q("Api ", c21.e.class, " is not found"));
    }
}
