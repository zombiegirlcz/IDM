package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yld.d f323978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yld.c f323979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f323980c;

    public c(yld.d screenType, yld.c chartStyle, a type) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f323978a = screenType;
        this.f323979b = chartStyle;
        this.f323980c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f323978a == cVar.f323978a && this.f323979b == cVar.f323979b && this.f323980c == cVar.f323980c;
    }

    public final int hashCode() {
        return this.f323980c.hashCode() + ((this.f323979b.hashCode() + (this.f323978a.hashCode() * 31)) * 31);
    }
}
