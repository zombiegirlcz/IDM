package ugl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prl.e;
import vkm.d;
import w4l.j;
import w4l.k;
import yhl.f;
import zel.g;
import zel.i;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public interface c {

    @NotNull
    public static final b Companion = b.f280042a;

    static d a(c cVar, List instrumentTypes, List list, g gVar, i iVar, Integer num, int i) {
        if ((i & 16) != 0) {
            num = null;
        }
        Integer num2 = num;
        f0 extraMetrics = f0.f322471a;
        k loadingStrategy = (i & 128) != 0 ? j.f294644c : w4l.i.f294643c;
        f fVar = (f) cVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(extraMetrics, "extraMetrics");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e eVar = fVar.f314178a;
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(extraMetrics, "extraMetrics");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) eVar.f239325b).b(new shl.a(instrumentTypes, list, gVar, extraMetrics, iVar, num2), loadingStrategy);
    }
}
