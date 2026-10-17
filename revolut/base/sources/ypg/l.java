package ypg;

import ael.u0;
import afa.s;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.data.model.Data;
import efm.h0;
import efm.r;
import efm.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yt0.i0;
import yt0.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements kfm.o, kfm.p, kfm.c, kfm.g, ViewPager2.PageTransformer, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315883b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f315882a = i;
        this.f315883b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f315882a) {
            case 18:
                ((yrb.i) this.f315883b).invoke(obj2);
                break;
            case 19:
                ((yo7.p) this.f315883b).invoke(obj2);
                break;
            default:
                ((yrb.i) this.f315883b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f315882a) {
            case 0:
                yo7.p pVar = (yo7.p) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) pVar.invoke(p0);
            case 1:
                p pVar2 = (p) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "it");
                r rVarHide = ((cqg.b) pVar2.d).f108101c.hide();
                Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                return rVarHide;
            case 2:
                ypk.d dVar = (ypk.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar.invoke(p0);
            case 3:
                ypk.d dVar2 = (ypk.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) dVar2.invoke(p0);
            case 4:
                yo7.p pVar3 = (yo7.p) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qta.f) pVar3.invoke(p0);
            case 5:
                ypk.d dVar3 = (ypk.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar3.invoke(p0);
            case 6:
                wo5.a aVar = (wo5.a) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 7:
                return (dj0.d) ((ypd.i) this.f315883b).invoke(p0);
            case 8:
                ypd.i iVar = (ypd.i) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) iVar.invoke(p0);
            case 9:
                yrk.d dVar4 = (yrk.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar4.invoke(p0);
            case 10:
                u0 u0Var = (u0) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) u0Var.invoke(p0);
            case 11:
                yrk.e eVar = (yrk.e) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) eVar.invoke(p0);
            case 12:
                yrk.d dVar5 = (yrk.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) dVar5.invoke(p0);
            case 13:
                ys5.e eVar2 = (ys5.e) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar2.invoke(p0);
            case 14:
                ys5.e eVar3 = (ys5.e) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar3.invoke(p0);
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 27:
            default:
                ysk.a aVar2 = (ysk.a) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar2.invoke(p0);
            case 16:
                ysk.a aVar3 = (ysk.a) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) aVar3.invoke(p0);
            case 23:
                s sVar = (s) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pcd.s) sVar.invoke(p0);
            case 24:
                yo7.p pVar4 = (yo7.p) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) pVar4.invoke(p0);
            case 25:
                ysk.a aVar4 = (ysk.a) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (npg.b) aVar4.invoke(p0);
            case 26:
                yo7.p pVar5 = (yo7.p) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) pVar5.invoke(p0);
            case 28:
                ysk.a aVar5 = (ysk.a) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar5.invoke(p0);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        i0 i0Var = (i0) this.f315883b;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insetsOf = Insets.of(insets2.left, insets2.top + i0Var.i, insets2.right, insets2.bottom);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        return new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, insetsOf).build();
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        ysk.a aVar = (ysk.a) this.f315883b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View page, float f) {
        v vVar = (v) this.f315883b;
        Intrinsics.checkNotNullParameter(page, "page");
        vVar.n(page);
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f315882a) {
            case 17:
                yi3.d dVar = (yi3.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (Boolean) dVar.invoke(p0, p17);
            default:
                yi3.d dVar2 = (yi3.d) this.f315883b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (efm.b) dVar2.invoke(p0, p17);
        }
    }
}
