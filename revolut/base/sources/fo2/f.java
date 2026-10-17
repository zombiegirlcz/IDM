package fo2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f136784b;

    public f(List fields, Map fieldValues) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
        this.f136783a = fields;
        this.f136784b = fieldValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f136783a, fVar.f136783a) && Intrinsics.f(this.f136784b, fVar.f136784b);
    }

    public final int hashCode() {
        return this.f136784b.hashCode() + (this.f136783a.hashCode() * 31);
    }
}
