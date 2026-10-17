package x5e;

import cli.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v4e.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5e.f f302941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302942b;

    public static final class a {
        private a() {
        }
    }

    public c(a5e.f underlyingAssetsState, p assetsPerformanceChart) {
        Intrinsics.checkNotNullParameter(underlyingAssetsState, "underlyingAssetsState");
        Intrinsics.checkNotNullParameter(assetsPerformanceChart, "assetsPerformanceChart");
        this.f302941a = underlyingAssetsState;
        this.f302942b = assetsPerformanceChart;
    }

    public static c a(c cVar, a5e.f underlyingAssetsState, p assetsPerformanceChart, int i) {
        if ((i & 1) != 0) {
            underlyingAssetsState = cVar.f302941a;
        }
        if ((i & 2) != 0) {
            assetsPerformanceChart = cVar.f302942b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(underlyingAssetsState, "underlyingAssetsState");
        Intrinsics.checkNotNullParameter(assetsPerformanceChart, "assetsPerformanceChart");
        return new c(underlyingAssetsState, assetsPerformanceChart);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f302941a, cVar.f302941a) && Intrinsics.f(this.f302942b, cVar.f302942b);
    }

    public final int hashCode() {
        return this.f302942b.hashCode() + (this.f302941a.hashCode() * 31);
    }

    public c() {
        this(new a5e.f(null, null), new p(0));
    }
}
