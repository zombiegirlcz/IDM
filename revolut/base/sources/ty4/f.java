package ty4;

import com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketInfo f275468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk4.f f275469b;

    public f(PocketInfo pocketInfo, bk4.f origin) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f275468a = pocketInfo;
        this.f275469b = origin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f275468a, fVar.f275468a) && this.f275469b == fVar.f275469b;
    }

    public final int hashCode() {
        return this.f275469b.hashCode() + (this.f275468a.hashCode() * 31);
    }
}
