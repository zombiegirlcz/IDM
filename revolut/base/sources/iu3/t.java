package iu3;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f168506b;

    public t(String text, z2 infoPopup) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(infoPopup, "infoPopup");
        this.f168505a = text;
        this.f168506b = infoPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f168505a, tVar.f168505a) && Intrinsics.f(this.f168506b, tVar.f168506b);
    }

    public final int hashCode() {
        return this.f168506b.hashCode() + (this.f168505a.hashCode() * 31);
    }
}
