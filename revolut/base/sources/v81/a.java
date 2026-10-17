package v81;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f286702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f286703c;

    public a(a31.a aVar, q qVar) {
        this.f286702b = qVar;
        this.f286703c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f286702b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f286703c.f955b).get();
        context.getClass();
        aVar.getClass();
        return new d(aVar);
    }
}
