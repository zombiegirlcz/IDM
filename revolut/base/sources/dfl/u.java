package dfl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f114489c;

    public u(dj0.d value, String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f114487a = ref2;
        this.f114488b = symbol;
        this.f114489c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f114487a, uVar.f114487a) && Intrinsics.f(this.f114488b, uVar.f114488b) && Intrinsics.f(this.f114489c, uVar.f114489c);
    }

    public final int hashCode() {
        return this.f114489c.hashCode() + p.a.c(this.f114487a.hashCode() * 31, 31, this.f114488b);
    }
}
