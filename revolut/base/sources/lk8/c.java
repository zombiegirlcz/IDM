package lk8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f196301c = {j.c(k.PUBLICATION, new lh9.b(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f196302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196303b;

    public /* synthetic */ c(int i, g gVar, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f196300a.getDescriptor(), i, 3);
            throw null;
        }
        this.f196302a = gVar;
        this.f196303b = str;
    }

    public final String a() {
        String str = this.f196303b;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(("Progression with state=" + this.f196302a + " must provide newPlanId").toString());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f196302a == cVar.f196302a && Intrinsics.f(this.f196303b, cVar.f196303b);
    }

    public final int hashCode() {
        int iHashCode = this.f196302a.hashCode() * 31;
        String str = this.f196303b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
