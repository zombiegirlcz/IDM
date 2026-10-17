package ts0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChartHeaderView f273888b;

    public /* synthetic */ m(ChartHeaderView chartHeaderView, int i) {
        this.f273887a = i;
        this.f273888b = chartHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f273887a) {
            case 0:
                Intrinsics.h(view);
                this.f273888b.f56609b.onNext(Unit.f186387a);
                break;
            default:
                Intrinsics.h(view);
                this.f273888b.f56610c.onNext(Unit.f186387a);
                break;
        }
    }
}
