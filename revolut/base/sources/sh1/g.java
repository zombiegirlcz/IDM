package sh1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f263345b;

    public g(String value, f error) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f263344a = value;
        this.f263345b = error;
    }

    public static g a(g gVar, String value, f error, int i) {
        if ((i & 1) != 0) {
            value = gVar.f263344a;
        }
        gVar.getClass();
        if ((i & 4) != 0) {
            error = gVar.f263345b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(error, "error");
        return new g(value, error);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f263344a, gVar.f263344a) && Intrinsics.f(this.f263345b, gVar.f263345b);
    }

    public final int hashCode() {
        return this.f263345b.hashCode() + (this.f263344a.hashCode() * 961);
    }

    public /* synthetic */ g(String str, a aVar, int i) {
        this(str, (i & 4) != 0 ? e.f263343a : aVar);
    }
}
