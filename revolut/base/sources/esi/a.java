package esi;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f128951a = new a();

    private a() {
    }

    public static void a(BaseDelegatesActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getLifecycle().addObserver(new c(activity));
    }
}
