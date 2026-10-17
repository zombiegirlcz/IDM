package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f325775c;
    public final boolean d;

    public e(String code, String displayName, h breedType, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        this.f325773a = code;
        this.f325774b = displayName;
        this.f325775c = breedType;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f325773a, eVar.f325773a) && Intrinsics.f(this.f325774b, eVar.f325774b) && this.f325775c == eVar.f325775c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f325775c.hashCode() + p.a.c(this.f325773a.hashCode() * 31, 31, this.f325774b)) * 31);
    }
}
