package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum h implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    RevolutPay(1),
    HPP(2),
    CardGatewayBanner(3),
    EnrollmentConfirmationBanner(4),
    PromotionalBanner(5),
    CardField(6),
    CardPopup(7),
    OpenBanking(8),
    PaymentRequest(9),
    PayByBank(10),
    PaymentLink(11),
    ATM(12),
    VM(13),
    EmbeddedCheckout(14),
    ClickToPay(15),
    UNRECOGNIZED(-1);

    public static final int ATM_VALUE = 12;
    public static final int CardField_VALUE = 6;
    public static final int CardGatewayBanner_VALUE = 3;
    public static final int CardPopup_VALUE = 7;
    public static final int ClickToPay_VALUE = 15;
    public static final int EmbeddedCheckout_VALUE = 14;
    public static final int EnrollmentConfirmationBanner_VALUE = 4;
    public static final int HPP_VALUE = 2;
    public static final int OpenBanking_VALUE = 8;
    public static final int PayByBank_VALUE = 10;
    public static final int PaymentLink_VALUE = 11;
    public static final int PaymentRequest_VALUE = 9;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int PromotionalBanner_VALUE = 5;
    public static final int RevolutPay_VALUE = 1;
    public static final int VM_VALUE = 13;
    private static final com.google.protobuf.b1 internalValueMap = new g();
    private final int value;

    h(int i) {
        this.value = i;
    }

    public static h a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return RevolutPay;
            case 2:
                return HPP;
            case 3:
                return CardGatewayBanner;
            case 4:
                return EnrollmentConfirmationBanner;
            case 5:
                return PromotionalBanner;
            case 6:
                return CardField;
            case 7:
                return CardPopup;
            case 8:
                return OpenBanking;
            case 9:
                return PaymentRequest;
            case 10:
                return PayByBank;
            case 11:
                return PaymentLink;
            case 12:
                return ATM;
            case 13:
                return VM;
            case 14:
                return EmbeddedCheckout;
            case 15:
                return ClickToPay;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
