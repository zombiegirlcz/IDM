package tq8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f273538c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f273539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f273540h;
    public final String i;

    public /* synthetic */ c(int i, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (511 != (i & 511)) {
            j1.f(a.f273535a.getDescriptor(), i, 511);
            throw null;
        }
        this.f273536a = str;
        this.f273537b = str2;
        this.f273538c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f273539g = str6;
        this.f273540h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273536a, cVar.f273536a) && Intrinsics.f(this.f273537b, cVar.f273537b) && this.f273538c == cVar.f273538c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f273539g, cVar.f273539g) && Intrinsics.f(this.f273540h, cVar.f273540h) && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(p.a.c(this.f273536a.hashCode() * 31, 31, this.f273537b), 31, this.f273538c), 31, this.d), 31, this.e), 31, this.f), 31, this.f273539g), 31, this.f273540h);
        String str = this.i;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public c(String juniorId, String counterpartyId, String firstName, String lastName, String code, String username, String type, String str, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f273536a = juniorId;
        this.f273537b = counterpartyId;
        this.f273538c = z;
        this.d = firstName;
        this.e = lastName;
        this.f = code;
        this.f273539g = username;
        this.f273540h = type;
        this.i = str;
    }
}
