package io4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lio4/a;", "", "", "toString", "()Ljava/lang/String;", "Lio4/l;", "a", "Lio4/l;", "()Lio4/l;", "primary", "b", "secondary", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    @NotNull
    private final l primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondary")
    private final l secondary;

    public a(l primary, l lVar) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.primary = primary;
        this.secondary = lVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getSecondary() {
        return this.secondary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.primary, aVar.primary) && Intrinsics.f(this.secondary, aVar.secondary);
    }

    public final int hashCode() {
        int iHashCode = this.primary.hashCode() * 31;
        l lVar = this.secondary;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
