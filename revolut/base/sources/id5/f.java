package id5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f160423c = {null, yhm.j.c(k.PUBLICATION, new i83.b(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f160425b;

    public /* synthetic */ f(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f160418a.getDescriptor(), i, 3);
            throw null;
        }
        this.f160424a = str;
        this.f160425b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f160424a, fVar.f160424a) && Intrinsics.f(this.f160425b, fVar.f160425b);
    }

    public final int hashCode() {
        return this.f160425b.hashCode() + (this.f160424a.hashCode() * 31);
    }
}
