package bpe;

import cli.y;
import com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.PayStampDutyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements g {

    @NotNull
    public static final i Companion = new i();
    public final PayStampDutyScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cne.a f17618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f17619q;

    public k(PayStampDutyScreenContract$InputData inputData, cne.a stampDutyInteractor, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stampDutyInteractor, "stampDutyInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f17618p = stampDutyInteractor;
        this.f17619q = mra.d.b(this, new d(new dne.a(inputData.f90146b, inputData.f90145a)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f17619q;
    }
}
