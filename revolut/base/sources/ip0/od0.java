package ip0;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class od0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ koi.k f165654b;

    public /* synthetic */ od0(koi.k kVar, int i) {
        this.f165653a = i;
        this.f165654b = kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f165653a;
        boolean z = false;
        koi.k kVar = this.f165654b;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                SelectableDelegate.Companion companion = SelectableDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof SelectableDelegate.Model) && kVar.f(iIntValue, ((SelectableDelegate.Model) data).f53305b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof ah0) && kVar.f(iIntValue, ((ah0) data).f163447b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                SwipeToActionDelegate.Companion companion2 = SwipeToActionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof com.revolut.core.ui_kit.delegates.wh) && kVar.f(iIntValue, ((com.revolut.core.ui_kit.delegates.wh) data).f54925b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
