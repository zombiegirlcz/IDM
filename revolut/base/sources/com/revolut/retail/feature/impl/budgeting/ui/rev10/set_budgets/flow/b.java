package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow;

import android.os.Parcelable;
import asj.e;
import asj.h;
import asj.j;
import asj.l;
import asj.p;
import asj.r;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.impl.budgeting.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$Step;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import dki.g;
import erd.c;
import esj.s;
import esj.t;
import grj.i;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import v13.d;
import vkm.j2;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends g implements j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SetBudgetsFlowContract$InputData f101543t;
    public final pzi.b u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tzi.a f101544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f101545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SetBudgetsFlowContract$Step f101546y;
    public final EmptyFlowState z;

    @NotNull
    private static final l Companion = new l();
    public static final String A = d.u(qzi.l.OVERALL);

    public b(SetBudgetsFlowContract$InputData inputData, pzi.b budgetingInteractor, c setBudgetsStatusDialogProvider, tzi.a budgetingCycleInteractor) {
        SetBudgetsFlowContract$Step categoryBudgets;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(setBudgetsStatusDialogProvider, "setBudgetsStatusDialogProvider");
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        this.f101543t = inputData;
        this.u = budgetingInteractor;
        this.v = setBudgetsStatusDialogProvider;
        this.f101544w = budgetingCycleInteractor;
        this.f101545x = q.c(new r(e.f8937a, h.f8939a, asj.b.f8935a));
        if (inputData instanceof SetBudgetsFlowContract$InputData.SetBudget) {
            categoryBudgets = new SetBudgetsFlowContract$Step.OverallBudget(bsj.a.CREATE);
        } else if (inputData instanceof SetBudgetsFlowContract$InputData.UpdateOverallBudget) {
            categoryBudgets = new SetBudgetsFlowContract$Step.OverallBudget(bsj.a.UPDATE);
        } else {
            if (!(inputData instanceof SetBudgetsFlowContract$InputData.SetCategoriesBudget)) {
                throw new NoWhenBranchMatchedException();
            }
            categoryBudgets = new SetBudgetsFlowContract$Step.CategoryBudgets(((SetBudgetsFlowContract$InputData.SetCategoriesBudget) inputData).f101533a);
        }
        this.f101546y = categoryBudgets;
        this.z = EmptyFlowState.f98428a;
    }

    public static final void O2(b bVar, uzi.b budgetingCycle) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        c cVar = bVar.v;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        uzi.c cVar2 = budgetingCycle.f284679a;
        int[] iArr = zrj.c.f324742a;
        int i = iArr[cVar2.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_budget_screen_successful_creation_dialog_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_budget_screen_successful_creation_dialog_weekly_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        int i2 = budgetingCycle.f284680b;
        int i3 = iArr[cVar2.ordinal()];
        if (i3 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_budget_screen_successful_update_dialog_monthly_message_format, u.c(Integer.valueOf(i2)), null, 12);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_budget_screen_successful_update_dialog_weekly_message_format, u.c(((cnd.b) cVar.f128645a).a(i2)), null, 12);
        }
        yji.l.b1(bVar, bVar.X1(new y0(null, new j0((Clause) textLocalisedClause3, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5)), null, new p(bVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (skm.e0.J(r6, r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof asj.q
            if (r0 == 0) goto L13
            r0 = r7
            asj.q r0 = (asj.q) r0
            int r1 = r0.f8947w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8947w = r1
            goto L18
        L13:
            asj.q r0 = new asj.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8947w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)
            goto L8a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L57
        L36:
            yhm.o.b(r7)
            tzi.a r7 = r6.f101544w
            com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData r2 = r6.f101543t
            java.lang.String r2 = Q2(r2)
            sfm.b r7 = tzi.a.a(r7, r2)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f8947w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L57
            goto L89
        L57:
            uzi.b r7 = (uzi.b) r7
            vkm.j2 r2 = r6.f101545x
            java.lang.Object r2 = r2.getValue()
            asj.r r2 = (asj.r) r2
            asj.c r2 = r2.f8950c
            boolean r3 = r2 instanceof asj.a
            if (r3 == 0) goto L8d
            r3 = r2
            asj.a r3 = (asj.a) r3
            uzi.b r3 = r3.f8934a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r3, r7)
            if (r7 == 0) goto L75
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L75:
            ald.l r7 = new ald.l
            r3 = 10
            r5 = 0
            r7.<init>(r6, r2, r5, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.f8947w = r4
            java.lang.Object r6 = skm.e0.J(r6, r7, r0)
            if (r6 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L8d:
            boolean r6 = r2 instanceof asj.b
            if (r6 == 0) goto L94
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L94:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b.P2(com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b, gim.c):java.lang.Object");
    }

    public static String Q2(SetBudgetsFlowContract$InputData setBudgetsFlowContract$InputData) {
        AccountId f101537b = setBudgetsFlowContract$InputData.getF101537b();
        AccountId.Joint joint = f101537b instanceof AccountId.Joint ? (AccountId.Joint) f101537b : null;
        if (joint == null) {
            return null;
        }
        String id10 = joint.f51413b;
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10;
    }

    public final Object R2(dj0.d dVar, List list, a aVar) {
        String str;
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            str = A;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((qzi.a) next).d, str)) {
                break;
            }
        }
        qzi.a aVar2 = (qzi.a) next;
        if (aVar2 != null && !Intrinsics.f(aVar2.f250648c, dVar)) {
            Object objB = nim.a.b(((i) this.u).f(dVar, aVar2.f250646a, str, this.f101543t.getF101537b()), aVar);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
        }
        return Unit.f186387a;
    }

    public final void S2(r newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        j2 j2Var = this.f101545x;
        j2Var.getClass();
        j2Var.g(null, newState);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        csj.h hVar;
        SetBudgetsFlowContract$Step step = (SetBudgetsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof SetBudgetsFlowContract$Step.CategoryBudgets;
        SetBudgetsFlowContract$InputData setBudgetsFlowContract$InputData = this.f101543t;
        if (!z) {
            if (!(step instanceof SetBudgetsFlowContract$Step.OverallBudget)) {
                throw new NoWhenBranchMatchedException();
            }
            SetOverallBudgetScreen setOverallBudgetScreen = new SetOverallBudgetScreen(new SetOverallBudgetScreenContract$InputData(((SetBudgetsFlowContract$Step.OverallBudget) step).f101540a, setBudgetsFlowContract$InputData.getF101537b(), setBudgetsFlowContract$InputData.getF101538c()));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: asj.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b f8941b;

                {
                    this.f8941b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar = this.f8941b;
                            j2 j2Var = bVar.f101545x;
                            esj.u outputResult = (esj.u) obj2;
                            Intrinsics.checkNotNullParameter(outputResult, "outputResult");
                            Continuation continuation = null;
                            if (outputResult instanceof esj.p) {
                                r rVar = (r) j2Var.getValue();
                                dj0.d dVar = ((esj.p) outputResult).f128979a;
                                bVar.S2(r.a(rVar, null, new g(dVar), null, 5));
                                bVar.E2(new SetBudgetsFlowContract$Step.CategoryBudgets(dVar), true, null, false);
                            } else if (outputResult instanceof t) {
                                bVar.S2(r.a((r) j2Var.getValue(), null, new g(((t) outputResult).f128984a), null, 5));
                                bVar.n2(new o(bVar, continuation, 1), new whi.b(6));
                            } else if (outputResult instanceof s) {
                                bVar.n2(new o(bVar, continuation, 0), new whi.b(6));
                            } else if (outputResult instanceof esj.r) {
                                r rVar2 = (r) j2Var.getValue();
                                dj0.d dVar2 = ((esj.r) outputResult).f128982a;
                                bVar.S2(r.a(rVar2, null, new g(dVar2), null, 5));
                                bVar.E2(new SetBudgetsFlowContract$Step.CategoryBudgets(dVar2), true, null, false);
                            } else {
                                if (!(outputResult instanceof esj.q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                esj.q qVar = (esj.q) outputResult;
                                bVar.S2(r.a((r) j2Var.getValue(), null, new g(qVar.f128981b), new a(qVar.f128980a), 1));
                            }
                            return Unit.f186387a;
                        default:
                            csj.m outputData = (csj.m) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar2 = this.f8941b;
                            Continuation continuation2 = null;
                            bVar2.S2(r.a((r) bVar2.f101545x.getValue(), new d(outputData.g()), new g(outputData.f()), null, 4));
                            if (outputData instanceof csj.l) {
                                bVar2.n2(new o(bVar2, continuation2, 1), new whi.b(6));
                            } else {
                                if (!(outputData instanceof csj.k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.q2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            setOverallBudgetScreen.H = function1;
            return setOverallBudgetScreen;
        }
        dj0.d dVar = ((SetBudgetsFlowContract$Step.CategoryBudgets) step).f101539a;
        if (setBudgetsFlowContract$InputData instanceof SetBudgetsFlowContract$InputData.SetBudget) {
            hVar = csj.h.UPDATE_REMOTELY;
        } else if (setBudgetsFlowContract$InputData instanceof SetBudgetsFlowContract$InputData.UpdateOverallBudget) {
            hVar = csj.h.UPDATE_LOCALLY;
        } else {
            if (!(setBudgetsFlowContract$InputData instanceof SetBudgetsFlowContract$InputData.SetCategoriesBudget)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = csj.h.UPDATE_REMOTELY;
        }
        csj.h hVar2 = hVar;
        AccountId f101537b = setBudgetsFlowContract$InputData.getF101537b();
        SetBudgetsFlowContract$InputData.SetCategoriesBudget setCategoriesBudget = setBudgetsFlowContract$InputData instanceof SetBudgetsFlowContract$InputData.SetCategoriesBudget ? (SetBudgetsFlowContract$InputData.SetCategoriesBudget) setBudgetsFlowContract$InputData : null;
        boolean z3 = false;
        if (setCategoriesBudget != null && !setCategoriesBudget.d) {
            z3 = true;
        }
        SetCategoryBudgetsScreen setCategoryBudgetsScreen = new SetCategoryBudgetsScreen(new SetCategoryBudgetsScreenContract$InputData(dVar, hVar2, f101537b, !z3, setBudgetsFlowContract$InputData instanceof SetBudgetsFlowContract$InputData.SetBudget, setBudgetsFlowContract$InputData.getF101538c()));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: asj.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b f8941b;

            {
                this.f8941b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar = this.f8941b;
                        j2 j2Var = bVar.f101545x;
                        esj.u outputResult = (esj.u) obj2;
                        Intrinsics.checkNotNullParameter(outputResult, "outputResult");
                        Continuation continuation = null;
                        if (outputResult instanceof esj.p) {
                            r rVar = (r) j2Var.getValue();
                            dj0.d dVar2 = ((esj.p) outputResult).f128979a;
                            bVar.S2(r.a(rVar, null, new g(dVar2), null, 5));
                            bVar.E2(new SetBudgetsFlowContract$Step.CategoryBudgets(dVar2), true, null, false);
                        } else if (outputResult instanceof t) {
                            bVar.S2(r.a((r) j2Var.getValue(), null, new g(((t) outputResult).f128984a), null, 5));
                            bVar.n2(new o(bVar, continuation, 1), new whi.b(6));
                        } else if (outputResult instanceof s) {
                            bVar.n2(new o(bVar, continuation, 0), new whi.b(6));
                        } else if (outputResult instanceof esj.r) {
                            r rVar2 = (r) j2Var.getValue();
                            dj0.d dVar22 = ((esj.r) outputResult).f128982a;
                            bVar.S2(r.a(rVar2, null, new g(dVar22), null, 5));
                            bVar.E2(new SetBudgetsFlowContract$Step.CategoryBudgets(dVar22), true, null, false);
                        } else {
                            if (!(outputResult instanceof esj.q)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            esj.q qVar = (esj.q) outputResult;
                            bVar.S2(r.a((r) j2Var.getValue(), null, new g(qVar.f128981b), new a(qVar.f128980a), 1));
                        }
                        return Unit.f186387a;
                    default:
                        csj.m outputData = (csj.m) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar2 = this.f8941b;
                        Continuation continuation2 = null;
                        bVar2.S2(r.a((r) bVar2.f101545x.getValue(), new d(outputData.g()), new g(outputData.f()), null, 4));
                        if (outputData instanceof csj.l) {
                            bVar2.n2(new o(bVar2, continuation2, 1), new whi.b(6));
                        } else {
                            if (!(outputData instanceof csj.k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.q2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        setCategoryBudgetsScreen.H = function12;
        return setCategoryBudgetsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f101546y;
    }
}
