package vn2;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f290641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f290642c;
    public final a31.a d;

    public a(a31.a aVar, a31.a aVar2, ecm.q qVar) {
        this.f290641b = qVar;
        this.f290642c = aVar;
        this.d = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f290641b.f124861b).invoke();
        bpj.a aVar = (bpj.a) ((phm.a) this.f290642c.f955b).get();
        ite.a aVar2 = (ite.a) ((phm.a) this.d.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        return new e(context, aVar, aVar2);
    }
}
