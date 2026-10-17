package p8a;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f233886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f233887c;

    public a(a31.a aVar, ecm.q qVar) {
        this.f233886b = qVar;
        this.f233887c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f233886b.f124861b).invoke();
        hp.e eVar = (hp.e) ((phm.a) this.f233887c.f955b).get();
        context.getClass();
        eVar.getClass();
        return new b(eVar);
    }
}
