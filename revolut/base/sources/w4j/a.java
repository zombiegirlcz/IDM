package w4j;

import aim.f;
import com.revolut.domain.models.beneficiary.BankBeneficiaryParams$IdentityType;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CopState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryCreationKompotInputData f294601a;

    public a(d requestDataGenerator, b expansionFieldExtractor, BeneficiaryCreationKompotInputData inputData) {
        Intrinsics.checkNotNullParameter(requestDataGenerator, "requestDataGenerator");
        Intrinsics.checkNotNullParameter(expansionFieldExtractor, "expansionFieldExtractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f294601a = inputData;
    }

    public final n61.b a(BeneficiaryInfoState mainInfoState, List list, BeneficiaryCreationFlowContract$CopState beneficiaryCreationFlowContract$CopState, Address address) {
        Field$ExpansionDefinition field$ExpansionDefinition;
        Map mapX;
        Map mapG;
        BankBeneficiaryParams$IdentityType bankBeneficiaryParams$IdentityType;
        Object next;
        Object next2;
        String strD;
        BeneficiaryCreationKompotInputData.CreationConfiguration creationConfiguration = this.f294601a.f99625b;
        Intrinsics.checkNotNullParameter(mainInfoState, "mainInfoState");
        n61.a aVar = new n61.a();
        List mainDefinitions = mainInfoState.getF99711g();
        BeneficiaryRouteType routeType = mainInfoState.getF99704b();
        Intrinsics.checkNotNullParameter(mainInfoState, "mainInfoState");
        if (mainInfoState instanceof BeneficiaryInfoState.BankRecipient) {
            field$ExpansionDefinition = ((BeneficiaryInfoState.BankRecipient) mainInfoState).i;
        } else {
            if (!(mainInfoState instanceof BeneficiaryInfoState.CreditCardBeneficiary) && !(mainInfoState instanceof BeneficiaryInfoState.MobileWallet) && !(mainInfoState instanceof BeneficiaryInfoState.PaymentVendor)) {
                throw new NoWhenBranchMatchedException();
            }
            field$ExpansionDefinition = null;
        }
        Intrinsics.checkNotNullParameter(mainDefinitions, "mainDefinitions");
        Intrinsics.checkNotNullParameter(routeType, "routeType");
        f builder = new f();
        if (Intrinsics.f(routeType, BeneficiaryRouteType.BANK.f99587a)) {
            mapX = r0.g();
        } else if (routeType instanceof BeneficiaryRouteType.MobileWallet) {
            mapX = a0.d.x("TRANSFER_VENDOR", ((BeneficiaryRouteType.MobileWallet) routeType).f99588a);
        } else {
            if (!(routeType instanceof BeneficiaryRouteType.PaymentVendorType)) {
                throw new NoWhenBranchMatchedException();
            }
            mapX = a0.d.x("TRANSFER_VENDOR", ((BeneficiaryRouteType.PaymentVendorType) routeType).f99589a.f64079a);
        }
        if (field$ExpansionDefinition != null) {
            ExpansionFieldDefinition expansionFieldDefinition = field$ExpansionDefinition.f99729a;
            mapG = a0.d.x(expansionFieldDefinition.f99654c, expansionFieldDefinition.f.f99655a);
        } else {
            mapG = r0.g();
        }
        List list2 = mainDefinitions;
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList<Field$BackendDefinition> arrayListE0 = d0.E0(list, list2);
        int iB = q0.b(w.t(arrayListE0, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Field$BackendDefinition field$BackendDefinition : arrayListE0) {
            String str = field$BackendDefinition.getF99718a().f60271a;
            if (field$BackendDefinition instanceof Field$BackendDefinition.DropdownDefinition) {
                strD = ((Field$BackendDefinition.DropdownDefinition) field$BackendDefinition).f99714b;
            } else if (field$BackendDefinition instanceof Field$BackendDefinition.InputDefinition) {
                Field$BackendDefinition.InputDefinition inputDefinition = (Field$BackendDefinition.InputDefinition) field$BackendDefinition;
                strD = n4j.c.d(inputDefinition.f99715a, inputDefinition.f99717c);
            } else {
                if (!(field$BackendDefinition instanceof Field$BackendDefinition.SearchList)) {
                    throw new NoWhenBranchMatchedException();
                }
                Field$BackendDefinition.SearchList.SelectedInfo selectedInfo = ((Field$BackendDefinition.SearchList) field$BackendDefinition).d;
                strD = selectedInfo != null ? selectedInfo.f99722b : null;
                if (strD == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            linkedHashMap.put(str, strD);
        }
        builder.putAll(linkedHashMap);
        builder.putAll(mapX);
        builder.putAll(mapG);
        Intrinsics.checkNotNullParameter(builder, "builder");
        f fVarB = builder.b();
        s4j.b accountType = mainInfoState.getF99705c();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        int i = c.f294602a[accountType.ordinal()];
        if (i == 1) {
            bankBeneficiaryParams$IdentityType = BankBeneficiaryParams$IdentityType.BUSINESS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bankBeneficiaryParams$IdentityType = BankBeneficiaryParams$IdentityType.INDIVIDUAL;
        }
        aVar.f212663a = bankBeneficiaryParams$IdentityType;
        aVar.d = fVarB;
        aVar.f212666g = beneficiaryCreationFlowContract$CopState != null ? beneficiaryCreationFlowContract$CopState.f99736a : null;
        aVar.f = address;
        aVar.f212665c = mainInfoState.getD().f99723a.f297794a;
        aVar.f212664b = mainInfoState.getE().f99726a.f306286a;
        aVar.e = mainInfoState.getF().f99731b.f60287a.f60285b;
        Iterator it8 = creationConfiguration.getF99649b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachExtractionTaskId) {
                break;
            }
        }
        BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachExtractionTaskId attachExtractionTaskId = (BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachExtractionTaskId) next;
        aVar.f212667h = attachExtractionTaskId != null ? attachExtractionTaskId.f99626a : null;
        Iterator it9 = creationConfiguration.getF99649b().iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (next2 instanceof BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachPaymentWidgetId) {
                break;
            }
        }
        BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachPaymentWidgetId attachPaymentWidgetId = (BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.AttachPaymentWidgetId) next2;
        aVar.i = attachPaymentWidgetId != null ? attachPaymentWidgetId.f99627a : null;
        return aVar.a();
    }
}
