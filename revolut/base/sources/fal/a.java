package fal;

import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f133410a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f133411b;

    static {
        String[] elements = {"suspicious_transaction_user_action_required", "suspicious_transaction_user_confirmed", "suspicious_transaction_user_declined", "suspicious_transaction_timeout", "suspicious_transaction_counterparty_action_required", "suspicious_transaction_pending_confirmation", "suspicious_transaction_pending_review", "suspicious_transaction_no_user_action_required", "crypto_withdrawal_fraud_limit"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f133411b = d.y0(elements);
    }

    private a() {
    }
}
