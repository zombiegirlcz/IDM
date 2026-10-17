package vge;

import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f288972a = new p1();

    private p1() {
    }

    @Override // vge.y
    public final Flow a(ProductId productId, Flow originFlow) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        return originFlow;
    }
}
