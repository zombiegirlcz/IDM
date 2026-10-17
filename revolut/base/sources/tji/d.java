package tji;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f271782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f271783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f271784c;
    public n d;
    public final Handler e;

    public d(Activity activity, o loadingDialogFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadingDialogFactory, "loadingDialogFactory");
        this.f271782a = activity;
        this.f271783b = loadingDialogFactory;
        this.e = new Handler(Looper.getMainLooper());
    }

    public static final void a(d dVar, long j2) {
        int i = dVar.f271784c;
        if (i > 0) {
            dVar.f271784c = i + 1;
        } else {
            if (dVar.f271782a.isFinishing()) {
                return;
            }
            n nVarB = dVar.f271783b.b(j2);
            dVar.f271784c++;
            dVar.d = nVarB;
            nVarB.show();
        }
    }
}
