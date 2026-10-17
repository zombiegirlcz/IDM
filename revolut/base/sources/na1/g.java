package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import ha1.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha1.n f213680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1.a f213681c;
    public final v d;
    public final da1.d e;

    public g(ca1.a cardReaderRepository, da1.d connectionInteractor, ha1.n pairingRepository, v rpcCommandsDataSource) {
        Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        this.f213680b = pairingRepository;
        this.f213681c = cardReaderRepository;
        this.d = rpcCommandsDataSource;
        this.e = connectionInteractor;
    }

    @Override // na1.h
    public final efm.b b(PairingInfo pairingInfo) {
        Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
        if (!pairingInfo.f60571j) {
            return pfm.m.f235744a;
        }
        efm.b bVarFlatMapCompletable = this.d.c().flatMapCompletable(new e(1, new a(this, pairingInfo, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        ihm.f fVar = ea1.b.f124050a;
        return ea1.b.c(bVarFlatMapCompletable, "Updating Bluetooth firmware", fa1.k.INFO);
    }
}
