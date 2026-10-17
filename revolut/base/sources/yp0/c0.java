package yp0;

import android.app.Activity;
import android.util.SparseArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f315716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f315717b;

    public c0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f315716a = activity;
        this.f315717b = new SparseArray();
    }

    public final Object a(int i) {
        Object obj2 = this.f315717b.get(i);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public final void b(int i, Object obj2) {
        this.f315717b.put(i, obj2);
    }
}
