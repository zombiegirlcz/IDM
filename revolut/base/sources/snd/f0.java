package snd;

import com.revolut.core.ui_kit.delegates.widgets.ChartWithDetailsLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.v7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f264532b;

    public /* synthetic */ f0(i0 i0Var, int i) {
        this.f264531a = i;
        this.f264532b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f264531a;
        i0 i0Var = this.f264532b;
        Function0 it8 = (Function0) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB = zhm.u.b();
                v7.C("LOADING_SUBHEADER_ID", 0, 0, 30, eVarB);
                boolean z = i0Var.f264541g;
                eVarB.add(z ? new ChartWithDetailsLoadingWidgetDelegate.Model("LOADING_WIDGET_ID1", null, 6) : TileLoadingWidgetDelegate.Model.Companion.a(TileLoadingWidgetDelegate.Model.INSTANCE, "LOADING_WIDGET_ID1", 6));
                eVarB.add(new TileLoadingWidgetDelegate.Model(6, (Clause) null, "LOADING_WIDGET_ID2"));
                eVarB.add(new TileLoadingWidgetDelegate.Model(6, (Clause) null, "LOADING_WIDGET_ID3"));
                if (!z) {
                    v7.C("LOADING_SUBHEADER_ID2", 0, 0, 30, eVarB);
                }
                eVarB.add(TileLoadingWidgetDelegate.Model.Companion.a(TileLoadingWidgetDelegate.Model.INSTANCE, "LOADING_WIDGET_ID4", 6));
                return zhm.u.a(eVarB);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                gu guVar = new gu("TOOLS_SECTION_ID", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "TOOLS_LOADING_ITEM_ID", false, 0, false, 30);
                return i0Var.f264541g ? yp0.b.j(pb0VarB, guVar, yp0.e0.INSIDE_BOX, 124) : zhm.v.k(guVar, pb0VarB);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB2 = zhm.u.b();
                if (!i0Var.f264541g) {
                    v7.C("BUDGETING_SECTION_ID", 0, 0, 30, eVarB2);
                }
                eVarB2.add(TileLoadingWidgetDelegate.Model.Companion.a(TileLoadingWidgetDelegate.Model.INSTANCE, "LOADING_WIDGET_ID4", 6));
                return zhm.u.a(eVarB2);
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB3 = zhm.u.b();
                if (!i0Var.f264541g) {
                    v7.C("OVERVIEW_SECTION_ID", 0, 0, 30, eVarB3);
                }
                eVarB3.add(TileLoadingWidgetDelegate.Model.Companion.a(TileLoadingWidgetDelegate.Model.INSTANCE, "LOADING_WIDGET_ID5", 6));
                return zhm.u.a(eVarB3);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return zhm.v.k(new gu("LOADING_SUBHEADER_ID", 0, 0, 30), i0Var.f264541g ? new ChartWithDetailsLoadingWidgetDelegate.Model("LOADING_WIDGET_ID1", null, 6) : TileLoadingWidgetDelegate.Model.Companion.a(TileLoadingWidgetDelegate.Model.INSTANCE, "LOADING_WIDGET_ID1", 6), new TileLoadingWidgetDelegate.Model(6, (Clause) null, "LOADING_WIDGET_ID2"), new TileLoadingWidgetDelegate.Model(6, (Clause) null, "LOADING_WIDGET_ID3"));
        }
    }
}
