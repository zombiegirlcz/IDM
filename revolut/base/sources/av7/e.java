package av7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu7.k f9928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f9929b;

    public e(bu7.k coverageGroup, Data coverage) {
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f9928a = coverageGroup;
        this.f9929b = coverage;
    }

    public static e a(e eVar, Data coverage) {
        bu7.k coverageGroup = eVar.f9928a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        return new e(coverageGroup, coverage);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f9928a == eVar.f9928a && Intrinsics.f(this.f9929b, eVar.f9929b);
    }

    public final int hashCode() {
        return this.f9929b.hashCode() + (this.f9928a.hashCode() * 31);
    }
}
