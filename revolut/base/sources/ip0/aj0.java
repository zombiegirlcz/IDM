package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class aj0 implements dj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f163459a;

    public aj0(List preferredLocales) {
        Intrinsics.checkNotNullParameter(preferredLocales, "preferredLocales");
        this.f163459a = preferredLocales;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof aj0) && Intrinsics.f(this.f163459a, ((aj0) obj2).f163459a);
    }

    public final int hashCode() {
        return this.f163459a.hashCode();
    }
}
