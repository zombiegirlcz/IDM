package zz1;

import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f326497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f326499c;

    public k(AliasType type, String value, j operation) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f326497a = type;
        this.f326498b = value;
        this.f326499c = operation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f326497a, kVar.f326497a) && Intrinsics.f(this.f326498b, kVar.f326498b) && this.f326499c == kVar.f326499c;
    }

    public final int hashCode() {
        return this.f326499c.hashCode() + p.a.c(this.f326497a.hashCode() * 31, 31, this.f326498b);
    }
}
