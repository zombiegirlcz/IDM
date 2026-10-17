package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeaderWithBigTileLayout f9300b;

    public /* synthetic */ o1(HeaderWithBigTileLayout headerWithBigTileLayout, int i) {
        this.f9299a = i;
        this.f9300b = headerWithBigTileLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        switch (this.f9299a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                d1.a(this.f9300b.J);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                d1.a(this.f9300b.J);
                break;
        }
    }
}
