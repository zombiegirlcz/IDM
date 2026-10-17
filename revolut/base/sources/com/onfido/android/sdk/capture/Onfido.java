package com.onfido.android.sdk.capture;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.os.Process;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.nfc.MRTDAccessControl;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.nfc.MRTDDocumentInfo;
import com.onfido.android.sdk.capture.nfc.MRTDReaderDelegate;
import com.onfido.android.sdk.capture.nfc.NfcSession;
import com.onfido.android.sdk.capture.upload.Captures;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 $2\u00020\u0001:\u0002$%J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005H&J \u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005H&JQ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&¢\u0006\u0002\u0010#¨\u0006&"}, d2 = {"Lcom/onfido/android/sdk/capture/Onfido;", "", "createIntent", "Landroid/content/Intent;", "config", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "handleActivityResult", "", "resultCode", "", "intent", "callback", "Lcom/onfido/android/sdk/capture/Onfido$OnfidoResultListener;", "startActivityForResult", "activity", "Landroid/app/Activity;", "requestCode", "onfidoConfig", "fragment", "Landroidx/fragment/app/Fragment;", "startStandaloneNFC", "Lcom/onfido/android/sdk/capture/nfc/NfcSession;", "documentInfo", "Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;", "preferredAccessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "dataGroups", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "activeAuthenticationChallenge", "", "chipAuthentication", "", "delegate", "Lcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;", "(Landroid/app/Activity;Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;[BZLcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;)Lcom/onfido/android/sdk/capture/nfc/NfcSession;", "Companion", "OnfidoResultListener", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Onfido {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/Onfido$Companion;", "", "()V", "isOnfidoProcess", "", "Landroid/app/Application;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean isOnfidoProcess(@NotNull Application application) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
            Intrinsics.checkNotNullParameter(application, "<this>");
            int iMyPid = Process.myPid();
            Object systemService = application.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            String processName = runningAppProcessInfo.processName;
                            Intrinsics.checkNotNullExpressionValue(processName, "processName");
                            if (a0.y(processName, ":onfido_process", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/Onfido$OnfidoResultListener;", "", "onError", "", "exception", "Lcom/onfido/android/sdk/capture/errors/OnfidoException;", "userCompleted", "captures", "Lcom/onfido/android/sdk/capture/upload/Captures;", "userExited", "exitCode", "Lcom/onfido/android/sdk/capture/ExitCode;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnfidoResultListener {
        void onError(@NotNull OnfidoException exception);

        void userCompleted(@NotNull Captures captures);

        void userExited(@NotNull ExitCode exitCode);
    }

    @NotNull
    Intent createIntent(@NotNull OnfidoConfig config);

    void handleActivityResult(int resultCode, Intent intent, @NotNull OnfidoResultListener callback);

    void startActivityForResult(@NotNull Activity activity, int requestCode, @NotNull OnfidoConfig onfidoConfig);

    void startActivityForResult(@NotNull Fragment fragment, int requestCode, @NotNull OnfidoConfig onfidoConfig);

    @NotNull
    NfcSession startStandaloneNFC(@NotNull Activity activity, @NotNull MRTDDocumentInfo documentInfo, MRTDAccessControl preferredAccessControl, MRTDDataGroup[] dataGroups, byte[] activeAuthenticationChallenge, boolean chipAuthentication, @NotNull MRTDReaderDelegate delegate);
}
