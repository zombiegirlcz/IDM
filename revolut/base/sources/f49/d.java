package f49;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import l70.e;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f132041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f132042c;
    public final a31.a d;

    public d(a31.a aVar, a31.a aVar2, q qVar) {
        this.f132041b = qVar;
        this.f132042c = aVar;
        this.d = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f132041b.f124861b).invoke();
        e eVar = (e) ((phm.a) this.f132042c.f955b).get();
        ite.a aVar = (ite.a) ((phm.a) this.d.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        return new b(eVar, aVar, context);
    }
}
