package r21;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f251028b;

    public /* synthetic */ b(h hVar, int i) {
        this.f251027a = i;
        this.f251028b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f5j.a newBeneficiary = (f5j.a) obj2;
        switch (this.f251027a) {
            case 0:
                Intrinsics.checkNotNullParameter(newBeneficiary, "newBeneficiary");
                h hVar = this.f251028b;
                d0 d0VarL = o.l(zi0.c.J(o71.a.c(hVar, false, 5)), null, null, 3, "firstOrError(...)");
                qza.a aVar = new qza.a(22, new r10.b(newBeneficiary, hVar, 19));
                d0VarL.getClass();
                pfm.a aVar2 = new pfm.a(d0VarL, aVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2.f(d0.m(newBeneficiary));
            default:
                Intrinsics.checkNotNullParameter(newBeneficiary, "newBeneficiary");
                h hVar2 = this.f251028b;
                d0 d0VarL2 = o.l(zi0.c.J(o71.a.c(hVar2, false, 5)), null, null, 3, "firstOrError(...)");
                qza.a aVar3 = new qza.a(22, new r10.b(newBeneficiary, hVar2, 19));
                d0VarL2.getClass();
                pfm.a aVar4 = new pfm.a(d0VarL2, aVar3, 4);
                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                return aVar4.f(d0.m(newBeneficiary));
        }
    }
}
