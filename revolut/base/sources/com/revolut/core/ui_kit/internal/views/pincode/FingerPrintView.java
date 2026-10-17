package com.revolut.core.ui_kit.internal.views.pincode;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import aq0.k;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.pincode.FingerPrintView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import ihm.f;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.c;
import uc0.b;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001*B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/pincode/FingerPrintView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setLabelText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setBackActionText", "", "b", "Lkotlin/Lazy;", "getLongAnimationTime", "()J", "longAnimationTime", "c", "getMediumAnimationTime", "mediumAnimationTime", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "d", "Le8/q;", "getBackAction", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "backAction", "Landroid/widget/TextView;", "e", "getLabel", "()Landroid/widget/TextView;", "label", "Lcom/airbnb/lottie/LottieAnimationView;", "f", "getImage", "()Lcom/airbnb/lottie/LottieAnimationView;", "image", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FingerPrintView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f57446g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AnimatorSet f57447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f57448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f57449c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q backAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q image;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FingerPrintView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LargeActionButton getBackAction() {
        return (LargeActionButton) this.backAction.f();
    }

    private final LottieAnimationView getImage() {
        return (LottieAnimationView) this.image.f();
    }

    private final TextView getLabel() {
        return (TextView) this.label.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final long getLongAnimationTime() {
        return ((Number) this.f57448b.getValue()).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final long getMediumAnimationTime() {
        return ((Number) this.f57449c.getValue()).longValue();
    }

    public final f a() {
        return getBackAction().o;
    }

    public final void b() {
        AnimatorSet animatorSet = this.f57447a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(y.J(y.x(ViewGroupKt.getChildren(this), new isd.a(23))));
        animatorSet2.setDuration(getMediumAnimationTime());
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(getImage(), (Property<LottieAnimationView, Float>) View.SCALE_X, 1.0f, 10.0f), ObjectAnimator.ofFloat(getImage(), (Property<LottieAnimationView, Float>) View.SCALE_Y, 1.0f, 10.0f));
        animatorSet3.setDuration(getLongAnimationTime());
        animatorSet3.setInterpolator(new AnticipateInterpolator(1.2f));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet2, animatorSet3);
        animatorSet4.addListener(new k(this, 5));
        animatorSet4.start();
        this.f57447a = animatorSet4;
    }

    public final void setBackActionText(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        getBackAction().setText(clause);
    }

    public final void setLabelText(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        c.b(u.k(this).b0(), clause, getLabel(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FingerPrintView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FingerPrintView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        yhm.k kVar = yhm.k.NONE;
        final int i2 = 0;
        this.f57448b = j.c(kVar, new Function0(this) { // from class: iu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FingerPrintView f168444b;

            {
                this.f168444b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int integer;
                int i3 = i2;
                FingerPrintView fingerPrintView = this.f168444b;
                switch (i3) {
                    case 0:
                        int i5 = FingerPrintView.f57446g;
                        integer = fingerPrintView.getResources().getInteger(R.integer.config_longAnimTime);
                        break;
                    default:
                        int i6 = FingerPrintView.f57446g;
                        integer = fingerPrintView.getResources().getInteger(R.integer.config_mediumAnimTime);
                        break;
                }
                return Long.valueOf(integer);
            }
        });
        final int i3 = 1;
        this.f57449c = j.c(kVar, new Function0(this) { // from class: iu0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FingerPrintView f168444b;

            {
                this.f168444b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int integer;
                int i32 = i3;
                FingerPrintView fingerPrintView = this.f168444b;
                switch (i32) {
                    case 0:
                        int i5 = FingerPrintView.f57446g;
                        integer = fingerPrintView.getResources().getInteger(R.integer.config_longAnimTime);
                        break;
                    default:
                        int i6 = FingerPrintView.f57446g;
                        integer = fingerPrintView.getResources().getInteger(R.integer.config_mediumAnimTime);
                        break;
                }
                return Long.valueOf(integer);
            }
        });
        this.backAction = kli.a.J(R$id.FingerPrintView_backAction, this);
        this.label = kli.a.J(R$id.FingerPrintView_label, this);
        this.image = kli.a.J(R$id.FingerPrintView_image, this);
        setOrientation(1);
        setGravity(1);
        View.inflate(context, R$layout.internal_view_fingerprint_view, this);
        yy0.f.e(d.f(context).Q(), new LottieImage(b.a("mobile/onboarding/animations", "biometric_fingerprint"), R$attr.uikit_colorAccent, 222), getImage(), null, null, 12);
    }

    public /* synthetic */ FingerPrintView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
