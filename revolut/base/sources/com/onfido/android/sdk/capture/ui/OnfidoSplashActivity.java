package com.onfido.android.sdk.capture.ui;

import a41.h0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.config.EnterpriseConfig;
import com.onfido.android.sdk.capture.errors.MissingOnfidoConfigException;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import com.onfido.android.sdk.capture.internal.config.DefaultOnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.options.FlowAction;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import igm.g;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import rlm.o;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u001f\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u0017H\u0000¢\u0006\u0002\b*J\u0012\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020#H\u0014J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020-H\u0016J\u001c\u00101\u001a\u00020#2\n\u00102\u001a\u000603j\u0002`42\u0006\u00105\u001a\u000206H\u0002J\u0012\u00107\u001a\u00020#2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\b\u00108\u001a\u00020#H\u0002J\b\u00109\u001a\u00020#H\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u001c0\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006;"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoSplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "connection", "Landroid/content/ServiceConnection;", "getConnection$onfido_capture_sdk_core_release$annotations", "getConnection$onfido_capture_sdk_core_release", "()Landroid/content/ServiceConnection;", "isSDKStarted", "", "isSDKStarted$onfido_capture_sdk_core_release$annotations", "isSDKStarted$onfido_capture_sdk_core_release", "()Z", "setSDKStarted$onfido_capture_sdk_core_release", "(Z)V", "isServiceBound", "isServiceBound$onfido_capture_sdk_core_release$annotations", "isServiceBound$onfido_capture_sdk_core_release", "setServiceBound$onfido_capture_sdk_core_release", "serviceTimeoutDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "storage", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "timerScheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "getTimerScheduler$onfido_capture_sdk_core_release$annotations", "getTimerScheduler$onfido_capture_sdk_core_release", "()Lio/reactivex/rxjava3/core/Scheduler;", "setTimerScheduler$onfido_capture_sdk_core_release", "(Lio/reactivex/rxjava3/core/Scheduler;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "finishWithResult", "result", "", "intent", "finishWithResult$onfido_capture_sdk_core_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSaveInstanceState", "outState", "reportToOnfido", "e", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "setTheme", "startSDK", "unbindService", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoSplashActivity extends AppCompatActivity {
    private static final long SERVICE_START_TIMEOUT_IN_MS = 3000;

    @NotNull
    private final ServiceConnection connection;
    private boolean isSDKStarted;
    private boolean isServiceBound;
    private Disposable serviceTimeoutDisposable;

    @NotNull
    private final ActivityResultLauncher<Intent> startForResult;

    @NotNull
    private final SharedPreferencesDataSource storage = new SharedPreferencesDataSource(this, com.onfido.api.client.e.f50133a);
    private Scheduler timerScheduler = egm.b.a();

    @NotNull
    public static final String IS_SDK_STARTED = "is_sdk_started";

    public OnfidoSplashActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new cmc.d(this, 23));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.startForResult = activityResultLauncherRegisterForActivityResult;
        this.connection = new ServiceConnection() { // from class: com.onfido.android.sdk.capture.ui.OnfidoSplashActivity$connection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                this.this$0.setServiceBound$onfido_capture_sdk_core_release(true);
                Disposable disposable = this.this$0.serviceTimeoutDisposable;
                if (disposable != null) {
                    disposable.dispose();
                }
                this.this$0.startSDK();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.this$0.setServiceBound$onfido_capture_sdk_core_release(false);
            }
        };
    }

    public static /* synthetic */ void finishWithResult$onfido_capture_sdk_core_release$default(OnfidoSplashActivity onfidoSplashActivity, int i, Intent intent, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            intent = new Intent();
        }
        onfidoSplashActivity.finishWithResult$onfido_capture_sdk_core_release(i, intent);
    }

    public static /* synthetic */ void getConnection$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getTimerScheduler$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void isSDKStarted$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void isServiceBound$onfido_capture_sdk_core_release$annotations() {
    }

    private final void reportToOnfido(IllegalStateException e, OnfidoConfig onfidoConfig) {
        String str = onfidoConfig.getToken().f50152a;
        o oVar = com.onfido.api.client.e.f50133a;
        List<FlowStep> flowSteps = onfidoConfig.getFlowSteps();
        ArrayList arrayList = new ArrayList(w.t(flowSteps, 10));
        Iterator<T> it8 = flowSteps.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FlowStep) it8.next()).getAction());
        }
        tlm.e eVar = oVar.f187949b;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType kTypeB = o0.b(FlowAction.class);
        companion.getClass();
        String strC = oVar.c(jh.d.v(eVar, o0.c(List.class, KTypeProjection.Companion.a(kTypeB))), arrayList);
        CrashPayloadStore crashPayloadStore = CrashPayloadStore.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Pair pair = new Pair("token", str);
        Pair pair2 = new Pair("flow_steps", strC);
        Pair pair3 = new Pair("stack_trace", yhm.f.b(e));
        Pair pair4 = new Pair("exception_message", e.getMessage());
        DefaultOnfidoRemoteConfig defaultOnfidoRemoteConfig = DefaultOnfidoRemoteConfig.INSTANCE;
        String strSave = crashPayloadStore.save(applicationContext, r0.k(pair, pair2, pair3, pair4, new Pair("logger_error_levels", d0.k0(defaultOnfidoRemoteConfig.getLoggerConfiguration().getLevels(), ",", null, null, 0, null, 62))));
        Intent intent = new Intent(this, (Class<?>) CrashHandlerService.class);
        intent.putExtra("crash_payload_key", strSave);
        intent.putExtra("logger_enabled", defaultOnfidoRemoteConfig.getLoggerConfiguration().isEnabled());
        intent.putExtra("essential_analytics_enabled", defaultOnfidoRemoteConfig.isInhouseAnalyticsEnabled());
        startService(intent);
    }

    private final void setTheme(OnfidoConfig onfidoConfig) {
        setTheme(ContextUtilsKt.isDarkModeEnabled(this, onfidoConfig) ? R.style.OnfidoDarkTheme : R.style.OnfidoLightTheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$0(OnfidoSplashActivity this$0, ActivityResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        Intent data = result.getData();
        if (data == null) {
            data = new Intent();
        }
        this$0.finishWithResult$onfido_capture_sdk_core_release(resultCode, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSDK() {
        Parcelable parcelable;
        Intent intentPutExtra;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) h0.m(intent);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("onfido_config");
            if (!(parcelableExtra instanceof OnfidoConfig)) {
                parcelableExtra = null;
            }
            parcelable = (OnfidoConfig) parcelableExtra;
        }
        OnfidoConfig onfidoConfig = parcelable instanceof OnfidoConfig ? (OnfidoConfig) parcelable : null;
        if (onfidoConfig != null && !this.isSDKStarted) {
            this.isSDKStarted = true;
            try {
                ActivityResultLauncher<Intent> activityResultLauncher = this.startForResult;
                OnfidoActivity.Companion companion = OnfidoActivity.INSTANCE;
                String stringExtra = getIntent().getStringExtra("onfido_bridge_url");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                activityResultLauncher.launch(companion.create$onfido_capture_sdk_core_release(this, onfidoConfig, stringExtra));
                overridePendingTransition(0, 0);
                return;
            } catch (IllegalStateException e) {
                reportToOnfido(e, onfidoConfig);
                Intent intent2 = new Intent();
                String localizedMessage = e.getLocalizedMessage();
                intentPutExtra = intent2.putExtra("onfido_exception_result", new OnfidoException(localizedMessage != null ? localizedMessage : ""));
            }
        } else {
            if (onfidoConfig != null) {
                return;
            }
            Intent intent3 = new Intent();
            String localizedMessage2 = new MissingOnfidoConfigException().getLocalizedMessage();
            intentPutExtra = intent3.putExtra("onfido_exception_result", new OnfidoException(localizedMessage2 != null ? localizedMessage2 : ""));
        }
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        finishWithResult$onfido_capture_sdk_core_release(-2, intentPutExtra);
    }

    private final void unbindService() {
        if (this.isServiceBound) {
            unbindService(this.connection);
            this.isServiceBound = false;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        uc.a.a(this);
    }

    public final void finishWithResult$onfido_capture_sdk_core_release(int result, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.storage.delete$onfido_capture_sdk_core_release(StorageKey.SINGLE_RUN_SESSION_ID);
        setResult(result, intent);
        finish();
    }

    @NotNull
    /* JADX INFO: renamed from: getConnection$onfido_capture_sdk_core_release, reason: from getter */
    public final ServiceConnection getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: getTimerScheduler$onfido_capture_sdk_core_release, reason: from getter */
    public final Scheduler getTimerScheduler() {
        return this.timerScheduler;
    }

    /* JADX INFO: renamed from: isSDKStarted$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsSDKStarted() {
        return this.isSDKStarted;
    }

    /* JADX INFO: renamed from: isServiceBound$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsServiceBound() {
        return this.isServiceBound;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        Object locale;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Long lValueOf = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) h0.m(intent);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("onfido_config");
            if (!(parcelableExtra instanceof OnfidoConfig)) {
                parcelableExtra = null;
            }
            parcelable = (OnfidoConfig) parcelableExtra;
        }
        OnfidoConfig onfidoConfig = parcelable instanceof OnfidoConfig ? (OnfidoConfig) parcelable : null;
        EnterpriseConfig.INSTANCE.setEnterpriseFeatures(onfidoConfig != null ? onfidoConfig.getEnterpriseFeatures() : null);
        setTheme(onfidoConfig);
        setContentView(R.layout.onfido_splash_activity);
        Bundle extras = getIntent().getExtras();
        long j2 = extras != null ? extras.getLong("onfido_session_id") : 0L;
        if (savedInstanceState == null || !savedInstanceState.getBoolean("is_sdk_started")) {
            SharedPreferencesDataSource sharedPreferencesDataSource = this.storage;
            StorageKey storageKey = StorageKey.SINGLE_RUN_SESSION_ID;
            SharedPreferences prefs$onfido_capture_sdk_core_release = sharedPreferencesDataSource.getPrefs$onfido_capture_sdk_core_release();
            Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
            String strName = storageKey.name();
            if (prefs$onfido_capture_sdk_core_release.contains(strName)) {
                p0 p0Var = o0.f186429a;
                KClass kClassB = p0Var.b(Long.class);
                if (kClassB.equals(p0Var.b(String.class))) {
                    locale = prefs$onfido_capture_sdk_core_release.getString(strName, "");
                    if (locale == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                } else if (kClassB.equals(p0Var.b(Integer.TYPE))) {
                    locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(strName, -1));
                } else if (kClassB.equals(p0Var.b(Boolean.TYPE))) {
                    locale = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(strName, false));
                } else if (kClassB.equals(p0Var.b(Float.TYPE))) {
                    locale = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(strName, -1.0f));
                } else if (kClassB.equals(p0Var.b(Long.TYPE))) {
                    lValueOf = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(strName, -1L));
                } else {
                    if (!kClassB.equals(p0Var.b(Locale.class))) {
                        throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                    }
                    locale = sharedPreferencesDataSource.getLocale(prefs$onfido_capture_sdk_core_release, strName);
                    if (locale == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                }
                lValueOf = (Long) locale;
            }
            if (lValueOf == null || lValueOf.longValue() != j2) {
                Intent intent2 = new Intent(this, (Class<?>) OnfidoStarterService.class);
                intent2.putExtra("onfido_config", onfidoConfig);
                bindService(intent2, this.connection, 1);
                this.serviceTimeoutDisposable = Single.f(Boolean.TRUE).d(3000L, TimeUnit.MILLISECONDS, this.timerScheduler).h(this.timerScheduler).i(new g() { // from class: com.onfido.android.sdk.capture.ui.OnfidoSplashActivity.onCreate.1
                    @Override // igm.g
                    public /* bridge */ /* synthetic */ void accept(Object obj2) {
                        accept(((Boolean) obj2).booleanValue());
                    }

                    public final void accept(boolean z) {
                        OnfidoSplashActivity.this.startSDK();
                    }
                }, new g() { // from class: com.onfido.android.sdk.capture.ui.OnfidoSplashActivity.onCreate.2
                    @Override // igm.g
                    public final void accept(@NotNull Throwable it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        OnfidoSplashActivity.this.startSDK();
                    }
                });
                SharedPreferencesDataSource sharedPreferencesDataSource2 = this.storage;
                Long lValueOf2 = Long.valueOf(j2);
                SharedPreferences prefs$onfido_capture_sdk_core_release2 = sharedPreferencesDataSource2.getPrefs$onfido_capture_sdk_core_release();
                Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release2, "<get-prefs>(...)");
                sharedPreferencesDataSource2.set(prefs$onfido_capture_sdk_core_release2, storageKey.name(), lValueOf2);
                return;
            }
        }
        this.storage.delete$onfido_capture_sdk_core_release(StorageKey.SINGLE_RUN_SESSION_ID);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unbindService();
        Disposable disposable = this.serviceTimeoutDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("is_sdk_started", true);
        super.onSaveInstanceState(outState);
    }

    public final void setSDKStarted$onfido_capture_sdk_core_release(boolean z) {
        this.isSDKStarted = z;
    }

    public final void setServiceBound$onfido_capture_sdk_core_release(boolean z) {
        this.isServiceBound = z;
    }

    public final void setTimerScheduler$onfido_capture_sdk_core_release(Scheduler scheduler) {
        this.timerScheduler = scheduler;
    }
}
