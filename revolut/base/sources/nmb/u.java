package nmb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SavingsProductData f217257b;

    public /* synthetic */ u(SavingsProductData savingsProductData, int i) {
        this.f217256a = i;
        this.f217257b = savingsProductData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f217256a) {
            case 0:
                c update = (c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return c.a(update, null, this.f217257b, null, false, 29);
            case 1:
                List productDataList = (List) obj2;
                Intrinsics.checkNotNullParameter(productDataList, "productDataList");
                SavingsProductData savingsProductDataB = opg.a.b(productDataList, new u(this.f217257b, 2));
                od0.i.Companion.getClass();
                return od0.h.a(savingsProductDataB);
            case 2:
                SavingsProductData it8 = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                SavingsProduct savingsProduct = it8.f86683a;
                String str = savingsProduct.f86617a;
                SavingsProduct savingsProduct2 = this.f217257b.f86683a;
                return Boolean.valueOf(!Intrinsics.f(str, savingsProduct2.f86617a) && Intrinsics.f(savingsProduct.e, savingsProduct2.e) && Intrinsics.f(savingsProduct.f86618b, savingsProduct2.f86618b));
            case 3:
                pmb.d update2 = (pmb.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return pmb.d.a(update2, null, this.f217257b, 0, 13);
            case 4:
                rmb.a update3 = (rmb.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return rmb.a.a(update3, null, this.f217257b, null, 5);
            default:
                od0.i baseProduct = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(baseProduct, "baseProduct");
                return new ncd.a(this.f217257b, (SavingsProductData) baseProduct.g());
        }
    }
}
