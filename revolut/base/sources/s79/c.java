package s79;

import android.content.Context;
import c21.e;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f260595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f260596c;

    public c(a31.a aVar, q qVar) {
        this.f260595b = qVar;
        this.f260596c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f260595b.f124861b).invoke();
        e eVar = (e) ((phm.a) this.f260596c.f955b).get();
        context.getClass();
        eVar.getClass();
        return new b(eVar);
    }
}
