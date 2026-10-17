package tnl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends n implements e {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Activity f272470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f70.a f272471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public okl.d f272472n;

    public g(Activity activity, f70.a authTabSupportChecker) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(authTabSupportChecker, "authTabSupportChecker");
        this.f272470l = activity;
        this.f272471m = authTabSupportChecker;
    }
}
