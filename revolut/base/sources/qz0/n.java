package qz0;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PictureDrawable;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.drawables.ShimmerImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import e8.p;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import pjl.e0;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements j {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f250333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk0.a f250334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk0.c f250335c;
    public final Lazy d;

    public n(Context context, bk0.a aVar, bk0.c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f250333a = context;
        this.f250334b = aVar;
        this.f250335c = cVar;
        this.d = yhm.j.b(new qu1.d(25));
    }

    public static u8.h c(Context context, UrlImage urlImage, ImageView imageView) {
        c8.g eVar;
        Drawable shimmerImageDrawable;
        u8.a aVarG = new u8.h().g(p.f123507c);
        u8.h hVar = (u8.h) aVarG;
        UrlImageDrawable urlImageDrawable = urlImage.f60019c;
        if (urlImageDrawable != null) {
            ImageTransformations imageTransformations = urlImage.f60025n;
            if (urlImageDrawable instanceof UrlImageDrawable.ResDrawable) {
                UrlImageDrawable.ResDrawable resDrawable = (UrlImageDrawable.ResDrawable) urlImageDrawable;
                Drawable drawable = ContextCompat.getDrawable(context, resDrawable.getF60040a());
                Integer f60041b = resDrawable.getF60041b();
                shimmerImageDrawable = drawable;
                shimmerImageDrawable = drawable;
                if (drawable != null && f60041b != null) {
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.setTint(kli.a.s(f60041b.intValue(), context));
                    shimmerImageDrawable = drawableMutate;
                }
            } else if (urlImageDrawable instanceof UrlImageDrawable.Gradient) {
                UrlImageDrawable.Gradient gradient = (UrlImageDrawable.Gradient) urlImageDrawable;
                shimmerImageDrawable = new GradientDrawable(gradient.getF60038c(), new int[]{gradient.getF60036a(), gradient.getF60037b()});
            } else if (urlImageDrawable instanceof UrlImageDrawable.AnimatedGradientDrawable) {
                Drawable drawable2 = ContextCompat.getDrawable(context, R$drawable.internal_animated_gradient_background);
                Intrinsics.i(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) drawable2;
                animationDrawable.setEnterFadeDuration(300);
                animationDrawable.setExitFadeDuration(600);
                animationDrawable.start();
                shimmerImageDrawable = animationDrawable;
            } else if (urlImageDrawable instanceof UrlImageDrawable.ImagePlaceholder) {
                shimmerImageDrawable = imageView != null ? imageView.getDrawable() : null;
            } else {
                if (!(urlImageDrawable instanceof UrlImageDrawable.Shimmering)) {
                    throw new NoWhenBranchMatchedException();
                }
                UrlImageDrawable.Shimmering shimmering = (UrlImageDrawable.Shimmering) urlImageDrawable;
                if (shimmering instanceof UrlImageDrawable.Shimmering.Chip) {
                    imageTransformations = new ImageTransformations(null, new RoundedRectTransformation(12.0f), null, null, null, null, null, ISO781611.SMT_TAG);
                } else if (!(shimmering instanceof UrlImageDrawable.Shimmering.Companion)) {
                    if (!(shimmering instanceof UrlImageDrawable.Shimmering.Transformable)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (imageTransformations == null) {
                        imageTransformations = ((UrlImageDrawable.Shimmering.Transformable) urlImageDrawable).f60043a;
                    }
                }
                shimmerImageDrawable = new ShimmerImageDrawable(context, imageTransformations, 6);
            }
            if (shimmerImageDrawable != null) {
                hVar.y(shimmerImageDrawable);
            }
        }
        Intrinsics.checkNotNullExpressionValue(aVarG, "apply(...)");
        w.e(hVar, context, urlImage);
        String str = urlImage.f60017a;
        long j2 = urlImage.e;
        long j3 = urlImage.d;
        if (j2 != 0) {
            eVar = ue0.e.l(str, j2, j3);
        } else {
            Companion.getClass();
            eVar = new x8.e(String.valueOf(j3));
        }
        u8.a aVarE = hVar.E(eVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "signature(...)");
        return (u8.h) aVarE;
    }

    public final Object b(UrlImage urlImage, Boolean bool) {
        boolean zQ;
        String appTypeHeader;
        if (bool != null) {
            zQ = bool.booleanValue();
        } else {
            int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
            zQ = defaultNightMode != 1 ? defaultNightMode != 2 ? kli.a.q(this.f250333a) : true : false;
        }
        String str = zQ ? urlImage.f60018b : urlImage.f60017a;
        if (URLUtil.isNetworkUrl(str)) {
            UrlImage.CustomHeaders customHeaders = urlImage.f;
            boolean z = urlImage.k;
            boolean z3 = urlImage.f60023l;
            g gVar = null;
            bk0.c cVar = this.f250335c;
            Pair pair = (cVar == null || (appTypeHeader = ((bk0.e) cVar).f16210b.getAppTypeHeader()) == null) ? null : new Pair("X-App-Type", appTypeHeader);
            if (customHeaders != null || pair != null || z3) {
                gVar = new g(str, z3 ? this.f250334b : null, pair, customHeaders);
            }
            if (urlImage.f60024m) {
                i8.l lVar = gVar;
                if (gVar == null) {
                    lVar = i8.l.f159384a;
                }
                Intrinsics.h(lVar);
                return new rz0.d(str, lVar);
            }
            if (gVar != null && z) {
                return new f(str, gVar);
            }
            if (gVar != null && !z) {
                return new i8.k(str, gVar);
            }
        }
        return str;
    }

    public final ufm.n d(UrlImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ufm.c cVar = new ufm.c(new pu9.a(this, image, 11), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return w.i0(cVar);
    }

    public final void e(UrlImage image, ImageView to6, Function1 function1, Function0 function0) {
        n nVar;
        UrlImage urlImage;
        ImageView imageView;
        Function0 function02;
        com.bumptech.glide.j jVarT;
        com.bumptech.glide.j jVarO;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(to6, "to");
        String str = image.f60017a;
        Integer num = image.o;
        Context context = this.f250333a;
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = to6.getLayoutParams();
            layoutParams.height = kli.a.k(context, iIntValue);
            to6.setLayoutParams(layoutParams);
        }
        Integer num2 = image.f60026p;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            ViewGroup.LayoutParams layoutParams2 = to6.getLayoutParams();
            layoutParams2.width = kli.a.k(context, iIntValue2);
            to6.setLayoutParams(layoutParams2);
        }
        Context context2 = to6.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        u8.h hVarC = c(context2, image, to6);
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(to6.getContext());
        if (a0.y(str, ".svg", true)) {
            com.bumptech.glide.j jVarH = nVarD.h(PictureDrawable.class);
            Intrinsics.checkNotNullExpressionValue(jVarH, "as(...)");
            com.bumptech.glide.j jVarT2 = jVarH.T(new m(function0, function1));
            Intrinsics.checkNotNullExpressionValue(jVarT2, "listener(...)");
            Context context3 = to6.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            if (kli.a.q(context3)) {
                str = image.f60018b;
            }
            jVarT = jVarT2.a0(str);
            nVar = this;
            urlImage = image;
            imageView = to6;
        } else {
            try {
                Context context4 = to6.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                com.bumptech.glide.j jVarT3 = nVarD.t(b(image, Boolean.valueOf(kli.a.q(context4))));
                nVar = this;
                urlImage = image;
                imageView = to6;
                function02 = function0;
                try {
                    jVarT = jVarT3.T(new l(nVar, urlImage, imageView, function02, function1));
                } catch (Exception e) {
                    e = e;
                    Exception exc2 = e;
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, exc2, h0Var);
                    jVarT = null;
                }
            } catch (Exception e2) {
                e = e2;
                nVar = this;
                urlImage = image;
                imageView = to6;
                function02 = function0;
            }
            if (jVarT == null) {
                Integer num3 = urlImage.f60020g;
                if (num3 != null) {
                    imageView.setImageResource(num3.intValue());
                }
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }
        if (jVarT == null || (jVarO = jVarT.a(hVarC)) == null) {
            return;
        }
        if (urlImage.f60028r) {
            Object value = nVar.d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            jVarO.e0(n8.b.c((w8.a) value));
        }
        if (urlImage.f60027q) {
            u8.a aVarW = jVarO.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
            Intrinsics.h(aVarW);
            jVarO = (com.bumptech.glide.j) aVarW;
        }
        if (!hx0.f.a(context)) {
            jVarO.h();
        }
        jVarO.R(imageView);
    }

    public final pfm.h f(UrlImage urlImage, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(urlImage, "urlImage");
        Context context = this.f250333a;
        com.bumptech.glide.j jVarO = com.bumptech.glide.b.d(context).t(b(urlImage, null)).a(c(context, urlImage, null));
        if (z) {
            jVarO = (com.bumptech.glide.j) jVarO.q(true);
        }
        u8.a aVarG = jVarO.g(p.f123505a);
        Intrinsics.checkNotNullExpressionValue(aVarG, "diskCacheStrategy(...)");
        com.bumptech.glide.j jVar = (com.bumptech.glide.j) aVarG;
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        return uj3.b.t(i, i2, context, jVar);
    }

    public final void g(Context context, UrlImage image, int i, int i2, Function1 function1, Function0 function0) {
        com.bumptech.glide.j jVarB;
        String str = image.f60017a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        com.bumptech.glide.n nVarD = com.bumptech.glide.b.d(context);
        u8.h hVarC = c(context, image, null);
        e0 e0Var = new e0(i, i2, function1);
        try {
            if (a0.y(str, ".svg", true)) {
                com.bumptech.glide.j jVarH = nVarD.h(PictureDrawable.class);
                Intrinsics.checkNotNullExpressionValue(jVarH, "as(...)");
                com.bumptech.glide.j jVarT = jVarH.T(new m(function0, e0Var));
                Intrinsics.checkNotNullExpressionValue(jVarT, "listener(...)");
                if (kli.a.q(context)) {
                    str = image.f60018b;
                }
                jVarB = jVarT.a0(str);
            } else {
                com.bumptech.glide.j jVarT2 = nVarD.t(b(image, Boolean.valueOf(kli.a.q(context))));
                Intrinsics.checkNotNullExpressionValue(jVarT2, "load(...)");
                jVarB = v04.b.b(jVarT2, e0Var, function0);
            }
            com.bumptech.glide.j jVarO = jVarB.a(hVarC);
            if (image.f60028r) {
                Object value = this.d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                jVarO.e0(n8.b.c((w8.a) value));
            }
            ((com.bumptech.glide.j) jVarO.w(i, i2)).c0();
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }

    public final CompletableFuture h(UrlImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        CompletableFuture completableFuture = new CompletableFuture();
        Integer num = image.f60026p;
        Context context = this.f250333a;
        v8.l aVar = new a(completableFuture, num != null ? Integer.valueOf(kli.a.k(context, num.intValue())) : null, image.o != null ? Integer.valueOf(kli.a.k(context, r4.intValue())) : null);
        com.bumptech.glide.j jVar = (com.bumptech.glide.j) com.bumptech.glide.b.d(context).i().Z(b(image, null)).q(true);
        jVar.S(aVar, null, jVar, y8.f.f311599a);
        return completableFuture;
    }
}
