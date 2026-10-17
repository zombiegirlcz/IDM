package ms1;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f208507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f208508c;

    public a(a31.a aVar, ecm.q qVar) {
        this.f208507b = qVar;
        this.f208508c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f208507b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f208508c.f955b).get();
        context.getClass();
        aVar.getClass();
        return new i(aVar);
    }
}
