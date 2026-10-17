package i9g;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f159822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f159823b;

    public n0(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f159822a = regexMatcher;
        this.f159823b = phoneToolsProvider;
    }

    public final String a(do3.n user) {
        String strC;
        Intrinsics.checkNotNullParameter(user, "user");
        String str = user.f116410c;
        if (str != null && (strC = jli.g.c(str)) != null) {
            return strC;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public final String b(do3.n user) {
        String strC;
        Intrinsics.checkNotNullParameter(user, "user");
        String str = user.e;
        if (str != null && (strC = jli.g.c(str)) != null) {
            return strC;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public final boolean c(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return ((zzl.c) this.f159822a).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", email) && email.length() <= 50;
    }

    public final boolean d(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        return firstName.length() > 0 && ((zzl.c) this.f159822a).a("[\\p{L}][\\p{L}-` '\\s]{0,40}", firstName);
    }

    public final boolean e(String lastName) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return lastName.length() > 0 && ((zzl.c) this.f159822a).a("[\\p{L}][\\p{L}-` '\\s]{0,40}", lastName);
    }

    public final boolean f(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return this.f159823b.k(phoneNumber, null) && phoneNumber.length() <= 20;
    }

    public final boolean g(String firstName, String lastName, String phoneNumber, String email) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return d(firstName) && e(lastName) && f(phoneNumber) && c(email);
    }
}
