package ix0;

import android.view.View;
import au0.x4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f169232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169233b;

    public f1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f169232a = view;
        view.addOnAttachStateChangeListener(new x4(this, 1));
    }

    public final void a(e1 source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iOrdinal = z ? (1 << source.ordinal()) | this.f169233b : (~(1 << source.ordinal())) & this.f169233b;
        this.f169233b = iOrdinal;
        int i = iOrdinal == 0 ? 0 : 2;
        View view = this.f169232a;
        if (i != view.getLayerType()) {
            view.setLayerType(i, null);
        }
    }
}
