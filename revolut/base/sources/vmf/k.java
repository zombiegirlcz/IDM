package vmf;

import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalitiesInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalityInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreen;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import mjf.k0;
import o9a.v;
import rp0.r0;
import rp0.u0;
import ru.y;
import skm.e0;
import vkm.j2;
import vkm.z1;
import vnl.p;
import vo8.l0;
import vq5.x;
import vrl.v0;
import vv8.q;
import vwb.n;
import vy5.a1;
import vy5.i0;
import vy5.p0;
import vyi.r;
import vzk.u;
import w2a.s;
import w38.w0;
import w50.o;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f290571w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f290571w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((l) this.f290571w, continuation, 0);
            case 1:
                return new k((p) this.f290571w, continuation, 1);
            case 2:
                return new k((com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) this.f290571w, continuation, 2);
            case 3:
                return new k((mhf.j) this.f290571w, continuation, 3);
            case 4:
                return new k((com.revolut.feature.credit.card.impl.ui.instalment.create.b) this.f290571w, continuation, 4);
            case 5:
                return new k((com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a) this.f290571w, continuation, 5);
            case 6:
                return new k((vu5.h) this.f290571w, continuation, 6);
            case 7:
                return new k((com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) this.f290571w, continuation, 7);
            case 8:
                return new k((Ref$BooleanRef) this.f290571w, continuation, 8);
            case 9:
                return new k((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a) this.f290571w, continuation, 9);
            case 10:
                return new k((q) this.f290571w, continuation, 10);
            case 11:
                return new k((n) this.f290571w, continuation, 11);
            case 12:
                return new k((i0) this.f290571w, continuation, 12);
            case 13:
                return new k((p0) this.f290571w, continuation, 13);
            case 14:
                return new k((a1) this.f290571w, continuation, 14);
            case 15:
                return new k((r) this.f290571w, continuation, 15);
            case 16:
                return new k((com.revolut.feature.freelancer.impl.ui.perks.flow.b) this.f290571w, continuation, 16);
            case 17:
                return new k((NationalitiesScreen) this.f290571w, continuation, 17);
            case 18:
                return new k((u) this.f290571w, continuation, 18);
            case 19:
                return new k((com.revolut.feature.defi.accounts.impl.ui.creation.flow.a) this.f290571w, continuation, 19);
            case 20:
                return new k((s) this.f290571w, continuation, 20);
            case 21:
                return new k((com.revolut.feature.retail.cfd.impl.flows.order.c) this.f290571w, continuation, 21);
            case 22:
                return new k((w0) this.f290571w, continuation, 22);
            case 23:
                return new k((com.revolut.feature.revolut_shop.ui.screen.checkout.a) this.f290571w, continuation, 23);
            case 24:
                return new k((com.revolut.feature.joint.impl.ui.deeplink.a) this.f290571w, continuation, 24);
            case 25:
                return new k((w4k.p) this.f290571w, continuation, 25);
            case 26:
                return new k((o) this.f290571w, continuation, 26);
            case 27:
                return new k((com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f290571w, continuation, 27);
            case 28:
                return new k((w72.j) this.f290571w, continuation, 28);
            default:
                return new k((w75.l) this.f290571w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objX;
        Object objB;
        List list;
        Object objB2;
        Object objV;
        Object objJ;
        int i = this.u;
        int i2 = 3;
        int i3 = 14;
        int i5 = 23;
        int i6 = 26;
        boolean z = false;
        z = false;
        Continuation continuation = null;
        Object obj3 = this.f290571w;
        int i21 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar = (l) obj3;
                j jVar = new j(lVar, continuation, i21);
                this.v = 1;
                Object objB3 = pu7.a.B(lVar.k, "ID_BUTTON_CLICK", jVar, this);
                return objB3 == aVar ? aVar : objB3;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z1 z1Var = ((p) obj3).f290831m;
                this.v = 1;
                Object objX2 = vkm.q.x(z1Var, this);
                return objX2 == aVar2 ? aVar2 : objX2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) obj3;
                l0 l0Var = new l0(i21, bVar, continuation);
                this.v = 1;
                Object objB4 = pu7.a.B(bVar.k, "update_referral_setting", l0Var, this);
                return objB4 == aVar3 ? aVar3 : objB4;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((k0) ((mhf.j) obj3)).f(true, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar2 = (com.revolut.feature.credit.card.impl.ui.instalment.create.b) obj3;
                vr4.o oVar = new vr4.o(bVar2, continuation, i2);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar2.k, "credit_card_create_instalment", oVar, this);
                return objB5 == aVar5 ? aVar5 : objB5;
            case 5:
                com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a aVar6 = (com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.a) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(((rs2.n) aVar6.f64339q).d.c(Unit.f186387a, true), null, null, 3);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                y yVar = (y) objX;
                aVar6.J2(yVar.d, yVar.k, yVar.f257387a);
                return Unit.f186387a;
            case 6:
                vu5.h hVar = (vu5.h) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    mu5.s sVar = hVar.f292260p;
                    sVar.getClass();
                    ufm.c cVar = new ufm.c(new mu5.q(sVar, 0), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                    this.v = 1;
                    objB = nim.a.b(cVar, this);
                    if (objB == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                if (((Boolean) objB).booleanValue()) {
                    this.v = 2;
                    if (vu5.h.I2(hVar, true, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    hVar.f292261q.g(new u0(new TextLocalisedClause(R$string.crypto_tax_screen_header_title, null, null, 14), new TextLocalisedClause(R$string.crypto_tax_screen_description_koinly, null, null, 14), new TextLocalisedClause(R$string.crypto_tax_screen_privacy_link, null, new Click(20, (Integer) null, (Object) "CRYPTO_TAX_LINK_ID", "CRYPTO_TAX_LINK_ID", true), 10), new r0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D289", null, UrlImageDrawable.Shimmering.INSTANCE, null, 26)), null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.crypto_tax_screen_cta_join_koinly, null, null, 14), null, null, null, null, null, null, null, null, null, null, 33553872));
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    wtc.h hVar2 = ((com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) obj3).f85617p;
                    this.v = 1;
                    if (hVar2.a(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    ref$BooleanRef.f186407a = false;
                    this.v = 1;
                    if (skm.k0.b(5000L, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ref$BooleanRef.f186407a = true;
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a aVar12 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a) obj3;
                    mu7.c cVar2 = aVar12.f76134t;
                    String str = aVar12.o.f76128a;
                    this.v = 1;
                    if (cVar2.b(this, str, false) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    q qVar = (q) obj3;
                    uk9.h hVar3 = new uk9.h(qVar, continuation, 21);
                    this.v = 1;
                    if (zh9.u0.b0(qVar.X(), "ACTION_BUTTON_LOADING_TAG", hVar3, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                n nVar = (n) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarE = ((nyb.o) nVar.f292696q).e(false);
                    v0 v0Var = new v0(i5, new x(nVar, i6));
                    d0VarE.getClass();
                    ufm.i iVar = new ufm.i(d0VarE, v0Var, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    this.v = 1;
                    if (nim.a.b(iVar, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarV = ue0.e.v(((p0) ((i0) obj3).f293163b).d());
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    e95.a aVar17 = ((p0) obj3).f;
                    this.v = 1;
                    if (((o95.e) aVar17).b(this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarV2 = ue0.e.v(((p0) ((a1) obj3).f293135b).d());
                    this.v = 1;
                    if (nim.a.a(aVarV2, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var2 = ((r) obj3).f293345q;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var2.emit(unit, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.perks.flow.b bVar3 = (com.revolut.feature.freelancer.impl.ui.perks.flow.b) obj3;
                    com.revolut.feature.freelancer.impl.ui.perks.flow.a aVar21 = new com.revolut.feature.freelancer.impl.ui.perks.flow.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar21) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    vzk.m mVarI3 = ((NationalitiesScreen) obj3).i3();
                    this.v = 1;
                    u uVar = (u) mVarI3;
                    uVar.getClass();
                    uVar.l2(new k(uVar, continuation, 18), new vzk.o(uVar, z ? 1 : 0));
                    if (Unit.f186387a == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                u uVar2 = (u) obj3;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    NationalitiesInput nationalitiesInput = (NationalitiesInput) ((vzk.g) uVar2.t2()).f293548b.getContent();
                    if (nationalitiesInput != null) {
                        if (!nationalitiesInput.f104194b) {
                            nationalitiesInput = null;
                        }
                        if (nationalitiesInput != null && (list = nationalitiesInput.f104193a) != null) {
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((NationalityInput) it8.next()).f104195a);
                            }
                            vzk.s sVar2 = new vzk.s(uVar2, new xel.e(arrayList), null);
                            this.v = 1;
                            objB2 = pu7.a.B(uVar2.k, "submitting nationalities", sVar2, this);
                            if (objB2 == aVar23) {
                                return aVar23;
                            }
                        }
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Nationalities is empty when submitting!");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return Unit.f186387a;
                }
                if (i108 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objB2 = obj2;
                if (((Unit) objB2) == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Nationalities is empty when submitting!");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    up4.h hVar4 = new up4.h(8);
                    v vVar = new v(16);
                    com.revolut.feature.defi.accounts.impl.ui.creation.flow.a aVar25 = (com.revolut.feature.defi.accounts.impl.ui.creation.flow.a) obj3;
                    w16.d dVar = new w16.d(aVar25, continuation, i21);
                    this.v = 1;
                    objV = n14.k.V(aVar25, null, vVar, hVar4, dVar, this, 1);
                    if (objV == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objV = obj2;
                }
                nii.h hVar5 = (nii.h) objV;
                if (hVar5 instanceof nii.g) {
                    ((com.revolut.feature.defi.accounts.impl.ui.creation.flow.a) obj3).C2(new w16.b((String) ((nii.g) hVar5).f216152a));
                } else if (!(hVar5 instanceof nii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var3 = ((s) obj3).f294006q;
                    Unit unit2 = Unit.f186387a;
                    this.v = 1;
                    if (z1Var3.emit(unit2, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.retail.cfd.impl.flows.order.c cVar3 = (com.revolut.feature.retail.cfd.impl.flows.order.c) obj3;
                    com.revolut.feature.retail.cfd.impl.flows.order.a aVar28 = new com.revolut.feature.retail.cfd.impl.flows.order.a(cVar3, null);
                    this.v = 1;
                    if (cVar3.p2(this, aVar28) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    g48.r0 r0Var = ((w0) obj3).f294233b;
                    this.v = 1;
                    if (r0Var.s(false, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar31 = (com.revolut.feature.revolut_shop.ui.screen.checkout.a) obj3;
                    w3c.r rVar = new w3c.r(aVar31, null);
                    this.v = 1;
                    if (zh9.u0.b0(aVar31.X(), "PAY_BUTTON_LOADING_TAG", rVar, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.joint.impl.ui.deeplink.a aVar33 = (com.revolut.feature.joint.impl.ui.deeplink.a) obj3;
                    uk9.h hVar6 = new uk9.h(aVar33, continuation, 22);
                    this.v = 1;
                    if (aVar33.p2(this, hVar6) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarS1 = lg0.b.s1(((w4k.p) obj3).f294624m, "revolut://app/faq?key=question.how-fast-is-my-transfer", null, null, 2);
                this.v = 1;
                Object objB6 = nim.a.b(d0VarS1, this);
                return objB6 == aVar34 ? aVar34 : objB6;
            case 26:
                o oVar2 = (o) obj3;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                try {
                    if (i116 == 0) {
                        yhm.o.b(obj2);
                        TranscriptIdentifier transcriptIdentifier = (TranscriptIdentifier) oVar2.o.getValue();
                        if (transcriptIdentifier == null) {
                            return null;
                        }
                        t1j.b bVar4 = oVar2.f294665l;
                        this.v = 1;
                        if (bVar4.h(transcriptIdentifier) == aVar35) {
                            return aVar35;
                        }
                    } else {
                        if (i116 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    return Unit.f186387a;
                }
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) obj3;
                    com.revolut.feature.credit.application.plugins.impl.ui.congratulations.a aVar37 = new com.revolut.feature.credit.application.plugins.impl.ui.congratulations.a(bVar5, continuation, z ? 1 : 0);
                    this.v = 1;
                    if (bVar5.p2(this, aVar37) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                w72.j jVar2 = (w72.j) obj3;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    l72.c cVar4 = jVar2.f295461p;
                    String str2 = ((w72.b) ((j2) jVar2.f295462q.f22677a).getValue()).f295455a;
                    this.v = 1;
                    a1a.a aVar39 = new a1a.a((a72.d) ((l72.d) cVar4).f192506b, str2, continuation, i3);
                    skm.p0 p0Var = skm.p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, aVar39, this);
                    if (objJ == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                h02.b bVar6 = (h02.b) objJ;
                h02.a aVar40 = bVar6.f148179b;
                h02.a aVar41 = bVar6.f148178a;
                if (aVar41 == null) {
                    jVar2.l2(new w72.i(jVar2, null), new yi5.b(i6));
                } else {
                    String str3 = aVar41.f148176a;
                    if (aVar40 != null && Intrinsics.f(aVar40.f148177b, "MULTIBANCO")) {
                        z = true;
                    }
                    jVar2.C2(new w72.d(str3, z));
                }
                return Unit.f186387a;
            default:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                w75.l lVar2 = (w75.l) obj3;
                uk9.h hVar7 = new uk9.h(lVar2, continuation, i5);
                this.v = 1;
                Object objB7 = pu7.a.B(lVar2.k, "update borrowers priority", hVar7, this);
                return objB7 == aVar42 ? aVar42 : objB7;
        }
    }
}
