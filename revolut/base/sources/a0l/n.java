package a0l;

import cli.y;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends oki.h implements a {

    @NotNull
    private static final m Companion = new m();
    public final NationalIdentifierDocumentContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzk.a f441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f442q;

    public n(p stateMapper, o saveStateDelegate, NationalIdentifierDocumentContract$InputData inputData, zzk.a nationalIdentifiersUtils) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(nationalIdentifiersUtils, "nationalIdentifiersUtils");
        this.o = inputData;
        this.f441p = nationalIdentifiersUtils;
        this.f442q = mra.d.b(this, new b(new xel.f(inputData.f104207a, false, false), null), stateMapper, saveStateDelegate, false, 8);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f442q;
    }
}
