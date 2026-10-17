package l10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10.b f191393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5l.n f191394b;

    public r(n10.b cardType, o5l.n groupInfo) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(groupInfo, "groupInfo");
        this.f191393a = cardType;
        this.f191394b = groupInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f191393a == rVar.f191393a && Intrinsics.f(this.f191394b, rVar.f191394b);
    }

    public final int hashCode() {
        return this.f191394b.hashCode() + (this.f191393a.hashCode() * 31);
    }
}
