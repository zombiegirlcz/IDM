package tq1;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f273479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f273480c;

    public a(a31.a aVar, q qVar) {
        this.f273479b = qVar;
        this.f273480c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f273479b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f273480c.f955b).get();
        context.getClass();
        aVar.getClass();
        return new c(new b(), aVar);
    }
}
