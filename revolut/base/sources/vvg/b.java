package vvg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ue0.c;
import vyg.g;
import wim.z;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f292541a;

    public b(c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f292541a = storage;
    }

    public final void a(g benchmarkType, String benchmarkRef, boolean z) {
        Intrinsics.checkNotNullParameter(benchmarkType, "benchmarkType");
        Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
        String strName = benchmarkType.name();
        this.f292541a.G(new zvg.a(z, benchmarkRef), strName, z.d(o0.b(zvg.a.class)));
    }
}
