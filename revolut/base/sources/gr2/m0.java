package gr2;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f145851c;

    public /* synthetic */ m0(int i, String str, String str2, List list) {
        if (4 != (i & 4)) {
            j1.f(k0.f145845a.getDescriptor(), i, 4);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f145849a = null;
        } else {
            this.f145849a = str;
        }
        if ((i & 2) == 0) {
            this.f145850b = null;
        } else {
            this.f145850b = str2;
        }
        this.f145851c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f145849a, m0Var.f145849a) && Intrinsics.f(this.f145850b, m0Var.f145850b) && Intrinsics.f(this.f145851c, m0Var.f145851c);
    }

    public final int hashCode() {
        String str = this.f145849a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f145850b;
        return this.f145851c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
