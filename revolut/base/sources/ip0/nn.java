package ip0;

import android.graphics.RectF;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;

/* JADX INFO: loaded from: classes19.dex */
public final class nn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f165541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ on f165542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f165543c;

    public nn(View view, on onVar, boolean z) {
        this.f165541a = view;
        this.f165542b = onVar;
        this.f165543c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RectF selectedItemRect;
        on onVar = this.f165542b;
        ChartHeaderView chartHeaderView = onVar.f165693g;
        int iCenterX = 0;
        if (!this.f165543c && (selectedItemRect = onVar.f.getSelectedItemRect()) != null) {
            iCenterX = (int) selectedItemRect.centerX();
        }
        chartHeaderView.setFloatingPosition(iCenterX);
    }
}
