package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new x5a.d(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304309c;
    public final String d;
    public final List e;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            j1.f(a.f304301a.getDescriptor(), i, 31);
            throw null;
        }
        this.f304307a = str;
        this.f304308b = str2;
        this.f304309c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f304307a, cVar.f304307a) && Intrinsics.f(this.f304308b, cVar.f304308b) && Intrinsics.f(this.f304309c, cVar.f304309c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f304307a.hashCode() * 31, 31, this.f304308b), 31, this.f304309c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public c(String walletId, String currency, String pocketType, String str, List list) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f304307a = walletId;
        this.f304308b = currency;
        this.f304309c = pocketType;
        this.d = str;
        this.e = list;
    }
}
