package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import aw0.o;
import aw0.p;
import aw0.r;
import aw0.s;
import aw0.t;
import aw0.v;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import e8.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 p2\u00020\u0001:\u0001qB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\f2\u0006\u0010#\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b<\u0010\u0019R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010NR\u001b\u0010R\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010IR\u001b\u0010U\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010IR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010G\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010G\u001a\u0004\b]\u0010^R\u001b\u0010b\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010G\u001a\u0004\ba\u0010IR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010G\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010G\u001a\u0004\bj\u0010kR\u001b\u0010o\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010G\u001a\u0004\bn\u0010I¨\u0006r"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/AppTipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setCloseIconClickListener", "setDetailsLinkClickListener", "setActionClickListener", "Law0/u;", "label", "setLabel", "(Law0/u;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "subtitle", "setSubtitle", "Law0/t;", "icon", "setIcon", "(Law0/t;)V", "", "id", "Law0/p;", "footer", "setFooter", "(Ljava/lang/String;Law0/p;)V", "", "widthDp", "setMinSubtitleWidth", "(F)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "setStaticIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;", "setAnimatedIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;)V", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "avatarModel", "setAvatar", "(Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;)V", "Law0/v;", "detailsLinkLocation", "setDetailsLinkLocation", "(Law0/v;)V", "Law0/n;", "setAction", "(Law0/n;)V", "paging", "setPagingClause", "Lcom/revolut/core/ui_kit/models/AppTipUIModel;", "b", "Lcom/revolut/core/ui_kit/models/AppTipUIModel;", "getBoundModel", "()Lcom/revolut/core/ui_kit/models/AppTipUIModel;", "setBoundModel", "(Lcom/revolut/core/ui_kit/models/AppTipUIModel;)V", "boundModel", "Landroidx/appcompat/widget/AppCompatTextView;", "f", "Le8/q;", "getLabelTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "labelTextView", "Landroid/widget/ImageView;", "g", "getLabelIconView", "()Landroid/widget/ImageView;", "labelIconView", "h", "getTitleView", "titleView", "i", "getSubtitleView", "subtitleView", "Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "j", "getIconView", "()Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "iconView", "Lcom/revolut/core/ui_kit/views/AvatarView;", "k", "getIconAvatar", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "iconAvatar", "l", "getDetailsLinkView", "detailsLinkView", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "m", "getActionButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "actionButton", "Landroid/view/View;", "n", "getCloseIconView", "()Landroid/view/View;", "closeIconView", "o", "getPagingView", "pagingView", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppTipView extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public AppTipUIModel boundModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q labelTextView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q labelIconView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q titleView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q subtitleView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q iconView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q iconAvatar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q detailsLinkView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q actionButton;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q closeIconView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q pagingView;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppTipView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SmallActionButton getActionButton() {
        return (SmallActionButton) this.actionButton.f();
    }

    private final View getCloseIconView() {
        return this.closeIconView.f();
    }

    private final AppCompatTextView getDetailsLinkView() {
        return (AppCompatTextView) this.detailsLinkView.f();
    }

    private final AvatarView getIconAvatar() {
        return (AvatarView) this.iconAvatar.f();
    }

    private final UiKitMediaView getIconView() {
        return (UiKitMediaView) this.iconView.f();
    }

    private final ImageView getLabelIconView() {
        return (ImageView) this.labelIconView.f();
    }

    private final AppCompatTextView getLabelTextView() {
        return (AppCompatTextView) this.labelTextView.f();
    }

    private final AppCompatTextView getPagingView() {
        return (AppCompatTextView) this.pagingView.f();
    }

    private final AppCompatTextView getSubtitleView() {
        return (AppCompatTextView) this.subtitleView.f();
    }

    private final AppCompatTextView getTitleView() {
        return (AppCompatTextView) this.titleView.f();
    }

    private final void setAction(aw0.n footer) {
        getPagingView().setVisibility(8);
        getDetailsLinkView().setVisibility(8);
        getActionButton().setVisibility(0);
        getActionButton().setText(footer.f10430a);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 16.0f);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(R$id.appTip_actionButton, 6, 0, 6, iK);
        constraintSet.applyTo(this);
        u.z(getActionButton(), 0, iK2, 0, 0, false, 29);
        getActionButton().i(h4.SEMIACCENT);
    }

    private final void setAnimatedIcon(LottieImage icon) {
        UiKitMediaView iconView = getIconView();
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context = getIconView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.width = kli.a.k(context, 40.0f);
        Context context2 = getIconView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.height = kli.a.k(context2, 48.0f);
        iconView.setLayoutParams(layoutParams);
        ((jz0.b) u.k(getIconView()).a0()).b(icon, getIconView(), null);
    }

    private final void setAvatar(AvatarModel avatarModel) {
        getIconAvatar().setModel(avatarModel);
    }

    private final void setDetailsLinkLocation(v detailsLinkLocation) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        int i = ms0.d.f208216a[detailsLinkLocation.ordinal()];
        if (i == 1) {
            constraintSet.clear(R$id.appTip_detailsLink, 7);
            constraintSet.connect(R$id.appTip_detailsLink, 6, R$id.appTip_subtitle, 6, 0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            constraintSet.clear(R$id.appTip_detailsLink, 6);
            constraintSet.connect(R$id.appTip_detailsLink, 7, R$id.appTip_subtitle, 7, 0);
        }
        constraintSet.connect(R$id.appTip_detailsLink, 3, R$id.appTip_subtitle, 4);
        constraintSet.connect(R$id.appTip_detailsLink, 4, 0, 4);
        constraintSet.applyTo(this);
    }

    private final void setPagingClause(Clause paging) {
        kli.a.b(getPagingView(), paging, ty0.f.f275450a);
    }

    private final void setStaticIcon(Image icon) {
        UiKitMediaView iconView = getIconView();
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context = getIconView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.width = kli.a.k(context, 40.0f);
        Context context2 = getIconView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.height = kli.a.k(context2, 40.0f);
        iconView.setLayoutParams(layoutParams);
        ((jz0.b) u.k(getIconView()).a0()).b(icon, getIconView(), null);
    }

    public final void f0() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 12.0f);
        u.z(getCloseIconView(), 0, iK, iK, 0, false, 25);
    }

    public final AppTipUIModel getBoundModel() {
        return this.boundModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppTipUIModel appTipUIModel = this.boundModel;
        if (appTipUIModel != null) {
            ((ihm.f) xv0.b.f309146a.getValue()).onNext(appTipUIModel);
        }
    }

    public final void setActionClickListener(View.OnClickListener listener) {
        if (listener == null) {
            u.o(getActionButton());
            return;
        }
        AppTipUIModel appTipUIModel = this.boundModel;
        p pVar = appTipUIModel != null ? appTipUIModel.f : null;
        TextClause textClause = pVar instanceof aw0.n ? ((aw0.n) pVar).f10430a : null;
        py0.c cVar = textClause != null ? new py0.c(textClause) : null;
        SmallActionButton actionButton = getActionButton();
        TrackableItem.Companion companion = TrackableItem.INSTANCE;
        AppTipUIModel appTipUIModel2 = this.boundModel;
        Parcelable parcelable = appTipUIModel2 != null ? appTipUIModel2.f57730j : null;
        companion.getClass();
        u.s(actionButton, TrackableItem.Companion.a(this, parcelable), cVar, listener);
    }

    public final void setBoundModel(AppTipUIModel appTipUIModel) {
        this.boundModel = appTipUIModel;
    }

    public final void setCloseIconClickListener(View.OnClickListener listener) {
        getCloseIconView().setOnClickListener(listener == null ? null : new ms0.e(listener, this, 0));
    }

    public final void setDetailsLinkClickListener(View.OnClickListener listener) {
        if (listener == null) {
            u.o(getDetailsLinkView());
            return;
        }
        AppTipUIModel appTipUIModel = this.boundModel;
        p pVar = appTipUIModel != null ? appTipUIModel.f : null;
        TextLocalisedClause textLocalisedClause = pVar instanceof o ? ((o) pVar).f10442a : null;
        py0.c cVar = textLocalisedClause != null ? new py0.c(textLocalisedClause) : null;
        AppCompatTextView detailsLinkView = getDetailsLinkView();
        TrackableItem.Companion companion = TrackableItem.INSTANCE;
        AppTipUIModel appTipUIModel2 = this.boundModel;
        Parcelable parcelable = appTipUIModel2 != null ? appTipUIModel2.f57730j : null;
        companion.getClass();
        u.s(detailsLinkView, TrackableItem.Companion.a(this, parcelable), cVar, listener);
    }

    public final void setFooter(@NotNull String id10, p footer) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (!(footer instanceof o)) {
            if (footer instanceof aw0.n) {
                setAction((aw0.n) footer);
                return;
            } else {
                if (footer != null) {
                    throw new NoWhenBranchMatchedException();
                }
                getDetailsLinkView().setVisibility(8);
                getActionButton().setVisibility(8);
                getPagingView().setVisibility(8);
                return;
            }
        }
        o oVar = (o) footer;
        TextLocalisedClause textLocalisedClause = oVar.f10442a;
        CompositeClause compositeClause = textLocalisedClause != null ? new CompositeClause(zhm.u.c(textLocalisedClause), null, new Click(30, (Integer) null, (Object) null, id10, false), null, 10) : null;
        getDetailsLinkView().setClickable(textLocalisedClause != null);
        getDetailsLinkView().setOnTouchListener(new j01.e(new View[]{getDetailsLinkView()}));
        kli.a.b(getDetailsLinkView(), compositeClause, ty0.f.f275450a);
        setDetailsLinkLocation(oVar.f10443b);
        getActionButton().setVisibility(8);
        setPagingClause(null);
    }

    public final void setIcon(t icon) {
        boolean z;
        boolean z3 = icon instanceof s;
        if (z3) {
            setStaticIcon(((s) icon).f10517a);
        } else if (icon instanceof aw0.q) {
            setAnimatedIcon(((aw0.q) icon).f10477a);
        } else if (icon instanceof r) {
            setAvatar(((r) icon).f10499a);
        } else if (icon != null) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z4 = true;
        if (z3 || (icon instanceof aw0.q)) {
            z = false;
        } else if (icon instanceof r) {
            z = true;
            z4 = false;
        } else {
            if (icon != null) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
            z4 = false;
        }
        getIconView().setVisibility(z4 ? 0 : 8);
        getIconAvatar().setVisibility(z ? 0 : 8);
    }

    public final void setLabel(aw0.u label) {
        kli.a.b(getLabelTextView(), label != null ? label.f10552b : null, ty0.f.f275450a);
        Integer numValueOf = label != null ? Integer.valueOf(label.f10551a) : null;
        if (numValueOf != null) {
            getLabelIconView().setImageResource(numValueOf.intValue());
        }
        getLabelIconView().setVisibility(numValueOf != null ? 0 : 8);
    }

    public final void setMinSubtitleWidth(float widthDp) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        int i = R$id.appTip_subtitle;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintSet.constrainMinWidth(i, kli.a.k(context, widthDp));
        constraintSet.applyTo(this);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener == null ? null : new ms0.e(listener, this, 1));
    }

    public final void setSubtitle(@NotNull Clause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        kli.a.b(getSubtitleView(), subtitle, ty0.f.f275450a);
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        kli.a.b(getTitleView(), title, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppTipView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppTipView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.labelTextView = kli.a.J(R$id.appTip_labelText, this);
        this.labelIconView = kli.a.J(R$id.appTip_labelIcon, this);
        this.titleView = kli.a.J(R$id.appTip_title, this);
        this.subtitleView = kli.a.J(R$id.appTip_subtitle, this);
        this.iconView = kli.a.J(R$id.appTip_icon, this);
        this.iconAvatar = kli.a.J(R$id.appTip_avatar, this);
        this.detailsLinkView = kli.a.J(R$id.appTip_detailsLink, this);
        this.actionButton = kli.a.J(R$id.appTip_actionButton, this);
        this.closeIconView = kli.a.J(R$id.appTip_closeIcon, this);
        this.pagingView = kli.a.J(R$id.appTip_paging, this);
        View.inflate(context, R$layout.internal_view_app_tip, this);
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(getCloseIconView(), "getContext(...)", 8.0f);
        u.l(getCloseIconView(), iA, iA, iA, iA);
        getCloseIconView().setOnTouchListener(new j01.e(new View[]{getCloseIconView()}));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 8.0f);
        u.l(getDetailsLinkView(), iK, iK, iK, iK);
    }

    public /* synthetic */ AppTipView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
