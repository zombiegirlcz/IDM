package v0f;

import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ koi.h f284802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f284803b;

    public e(koi.h hVar, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f284802a = hVar;
        this.f284803b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        String f51890a = this.f284802a.a(i).getF51890a();
        if (Intrinsics.f(f51890a, "LIST_ITEM_EXPIRY") || Intrinsics.f(f51890a, "LIST_ITEM_CVV")) {
            return 1;
        }
        return this.f284803b.getSpanCount();
    }
}
