package ts7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274046a;

    public e(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f274046a = faqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f274046a, ((e) obj2).f274046a);
    }

    public final int hashCode() {
        return this.f274046a.hashCode();
    }
}
