package es0;

import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import com.rd.PageIndicatorView;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f128849b;

    public /* synthetic */ x(View view, int i) {
        this.f128848a = i;
        this.f128849b = view;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f128848a;
        View view = this.f128849b;
        switch (i) {
            case 0:
                ((b0) view).n();
                break;
            default:
                Handler handler = PageIndicatorView.f;
                ((PageIndicatorView) view).h();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.f128848a) {
            case 0:
                ((b0) this.f128849b).n();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
