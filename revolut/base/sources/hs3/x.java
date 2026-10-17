package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f154967c;

    public x(String title, String str, p primaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f154965a = title;
        this.f154966b = str;
        this.f154967c = primaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f154965a, xVar.f154965a) && Intrinsics.f(this.f154966b, xVar.f154966b) && Intrinsics.f(this.f154967c, xVar.f154967c);
    }

    public final int hashCode() {
        int iHashCode = this.f154965a.hashCode() * 31;
        String str = this.f154966b;
        return this.f154967c.f154927a.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
