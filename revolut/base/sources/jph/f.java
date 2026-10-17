package jph;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import uqh.z;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f177279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f177281c;

    public f(z extensionState, boolean z, Data data) {
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        this.f177279a = extensionState;
        this.f177280b = z;
        this.f177281c = data;
    }

    public static f a(f fVar, z extensionState, boolean z, Data data, int i) {
        if ((i & 1) != 0) {
            extensionState = fVar.f177279a;
        }
        if ((i & 2) != 0) {
            z = fVar.f177280b;
        }
        if ((i & 4) != 0) {
            data = fVar.f177281c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(extensionState, "extensionState");
        return new f(extensionState, z, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f177279a, fVar.f177279a) && this.f177280b == fVar.f177280b && Intrinsics.f(this.f177281c, fVar.f177281c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f177279a.hashCode() * 31, 31, this.f177280b);
        Data data = this.f177281c;
        return iC + (data == null ? 0 : data.hashCode());
    }
}
