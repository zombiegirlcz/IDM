package com.revolut.uicomponent.toolbar.app_bar;

import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.DraggableRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.zf;
import ip0.bf;
import ip0.df;
import ip0.l8;
import kotlin.jvm.internal.Intrinsics;
import or0.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107289c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f107287a = i;
        this.f107288b = obj2;
        this.f107289c = obj3;
        this.d = obj4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f107287a;
        Object obj2 = this.d;
        Object obj3 = this.f107289c;
        Object obj4 = this.f107288b;
        switch (i) {
            case 0:
                break;
            case 1:
                l8 l8Var = (l8) obj4;
                CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) obj3;
                CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = (CellDetailsSwitcherDelegate) obj2;
                if (motionEvent.getAction() == 1) {
                    u.k(l8Var.f165145g).n0().a(l8Var.f165145g, model, new py0.c(model.f51914b));
                    cellDetailsSwitcherDelegate.f51912c.onNext(model);
                }
                break;
            case 2:
                df dfVar = (df) obj4;
                DraggableRowDelegate draggableRowDelegate = (DraggableRowDelegate) obj3;
                bf bfVar = (bf) obj2;
                TouchDelegate touchDelegate = dfVar.f163885g.getTouchDelegate();
                if ((touchDelegate == null || !touchDelegate.onTouchEvent(motionEvent)) && motionEvent.getAction() == 0) {
                    draggableRowDelegate.e.onNext(bfVar);
                    ItemTouchHelper itemTouchHelper = draggableRowDelegate.f52206c;
                    if (itemTouchHelper != null) {
                        itemTouchHelper.startDrag(dfVar);
                    }
                }
                break;
            default:
                RowDelegate rowDelegate = (RowDelegate) obj4;
                zf zfVar = (zf) obj3;
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                RowDelegate.Companion companion = RowDelegate.INSTANCE;
                if (motionEvent.getAction() == 1) {
                    View itemView = zfVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    RowDelegate.C(itemView, model2);
                    rowDelegate.f53225r.onNext(model2);
                }
                break;
        }
        return true;
    }
}
