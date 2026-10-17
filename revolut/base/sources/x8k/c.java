package x8k;

import ang.f;
import com.revolut.data.network.models.transfer.PeerToPeerTransferDto;
import com.revolut.data.network.models.transfer.TransferDto;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import dj0.d;
import efm.d0;
import i2i.o;
import i31.k;
import i31.l;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import mri.w;
import rfm.f0;
import ufm.i;
import wsg.j;
import wsg.n;
import x8i.g;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y71.a f303492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y71.c f303493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f303494c;
    public final n d;
    public final z80.b e;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f303495g;

    public c(y71.a peerToPeerTransfersRepository, y71.c transfersRepository, f userInteractor, n walletInteractor, z80.b phoneToolsProvider, w jobInteractor, p streetModePaymentLocationInteractor) {
        Intrinsics.checkNotNullParameter(peerToPeerTransfersRepository, "peerToPeerTransfersRepository");
        Intrinsics.checkNotNullParameter(transfersRepository, "transfersRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        this.f303492a = peerToPeerTransfersRepository;
        this.f303493b = transfersRepository;
        this.f303494c = userInteractor;
        this.d = walletInteractor;
        this.e = phoneToolsProvider;
        this.f = jobInteractor;
        this.f303495g = streetModePaymentLocationInteractor;
    }

    public final i a(String transferLinkId, String str) {
        l lVar = (l) this.f303493b;
        Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
        d0 d0VarFirstOrError = m70.a.g(lVar.k.f(new k(transferLinkId), true), null, null, 3).firstOrError();
        g gVar = new g(6, new j(str, 19));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final void b(PeerToPeerTransferDescriptor peerToPeerTransferDescriptor) {
        if (peerToPeerTransferDescriptor instanceof PeerToPeerTransferDescriptor.Transfer) {
            ((nzl.a) this.f).a(((PeerToPeerTransferDescriptor.Transfer) peerToPeerTransferDescriptor).f60549a.a());
        }
    }

    public final f0 c(d money, String userId, String senderPocketId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(senderPocketId, "senderPocketId");
        pfm.a aVarR = this.f303495g.r(new wj0.b("payments_peer_to_peer_transfer"));
        prf.b fundingSource = new prf.b(senderPocketId, null);
        i31.c cVar = (i31.c) this.f303492a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        d0<PeerToPeerTransferDto> d0VarTransferById = cVar.f158068a.transferById(new TransferDto.TransferDtoRecipientId(money.f115082a, money.f115083b.f306286a, q11.a.c(fundingSource), userId), new wj0.b("payments_peer_to_peer_transfer"), cVar.a(), null);
        i2i.a aVar = new i2i.a(25, new o(16));
        d0VarTransferById.getClass();
        i iVar = new i(d0VarTransferById, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        f0 f0VarF = aVarR.f(new ufm.f(te0.w.i0(iVar), new g(8, new a(this, 0)), 3));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}
