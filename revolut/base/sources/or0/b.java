package or0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aw0.o9;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ix0.c0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(BaseRecyclerViewDelegate baseRecyclerViewDelegate, qv0.i item, View view, boolean z, dr0.k kVar, Rect rect) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(view, "view");
        b(baseRecyclerViewDelegate, item.getI(), view, z, null, kVar, rect, 8);
        o(baseRecyclerViewDelegate, item, view);
    }

    public static void b(BaseRecyclerViewDelegate baseRecyclerViewDelegate, qv0.c position, View view, boolean z, Context context, dr0.k kVar, Rect rect, int i) {
        if ((i & 8) != 0) {
            context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        }
        Context context2 = context;
        dr0.k kVar2 = (i & 16) != 0 ? null : kVar;
        Rect rect2 = (i & 32) != 0 ? null : rect;
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context2, "context");
        view.setBackground(dr0.b.a(position, qv0.k.OutOfGroup, context2, z && n(position), kVar2, rect2));
        j(baseRecyclerViewDelegate, position, view);
    }

    public static /* synthetic */ void c(BaseRecyclerViewDelegate baseRecyclerViewDelegate, qv0.i iVar, View view, boolean z, dr0.i iVar2, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            iVar2 = null;
        }
        a(baseRecyclerViewDelegate, iVar, view, z3, iVar2, null);
    }

    public static void d(BaseRecyclerViewDelegate baseRecyclerViewDelegate, qv0.l item, View view, boolean z, Rect rect, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if ((i & 16) != 0) {
            rect = null;
        }
        Rect rect2 = rect;
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        view.setBackground(dr0.b.b(item.getI(), item.getU(), context, z && n(item.getI()), rect2, 16));
        j(baseRecyclerViewDelegate, item.getI(), view);
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = Intrinsics.f(item.getI(), c.C1364c.f249512a) ? 0 : kli.a.k(context2, 4.0f);
        switch (a.f228005a[item.getU().ordinal()]) {
            case 1:
            case 2:
                o(baseRecyclerViewDelegate, item, view);
                return;
            case 3:
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iW = kli.a.w(item.getF53411p(), context3);
                Context context4 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int iW2 = kli.a.w(item.getF53410n(), context4);
                Context context5 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                int iW3 = kli.a.w(item.getF53412q(), context5);
                Context context6 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                view.setPadding(iW, iW2, iW3, kli.a.w(item.getO(), context6) + iK);
                return;
            case 4:
                Context context7 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                int iW4 = kli.a.w(item.getF53411p(), context7);
                Context context8 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                int iW5 = kli.a.w(item.getF53410n(), context8) + iK;
                Context context9 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                int iW6 = kli.a.w(item.getF53412q(), context9);
                Context context10 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                view.setPadding(iW4, iW5, iW6, kli.a.w(item.getO(), context10) + iK);
                return;
            case 5:
                Context context11 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                int iW7 = kli.a.w(item.getF53411p(), context11);
                Context context12 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                int iW8 = kli.a.w(item.getF53410n(), context12) + iK;
                Context context13 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                int iW9 = kli.a.w(item.getF53412q(), context13);
                Context context14 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                view.setPadding(iW7, iW8, iW9, kli.a.w(item.getO(), context14));
                return;
            case 6:
                Context context15 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                int iW10 = kli.a.w(item.getF53411p(), context15);
                Context context16 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
                int iW11 = kli.a.w(item.getF53410n(), context16);
                Context context17 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
                int iW12 = kli.a.w(item.getF53412q(), context17);
                Context context18 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
                view.setPadding(iW10, iW11, iW12, kli.a.w(item.getO(), context18));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void e(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Clause clause, TextView textView, Function1 function1, int i) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        ty0.g handleTypeface = (i & 8) != 0 ? ty0.f.f275450a : ty0.d.f275448a;
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        kli.a.e(textView, clause, function12, handleTypeface, 0, 8);
    }

    public static final void f(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Image image, ImageView imageView) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        imageView.setVisibility(image != null ? 0 : 8);
        yy0.f.e(u.k(imageView).Q(), image, imageView, null, null, 12);
    }

    public static final void g(BaseStoriesDelegate baseStoriesDelegate, String str, TextView textView, Function0 function0) {
        Intrinsics.checkNotNullParameter(baseStoriesDelegate, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        h(baseStoriesDelegate, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textView, function0);
    }

    public static final void h(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Clause clause, TextView textView, Function0 function0) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        kli.a.b(textView, clause, ty0.f.f275450a);
        if (clause != null) {
            textView.setMovementMethod(c0.f169220a);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setOnClickListener(new hqi.c(function0, 1));
        }
    }

    public static final void i(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Media media, UiKitMediaView mediaView, xt0.a aVar) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        mediaView.setExternalMediaRegistry(aVar);
        mediaView.setVisibility(media != null ? 0 : 8);
        ((jz0.b) u.k(mediaView).a0()).b(media, mediaView, null);
    }

    public static final void j(BaseRecyclerViewDelegate baseRecyclerViewDelegate, qv0.c position, View view) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(view, "view");
        v.a(view, position);
    }

    public static final void k(ListCellDelegate listCellDelegate, String str, TextView textView) {
        Intrinsics.checkNotNullParameter(listCellDelegate, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (str == null) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public static final boolean l(qv0.i iVar, qv0.i other) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.f(iVar.getI(), other.getI())) {
            return true;
        }
        qv0.i iVar2 = iVar;
        qv0.i other2 = other;
        Intrinsics.checkNotNullParameter(iVar2, "<this>");
        Intrinsics.checkNotNullParameter(other2, "other");
        return (iVar2.getO() == other2.getO() && iVar2.getF53410n() == other2.getF53410n() && iVar2.getF53411p() == other2.getF53411p() && iVar2.getF53412q() == other2.getF53412q()) ? false : true;
    }

    public static final boolean m(qv0.l lVar, qv0.l other) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return (lVar.getU() == other.getU() && lVar.getF52162g() == other.getF52162g() && !l(lVar, other)) ? false : true;
    }

    public static final boolean n(qv0.c cVar) {
        if (((Boolean) jo0.g.f().getValue()).booleanValue() && cVar.b()) {
            return ((cVar instanceof c.f) || (cVar instanceof c.e)) ? false : true;
        }
        return true;
    }

    public static final void o(BaseRecyclerViewDelegate baseRecyclerViewDelegate, qv0.o item, View view) {
        Intrinsics.checkNotNullParameter(baseRecyclerViewDelegate, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(item.getF53411p(), context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iW2 = kli.a.w(item.getF53410n(), context2);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iW3 = kli.a.w(item.getF53412q(), context3);
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        view.setPaddingRelative(iW, iW2, iW3, kli.a.w(item.getO(), context4));
    }

    public static final void p(BannerDelegate bannerDelegate, LottieAnimationView lottieView, ImageView imageImage, ComplexImage complexImage) {
        Intrinsics.checkNotNullParameter(bannerDelegate, "<this>");
        Intrinsics.checkNotNullParameter(lottieView, "lottieView");
        Intrinsics.checkNotNullParameter(imageImage, "imageImage");
        if (complexImage instanceof ComplexImage.Regular) {
            imageImage.setVisibility(0);
            lottieView.setVisibility(8);
            yy0.f.e(u.k(imageImage).Q(), null, lottieView, null, null, 12);
            yy0.f.e(u.k(imageImage).Q(), ((ComplexImage.Regular) complexImage).getF55837a(), imageImage, null, null, 12);
            return;
        }
        if (complexImage instanceof ComplexImage.Lottie) {
            lottieView.setVisibility(0);
            imageImage.setVisibility(8);
            yy0.f.e(u.k(imageImage).Q(), null, imageImage, null, null, 12);
            yy0.f.e(u.k(imageImage).Q(), ((ComplexImage.Lottie) complexImage).getF55834a(), lottieView, null, null, 12);
            return;
        }
        lottieView.setVisibility(8);
        imageImage.setVisibility(8);
        yy0.f.e(u.k(imageImage).Q(), null, imageImage, null, null, 12);
        yy0.f.e(u.k(imageImage).Q(), null, lottieView, null, null, 12);
    }
}
