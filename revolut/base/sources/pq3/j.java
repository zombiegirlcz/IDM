package pq3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf0.c f238678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jf0.c deeplink) {
        super("revolut://app/credit/(.+)-fbr-application/(.*)/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f238678b = deeplink;
    }
}
