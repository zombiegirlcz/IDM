package gpd;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.k1;
import tof.a3;
import tof.i3;
import tof.j3;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryManagementListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CategoryManagementListController categoryManagementListController, Continuation continuation) {
        super(2, continuation);
        this.v = categoryManagementListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((IconDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CategoryColor categoryColor;
        CategoryColor categoryColor2;
        IconDelegate.Model model = (IconDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.M.getValue();
        Intrinsics.h(model);
        final com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b) cVar;
        CategoryManagementListContract$InputData categoryManagementListContract$InputData = bVar.o;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52483a;
        Object obj3 = model.i;
        final int i = 1;
        if (Intrinsics.f(str, "ADD_CATEGORY_ID")) {
            String str2 = categoryManagementListContract$InputData.f87655a;
            CategoryManagementListContract$Mode categoryManagementListContract$Mode = categoryManagementListContract$InputData.f87656b;
            CategoryManagementListContract$Mode.Select select = categoryManagementListContract$Mode instanceof CategoryManagementListContract$Mode.Select ? (CategoryManagementListContract$Mode.Select) categoryManagementListContract$Mode : null;
            final int i2 = 0;
            yji.l.j2(bVar, new CategoryManagementCustomController(new CategoryManagementCustomContract$InputData(str2, select != null ? select.f87658a : null, CategoryManagementCustomContract$Mode.AddNew.f87645a)), null, new Function1() { // from class: gpd.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    epd.e eVar = (epd.e) obj4;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                            i3 i3Var = eVar.f128162a;
                            com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar2 = bVar;
                            ((k1) bVar2.f87662q.f116872n).d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.analytics_categories_toast_created, null, null, 14), null, 60));
                            bVar2.I2(i3Var);
                            return Unit.f186387a;
                        case 1:
                            Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                            i3 i3Var2 = eVar.f128162a;
                            epd.d dVar = eVar.f128163b;
                            com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar3 = bVar;
                            bVar3.I2(i3Var2);
                            dpd.k kVar = bVar3.f87662q;
                            int i3 = k.f145445a[dVar.ordinal()];
                            if (i3 == 1) {
                                kVar.e3();
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                kVar.d3();
                            }
                            return Unit.f186387a;
                        default:
                            Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                            int i5 = k.f145445a[eVar.f128163b.ordinal()];
                            com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar4 = bVar;
                            if (i5 == 1) {
                                bVar4.f87662q.e3();
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.f87662q.d3();
                            }
                            return Unit.f186387a;
                    }
                }
            }, 1);
        } else {
            CategoryManagementListContract$Mode categoryManagementListContract$Mode2 = categoryManagementListContract$InputData.f87656b;
            String str3 = categoryManagementListContract$InputData.f87655a;
            if (categoryManagementListContract$Mode2 instanceof CategoryManagementListContract$Mode.Select) {
                i3 i3Var = ((b) ((j2) bVar.f87664s.f22677a).getValue()).f145437b;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transactions.models.TransactionCategory");
                i3 i3Var2 = (i3) obj3;
                if (!i3Var2.equals(i3Var)) {
                    bVar.I2(i3Var2);
                    bVar.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.a(bVar, i3Var2, i3Var, null), new yi5.b(26));
                } else if (i3Var2 instanceof j3) {
                    a3 a3Var = ((CategoryManagementListContract$Mode.Select) categoryManagementListContract$InputData.f87656b).f87658a;
                    j3 j3Var = (j3) i3Var2;
                    String str4 = j3Var.f272843a;
                    String str5 = j3Var.f272845c;
                    CategoryImage categoryImage = j3Var.d;
                    if (categoryImage != null && (categoryColor2 = j3Var.e) != null) {
                        yji.l.j2(bVar, new CategoryManagementCustomController(new CategoryManagementCustomContract$InputData(str3, a3Var, new CategoryManagementCustomContract$Mode.Edit(categoryColor2, categoryImage, str4, str5))), null, new Function1() { // from class: gpd.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                epd.e eVar = (epd.e) obj4;
                                switch (i) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                                        i3 i3Var3 = eVar.f128162a;
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar2 = bVar;
                                        ((k1) bVar2.f87662q.f116872n).d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.analytics_categories_toast_created, null, null, 14), null, 60));
                                        bVar2.I2(i3Var3);
                                        return Unit.f186387a;
                                    case 1:
                                        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                                        i3 i3Var22 = eVar.f128162a;
                                        epd.d dVar = eVar.f128163b;
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar3 = bVar;
                                        bVar3.I2(i3Var22);
                                        dpd.k kVar = bVar3.f87662q;
                                        int i3 = k.f145445a[dVar.ordinal()];
                                        if (i3 == 1) {
                                            kVar.e3();
                                        } else {
                                            if (i3 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            kVar.d3();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                                        int i5 = k.f145445a[eVar.f128163b.ordinal()];
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar4 = bVar;
                                        if (i5 == 1) {
                                            bVar4.f87662q.e3();
                                        } else {
                                            if (i5 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar4.f87662q.d3();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        }, 1);
                    }
                }
            } else if (categoryManagementListContract$Mode2 instanceof CategoryManagementListContract$Mode.Manage) {
                j3 j3Var2 = obj3 instanceof j3 ? (j3) obj3 : null;
                if (j3Var2 != null) {
                    String str6 = j3Var2.f272843a;
                    String str7 = j3Var2.f272845c;
                    CategoryImage categoryImage2 = j3Var2.d;
                    if (categoryImage2 != null && (categoryColor = j3Var2.e) != null) {
                        final int i3 = 2;
                        yji.l.j2(bVar, new CategoryManagementCustomController(new CategoryManagementCustomContract$InputData(str3, null, new CategoryManagementCustomContract$Mode.Edit(categoryColor, categoryImage2, str6, str7))), null, new Function1() { // from class: gpd.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                epd.e eVar = (epd.e) obj4;
                                switch (i3) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                                        i3 i3Var3 = eVar.f128162a;
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar2 = bVar;
                                        ((k1) bVar2.f87662q.f116872n).d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.analytics_categories_toast_created, null, null, 14), null, 60));
                                        bVar2.I2(i3Var3);
                                        return Unit.f186387a;
                                    case 1:
                                        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                                        i3 i3Var22 = eVar.f128162a;
                                        epd.d dVar = eVar.f128163b;
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar3 = bVar;
                                        bVar3.I2(i3Var22);
                                        dpd.k kVar = bVar3.f87662q;
                                        int i32 = k.f145445a[dVar.ordinal()];
                                        if (i32 == 1) {
                                            kVar.e3();
                                        } else {
                                            if (i32 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            kVar.d3();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                                        int i5 = k.f145445a[eVar.f128163b.ordinal()];
                                        com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b bVar4 = bVar;
                                        if (i5 == 1) {
                                            bVar4.f87662q.e3();
                                        } else {
                                            if (i5 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar4.f87662q.d3();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        }, 1);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
