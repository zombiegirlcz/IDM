package ip0;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class mi implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FixedTabsDelegate.Model f165383b;

    public /* synthetic */ mi(FixedTabsDelegate.Model model, int i) {
        this.f165382a = i;
        this.f165383b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f165382a) {
            case 0:
                String selectedId = (String) obj2;
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                return new com.revolut.core.ui_kit.delegates.g6(selectedId, this.f165383b);
            default:
                mx0.mc it8 = (mx0.mc) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f165383b;
        }
    }
}
