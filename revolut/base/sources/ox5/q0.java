package ox5;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListSubheaderDelegate.Model f230610b;

    public /* synthetic */ q0(ListSubheaderDelegate.Model model, int i) {
        this.f230609a = i;
        this.f230610b = model;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 getDefaultErrorItems = (Function1) obj3;
        switch (this.f230609a) {
            case 0:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return i2b.a.q(this.f230610b, (List) getDefaultErrorItems.invoke(new iii.d(10, null, true, false, "WATCHLIST_SECTION_ITEM_ID")));
            default:
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems.invoke(new iii.d(6, "ManagedPortfolioDetailsAboutInfoExtensionContract", true, false, null)), this.f230610b, null, 0, 0, 126);
        }
    }
}
