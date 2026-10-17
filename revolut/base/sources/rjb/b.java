package rjb;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f254650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f254651c;

    public b(a31.a aVar, q qVar) {
        this.f254650b = qVar;
        this.f254651c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f254650b.f124861b).invoke();
        xmg.a aVar = (xmg.a) ((phm.a) this.f254651c.f955b).get();
        context.getClass();
        aVar.getClass();
        return new a(aVar);
    }
}
