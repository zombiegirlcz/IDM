package uyd;

import com.revolut.feature.statements.api.models.ContractSummaryType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContractSummaryType f284179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284180b;

    public f(ContractSummaryType type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f284179a = type;
        this.f284180b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f284179a == fVar.f284179a && this.f284180b == fVar.f284180b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284180b) + (this.f284179a.hashCode() * 31);
    }
}
