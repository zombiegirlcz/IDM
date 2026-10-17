package shi;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f263496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f263497c;
    public final a31.a d;

    public d(a31.a aVar, q qVar, q qVar2) {
        this.f263496b = qVar;
        this.f263497c = qVar2;
        this.d = aVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f263496b.f124861b).invoke();
        yhi.a aVar = (yhi.a) ((Function0) this.f263497c.f124861b).invoke();
        js8.a aVar2 = (js8.a) ((phm.a) this.d.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        return new a(aVar2, context, aVar);
    }
}
