package jnf;

import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertControllerContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertControllerContract$ShowDialogStep;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sri.m;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements c {

    @NotNull
    public static final e Companion = new e();
    public final PendingTransactionRevertControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f176736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f176737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f176738r;

    public f(PendingTransactionRevertControllerContract$InputData inputData, m navigator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.o = inputData;
        this.f176736p = navigator;
        d dVar = new d(this, 0);
        this.f176738r = cp5.d.a(this, PendingTransactionRevertControllerContract$ShowDialogStep.f92074a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f176738r;
    }
}
