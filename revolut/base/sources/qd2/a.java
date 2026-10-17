package qd2;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f244821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f244822c;

    public a(a31.a aVar, q qVar) {
        this.f244821b = qVar;
        this.f244822c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f244821b.f124861b).invoke();
        uw1.b bVar = (uw1.b) ((phm.a) this.f244822c.f955b).get();
        context.getClass();
        bVar.getClass();
        return new e(bVar);
    }
}
