package i88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159478b;

    public c(String juniorFirstName, String termsAndConditionLink) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(termsAndConditionLink, "termsAndConditionLink");
        this.f159477a = juniorFirstName;
        this.f159478b = termsAndConditionLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f159477a, cVar.f159477a) && Intrinsics.f(this.f159478b, cVar.f159478b);
    }

    public final int hashCode() {
        return this.f159478b.hashCode() + (this.f159477a.hashCode() * 31);
    }
}
