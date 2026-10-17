package fmb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b f136294b;

    public /* synthetic */ p0(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, int i) {
        this.f136293a = i;
        this.f136294b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f136293a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = this.f136294b;
                yji.l.a1(bVar, bVar.D.Z2(it8), null, null, null, 7);
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar2 = this.f136294b;
                yji.l.a1(bVar2, bVar2.D.Z2(it8), null, null, null, 7);
                break;
        }
        return Boolean.TRUE;
    }
}
