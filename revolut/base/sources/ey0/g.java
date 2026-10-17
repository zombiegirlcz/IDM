package ey0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import java.util.ArrayList;
import kotlin.Unit;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearSnapHelper f130513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f130514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f130515c;
    public final /* synthetic */ SpinnerPickerView d;
    public final /* synthetic */ int e;

    public g(LinearSnapHelper linearSnapHelper, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, SpinnerPickerView spinnerPickerView, int i) {
        this.f130513a = linearSnapHelper;
        this.f130514b = linearLayoutManager;
        this.f130515c = recyclerView;
        this.d = spinnerPickerView;
        this.e = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        int[] iArrCalculateDistanceToFinalSnap;
        view.removeOnLayoutChangeListener(this);
        LinearSnapHelper linearSnapHelper = this.f130513a;
        LinearLayoutManager linearLayoutManager = this.f130514b;
        View viewFindSnapView = linearSnapHelper.findSnapView(linearLayoutManager);
        if (viewFindSnapView == null || (iArrCalculateDistanceToFinalSnap = linearSnapHelper.calculateDistanceToFinalSnap(linearLayoutManager, viewFindSnapView)) == null) {
            return;
        }
        this.f130515c.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        SpinnerPickerView spinnerPickerView = this.d;
        ArrayList arrayList = spinnerPickerView.f59698h;
        int i33 = this.e;
        ((ihm.f) arrayList.get(i33)).onNext(Unit.f186387a);
        if (i33 == v.j(spinnerPickerView.f59697g)) {
            spinnerPickerView.i.postDelayed(spinnerPickerView.o, 600L);
        }
    }
}
