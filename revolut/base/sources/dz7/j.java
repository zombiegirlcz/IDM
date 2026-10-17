package dz7;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zw7.u;
import zw7.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f121273b;

    public /* synthetic */ j(m mVar, int i) {
        this.f121272a = i;
        this.f121273b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121272a) {
            case 0:
                v overduePayments = (v) obj2;
                Intrinsics.checkNotNullParameter(overduePayments, "overduePayments");
                m mVar = this.f121273b;
                mVar.getClass();
                d0 list = w.h(overduePayments.f325857a).flatMapIterable(new dv5.n(new k(0), 29)).flatMapSingle(new l(new j(mVar, 1), 0)).toList();
                Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
                dv5.n nVar = new dv5.n(new dug.a(overduePayments, 17), 27);
                list.getClass();
                ufm.f fVar = new ufm.f(new ufm.i(list, nVar, 1), new dv5.n(new doe.c(mVar, overduePayments, 20), 28), 3);
                Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                return fVar;
            default:
                u petId = (u) obj2;
                Intrinsics.checkNotNullParameter(petId, "petId");
                d0 d0VarFirstOrError = m70.a.f(this.f121273b.f121278c.d(petId.f325853a), new dbg.b(petId, 16), new dt4.p(petId, 14), new dug.d(24)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                dj0.d.Companion.getClass();
                return ue0.e.F(d0VarFirstOrError, new d(null, dj0.d.d));
        }
    }
}
