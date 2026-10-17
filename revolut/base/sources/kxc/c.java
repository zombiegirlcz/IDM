package kxc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f190555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f190557c;

    public c(a flowType, String sourceType, String documentType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f190555a = flowType;
        this.f190556b = sourceType;
        this.f190557c = documentType;
    }

    public final String a() {
        StringBuilder sb6 = new StringBuilder("InstructionConfig(flowType=");
        sb6.append(this.f190555a);
        sb6.append(", sourceType=");
        sb6.append(this.f190556b);
        sb6.append(", documentType=");
        return v0.a.i(sb6, this.f190557c, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f190555a == cVar.f190555a && Intrinsics.f(this.f190556b, cVar.f190556b) && Intrinsics.f(this.f190557c, cVar.f190557c);
    }

    public final int hashCode() {
        return this.f190557c.hashCode() + p.a.c(this.f190555a.hashCode() * 31, 31, this.f190556b);
    }
}
