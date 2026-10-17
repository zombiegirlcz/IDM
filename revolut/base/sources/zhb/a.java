package zhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f322381b;

    public a() {
        this(0);
    }

    public static a a(a aVar, String email, b emailValidationResult, int i) {
        if ((i & 1) != 0) {
            email = aVar.f322380a;
        }
        if ((i & 2) != 0) {
            emailValidationResult = aVar.f322381b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(emailValidationResult, "emailValidationResult");
        return new a(email, emailValidationResult);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322380a, aVar.f322380a) && Intrinsics.f(this.f322381b, aVar.f322381b);
    }

    public final int hashCode() {
        return this.f322381b.hashCode() + (this.f322380a.hashCode() * 31);
    }

    public a(String email, b emailValidationResult) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(emailValidationResult, "emailValidationResult");
        this.f322380a = email;
        this.f322381b = emailValidationResult;
    }

    public /* synthetic */ a(int i) {
        this("", new b(0));
    }
}
