package cul;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import b9.w2;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreenContract$ModalStep;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract$PlanBuilderAction;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import cx0.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.a3;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109141b;

    public /* synthetic */ n0(d27.p0 p0Var, d27.u uVar) {
        this.f109140a = 28;
        this.f109141b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set set;
        Set set2;
        Object next;
        Object next2;
        String str;
        String str2;
        AccountDetails.LinkedAccount linkedAccount;
        String str3;
        String str4;
        int i = this.f109140a;
        int i2 = 6;
        int i3 = 19;
        int i5 = 2;
        int i6 = 3;
        int i21 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f109141b;
        switch (i) {
            case 0:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                InvestInputValue.INSTANCE.getClass();
                return v.a(update, (k4l.r0) obj3, null, null, InvestInputValue.a(InvestInputValue.e, null, update.e.f106845b, false, true, 5), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -21039123, 8191);
            case 1:
                return v.a((v) obj2, null, null, (aul.b) obj3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -9, 8191);
            case 2:
                v vVar = (v) obj2;
                return v.a(vVar, null, null, aul.b.FIAT, InvestInputValue.a(vVar.e, ((c0) obj3).f109078a.f104717a, null, false, true, 6), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -25, 8191);
            case 3:
                Context it8 = (Context) obj2;
                KProperty[] kPropertyArr = FreelancerAcquiringPaymentFiltersScreen.W;
                Intrinsics.checkNotNullParameter(it8, "it");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(((FreelancerAcquiringPaymentFiltersScreen) obj3).m2(), 2, 8);
                screenGridLayoutManager.setSpanSizeLookup(new cv6.c(screenGridLayoutManager));
                return screenGridLayoutManager;
            case 4:
                pr6.k kVar = (pr6.k) obj3;
                cv6.j update2 = (cv6.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringPaymentFilter acquiringPaymentFilter = update2.f109287b;
                if (acquiringPaymentFilter == null) {
                    acquiringPaymentFilter = new AcquiringPaymentFilter(0);
                }
                AcquiringPaymentFilter acquiringPaymentFilter2 = acquiringPaymentFilter;
                AcquiringPaymentFilter acquiringPaymentFilter3 = update2.f109287b;
                if (acquiringPaymentFilter3 == null || (set = acquiringPaymentFilter3.d) == null) {
                    set = zhm.h0.f322473a;
                }
                AcquiringPaymentFilter acquiringPaymentFilterA = AcquiringPaymentFilter.a(acquiringPaymentFilter2, null, null, null, gc0.c.A(set, kVar), 7);
                if (acquiringPaymentFilterA.b()) {
                    acquiringPaymentFilterA = null;
                }
                return cv6.j.a(update2, null, acquiringPaymentFilterA, 5);
            case 5:
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) obj3;
                kw6.b result = (kw6.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.v2(aVar.f73725s, new FreelancerAcquiringPaymentFiltersScreenContract$ModalStep.EndDateRangePicker(result.f190295a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 6:
                lr6.a aVar2 = (lr6.a) obj3;
                cv6.j update3 = (cv6.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                AcquiringPaymentFilter acquiringPaymentFilter4 = update3.f109287b;
                if (acquiringPaymentFilter4 == null) {
                    acquiringPaymentFilter4 = new AcquiringPaymentFilter(0);
                }
                AcquiringPaymentFilter acquiringPaymentFilter5 = acquiringPaymentFilter4;
                AcquiringPaymentFilter acquiringPaymentFilter6 = update3.f109287b;
                if (acquiringPaymentFilter6 == null || (set2 = acquiringPaymentFilter6.f73369c) == null) {
                    set2 = zhm.h0.f322473a;
                }
                AcquiringPaymentFilter acquiringPaymentFilterA2 = AcquiringPaymentFilter.a(acquiringPaymentFilter5, null, null, gc0.c.A(set2, aVar2), null, 11);
                if (acquiringPaymentFilterA2.b()) {
                    acquiringPaymentFilterA2 = null;
                }
                return cv6.j.a(update3, null, acquiringPaymentFilterA2, 5);
            case 7:
                cv7.o oVar = (cv7.o) obj3;
                f9i.c request = (f9i.c) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                oVar.A1(new cn0.d((Object) oVar, (Object) request, (Continuation) (objArr == true ? 1 : 0), i3), new yi5.b(25));
                return Unit.f186387a;
            case 8:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                List list = (List) defaultItems.invoke();
                EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData = ((cv7.r) obj3).f109319a;
                return new cv7.m(list, new cv7.k(cv7.r.f(embeddedInsuranceDetailScreenContract$InputData.f76092b), cv7.r.b(embeddedInsuranceDetailScreenContract$InputData.f76092b), 28), false);
            case 9:
                ewd.a aVar3 = (ewd.a) obj3;
                StakingProduct stakingProduct = (StakingProduct) obj2;
                Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                return new wtd.a(aVar3.f130163a, aVar3.f130164b, stakingProduct, aVar3.d);
            case 10:
                String storedMethodId = (String) obj2;
                Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
                return (yte.e) ((cve.c) obj3).f109337a.get(cve.c.a(storedMethodId));
            case 11:
                cvl.l update4 = (cvl.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return cvl.l.a(update4, null, null, ((cvl.m) obj3).f109497a, null, null, null, null, null, null, null, true, false, false, 7163);
            case 12:
                cwa.j jVar = (cwa.j) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                e7l.f fVar = (e7l.f) pair.f186385a;
                do3.n nVar = (do3.n) pair.f186386b;
                jVar.getClass();
                long millis = TimeUnit.DAYS.toMillis(fVar.Z0 != null ? r2.intValue() : 15);
                Long l2 = nVar.f116418q;
                return te0.w.o0(skm.p0.f264003c, new af3.f((Object) jVar, pd.b.k(l2 != null ? Boolean.valueOf(System.currentTimeMillis() < l2.longValue() + millis) : null), (Continuation) (objArr2 == true ? 1 : 0), 10));
            case 13:
                UserOnboardingFlowContract$State update5 = (UserOnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return UserOnboardingFlowContract$State.a(update5, null, (UserOnboardingFlowContract$State.PhoneData) obj3, null, 5);
            case 14:
                o0j.p pVar = (o0j.p) obj3;
                UserOnboardingFlowContract$State update6 = (UserOnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                fj0.a aVar4 = fj0.b.Companion;
                String str5 = pVar.f221247b;
                aVar4.getClass();
                Serializable serializableB = fj0.a.b(str5);
                yhm.o.b(serializableB);
                int i22 = ((fj0.b) serializableB).f135518a;
                wi0.a aVar5 = wi0.b.Companion;
                String str6 = pVar.f221246a;
                aVar5.getClass();
                return UserOnboardingFlowContract$State.a(update6, null, new UserOnboardingFlowContract$State.PhoneData(i22, pVar.f221248c, wi0.a.a(str6)), null, 5);
            case 15:
                UserOnboardingFlowContract$State update7 = (UserOnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return UserOnboardingFlowContract$State.a(update7, ((RevolutSsoApi$SignUpOutputData$Authenticated$Method.Email) ((RevolutSsoApi$SignUpOutputData$Authenticated$Method) obj3)).f105873a, null, null, 6);
            case 16:
                return UserOnboardingFlowContract$State.a((UserOnboardingFlowContract$State) obj2, null, null, ((q89.b) ((q89.d) obj3)).f243045a, 3);
            case 17:
                NaviCommand onboardingCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(onboardingCommand, "onboardingCommand");
                return com.revolut.retail.core.navigation.a.c(r6.b.g(null, null, null, 7, onboardingCommand), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ChatFlowDestination((ChatTarget.Messages) obj3, true), false, (Integer) null, 0, 57)));
            case 18:
                StickerView stickerView = (StickerView) obj3;
                ValueAnimator animation = (ValueAnimator) obj2;
                Intrinsics.checkNotNullParameter(animation, "animation");
                Float fB = c.a.b(cx0.c.Companion, animation);
                if (fB != null) {
                    stickerView.setAlpha(fB.floatValue());
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) obj3;
                dxe.b output = (dxe.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dxe.a) {
                    com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b dialogAction = ((dxe.a) output).f120942a;
                    Intrinsics.checkNotNullParameter(dialogAction, "dialogAction");
                    if (dialogAction.equals(b.a.f90728a)) {
                        cVar.n2(new cxe.y(cVar, objArr3 == true ? 1 : 0, i21), new whi.b(i2));
                    } else if (!dialogAction.equals(b.C0559b.f90729a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 20:
                ((cy1.g) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM spin_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new cy1.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), cy1.g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8))));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                return cy5.e.a((cy5.e) obj2, (ky5.a) obj3, null, null, null, null, null, 62);
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                whf.p pVar2 = (whf.p) pair2.f186385a;
                whf.p pVar3 = (whf.p) pair2.f186386b;
                dj0.d dVarA = ((anf.b) ((w2) obj3).f).a(pVar2.f297646a, cyh.a.f110093a);
                a3 a3Var = (a3) zhm.d0.d0(pVar3.f297646a);
                return new cyh.d(dVarA, pd.b.j(a3Var != null ? Boolean.valueOf(k71.k.h(a3Var)) : null), pVar3);
            case 23:
                cz4.a aVar6 = (cz4.a) obj3;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list2 = (List) pair3.f186385a;
                List list3 = (List) pair3.f186386b;
                ArrayList<io3.d> arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    io3.d dVar = (io3.d) obj4;
                    if (dVar.f == io3.k.ACTIVE && h30.l.D(xi0.b.Companion, dVar.f163147c)) {
                        arrayList2.add(obj4);
                    }
                }
                aVar6.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (io3.d dVar2 : arrayList2) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((ExternalInstitution) next).f66107a, dVar2.o)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ExternalInstitution externalInstitution = (ExternalInstitution) next;
                    if (externalInstitution == null) {
                        linkedAccount = null;
                    } else {
                        List list4 = dVar2.f163157s;
                        String str7 = dVar2.f163147c;
                        Iterator it10 = list4.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                LinkedHashMap linkedHashMap = ((io3.e) next2).f163162c;
                                if (linkedHashMap.get("ROUTING_NUMBER") != null || (linkedHashMap.get("SORT_CODE") != null && linkedHashMap.get("ACCOUNT_NUMBER") != null)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        io3.e eVar = (io3.e) next2;
                        xi0.b.Companion.getClass();
                        xi0.b bVarA = xi0.a.a(str7);
                        String str8 = dVar2.d;
                        String str9 = externalInstitution.f66108b;
                        Image imageB = ((di6.a) aVar6.f110158c).b(dVar2.f163156r);
                        if (imageB == null) {
                            imageB = new CountryImage(str7, (Integer) null, (ez0.e) null, 14);
                        }
                        Image image = imageB;
                        if (eVar == null || (str4 = (String) eVar.f163162c.get("SORT_CODE")) == null) {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            str = "";
                        } else {
                            str = str4;
                        }
                        if (eVar == null || (str3 = (String) eVar.f163162c.get("ACCOUNT_NUMBER")) == null) {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            str2 = "";
                        } else {
                            str2 = str3;
                        }
                        linkedAccount = new AccountDetails.LinkedAccount(str9, dVar2, bVarA, str8, image, str, str2, eVar != null ? eVar.f163161b : null);
                    }
                    if (linkedAccount != null) {
                        arrayList3.add(linkedAccount);
                    }
                }
                return arrayList3;
            case 24:
                Intrinsics.checkNotNullParameter((cz9.f) obj2, "$this$update");
                return new cz9.d(((fz9.b) ((fz9.c) obj3)).f139136a);
            case 25:
                d08.b bVar = (d08.b) obj3;
                PetPlanBuilderFlowContract$PlanBuilderAction action = (PetPlanBuilderFlowContract$PlanBuilderAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                efm.r rVarG = m70.a.g(bVar.f110325b.e(action.f, action.f76353a, true), null, new czh.a(i6), 1);
                zhm.h0 h0Var = zhm.h0.f322473a;
                efm.d0 d0VarFirstOrError = ue0.e.q(rVarG, h0Var).firstOrError();
                d0VarFirstOrError.getClass();
                int i32 = 4;
                pfm.h hVar = new pfm.h(d0VarFirstOrError, i32);
                ufm.i iVar = new ufm.i(bVar.f110326c.d.c().o(), new cu8.u0(20, new cw7.j(26)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                pfm.a aVarE = hVar.e(new pfm.a(ue0.e.I(iVar, h0Var, new cw7.j(27)), new cu8.u0(i3, new cui.v(bVar, action, 13)), i32));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 26:
                String paymentConfig = (String) obj2;
                Intrinsics.checkNotNullParameter(paymentConfig, "paymentConfig");
                return new pfm.h(new a08.l((d0f.a) obj3, paymentConfig, 17), i5);
            case 27:
                d27.u update8 = (d27.u) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                fd1.a aVar7 = (fd1.a) ((fd1.b) obj3);
                CatalogueProduct catalogueProduct = aVar7.f133855a;
                return d27.u.a(update8, null, new d27.n(zi0.c.P(catalogueProduct.f.f115083b, false, null, 3), aVar7.f133855a.f.f115082a), null, aVar7.f133855a, null, false, null, null, null, null, catalogueProduct.f60684b, 1013);
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new d27.c0(d27.p0.b((d27.u) obj3), (List) getDefaultLoadingItems.invoke(), d27.p0.d(false));
            default:
                UUID uploadId = (UUID) obj2;
                Intrinsics.checkNotNullParameter(uploadId, "uploadId");
                return (String) ((d30.c) obj3).f110894b.get("file_url_" + uploadId);
        }
    }

    public /* synthetic */ n0(Object obj2, int i) {
        this.f109140a = i;
        this.f109141b = obj2;
    }
}
