package cu1;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f108718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f108719c;

    public b(a31.a aVar, ecm.q qVar) {
        this.f108718b = qVar;
        this.f108719c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f108718b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f108719c.f955b).get();
        context.getClass();
        aVar.getClass();
        return new j(aVar);
    }
}
