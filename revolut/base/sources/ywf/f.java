package ywf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f317422b;

    public f(List fields, Map fieldValues) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
        this.f317421a = fields;
        this.f317422b = fieldValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f317421a, fVar.f317421a) && Intrinsics.f(this.f317422b, fVar.f317422b);
    }

    public final int hashCode() {
        return this.f317422b.hashCode() + (this.f317421a.hashCode() * 31);
    }
}
