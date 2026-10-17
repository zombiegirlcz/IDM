package a35;

import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.p f1058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm4.a f1059b;

    public e(al4.p creditCardProductFeatureTogglesInteractor, bm4.a creditCardEntryPointUiInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiInteractor, "creditCardEntryPointUiInteractor");
        this.f1058a = creditCardProductFeatureTogglesInteractor;
        this.f1059b = creditCardEntryPointUiInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        it4.b bVar = (it4.b) this.f1059b;
        boolean zC = ((jte.d) bVar.f168340a).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c);
        return nim.a.v(boh.f.e(((om4.b) bVar.f168341b).e(r2.ADD_NEW_PRODUCT_WIDGET), new gae.a(zC, bVar, 18)), new b(0));
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.ADD_NEW_PRODUCT_WIDGET, new ft3.g(null, null, 3), wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, 16370)));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return new d(((om4.b) this.f1058a).e(r2.ADD_NEW_PRODUCT_WIDGET), 0);
    }
}
