package py4;

import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends jki.g implements jki.h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f240664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r70.c f240665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f240666r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c70.a clipboard, r70.c hapticEngine, DirectDebitAccountDetailsScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f240664p = clipboard;
        this.f240665q = hapticEngine;
        this.f240666r = new c(inputData.f69873a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f240666r;
    }
}
