package e5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5d.a f122807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122808b;

    public c(d5d.a airTip, String chatEntryPointKey) {
        Intrinsics.checkNotNullParameter(airTip, "airTip");
        Intrinsics.checkNotNullParameter(chatEntryPointKey, "chatEntryPointKey");
        this.f122807a = airTip;
        this.f122808b = chatEntryPointKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f122807a, cVar.f122807a) && Intrinsics.f(this.f122808b, cVar.f122808b);
    }

    public final int hashCode() {
        return this.f122808b.hashCode() + (this.f122807a.hashCode() * 31);
    }
}
