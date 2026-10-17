package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatVoiceMessageBubbleDelegate;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.internal.views.chat.WaveformSeekBarView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import et0.a1;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kp0.f1;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends a implements oo0.c, a1 {
    public oo0.a A;
    public RevolutShimmerDrawable B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final ConstraintLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oo0.d f53987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnimatedImageSwitcher f53988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AnimatedImageSwitcher f53989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WaveformSeekBarView f53990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f53991t;
    public final TextView u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fp0.p f53992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fp0.p f53993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f53994y;
    public kotlin.time.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ChatSwipeToReplyLayout itemView, ConstraintLayout contentView, oo0.d player) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(player, "player");
        this.o = contentView;
        this.f53987p = player;
        View viewFindViewById = contentView.findViewById(R$id.chatVoiceMessage_imageSwitcher);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AnimatedImageSwitcher animatedImageSwitcher = (AnimatedImageSwitcher) viewFindViewById;
        this.f53988q = animatedImageSwitcher;
        View viewFindViewById2 = contentView.findViewById(R$id.chatVoiceMessage_endImageSwitcher);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AnimatedImageSwitcher animatedImageSwitcher2 = (AnimatedImageSwitcher) viewFindViewById2;
        this.f53989r = animatedImageSwitcher2;
        View viewFindViewById3 = contentView.findViewById(R$id.chatVoiceMessage_waveformSeekbarView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f53990s = (WaveformSeekBarView) viewFindViewById3;
        View viewFindViewById4 = contentView.findViewById(R$id.chatVoiceMessage_durationTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f53991t = (TextView) viewFindViewById4;
        View viewFindViewById5 = contentView.findViewById(R$id.chatVoiceMessage_timestampTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.u = (TextView) viewFindViewById5;
        View viewFindViewById6 = contentView.findViewById(R$id.chatVoiceMessage_transcriptTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.v = (TextView) viewFindViewById6;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.f53992w = fp0.m.a(animatedImageSwitcher, gVar);
        this.f53993x = fp0.m.a(animatedImageSwitcher2, new gp0.g(0));
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.C = kli.a.k(context, 4.0f);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.D = kli.a.k(context2, 8.0f);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.E = kli.a.k(context3, 12.0f);
        Context context4 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.F = kli.a.k(context4, 14.0f);
        Context context5 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.G = kli.a.s(R$attr.uikit_colorGreyTone20, context5);
        Context context6 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.H = kli.a.s(R$attr.uikit_colorGreyTone50, context6);
        Context context7 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        animatedImageSwitcher.setBackground(dr0.l.c(context7, new Color.Solid(R$attr.uikit_colorGreyTone20)));
        animatedImageSwitcher.setInAnimation(oq0.a.a());
        animatedImageSwitcher.setOutAnimation(oq0.a.b());
        animatedImageSwitcher2.setInAnimation(oq0.a.a());
        animatedImageSwitcher2.setOutAnimation(oq0.a.b());
    }

    @Override // oo0.c
    public final void A(Uri uri2, oo0.a status, long j2, long j3) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(status, "status");
        koi.j jVar = this.e;
        ChatVoiceMessageBubbleDelegate.Model model = jVar instanceof ChatVoiceMessageBubbleDelegate.Model ? (ChatVoiceMessageBubbleDelegate.Model) jVar : null;
        if (model == null) {
            return;
        }
        this.f53990s.setProgress(j2);
        P(model.f53931c, j2, status);
        if (this.A != status) {
            O(model.f, status);
        }
        this.A = status;
    }

    @Override // et0.a1
    public final void B(long j2) {
        M(j2, false);
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.o;
    }

    public final void M(long j2, boolean z) {
        koi.j jVar = this.e;
        ChatVoiceMessageBubbleDelegate.Model model = jVar instanceof ChatVoiceMessageBubbleDelegate.Model ? (ChatVoiceMessageBubbleDelegate.Model) jVar : null;
        if (model == null) {
            return;
        }
        Uri uri2 = model.e;
        oo0.k kVar = (oo0.k) this.f53987p;
        oo0.b bVarD = kVar.d(uri2);
        P(model.f53931c, bVarD.f226972b, bVarD.f226971a);
        if (z) {
            kVar.h(uri2, j2);
        }
    }

    public final void N(oo0.d player, Uri uri2) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        if (this.f53994y || !this.itemView.isAttachedToWindow()) {
            return;
        }
        this.f53994y = true;
        ((oo0.k) player).a(uri2, this);
    }

    public final void O(ChatBubbleDelegate.c style, oo0.a status) {
        Image animatedResourceImage;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(status, "status");
        Context context = this.itemView.getContext();
        int iB = style.b();
        int i = f1.f188002a[status.ordinal()];
        if (i == 1) {
            animatedResourceImage = new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 8, (Clause) null, Integer.valueOf(iB));
        } else if (i == 2 || i == 3 || i == 4) {
            animatedResourceImage = new ResourceImage(R$drawable.uikit_icn_24_play, (Integer) null, (Integer) null, Integer.valueOf(iB), (List) null, (ImageTransformations) null, (Clause) null, 246);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            animatedResourceImage = new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, Integer.valueOf(iB), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        Intrinsics.h(context);
        int iS = kli.a.s(style.a(), context);
        AnimatedImageSwitcher animatedImageSwitcher = this.f53988q;
        knm.b.A(iS, animatedImageSwitcher);
        animatedImageSwitcher.setImage(animatedResourceImage);
    }

    public final void P(long j2, long j3, oo0.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status != oo0.a.ABSENT) {
            WaveformSeekBarView waveformSeekBarView = this.f53990s;
            if (waveformSeekBarView.f56866l) {
                b.Companion companion = kotlin.time.b.INSTANCE;
                j2 = kotlin.time.c.h(waveformSeekBarView.getF56867m(), pkm.e.MILLISECONDS);
            } else {
                b.Companion companion2 = kotlin.time.b.INSTANCE;
                j2 = kotlin.time.c.h(j3, pkm.e.MILLISECONDS);
            }
        }
        kotlin.time.b bVar = this.z;
        if (bVar != null) {
            b.Companion companion3 = kotlin.time.b.INSTANCE;
            pkm.e eVar = pkm.e.SECONDS;
            if (kotlin.time.b.n(j2, eVar) == kotlin.time.b.n(bVar.f187924a, eVar)) {
                return;
            }
        }
        this.z = new kotlin.time.b(j2);
        long jN = kotlin.time.b.n(j2, pkm.e.MINUTES);
        int iJ = kotlin.time.b.j(j2);
        kotlin.time.b.i(j2);
        String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jN), Integer.valueOf(iJ)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f53991t.setText(str);
    }

    @Override // et0.a1
    public final void g(long j2) {
        M(j2, true);
    }
}
