package t29;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f267516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f267517c;

    public w(a31.a aVar, ecm.q qVar) {
        this.f267516b = qVar;
        this.f267517c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f267516b.f124861b).invoke();
        bpj.a aVar = (bpj.a) ((phm.a) this.f267517c.f955b).get();
        context.getClass();
        aVar.getClass();
        return new i(aVar);
    }
}
