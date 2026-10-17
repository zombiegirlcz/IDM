package zg3;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class r implements b {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f322069c = {null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f322071b;

    public /* synthetic */ r(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(m.f322066a.getDescriptor(), i, 3);
            throw null;
        }
        this.f322070a = str;
        this.f322071b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f322070a, rVar.f322070a) && Intrinsics.f(this.f322071b, rVar.f322071b);
    }

    public final int hashCode() {
        return this.f322071b.hashCode() + (this.f322070a.hashCode() * 31);
    }
}
