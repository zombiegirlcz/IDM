package unj;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import ix0.a2;
import ix0.y1;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m {
    public static final a2 a(ViewPager2 viewPager2, TwinVerticalButton footer) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(footer, "footer");
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return new y1();
        }
        WeakHashMap weakHashMap = new WeakHashMap();
        l lVar = new l(weakHashMap, footer);
        recyclerView.addOnChildAttachStateChangeListener(lVar);
        Iterator it8 = ViewGroupKt.getChildren(recyclerView).iterator();
        while (it8.hasNext()) {
            lVar.onChildViewAttachedToWindow((View) it8.next());
        }
        return new k(weakHashMap, recyclerView, lVar, 0);
    }
}
