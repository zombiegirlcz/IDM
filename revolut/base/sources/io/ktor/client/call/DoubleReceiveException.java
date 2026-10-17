package io.ktor.client.call;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wdm.f;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/DoubleReceiveException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DoubleReceiveException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163021a;

    public DoubleReceiveException(f call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f163021a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f163021a;
    }
}
