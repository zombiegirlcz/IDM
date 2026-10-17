package aed;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shared.vaults.domain.impl.data.repository.VaultsRepositoryImpl$ProPocketsDisabledException;
import com.revolut.feature.vaults.api.navigation.VaultsFeatureConfig;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import efm.d0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import te0.w;
import zh9.u0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f3527b;

    public /* synthetic */ c(Object obj2, s sVar, int i) {
        this.f3526a = i;
        this.f3527b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f3526a;
        s sVar = this.f3527b;
        switch (i) {
            case 0:
                Boolean isNotEligible = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isNotEligible, "isNotEligible");
                return isNotEligible.booleanValue() ? d0.l(new VaultsRepositoryImpl$ProPocketsDisabledException()) : d0.m(sVar);
            case 1:
                Boolean isNotEligible2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isNotEligible2, "isNotEligible");
                return isNotEligible2.booleanValue() ? d0.l(new VaultsRepositoryImpl$ProPocketsDisabledException()) : w.j(sVar);
            case 2:
                vdd.i it8 = (vdd.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return sVar;
            case 3:
                Boolean moveMoneyEligible = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(moveMoneyEligible, "moveMoneyEligible");
                if (moveMoneyEligible.booleanValue()) {
                    ufm.b bVarM = d0.m(u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.Withdraw(hob.d.i(sVar)), (Set) null, 6), null)));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                ufm.b bVarM2 = d0.m(new FeatureCommand(new VaultsFeatureConfig.Withdraw(sVar)));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 4:
                SavingsProductData productData = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(productData, "productData");
                dj0.d dVar = sVar.i().d;
                Intrinsics.checkNotNullParameter(productData, "<this>");
                LocalDate localDate = ocd.c.f224221a;
                Intrinsics.checkNotNullParameter(productData, "<this>");
                dj0.d dVarD = l9.l.d(dVar, new BigDecimal(String.valueOf(productData.f86683a.f86621h.a().f86651c)));
                if (dVarD.f115082a != 0) {
                    return new uob.d(dVarD, sVar, opg.a.g(productData));
                }
                IllegalStateException illegalStateException = new IllegalStateException("AmountToReachDailyInterestPayments is 0. SavingAccount already has sufficient money for daily interest.");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                throw illegalStateException;
            case 5:
                Image image = (Image) obj2;
                Intrinsics.checkNotNullParameter(image, "image");
                return new npg.b(sVar, image);
            case 6:
                Map imagesByVaultId = (Map) obj2;
                Intrinsics.checkNotNullParameter(imagesByVaultId, "imagesByVaultId");
                return (Image) r0.h(sVar.f234881a, imagesByVaultId);
            default:
                Map pocketsMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(pocketsMap, "pocketsMap");
                return qq8.a.a(sVar, pocketsMap);
        }
    }

    public /* synthetic */ c(s sVar, int i) {
        this.f3526a = i;
        this.f3527b = sVar;
    }
}
