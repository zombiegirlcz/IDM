package jq9;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipient f177522a;

    public u(ApmRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f177522a = recipient;
    }

    @Override // jq9.t
    public final String a() {
        return this.f177522a.getDisplayName();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f177522a, ((u) obj2).f177522a);
    }

    public final int hashCode() {
        return this.f177522a.hashCode();
    }
}
