package jci;

import cli.j;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f172816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f172817c;

    public e(List riskOptions, Set selectedRisks, boolean z) {
        Intrinsics.checkNotNullParameter(riskOptions, "riskOptions");
        Intrinsics.checkNotNullParameter(selectedRisks, "selectedRisks");
        this.f172815a = riskOptions;
        this.f172816b = selectedRisks;
        this.f172817c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f172815a, eVar.f172815a) && Intrinsics.f(this.f172816b, eVar.f172816b) && this.f172817c == eVar.f172817c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172817c) + p.a.f(this.f172815a.hashCode() * 31, 31, this.f172816b);
    }
}
