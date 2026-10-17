package ryd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.statements.impl.ui.tax_certificate.TaxCertificateScreen;
import com.revolut.feature.statements.impl.ui.tax_certificate.TaxCertificateScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.tax_certificate.flow.TaxCertificateFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.about_refund.AirportLoungePassAboutRefundScreen;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258349a;

    public /* synthetic */ l(int i) {
        this.f258349a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f258349a) {
            case 0:
                Throwable error = (Throwable) obj2;
                c71.a aVar = (c71.a) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                c71.a aVar2 = (c71.a) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (aVar2 == null) {
                    return error2;
                }
                return null;
            case 2:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AirportLoungePassDetailsRefundScreenContract$ModalStep step = (AirportLoungePassDetailsRefundScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, AirportLoungePassDetailsRefundScreenContract$ModalStep.AboutYourRefund.f99144a)) {
                    return new AirportLoungePassAboutRefundScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                Function1 defaultFactory = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(12, null, false, false, null));
            case 4:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ryl.f);
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ryl.h);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 10:
                zw7.h type = (zw7.h) obj2;
                PetBreedDetailsContract$BreedParam breed = (PetBreedDetailsContract$BreedParam) data;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(breed, "breed");
                zw7.h.Companion.getClass();
                return Boolean.valueOf((!zw7.g.a().contains(type) || d0.W(breed.f76232a) || d0.W(breed.f76233b)) ? false : true);
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new qzb.g(rzb.b.a(null, null));
            case 14:
                Function1 errorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                List list = (List) errorItems.invoke(new iii.d(12, null, true, true, null));
                yp0.b.k(list, 0, 0, 0, 0, 31);
                return list;
            case 15:
                Throwable th10 = (Throwable) obj2;
                if (((e7l.f) data) == null) {
                    return th10;
                }
                return null;
            case 16:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof s01.h);
            case 17:
                Throwable error3 = (Throwable) obj2;
                zw7.d0 d0Var = (zw7.d0) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (d0Var == null) {
                    return error3;
                }
                return null;
            case 18:
                Throwable error4 = (Throwable) obj2;
                u09.p pVar = (u09.p) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error4, h0Var);
                if (pVar == null) {
                    return error4;
                }
                return null;
            case 19:
                Throwable error5 = (Throwable) obj2;
                u09.f fVar = (u09.f) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (fVar == null) {
                    return error5;
                }
                return null;
            case 20:
                Throwable error6 = (Throwable) obj2;
                u09.q qVar = (u09.q) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error6, h0Var2);
                if (qVar == null) {
                    return error6;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 22:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 23:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                TaxCertificateFlowContract$Step step2 = (TaxCertificateFlowContract$Step) data;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                return new TaxCertificateScreen(new TaxCertificateScreenContract$InputData(step2.f88393a));
            case 24:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new s15.g((List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)), null, false, new TextLocalisedClause(R$string.financial_difficulties_title, null, null, 14), 10);
            case 25:
                Throwable error7 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (pair == null) {
                    return error7;
                }
                return null;
            case 26:
                Throwable error8 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (bool == null) {
                    return error8;
                }
                return null;
            case 27:
                Throwable error9 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (tradingLegalEntityInformation == null) {
                    return error9;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
        }
    }

    public /* synthetic */ l(Object obj2, int i) {
        this.f258349a = i;
    }
}
