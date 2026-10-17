package h8d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10Screen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10ScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FaqSearchRev10Screen f149991b;

    public /* synthetic */ a(FaqSearchRev10Screen faqSearchRev10Screen, int i) {
        this.f149990a = i;
        this.f149991b = faqSearchRev10Screen;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f149990a;
        int i2 = 3;
        int i3 = 2;
        int i5 = 1;
        int i6 = 0;
        FaqSearchRev10Screen faqSearchRev10Screen = this.f149991b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = FaqSearchRev10Screen.l0;
                qji.b bVarQ2 = faqSearchRev10Screen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.di.FaqSearchRev10ScreenInjector");
                r7d.l lVar = ((r7d.t) ((v7d.a) bVarQ2)).f252174b;
                r7d.j jVar = new r7d.j();
                jVar.f252123a = e4m.b.b(e4m.c.a(faqSearchRev10Screen));
                int i21 = 28;
                jVar.f252124b = e4m.b.b(new qy7.f(lVar, jVar, i5, i21));
                jVar.f252125c = e4m.b.b(new qy7.f(lVar, jVar, i6, i21));
                jVar.d = e4m.b.b(new qy7.f(lVar, jVar, i2, i21));
                jVar.e = e4m.b.b(new qy7.f(lVar, jVar, i3, i21));
                return jVar;
            case 1:
                KProperty[] kPropertyArr2 = FaqSearchRev10Screen.l0;
                return (n) ((r7d.j) faqSearchRev10Screen.X.getValue()).e.get();
            default:
                return zhm.v.k(faqSearchRev10Screen.c0, faqSearchRev10Screen.f86246d0, faqSearchRev10Screen.f86247e0, faqSearchRev10Screen.f0, faqSearchRev10Screen.g0, faqSearchRev10Screen.f86248h0, faqSearchRev10Screen.i0, faqSearchRev10Screen.j0);
        }
    }

    public /* synthetic */ a(FaqSearchRev10Screen faqSearchRev10Screen, FaqSearchRev10ScreenContract$InputData faqSearchRev10ScreenContract$InputData) {
        this.f149990a = 0;
        this.f149991b = faqSearchRev10Screen;
    }
}
