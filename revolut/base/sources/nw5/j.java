package nw5;

import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw5.e f219783a;

    public j(tw5.e cryptoStatsRepository) {
        Intrinsics.checkNotNullParameter(cryptoStatsRepository, "cryptoStatsRepository");
        this.f219783a = cryptoStatsRepository;
    }

    public final r a(boolean z) {
        tw5.e eVar = this.f219783a;
        eVar.getClass();
        return eVar.d.e(Unit.f186387a, z ? w4l.i.f294643c : w4l.h.f294642c);
    }
}
