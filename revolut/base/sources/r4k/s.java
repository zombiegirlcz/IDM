package r4k;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f251496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f251497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f251498c;

    public s(ArrayList items, k kVar, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251496a = items;
        this.f251497b = kVar;
        this.f251498c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f251496a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f251496a.equals(sVar.f251496a) && Intrinsics.f(this.f251497b, sVar.f251497b) && Intrinsics.f(this.f251498c, sVar.f251498c);
    }

    public final int hashCode() {
        int iHashCode = this.f251496a.hashCode() * 31;
        k kVar = this.f251497b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Clause clause = this.f251498c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
