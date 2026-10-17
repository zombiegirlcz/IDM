package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import aw0.y8;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/revolut/core/ui_kit/views/RichVideoPlayerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getDuration", "()J", "getPosition", "position", "", "setPosition", "(J)V", "Law0/y8;", "mode", "setPlayerInterfaceMode", "(Law0/y8;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setScrollForwardErrorMessage", "", "Lpz0/a;", "getAvailableSubtitlesTracks", "()Ljava/util/List;", "Ljava/util/Locale;", "languages", "setPreferredSubtitlesLanguages", "(Ljava/util/List;)V", "", "getSubtitlesEnabled", "()Z", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RichVideoPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f58848c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0.c f58849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58850b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RichVideoPlayerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Integer num) {
        Integer numC;
        jv0.g gVar = ((UiKitPlayerView) this.f58849a.getContentPlayerView()).o;
        if (gVar != null) {
            if (num != null) {
                gVar.d(num.intValue());
                return;
            }
            DefaultTrackSelector defaultTrackSelector = gVar.f178740a;
            MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = defaultTrackSelector.getCurrentMappedTrackInfo();
            if (currentMappedTrackInfo == null || (numC = jv0.g.c(currentMappedTrackInfo)) == null) {
                return;
            }
            defaultTrackSelector.setParameters(defaultTrackSelector.buildUponParameters().setRendererDisabled(numC.intValue(), true));
        }
    }

    @NotNull
    public final List<pz0.a> getAvailableSubtitlesTracks() {
        return this.f58849a.getContentPlayerView().getAvailableSubtitlesTracks();
    }

    public final long getDuration() {
        return this.f58849a.getContentPlayerView().getContentDuration();
    }

    public final long getPosition() {
        return this.f58849a.getContentPlayerView().getContentPosition();
    }

    public final boolean getSubtitlesEnabled() {
        return this.f58849a.getContentPlayerView().getSubtitlesEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Lifecycle lifecycleG = or0.u.g(this);
        for (vq0.a aVar : this.f58850b) {
            aVar.a(this.f58849a);
            lifecycleG.addObserver(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycleG = or0.u.g(this);
        Iterator it8 = this.f58850b.iterator();
        while (it8.hasNext()) {
            lifecycleG.removeObserver((LifecycleObserver) it8.next());
        }
    }

    public final void setPlayerInterfaceMode(@NotNull y8 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f58849a.setPlayerInterfaceMode(mode);
    }

    public final void setPosition(long position) {
        UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) this.f58849a.getContentPlayerView();
        uiKitPlayerView.f57710l = Long.valueOf(position);
        ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
        if (exoPlayer != null) {
            exoPlayer.seekTo(position);
            uiKitPlayerView.f57710l = null;
        }
    }

    public final void setPreferredSubtitlesLanguages(@NotNull List<Locale> languages) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f58849a.getContentPlayerView().setPreferredSubtitlesLanguages(languages);
    }

    public final void setScrollForwardErrorMessage(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f58849a.setScrollForwardErrorMessage(clause);
    }

    public final void setTitle(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f58849a.mo3805getHeaderView().setTitle(clause);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RichVideoPlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichVideoPlayerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        nu0.c cVar = new nu0.c(context, null, 6, 0);
        this.f58849a = cVar;
        this.f58850b = zhm.v.k(new vq0.e(new vq0.n()), new vq0.m(), new vq0.h());
        addView(cVar);
    }

    public /* synthetic */ RichVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
