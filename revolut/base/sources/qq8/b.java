package qq8;

import com.revolut.data.network.models.transfer.PeerToPeerTransferDto;
import com.revolut.data.network.models.transfer.TransferDto;
import com.revolut.data.network.models.transfer.mapper.TransferReasonEmbeddedDtoMapperKt;
import com.revolut.data.network.models.transfer.mapper.TransferReasonsValuesDtoMapperKt;
import com.revolut.data.network.services.PeerToPeerTransferService;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import dj0.d;
import gim.i;
import gsf.r;
import i2i.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mjf.b0;
import mri.w;
import pfm.n;
import rfm.f0;
import te8.z;
import tof.hc;
import ue0.e;
import ufm.f;
import x8i.g;
import x8k.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f248501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f248502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f248503c;
    public final w d;

    public b(c transferInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, z juniorProductsInteractor, w revolutJobInteractor) {
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        this.f248501a = transferInteractor;
        this.f248502b = transactionsInteractor;
        this.f248503c = juniorProductsInteractor;
        this.d = revolutJobInteractor;
    }

    public final Object a(String id10, d money, String str, String str2, i iVar) {
        String str3 = (str == null || d0.W(str)) ? null : str;
        String str4 = (str2 == null || d0.W(str2)) ? null : str2;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(money, "money");
        TransferAppSource.DEFAULT source = TransferAppSource.DEFAULT.f92298a;
        Intrinsics.checkNotNullParameter(source, "source");
        c cVar = this.f248501a;
        pfm.a aVarR = cVar.f303495g.r(new wj0.b("payments_peer_to_peer_transfer"));
        y71.a aVar = cVar.f303492a;
        rtf.a aVar2 = new rtf.a(null);
        i31.c cVar2 = (i31.c) aVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(source, "source");
        PeerToPeerTransferService peerToPeerTransferService = cVar2.f158068a;
        r dto = null;
        String str5 = str3;
        long j2 = money.f115082a;
        String str6 = money.f115083b.f306286a;
        if (str5 == null) {
            str5 = "";
        }
        Intrinsics.checkNotNullParameter(source, "<this>");
        String strB = q11.a.b(source);
        krf.c cVarI = mra.d.i(aVar2);
        ibl.d embeddedDto = cVarI != null ? TransferReasonEmbeddedDtoMapperKt.toEmbeddedDto(cVarI) : null;
        TransferReasonsValues transferReasonsValuesK = mra.d.k(aVar2);
        if (transferReasonsValuesK != null) {
            dto = TransferReasonsValuesDtoMapperKt.toDto(transferReasonsValuesK);
        }
        efm.d0<PeerToPeerTransferDto> d0VarTransferById = peerToPeerTransferService.transferById(new TransferDto.TransferDtoId(id10, j2, str6, str5, str4, "DEFAULT", strB, embeddedDto, dto), new wj0.b("payments_peer_to_peer_transfer"), cVar2.a());
        i2i.a aVar3 = new i2i.a(27, new o(18));
        d0VarTransferById.getClass();
        ufm.i iVar2 = new ufm.i(d0VarTransferById, aVar3, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        f0 f0VarF = aVarR.f(new f(te0.w.i0(iVar2), new g(10, new x8k.a(cVar, 4)), 3));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        f fVar = new f(f0VarF, new qmd.c(23, new qpb.i(19)), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        Object objB = nim.a.b(fVar, iVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    public final Object b(String str, i iVar) {
        pfm.d dVarQ = efm.b.q(((b0) this.f248502b).g(new hc(str, null)), z.c(this.f248503c), new n(new nc0.a(this, 21), 1));
        Intrinsics.checkNotNullExpressionValue(dVarQ, "mergeArrayDelayError(...)");
        Object objA = nim.a.a(e.v(dVarQ), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
