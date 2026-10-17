package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bl5.b f116777c;

    public /* synthetic */ l(int i, String str, String str2, bl5.b bVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(j.f116769a.getDescriptor(), i, 7);
            throw null;
        }
        this.f116775a = str;
        this.f116776b = str2;
        this.f116777c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f116775a, lVar.f116775a) && Intrinsics.f(this.f116776b, lVar.f116776b) && Intrinsics.f(this.f116777c, lVar.f116777c);
    }

    public final int hashCode() {
        return this.f116777c.hashCode() + p.a.c(this.f116775a.hashCode() * 31, 31, this.f116776b);
    }

    public l(String hostingPlatform, String hostingType, bl5.b details) {
        Intrinsics.checkNotNullParameter(hostingPlatform, "hostingPlatform");
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f116775a = hostingPlatform;
        this.f116776b = hostingType;
        this.f116777c = details;
    }
}
