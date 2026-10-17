package yah;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f312024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f312025c;

    public b(q qVar, r5a.b bVar) {
        this.f312024b = qVar;
        this.f312025c = bVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f312024b.f124861b).invoke();
        h9h.a aVar = (h9h.a) this.f312025c.get();
        context.getClass();
        aVar.getClass();
        return new a(aVar);
    }
}
