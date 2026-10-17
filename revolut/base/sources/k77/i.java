package k77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f181836c;
    public final String d;
    public final String e;
    public final String f;

    public i(String ref2, String symbol, xi0.b bVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f181834a = ref2;
        this.f181835b = symbol;
        this.f181836c = bVar;
        this.d = str;
        this.e = str2;
        this.f = j6.a.q("I:", symbol);
    }

    public final xi0.b a() {
        xi0.b bVar = this.f181836c;
        if (bVar != null) {
            return bVar;
        }
        xi0.b.Companion.getClass();
        return xi0.b.f306271c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f181834a, iVar.f181834a) && Intrinsics.f(this.f181835b, iVar.f181835b) && Intrinsics.f(this.f181836c, iVar.f181836c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f181834a.hashCode() * 31, 31, this.f181835b);
        xi0.b bVar = this.f181836c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
