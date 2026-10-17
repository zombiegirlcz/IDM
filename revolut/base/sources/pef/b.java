package pef;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235376b;

    public b(String transactionId, String message) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f235375a = transactionId;
        this.f235376b = message;
    }
}
