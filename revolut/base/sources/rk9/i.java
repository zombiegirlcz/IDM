package rk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f254773b;

    public i(Data content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f254772a = content;
        this.f254773b = z;
    }

    public static i a(i iVar, Data content, boolean z, int i) {
        if ((i & 1) != 0) {
            content = iVar.f254772a;
        }
        if ((i & 2) != 0) {
            z = iVar.f254773b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new i(content, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f254772a, iVar.f254772a) && this.f254773b == iVar.f254773b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254773b) + (this.f254772a.hashCode() * 31);
    }
}
