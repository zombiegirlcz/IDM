package jl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175574a;

    public /* synthetic */ w(int i, String str) {
        if (1 == (i & 1)) {
            this.f175574a = str;
        } else {
            qlm.j1.f(u.f175572a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f175574a, ((w) obj2).f175574a);
    }

    public final int hashCode() {
        return this.f175574a.hashCode();
    }

    public final String toString() {
        return p.a.p("MediaData(uuid=", this.f175574a, ")");
    }

    public w(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f175574a = uuid;
    }
}
