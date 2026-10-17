package co;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import no.y1;

/* JADX INFO: loaded from: classes17.dex */
public final class b {
    private b() {
    }

    public static d a(com.revolut.kompot.navigable.a controller, y1 callback) {
        int i;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(callback, "callback");
        d dVar = new d(callback);
        ArrayList arrayList = new ArrayList();
        arrayList.add(controller.D2());
        while (true) {
            i = 0;
            if (arrayList.isEmpty()) {
                break;
            }
            View view = (View) arrayList.remove(0);
            if (!(view instanceof AppBarLayout) && (view instanceof ViewGroup)) {
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView2 = (RecyclerView) view;
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                        c cVar = dVar.d;
                        recyclerView2.removeOnScrollListener(cVar);
                        recyclerView2.addOnScrollListener(cVar);
                        dVar.f25480b = recyclerView2;
                        i = 1;
                        break;
                    }
                } else {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    while (i < childCount) {
                        arrayList.add(viewGroup.getChildAt(i));
                        i++;
                    }
                }
            }
        }
        if (i != 0 && (recyclerView = dVar.f25480b) != null) {
            recyclerView.addOnLayoutChangeListener(dVar.e);
        }
        if (i != 0) {
            return dVar;
        }
        return null;
    }
}
