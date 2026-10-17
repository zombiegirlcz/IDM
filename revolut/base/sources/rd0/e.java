package rd0;

import a54.g;
import akl.x;
import android.R;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import az0.c1;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.Task;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.r;
import efm.w;
import gsi.i;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import mki.j;
import oji.k;
import or0.u;
import skm.z;
import vc.s;
import vf0.m;
import vkm.q;
import vkm.q0;
import vkm.y;
import yp0.o;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final CoroutineScope a(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ue0.e.a(context.plus(i()));
    }

    public static final vkm.d b(w wVar) {
        return q.k(new afe.a(wVar, null, 3));
    }

    public static final r c(Flow flow, CoroutineContext coroutineContext) {
        return r.create(new ae.a(coroutineContext, flow, 4));
    }

    public static final y d(Flow flow, Set customKeys) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        return new y(flow, new x(customKeys, null, 5));
    }

    public static final y e(Flow flow, Set customKeys, Function3 action) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        Intrinsics.checkNotNullParameter(action, "action");
        return new y(flow, new uf0.c(customKeys, action, null));
    }

    public static final byte[] f(int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[4]);
        byteBufferWrap.putInt(i);
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    public static final xoi.d g(BaseDelegatesActivity activity, Bundle bundle, Integer num) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        xoi.e eVarK = com.bumptech.glide.c.k(activity);
        eVarK.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        gsi.e eVar = new gsi.e();
        eVar.f146534a = activity;
        eVar.f146535b = num;
        eVar.f146536c = eVarK.f307860b;
        s.h(eVar.f146536c, im0.b.class);
        gsi.f fVar = new gsi.f(new i(), eVar.f146534a, eVar.f146535b);
        return new xoi.d(fVar, (xoi.f) eVarK.d.invoke(activity, fVar));
    }

    public static final boolean h(iki.d dVar, Object newCommand) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(newCommand, "newCommand");
        dVar.getClass();
        j.a("NavActionsScheduler");
        return dVar.f161979b.isEmpty();
    }

    public static final c1 i() {
        Intrinsics.checkNotNullParameter(k.f225801a, "<this>");
        return new c1(z.f264021a, 2);
    }

    public static String j(String str, String str2) {
        return a0.d.s("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static final View k(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (screen instanceof com.revolut.kompot.navigable.a) {
            return ((com.revolut.kompot.navigable.a) screen).D2();
        }
        if (screen instanceof Fragment) {
            return ((Fragment) screen).getView();
        }
        if (screen instanceof Activity) {
            return l((Activity) screen);
        }
        if (screen instanceof no.c1) {
            return ((no.c1) screen).getDescriptor().b();
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, "tracking", j6.a.q("Unexpected screen type ", o0.f186429a.b(screen.getClass()).m()), null, h0Var);
        return null;
    }

    public static final View l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        View viewFindViewById = activity.findViewById(R.id.content);
        return viewFindViewById == null ? activity.getWindow().getDecorView().getRootView() : viewFindViewById;
    }

    public static final boolean m(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Image imageD = u.k(imageView).Q().d(imageView);
        if (imageD instanceof GlyphImage) {
            return true;
        }
        LottieImage lottieImage = imageD instanceof LottieImage ? (LottieImage) imageD : null;
        return (lottieImage != null ? lottieImage.f59959h : null) instanceof GlyphImage;
    }

    public static final q0 n(Flow flow, Set customKeys) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        return new q0(flow, new uf0.d(customKeys, null, 0), 1);
    }

    public static final void o(com.revolut.kompot.navigable.a aVar, iki.d navActionsScheduler, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(navActionsScheduler, "navActionsScheduler");
        if (aVar.y2().f98422h) {
            navActionsScheduler.b(aVar.u2().f98378a, new g(aVar, null, 14));
            return;
        }
        com.revolut.kompot.navigable.a aVar2 = aVar.f98405m;
        if (aVar2 != null) {
            aVar = aVar2;
        }
        aVar.G2(z);
    }

    public static r p(r rVar, long j2, long j3, int i) {
        int i2 = (i & 1) != 0 ? Integer.MAX_VALUE : 4;
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        long j5 = j2;
        long j16 = (i & 4) != 0 ? 10000L : j3;
        qza.q checkIsUnhandable = new qza.q(21);
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(checkIsUnhandable, "checkIsUnhandable");
        r rVarRetryWhen = rVar.retryWhen(new m(j5, j16, 2.0d, i2, checkIsUnhandable));
        Intrinsics.checkNotNullExpressionValue(rVarRetryWhen, "retryWhen(...)");
        return rVarRetryWhen;
    }

    public static final void q(ImageView imageView, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableCompat.wrap(drawable.mutate()).setTintList(ColorStateList.valueOf(num.intValue()));
        }
    }

    public static final void r(ImageView imageView, yp0.q qVar) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setTag(R$id.internal_glyph_display_options, qVar);
    }

    public static final Object s(Task task) {
        Intrinsics.checkNotNullParameter(task, "<this>");
        if (!task.isComplete()) {
            throw new IllegalStateException("The task has not been completed.");
        }
        Exception exception = task.getException();
        if (task.isCanceled()) {
            throw new IllegalStateException("The task has been cancelled.");
        }
        if (exception instanceof ResolvableApiException) {
            throw n14.k.L((ResolvableApiException) exception);
        }
        if (exception instanceof ApiException) {
            throw n14.k.K((ApiException) exception);
        }
        if (exception == null) {
            return task.getResult();
        }
        throw exception;
    }

    public static final ufm.b t(Task task) {
        Intrinsics.checkNotNullParameter(task, "<this>");
        ufm.b bVar = new ufm.b(new mi0.b(task), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    public static final void u(ImageView imageView, o oVar, boolean z) {
        Image image;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Object tag2 = imageView.getTag(R$id.internal_glyph_display_options);
        yp0.q qVar = tag2 instanceof yp0.q ? (yp0.q) tag2 : null;
        imageView.setTag(R$id.internal_glyph_display_options, oVar);
        if (!z || Intrinsics.f(qVar, oVar)) {
            return;
        }
        Image imageD = u.k(imageView).Q().d(imageView);
        if (!(imageD instanceof GlyphImage)) {
            LottieImage lottieImage = imageD instanceof LottieImage ? (LottieImage) imageD : null;
            if (!((lottieImage != null ? lottieImage.f59959h : null) instanceof GlyphImage)) {
                return;
            }
        }
        LottieImage lottieImage2 = imageD instanceof LottieImage ? (LottieImage) imageD : null;
        yy0.f.e(u.k(imageView).Q(), (lottieImage2 == null || (image = lottieImage2.f59959h) == null) ? imageD : image, imageView, null, null, 12);
    }
}
