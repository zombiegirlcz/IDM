package vwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f292723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f292724c;
    public final String d;

    public /* synthetic */ c(int i, String str, Float f, Float f4, String str2) {
        if (15 != (i & 15)) {
            j1.f(a.f292717a.getDescriptor(), i, 15);
            throw null;
        }
        this.f292722a = str;
        this.f292723b = f;
        this.f292724c = f4;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f292722a, cVar.f292722a) && Intrinsics.f(this.f292723b, cVar.f292723b) && Intrinsics.f(this.f292724c, cVar.f292724c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f292722a.hashCode() * 31;
        Float f = this.f292723b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f292724c;
        return this.d.hashCode() + ((iHashCode2 + (f4 != null ? f4.hashCode() : 0)) * 31);
    }

    public c(String ref2, Float f, Float f4, String underlyingAsset) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(underlyingAsset, "underlyingAsset");
        this.f292722a = ref2;
        this.f292723b = f;
        this.f292724c = f4;
        this.d = underlyingAsset;
    }
}
