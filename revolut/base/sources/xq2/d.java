package xq2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f308057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f308058b;

    public d(e mainFormat) {
        f0 additionalFormats = f0.f322471a;
        Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
        Intrinsics.checkNotNullParameter(additionalFormats, "additionalFormats");
        this.f308057a = mainFormat;
        this.f308058b = additionalFormats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f308057a == dVar.f308057a && Intrinsics.f(this.f308058b, dVar.f308058b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + p.a.d(this.f308057a.hashCode() * 31, 31, this.f308058b);
    }
}
