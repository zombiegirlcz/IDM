package com.revolut.camerakit.ui.views.view.player;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.ui.PlayerView;
import jv0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/player/CameraKitPlayer;", "Landroidx/media3/ui/PlayerView;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setRepeat", "(Z)V", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitPlayer extends PlayerView implements LifecycleEventObserver {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExoPlayer f50897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f50899c;
    public boolean d;
    public LifecycleRegistry e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitPlayer(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c() {
        Uri uri2;
        ExoPlayer exoPlayer = this.f50897a;
        if (exoPlayer == null || (uri2 = this.f50899c) == null) {
            return;
        }
        FileDataSource fileDataSource = new FileDataSource();
        try {
            fileDataSource.open(new DataSpec(uri2));
            Uri uri3 = fileDataSource.getUri();
            if (uri3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            MediaItem mediaItemFromUri = MediaItem.fromUri(uri3);
            Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
            ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new a(fileDataSource, 1)).createMediaSource(mediaItemFromUri);
            Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
            exoPlayer.setMediaSource(progressiveMediaSourceCreateMediaSource);
            exoPlayer.prepare();
        } finally {
            try {
                m.Companion companion = m.INSTANCE;
                fileDataSource.close();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                o.a(th10);
            }
        }
    }

    public final void d() {
        ExoPlayer exoPlayer = this.f50897a;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(false);
        }
        ExoPlayer exoPlayer2 = this.f50897a;
        if (exoPlayer2 != null) {
            exoPlayer2.clearMediaItems();
        }
        ExoPlayer exoPlayer3 = this.f50897a;
        if (exoPlayer3 != null) {
            exoPlayer3.release();
        }
        this.f50897a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleRegistry lifecycleRegistry = this.e;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.addObserver(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LifecycleRegistry lifecycleRegistry = this.e;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.removeObserver(this);
        }
        this.e = null;
        d();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        ExoPlayer exoPlayer;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = xz.a.f309755a[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            d();
            return;
        }
        ExoPlayer exoPlayer2 = this.f50897a;
        if (exoPlayer2 != null) {
            exoPlayer2.setPlayWhenReady(this.f50898b);
        }
        ExoPlayer exoPlayer3 = this.f50897a;
        if ((exoPlayer3 != null ? exoPlayer3.getPlayerError() : null) == null || this.f50899c == null || (exoPlayer = this.f50897a) == null) {
            return;
        }
        exoPlayer.prepare();
    }

    public final void setRepeat(boolean enabled) {
        this.d = enabled;
        ExoPlayer exoPlayer = this.f50897a;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(enabled ? 1 : 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitPlayer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitPlayer(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setUseController(false);
    }

    public /* synthetic */ CameraKitPlayer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
