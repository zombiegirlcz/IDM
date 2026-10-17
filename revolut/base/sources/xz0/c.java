package xz0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import az0.r;
import c8.o;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import e8.p;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l8.n;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v1.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements qz0.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f309757c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f309758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f309759b;

    public c(Context context, r urlProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        this.f309758a = context;
        this.f309759b = urlProvider;
    }

    public static u8.g a(Function1 function1, String str, Drawable drawable) {
        return function1 == null ? Companion : new qz0.e(new m(13, function1), new qg7.k(str, function1, drawable, 22), 1);
    }

    public static u8.h c(j jVar, Drawable drawable, Drawable drawable2, o[] oVarArr) {
        u8.a aVarK = ((u8.h) ((u8.h) ((u8.h) new u8.h().K(n.f192739b, new l8.i())).g(p.f123505a)).E(ue0.e.l(jVar, 7L, 0L))).k(drawable2);
        Intrinsics.checkNotNullExpressionValue(aVarK, "error(...)");
        u8.h hVar = (u8.h) aVarK;
        if (drawable2 != null) {
        }
        if (drawable != null) {
        }
        if (oVarArr != null) {
            hVar.a(new u8.h().L((o[]) Arrays.copyOf(oVarArr, oVarArr.length)));
        }
        return hVar;
    }

    public final com.bumptech.glide.j b(ContactImage contactImage, ImageView imageView, j jVar, Drawable drawable, Drawable drawable2, boolean z) {
        o[] oVarArrK;
        Context context = this.f309758a;
        com.bumptech.glide.j jVarE0 = com.bumptech.glide.b.b(context).c(context).t(jVar).e0(n8.b.b());
        if (imageView != null) {
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            oVarArrK = w.K(contactImage, context2);
        } else {
            oVarArrK = null;
        }
        com.bumptech.glide.j jVarA = jVarE0.a(c(jVar, drawable, drawable2, oVarArrK));
        if (z) {
            jVarA.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        Intrinsics.checkNotNullExpressionValue(jVarA, "apply(...)");
        return jVarA;
    }
}
