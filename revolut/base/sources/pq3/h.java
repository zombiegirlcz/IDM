package pq3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf0.c f238677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jf0.c deeplink) {
        super("revolut://app/credit/fcc/invitation/(.*)/decline/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f238677b = deeplink;
    }
}
