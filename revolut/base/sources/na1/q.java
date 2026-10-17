package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import ha1.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends h {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha1.n f213701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f213702c;
    public final da1.d d;
    public final ca1.a e;

    public q(ca1.a cardReaderRepository, da1.d connectionInteractor, ha1.n pairingRepository, v rpcCommandsDataSource) {
        Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
        Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        this.f213701b = pairingRepository;
        this.f213702c = rpcCommandsDataSource;
        this.d = connectionInteractor;
        this.e = cardReaderRepository;
    }

    @Override // na1.h
    public final efm.b b(PairingInfo pairingInfo) {
        Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
        if (!pairingInfo.f60570h) {
            return pfm.m.f235744a;
        }
        efm.b bVarFlatMapCompletable = this.f213702c.c().flatMapCompletable(new e(16, new n(this, pairingInfo, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        ihm.f fVar = ea1.b.f124050a;
        return ea1.b.c(bVarFlatMapCompletable, "Updating firmware", fa1.k.INFO);
    }
}
