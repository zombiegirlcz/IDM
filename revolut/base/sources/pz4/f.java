package pz4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf0.c f240894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jf0.c deeplink) {
        super("revolut://app/credit/forbearance-application/loan/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/?", deeplink);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f240894b = deeplink;
    }
}
