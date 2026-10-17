package tw0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274888a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i, Context context) {
        super(context);
        this.f274888a = i;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDyToMakeVisible(View view, int i) {
        return super.calculateDyToMakeVisible(view, i) + this.f274888a;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int getVerticalSnapPreference() {
        return -1;
    }
}
