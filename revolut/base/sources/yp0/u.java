package yp0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mx0.bb;
import mx0.db;
import yp0.s;

/* JADX INFO: loaded from: classes19.dex */
public abstract class u {
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.revolut.core.ui_kit.views.OverlappedIconsView r19, aw0.i0 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp0.u.a(com.revolut.core.ui_kit.views.OverlappedIconsView, aw0.i0, int):void");
    }

    public static void c(OverlappedIconsView overlappedIconsView, List images, s overlappedIconsRightmostImage, bb bbVar, int i) {
        Object objI;
        List listK;
        int i2 = R$color.internal_deepGrey;
        int i3 = R$color.internal_grey10;
        bb imageSize = (i & 128) != 0 ? bb.REGULAR : bbVar;
        int i5 = (i & 256) != 0 ? 8 : 0;
        Intrinsics.checkNotNullParameter(overlappedIconsView, "<this>");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(overlappedIconsRightmostImage, "overlappedIconsRightmostImage");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        if (images.size() <= 4) {
            listK = zhm.d0.I0(images);
        } else {
            if (overlappedIconsRightmostImage instanceof s.b) {
                objI = new TextImage(a0.d.n(" +", images.size() - 3), overlappedIconsView.getContext().getColor(i2), overlappedIconsView.getContext().getColor(i3), 0, 12, 40, 200);
            } else {
                if (!(overlappedIconsRightmostImage instanceof s.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                objI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_ellipsis, R$attr.uikit_colorGrey50, R$attr.uikit_colorDeepGrey_10);
            }
            s0 s0Var = new s0(2);
            s0Var.a(objI);
            s0Var.b(zhm.d0.I0(zhm.d0.V0(images, 3)).toArray(new Image[0]));
            ArrayList arrayList = s0Var.f186433a;
            listK = zhm.v.k(arrayList.toArray(new Image[arrayList.size()]));
        }
        overlappedIconsView.setModel(new db(listK, imageSize, i5, false, 20));
    }

    public static final TextImage d(int i, aw0.e0 e0Var) {
        int i2;
        int i3;
        String strN = a0.d.n("+", i);
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorForeground);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorGreyTone8);
        int[] iArr = t.f315755a;
        int i5 = iArr[e0Var.ordinal()];
        if (i5 != 1) {
            i2 = 14;
            if (i5 != 2 && i5 != 3) {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 11;
            }
        } else {
            i2 = 18;
        }
        int i6 = iArr[e0Var.ordinal()];
        if (i6 == 1) {
            i3 = 56;
        } else if (i6 == 2) {
            i3 = 40;
        } else if (i6 == 3) {
            i3 = 32;
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 24;
        }
        return new TextImage(strN, solid, solid2, null, i2, i3, null, null, 200);
    }
}
