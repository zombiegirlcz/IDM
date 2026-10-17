package wte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299933b;

    public b(String html, String consentId) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        this.f299932a = html;
        this.f299933b = consentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f299932a, bVar.f299932a) && Intrinsics.f(this.f299933b, bVar.f299933b);
    }

    public final int hashCode() {
        return this.f299933b.hashCode() + (this.f299932a.hashCode() * 31);
    }
}
