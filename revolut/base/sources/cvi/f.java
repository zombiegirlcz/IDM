package cvi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f109467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109468c;

    public f(Data asftTerminal, Data asftConfig, int i) {
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        Intrinsics.checkNotNullParameter(asftConfig, "asftConfig");
        this.f109466a = asftTerminal;
        this.f109467b = asftConfig;
        this.f109468c = i;
    }

    public static f a(f fVar, Data asftTerminal, Data asftConfig, int i, int i2) {
        if ((i2 & 1) != 0) {
            asftTerminal = fVar.f109466a;
        }
        if ((i2 & 2) != 0) {
            asftConfig = fVar.f109467b;
        }
        if ((i2 & 4) != 0) {
            i = fVar.f109468c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        Intrinsics.checkNotNullParameter(asftConfig, "asftConfig");
        return new f(asftTerminal, asftConfig, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f109466a, fVar.f109466a) && Intrinsics.f(this.f109467b, fVar.f109467b) && this.f109468c == fVar.f109468c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109468c) + kii.e.c(this.f109467b, this.f109466a.hashCode() * 31, 31);
    }
}
