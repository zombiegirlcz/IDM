package com.revolut.core.ui_kit.chat.background;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.chat.background.AirChatBackgroundView;
import com.revolut.core.ui_kit_resources.R$attr;
import d7.d0;
import d7.j;
import d7.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny0.i;
import org.jetbrains.annotations.NotNull;
import yo0.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/chat/background/AirChatBackgroundView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyo0/a;", "state", "", "setStaticState", "(Lyo0/a;)V", "", "enabled", "setDeferredMode", "(Z)V", "setState", "Companion", "a", "ui_kit_chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirChatBackgroundView extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f51524l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieAnimationView f51525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f51526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f51527c;
    public yo0.a d;
    public boolean e;
    public yo0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f51528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f51529h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f51530j;
    public final boolean k;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AirChatBackgroundView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setStaticState(yo0.a state) {
        ValueAnimator valueAnimator = this.f51528g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f51529h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        int i = d.f315509a[state.ordinal()];
        if (i == 1) {
            c(1.0f);
            a(1.0f);
            b(BitmapDescriptorFactory.HUE_RED);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c(BitmapDescriptorFactory.HUE_RED);
            a(BitmapDescriptorFactory.HUE_RED);
            b(1.0f);
        }
    }

    public final void a(float f) {
        this.f51530j = f;
        boolean z = this.k;
        LottieAnimationView lottieAnimationView = this.f51527c;
        if (z) {
            lottieAnimationView.setProgress(f);
        } else {
            lottieAnimationView.setAlpha(f);
        }
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            if (lottieAnimationView.getVisibility() != 4) {
                lottieAnimationView.setVisibility(4);
            }
        } else if (lottieAnimationView.getVisibility() != 0) {
            lottieAnimationView.setVisibility(0);
        }
    }

    public final void b(float f) {
        LottieAnimationView lottieAnimationView = this.f51525a;
        lottieAnimationView.setAlpha(f);
        if (f > BitmapDescriptorFactory.HUE_RED) {
            if (lottieAnimationView.getVisibility() != 0) {
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.playAnimation();
                return;
            }
            return;
        }
        if (lottieAnimationView.getVisibility() != 4) {
            lottieAnimationView.setVisibility(4);
            lottieAnimationView.cancelAnimation();
        }
    }

    public final void c(float f) {
        LottieAnimationView lottieAnimationView = this.f51526b;
        lottieAnimationView.setAlpha(f);
        if (f > BitmapDescriptorFactory.HUE_RED) {
            if (lottieAnimationView.getVisibility() != 0) {
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.pauseAnimation();
                return;
            }
            return;
        }
        if (lottieAnimationView.getVisibility() != 4) {
            lottieAnimationView.setVisibility(4);
            lottieAnimationView.cancelAnimation();
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (!z || this.i) {
            return;
        }
        this.i = true;
        boolean z3 = this.k;
        String str = z3 ? "air_background_v3.json" : "air_background.json";
        String strConcat = "https://assets.revolut.com/mobile/cx/animations/".concat(z3 ? "dark" : "light");
        final int i = 0;
        n.h(getContext(), strConcat + "/" + str).b(new d0(this) { // from class: yo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirChatBackgroundView f315508b;

            {
                this.f315508b = this;
            }

            @Override // d7.d0
            public final void onResult(Object obj2) {
                j jVar = (j) obj2;
                switch (i) {
                    case 0:
                        this.f315508b.f51526b.setComposition(jVar);
                        break;
                    case 1:
                        this.f315508b.f51525a.setComposition(jVar);
                        break;
                    default:
                        this.f315508b.f51527c.setComposition(jVar);
                        break;
                }
            }
        });
        final int i2 = 1;
        n.h(getContext(), strConcat + "/air_sphere.json").b(new d0(this) { // from class: yo0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirChatBackgroundView f315508b;

            {
                this.f315508b = this;
            }

            @Override // d7.d0
            public final void onResult(Object obj2) {
                j jVar = (j) obj2;
                switch (i2) {
                    case 0:
                        this.f315508b.f51526b.setComposition(jVar);
                        break;
                    case 1:
                        this.f315508b.f51525a.setComposition(jVar);
                        break;
                    default:
                        this.f315508b.f51527c.setComposition(jVar);
                        break;
                }
            }
        });
        if (!z3) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f51527c.setBackgroundColor(kli.a.s(R$attr.uikit_windowBackground, context));
        } else {
            final int i3 = 2;
            n.h(getContext(), strConcat + "/air_sphere_transition.json").b(new d0(this) { // from class: yo0.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AirChatBackgroundView f315508b;

                {
                    this.f315508b = this;
                }

                @Override // d7.d0
                public final void onResult(Object obj2) {
                    j jVar = (j) obj2;
                    switch (i3) {
                        case 0:
                            this.f315508b.f51526b.setComposition(jVar);
                            break;
                        case 1:
                            this.f315508b.f51525a.setComposition(jVar);
                            break;
                        default:
                            this.f315508b.f51527c.setComposition(jVar);
                            break;
                    }
                }
            });
        }
    }

    public final void setDeferredMode(boolean enabled) {
        yo0.a aVar;
        if (enabled == this.e) {
            return;
        }
        this.e = enabled;
        if (enabled || (aVar = this.f) == null) {
            return;
        }
        this.f = null;
        setState(aVar);
    }

    public final void setState(@NotNull yo0.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.e) {
            this.f = state;
            return;
        }
        yo0.a aVar = this.d;
        if (aVar == state) {
            return;
        }
        this.d = state;
        ValueAnimator valueAnimator = this.f51528g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f51529h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (aVar == null || !isLaidOut()) {
            setStaticState(state);
            return;
        }
        float f = this.f51530j;
        float alpha = this.f51526b.getAlpha();
        final int i = 0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) { // from class: yo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirChatBackgroundView f315506b;

            {
                this.f315506b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i2 = i;
                AirChatBackgroundView airChatBackgroundView = this.f315506b;
                switch (i2) {
                    case 0:
                        int i3 = AirChatBackgroundView.f51524l;
                        float fFloatValue = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        airChatBackgroundView.a(fFloatValue);
                        airChatBackgroundView.b(fFloatValue < 0.95f ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                        break;
                    default:
                        int i5 = AirChatBackgroundView.f51524l;
                        airChatBackgroundView.c(((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: yo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirChatBackgroundView f315506b;

            {
                this.f315506b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i22 = i2;
                AirChatBackgroundView airChatBackgroundView = this.f315506b;
                switch (i22) {
                    case 0:
                        int i3 = AirChatBackgroundView.f51524l;
                        float fFloatValue = ((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        airChatBackgroundView.a(fFloatValue);
                        airChatBackgroundView.b(fFloatValue < 0.95f ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                        break;
                    default:
                        int i5 = AirChatBackgroundView.f51524l;
                        airChatBackgroundView.c(((Float) z9h.n.g(valueAnimator3, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                        break;
                }
            }
        };
        if (state != yo0.a.TOP_GLOW) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
            valueAnimatorOfFloat.start();
            this.f51528g = valueAnimatorOfFloat;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(alpha, BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat2.setDuration(420L);
            valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener2);
            valueAnimatorOfFloat2.start();
            this.f51529h = valueAnimatorOfFloat2;
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f, 1.0f);
        valueAnimatorOfFloat3.setDuration(600L);
        valueAnimatorOfFloat3.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat3.start();
        this.f51528g = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(alpha, 1.0f);
        valueAnimatorOfFloat4.setDuration(600L);
        valueAnimatorOfFloat4.setStartDelay(180L);
        valueAnimatorOfFloat4.addUpdateListener(animatorUpdateListener2);
        valueAnimatorOfFloat4.start();
        this.f51529h = valueAnimatorOfFloat4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AirChatBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirChatBackgroundView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.f51525a = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(context);
        this.f51526b = lottieAnimationView2;
        LottieAnimationView lottieAnimationView3 = new LottieAnimationView(context);
        this.f51527c = lottieAnimationView3;
        this.k = kli.a.q(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        lottieAnimationView.setLayoutParams(layoutParams);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        lottieAnimationView.setScaleType(scaleType);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setVisibility(4);
        lottieAnimationView3.setLayoutParams(layoutParams);
        lottieAnimationView3.setScaleType(scaleType);
        lottieAnimationView3.setRepeatCount(0);
        lottieAnimationView3.setVisibility(4);
        lottieAnimationView2.setLayoutParams(layoutParams);
        lottieAnimationView2.setScaleType(scaleType);
        lottieAnimationView2.setRepeatCount(-1);
        lottieAnimationView2.setVisibility(4);
        addView(lottieAnimationView);
        addView(lottieAnimationView3);
        addView(lottieAnimationView2);
        i.e(this);
    }

    public /* synthetic */ AirChatBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
