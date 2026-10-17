package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeaderWithBigTileLayout f9177b;

    public /* synthetic */ e1(HeaderWithBigTileLayout headerWithBigTileLayout, int i) {
        this.f9176a = i;
        this.f9177b = headerWithBigTileLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9176a) {
            case 0:
                this.f9177b.o.onNext(Unit.f186387a);
                break;
            default:
                this.f9177b.f57273m.onNext(Unit.f186387a);
                break;
        }
    }
}
