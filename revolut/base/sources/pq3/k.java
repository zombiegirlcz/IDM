package pq3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf0.c f238679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jf0.c deeplink) {
        super("revolut://app/credit/(.*)/(.*)/intro/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f238679b = deeplink;
    }
}
