package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Type inference failed for: r2v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.l a(nx4.n r33) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx4.p.a(nx4.n):dx4.l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [zhm.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.y2 b(nx4.r1 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx4.p.b(nx4.r1, int):dx4.y2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static final dx4.z2 c(s1 s1Var) {
        dx4.a1 a1VarA;
        ?? arrayList;
        dx4.a1 a1VarA2;
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        String title = s1Var.getTitle();
        String description = s1Var.getDescription();
        String icon = s1Var.getIcon();
        if (icon != null) {
            dx4.a1.Companion.getClass();
            a1VarA = dx4.y0.a(icon);
        } else {
            a1VarA = null;
        }
        String cdnAssetId = s1Var.getCdnAssetId();
        List items = s1Var.getItems();
        if (items != null) {
            ArrayList arrayListZ = zhm.d0.Z(items);
            arrayList = new ArrayList(zhm.w.t(arrayListZ, 10));
            int i = 0;
            for (Object obj2 : arrayListZ) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                arrayList.add(b((r1) obj2, i));
                i = i2;
            }
        } else {
            List notes = s1Var.getNotes();
            if (notes != null) {
                ArrayList<o1> arrayListZ2 = zhm.d0.Z(notes);
                arrayList = new ArrayList(zhm.w.t(arrayListZ2, 10));
                for (o1 o1Var : arrayListZ2) {
                    String text = o1Var.getText();
                    if (o1Var.getIcon() != null) {
                        dx4.y0 y0Var = dx4.a1.Companion;
                        String icon2 = o1Var.getIcon();
                        y0Var.getClass();
                        a1VarA2 = dx4.y0.a(icon2);
                    } else {
                        a1VarA2 = null;
                    }
                    arrayList.add(new dx4.v2(a1VarA2, text));
                }
            } else {
                arrayList = zhm.f0.f322471a;
            }
        }
        ?? r56 = arrayList;
        String buttonTitle = s1Var.getButtonTitle();
        String footer = s1Var.getFooter();
        u0 actionFooter = s1Var.getActionFooter();
        return new dx4.z2(title, description, a1VarA, r56, cdnAssetId, buttonTitle, footer, actionFooter != null ? boh.f.v(actionFooter) : null);
    }
}
