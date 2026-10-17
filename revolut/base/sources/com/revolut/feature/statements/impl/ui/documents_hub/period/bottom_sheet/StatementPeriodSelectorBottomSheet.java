package com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelectorBottomSheetProvider$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.period.bottom_sheet.StatementPeriodSelectorBottomSheet;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dze.n;
import e0e.b;
import e0e.c;
import e0e.e;
import e0e.h;
import eyd.b0;
import eyd.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vc.s;
import xxd.a;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/documents_hub/period/bottom_sheet/StatementPeriodSelectorBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lxxd/a;", "Le0e/e;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementPeriodSelectorBottomSheet extends BaseBottomSheetRecyclerController<a, e> {
    public static final /* synthetic */ int Z = 0;
    public final StatementPeriodSelectorBottomSheetProvider$InputData Q;
    public final TabsDelegate R;
    public final PickerDelegate S;
    public final DoublePickerDelegate T;
    public final InputTextDelegate U;
    public final DatePickerDelegate V;
    public final Object W;
    public final Object X;
    public final List Y;

    public StatementPeriodSelectorBottomSheet(StatementPeriodSelectorBottomSheetProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        TabsDelegate tabsDelegate = new TabsDelegate();
        this.R = tabsDelegate;
        PickerDelegate pickerDelegate = new PickerDelegate();
        this.S = pickerDelegate;
        DoublePickerDelegate doublePickerDelegate = new DoublePickerDelegate();
        this.T = doublePickerDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.U = inputTextDelegate;
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.V = datePickerDelegate;
        final int i = 0;
        final int i2 = 1;
        ContainerDelegate containerDelegate = new ContainerDelegate(v.k(inputTextDelegate, datePickerDelegate), null, 6);
        this.W = w.y0(new Function0(this) { // from class: e0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementPeriodSelectorBottomSheet f121567b;

            {
                this.f121567b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                StatementPeriodSelectorBottomSheet statementPeriodSelectorBottomSheet = this.f121567b;
                switch (i3) {
                    case 0:
                        int i5 = StatementPeriodSelectorBottomSheet.Z;
                        phm.a aVar = (phm.a) ue0.e.j(statementPeriodSelectorBottomSheet.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        b0 b0Var = ((b0) aVar2.b()).o;
                        StatementPeriodSelectorBottomSheetProvider$InputData statementPeriodSelectorBottomSheetProvider$InputData = statementPeriodSelectorBottomSheet.Q;
                        statementPeriodSelectorBottomSheetProvider$InputData.getClass();
                        return new z(b0Var, statementPeriodSelectorBottomSheetProvider$InputData);
                    default:
                        int i6 = StatementPeriodSelectorBottomSheet.Z;
                        z zVar = (z) statementPeriodSelectorBottomSheet.W.getValue();
                        StatementPeriodSelectorBottomSheetProvider$InputData statementPeriodSelectorBottomSheetProvider$InputData2 = zVar.f130846a;
                        zjh.i iVar = new zjh.i(new d0e.c());
                        bzd.a aVar3 = new bzd.a();
                        b0 b0Var2 = zVar.f130847b;
                        l80.e eVarH = b0Var2.f130698b.h();
                        s.j(eVarH);
                        a0e.w wVar = new a0e.w(eVarH, 1);
                        bzd.a monthPeriodCalculator = new bzd.a();
                        l80.e eVarH2 = b0Var2.f130698b.h();
                        s.j(eVarH2);
                        a0e.w taxYearPeriodCalculator = new a0e.w(eVarH2, 1);
                        Intrinsics.checkNotNullParameter(monthPeriodCalculator, "monthPeriodCalculator");
                        Intrinsics.checkNotNullParameter(taxYearPeriodCalculator, "taxYearPeriodCalculator");
                        return new h(statementPeriodSelectorBottomSheetProvider$InputData2, iVar, aVar3, wVar, new l());
                }
            }
        });
        this.X = w.y0(new Function0(this) { // from class: e0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementPeriodSelectorBottomSheet f121567b;

            {
                this.f121567b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                StatementPeriodSelectorBottomSheet statementPeriodSelectorBottomSheet = this.f121567b;
                switch (i3) {
                    case 0:
                        int i5 = StatementPeriodSelectorBottomSheet.Z;
                        phm.a aVar = (phm.a) ue0.e.j(statementPeriodSelectorBottomSheet.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b0.class, " is not found"));
                        }
                        b0 b0Var = ((b0) aVar2.b()).o;
                        StatementPeriodSelectorBottomSheetProvider$InputData statementPeriodSelectorBottomSheetProvider$InputData = statementPeriodSelectorBottomSheet.Q;
                        statementPeriodSelectorBottomSheetProvider$InputData.getClass();
                        return new z(b0Var, statementPeriodSelectorBottomSheetProvider$InputData);
                    default:
                        int i6 = StatementPeriodSelectorBottomSheet.Z;
                        z zVar = (z) statementPeriodSelectorBottomSheet.W.getValue();
                        StatementPeriodSelectorBottomSheetProvider$InputData statementPeriodSelectorBottomSheetProvider$InputData2 = zVar.f130846a;
                        zjh.i iVar = new zjh.i(new d0e.c());
                        bzd.a aVar3 = new bzd.a();
                        b0 b0Var2 = zVar.f130847b;
                        l80.e eVarH = b0Var2.f130698b.h();
                        s.j(eVarH);
                        a0e.w wVar = new a0e.w(eVarH, 1);
                        bzd.a monthPeriodCalculator = new bzd.a();
                        l80.e eVarH2 = b0Var2.f130698b.h();
                        s.j(eVarH2);
                        a0e.w taxYearPeriodCalculator = new a0e.w(eVarH2, 1);
                        Intrinsics.checkNotNullParameter(monthPeriodCalculator, "monthPeriodCalculator");
                        Intrinsics.checkNotNullParameter(taxYearPeriodCalculator, "taxYearPeriodCalculator");
                        return new h(statementPeriodSelectorBottomSheetProvider$InputData2, iVar, aVar3, wVar, new l());
                }
            }
        });
        this.Y = v.k(tabsDelegate, pickerDelegate, doublePickerDelegate, containerDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.R.f53515c.f121375b), new b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52922c), new b(this, continuation, 1), 3);
        DoublePickerDelegate doublePickerDelegate = this.T;
        ViewController.P2(this, rd0.e.b(doublePickerDelegate.f52193c), new b(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(doublePickerDelegate.d), new b(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52575g.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.f52176c.f121375b), new b(this, continuation, 4), 3);
        ViewController.P2(this, e3(), new n(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final h R2() {
        return (h) this.X.getValue();
    }
}
