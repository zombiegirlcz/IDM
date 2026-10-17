package meh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f204674g = {null, null, null, j.c(k.PUBLICATION, new m3g.c(28)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204677c;
    public final List d;
    public final String e;
    public final String f;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (63 != (i & 63)) {
            j1.f(a.f204673a.getDescriptor(), i, 63);
            throw null;
        }
        this.f204675a = str;
        this.f204676b = str2;
        this.f204677c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f204675a, cVar.f204675a) && Intrinsics.f(this.f204676b, cVar.f204676b) && Intrinsics.f(this.f204677c, cVar.f204677c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.f204675a.hashCode() * 31, 31, this.f204676b), 31, this.f204677c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public c(String underlyingCurrency, String expirationDate, String currency, String str, String str2, ArrayList options) {
        Intrinsics.checkNotNullParameter(underlyingCurrency, "underlyingCurrency");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f204675a = underlyingCurrency;
        this.f204676b = expirationDate;
        this.f204677c = currency;
        this.d = options;
        this.e = str;
        this.f = str2;
    }
}
