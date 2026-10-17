package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u1 f5909a = new u1();

    private u1() {
    }

    public static String a(t1 actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return actionId.name();
    }
}
