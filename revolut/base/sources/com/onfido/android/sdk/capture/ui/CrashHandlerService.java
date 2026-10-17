package com.onfido.android.sdk.capture.ui;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.onfido.android.sdk.capture.internal.util.logging.CrashHandlerWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/CrashHandlerService;", "Landroid/app/Service;", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashHandlerService extends Service {

    @NotNull
    public static final String FLOW_STEPS = "flow_steps";

    @NotNull
    public static final String LOGGER_ERROR_LEVELS = "logger_error_levels";

    @NotNull
    public static final String ESSENTIAL_ANALYTICS_ENABLED = "essential_analytics_enabled";

    @NotNull
    public static final String EXCEPTION_STACK_TRACE = "stack_trace";

    @NotNull
    public static final String EXCEPTION_MESSAGE = "exception_message";

    @NotNull
    public static final String LOGGER_ENABLED = "logger_enabled";

    @NotNull
    public static final String LEVELS_SEPARATOR = ",";

    @NotNull
    public static final String PAYLOAD_KEY = "crash_payload_key";

    @NotNull
    public static final String TOKEN = "token";

    @Override // android.app.Service
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("crash_payload_key")) == null) {
            return super.onStartCommand(intent, flags, startId);
        }
        Data dataBuild = new Data.Builder().putString("crash_payload_key", stringExtra).putBoolean("essential_analytics_enabled", intent.getBooleanExtra("essential_analytics_enabled", false)).putBoolean("logger_enabled", intent.getBooleanExtra("logger_enabled", false)).build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
        WorkManager.getInstance(getApplicationContext()).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CrashHandlerWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setInputData(dataBuild).build());
        return super.onStartCommand(intent, flags, startId);
    }
}
