package f5j;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements q {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f132359c;
    public final String d;
    public final l e;

    public p(String bankCountry, String currency, LinkedHashMap fields, String institutionName, l context) {
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f132357a = bankCountry;
        this.f132358b = currency;
        this.f132359c = fields;
        this.d = institutionName;
        this.e = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f132357a, pVar.f132357a) && Intrinsics.f(this.f132358b, pVar.f132358b) && this.f132359c.equals(pVar.f132359c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e;
    }

    @Override // f5j.q
    public final l getContext() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(r6.b.e(this.f132359c, p.a.c(this.f132357a.hashCode() * 31, 31, this.f132358b), 31), 31, this.d);
    }
}
