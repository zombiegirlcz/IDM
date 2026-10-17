package cqf;

import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108092c;
    public final boolean d;

    public e(int i, String label, boolean z, String text) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f108090a = label;
        this.f108091b = text;
        this.f108092c = i;
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
        return Intrinsics.f(this.f108090a, eVar.f108090a) && Intrinsics.f(this.f108091b, eVar.f108091b) && this.f108092c == eVar.f108092c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f108092c, p.a.c(this.f108090a.hashCode() * 31, 31, this.f108091b), 31);
    }
}
