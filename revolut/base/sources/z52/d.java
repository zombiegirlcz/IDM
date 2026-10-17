package z52;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f319422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f319423c;

    public d(a31.a aVar, ecm.q qVar) {
        this.f319422b = qVar;
        this.f319423c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f319422b.f124861b).invoke();
        uw1.b bVar = (uw1.b) ((phm.a) this.f319423c.f955b).get();
        context.getClass();
        bVar.getClass();
        return new h(bVar);
    }
}
