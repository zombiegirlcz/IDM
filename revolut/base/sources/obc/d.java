package obc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f223914b;

    public d(List suggestedCarriers, List nonSuggestedCarriers) {
        Intrinsics.checkNotNullParameter(suggestedCarriers, "suggestedCarriers");
        Intrinsics.checkNotNullParameter(nonSuggestedCarriers, "nonSuggestedCarriers");
        this.f223913a = suggestedCarriers;
        this.f223914b = nonSuggestedCarriers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f223913a, dVar.f223913a) && Intrinsics.f(this.f223914b, dVar.f223914b);
    }

    public final int hashCode() {
        return this.f223914b.hashCode() + (this.f223913a.hashCode() * 31);
    }
}
