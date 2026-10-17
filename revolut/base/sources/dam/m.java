package dam;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public enum m {
    CLOSE("atomic-transact-close"),
    FINISH("atomic-transact-finish"),
    INTERACTION("atomic-transact-interaction"),
    OPEN_URL("atomic-transact-open-url"),
    DATA_REQUEST("atomic-transact-data-request"),
    AUTOMATION_HANDOFF("atomic-transact-automation-handoff"),
    AUTH_POLL("auth-poll"),
    DISMISS("atomic-transact-dismiss"),
    DOM_POLL("dom-poll"),
    EVALUATE_ON_DEVICE("evaluate-on-device"),
    EVALUATE_RESPONSE("sdk-evaluate-response"),
    EXIT_AUTH("sdk-exit-auth"),
    LOG("sdk-log"),
    INTERNAL_LOG("internal-log"),
    INTERNAL_INTERCEPTED_REQUEST("internal-intercepted-request"),
    INTERCEPTED_REQUEST("sdk-intercepted-request"),
    NATIVE_EVENT("sdk-native-event"),
    NATIVE_NAVIGATE("native-navigate"),
    NATIVE_NAVIGATE_FINISHED("sdk-native-navigate-finished"),
    NATIVE_NETWORK_REQUEST("native-network-request"),
    NATIVE_NETWORK_RESPONSE("native-network-response"),
    NATIVE_HIDE("native-hide"),
    NATIVE_SHOW("native-show"),
    NETWORK_REQUEST_ON_DEVICE("network-request-on-device"),
    NETWORK_RESPONSE("sdk-network-response"),
    RR_WEB("rrweb-event"),
    RR_WEB_RESPONSE("sdk-rrweb-event"),
    SDK_ERROR("sdk-error"),
    STORAGE_GET("storage-get"),
    STORAGE_PUT("storage-put"),
    STORAGE_RESPONSE("sdk-storage-response"),
    UPDATE_URL("sdk-update-url"),
    UPDATE_DOM_STATE("sdk-update-dom-state"),
    USER_AUTHENTICATED("sdk-user-authenticated");


    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112581a;

    m(String str) {
        this.f112581a = str;
    }
}
