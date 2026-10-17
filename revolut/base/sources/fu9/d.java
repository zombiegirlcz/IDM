package fu9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138151a;

    public d(String emojiCode) {
        Intrinsics.checkNotNullParameter(emojiCode, "emojiCode");
        this.f138151a = emojiCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f138151a, ((d) obj2).f138151a);
    }

    public final int hashCode() {
        return this.f138151a.hashCode();
    }
}
