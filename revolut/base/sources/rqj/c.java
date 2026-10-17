package rqj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f256554c;

    public /* synthetic */ c(int i, String str, String str2, long j2) {
        if (7 != (i & 7)) {
            j1.f(a.f256551a.getDescriptor(), i, 7);
            throw null;
        }
        this.f256552a = str;
        this.f256553b = str2;
        this.f256554c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256552a, cVar.f256552a) && Intrinsics.f(this.f256553b, cVar.f256553b) && this.f256554c == cVar.f256554c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f256554c) + p.a.c(this.f256552a.hashCode() * 31, 31, this.f256553b);
    }

    public c(String allocationId, String categoryId, long j2) {
        Intrinsics.checkNotNullParameter(allocationId, "allocationId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f256552a = allocationId;
        this.f256553b = categoryId;
        this.f256554c = j2;
    }
}
