package s41;

import android.content.Context;
import ang.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oda.o;
import r6e.a0;
import sri.m;
import vc.s;
import vl3.n;
import wli.x;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f259711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cri.a f259712b;

    public a(cri.a aVar, Context context) {
        this.f259711a = context;
        this.f259712b = aVar;
    }

    public final cl3.a a() {
        Context context = this.f259711a;
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, n.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
        }
        cl3.a aVarD = ((n) aVar2.b()).d();
        s.k(aVarD);
        return aVarD;
    }

    public final gte.a b() {
        Context context = this.f259711a;
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, ite.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
        }
        gte.a aVarB = ((ite.a) aVar2.b()).b();
        s.k(aVarB);
        return aVarB;
    }

    public final w5k.d c() {
        m mVarD = ((g8b.a) this.f259712b).d();
        s.j(mVarD);
        Context context = this.f259711a;
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, jr9.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", jr9.b.class, " is not found"));
        }
        rq9.a aVarA = ((jr9.b) aVar2.b()).a();
        s.k(aVarA);
        c9e.c cVarH = h();
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar3 = (phm.a) j6.a.i(context, so9.b.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", so9.b.class, " is not found"));
        }
        wo9.a aVar5 = (wo9.a) ((ut9.a) ((so9.b) aVar4.b())).u.get();
        s.k(aVar5);
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar6 = (phm.a) ue0.e.j(context).a().get(bw9.a.class);
        b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
        if (aVar7 != null) {
            return new w5k.d(mVarD, aVarA, cVarH, aVar5, ((bw9.a) aVar7.b()).a());
        }
        throw new IllegalStateException(a0.d.q("Api ", bw9.a.class, " is not found"));
    }

    public final x d() {
        Context context = this.f259711a;
        Intrinsics.checkNotNullParameter(context, "context");
        final hf0.a aVarJ = ue0.e.j(context);
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        return new x(new Function0() { // from class: s41.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) aVarJ.a().get(emi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return ((emi.a) aVar2.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 1:
                        phm.a aVar3 = (phm.a) aVarJ.a().get(emi.a.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 != null) {
                            return (lg0.b) ((emi.a) aVar4.b()).f127664g.get();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    default:
                        phm.a aVar5 = (phm.a) aVarJ.a().get(u06.c.class);
                        b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                        if (aVar6 != null) {
                            return ((u06.c) aVar6.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", u06.c.class, " is not found"));
                }
            }
        }, new Function0() { // from class: s41.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) aVarJ.a().get(emi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return ((emi.a) aVar2.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 1:
                        phm.a aVar3 = (phm.a) aVarJ.a().get(emi.a.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 != null) {
                            return (lg0.b) ((emi.a) aVar4.b()).f127664g.get();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    default:
                        phm.a aVar5 = (phm.a) aVarJ.a().get(u06.c.class);
                        b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                        if (aVar6 != null) {
                            return ((u06.c) aVar6.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", u06.c.class, " is not found"));
                }
            }
        }, new Function0() { // from class: s41.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) aVarJ.a().get(emi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return ((emi.a) aVar2.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    case 1:
                        phm.a aVar3 = (phm.a) aVarJ.a().get(emi.a.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 != null) {
                            return (lg0.b) ((emi.a) aVar4.b()).f127664g.get();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", emi.a.class, " is not found"));
                    default:
                        phm.a aVar5 = (phm.a) aVarJ.a().get(u06.c.class);
                        b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
                        if (aVar6 != null) {
                            return ((u06.c) aVar6.b()).a();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", u06.c.class, " is not found"));
                }
            }
        });
    }

    public final nw9.d e() {
        m mVarD = ((g8b.a) this.f259712b).d();
        s.j(mVarD);
        Context context = this.f259711a;
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, xmg.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", xmg.a.class, " is not found"));
        }
        f fVarE = ((xmg.a) aVar2.b()).e();
        phm.a aVar3 = (phm.a) kii.e.l(context, "context", context, x2c.a.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", x2c.a.class, " is not found"));
        }
        y2c.c cVar = (y2c.c) ((x2c.a) aVar4.b()).f302538c.get();
        s.k(cVar);
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar5 = (phm.a) ue0.e.j(context).a().get(v8k.a.class);
        b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
        if (aVar6 == null) {
            throw new IllegalStateException(a0.d.q("Api ", v8k.a.class, " is not found"));
        }
        y8k.b bVarA = ((v8k.a) aVar6.b()).a();
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar7 = (phm.a) j6.a.i(context, a0.class);
        b60.a aVar8 = aVar7 != null ? (b60.a) aVar7.get() : null;
        if (aVar8 != null) {
            return new nw9.d(mVarD, fVarE, cVar, bVarA, new nw9.f(((a0) aVar8.b()).c()));
        }
        throw new IllegalStateException(a0.d.q("Api ", a0.class, " is not found"));
    }

    public final sda.c f() {
        Context context = this.f259711a;
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, usg.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", usg.a.class, " is not found"));
        }
        wsg.n nVarB = ((usg.a) aVar2.b()).b();
        m mVarD = ((g8b.a) this.f259712b).d();
        s.j(mVarD);
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar3 = (phm.a) j6.a.i(context, o.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
        }
        q06.d dVarA = ((o) aVar4.b()).f224402l.a();
        s.j(dVarA);
        return new sda.c(nVarB, mVarD, new sda.e(dVarA), b());
    }

    public final rae.b g() {
        m mVarD = ((g8b.a) this.f259712b).d();
        s.j(mVarD);
        return new rae.b(mVarD, h());
    }

    public final c9e.c h() {
        Context context = this.f259711a;
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, x9e.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", x9e.a.class, " is not found"));
        }
        c9e.c cVarB = ((x9e.a) aVar2.b()).b();
        s.k(cVarB);
        return cVarB;
    }
}
