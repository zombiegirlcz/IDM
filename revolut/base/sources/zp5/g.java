package zp5;

import a2f.j;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.push_to_card.impl.R$string;
import com.revolut.feature.sca_prompt.api.models.TrustedCompanyBeneficiary;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import efm.d0;
import eq5.h0;
import eq5.i0;
import ft3.h1;
import gim.i;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nii.l0;
import nii.l1;
import nii.n1;
import nii.y0;
import skm.e0;
import skm.p0;
import tb4.t;
import te0.w;
import vkm.q;
import yhm.o;
import yui.v;
import zh9.u0;
import zqf.k;
import zw5.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f324177w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324177w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((com.revolut.feature.crypto.withdraw.impl.ui_v3.a) this.f324177w, continuation, 0);
            case 1:
                return new g((com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) this.f324177w, continuation, 1);
            case 2:
                return new g((zqa.f) this.f324177w, continuation, 2);
            case 3:
                return new g((k) this.f324177w, continuation, 3);
            case 4:
                return new g((zrc.d) this.f324177w, continuation, 4);
            case 5:
                return new g((com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a) this.f324177w, continuation, 5);
            case 6:
                return new g((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) this.f324177w, continuation, 6);
            case 7:
                return new g((n) this.f324177w, continuation, 7);
            case 8:
                return new g((cx3.a) this.f324177w, continuation, 8);
            default:
                return new g((com.revolut.feature.statements.impl.ui.documents_hub.a) this.f324177w, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objZ2;
        Object objX;
        Object objB;
        Object objZ;
        List list;
        TrustedCompanyBeneficiary trustedCompanyBeneficiary;
        Object objQ;
        Object objD;
        Object objB2;
        int i = this.u;
        int i2 = 3;
        String str = 0;
        str = 0;
        Object obj3 = this.f324177w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    i0 i0Var = ((com.revolut.feature.crypto.withdraw.impl.ui_v3.a) obj3).f71204q;
                    this.v = 1;
                    Object objEmit = ((MutableSharedFlow) i0Var.f128275a.getValue()).emit(h0.f128273a, this);
                    if (objEmit != aVar) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    er5.e eVar = aVar2.v;
                    this.v = 1;
                    objZ2 = eVar.Z2(this);
                    if (objZ2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objZ2 = obj2;
                }
                aVar2.H2(aVar2.B, new v((String) objZ2, 26));
                return Unit.f186387a;
            case 2:
                zqa.f fVar = (zqa.f) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    fVar.f324446m.getClass();
                    Flow flowL2 = fVar.L2(new y0(null, new l0(new TextLocalisedClause(R$string.create_card_recipient_error_blocked_title, null, null, 14), new TextLocalisedClause(R$string.create_card_recipient_error_blocked_description, null, null, 14), null, new TextLocalisedClause(R$string.create_card_recipient_error_blocked_learn, null, null, 14), null, null, false, null, 1012), false, 5));
                    this.v = 1;
                    objX = q.x(flowL2, this);
                    if (objX == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objX = obj2;
                }
                return ((n1) objX) instanceof l1 ? fVar.A2(u0.c(new WebViewFeatureConfig("https://www.revolut.com/about-fraud-and-scam/", null, 0, false, true, false, 129950))) : Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    k kVar = (k) obj3;
                    zp8.g gVar = new zp8.g(kVar, null);
                    this.v = 1;
                    if (u0.b0(kVar.X(), "LOCATE_CTA_BUTTON_TAG", gVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                zrc.d dVar = (zrc.d) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                vrc.e eVar2 = vrc.e.f291574a;
                try {
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    hx7.e.n(e);
                }
                if (i32 == 0) {
                    o.b(obj2);
                    d0 d0VarF = dVar.f324676c.f(false);
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
                    if (objB == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        objZ = obj2;
                        list = (List) objZ;
                        if (list != null && (trustedCompanyBeneficiary = (TrustedCompanyBeneficiary) zhm.d0.d0(list)) != null) {
                            str = trustedCompanyBeneficiary.f85335a;
                        }
                        if (!Intrinsics.f(str, "97eccd72-f122-4142-9d99-5c167247e3b7") || Intrinsics.f(str, "9077d79f-6891-449b-9a59-9fb38bc60443")) {
                            return new vrc.f(str);
                        }
                        return eVar2;
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                if (w.U((do3.n) objB)) {
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    bsc.b bVar = dVar.f324674a;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jhi.b bVarG = mo3.a.g(bVar.d.b(Unit.f186387a, loadingStrategy), null, null, 3);
                    this.v = 2;
                    objZ = q.z(bVarG, this);
                    if (objZ == aVar6) {
                        return aVar6;
                    }
                    list = (List) objZ;
                    if (list != null) {
                        str = trustedCompanyBeneficiary.f85335a;
                    }
                    if (!Intrinsics.f(str, "97eccd72-f122-4142-9d99-5c167247e3b7")) {
                    }
                    return new vrc.f(str);
                }
                return eVar2;
            case 5:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a aVar7 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    xxh.d dVar2 = new xxh.d(aVar7, 4);
                    up4.h hVar = new up4.h(15);
                    zjc.g gVar2 = new zjc.g(i2, str, aVar7);
                    this.v = 1;
                    objQ = n14.k.Q(aVar7, null, dVar2, hVar, gVar2, this, 1);
                    if (objQ == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objQ = obj2;
                }
                nii.e eVar3 = (nii.e) objQ;
                if (eVar3 instanceof nii.d) {
                    oki.h.t2(aVar7, aVar7.f69502r, (FlowStep) ((nii.d) eVar3).f216133a, true, null, false, 12);
                } else {
                    if (!(eVar3 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar7.f69502r);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar9 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) obj3;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    t tVar = aVar9.f85702p;
                    this.v = 1;
                    objD = tVar.d(this);
                    if (objD == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objD = obj2;
                }
                aVar9.H2(aVar9.f85708x, new zrd.q((ConnectedWifi) objD, 13));
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (n.y2((n) obj3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                cx3.a aVar13 = (cx3.a) obj3;
                zx3.a aVar14 = (zx3.a) aVar13.f109893c;
                h1 h1VarC = cx3.a.c(aVar13);
                this.v = 1;
                d44.a aVar15 = aVar14.f326038a;
                aVar15.getClass();
                d3i.g gVar3 = new d3i.g(aVar15, h1VarC, str, i3);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, gVar3, this);
                return objJ == aVar12 ? aVar12 : objJ;
            default:
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar16 = (com.revolut.feature.statements.impl.ui.documents_hub.a) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    d0 d0VarF2 = aVar16.f88362q.f(false);
                    this.v = 1;
                    objB2 = nim.a.b(d0VarF2, this);
                    if (objB2 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                aVar16.H2(aVar16.A, new j((do3.n) objB2, 24));
                return Unit.f186387a;
        }
    }
}
