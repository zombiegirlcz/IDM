package com.onfido.android.sdk.capture.component.active.video.capture.presentation.intro;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import au0.b2;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.repository.ActiveVideoCaptureRepository;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.OnfidoAnimWebView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentMotionIntroBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import ngm.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H\u0002J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020+H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00066"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/intro/MotionIntroFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentMotionIntroBinding;", "activeVideoCaptureRepository", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/repository/ActiveVideoCaptureRepository;", "getActiveVideoCaptureRepository", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/repository/ActiveVideoCaptureRepository;", "setActiveVideoCaptureRepository", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/repository/ActiveVideoCaptureRepository;)V", "analytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "getAnalytics", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "setAnalytics", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;)V", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentMotionIntroBinding;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "motionHostViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "getMotionHostViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "motionHostViewModel$delegate", "Lkotlin/Lazy;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "getSchedulersProvider", "()Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "setSchedulersProvider", "(Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "storage", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "getStorage$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "setStorage$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;)V", "isDarkMode", "", "onDestroyView", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "removeLeftoverVideoFiles", "setNextButtonListener", "setupDisclaimerView", "setupVideoWebView", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionIntroFragment extends Fragment {
    private OnfidoFragmentMotionIntroBinding _binding;
    public ActiveVideoCaptureRepository activeVideoCaptureRepository;
    public OnfidoAnalytics analytics;

    @NotNull
    private final CompositeDisposable disposable;

    /* JADX INFO: renamed from: motionHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionHostViewModel;
    public SchedulersProvider schedulersProvider;
    public SharedPreferencesDataSource storage;

    @NotNull
    public static final String INTRO_ANIM_PATH = "motion-intro-light.json";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/intro/MotionIntroFragment$Companion;", "", "()V", "INTRO_ANIM_PATH", "", "createInstance", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/intro/MotionIntroFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MotionIntroFragment createInstance() {
            return new MotionIntroFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MotionIntroFragment() {
        super(R.layout.onfido_fragment_motion_intro);
        Lazy lazyC = j.c(k.NONE, new MotionIntroFragment$special$$inlined$viewModels$default$1(new MotionIntroFragment$motionHostViewModel$2(this)));
        this.motionHostViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(MotionHostViewModel.class), new MotionIntroFragment$special$$inlined$viewModels$default$2(lazyC), new MotionIntroFragment$special$$inlined$viewModels$default$3(null, lazyC), new MotionIntroFragment$special$$inlined$viewModels$default$4(this, lazyC));
        this.disposable = new CompositeDisposable();
    }

    private final OnfidoFragmentMotionIntroBinding getBinding() {
        OnfidoFragmentMotionIntroBinding onfidoFragmentMotionIntroBinding = this._binding;
        Intrinsics.h(onfidoFragmentMotionIntroBinding);
        return onfidoFragmentMotionIntroBinding;
    }

    private final MotionHostViewModel getMotionHostViewModel() {
        return (MotionHostViewModel) this.motionHostViewModel.getValue();
    }

    private final boolean isDarkMode() {
        Boolean boolValueOf;
        Object locale;
        SharedPreferencesDataSource storage$onfido_capture_sdk_core_release = getStorage$onfido_capture_sdk_core_release();
        StorageKey storageKey = StorageKey.IS_IN_DARK_MODE;
        SharedPreferences prefs$onfido_capture_sdk_core_release = storage$onfido_capture_sdk_core_release.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        String strName = storageKey.name();
        if (prefs$onfido_capture_sdk_core_release.contains(strName)) {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(Boolean.class);
            if (kClassB.equals(p0Var.b(String.class))) {
                locale = prefs$onfido_capture_sdk_core_release.getString(strName, "");
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else if (kClassB.equals(p0Var.b(Integer.TYPE))) {
                locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(strName, -1));
            } else if (kClassB.equals(p0Var.b(Boolean.TYPE))) {
                boolValueOf = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(strName, false));
            } else if (kClassB.equals(p0Var.b(Float.TYPE))) {
                locale = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(strName, -1.0f));
            } else if (kClassB.equals(p0Var.b(Long.TYPE))) {
                locale = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(strName, -1L));
            } else {
                if (!kClassB.equals(p0Var.b(Locale.class))) {
                    throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                }
                locale = storage$onfido_capture_sdk_core_release.getLocale(prefs$onfido_capture_sdk_core_release, strName);
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            boolValueOf = (Boolean) locale;
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final void removeLeftoverVideoFiles() {
        CompositeDisposable compositeDisposable = this.disposable;
        g gVarH = getActiveVideoCaptureRepository().deleteVideoFiles().j(getSchedulersProvider().getIo()).h(new igm.g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.intro.MotionIntroFragment.removeLeftoverVideoFiles.2
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8);
            }
        }, new a());
        Intrinsics.checkNotNullExpressionValue(gVarH, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, gVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLeftoverVideoFiles$lambda$1() {
    }

    private final void setNextButtonListener() {
        getBinding().motionIntroStartRecordingButton.setOnClickListener(new b2(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNextButtonListener$lambda$0(MotionIntroFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAnalytics().track(AvcAnalyticsEvent.IntroReadyButtonClicked.INSTANCE);
        this$0.getMotionHostViewModel().navigateToCaptureScreen();
    }

    private final void setupDisclaimerView() {
        getBinding().introDisclaimerView.setText(getString(getMotionHostViewModel().getAudioEnabled() ? R.string.onfido_avc_intro_disclaimer_camera_and_audio_on : R.string.onfido_avc_intro_disclaimer));
    }

    private final void setupVideoWebView() throws JSONException {
        OnfidoAnimWebView animWebView = getBinding().animWebView;
        Intrinsics.checkNotNullExpressionValue(animWebView, "animWebView");
        OnfidoAnimWebView.loadAnim$default(animWebView, "motion-intro-light.json", isDarkMode(), null, true, 0, R.string.onfido_avc_intro_video_accessibility, R.string.onfido_video_intro_button_play_accessibility, R.string.onfido_video_intro_button_pause_accessibility, null, 276, null);
    }

    @NotNull
    public final ActiveVideoCaptureRepository getActiveVideoCaptureRepository() {
        ActiveVideoCaptureRepository activeVideoCaptureRepository = this.activeVideoCaptureRepository;
        if (activeVideoCaptureRepository != null) {
            return activeVideoCaptureRepository;
        }
        Intrinsics.r("activeVideoCaptureRepository");
        throw null;
    }

    @NotNull
    public final OnfidoAnalytics getAnalytics() {
        OnfidoAnalytics onfidoAnalytics = this.analytics;
        if (onfidoAnalytics != null) {
            return onfidoAnalytics;
        }
        Intrinsics.r("analytics");
        throw null;
    }

    @NotNull
    public final SchedulersProvider getSchedulersProvider() {
        SchedulersProvider schedulersProvider = this.schedulersProvider;
        if (schedulersProvider != null) {
            return schedulersProvider;
        }
        Intrinsics.r("schedulersProvider");
        throw null;
    }

    @NotNull
    public final SharedPreferencesDataSource getStorage$onfido_capture_sdk_core_release() {
        SharedPreferencesDataSource sharedPreferencesDataSource = this.storage;
        if (sharedPreferencesDataSource != null) {
            return sharedPreferencesDataSource;
        }
        Intrinsics.r("storage");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.disposable.d();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment parentFragment = getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment");
        ((MotionHostFragment) parentFragment).getMotionHostComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentMotionIntroBinding.bind(view);
        setNextButtonListener();
        setupVideoWebView();
        setupDisclaimerView();
        getAnalytics().track(AvcAnalyticsEvent.Intro.INSTANCE);
        removeLeftoverVideoFiles();
    }

    public final void setActiveVideoCaptureRepository(@NotNull ActiveVideoCaptureRepository activeVideoCaptureRepository) {
        Intrinsics.checkNotNullParameter(activeVideoCaptureRepository, "<set-?>");
        this.activeVideoCaptureRepository = activeVideoCaptureRepository;
    }

    public final void setAnalytics(@NotNull OnfidoAnalytics onfidoAnalytics) {
        Intrinsics.checkNotNullParameter(onfidoAnalytics, "<set-?>");
        this.analytics = onfidoAnalytics;
    }

    public final void setSchedulersProvider(@NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "<set-?>");
        this.schedulersProvider = schedulersProvider;
    }

    public final void setStorage$onfido_capture_sdk_core_release(@NotNull SharedPreferencesDataSource sharedPreferencesDataSource) {
        Intrinsics.checkNotNullParameter(sharedPreferencesDataSource, "<set-?>");
        this.storage = sharedPreferencesDataSource;
    }
}
