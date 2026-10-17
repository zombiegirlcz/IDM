package tyg;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.TextFieldValue;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.data.network.models.externalcards.mapper.IssuerInfoDtoMapperKt;
import com.revolut.data.network.models.ideal.IdealIssuerInfoDto;
import com.revolut.data.network.models.ideal.IdealIssuersDto;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.selfserve.sow.impl.ui.description.SowDescriptionFragment;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.statements.impl.ui.crypto_statement.screen.CryptoStatementScreen;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.feature_crypto_order_flow.api.models.AutoStakingData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import do3.q;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.s7;
import ip0.t10;
import ip0.zl0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import wxg.n;
import yhm.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275577a;

    public /* synthetic */ g(int i) {
        this.f275577a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = this.f275577a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                n it8 = (n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new jzg.a(it8.f300989b);
            case 1:
                Intrinsics.checkNotNullParameter((koi.j) obj2, "it");
                return Unit.f186387a;
            case 2:
                tz6.h update = (tz6.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return tz6.h.a(update, null, !update.f275877b, 1);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                t10 t10Var = new t10("ITEM_ID_LOADING_DESCRIPTION", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(t10Var);
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(new s7(a0.d.n("ITEM_ID_LOADING_RULE", i2), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                return u.a(eVarB);
            case 4:
                DOBInputData it9 = (DOBInputData) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf((it9 instanceof DOBInputData.Filled) && ((DOBInputData.Filled) it9).f == tz7.b.NONE);
            case 5:
                InputTextDelegate.TextData it10 = (InputTextDelegate.TextData) obj2;
                int i3 = SowDescriptionFragment.g0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f52598b;
            case 6:
                g6 it11 = (g6) obj2;
                KProperty[] kPropertyArr = CryptoStatementScreen.T;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f54199a;
            case 7:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return new tzd.m(file);
            case 8:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new AutoStakingData((StakingProduct) ((od0.i) rVar.f314201a).f224257a, (Boolean) ((od0.i) rVar.f314202b).f224257a, (io3.d) ((od0.i) rVar.f314203c).f224257a);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 11:
                StakingProduct stakingProduct = (StakingProduct) obj2;
                Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                od0.h hVar = od0.i.Companion;
                StakingProduct stakingProduct2 = stakingProduct.f88087b.k == vtd.b.AUTO ? stakingProduct : null;
                hVar.getClass();
                return od0.h.a(stakingProduct2);
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 13:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                Set setG = z0.g(i93.e.LOCATION);
                String country = profile.k.getCountry();
                wi0.b.Companion.getClass();
                if (Intrinsics.f(country, "SG")) {
                    setG.add(i93.e.ATM_WITHDRAWAL);
                }
                return setG;
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return y0.b(i93.e.LOCATION);
            case 15:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                return new u07.j(((FreelancerProfileSettings) hVar2.f288434b).f, (FreelancerTaxProfile) ((od0.i) hVar2.d).f224257a, ((ds6.k) hVar2.f288433a).f117243a, q.y((do3.n) hVar2.f288435c));
            case 16:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = u.b();
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "LIST_ID_LOADING_GUARDIAN", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(pb0VarB);
                eVarB2.addAll(yp0.b.g(v.k(nb0.b(nb0Var, "LIST_ID_LOADING_HIGHLIGHT_1", false, 0, false, 30), nb0.b(nb0Var, "LIST_ID_LOADING_HIGHLIGHT_2", false, 0, false, 30), nb0.b(nb0Var, "LIST_ID_LOADING_HIGHLIGHT_3", false, 0, false, 30)), u0d.e.a(), null, 0, 0, 126));
                return new s0d.l(null, null, u.a(eVarB2));
            case 18:
                zl0 it12 = (zl0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.f167489h;
                if (obj3 instanceof rzj.b) {
                    return (rzj.b) obj3;
                }
                return null;
            case 19:
                return SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$0((Offset) obj2);
            case 20:
                return SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter$lambda$1((AnimationVector2D) obj2);
            case 21:
                return TextFieldSelectionManager.onValueChange$lambda$0((TextFieldValue) obj2);
            case 22:
                ApmContact contact = (ApmContact) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                return Boolean.valueOf(Intrinsics.f(contact.getF(), ApmContact.State.ACTIVE.f62099a));
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new u1a.k(new ProfileCardModel.Loading(0), u.c(nb0.b(pb0.Companion, "ROW_TRANSACTION_LOADING_ID", false, 0, false, 30)), 2);
            case 24:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                TradeRevPointsAccount tradeRevPointsAccount = (TradeRevPointsAccount) it13.f224257a;
                if (tradeRevPointsAccount == null || (str = tradeRevPointsAccount.f91181a) == null) {
                    throw new NoSuchElementException("Account not found");
                }
                return str;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 26:
                nqi.a inputData = (nqi.a) obj2;
                KProperty[] kPropertyArr2 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return inputData.f218468b;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 28:
                f20.d categories = (f20.d) obj2;
                Intrinsics.checkNotNullParameter(categories, "categories");
                List<f20.e> tags = categories.getTags();
                ArrayList arrayList2 = new ArrayList(w.t(tags, 10));
                for (f20.e dto : tags) {
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    arrayList2.add(new w30.f(dto.getKey(), dto.getText(), dto.getIconName()));
                }
                return arrayList2;
            default:
                IdealIssuersDto dto2 = (IdealIssuersDto) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                List<IdealIssuerInfoDto> issuers = dto2.getIssuers();
                ArrayList arrayList3 = new ArrayList(w.t(issuers, 10));
                Iterator<T> it14 = issuers.iterator();
                while (it14.hasNext()) {
                    arrayList3.add(IssuerInfoDtoMapperKt.toDomain((IdealIssuerInfoDto) it14.next()));
                }
                return arrayList3;
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f275577a = i;
    }
}
