package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sd1.b;
import ye1.j;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CatalogueDetailsFlowContract$Step f60717t;
    public final EmptyFlowState u;

    public a(CatalogueDetailsFlowContract$InputData inputData) {
        CatalogueDetailsFlowContract$Step productDetails;
        CatalogueDetailsFlowContract$Step categoryDetails;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (Intrinsics.f(inputData, CatalogueDetailsFlowContract$InputData.CreateCategory.f60710a)) {
            categoryDetails = new CatalogueDetailsFlowContract$Step.CategoryDetails(null);
        } else {
            if (inputData instanceof CatalogueDetailsFlowContract$InputData.CreateProduct) {
                productDetails = new CatalogueDetailsFlowContract$Step.ProductDetails(null, ((CatalogueDetailsFlowContract$InputData.CreateProduct) inputData).f60711a, 1);
            } else if (inputData instanceof CatalogueDetailsFlowContract$InputData.EditCategory) {
                productDetails = new CatalogueDetailsFlowContract$Step.CategoryDetails(((CatalogueDetailsFlowContract$InputData.EditCategory) inputData).f60712a);
            } else {
                if (!(inputData instanceof CatalogueDetailsFlowContract$InputData.EditProduct)) {
                    throw new NoWhenBranchMatchedException();
                }
                productDetails = new CatalogueDetailsFlowContract$Step.ProductDetails(((CatalogueDetailsFlowContract$InputData.EditProduct) inputData).f60713a, null, 2);
            }
            categoryDetails = productDetails;
        }
        this.f60717t = categoryDetails;
        this.u = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CatalogueDetailsFlowContract$Step step = (CatalogueDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CatalogueDetailsFlowContract$Step.CategoryDetails) {
            CategoryDetailsScreen categoryDetailsScreen = new CategoryDetailsScreen(new CategoryDetailsScreenContract$InputData(((CatalogueDetailsFlowContract$Step.CategoryDetails) step).f60714a));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: sd1.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.a f261802b;

                {
                    this.f261802b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            je1.g it8 = (je1.g) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f261802b.q2();
                            return Unit.f186387a;
                        default:
                            j result = (j) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, j.a.f312752a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f261802b.E2(new CatalogueDetailsFlowContract$Step.CategoryDetails(null), true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            categoryDetailsScreen.H = block;
            return categoryDetailsScreen;
        }
        if (!(step instanceof CatalogueDetailsFlowContract$Step.ProductDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        CatalogueDetailsFlowContract$Step.ProductDetails productDetails = (CatalogueDetailsFlowContract$Step.ProductDetails) step;
        CatalogueProductDetailsScreen catalogueProductDetailsScreen = new CatalogueProductDetailsScreen(new ProductDetailsScreenContract$InputData(productDetails.f60715a, productDetails.f60716b));
        final int i2 = 1;
        Function1 block2 = new Function1(this) { // from class: sd1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.a f261802b;

            {
                this.f261802b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        je1.g it8 = (je1.g) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f261802b.q2();
                        return Unit.f186387a;
                    default:
                        j result = (j) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!Intrinsics.f(result, j.a.f312752a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f261802b.E2(new CatalogueDetailsFlowContract$Step.CategoryDetails(null), true, null, false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        catalogueProductDetailsScreen.H = block2;
        return catalogueProductDetailsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f60717t;
    }
}
