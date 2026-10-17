package u2m;

import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9 f276714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f276715b;

    public d(c9 clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f276714a = clickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(v);
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getState() == Lifecycle.State.RESUMED && SystemClock.elapsedRealtime() - this.f276715b >= 300) {
            this.f276715b = SystemClock.elapsedRealtime();
            this.f276714a.onClick(v);
        }
    }
}
