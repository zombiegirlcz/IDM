package dfb;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f113881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f113882c;
    public final a31.a d;

    public o(a31.a aVar, a31.a aVar2, q qVar) {
        this.f113881b = qVar;
        this.f113882c = aVar;
        this.d = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f113881b.f124861b).invoke();
        ite.a aVar = (ite.a) ((phm.a) this.f113882c.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.d.f955b).get();
        context.getClass();
        aVar.getClass();
        bVar.getClass();
        return new h(aVar, bVar);
    }
}
