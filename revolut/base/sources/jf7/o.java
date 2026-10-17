package jf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class o implements l1 {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f173697c = {null, yhm.j.c(yhm.k.PUBLICATION, new ja3.b(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173699b;

    public /* synthetic */ o(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(j.f173683a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173698a = str;
        this.f173699b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f173698a, oVar.f173698a) && Intrinsics.f(this.f173699b, oVar.f173699b);
    }

    public final int hashCode() {
        return this.f173699b.hashCode() + (this.f173698a.hashCode() * 31);
    }
}
