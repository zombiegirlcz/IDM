package sjf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f263723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f263724b;

    public c(long j2, Map attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f263723a = j2;
        this.f263724b = attributes;
    }

    public static c a(c cVar, Map attributes) {
        long j2 = cVar.f263723a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new c(j2, attributes);
    }

    public final Map b() {
        return this.f263724b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f263723a == cVar.f263723a && Intrinsics.f(this.f263724b, cVar.f263724b);
    }

    public final int hashCode() {
        return this.f263724b.hashCode() + (Long.hashCode(this.f263723a) * 31);
    }

    public /* synthetic */ c(long j2) {
        this(j2, r0.g());
    }
}
