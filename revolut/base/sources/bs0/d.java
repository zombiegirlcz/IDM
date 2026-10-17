package bs0;

import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OrientationHelper f18023c;

    public d(int i) {
        this.f18021a = i;
    }

    public final OrientationHelper a(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f18023c;
        if (!Intrinsics.f(orientationHelper != null ? orientationHelper.getLayoutManager() : null, layoutManager)) {
            this.f18023c = layoutManager.getF53278a() ? OrientationHelper.createHorizontalHelper(layoutManager) : OrientationHelper.createVerticalHelper(layoutManager);
        }
        OrientationHelper orientationHelper2 = this.f18023c;
        if (orientationHelper2 != null) {
            return orientationHelper2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
