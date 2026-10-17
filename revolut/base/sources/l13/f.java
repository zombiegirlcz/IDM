package l13;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e13.a f191429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191430b;

    public f(e13.a flowType, Data eligibility) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f191429a = flowType;
        this.f191430b = eligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f191429a == fVar.f191429a && Intrinsics.f(this.f191430b, fVar.f191430b);
    }

    public final int hashCode() {
        return this.f191430b.hashCode() + (this.f191429a.hashCode() * 31);
    }
}
