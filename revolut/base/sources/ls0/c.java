package ls0;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ip0.za;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yp0.j0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    public static void a(int i, Function1 translationXDelegate, za zaVar, ViewPager2 viewPager) {
        za zaVar2;
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(translationXDelegate, "translationXDelegate");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        if (zaVar == null) {
            zaVar2 = zaVar;
            viewPager2 = viewPager;
        } else {
            zaVar2 = zaVar;
            viewPager2 = viewPager;
            translationXDelegate = new c18.c(translationXDelegate, viewPager2, zaVar2, i, 4);
        }
        RecyclerView recyclerViewA = j0.a(viewPager2);
        viewPager2.setPageTransformer(new d(translationXDelegate, zaVar2, recyclerViewA));
        recyclerViewA.setItemAnimator(new a(translationXDelegate, zaVar2));
        viewPager2.setOffscreenPageLimit(2);
    }
}
