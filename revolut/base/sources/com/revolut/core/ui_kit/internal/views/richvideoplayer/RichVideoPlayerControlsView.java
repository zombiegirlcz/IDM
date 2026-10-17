package com.revolut.core.ui_kit.internal.views.richvideoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import ihm.b;
import ihm.f;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu0.e;
import nu0.h;
import nu0.i;
import nu0.p;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/richvideoplayer/RichVideoPlayerControlsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnu0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getScrollingForwardEnabled", "()Z", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setTimeText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "progress", "setProgress", "(I)V", "getMaxProgress", "()I", "Lnu0/h;", "state", "setSubtitlesShowingState", "(Lnu0/h;)V", "Landroid/widget/ImageView;", "b", "Le8/q;", "getButtonPlay", "()Landroid/widget/ImageView;", "buttonPlay", "f", "getButtonCaptions", "buttonCaptions", "Landroid/widget/TextView;", "g", "getTimeTextView", "()Landroid/widget/TextView;", "timeTextView", "Landroid/widget/SeekBar;", "h", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RichVideoPlayerControlsView extends ConstraintLayout implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q buttonPlay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q buttonCaptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q timeTextView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q seekBar;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f57513j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f57514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f57515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f57516n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RichVideoPlayerControlsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getButtonCaptions() {
        return (ImageView) this.buttonCaptions.f();
    }

    private final ImageView getButtonPlay() {
        return (ImageView) this.buttonPlay.f();
    }

    private final SeekBar getSeekBar() {
        return (SeekBar) this.seekBar.f();
    }

    private final TextView getTimeTextView() {
        return (TextView) this.timeTextView.f();
    }

    public final void f0(boolean z) {
        getButtonCaptions().setImageResource(z ? R$drawable.uikit_icn_24_captions_on : R$drawable.uikit_icn_24_captions);
    }

    public final void g0(e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f57515m = state;
        getButtonPlay().setImageResource(state.a());
    }

    @Override // nu0.i
    public int getMaxProgress() {
        return getSeekBar().getMax();
    }

    @Override // nu0.i
    /* JADX INFO: renamed from: getScrollingForwardEnabled, reason: from getter */
    public boolean getF57516n() {
        return this.f57516n;
    }

    @Override // nu0.i
    public void setProgress(int progress) {
        getSeekBar().setProgress(progress);
    }

    @Override // nu0.i
    public void setSubtitlesShowingState(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f57514l.onNext(state);
    }

    @Override // nu0.i
    public void setTimeText(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        c.b(u.k(this).b0(), clause, getTimeTextView(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RichVideoPlayerControlsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichVideoPlayerControlsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonPlay = a.J(R$id.richVideoPlayerControls_buttonPlay, this);
        this.buttonCaptions = a.J(R$id.richVideoPlayerControls_buttonCaptions, this);
        this.timeTextView = a.J(R$id.richVideoPlayerControls_time, this);
        this.seekBar = a.J(R$id.richVideoPlayerControls_seekBar, this);
        this.i = v0.a.d("create(...)");
        this.f57513j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        b bVarE = b.e(h.ACTIVE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f57514l = bVarE;
        this.f57515m = e.PLAY;
        this.f57516n = true;
        View.inflate(context, R$layout.internal_view_rich_video_player_controls, this);
        setPadding(a.w(R$attr.uikit_dp16, context), a.w(R$attr.uikit_dp24, context), a.w(R$attr.uikit_dp16, context), a.w(R$attr.uikit_dp24, context));
        final int i2 = 0;
        getButtonCaptions().setOnClickListener(new View.OnClickListener(this) { // from class: nu0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichVideoPlayerControlsView f219189b;

            {
                this.f219189b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f219189b.i.onNext(Unit.f186387a);
                        break;
                    default:
                        RichVideoPlayerControlsView richVideoPlayerControlsView = this.f219189b;
                        richVideoPlayerControlsView.f57513j.onNext(richVideoPlayerControlsView.f57515m);
                        break;
                }
            }
        });
        final int i3 = 1;
        getButtonPlay().setOnClickListener(new View.OnClickListener(this) { // from class: nu0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RichVideoPlayerControlsView f219189b;

            {
                this.f219189b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f219189b.i.onNext(Unit.f186387a);
                        break;
                    default:
                        RichVideoPlayerControlsView richVideoPlayerControlsView = this.f219189b;
                        richVideoPlayerControlsView.f57513j.onNext(richVideoPlayerControlsView.f57515m);
                        break;
                }
            }
        });
        getSeekBar().setOnSeekBarChangeListener(new p(this));
    }

    public /* synthetic */ RichVideoPlayerControlsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
