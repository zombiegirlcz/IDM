package alc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6186a;

    public a(String portfolioTemplateId) {
        Intrinsics.checkNotNullParameter(portfolioTemplateId, "portfolioTemplateId");
        this.f6186a = portfolioTemplateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f6186a, ((a) obj2).f6186a);
    }

    public final int hashCode() {
        return this.f6186a.hashCode();
    }
}
