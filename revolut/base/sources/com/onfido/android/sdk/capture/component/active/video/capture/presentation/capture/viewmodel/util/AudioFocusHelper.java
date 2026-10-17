package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00060\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AudioFocusHelper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "canStopActiveMusic", "()Z", "requestAudioFocus", "requestAudioFocusForAndroidOreoAndAbove", "requestAudioFocusForBelowAndroidOreo", "requestAudioFocusIfPossible", "", "abandonAudioFocus", "()V", "Landroid/content/Context;", "Landroid/media/AudioManager;", "audioManager$delegate", "Lkotlin/Lazy;", "getAudioManager", "()Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "focusLostSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/core/Observable;", "focusLostObservable", "Lio/reactivex/rxjava3/core/Observable;", "getFocusLostObservable", "()Lio/reactivex/rxjava3/core/Observable;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AudioFocusHelper {

    @NotNull
    private final AudioManager.OnAudioFocusChangeListener audioChangeListener;
    private AudioFocusRequest audioFocusRequest;

    /* JADX INFO: renamed from: audioManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioManager;

    @NotNull
    private final Context context;

    @NotNull
    private final Observable focusLostObservable;

    @NotNull
    private final PublishSubject focusLostSubject;

    public AudioFocusHelper(@ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.audioManager = j.b(new AudioFocusHelper$audioManager$2(this));
        PublishSubject publishSubjectN = ch.qos.logback.core.util.a.n("create(...)");
        this.focusLostSubject = publishSubjectN;
        Observable observableHide = publishSubjectN.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.focusLostObservable = observableHide;
        this.audioChangeListener = new a(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void audioChangeListener$lambda$0(AudioFocusHelper this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -3 || i == -2 || i == -1) {
            this$0.focusLostSubject.onNext(Boolean.TRUE);
        }
    }

    private final boolean canStopActiveMusic() {
        if (ContextUtilsKt.apilevelAtLeast(31)) {
            List<AudioPlaybackConfiguration> activePlaybackConfigurations = getAudioManager().getActivePlaybackConfigurations();
            Intrinsics.checkNotNullExpressionValue(activePlaybackConfigurations, "getActivePlaybackConfigurations(...)");
            Iterator<T> it8 = activePlaybackConfigurations.iterator();
            if (it8.hasNext()) {
                AudioPlaybackConfiguration audioPlaybackConfiguration = (AudioPlaybackConfiguration) it8.next();
                if (audioPlaybackConfiguration.getAudioAttributes().getContentType() != 1 && v.k(1, 14).contains(Integer.valueOf(audioPlaybackConfiguration.getAudioAttributes().getUsage()))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final AudioManager getAudioManager() {
        return (AudioManager) this.audioManager.getValue();
    }

    private final boolean requestAudioFocus() {
        return ContextUtilsKt.apilevelAtLeast(26) ? requestAudioFocusForAndroidOreoAndAbove() : requestAudioFocusForBelowAndroidOreo();
    }

    private final boolean requestAudioFocusForAndroidOreoAndAbove() {
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setUsage(2);
        builder2.setContentType(1);
        builder.setAudioAttributes(builder2.build());
        builder.setWillPauseWhenDucked(true);
        builder.setOnAudioFocusChangeListener(this.audioChangeListener);
        this.audioFocusRequest = builder.build();
        AudioManager audioManager = getAudioManager();
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        Intrinsics.h(audioFocusRequest);
        return audioManager.requestAudioFocus(audioFocusRequest) == 1;
    }

    private final boolean requestAudioFocusForBelowAndroidOreo() {
        return getAudioManager().requestAudioFocus(this.audioChangeListener, 0, 1) == 1;
    }

    public final void abandonAudioFocus() {
        if (!ContextUtilsKt.apilevelAtLeast(26)) {
            getAudioManager().abandonAudioFocus(this.audioChangeListener);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            getAudioManager().abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    @NotNull
    public final Observable getFocusLostObservable() {
        return this.focusLostObservable;
    }

    public final boolean requestAudioFocusIfPossible() {
        if (!getAudioManager().isMusicActive() || canStopActiveMusic()) {
            return requestAudioFocus();
        }
        return false;
    }
}
