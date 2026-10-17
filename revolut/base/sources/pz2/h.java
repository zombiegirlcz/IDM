package pz2;

import com.revolut.feature.card_management.impl.cardlimit.domain.CardLimitSetData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardLimitSetData f240873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240874b;

    public h(CardLimitSetData data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f240873a = data;
        this.f240874b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f240873a, hVar.f240873a) && this.f240874b == hVar.f240874b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240874b) + (this.f240873a.hashCode() * 31);
    }
}
