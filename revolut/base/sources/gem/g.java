package gem;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f143328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f143329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f143330c;

    public g(byte[] headers, Function0 provider, Long l2) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f143328a = headers;
        this.f143329b = l2;
        this.f143330c = provider;
    }
}
