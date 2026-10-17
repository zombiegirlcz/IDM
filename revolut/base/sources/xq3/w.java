package xq3;

import com.revolut.data.model.Data;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xo8.i0;
import xr3.c0;
import xr3.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f308101a;

    public w(f0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f308101a = repository;
    }

    public static Flow a(w wVar, r2 entryPointType) {
        wVar.getClass();
        w4l.h requestedStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(requestedStrategy, "requestedStrategy");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        int i = v.f308100a[entryPointType.ordinal()];
        if (i != 1 && i != 2) {
            return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        }
        f0 f0Var = wVar.f308101a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(requestedStrategy, "requestedStrategy");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        c0 c0Var = new c0(entryPointType);
        return n14.k.p(f0Var.f.b(c0Var, f0Var.d.c(c0Var.f308207b, requestedStrategy)), new i0(16));
    }
}
