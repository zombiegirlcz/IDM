package fmb;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        w wVar = (w) this.receiver;
        KProperty[] kPropertyArr = ReviewProductDetailsScreen.f83283b0;
        ((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) wVar).L2((InputChecklistDelegate.Model) obj2);
        return Unit.f186387a;
    }
}
