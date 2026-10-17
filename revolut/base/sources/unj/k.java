package unj;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.esim.impl.R$id;
import ix0.a2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f281448c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj2, RecyclerView recyclerView, Object obj3, int i) {
        this.f281446a = i;
        this.f281447b = obj2;
        this.f281448c = recyclerView;
        this.d = obj3;
    }

    @Override // ix0.a2
    public final void cancel() {
        switch (this.f281446a) {
            case 0:
                WeakHashMap weakHashMap = (WeakHashMap) this.f281447b;
                l lVar = (l) this.d;
                Iterator it8 = weakHashMap.entrySet().iterator();
                while (it8.hasNext()) {
                    ((a2) ((Map.Entry) it8.next()).getValue()).cancel();
                }
                weakHashMap.clear();
                this.f281448c.removeOnChildAttachStateChangeListener(lVar);
                break;
            default:
                n nVar = (n) this.f281447b;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) this.f281448c;
                TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.d;
                LinkedHashSet linkedHashSet = nVar.f281451a;
                linkedHashSet.remove(screenContentRecyclerView);
                if (linkedHashSet.isEmpty()) {
                    twinVerticalButton.removeOnLayoutChangeListener(nVar);
                    twinVerticalButton.setTag(R$id.footer_padding_layout_change_listener, null);
                }
                break;
        }
    }
}
