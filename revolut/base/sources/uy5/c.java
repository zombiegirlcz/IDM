package uy5;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c implements qf1.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f284075c;

    public /* synthetic */ c(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f284072a.getDescriptor(), i, 7);
            throw null;
        }
        this.f284073a = str;
        this.f284074b = str2;
        this.f284075c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f284073a, cVar.f284073a) && Intrinsics.f(this.f284074b, cVar.f284074b) && this.f284075c == cVar.f284075c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284075c) + p.a.c(this.f284073a.hashCode() * 31, 31, this.f284074b);
    }

    public c(String userCountry, int i) {
        Intrinsics.checkNotNullParameter("currency_account_item_id", "itemId");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        this.f284073a = "currency_account_item_id";
        this.f284074b = userCountry;
        this.f284075c = i;
    }
}
