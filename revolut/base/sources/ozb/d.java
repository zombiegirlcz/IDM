package ozb;

import kotlin.jvm.internal.Intrinsics;
import ozb.e;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231257a;

    public d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231257a = text;
    }

    @Override // ozb.e.a
    public final String a() {
        return this.f231257a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f231257a, ((d) obj2).f231257a);
    }

    public final int hashCode() {
        return this.f231257a.hashCode();
    }
}
