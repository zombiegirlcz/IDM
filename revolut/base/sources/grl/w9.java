package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum w9 implements com.google.protobuf.a1 {
    dismissal_unspecified(0),
    user_initiated_dismiss(1),
    gambling_risk_cancel(2),
    redirected_to_join_revolut(3),
    sign_in_failed(4),
    sign_in_cancelled(5),
    sign_in_access_denied(6),
    sign_in_forgot_pin(7),
    sign_in_captcha_failed(8),
    logged_out(9),
    order_load_failed(10),
    join_revolut_link_load_failed(11),
    three_ds_challenge_dismissed(12),
    suspicious_transaction_review_dismissed(13),
    payment_failed(14),
    payment_completed(15),
    redirect_to_business(16),
    guest_checkout_started(17),
    user_sign_out(18),
    UNRECOGNIZED(-1);

    public static final int dismissal_unspecified_VALUE = 0;
    public static final int gambling_risk_cancel_VALUE = 2;
    public static final int guest_checkout_started_VALUE = 17;
    private static final com.google.protobuf.b1 internalValueMap = new v9();
    public static final int join_revolut_link_load_failed_VALUE = 11;
    public static final int logged_out_VALUE = 9;
    public static final int order_load_failed_VALUE = 10;
    public static final int payment_completed_VALUE = 15;
    public static final int payment_failed_VALUE = 14;
    public static final int redirect_to_business_VALUE = 16;
    public static final int redirected_to_join_revolut_VALUE = 3;
    public static final int sign_in_access_denied_VALUE = 6;
    public static final int sign_in_cancelled_VALUE = 5;
    public static final int sign_in_captcha_failed_VALUE = 8;
    public static final int sign_in_failed_VALUE = 4;
    public static final int sign_in_forgot_pin_VALUE = 7;
    public static final int suspicious_transaction_review_dismissed_VALUE = 13;
    public static final int three_ds_challenge_dismissed_VALUE = 12;
    public static final int user_initiated_dismiss_VALUE = 1;
    public static final int user_sign_out_VALUE = 18;
    private final int value;

    w9(int i) {
        this.value = i;
    }

    public static w9 a(int i) {
        switch (i) {
            case 0:
                return dismissal_unspecified;
            case 1:
                return user_initiated_dismiss;
            case 2:
                return gambling_risk_cancel;
            case 3:
                return redirected_to_join_revolut;
            case 4:
                return sign_in_failed;
            case 5:
                return sign_in_cancelled;
            case 6:
                return sign_in_access_denied;
            case 7:
                return sign_in_forgot_pin;
            case 8:
                return sign_in_captcha_failed;
            case 9:
                return logged_out;
            case 10:
                return order_load_failed;
            case 11:
                return join_revolut_link_load_failed;
            case 12:
                return three_ds_challenge_dismissed;
            case 13:
                return suspicious_transaction_review_dismissed;
            case 14:
                return payment_failed;
            case 15:
                return payment_completed;
            case 16:
                return redirect_to_business;
            case 17:
                return guest_checkout_started;
            case 18:
                return user_sign_out;
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
