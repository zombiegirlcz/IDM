package tw0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final as0.a f274782a = new as0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f274783b;

    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f274783b = recyclerView;
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        int i = 0;
        while (true) {
            as0.a aVar = this.f274782a;
            if (i >= itemDecorationCount) {
                RecyclerView recyclerView2 = this.f274783b;
                if (recyclerView2 != null) {
                    recyclerView2.addItemDecoration(aVar);
                    return;
                } else {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
            }
            RecyclerView recyclerView3 = this.f274783b;
            if (recyclerView3 == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            RecyclerView.ItemDecoration itemDecorationAt = recyclerView3.getItemDecorationAt(i);
            Intrinsics.checkNotNullExpressionValue(itemDecorationAt, "getItemDecorationAt(...)");
            if (itemDecorationAt instanceof o31.b) {
                RecyclerView recyclerView4 = this.f274783b;
                if (recyclerView4 == null) {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
                recyclerView4.removeItemDecorationAt(i);
                RecyclerView recyclerView5 = this.f274783b;
                if (recyclerView5 != null) {
                    recyclerView5.addItemDecoration(aVar);
                    return;
                } else {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
            }
            i++;
        }
    }

    public final void b(boolean z, boolean z3) {
        RecyclerView recyclerView = this.f274783b;
        if (recyclerView == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        Context context = recyclerView.getContext();
        Intrinsics.h(context);
        int iW = kli.a.w(z ? R$attr.uikit_dp8 : R$attr.uikit_dp32, context);
        int iW2 = kli.a.w(z3 ? R$attr.uikit_dp0 : R$attr.uikit_dp24, context);
        as0.a aVar = this.f274782a;
        if (iW2 == aVar.f8737c && iW == aVar.f8736b) {
            return;
        }
        aVar.f8736b = iW;
        aVar.f8737c = iW2;
        RecyclerView recyclerView2 = this.f274783b;
        if (recyclerView2 != null) {
            recyclerView2.invalidateItemDecorations();
        } else {
            Intrinsics.r("recyclerView");
            throw null;
        }
    }
}
