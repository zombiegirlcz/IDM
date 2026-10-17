package asa;

import com.revolut.data.model.Data;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import g4k.r;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements urf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8901a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final urf.c f8902b;

    public l(Data data, PushToCardTransferData pushToCardTransferData, kqa.a aVar) {
        Data data2;
        urf.d dVar;
        try {
            Object content = data.getContent();
            if (content != null) {
                hrf.d dVar2 = ((hrf.e) content).f154814a;
                dVar = new urf.d(aVar != null ? aVar.f188353g.f188359a : dVar2.f154812a, aVar != null ? aVar.f188353g.f188360b : dVar2.f154813b);
            } else {
                dVar = null;
            }
            data2 = new Data(dVar, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        this.f8902b = new urf.c(data2, pushToCardTransferData.f81528b, pushToCardTransferData.f81529c);
    }

    @Override // urf.e
    public final urf.c a() {
        switch (this.f8901a) {
        }
        return this.f8902b;
    }

    public l(r3k.f fVar, RemittanceTransferData remittanceTransferData) {
        Data data;
        urf.d dVar;
        Data data2 = ((r3k.b) fVar.E.getValue()).f251301c;
        try {
            Object content = data2.getContent();
            if (content != null) {
                z1k.e eVar = (z1k.e) content;
                dVar = new urf.d(eVar.getTransferLimits().getLower(), eVar.getTransferLimits().getUpper());
            } else {
                dVar = null;
            }
            data = new Data(dVar, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        this.f8902b = new urf.c(data, remittanceTransferData.f102049a, remittanceTransferData.f102050b);
    }

    public l(Data data, PeerToPeerTransferData peerToPeerTransferData) {
        Data data2;
        urf.d dVar;
        try {
            Object content = data.getContent();
            if (content != null) {
                hrf.d dVar2 = ((hrf.e) content).f154814a;
                dVar = new urf.d(dVar2.f154812a, dVar2.f154813b);
            } else {
                dVar = null;
            }
            data2 = new Data(dVar, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        this.f8902b = new urf.c(data2, peerToPeerTransferData.f102244a, peerToPeerTransferData.f102245b);
    }

    public l(r rVar, BankTransferData bankTransferData) {
        Data data;
        urf.d dVar;
        Data data2 = rVar.f140581a;
        try {
            Object content = data2.getContent();
            if (content != null) {
                z1k.e eVar = (z1k.e) content;
                dVar = new urf.d(eVar.getTransferLimits().getLower(), eVar.getTransferLimits().getUpper());
            } else {
                dVar = null;
            }
            data = new Data(dVar, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        this.f8902b = new urf.c(data, bankTransferData.f101924a, bankTransferData.f101925b);
    }
}
