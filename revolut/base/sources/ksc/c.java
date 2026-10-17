package ksc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrc.k f189412b;

    public c(String legalEntityId, vrc.k purpose) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f189411a = legalEntityId;
        this.f189412b = purpose;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f189411a, cVar.f189411a) && this.f189412b == cVar.f189412b;
    }

    public final int hashCode() {
        return this.f189412b.hashCode() + (this.f189411a.hashCode() * 31);
    }
}
