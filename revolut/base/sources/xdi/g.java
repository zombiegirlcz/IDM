package xdi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f304451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f304452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f304453c;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data benefits, Data pointsPocketState, int i, int i2) {
        if ((i2 & 1) != 0) {
            benefits = gVar.f304451a;
        }
        if ((i2 & 2) != 0) {
            pointsPocketState = gVar.f304452b;
        }
        if ((i2 & 4) != 0) {
            i = gVar.f304453c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(pointsPocketState, "pointsPocketState");
        return new g(benefits, pointsPocketState, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f304451a, gVar.f304451a) && Intrinsics.f(this.f304452b, gVar.f304452b) && this.f304453c == gVar.f304453c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f304453c) + kii.e.c(this.f304452b, this.f304451a.hashCode() * 31, 31);
    }

    public g(Data benefits, Data pointsPocketState, int i) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(pointsPocketState, "pointsPocketState");
        this.f304451a = benefits;
        this.f304452b = pointsPocketState;
        this.f304453c = i;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), 0);
    }
}
