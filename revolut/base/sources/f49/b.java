package f49;

import android.content.Context;
import l70.e;
import vc.s;
import z39.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f132034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f132035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f132036c;

    public b(e eVar, ite.a aVar, Context context) {
        this.f132034a = eVar;
        this.f132035b = context;
        this.f132036c = aVar;
    }

    public final h a() {
        z39.e eVar = new z39.e();
        e eVar2 = this.f132034a;
        z70.c cVar = new z70.c(eVar2.f192431a);
        y80.a aVarR = eVar2.r();
        s.j(aVarR);
        z39.d dVar = new z39.d(this.f132035b, aVarR);
        gte.a aVarB = this.f132036c.b();
        s.j(aVarB);
        return new h(eVar, cVar, dVar, aVarB);
    }
}
