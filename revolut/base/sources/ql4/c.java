package ql4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f247094b;

    public c(String rate, d type) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f247093a = rate;
        this.f247094b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f247093a, cVar.f247093a) && this.f247094b == cVar.f247094b;
    }

    public final int hashCode() {
        return this.f247094b.hashCode() + (this.f247093a.hashCode() * 31);
    }
}
