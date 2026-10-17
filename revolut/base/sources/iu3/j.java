package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f168479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f168480b;

    public j(i iVar, g requestConsentScreen) {
        Intrinsics.checkNotNullParameter(requestConsentScreen, "requestConsentScreen");
        this.f168479a = iVar;
        this.f168480b = requestConsentScreen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f168479a, jVar.f168479a) && Intrinsics.f(this.f168480b, jVar.f168480b);
    }

    public final int hashCode() {
        i iVar = this.f168479a;
        return this.f168480b.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31);
    }
}
