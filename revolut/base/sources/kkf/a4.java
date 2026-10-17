package kkf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f184595b;

    public /* synthetic */ a4(n4 n4Var, int i) {
        this.f184594a = i;
        this.f184595b = n4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f184594a) {
            case 0:
                String transactionId = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                n4 n4Var = this.f184595b;
                return new g4(boh.f.e(((ti9.g) n4Var.f184844m).m(transactionId), new a4(n4Var, 5)), n4Var, 0);
            case 1:
                od0.i plan = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                if (!plan.d()) {
                    return vkm.i.f290039a;
                }
                xh9.a aVar = this.f184595b.f184844m;
                String planId = ((zh9.r0) plan.c()).f322326a;
                ti9.g gVar = (ti9.g) aVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(planId, "planId");
                return rd0.e.b(pd.b.r(nim.a.w(gVar.l(planId), new tfh.a(12)), new ti9.a(gVar, 1)));
            case 2:
                String transactionId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                n4 n4Var2 = this.f184595b;
                return new i4(zh9.u0.m(((ti9.g) n4Var2.f184844m).m(transactionId2), ((ti9.g) n4Var2.f184844m).k(w4l.h.f294642c)), n4Var2, 0);
            case 3:
                String transactionId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId3, "transactionId");
                n4 n4Var3 = this.f184595b;
                return new g4(boh.f.e(((ti9.g) n4Var3.f184844m).m(transactionId3), new a4(n4Var3, 1)), n4Var3, 1);
            case 4:
                String transactionId4 = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId4, "transactionId");
                n4 n4Var4 = this.f184595b;
                return new i4(zh9.u0.m(((ti9.g) n4Var4.f184844m).m(transactionId4), ((ti9.g) n4Var4.f184844m).k(w4l.h.f294642c)), n4Var4, 1);
            default:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((ti9.g) this.f184595b.f184844m).g(((zh9.r0) it8.c()).f322327b);
        }
    }
}
