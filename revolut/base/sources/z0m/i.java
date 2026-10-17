package z0m;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
public final class i extends h1m.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z, String installReferrer, long j2, long j3) {
        super("iglu:com.android.installreferrer.api/referrer_details/jsonschema/1-0-0", r0.k(new Pair("installReferrer", installReferrer), new Pair("referrerClickTimestamp", j2 > 0 ? a1m.e.u(j2 * ((long) 1000)) : null), new Pair("installBeginTimestamp", j3 > 0 ? a1m.e.u(j3 * ((long) 1000)) : null), new Pair("googlePlayInstantParam", Boolean.valueOf(z))));
        Intrinsics.checkNotNullParameter(installReferrer, "installReferrer");
    }
}
