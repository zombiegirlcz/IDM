package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z2 {

    @NotNull
    public static final y2 Companion = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146875b;

    public /* synthetic */ z2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(x2.f146863a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146874a = str;
        this.f146875b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f146874a, z2Var.f146874a) && Intrinsics.f(this.f146875b, z2Var.f146875b);
    }

    public final int hashCode() {
        String str = this.f146874a;
        return this.f146875b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public z2(String str, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f146874a = str;
        this.f146875b = text;
    }
}
