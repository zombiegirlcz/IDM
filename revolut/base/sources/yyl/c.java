package yyl;

import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogImageTextDelegate;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogSubtitleDelegate;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogTextDelegate;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogTextRowDelegate;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogTextWithButtonDelegate;
import com.revolut.uicomponent.products.ButtonDelegate;
import com.revolut.uicomponent.products.SpaceDelegate;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ljd.e;
import ryd.l;
import te0.w;
import yy0.f;
import yy9.s;
import z4l.j;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f318008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f318009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318010c;
    public final List d;
    public Function1 e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f318011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f318012h;
    public BottomSheetDialog i;

    public c(Context context, f imageDisplayer, String str, List items, Function1 itemClickListener, e dismissListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        Intrinsics.checkNotNullParameter(dismissListener, "dismissListener");
        this.f318008a = context;
        this.f318009b = imageDisplayer;
        this.f318010c = str;
        this.d = items;
        this.e = itemClickListener;
        this.f = dismissListener;
        final int i = 0;
        this.f318011g = w.y0(new Function0(this) { // from class: yyl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f318005b;

            {
                this.f318005b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        koi.c cVar = new koi.c(0);
                        c cVar2 = this.f318005b;
                        cVar.a(new BottomDialogTextDelegate(new b(cVar2, 0)));
                        b listener = new b(cVar2, 1);
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        cVar.a(new BottomDialogTextWithButtonDelegate(R$layout.delegate_bottom_dialog_texi_with_button_item, new l(9)));
                        b listener2 = new b(cVar2, 2);
                        f imageLoader = cVar2.f318009b;
                        Intrinsics.checkNotNullParameter(listener2, "listener");
                        Intrinsics.checkNotNullParameter(imageLoader, "imageDisplayer");
                        cVar.a(new BottomDialogSubtitleDelegate(R$layout.delegate_bottom_dialog_icon_title_subititle_item, new l(6)));
                        cVar.a(new ButtonDelegate(new s(5), uyl.c.SHADOW_BLUE));
                        cVar.a(new ButtonDelegate(new s(6), uyl.c.OUTLINED_BLUE));
                        cVar.a(new SpaceDelegate());
                        cVar.a(new BottomDialogTextRowDelegate(new b(cVar2, 3), imageLoader));
                        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                        cVar.a(new BottomDialogImageTextDelegate(R$layout.delegate_bottom_dialog_image_text_item, new l(5)));
                        return cVar;
                    default:
                        return new j((koi.c) this.f318005b.f318011g.getValue(), false, 14);
                }
            }
        });
        final int i2 = 1;
        this.f318012h = w.y0(new Function0(this) { // from class: yyl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f318005b;

            {
                this.f318005b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        koi.c cVar = new koi.c(0);
                        c cVar2 = this.f318005b;
                        cVar.a(new BottomDialogTextDelegate(new b(cVar2, 0)));
                        b listener = new b(cVar2, 1);
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        cVar.a(new BottomDialogTextWithButtonDelegate(R$layout.delegate_bottom_dialog_texi_with_button_item, new l(9)));
                        b listener2 = new b(cVar2, 2);
                        f imageLoader = cVar2.f318009b;
                        Intrinsics.checkNotNullParameter(listener2, "listener");
                        Intrinsics.checkNotNullParameter(imageLoader, "imageDisplayer");
                        cVar.a(new BottomDialogSubtitleDelegate(R$layout.delegate_bottom_dialog_icon_title_subititle_item, new l(6)));
                        cVar.a(new ButtonDelegate(new s(5), uyl.c.SHADOW_BLUE));
                        cVar.a(new ButtonDelegate(new s(6), uyl.c.OUTLINED_BLUE));
                        cVar.a(new SpaceDelegate());
                        cVar.a(new BottomDialogTextRowDelegate(new b(cVar2, 3), imageLoader));
                        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                        cVar.a(new BottomDialogImageTextDelegate(R$layout.delegate_bottom_dialog_image_text_item, new l(5)));
                        return cVar;
                    default:
                        return new j((koi.c) this.f318005b.f318011g.getValue(), false, 14);
                }
            }
        });
    }

    public static List a(String str, List list) {
        return str == null ? list : i2b.a.q(new ryl.f(new v01.b(str, R$attr.uikit_colorGreyTone50, null, null, 124), wyl.b.f301311c, Constants.TAG_MPOS_MODULE_STATE), list);
    }

    public final void b() {
        BottomSheetDialog bottomSheetDialog = this.i;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        } else {
            Intrinsics.r("dialog");
            throw null;
        }
    }
}
