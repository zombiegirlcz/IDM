package i3e;

import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoreHomeFlowContract$PagerItem f158195b;

    public /* synthetic */ j(StoreHomeFlowContract$PagerItem storeHomeFlowContract$PagerItem, int i) {
        this.f158194a = i;
        this.f158195b = storeHomeFlowContract$PagerItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g update = (g) obj2;
        switch (this.f158194a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return g.a(update, this.f158195b.getD(), false, null, 13);
    }
}
