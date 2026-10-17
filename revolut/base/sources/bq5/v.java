package bq5;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCreateBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCreateBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String companyName = textData.f52598b.toString();
        String str = textData.f52597a;
        int iHashCode = str.hashCode();
        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = this.v;
        switch (iHashCode) {
            case -2118911176:
                if (str.equals("RECIPIENT_DETAILS_COMPANY_NAME_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(companyName, "companyName");
                    aVar2.H2(aVar2.C, new bd2.b(companyName, 5));
                }
                break;
            case -603278437:
                if (str.equals("RECIPIENT_DETAILS_BUSINESS_REGISTRATION_NUMBER_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar3 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(companyName, "number");
                    aVar3.H2(aVar3.C, new bd2.b(companyName, 10));
                }
                break;
            case 610932901:
                if (str.equals("RECIPIENT_DETAILS_FIRST_NAME_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar4 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(companyName, "firstName");
                    aVar4.H2(aVar4.C, new bd2.b(companyName, 11));
                }
                break;
            case 749158342:
                if (str.equals("ADDRESS_DESTINATION_TAG_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar5 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(companyName, "tag");
                    aVar5.H2(aVar5.C, new bd2.b(companyName, 7));
                }
                break;
            case 912762745:
                if (str.equals("RECIPIENT_DETAILS_LAST_NAME_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar6 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    aVar6.getClass();
                    Intrinsics.checkNotNullParameter(companyName, "lastName");
                    aVar6.H2(aVar6.C, new bd2.b(companyName, 6));
                }
                break;
            case 932304732:
                if (str.equals("LABEL_ITEM_ID")) {
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar7 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) cryptoCreateBeneficiaryScreen.R2();
                    aVar7.getClass();
                    Intrinsics.checkNotNullParameter(companyName, "label");
                    aVar7.H2(aVar7.C, new bd2.b(companyName, 8));
                }
                break;
        }
        return Unit.f186387a;
    }
}
