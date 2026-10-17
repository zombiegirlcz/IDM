package unj;

import android.view.View;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f281451a;

    public n() {
        this(0);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(v, "v");
        for (View view : this.f281451a) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i5 - i2);
        }
    }

    public n(int i) {
        LinkedHashSet targets = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(targets, "targets");
        this.f281451a = targets;
    }
}
