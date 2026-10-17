package jqg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f177718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177720c;

    public i(Data content, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f177718a = content;
        this.f177719b = z;
        this.f177720c = z3;
    }

    public static i a(i iVar, Data content, boolean z, int i) {
        if ((i & 1) != 0) {
            content = iVar.f177718a;
        }
        if ((i & 2) != 0) {
            z = iVar.f177719b;
        }
        boolean z3 = (i & 4) != 0 ? iVar.f177720c : true;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new i(content, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f177718a, iVar.f177718a) && this.f177719b == iVar.f177719b && this.f177720c == iVar.f177720c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177720c) + j6.a.c(this.f177718a.hashCode() * 31, 31, this.f177719b);
    }
}
