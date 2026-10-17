package a6f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1681c;
    public final String d;
    public final BigDecimal e;

    public j(String ticker, String ref2, String name, String str, BigDecimal allocation) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f1679a = ticker;
        this.f1680b = ref2;
        this.f1681c = name;
        this.d = str;
        this.e = allocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f1679a, jVar.f1679a) && Intrinsics.f(this.f1680b, jVar.f1680b) && Intrinsics.f(this.f1681c, jVar.f1681c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f1679a.hashCode() * 31, 31, this.f1680b), 31, this.f1681c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
