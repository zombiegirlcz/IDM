package mx0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c8 extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f209636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209636b = (LinearLayout) this.f22677a;
    }

    @Override // cam.f
    public final View p() {
        return this.f209636b;
    }
}
