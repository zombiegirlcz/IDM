package ux0;

import aw0.d8;
import aw0.e8;
import aw0.h8;
import aw0.i8;
import aw0.l6;
import aw0.v7;
import aw0.x7;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface l0 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (((aw0.x7) r2).f10607a.getBackground() == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (((aw0.d8) r2).f10282a.getBackground() == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static ux0.e0 a(aw0.i8 r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2 instanceof aw0.h8
            if (r0 == 0) goto L17
            aw0.h8 r2 = (aw0.h8) r2
            aw0.f8 r2 = r2.f10347b
            com.revolut.core.ui_kit.background.AnimatedBackgroundType r2 = r2.f10311a
            if (r2 == 0) goto L36
            ux0.b0 r0 = new ux0.b0
            r0.<init>(r2)
            return r0
        L17:
            boolean r0 = r2 instanceof aw0.x7
            ux0.c0 r1 = ux0.c0.f283740a
            if (r0 == 0) goto L28
            aw0.x7 r2 = (aw0.x7) r2
            aw0.l6 r2 = r2.f10607a
            com.revolut.core.ui_kit.background.AnimatedBackgroundType r2 = r2.getBackground()
            if (r2 != 0) goto L39
            goto L36
        L28:
            boolean r0 = r2 instanceof aw0.d8
            if (r0 == 0) goto L3a
            aw0.d8 r2 = (aw0.d8) r2
            aw0.l6 r2 = r2.f10282a
            com.revolut.core.ui_kit.background.AnimatedBackgroundType r2 = r2.getBackground()
            if (r2 != 0) goto L39
        L36:
            ux0.d0 r2 = ux0.d0.f283741a
            return r2
        L39:
            return r1
        L3a:
            boolean r0 = r2 instanceof aw0.v7
            if (r0 == 0) goto L3f
            return r1
        L3f:
            boolean r2 = r2 instanceof aw0.e8
            if (r2 == 0) goto L44
            return r1
        L44:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.l0.a(aw0.i8):ux0.e0");
    }

    static List d(d1 d1Var, i8 productIntro) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(productIntro, "productIntro");
        if (!(productIntro instanceof h8)) {
            return zhm.v.l(zi0.c.y(productIntro));
        }
        ArrayList arrayList = ((h8) productIntro).f10346a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((x7) it8.next()).f10607a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((tnb.g0) d1Var).f((l6) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    static aw0.b e(String pageId, List list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((aw0.b) next).f10240b.getId(), pageId)) {
                break;
            }
        }
        return (aw0.b) next;
    }

    static j0 f(i8 i8Var, String pageId, List models, d1 productIntroStateProvider, tx0.q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(i8Var, "<this>");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        List listD = d(productIntroStateProvider, i8Var);
        if (listD.isEmpty()) {
            throw new IllegalStateException("Can't create product intro state without products");
        }
        return new j0(pageId, listD, models, z, productIntroStateProvider, qVar, true, false, false, a(i8Var));
    }

    static boolean j(d1 d1Var, i8 productIntro) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(productIntro, "productIntro");
        if (productIntro instanceof h8) {
            ArrayList arrayList = ((h8) productIntro).f10346a;
            if (!arrayList.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (((tnb.g0) d1Var).f(((x7) it8.next()).f10607a)) {
                        return false;
                    }
                }
            }
        } else {
            if (productIntro instanceof e8) {
                return true;
            }
            if (productIntro instanceof d8) {
                if (((tnb.g0) d1Var).f(((d8) productIntro).f10282a)) {
                    return false;
                }
            } else if (productIntro instanceof v7) {
                if (((tnb.g0) d1Var).f(((v7) productIntro).f10573a)) {
                    return false;
                }
            } else {
                if (!(productIntro instanceof x7)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((tnb.g0) d1Var).f(((x7) productIntro).f10607a)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void k(d1 d1Var, Throwable error, List products) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(products, "products");
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ProductIntroStateProvider", "handleError", error, h0Var);
        }
        int size = products.size();
        for (int i = 0; i < size; i++) {
            l6 product = (l6) products.get(i);
            tnb.g0 g0Var = (tnb.g0) d1Var;
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) g0Var.f272384b;
            Intrinsics.checkNotNullParameter(product, "product");
            accountsNavBarContentView.A.f(product);
        }
    }

    l0 b(List list, tx0.q qVar);

    l0 c(a0 a0Var);

    default boolean g(i8 i8Var) {
        Intrinsics.checkNotNullParameter(i8Var, "<this>");
        boolean z = false;
        if (!(i8Var instanceof e8) && !(i8Var instanceof d8)) {
            if (i8Var instanceof v7) {
                z = ((AccountsNavBarContentView) ((tnb.g0) n()).f272384b).f283800a;
            } else {
                if (!(i8Var instanceof x7) && !(i8Var instanceof h8)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!((AccountsNavBarContentView) ((tnb.g0) n()).f272384b).f283800a) {
                    z = true;
                }
            }
        }
        if (z) {
            IllegalStateException illegalStateException = new IllegalStateException("Conflicting product intro versions");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return z;
    }

    default l0 h() {
        return this;
    }

    List i();

    default Set l() {
        return zhm.h0.f322473a;
    }

    default l0 m(Throwable th10) {
        return this;
    }

    d1 n();

    default l0 o() {
        return this;
    }
}
