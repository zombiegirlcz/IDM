package mjf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f205987b;

    public /* synthetic */ c(d dVar, int i) {
        this.f205986a = i;
        this.f205987b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean showRegulatoryLimits = (Boolean) obj2;
        switch (this.f205986a) {
            case 0:
                Intrinsics.checkNotNullParameter(showRegulatoryLimits, "showRegulatoryLimits");
                if (showRegulatoryLimits.booleanValue()) {
                    return efm.d0.m("REGULATORY_FREE_ATM_LIMITS");
                }
                efm.d0 d0VarFirstOrError = m70.a.g(this.f205987b.f205989b.k(false), null, new mh1.e(9), 1).firstOrError();
                mhd.c cVar = new mhd.c(new mh4.x(20), 12);
                d0VarFirstOrError.getClass();
                pfm.z zVarO = new ufm.i(d0VarFirstOrError, cVar, 1).o("ATM_LIMITS");
                Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                return zVarO;
            case 1:
                Intrinsics.checkNotNullParameter(showRegulatoryLimits, "featureEnabled");
                if (!showRegulatoryLimits.booleanValue()) {
                    return efm.d0.m(Boolean.FALSE);
                }
                efm.d0 d0VarA = ((ang.b) this.f205987b.f205990c).a();
                mhd.c cVar2 = new mhd.c(new mh4.x(19), 8);
                d0VarA.getClass();
                return new ufm.i(d0VarA, cVar2, 1);
            default:
                Intrinsics.checkNotNullParameter(showRegulatoryLimits, "isHungaryUser");
                if (!showRegulatoryLimits.booleanValue()) {
                    return efm.d0.m(Boolean.FALSE);
                }
                efm.d0 d0VarFirstOrError2 = m70.a.g(this.f205987b.d.t(false), null, new mh1.e(8), 1).firstOrError();
                mhd.c cVar3 = new mhd.c(new mh4.x(18), 7);
                d0VarFirstOrError2.getClass();
                return new ufm.i(d0VarFirstOrError2, cVar3, 1);
        }
    }
}
