package ry4;

import com.revolut.feature.credit.direct.debit.account_details_v2.DirectDebitAccountDetailsScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends jki.g implements jki.h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f258220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r70.c f258221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f258222r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c70.a clipboard, r70.c hapticEngine, DirectDebitAccountDetailsScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f258220p = clipboard;
        this.f258221q = hapticEngine;
        this.f258222r = new d(inputData.f69881b, inputData.f69882c, inputData.f69880a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f258222r;
    }
}
