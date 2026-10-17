package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import ha1.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f213694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ha1.n f213695c;
    public final v d;

    public m(ha1.n pairingRepository, v rpcCommandsDataSource, int i) {
        this.f213694b = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
                Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
                this.f213695c = pairingRepository;
                this.d = rpcCommandsDataSource;
                break;
            default:
                Intrinsics.checkNotNullParameter(pairingRepository, "pairingRepository");
                Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
                this.f213695c = pairingRepository;
                this.d = rpcCommandsDataSource;
                break;
        }
    }

    @Override // na1.h
    public final efm.b b(PairingInfo pairingInfo) {
        int i = this.f213694b;
        pfm.m mVar = pfm.m.f235744a;
        int i2 = 0;
        v vVar = this.d;
        Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
        switch (i) {
            case 0:
                if (!pairingInfo.d) {
                    return mVar;
                }
                efm.b bVarFlatMapCompletable = vVar.c().flatMapCompletable(new e(11, new l(this, pairingInfo, i2)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                ihm.f fVar = ea1.b.f124050a;
                return ea1.b.c(bVarFlatMapCompletable, "Updating DEK key", fa1.k.INFO);
            default:
                if (!pairingInfo.e) {
                    return mVar;
                }
                efm.b bVarFlatMapCompletable2 = vVar.c().flatMapCompletable(new e(21, new r(this, pairingInfo, i2)));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
                ihm.f fVar2 = ea1.b.f124050a;
                return ea1.b.c(bVarFlatMapCompletable2, "Updating PEK key", fa1.k.INFO);
        }
    }
}
