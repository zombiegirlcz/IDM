package jda;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173043a;

    public a(String createdPocketId) {
        Intrinsics.checkNotNullParameter(createdPocketId, "createdPocketId");
        this.f173043a = createdPocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f173043a, ((a) obj2).f173043a);
    }

    public final int hashCode() {
        return this.f173043a.hashCode();
    }
}
