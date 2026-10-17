package kf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f183301c = {null, yhm.j.c(yhm.k.PUBLICATION, new ka9.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f183303b;

    public n(int i, String str, List list) {
        if (1 != (i & 1)) {
            j1.f(i.f183297a.getDescriptor(), i, 1);
            throw null;
        }
        this.f183302a = str;
        if ((i & 2) == 0) {
            this.f183303b = f0.f322471a;
        } else {
            this.f183303b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f183302a, nVar.f183302a) && Intrinsics.f(this.f183303b, nVar.f183303b);
    }

    public final int hashCode() {
        return this.f183303b.hashCode() + (this.f183302a.hashCode() * 31);
    }
}
