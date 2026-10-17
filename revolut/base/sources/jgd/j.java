package jgd;

import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$ConverterHistory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedConverterScreenContract$ConverterHistory f173970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f173971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173972c;
    public final boolean d;

    public j(SharedConverterScreenContract$ConverterHistory converterHistory, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(converterHistory, "converterHistory");
        this.f173970a = converterHistory;
        this.f173971b = z;
        this.f173972c = z3;
        this.d = z4;
    }

    public static j a(j jVar, SharedConverterScreenContract$ConverterHistory converterHistory, boolean z, int i) {
        if ((i & 1) != 0) {
            converterHistory = jVar.f173970a;
        }
        if ((i & 2) != 0) {
            z = jVar.f173971b;
        }
        boolean z3 = jVar.f173972c;
        boolean z4 = (i & 8) != 0 ? jVar.d : true;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(converterHistory, "converterHistory");
        return new j(converterHistory, z, z3, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f173970a, jVar.f173970a) && this.f173971b == jVar.f173971b && this.f173972c == jVar.f173972c && this.d == jVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f173970a.hashCode() * 31, 31, this.f173971b), 31, this.f173972c);
    }
}
