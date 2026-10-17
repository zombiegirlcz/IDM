package swl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$string;
import com.revolut.uicomponent.R$drawable;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$style;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lkf.f0;
import lpi.d;
import lpi.e;
import pri.f;
import qqi.c;
import ryl.h;
import t70.g;
import yy9.s;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public interface a extends f {
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    static void t(a aVar, String subtitle, Function1 onDocumentPicked) {
        c cVar = (c) aVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(onDocumentPicked, "onDocumentPicked");
        cVar.f248553m = onDocumentPicked;
        e eVar = cVar.f248552l;
        g gVar = cVar.i;
        int i = R$drawable.ic_camera_blue_m;
        List items = v.k(new ryl.f(new v01.b(subtitle, R$attr.uikit_colorGreyTone50, "R_Regular", 14, 104), null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), new h("PHOTO", Integer.valueOf(i), new v01.b(gVar.getString(R$string.common_photo), 0, null, null, 126)), new h("DOCUMENT", Integer.valueOf(R$drawable.icon_m_plan_blue), new v01.b(gVar.getString(R$string.common_document), 0, null, null, 126)));
        qqi.a itemClickListener = new qqi.a(cVar, 2);
        d dVar = e.Companion;
        f0 dismissListener = new f0(7);
        lpi.b bVar = (lpi.b) eVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter("default_dialog_tag", "tag");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemClickListener, "clickListener");
        Intrinsics.checkNotNullParameter(dismissListener, "dismissListener");
        yyl.c cVar2 = bVar.f199139j;
        if (cVar2 != null && Intrinsics.f("default_dialog_tag", bVar.k)) {
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            cVar2.e = itemClickListener;
            ((j) cVar2.f318012h.getValue()).c(yyl.c.a(null, items));
            BottomSheetDialog bottomSheetDialog = cVar2.i;
            if (bottomSheetDialog != null) {
                bottomSheetDialog.show();
                return;
            } else {
                Intrinsics.r("dialog");
                throw null;
            }
        }
        yyl.c cVar3 = new yyl.c(bVar.f199138h, bVar.i, null, items, itemClickListener, new ljd.e(bVar, dismissListener));
        bVar.f199139j = cVar3;
        bVar.k = "default_dialog_tag";
        int i2 = R$style.BottomSheetDialog_Theme;
        Context context = cVar3.f318008a;
        cVar3.i = new BottomSheetDialog(context, i2);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.bottom_dialog_recycler, (ViewGroup) null, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        ?? r06 = cVar3.f318012h;
        vyl.a.a(recyclerView, (j) r06.getValue(), null, v.k(new o31.b(), new r31.a()), new s(4), 10);
        ((j) r06.getValue()).c(yyl.c.a(cVar3.f318010c, cVar3.d));
        BottomSheetDialog bottomSheetDialog2 = cVar3.i;
        if (bottomSheetDialog2 == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        bottomSheetDialog2.setContentView(recyclerView);
        BottomSheetDialog bottomSheetDialog3 = cVar3.i;
        if (bottomSheetDialog3 == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        bottomSheetDialog3.setCancelable(true);
        BottomSheetDialog bottomSheetDialog4 = cVar3.i;
        if (bottomSheetDialog4 == null) {
            Intrinsics.r("dialog");
            throw null;
        }
        bottomSheetDialog4.setOnDismissListener(new bqi.a(cVar3, 3));
        BottomSheetDialog bottomSheetDialog5 = cVar3.i;
        if (bottomSheetDialog5 != null) {
            bottomSheetDialog5.show();
        } else {
            Intrinsics.r("dialog");
            throw null;
        }
    }
}
