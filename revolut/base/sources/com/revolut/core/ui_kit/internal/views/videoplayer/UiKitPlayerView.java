package com.revolut.core.ui_kit.internal.views.videoplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import hbm.e;
import ix0.f2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jv0.b;
import jv0.g;
import jv0.h;
import jv0.i;
import jv0.j;
import jv0.s;
import jv0.t;
import jv0.v;
import jv0.w;
import jv0.x;
import jv0.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kv0.c;
import lx0.f;
import or0.u;
import org.jetbrains.annotations.NotNull;
import oz0.d;
import xt0.a;
import yhm.m;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001SB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001d\u0010L\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/videoplayer/UiKitPlayerView;", "Landroid/widget/FrameLayout;", "Ljv0/y;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getContentDuration", "()J", "getContentPosition", "", "getSubtitlesEnabled", "()Z", "", "Lpz0/a;", "getAvailableSubtitlesTracks", "()Ljava/util/List;", "Ljava/util/Locale;", "languages", "", "setPreferredSubtitlesLanguages", "(Ljava/util/List;)V", "enabled", "setScreenshotDrawingMode", "(Z)V", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "shutter", "setShutter", "(Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;)V", "setRepeat", "Loz0/d;", "mode", "setVideoVolumeMode", "(Loz0/d;)V", "", "volume", "setVolumeLevel", "(F)V", "Loz0/b;", "type", "setScaleType", "(Loz0/b;)V", "Lxt0/a;", "a", "Lxt0/a;", "getExternalMediaRegistry", "()Lxt0/a;", "setExternalMediaRegistry", "(Lxt0/a;)V", "externalMediaRegistry", "Ljv0/s;", "b", "Ljv0/s;", "getDetachBehavior", "()Ljv0/s;", "setDetachBehavior", "(Ljv0/s;)V", "detachBehavior", "Ljv0/t;", "c", "Ljv0/t;", "getSurfaceDestructionStrategy", "()Ljv0/t;", "setSurfaceDestructionStrategy", "(Ljv0/t;)V", "surfaceDestructionStrategy", "Landroid/media/AudioManager;", "p", "Lkotlin/Lazy;", "getAudioManager", "()Landroid/media/AudioManager;", "audioManager", "Landroid/widget/ImageView;", "w", "Le8/q;", "getShutterImageView", "()Landroid/widget/ImageView;", "shutterImageView", "jv0/i", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UiKitPlayerView extends FrameLayout implements y {
    public static final /* synthetic */ int z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a externalMediaRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public s detachBehavior;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public t surfaceDestructionStrategy;
    public SurfaceTexture d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f57707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VideoShutter f57708h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f57709j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f57710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f57711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ExoPlayer f57712n;
    public g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f57713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f57714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f57715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f57716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f57717t;
    public final AspectRatioFrameLayout u;
    public final TextureView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q shutterImageView;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f57719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public jz0.c f57720y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UiKitPlayerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final oz0.a a(UiKitPlayerView uiKitPlayerView, PlaybackException playbackException) {
        return new oz0.a(playbackException.errorCode, com.google.android.gms.internal.mlkit_vision_face.a.o(playbackException.getErrorCodeName(), " | ", playbackException.getMessage()), playbackException.getCause());
    }

    public static final void c(UiKitPlayerView uiKitPlayerView) {
        VideoShutter videoShutter = uiKitPlayerView.f57708h;
        if (!(videoShutter instanceof VideoShutter.Fallback) || uiKitPlayerView.getShutterImageView().getVisibility() == 0) {
            return;
        }
        ImageView shutterImageView = uiKitPlayerView.getShutterImageView();
        Context context = shutterImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shutterImageView.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        yy0.f.e(u.k(shutterImageView).Q(), ((VideoShutter.Fallback) videoShutter).getF60095a(), uiKitPlayerView.getShutterImageView(), null, null, 12);
        shutterImageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        shutterImageView.setVisibility(0);
        shutterImageView.animate().alpha(1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AudioManager getAudioManager() {
        return (AudioManager) this.f57713p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getShutterImageView() {
        return (ImageView) this.shutterImageView.f();
    }

    @Override // ix0.d2
    public final void C() {
        k();
    }

    @Override // ix0.d2
    public final void D(boolean z3) {
        Player.Commands availableCommands;
        ExoPlayer exoPlayer;
        if (!z3) {
            ExoPlayer exoPlayer2 = this.f57712n;
            if (exoPlayer2 != null) {
                exoPlayer2.setPlayWhenReady(false);
                return;
            }
            return;
        }
        d();
        ExoPlayer exoPlayer3 = this.f57712n;
        if (exoPlayer3 == null || (availableCommands = exoPlayer3.getAvailableCommands()) == null || !availableCommands.contains(2) || (exoPlayer = this.f57712n) == null) {
            return;
        }
        exoPlayer.prepare();
    }

    public final void d() {
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(this.f);
        }
        this.f57717t.b();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.e) {
            super.draw(canvas);
        } else {
            if (this.f57712n == null || (bitmap = this.v.getBitmap()) == null) {
                return;
            }
            canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) / 2.0f, (getHeight() - bitmap.getHeight()) / 2.0f, (Paint) null);
            bitmap.recycle();
        }
    }

    public final void e() {
        x resource;
        MediaSource mediaSourceE;
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer == null || (resource = this.f57707g) == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resource instanceof jv0.u) {
            DataSpec dataSpec = new DataSpec(RawResourceDataSource.buildRawResourceUri(((jv0.u) resource).f178761a));
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(new b(context));
            try {
                rawResourceDataSource.open(dataSpec);
                Uri uri2 = rawResourceDataSource.getUri();
                if (uri2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                MediaItem mediaItemFromUri = MediaItem.fromUri(uri2);
                Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
                mediaSourceE = new ProgressiveMediaSource.Factory(new jv0.a(rawResourceDataSource, 0)).createMediaSource(mediaItemFromUri);
                Intrinsics.checkNotNullExpressionValue(mediaSourceE, "createMediaSource(...)");
            } finally {
                try {
                    m.Companion companion = m.INSTANCE;
                    rawResourceDataSource.close();
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    o.a(th10);
                }
            }
        } else {
            boolean z3 = resource instanceof w;
            f fVar = this.f57711m;
            if (z3) {
                Uri uri3 = Uri.parse(((w) resource).f178765a);
                SimpleCache simpleCache = fVar != null ? fVar.f200510a : null;
                Intrinsics.h(uri3);
                mediaSourceE = jv0.c.e(uri3, simpleCache);
            } else {
                if (!(resource instanceof v)) {
                    throw new NoWhenBranchMatchedException();
                }
                v vVar = (v) resource;
                Uri uriC = vVar.c();
                if (Intrinsics.f(uriC.getScheme(), "http") || Intrinsics.f(uriC.getScheme(), "https")) {
                    mediaSourceE = jv0.c.e(vVar.c(), fVar != null ? fVar.f200510a : null);
                } else {
                    mediaSourceE = jv0.c.c(vVar.c(), context, fVar != null ? fVar.f200510a : null);
                }
            }
        }
        exoPlayer.setMediaSource(mediaSourceE);
        exoPlayer.prepare();
    }

    public final void f() {
        float f;
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            int i = j.f178747b[this.f57709j.ordinal()];
            if (i == 1) {
                AudioManager audioManager = getAudioManager();
                f = (audioManager == null || audioManager.getRingerMode() != 2) ? BitmapDescriptorFactory.HUE_RED : this.k;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = this.k;
            }
            exoPlayer.setVolume(f);
        }
    }

    public final Bitmap g(Bitmap bitmap) {
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer == null) {
            return null;
        }
        VideoSize videoSize = exoPlayer.getVideoSize();
        AspectRatioFrameLayout aspectRatioFrameLayout = this.u;
        int width = aspectRatioFrameLayout.getWidth();
        int height = aspectRatioFrameLayout.getHeight();
        if (videoSize != null) {
            int i = videoSize.width;
            int i2 = videoSize.height;
            float f = videoSize.pixelWidthHeightRatio;
            if (i != 0 && i2 != 0 && f != BitmapDescriptorFactory.HUE_RED) {
                height = rim.d.c(width / this.f57719x.c((i * f) / i2));
            }
        }
        if (width == 0 || height == 0) {
            return null;
        }
        if (bitmap == null || bitmap.getWidth() != width || bitmap.getHeight() != height) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.h(bitmap);
        }
        this.v.getBitmap(bitmap);
        return bitmap;
    }

    @Override // jv0.y
    @NotNull
    public List<pz0.a> getAvailableSubtitlesTracks() {
        g gVar = this.o;
        List<pz0.a> listA = gVar != null ? gVar.a() : null;
        return listA == null ? f0.f322471a : listA;
    }

    @Override // jv0.y
    public long getContentDuration() {
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            return exoPlayer.getContentDuration();
        }
        return -9223372036854775807L;
    }

    @Override // jv0.y
    public long getContentPosition() {
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            return exoPlayer.getContentPosition();
        }
        return 0L;
    }

    @NotNull
    public s getDetachBehavior() {
        return this.detachBehavior;
    }

    public a getExternalMediaRegistry() {
        return this.externalMediaRegistry;
    }

    @Override // jv0.y
    public boolean getSubtitlesEnabled() {
        DefaultTrackSelector defaultTrackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;
        Integer numC;
        g gVar = this.o;
        if (gVar == null || (currentMappedTrackInfo = (defaultTrackSelector = gVar.f178740a).getCurrentMappedTrackInfo()) == null || (numC = g.c(currentMappedTrackInfo)) == null) {
            return false;
        }
        return !defaultTrackSelector.getParameters().getRendererDisabled(numC.intValue());
    }

    @NotNull
    public t getSurfaceDestructionStrategy() {
        return this.surfaceDestructionStrategy;
    }

    public final void h() {
        this.f = false;
        d();
    }

    public final void i() {
        if (!jo0.m.f176850g) {
            postDelayed(new h(this, 0), 1000L);
            return;
        }
        this.f = true;
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer == null || exoPlayer.getPlaybackState() == 1) {
            l();
        } else {
            d();
        }
    }

    public final void j(x xVar, jz0.c cVar) {
        this.f57720y = cVar;
        m();
        if (jo0.m.f176850g) {
            this.f57707g = xVar;
            e();
            this.f57719x.e(xVar.b() == oz0.c.ENABLED);
        }
    }

    public final void k() {
        this.f57719x.b();
        this.f57717t.a();
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            jv0.d.b(exoPlayer);
        }
        this.f57712n = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l() {
        Long l2;
        if (!jo0.m.f176850g) {
            postDelayed(new h(this, 0), 1000L);
            return;
        }
        if (this.f57712n == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            g gVar = new g(context);
            gVar.e(this.f57714q);
            this.o = gVar;
            ArrayList arrayList = jv0.d.f178736a;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ExoPlayer exoPlayerA = jv0.d.a(context2, gVar.f178740a);
            a externalMediaRegistry = getExternalMediaRegistry();
            if (externalMediaRegistry != null) {
                externalMediaRegistry.a(exoPlayerA);
            }
            this.f57719x.d(exoPlayerA);
            this.f57712n = exoPlayerA;
        }
        d();
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(this.i ? 1 : 0);
        }
        f();
        ExoPlayer exoPlayer2 = this.f57712n;
        if (exoPlayer2 != null && (l2 = this.f57710l) != null) {
            exoPlayer2.seekTo(l2.longValue());
            this.f57710l = null;
        }
        e();
        this.f57717t.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter r0 = r6.f57708h
            boolean r1 = r0 instanceof com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter.None
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 == 0) goto Lc
            r5 = r2
        La:
            r4 = r3
            goto L32
        Lc:
            boolean r1 = r0 instanceof com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter.Colored
            r4 = 1
            if (r1 != 0) goto L31
            boolean r1 = r0 instanceof com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter.Picture
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0 instanceof com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter.FadeIn
            r5 = 0
            if (r1 == 0) goto L1c
            goto La
        L1c:
            boolean r0 = r0 instanceof com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter.Fallback
            if (r0 == 0) goto L2b
            android.widget.ImageView r0 = r6.getShutterImageView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            goto L32
        L2b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L31:
            r5 = r2
        L32:
            android.widget.ImageView r0 = r6.getShutterImageView()
            if (r4 == 0) goto L39
            goto L3b
        L39:
            r3 = 8
        L3b:
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r6.getShutterImageView()
            r0.setAlpha(r2)
            android.view.TextureView r0 = r6.v
            r0.setAlpha(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView.m():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        SurfaceTexture surfaceTexture = this.d;
        if (surfaceTexture != null) {
            this.d = null;
            this.v.setSurfaceTexture(surfaceTexture);
        }
        super.onAttachedToWindow();
        if (!this.f57716s) {
            this.f57716s = true;
            if (this.f57707g != null) {
                l();
                return;
            }
            return;
        }
        int i = j.f178746a[getDetachBehavior().ordinal()];
        if (i == 1) {
            if (this.f57707g != null) {
                l();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ExoPlayer exoPlayer = this.f57712n;
            if (exoPlayer != null) {
                exoPlayer.play();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.animate().cancel();
        getShutterImageView().animate().cancel();
        int i = j.f178746a[getDetachBehavior().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ExoPlayer exoPlayer = this.f57712n;
            if (exoPlayer != null) {
                exoPlayer.pause();
                return;
            }
            return;
        }
        i iVar = this.f57717t;
        iVar.a();
        if (getExternalMediaRegistry() != null) {
            ExoPlayer exoPlayer2 = this.f57712n;
            if (exoPlayer2 != null) {
                exoPlayer2.stop();
            }
        } else {
            k();
        }
        iVar.onPlayWhenReadyChanged(false, 1);
    }

    public void setDetachBehavior(@NotNull s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.detachBehavior = sVar;
    }

    public void setExternalMediaRegistry(a aVar) {
        this.externalMediaRegistry = aVar;
    }

    @Override // jv0.y
    public void setPreferredSubtitlesLanguages(@NotNull List<Locale> languages) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f57714q = languages;
        g gVar = this.o;
        if (gVar != null) {
            gVar.e(languages);
        }
    }

    @Override // mz0.c
    public void setRepeat(boolean enabled) {
        this.i = enabled;
        ExoPlayer exoPlayer = this.f57712n;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(enabled ? 1 : 0);
        }
    }

    @Override // mz0.c
    public void setScaleType(@NotNull oz0.b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = j.f178748c[type.ordinal()];
        int i2 = 4;
        if (i != 1) {
            if (i == 2) {
                i2 = 0;
            } else if (i == 3) {
                i2 = 3;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 1;
            }
        }
        this.u.setResizeMode(i2);
    }

    @Override // fr0.h
    public void setScreenshotDrawingMode(boolean enabled) {
        setWillNotDraw(!enabled);
        this.e = enabled;
    }

    @Override // mz0.c
    public void setShutter(@NotNull VideoShutter shutter) {
        Intrinsics.checkNotNullParameter(shutter, "shutter");
        if (Intrinsics.f(this.f57708h, shutter)) {
            return;
        }
        this.f57708h = shutter;
        if (shutter instanceof VideoShutter.Colored) {
            ImageView shutterImageView = getShutterImageView();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            shutterImageView.setBackgroundColor(io0.a.c(context, ((VideoShutter.Colored) shutter).getF60093a()));
            yy0.f.e(u.k(this).Q(), null, getShutterImageView(), null, null, 12);
            return;
        }
        if (shutter instanceof VideoShutter.Picture) {
            ImageView shutterImageView2 = getShutterImageView();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            shutterImageView2.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context2));
            yy0.f.e(u.k(this).Q(), ((VideoShutter.Picture) shutter).getF60097a(), getShutterImageView(), null, null, 12);
            return;
        }
        if (Intrinsics.f(shutter, VideoShutter.None.f60096a)) {
            getShutterImageView().setVisibility(8);
            ImageView shutterImageView3 = getShutterImageView();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            shutterImageView3.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context3));
            yy0.f.e(u.k(this).Q(), null, getShutterImageView(), null, null, 12);
            return;
        }
        if (Intrinsics.f(shutter, VideoShutter.FadeIn.f60094a)) {
            getShutterImageView().setVisibility(8);
        } else {
            if (!(shutter instanceof VideoShutter.Fallback)) {
                throw new NoWhenBranchMatchedException();
            }
            getShutterImageView().setVisibility(8);
        }
    }

    public void setSurfaceDestructionStrategy(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.surfaceDestructionStrategy = tVar;
    }

    @Override // mz0.c
    public void setVideoVolumeMode(@NotNull d mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f57709j = mode;
        f();
    }

    @Override // mz0.c
    public void setVolumeLevel(float volume) {
        this.k = volume;
        f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UiKitPlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiKitPlayerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.detachBehavior = s.STOP_ON_DETACH;
        this.surfaceDestructionStrategy = t.DEFAULT;
        this.f57708h = VideoShutter.None.f60096a;
        this.f57709j = d.ALWAYS;
        this.k = 1.0f;
        this.f57711m = lx0.g.f200511a.a(context);
        this.f57713p = te0.w.y0(new a01.c(context, 12));
        this.f57714q = f0.f322471a;
        ihm.f fVarD = v0.a.d("create(...)");
        this.f57715r = fVarD;
        this.f57717t = new i(this);
        this.shutterImageView = kli.a.J(R$id.uikitPlayerViewV2_image, this);
        f2 f2Var = new f2(this, this);
        this.f57719x = new c();
        View.inflate(context, R$layout.internal_uikit_player_view_v2, this);
        View viewFindViewById = findViewById(R$id.uikitPlayerViewV2_frame);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.u = (AspectRatioFrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.uikitPlayerViewV2_texture);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextureView textureView = (TextureView) viewFindViewById2;
        this.v = textureView;
        fVarD.subscribe(new ju0.f(3, new jud.d(this, 2)));
        f2Var.a();
        textureView.setSurfaceTextureListener(new e(this, 1));
    }

    public /* synthetic */ UiKitPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
