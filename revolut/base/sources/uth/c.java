package uth;

import cli.g;
import cli.y;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements dli.b {

    @NotNull
    public static final b Companion = new b();
    public final CloseProductScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f283104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f283105q;

    public c(d stateMapper, CloseProductScreenContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f283104p = deeplinkHandler;
        this.f283105q = mra.d.b(this, new a(inputData.f96503a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f283105q;
    }
}
