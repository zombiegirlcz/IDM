package nc1;

import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ma1.x;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f214131b;

    public /* synthetic */ h(m mVar, int i) {
        this.f214130a = i;
        this.f214131b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f214130a) {
            case 0:
                m mVar = this.f214131b;
                mVar.D.getClass();
                zii.i.t(mVar, mVar.z2(pc1.b.b()), new g(mVar, 3), null, 14);
                break;
            case 1:
                m mVar2 = this.f214131b;
                mVar2.D.getClass();
                zii.i.t(mVar2, mVar2.z2(pc1.b.h()), new g(mVar2, 2), null, 14);
                break;
            case 2:
                m mVar3 = this.f214131b;
                dj0.d dVarD2 = mVar3.D2();
                mVar3.D.getClass();
                zii.i.t(mVar3, mVar3.z2(pc1.b.e(dVarD2)), new g(mVar3, 5), null, 14);
                break;
            case 3:
                m mVar4 = this.f214131b;
                dj0.d dVarD22 = mVar4.D2();
                mVar4.D.getClass();
                zii.i.t(mVar4, mVar4.z2(pc1.b.i(dVarD22)), new g(mVar4, 5), null, 14);
                break;
            case 4:
                m mVar5 = this.f214131b;
                dj0.d dVarD23 = mVar5.D2();
                mVar5.D.getClass();
                zii.i.t(mVar5, mVar5.z2(pc1.b.c(dVarD23)), new g(mVar5, 5), null, 14);
                break;
            case 5:
                m mVar6 = this.f214131b;
                dj0.d dVarD24 = mVar6.D2();
                da1.e eVar = mVar6.u;
                cji.d dVar = mVar6.I;
                dVar.getClass();
                r rVarDoAfterTerminate = ((x) eVar).a(dVarD24, null, null, (String) dVar.a()).doAfterTerminate(new i1i.a(mVar6, 22));
                Intrinsics.checkNotNullExpressionValue(rVarDoAfterTerminate, "doAfterTerminate(...)");
                mVar6.F = zii.i.E0(mVar6, rVarDoAfterTerminate, new j(mVar6, dVarD24, 0), null, 14);
                break;
            default:
                this.f214131b.G2(d.AMOUNT);
                break;
        }
        return Unit.f186387a;
    }
}
