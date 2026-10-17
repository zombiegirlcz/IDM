package mqa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207907c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f207904a.getDescriptor(), i, 7);
            throw null;
        }
        this.f207905a = str;
        this.f207906b = str2;
        this.f207907c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f207905a, cVar.f207905a) && Intrinsics.f(this.f207906b, cVar.f207906b) && Intrinsics.f(this.f207907c, cVar.f207907c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f207905a.hashCode() * 31, 31, this.f207906b);
        String str = this.f207907c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public c(String firstNineDigits, String transferPurpose, String str) {
        Intrinsics.checkNotNullParameter(firstNineDigits, "firstNineDigits");
        Intrinsics.checkNotNullParameter(transferPurpose, "transferPurpose");
        this.f207905a = firstNineDigits;
        this.f207906b = transferPurpose;
        this.f207907c = str;
    }
}
