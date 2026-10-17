package oh6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f225313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f225314b;

    public a(long j2, ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f225313a = j2;
        this.f225314b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f225313a == aVar.f225313a && this.f225314b.equals(aVar.f225314b);
    }

    public final int hashCode() {
        return this.f225314b.hashCode() + (Long.hashCode(this.f225313a) * 31);
    }
}
