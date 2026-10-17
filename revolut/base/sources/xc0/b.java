package xc0;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import qc0.e;
import qc0.k;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f304091a;

    public b(k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f304091a = state;
    }

    public final ufm.b a(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (!Intrinsics.f(errorData.f281172a, e.f244410a)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        i iVar = (i) w.O(this.f304091a.k());
        boolean z = false;
        if (iVar != null && iVar.d()) {
            z = true;
        }
        ufm.b bVarM2 = d0.m(Boolean.valueOf(!z));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
