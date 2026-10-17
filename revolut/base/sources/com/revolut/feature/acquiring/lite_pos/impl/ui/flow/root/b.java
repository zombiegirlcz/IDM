package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.CatalogueManagementFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.ShoppingCartFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nd1.i;
import nd1.n;
import td1.d;
import xd1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends g implements ae1.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f60759t;
    public final i u;
    public final LitePosRootFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LitePosRootFlowContract$State f60760w;

    public b(LitePosRootFlowContract$InputData inputData, n shoppingCartInteractor, i currencyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        this.f60759t = shoppingCartInteractor;
        this.u = currencyInteractor;
        this.v = inputData.f60750a;
        this.f60760w = LitePosRootFlowContract$State.f60751a;
    }

    @Override // yji.l
    public final void O1() {
        this.f60759t.b();
        this.u.f214294b.f160406a.setValue(null);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LitePosRootFlowContract$Step step = (LitePosRootFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof LitePosRootFlowContract$Step.LitePos) {
            LitePosFlow litePosFlow = new LitePosFlow();
            final int i = 0;
            Function1 block = new Function1(this) { // from class: ae1.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b f3477b;

                {
                    this.f3477b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b result = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof b.C0450b;
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar = this.f3477b;
                            if (z) {
                                bVar.E2(LitePosRootFlowContract$Step.ShoppingCart.f60758a, true, null, false);
                            } else if (Intrinsics.f(result, b.a.f60736a)) {
                                bVar.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else {
                                if (!(result instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((e) result).f304211a, 1), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a result2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean zF = Intrinsics.f(result2, a.C0451a.f60764a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar2 = this.f3477b;
                            if (zF) {
                                bVar2.r2();
                                bVar2.E2(LitePosRootFlowContract$Step.LitePos.f60757a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
                            } else {
                                if (!Intrinsics.f(result2, a.b.f60765a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.I2();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a result3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF2 = Intrinsics.f(result3, a.C0449a.f60719a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar3 = this.f3477b;
                            if (zF2) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else if (result3 instanceof d) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails(((d) result3).f269911a), true, null, false);
                            } else if (result3 instanceof td1.c) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((td1.c) result3).f269910a, 1), true, null, false);
                            } else {
                                if (!(result3 instanceof td1.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(((td1.e) result3).f269912a, null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a result4 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean zF3 = Intrinsics.f(result4, a.C0452a.f60775a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar4 = this.f3477b;
                            if (zF3) {
                                bVar4.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else if (result4 instanceof a.b) {
                                bVar4.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((a.b) result4).f60776a, 1), true, null, false);
                            } else {
                                if (!(result4 instanceof ge1.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.G2(new fd1.a(((ge1.g) result4).f143211a));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            litePosFlow.H = block;
            return litePosFlow;
        }
        if (step instanceof LitePosRootFlowContract$Step.ShoppingCart) {
            ShoppingCartFlow shoppingCartFlow = new ShoppingCartFlow();
            final int i2 = 1;
            Function1 function1 = new Function1(this) { // from class: ae1.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b f3477b;

                {
                    this.f3477b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b result = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof b.C0450b;
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar = this.f3477b;
                            if (z) {
                                bVar.E2(LitePosRootFlowContract$Step.ShoppingCart.f60758a, true, null, false);
                            } else if (Intrinsics.f(result, b.a.f60736a)) {
                                bVar.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else {
                                if (!(result instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((e) result).f304211a, 1), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a result2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean zF = Intrinsics.f(result2, a.C0451a.f60764a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar2 = this.f3477b;
                            if (zF) {
                                bVar2.r2();
                                bVar2.E2(LitePosRootFlowContract$Step.LitePos.f60757a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
                            } else {
                                if (!Intrinsics.f(result2, a.b.f60765a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.I2();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a result3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF2 = Intrinsics.f(result3, a.C0449a.f60719a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar3 = this.f3477b;
                            if (zF2) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else if (result3 instanceof d) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails(((d) result3).f269911a), true, null, false);
                            } else if (result3 instanceof td1.c) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((td1.c) result3).f269910a, 1), true, null, false);
                            } else {
                                if (!(result3 instanceof td1.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(((td1.e) result3).f269912a, null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a result4 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean zF3 = Intrinsics.f(result4, a.C0452a.f60775a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar4 = this.f3477b;
                            if (zF3) {
                                bVar4.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else if (result4 instanceof a.b) {
                                bVar4.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((a.b) result4).f60776a, 1), true, null, false);
                            } else {
                                if (!(result4 instanceof ge1.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.G2(new fd1.a(((ge1.g) result4).f143211a));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            shoppingCartFlow.J = function1;
            return shoppingCartFlow;
        }
        if (step instanceof LitePosRootFlowContract$Step.CatalogueCategoryDetails) {
            CatalogueCategory catalogueCategory = ((LitePosRootFlowContract$Step.CatalogueCategoryDetails) step).f60752a;
            return new CatalogueDetailsFlow(catalogueCategory != null ? new CatalogueDetailsFlowContract$InputData.EditCategory(catalogueCategory) : CatalogueDetailsFlowContract$InputData.CreateCategory.f60710a);
        }
        if (step instanceof LitePosRootFlowContract$Step.CatalogueManagement) {
            CatalogueManagementFlow catalogueManagementFlow = new CatalogueManagementFlow();
            final int i3 = 2;
            Function1 function12 = new Function1(this) { // from class: ae1.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b f3477b;

                {
                    this.f3477b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b result = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof b.C0450b;
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar = this.f3477b;
                            if (z) {
                                bVar.E2(LitePosRootFlowContract$Step.ShoppingCart.f60758a, true, null, false);
                            } else if (Intrinsics.f(result, b.a.f60736a)) {
                                bVar.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else {
                                if (!(result instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((e) result).f304211a, 1), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a result2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean zF = Intrinsics.f(result2, a.C0451a.f60764a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar2 = this.f3477b;
                            if (zF) {
                                bVar2.r2();
                                bVar2.E2(LitePosRootFlowContract$Step.LitePos.f60757a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
                            } else {
                                if (!Intrinsics.f(result2, a.b.f60765a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.I2();
                            }
                            return Unit.f186387a;
                        case 2:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a result3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean zF2 = Intrinsics.f(result3, a.C0449a.f60719a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar3 = this.f3477b;
                            if (zF2) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else if (result3 instanceof d) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails(((d) result3).f269911a), true, null, false);
                            } else if (result3 instanceof td1.c) {
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((td1.c) result3).f269910a, 1), true, null, false);
                            } else {
                                if (!(result3 instanceof td1.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(((td1.e) result3).f269912a, null, 2), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a result4 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean zF3 = Intrinsics.f(result4, a.C0452a.f60775a);
                            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar4 = this.f3477b;
                            if (zF3) {
                                bVar4.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                            } else if (result4 instanceof a.b) {
                                bVar4.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((a.b) result4).f60776a, 1), true, null, false);
                            } else {
                                if (!(result4 instanceof ge1.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.G2(new fd1.a(((ge1.g) result4).f143211a));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            catalogueManagementFlow.J = function12;
            return catalogueManagementFlow;
        }
        if (step instanceof LitePosRootFlowContract$Step.CatalogueProductDetails) {
            LitePosRootFlowContract$Step.CatalogueProductDetails catalogueProductDetails = (LitePosRootFlowContract$Step.CatalogueProductDetails) step;
            CatalogueProduct catalogueProduct = catalogueProductDetails.f60754a;
            return new CatalogueDetailsFlow(catalogueProduct != null ? new CatalogueDetailsFlowContract$InputData.EditProduct(catalogueProduct) : new CatalogueDetailsFlowContract$InputData.CreateProduct(catalogueProductDetails.f60755b));
        }
        if (!(step instanceof LitePosRootFlowContract$Step.CatalogueSinglePick)) {
            throw new NoWhenBranchMatchedException();
        }
        CatalogueScreen catalogueScreen = new CatalogueScreen(new CatalogueScreenContract$InputData(true));
        final int i5 = 3;
        Function1 block2 = new Function1(this) { // from class: ae1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b f3477b;

            {
                this.f3477b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b result = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof b.C0450b;
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar = this.f3477b;
                        if (z) {
                            bVar.E2(LitePosRootFlowContract$Step.ShoppingCart.f60758a, true, null, false);
                        } else if (Intrinsics.f(result, b.a.f60736a)) {
                            bVar.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                        } else {
                            if (!(result instanceof e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((e) result).f304211a, 1), true, null, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a result2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.shopping_cart.a) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        boolean zF = Intrinsics.f(result2, a.C0451a.f60764a);
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar2 = this.f3477b;
                        if (zF) {
                            bVar2.r2();
                            bVar2.E2(LitePosRootFlowContract$Step.LitePos.f60757a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
                        } else {
                            if (!Intrinsics.f(result2, a.b.f60765a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.I2();
                        }
                        return Unit.f186387a;
                    case 2:
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a result3 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a) obj2;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        boolean zF2 = Intrinsics.f(result3, a.C0449a.f60719a);
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar3 = this.f3477b;
                        if (zF2) {
                            bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                        } else if (result3 instanceof d) {
                            bVar3.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails(((d) result3).f269911a), true, null, false);
                        } else if (result3 instanceof td1.c) {
                            bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((td1.c) result3).f269910a, 1), true, null, false);
                        } else {
                            if (!(result3 instanceof td1.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar3.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(((td1.e) result3).f269912a, null, 2), true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a result4 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a) obj2;
                        Intrinsics.checkNotNullParameter(result4, "result");
                        boolean zF3 = Intrinsics.f(result4, a.C0452a.f60775a);
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b bVar4 = this.f3477b;
                        if (zF3) {
                            bVar4.E2(new LitePosRootFlowContract$Step.CatalogueCategoryDetails((CatalogueCategory) null), true, null, false);
                        } else if (result4 instanceof a.b) {
                            bVar4.E2(new LitePosRootFlowContract$Step.CatalogueProductDetails(null, ((a.b) result4).f60776a, 1), true, null, false);
                        } else {
                            if (!(result4 instanceof ge1.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar4.G2(new fd1.a(((ge1.g) result4).f143211a));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        catalogueScreen.H = block2;
        return catalogueScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f60760w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
