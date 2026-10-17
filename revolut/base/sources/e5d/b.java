package e5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5d.a f122805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122806b;

    public b(d5d.a airTip, String chatEntryPointKey) {
        Intrinsics.checkNotNullParameter(airTip, "airTip");
        Intrinsics.checkNotNullParameter(chatEntryPointKey, "chatEntryPointKey");
        this.f122805a = airTip;
        this.f122806b = chatEntryPointKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f122805a, bVar.f122805a) && Intrinsics.f(this.f122806b, bVar.f122806b);
    }

    public final int hashCode() {
        return this.f122806b.hashCode() + (this.f122805a.hashCode() * 31);
    }
}
