package h66;

import cli.y;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends oki.h implements dli.b {
    public final RecoveryPhraseConsentContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f66.a f149598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f149599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.g f149600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f149601s;

    public e(h mapper, RecoveryPhraseConsentContract$InputData inputData, b66.c repository, f66.a keyAgreementInteractor, c errorMapper, com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.g decryptor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(keyAgreementInteractor, "keyAgreementInteractor");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(decryptor, "decryptor");
        this.o = inputData;
        this.f149598p = keyAgreementInteractor;
        this.f149599q = errorMapper;
        this.f149600r = decryptor;
        this.f149601s = mra.d.b(this, new a(false, false, false, false), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f149601s;
    }
}
