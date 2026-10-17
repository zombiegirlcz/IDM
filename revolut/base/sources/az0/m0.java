package az0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceResource;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements yy0.d {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11328a = te0.w.y0(new af0.a(3));

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static p0 g(LottieAnimationView lottieAnimationView) {
        Object tag2 = lottieAnimationView.getTag(R$id.internal_view_tag_lottie);
        if (tag2 instanceof p0) {
            return (p0) tag2;
        }
        return null;
    }

    public static void h(LottieAnimationView lottieAnimationView, LottieImage lottieImage) {
        List<LottieColorOverride> listE0;
        Object n0Var;
        int i = 2;
        lottieAnimationView.addValueCallback(new k7.f("**"), d7.f0.I, new a5.a(i));
        Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LottieImage.ColorOverride colorOverrideA = b01.a.a(lottieImage);
        if (colorOverrideA instanceof LottieImage.ColorOverride.Explicit) {
            listE0 = ((LottieImage.ColorOverride.Explicit) colorOverrideA).getF59960a();
        } else if (colorOverrideA instanceof LottieImage.ColorOverride.TintedWithAttr) {
            LottieImage.ColorOverride.TintedWithAttr tintedWithAttr = (LottieImage.ColorOverride.TintedWithAttr) colorOverrideA;
            listE0 = zhm.u.c(new LottieColorOverride(zhm.u.c("**"), new Color.Solid(tintedWithAttr.getF59962a()), tintedWithAttr.getF59963b(), null, 8));
        } else if (colorOverrideA instanceof LottieImage.ColorOverride.TintedConfetti) {
            listE0 = zhm.d0.E0(((LottieImage.ColorOverride.TintedConfetti) colorOverrideA).getF59961a(), fx0.b.a(context));
        } else {
            if (colorOverrideA != null) {
                throw new NoWhenBranchMatchedException();
            }
            listE0 = null;
        }
        Object tag2 = lottieAnimationView.getTag(R$id.internal_view_tag_lottie_opacity_key_paths);
        List list = tag2 instanceof List ? (List) tag2 : null;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String[] strArr = (String[]) ((List) it8.next()).toArray(new String[0]);
            k7.f fVar = new k7.f((String[]) Arrays.copyOf(strArr, strArr.length));
            PointF pointF = d7.f0.f111651a;
            lottieAnimationView.addValueCallback(fVar, 3, new a5.a(i));
        }
        List list2 = listE0 == null ? zhm.f0.f322471a : listE0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (((LottieColorOverride) obj2).d != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(cj9.c.x((LottieColorOverride) it9.next()));
        }
        List listU = zhm.d0.U(arrayList2);
        if (listE0 != null) {
            for (LottieColorOverride lottieColorOverride : listE0) {
                String[] strArr2 = (String[]) lottieColorOverride.f59952a.toArray(new String[0]);
                k7.f fVar2 = new k7.f((String[]) Arrays.copyOf(strArr2, strArr2.length));
                Context context2 = lottieAnimationView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iC = io0.a.c(context2, lottieColorOverride.f59953b);
                int i2 = n0.f11333a[lottieColorOverride.f59954c.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    n0Var = new d7.n0(iC);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n0Var = new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN);
                }
                lottieAnimationView.addValueCallback(fVar2, d7.f0.I, new ag.j(n0Var, i3));
                Float f = lottieColorOverride.d;
                if (f != null) {
                    final float fFloatValue = f.floatValue();
                    lottieAnimationView.addValueCallback(cj9.c.w(lottieColorOverride), 3, new s7.e() { // from class: az0.j0
                        @Override // s7.e
                        public final Object getValue() {
                            return Integer.valueOf(rim.d.c(fFloatValue * 100));
                        }
                    });
                }
            }
        }
        lottieAnimationView.setTag(R$id.internal_view_tag_lottie_opacity_key_paths, listU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [az0.l0, d7.d0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [az0.k0, d7.d0] */
    @Override // yy0.d
    public final void a(Image image, ImageView to6, final Function1 function1, final Function0 function0) throws IllegalAccessException, NoSuchFieldException {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        final LottieAnimationView lottieAnimationView = to6 instanceof LottieAnimationView ? (LottieAnimationView) to6 : null;
        if (lottieAnimationView == null) {
            throw new IllegalStateException("Only Lottie Animation View is supported");
        }
        final LottieImage lottieImage = image instanceof LottieImage ? (LottieImage) image : null;
        if (lottieImage == null) {
            throw new IllegalStateException("Only Lottie image is supported");
        }
        Integer num = lottieImage.d;
        if (num != null) {
            int iIntValue = num.intValue();
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) to6;
            ViewGroup.LayoutParams layoutParams = lottieAnimationView2.getLayoutParams();
            Context context = lottieAnimationView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.height = kli.a.k(context, iIntValue);
            lottieAnimationView2.setLayoutParams(layoutParams);
        }
        ImageView.ScaleType scaleType = lottieImage.e;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
        }
        p0 p0VarG = g(lottieAnimationView);
        if (p0VarG != null) {
            d7.i0 i0VarD = p0VarG.d();
            d7.d0 d0VarB = p0VarG.b();
            synchronized (i0VarD) {
                i0VarD.f111675b.remove(d0VarB);
            }
            d7.i0 i0VarD2 = p0VarG.d();
            d7.d0 d0VarC = p0VarG.c();
            synchronized (i0VarD2) {
                i0VarD2.f111674a.remove(d0VarC);
            }
            ValueAnimator valueAnimatorA = p0VarG.a();
            if (valueAnimatorA != null) {
                valueAnimatorA.cancel();
            }
            lottieAnimationView.setTag(R$id.internal_view_tag_lottie, null);
        } else {
            com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(((LottieAnimationView) to6).getContext());
            nVarD.getClass();
            a0.d.z(to6, nVarD);
        }
        if (lottieImage.f59957c) {
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
        } else {
            lottieAnimationView.setRepeatCount(0);
        }
        LottieSource lottieSource = lottieImage.f59955a;
        if (!(lottieSource instanceof SourceUrl)) {
            if (!(lottieSource instanceof SourceResource)) {
                throw new NoWhenBranchMatchedException();
            }
            lottieAnimationView.setAnimation(((SourceResource) lottieSource).f60006a);
            h(lottieAnimationView, lottieImage);
            if (lottieImage.f59956b) {
                Field declaredField = LottieAnimationView.class.getDeclaredField("autoPlay");
                declaredField.setAccessible(true);
                declaredField.setBoolean(lottieAnimationView, true);
                lottieAnimationView.playAnimation();
            }
            if (function1 != null) {
                function1.invoke(lottieAnimationView.getDrawable());
                return;
            }
            return;
        }
        SourceUrl sourceUrl = (SourceUrl) lottieSource;
        lottieAnimationView.setCacheComposition(true);
        String strH = cj9.c.H(sourceUrl.f60007a);
        Integer num2 = sourceUrl.f60008b;
        if (num2 != null) {
            lottieAnimationView.setImageResource(num2.intValue());
        }
        final boolean z = lottieAnimationView.getComposition() == null;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ?? r2 = new d7.d0() { // from class: az0.k0
            /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // d7.d0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResult(java.lang.Object r12) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
                /*
                    Method dump skipped, instruction units count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: az0.k0.onResult(java.lang.Object):void");
            }
        };
        ?? r102 = new d7.d0(this) { // from class: az0.l0
            @Override // d7.d0
            public final void onResult(Object obj2) {
                ValueAnimator valueAnimator;
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                LottieAnimationView lottieAnimationView3 = lottieAnimationView;
                p0 p0VarG2 = m0.g(lottieAnimationView3);
                if (p0VarG2 != null && (valueAnimator = p0VarG2.e) != null) {
                    valueAnimator.cancel();
                }
                lottieAnimationView3.setTag(R$id.internal_view_tag_lottie, null);
                Function0 function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
        d7.i0 i0VarH = d7.n.h(lottieAnimationView.getContext(), strH);
        i0VarH.b(r2);
        i0VarH.a(r102);
        ref$BooleanRef.f186407a = true;
        lottieAnimationView.setTag(R$id.internal_view_tag_lottie, new p0(strH, i0VarH, r2, r102));
    }

    @Override // yy0.d
    public final void b(ImageView imageView) {
        p0 p0VarG;
        ValueAnimator valueAnimatorA;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        LottieAnimationView lottieAnimationView = imageView instanceof LottieAnimationView ? (LottieAnimationView) imageView : null;
        if (lottieAnimationView != null && (p0VarG = g(lottieAnimationView)) != null && (valueAnimatorA = p0VarG.a()) != null) {
            valueAnimatorA.cancel();
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        if (lottieAnimationView != null) {
            Object tag2 = lottieAnimationView.getTag(R$id.internal_view_tag_lottie_opacity_key_paths);
            List list = tag2 instanceof List ? (List) tag2 : null;
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                String[] strArr = (String[]) ((List) it8.next()).toArray(new String[0]);
                k7.f fVar = new k7.f((String[]) Arrays.copyOf(strArr, strArr.length));
                PointF pointF = d7.f0.f111651a;
                lottieAnimationView.addValueCallback(fVar, 3, new a0.b(19));
            }
            lottieAnimationView.setTag(R$id.internal_view_tag_lottie_opacity_key_paths, null);
        }
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(imageView.getContext());
        nVarD.getClass();
        a0.d.z(imageView, nVarD);
    }

    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof LottieImage;
    }
}
