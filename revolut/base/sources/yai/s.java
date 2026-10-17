package yai;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends com.revolut.feature_retail_user_declarations.email.screen.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f312046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312047c;

    public s(String email, String str, boolean z) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter("EMAIL_SCREEN_CTA_BUTTON_TAG", "buttonLoadingTag");
        this.f312045a = email;
        this.f312046b = z;
        this.f312047c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f312045a, sVar.f312045a) && this.f312046b == sVar.f312046b && Intrinsics.f(this.f312047c, sVar.f312047c);
    }

    public final int hashCode() {
        int iC = j6.a.c(((this.f312045a.hashCode() * 31) - 1994046900) * 31, 31, this.f312046b);
        String str = this.f312047c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
