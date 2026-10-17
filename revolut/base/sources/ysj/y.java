package ysj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316504b;

    public /* synthetic */ y(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(w.f316502a.getDescriptor(), i, 3);
            throw null;
        }
        this.f316503a = str;
        this.f316504b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f316503a, yVar.f316503a) && Intrinsics.f(this.f316504b, yVar.f316504b);
    }

    public final int hashCode() {
        String str = this.f316503a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f316504b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public y(String str, String str2) {
        this.f316503a = str;
        this.f316504b = str2;
    }
}
