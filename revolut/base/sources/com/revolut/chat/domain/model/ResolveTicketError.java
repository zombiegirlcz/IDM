package com.revolut.chat.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/domain/model/ResolveTicketError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResolveTicketError extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveTicketError(int i, int i2, String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f51067a = i;
        this.f51068b = i2;
        this.f51069c = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ResolveTicketError)) {
            return false;
        }
        ResolveTicketError resolveTicketError = (ResolveTicketError) obj2;
        return this.f51067a == resolveTicketError.f51067a && this.f51068b == resolveTicketError.f51068b && Intrinsics.f(this.f51069c, resolveTicketError.f51069c);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f51069c;
    }

    public final int hashCode() {
        return this.f51069c.hashCode() + j6.a.b(this.f51068b, Integer.hashCode(this.f51067a) * 31, 31);
    }
}
