package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.youTransactor.uCube.rpc.command.DisplayMessageCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sa1.t;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f213697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PairingInfo f213698c;

    public /* synthetic */ n(q qVar, PairingInfo pairingInfo, int i) {
        this.f213696a = i;
        this.f213697b = qVar;
        this.f213698c = pairingInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213696a) {
            case 0:
                ra1.a loadKeyInfo = (ra1.a) obj2;
                Intrinsics.checkNotNullParameter(loadKeyInfo, "loadKeyInfo");
                q qVar = this.f213697b;
                ha1.n nVar = qVar.f213701b;
                PairingInfo pairingInfo = this.f213698c;
                String terminalId = pairingInfo.f60566a;
                String prodCert = loadKeyInfo.f252775a;
                String kekCert = loadKeyInfo.f252776b;
                ha1.f fVar = (ha1.f) qVar.e;
                String svppFirmwareVersion = fVar.d();
                String bluetoothFirmwareVersion = fVar.a();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                Intrinsics.checkNotNullParameter(prodCert, "prodCert");
                Intrinsics.checkNotNullParameter(kekCert, "kekCert");
                Intrinsics.checkNotNullParameter(svppFirmwareVersion, "svppFirmwareVersion");
                Intrinsics.checkNotNullParameter(bluetoothFirmwareVersion, "bluetoothFirmwareVersion");
                ufm.i iVar = new ufm.i(new ufm.c(new ha1.l(prodCert, kekCert, svppFirmwareVersion, bluetoothFirmwareVersion, 0), 2), new ha1.j(12, new ha1.h(nVar, terminalId, 3)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return new pfm.a(w.i0(iVar), new e(17, new n(qVar, pairingInfo, 1)), 4);
            default:
                qa1.g it8 = (qa1.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                efm.r rVarFromIterable = efm.r.fromIterable(it8.f243937b);
                q qVar2 = this.f213697b;
                efm.b bVarConcatMapCompletable = rVarFromIterable.concatMapCompletable(new e(18, new o(qVar2, 0)));
                ((sa1.q) qVar2.f213702c.f150392a).getClass();
                DisplayMessageCommand displayMessageCommand = new DisplayMessageCommand("");
                displayMessageCommand.setClearConfig((byte) 5);
                efm.b bVarIgnoreElements = pw5.a.g(t.b(displayMessageCommand, null, 3)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                dfm.c cVar = mfm.f.f205044g;
                bVarIgnoreElements.getClass();
                pfm.a aVarE = bVarConcatMapCompletable.e(new pfm.a(bVarIgnoreElements, cVar, 1));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE.e(ha1.n.a(qVar2.f213701b, this.f213698c.f60566a, null, null, it8.f243936a, null, null, null, null, 246));
        }
    }
}
