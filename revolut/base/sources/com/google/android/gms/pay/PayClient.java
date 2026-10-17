package com.google.android.gms.pay;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes16.dex */
public interface PayClient extends HasApiKey<Api.ApiOptions.NotRequiredOptions> {

    @NonNull
    public static final String EXTRA_API_ERROR_MESSAGE = "extra_api_error_message";

    public enum ProductName {
        GOOGLE_PAY,
        GOOGLE_WALLET
    }

    public @interface RequestType {
        public static final int CARD_PROVISIONING_DEEP_LINK = 1;
        public static final int SAVE_PASSES = 2;
        public static final int SAVE_PASSES_JWT = 3;
    }

    public @interface SavePassesResult {
        public static final int API_UNAVAILABLE = 1;
        public static final int INTERNAL_ERROR = 3;
        public static final int SAVE_ERROR = 2;
    }

    public @interface WearWalletIntentSource {
        public static final int OOBE = 20;
        public static final int SETTINGS = 21;
    }

    @NonNull
    Task<EmoneyReadiness> checkReadinessForEmoney(@NonNull String str, @NonNull String str2);

    @NonNull
    Task<Integer> getPayApiAvailabilityStatus(@RequestType int i);

    @NonNull
    Task<PendingIntent> getPendingIntentForWalletOnWear(@NonNull String str, @WearWalletIntentSource int i);

    ProductName getProductName();

    @NonNull
    Task<Void> notifyCardTapEvent(@NonNull String str);

    @NonNull
    Task<Void> notifyEmoneyCardStatusUpdate(@NonNull String str);

    @NonNull
    Task<Void> pushEmoneyCard(@NonNull String str, @NonNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher);

    void savePasses(@NonNull String str, @NonNull Activity activity, @RequestType int i);

    void savePassesJwt(@NonNull String str, @NonNull Activity activity, @RequestType int i);
}
