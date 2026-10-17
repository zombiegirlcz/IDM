package bxf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19674b;

    public c(String ticketId, List activationInputs) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(activationInputs, "activationInputs");
        this.f19673a = ticketId;
        this.f19674b = activationInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f19673a, cVar.f19673a) && Intrinsics.f(this.f19674b, cVar.f19674b);
    }

    public final int hashCode() {
        return this.f19674b.hashCode() + (this.f19673a.hashCode() * 31);
    }
}
