package wv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm4.a f300289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final um4.a f300290b;

    public e(zm4.a sheetContent, um4.a limitsInfo) {
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(limitsInfo, "limitsInfo");
        this.f300289a = sheetContent;
        this.f300290b = limitsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f300289a, eVar.f300289a) && Intrinsics.f(this.f300290b, eVar.f300290b);
    }

    public final int hashCode() {
        return this.f300290b.hashCode() + (this.f300289a.hashCode() * 31);
    }
}
