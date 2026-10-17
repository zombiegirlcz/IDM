package r21;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f251026c;
    public final String d;

    public a(String bankCountry, String str, String copFlow, Map userInputFieldValues) {
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        Intrinsics.checkNotNullParameter(userInputFieldValues, "userInputFieldValues");
        Intrinsics.checkNotNullParameter(copFlow, "copFlow");
        this.f251024a = bankCountry;
        this.f251025b = str;
        this.f251026c = userInputFieldValues;
        this.d = copFlow;
    }

    public final String a() {
        return this.f251024a;
    }

    public final String b() {
        return this.f251025b;
    }

    public final Map c() {
        return this.f251026c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f251024a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251024a, aVar.f251024a) && Intrinsics.f(this.f251025b, aVar.f251025b) && Intrinsics.f(this.f251026c, aVar.f251026c) && Intrinsics.f(this.d, aVar.d);
    }

    public final String f() {
        return this.f251025b;
    }

    public final Map g() {
        return this.f251026c;
    }

    public final int hashCode() {
        int iHashCode = this.f251024a.hashCode() * 31;
        String str = this.f251025b;
        return this.d.hashCode() + p.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f251026c);
    }
}
