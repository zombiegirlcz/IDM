package xlb;

import com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation.PetPlanConfirmPurchaseActivity;
import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$State;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$Step;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.sso.impl.domain.models.SsoServerError;
import fmb.f0;
import io.fotoapparat.exception.camera.CameraException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import s7a.a0;
import v30.c0;
import vkm.j2;
import vkm.u1;
import y20.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        boolean z3;
        boolean z4;
        switch (this.f) {
            case 0:
                f0 p0 = (f0) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.I2((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver, p0);
                return Unit.f186387a;
            case 1:
                nmb.e p03 = (nmb.e) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver;
                eVar.getClass();
                eVar.T2(new SavingsOnboardingFlowContract$Step.ProductDetailsReview(p03.f217241a));
                return Unit.f186387a;
            case 2:
                rmb.b p010 = (rmb.b) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar2 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver;
                eVar2.getClass();
                eVar2.T2(new SavingsOnboardingFlowContract$Step.ProductDetailsReview(p010.f255218a));
                return Unit.f186387a;
            case 3:
                pmb.e p011 = (pmb.e) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar3 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver;
                eVar3.getClass();
                eVar3.T2(new SavingsOnboardingFlowContract$Step.ProductDetailsReview(p011.f237533b));
                return Unit.f186387a;
            case 4:
                dmb.h p012 = (dmb.h) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar4 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver;
                eVar4.getClass();
                eVar4.T2(new SavingsOnboardingFlowContract$Step.ProductDetailsReview(p012.f115881a));
                return Unit.f186387a;
            case 5:
                dkb.e p013 = (dkb.e) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar5 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver;
                cli.y yVar = eVar5.B;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                SavingsChallengeOnboarding savingsChallengeOnboarding = ((d) j2Var.getValue()).f306981c;
                if (savingsChallengeOnboarding == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str = ((d) j2Var2.getValue()).d;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                for (SavingsProductData savingsProductData : ((d) j2Var2.getValue()).f306979a) {
                    if (Intrinsics.f(savingsProductData.f86683a.i, str) && savingsChallengeOnboarding.f83099a.f83088b.contains(savingsProductData.f86683a.f86617a)) {
                        eVar5.T2(new SavingsOnboardingFlowContract$Step.ChallengeReview(savingsProductData, savingsChallengeOnboarding, p013.f115497a));
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 6:
                f0 p014 = (f0) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e.I2((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e) this.receiver, p014);
                return Unit.f186387a;
            case 7:
                Throwable p015 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar = (com.revolut.sso.impl.ui.passcode.change_flow.a) this.receiver;
                if (p015 instanceof SsoServerError) {
                    yji.l.b1(aVar, aVar.X1(aVar.u.a((SsoServerError) p015)), null, new xnl.c(aVar, null, 0), 3);
                    z = true;
                } else {
                    oki.h.D2(aVar.f106599w);
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                Throwable p016 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.sso.impl.ui.passcode.change_flow.a aVar2 = (com.revolut.sso.impl.ui.passcode.change_flow.a) this.receiver;
                if (p016 instanceof SsoServerError) {
                    yji.l.b1(aVar2, aVar2.X1(aVar2.u.a((SsoServerError) p016)), null, new xnl.c(aVar2, null, 0), 3);
                    z3 = true;
                } else {
                    aVar2.getClass();
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                ((xqc.h) this.receiver).getClass();
                return Boolean.FALSE;
            case 10:
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "p0");
                ((ura.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(entities, "entities");
                List<sra.c> list = entities;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (sra.c cVar : list) {
                    arrayList.add(new pra.a(cVar.f265156a, cVar.f265157b, cVar.f265158c));
                }
                return arrayList;
            case 11:
                CameraException p017 = (CameraException) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((ihm.f) this.receiver).onNext(p017);
                return Unit.f186387a;
            case 12:
                String p018 = (String) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((cya.f) this.receiver).a2(p018);
                return Unit.f186387a;
            case 13:
                List p019 = (List) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                ((ihm.f) this.receiver).onNext(p019);
                return Unit.f186387a;
            case 14:
                List p020 = (List) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((PetPlanConfirmPurchaseActivity) ((xz7.c) this.receiver)).setItems(p020);
                return Unit.f186387a;
            case 15:
                List p021 = (List) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((y20.h) this.receiver).getClass();
                UUID uuid = ((u10.q) d0.b0(p021)).d;
                List list2 = p021;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (!Intrinsics.f(((u10.q) it8.next()).d, uuid)) {
                            throw new IllegalArgumentException("a chat-column component must span one ticket");
                        }
                    }
                }
                return new y20.m(uuid);
            case 16:
                List p022 = (List) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((y20.h) this.receiver).getClass();
                UUID uuid2 = ((u10.q) d0.b0(p022)).e;
                if (uuid2 == null) {
                    throw new IllegalStateException("a feed-column member must carry feedId");
                }
                List list3 = p022;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        if (!Intrinsics.f(((u10.q) it9.next()).e, uuid2)) {
                            throw new IllegalArgumentException("a feed-column component must span one feed");
                        }
                    }
                }
                return new y20.n(uuid2);
            case 17:
                List p023 = (List) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                ((y20.h) this.receiver).getClass();
                c0 c0Var = ((u10.q) d0.b0(p023)).f;
                if (c0Var == null) {
                    throw new IllegalStateException("a type-column member must carry feedType");
                }
                List list4 = p023;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it10 = list4.iterator();
                    while (it10.hasNext()) {
                        if (((u10.q) it10.next()).f != c0Var) {
                            throw new IllegalArgumentException("a type-column component must span one feed type");
                        }
                    }
                }
                return new y20.o(c0Var);
            case 18:
                efm.r messageObservable = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(messageObservable, "p0");
                z20.q qVar = (z20.q) this.receiver;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(messageObservable, "messageObservable");
                z20.r rVar = qVar.d;
                u1 u1Var = qVar.f318933j;
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                efm.r messageObservable2 = efm.r.combineLatest(messageObservable, rd0.e.c(u1Var, gVar), new z1i.n(new yz4.b(qVar, 4), 8));
                Intrinsics.checkNotNullExpressionValue(messageObservable2, "combineLatest(...)");
                rVar.getClass();
                Intrinsics.checkNotNullParameter(messageObservable2, "messageObservable");
                efm.r rVarCombineLatest = efm.r.combineLatest(messageObservable2, rd0.e.c(rVar.f, gVar), new z1i.n(new yz4.b(rVar, 5), 9));
                Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
                efm.r rVarMerge = efm.r.merge(rVarCombineLatest, rVar.f318937g);
                Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                return rVarMerge;
            case 19:
                v20.n p024 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((ihm.k) this.receiver).onNext(p024);
                return Unit.f186387a;
            case 20:
                f9a.f p025 = (f9a.f) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.pix.impl.flow.alias_registration.a aVar3 = (com.revolut.feature.pix.impl.flow.alias_registration.a) this.receiver;
                aVar3.getClass();
                if (p025 instanceof f9a.d) {
                    aVar3.I2(((f9a.d) p025).f132879a);
                } else {
                    if (!(p025 instanceof f9a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.J2(((f9a.e) p025).f132880a);
                }
                return Unit.f186387a;
            case 21:
                AliasRegistrationType p026 = (AliasRegistrationType) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((com.revolut.feature.pix.impl.flow.alias_registration.a) this.receiver).J2(p026);
                return Unit.f186387a;
            case 22:
                wca.f p027 = (wca.f) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                com.revolut.feature.pix.impl.flow.alias_registration.a aVar4 = (com.revolut.feature.pix.impl.flow.alias_registration.a) this.receiver;
                AliasRegistrationType aliasRegistrationTypeZ = ((AliasRegistrationContract$State) ((j2) aVar4.f80582p.f22677a).getValue()).f80576a;
                if (aliasRegistrationTypeZ instanceof AliasRegistrationType.Email) {
                    aliasRegistrationTypeZ = new AliasRegistrationType.Email(((AliasRegistrationType.Email) aliasRegistrationTypeZ).f80388b, p027.f296369a);
                } else if (aliasRegistrationTypeZ instanceof AliasRegistrationType.Phone) {
                    aliasRegistrationTypeZ = AliasRegistrationType.Phone.z((AliasRegistrationType.Phone) aliasRegistrationTypeZ, null, p027.f296369a, 1);
                }
                if (aliasRegistrationTypeZ != null) {
                    aVar4.J2(aliasRegistrationTypeZ);
                } else {
                    oki.h.D2(aVar4.f80583q);
                }
                return Unit.f186387a;
            case 23:
                AliasRegistrationResult p028 = (AliasRegistrationResult) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((com.revolut.feature.pix.impl.flow.alias_registration.a) this.receiver).I2(p028);
                return Unit.f186387a;
            case 24:
                faa.d p029 = (faa.d) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                com.revolut.feature.pix.impl.flow.alias_registration.a aVar5 = (com.revolut.feature.pix.impl.flow.alias_registration.a) this.receiver;
                yki.a aVar6 = aVar5.f80583q;
                if (Intrinsics.f(p029, faa.b.f133268a)) {
                    oki.h.r2(aVar6);
                    oki.h.t2(aVar5, aVar6, AliasRegistrationContract$Step.SelectType.f80580a, false, null, false, 12);
                } else {
                    if (!(p029 instanceof faa.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PixKey pixKey = ((faa.c) p029).f133270b;
                    if (pixKey != null) {
                        aVar5.C2(new y8a.b(pixKey));
                    } else {
                        aVar5.C2(y8a.d.f311644a);
                    }
                }
                return Unit.f186387a;
            case 25:
                ybl.h p030 = (ybl.h) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                return Boolean.valueOf(!p030.c((Set) ((y8h.b) this.receiver).f311659c.getValue(), TradingAccountType.Gia.f105270a, y8h.b.d).isEmpty());
            case 26:
                NaviCommand p031 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                ((v60.i) this.receiver).onNext(p031);
                return Unit.f186387a;
            case 27:
                Throwable p032 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p032, "p0");
                ya5.l lVar = (ya5.l) this.receiver;
                y0 y0VarB = lVar.f311945r.b(p032);
                if (y0VarB == null) {
                    z4 = false;
                } else {
                    lVar.X().d(y0VarB);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 28:
                dii.g p033 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(p033, "p0");
                com.revolut.feature_retail_user_declarations.email.screen.a aVar7 = (com.revolut.feature_retail_user_declarations.email.screen.a) this.receiver;
                aVar7.getClass();
                aVar7.l2(new yai.p(p033, aVar7, null), new yi5.b(26));
                return Unit.f186387a;
            default:
                a0 p034 = (a0) obj2;
                Intrinsics.checkNotNullParameter(p034, "p0");
                com.revolut.feature.pockets.impl.ui.add_new.c cVar2 = (com.revolut.feature.pockets.impl.ui.add_new.c) this.receiver;
                cVar2.getClass();
                s7a.c0 c0Var2 = p034.f260599a;
                Continuation continuation = null;
                if (c0Var2 instanceof yea.b) {
                    cVar2.l2(new a1(cVar2, c0Var2, continuation, 23), new yi5.b(26));
                } else if (c0Var2 instanceof s7a.q) {
                    s7a.q qVar2 = (s7a.q) c0Var2;
                    if (Intrinsics.f(qVar2.f260624a, "JUNIOR_MULTI_CURRENCY_TERMS_CONDITION_ID")) {
                        Object obj3 = qVar2.f260625b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
                        cVar2.C1(new ExternalDestination.Browser((String) obj3, null));
                    }
                } else {
                    oki.h.D2(cVar2.f80902y);
                }
                return Unit.f186387a;
        }
    }
}
