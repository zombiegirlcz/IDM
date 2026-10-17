package fsi;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f137713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f137714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137715c;
    public WeakReference d;
    public ViewGroup.LayoutParams e;
    public boolean f;

    public f(BaseDelegatesActivity activity, d dVar) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f137713a = dVar;
        this.f137714b = new WeakReference(activity);
        this.f137715c = -1;
    }

    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f) {
            this.d = new WeakReference(view);
            this.e = layoutParams;
        } else {
            BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) this.f137714b.get();
            if (baseDelegatesActivity != null) {
                baseDelegatesActivity.V0(view, layoutParams);
            }
            this.f137713a.invoke();
        }
    }
}
