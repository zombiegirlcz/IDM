package hnb;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.feature.add.new_product.impl.gateway.AddNewProductGroupDestination;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.feature.add.new_product.impl.ui.add_new_product_group.AddNewProductGroupScreen;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsProductDocumentsDestination;
import com.revolut.feature.retail.savings.api.documents.navigation.TaxFormsDestination;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.open_document.SavingsDocumentLauncherFlow;
import com.revolut.feature.retail.savings.impl.documents.presentation.open_document.SavingsDocumentLauncherFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection.SavingsSelectionScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.tax_form.TaxFormsScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yf1.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f154079b;

    public a(ImmutableSet deeplinkGateways, int i) {
        this.f154078a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f154079b = deeplinkGateways;
                break;
            default:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f154079b = deeplinkGateways;
                break;
        }
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        switch (this.f154078a) {
            case 0:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (!(descriptor instanceof cjb.b)) {
                    return null;
                }
                cjb.b bVar = (cjb.b) descriptor;
                return bVar.a(new SavingsSelectionScreen(bVar.f24631a));
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (!(descriptor instanceof nf1.a)) {
                    return null;
                }
                nf1.a aVar = (nf1.a) descriptor;
                return aVar.a(new AddNewProductScreen(new n(aVar.f214800a)));
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        com.revolut.kompot.navigable.a productDocumentsScreen;
        switch (this.f154078a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof TaxFormsDestination) {
                    return new TaxFormsScreen();
                }
                if (destination instanceof SavingsDocumentLauncherDestination) {
                    productDocumentsScreen = new SavingsDocumentLauncherFlow(new SavingsDocumentLauncherFlowContract$InputData(((SavingsDocumentLauncherDestination) destination).f83142a));
                } else {
                    if (!(destination instanceof SavingsProductDocumentsDestination)) {
                        return null;
                    }
                    SavingsProductDocumentsDestination savingsProductDocumentsDestination = (SavingsProductDocumentsDestination) destination;
                    productDocumentsScreen = new ProductDocumentsScreen(new ProductDocumentsContract$InputData(savingsProductDocumentsDestination.f83143a, savingsProductDocumentsDestination.f83144b, 4));
                }
                return productDocumentsScreen;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof AddNewProductDestination) {
                    return new AddNewProductScreen(new n(((AddNewProductDestination) destination).f60851a));
                }
                if (!(destination instanceof AddNewProductGroupDestination)) {
                    return null;
                }
                AddNewProductGroupDestination addNewProductGroupDestination = (AddNewProductGroupDestination) destination;
                return new AddNewProductGroupScreen(new ag1.b(addNewProductGroupDestination.f60853a, addNewProductGroupDestination.f60854b, addNewProductGroupDestination.f60855c));
        }
    }

    @Override // aii.p
    public final Set h() {
        switch (this.f154078a) {
        }
        return this.f154079b;
    }
}
