package com.onfido.android.sdk.capture.ui.camera.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.onfido.android.sdk.capture.databinding.OnfidoAutoPlayerVideoViewBinding;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LoadingErrorState;
import com.onfido.android.sdk.capture.ui.widget.LoadingView;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.listeners.SurfaceTextureListener;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001@B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0002J\u0006\u0010%\u001a\u00020\"J\b\u0010&\u001a\u00020\"H\u0002J\u0006\u0010'\u001a\u00020\u0017J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0014J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020\"H\u0014J\b\u0010-\u001a\u00020\"H\u0016J\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\"J\b\u00100\u001a\u00020\"H\u0016J\u0014\u00101\u001a\u00020\"2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\"03J\u0010\u00104\u001a\u00020\"2\b\b\u0001\u00105\u001a\u00020\bJ\u000e\u00106\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u00107\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0017J\u0014\u0010:\u001a\u00020\"2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\"03J\u000e\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020\"J\u0006\u0010?\u001a\u00020\"R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006A"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/view/AutoPlayVideoView;", "Landroid/widget/FrameLayout;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/error/LoadingErrorState$LoadingErrorStateListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aspectRatio", "", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoAutoPlayerVideoViewBinding;", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoAutoPlayerVideoViewBinding;", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "getDisposable", "()Lio/reactivex/rxjava3/disposables/Disposable;", "setDisposable", "(Lio/reactivex/rxjava3/disposables/Disposable;)V", "isLooping", "", "isWidthMode", "listener", "Lcom/onfido/android/sdk/capture/ui/camera/view/AutoPlayVideoView$AutoPlayVideoViewListener;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "mediaPlayer$delegate", "Lkotlin/Lazy;", "adjustAspectRatio", "", "videoWidth", "videoHeight", "clearListener", "dispose", "hasVideo", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onReloadPressed", "onStarted", "pause", "release", "restartVideo", "resume", "seekToBeginning", "action", "Lkotlin/Function0;", "setError", "message", "setIsLooping", "setListener", "setLoading", "isLoading", "setOnCompletionListener", "setVideoUrl", "path", "", "start", "stop", "AutoPlayVideoViewListener", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AutoPlayVideoView extends FrameLayout implements LoadingErrorState.LoadingErrorStateListener {
    private float aspectRatio;

    @NotNull
    private final OnfidoAutoPlayerVideoViewBinding binding;
    private Disposable disposable;
    private boolean isLooping;
    private boolean isWidthMode;
    private AutoPlayVideoViewListener listener;

    /* JADX INFO: renamed from: mediaPlayer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaPlayer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/view/AutoPlayVideoView$AutoPlayVideoViewListener;", "", "onReloadPressed", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AutoPlayVideoViewListener {
        void onReloadPressed();
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.view.AutoPlayVideoView$adjustAspectRatio$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
        final /* synthetic */ int $viewHeight;
        final /* synthetic */ int $viewWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2) {
            super(1);
            this.$viewWidth = i;
            this.$viewHeight = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((ViewGroup.LayoutParams) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull ViewGroup.LayoutParams it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            it8.width = this.$viewWidth;
            it8.height = this.$viewHeight;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.view.AutoPlayVideoView$adjustAspectRatio$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21272 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
        final /* synthetic */ int $viewHeight;
        final /* synthetic */ int $viewWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21272(int i, int i2) {
            super(1);
            this.$viewWidth = i;
            this.$viewHeight = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((ViewGroup.LayoutParams) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull ViewGroup.LayoutParams it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            it8.width = this.$viewWidth;
            it8.height = this.$viewHeight;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoPlayVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AutoPlayVideoView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.start();
    }

    private final void adjustAspectRatio(int videoWidth, int videoHeight) {
        FrameLayout root;
        Function1 c21272;
        if (this.isWidthMode) {
            int width = this.binding.videoPlayer.getWidth();
            double d = ((double) videoHeight) / ((double) videoWidth);
            root = this.binding.root;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            c21272 = new AnonymousClass1(width, (int) (((double) width) * d));
        } else {
            int height = this.binding.videoPlayer.getHeight();
            double d5 = ((double) videoWidth) / ((double) videoHeight);
            this.aspectRatio = (float) d5;
            root = this.binding.root;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            c21272 = new C21272((int) (((double) height) * d5), height);
        }
        ViewExtensionsKt.changeLayoutParams((ViewGroup) root, (Function1<? super ViewGroup.LayoutParams, Unit>) c21272);
    }

    private final void dispose() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void seekToBeginning$lambda$5(Function0 action, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCompletionListener$lambda$6(Function0 action, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }

    public final void clearListener() {
        this.listener = null;
    }

    @NotNull
    public final OnfidoAutoPlayerVideoViewBinding getBinding() {
        return this.binding;
    }

    public final Disposable getDisposable() {
        return this.disposable;
    }

    @NotNull
    public final MediaPlayer getMediaPlayer() {
        return (MediaPlayer) this.mediaPlayer.getValue();
    }

    public final boolean hasVideo() {
        return getMediaPlayer().getVideoHeight() != 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == 1073741824) {
            this.isWidthMode = true;
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            setMeasuredDimension(size, (int) (size * this.aspectRatio));
        } else if (mode2 != 1073741824) {
            this.isWidthMode = true;
            setMeasuredDimension(getWidth(), getHeight());
        } else {
            this.isWidthMode = false;
            int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            setMeasuredDimension((int) (size2 * this.aspectRatio), size2);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LoadingErrorState.LoadingErrorStateListener
    public void onReloadPressed() {
        AutoPlayVideoViewListener autoPlayVideoViewListener = this.listener;
        if (autoPlayVideoViewListener != null) {
            autoPlayVideoViewListener.onReloadPressed();
        }
    }

    public void onStarted() {
    }

    public void pause() {
        getMediaPlayer().pause();
    }

    public final void release() {
        getMediaPlayer().release();
        dispose();
    }

    public final void restartVideo() {
        getMediaPlayer().seekTo(0);
    }

    public void resume() {
        getMediaPlayer().start();
    }

    public final void seekToBeginning(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getMediaPlayer().seekTo(0);
        getMediaPlayer().setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.onfido.android.sdk.capture.ui.camera.view.b
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                AutoPlayVideoView.seekToBeginning$lambda$5(action, mediaPlayer);
            }
        });
    }

    public final void setDisposable(Disposable disposable) {
        this.disposable = disposable;
    }

    public final void setError(int message) {
        OnfidoAutoPlayerVideoViewBinding onfidoAutoPlayerVideoViewBinding = this.binding;
        onfidoAutoPlayerVideoViewBinding.loadingErrorState.setErrorMessage(message);
        LoadingErrorState loadingErrorState = onfidoAutoPlayerVideoViewBinding.loadingErrorState;
        Intrinsics.checkNotNullExpressionValue(loadingErrorState, "loadingErrorState");
        ViewExtensionsKt.toVisible$default(loadingErrorState, false, 1, null);
        LoadingView progressBar = onfidoAutoPlayerVideoViewBinding.progressBar;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        ViewExtensionsKt.toInvisible$default(progressBar, false, 1, null);
        TextureView videoPlayer = onfidoAutoPlayerVideoViewBinding.videoPlayer;
        Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoPlayer");
        ViewExtensionsKt.toInvisible$default(videoPlayer, false, 1, null);
    }

    public final void setIsLooping(boolean isLooping) {
        this.isLooping = isLooping;
    }

    public final void setListener(@NotNull AutoPlayVideoViewListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setLoading(boolean isLoading) {
        View videoPlayer;
        LoadingErrorState loadingErrorState = this.binding.loadingErrorState;
        Intrinsics.checkNotNullExpressionValue(loadingErrorState, "loadingErrorState");
        ViewExtensionsKt.toInvisible$default(loadingErrorState, false, 1, null);
        if (isLoading) {
            OnfidoAutoPlayerVideoViewBinding onfidoAutoPlayerVideoViewBinding = this.binding;
            TextureView videoPlayer2 = onfidoAutoPlayerVideoViewBinding.videoPlayer;
            Intrinsics.checkNotNullExpressionValue(videoPlayer2, "videoPlayer");
            ViewExtensionsKt.toInvisible$default(videoPlayer2, false, 1, null);
            videoPlayer = onfidoAutoPlayerVideoViewBinding.progressBar;
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "progressBar");
        } else {
            OnfidoAutoPlayerVideoViewBinding onfidoAutoPlayerVideoViewBinding2 = this.binding;
            LoadingView progressBar = onfidoAutoPlayerVideoViewBinding2.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            ViewExtensionsKt.toInvisible$default(progressBar, false, 1, null);
            videoPlayer = onfidoAutoPlayerVideoViewBinding2.videoPlayer;
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoPlayer");
        }
        ViewExtensionsKt.toVisible$default(videoPlayer, false, 1, null);
    }

    public final void setOnCompletionListener(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getMediaPlayer().setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.onfido.android.sdk.capture.ui.camera.view.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                AutoPlayVideoView.setOnCompletionListener$lambda$6(action, mediaPlayer);
            }
        });
    }

    public final void setVideoUrl(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        MediaPlayer mediaPlayer = getMediaPlayer();
        mediaPlayer.reset();
        mediaPlayer.setDataSource(path);
        mediaPlayer.prepareAsync();
    }

    public final void start() {
        if (hasVideo()) {
            adjustAspectRatio(getMediaPlayer().getVideoWidth(), getMediaPlayer().getVideoHeight());
            getMediaPlayer().setLooping(this.isLooping);
            setLoading(false);
            getMediaPlayer().start();
            onStarted();
        }
    }

    public final void stop() {
        if (getMediaPlayer().isPlaying()) {
            getMediaPlayer().stop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoPlayVideoView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlayVideoView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.aspectRatio = 1.0f;
        this.isWidthMode = true;
        this.isLooping = true;
        this.mediaPlayer = j.b(AutoPlayVideoView$mediaPlayer$2.INSTANCE);
        OnfidoAutoPlayerVideoViewBinding onfidoAutoPlayerVideoViewBindingInflate = OnfidoAutoPlayerVideoViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAutoPlayerVideoViewBindingInflate, "inflate(...)");
        this.binding = onfidoAutoPlayerVideoViewBindingInflate;
        getMediaPlayer().setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.onfido.android.sdk.capture.ui.camera.view.a
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                AutoPlayVideoView._init_$lambda$0(this.f50040a, mediaPlayer);
            }
        });
        onfidoAutoPlayerVideoViewBindingInflate.videoPlayer.setSurfaceTextureListener(new SurfaceTextureListener() { // from class: com.onfido.android.sdk.capture.ui.camera.view.AutoPlayVideoView.2
            @Override // com.onfido.android.sdk.capture.utils.listeners.SurfaceTextureListener, android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
                Intrinsics.checkNotNullParameter(surface, "surface");
                super.onSurfaceTextureAvailable(surface, width, height);
                AutoPlayVideoView.this.getMediaPlayer().setSurface(new Surface(surface));
            }
        });
        onfidoAutoPlayerVideoViewBindingInflate.loadingErrorState.setListener(this);
    }

    public /* synthetic */ AutoPlayVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
