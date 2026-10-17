package zm;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ym.b;
import ym.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {
    @Override // ym.c
    public final d0 g3(b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        mm.a aVar = loadingData.f314823a;
        ufm.b bVarM = d0.m(Boolean.valueOf((aVar instanceof mm.c) && !((mm.c) aVar).b()));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // ym.c
    public final int getLevel() {
        return -1000;
    }
}
