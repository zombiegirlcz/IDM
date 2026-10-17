package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import ha1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f213686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ha1.n f213687c;
    public final v d;
    public final ca1.a e;

    public j(ha1.n pairingRepository, v rpcCommandsDataSource, ca1.a cardReaderRepository, int i) {
        this.f213686b = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
                Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
                Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
                this.f213687c = pairingRepository;
                this.d = rpcCommandsDataSource;
                this.e = cardReaderRepository;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
                Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
                Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
                this.f213687c = pairingRepository;
                this.d = rpcCommandsDataSource;
                this.e = cardReaderRepository;
                break;
            default:
                Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
                Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
                Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
                this.f213687c = pairingRepository;
                this.d = rpcCommandsDataSource;
                this.e = cardReaderRepository;
                break;
        }
    }

    @Override // na1.h
    public final efm.b b(PairingInfo pairingInfo) {
        int i = this.f213686b;
        pfm.m mVar = pfm.m.f235744a;
        int i2 = 0;
        v vVar = this.d;
        Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
        switch (i) {
            case 0:
                if (!pairingInfo.f) {
                    return mVar;
                }
                efm.b bVarFlatMapCompletable = vVar.d().flatMapCompletable(new e(5, new i(this, pairingInfo, i2)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                ihm.f fVar = ea1.b.f124050a;
                return ea1.b.c(bVarFlatMapCompletable, "Updating contact params", fa1.k.INFO);
            case 1:
                if (!pairingInfo.f60569g) {
                    return mVar;
                }
                efm.b bVarFlatMapCompletable2 = vVar.d().flatMapCompletable(new e(8, new k(this, pairingInfo, i2)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
                ihm.f fVar2 = ea1.b.f124050a;
                return ea1.b.c(bVarFlatMapCompletable2, "Updating contactless params", fa1.k.INFO);
            default:
                if (!pairingInfo.i) {
                    return mVar;
                }
                efm.b bVarFlatMapCompletable3 = vVar.d().flatMapCompletable(new e(23, new s(this, pairingInfo, i2)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
                ihm.f fVar3 = ea1.b.f124050a;
                return ea1.b.c(bVarFlatMapCompletable3, "Updating terminal params", fa1.k.INFO);
        }
    }
}
