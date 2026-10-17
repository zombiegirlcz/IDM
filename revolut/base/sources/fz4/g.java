package fz4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f139091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139092b;

    public g() {
        this((Map) null, 3);
    }

    public static g a(g gVar, Map accountFieldInputs, boolean z, int i) {
        if ((i & 1) != 0) {
            accountFieldInputs = gVar.f139091a;
        }
        if ((i & 2) != 0) {
            z = gVar.f139092b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(accountFieldInputs, "accountFieldInputs");
        return new g(accountFieldInputs, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f139091a, gVar.f139091a) && this.f139092b == gVar.f139092b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139092b) + (this.f139091a.hashCode() * 31);
    }

    public g(Map accountFieldInputs, boolean z) {
        Intrinsics.checkNotNullParameter(accountFieldInputs, "accountFieldInputs");
        this.f139091a = accountFieldInputs;
        this.f139092b = z;
    }

    public /* synthetic */ g(Map map, int i) {
        this((i & 1) != 0 ? r0.g() : map, false);
    }
}
