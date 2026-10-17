package qz9;

import androidx.room.RxRoom;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import skm.p0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements iz9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv9.k f250445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iz9.c f250446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz9.a f250447c;
    public final iz9.b d;
    public final cv9.a e;
    public final i f;

    public r(mv9.k messagesRepository, iz9.c transactionsInteractor, iz9.a moneyRequestsInteractor, iz9.b paymentLinksInteractor, cv9.a encryptionInteractor, a paymentLinkFilterInteractor, i settingsInteractor) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestsInteractor, "moneyRequestsInteractor");
        Intrinsics.checkNotNullParameter(paymentLinksInteractor, "paymentLinksInteractor");
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkFilterInteractor, "paymentLinkFilterInteractor");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        this.f250445a = messagesRepository;
        this.f250446b = transactionsInteractor;
        this.f250447c = moneyRequestsInteractor;
        this.d = paymentLinksInteractor;
        this.e = encryptionInteractor;
        this.f = settingsInteractor;
    }

    public final efm.r a(zm3.a contact, iz9.d observeMode) {
        efm.r rVarJust;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(observeMode, "observeMode");
        boolean zContains = zhm.v.k(iz9.d.REMOTE_SINGLE_FETCH, iz9.d.REMOTE_POLLING).contains(observeMode);
        efm.r rVarG = ((n) this.f250446b).g(new ChatTransferRecipient.ContactRecipient(contact));
        efm.r rVarD = ((d) this.f250447c).d(new ChatTransferRecipient.ContactRecipient(contact), zContains);
        e eVar = (e) this.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        efm.r rVarW = nim.a.w(u1.e(rVarG, rVarD, ue0.e.p(nim.a.w(kli.a.i(((k61.i) eVar.f250419a).g(zContains), rd0.e.c(eVar.f250420b.c(), p0.f264003c), eVar.f250421c.a(contact)), new qpb.a(eVar, contact, 25)), h0.f322473a)), new b(this, 15));
        if (contact instanceof zm3.l) {
            if (hx7.q.N((zm3.l) contact)) {
                rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            } else {
                rVarJust = pd.b.r(this.f.a(contact), new o(this, 0, contact, observeMode));
            }
        } else {
            if (!(contact instanceof zm3.g) && !(contact instanceof zm3.p)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        }
        efm.r rVarOnErrorReturn = nim.a.w(u1.d(rVarW, rVarJust), new b(13)).onErrorReturn(new qsa.a(25, new b(14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
        return rVarOnErrorReturn;
    }

    public final efm.b b(MessageItem message) {
        Intrinsics.checkNotNullParameter(message, "messageItem");
        mv9.k kVar = this.f250445a;
        Intrinsics.checkNotNullParameter(message, "message");
        gv9.c cVar = kVar.f209188b;
        iv9.a aVarJ = kVar.f209190g.j(message);
        gv9.j jVar = (gv9.j) cVar;
        jVar.getClass();
        return RxRoom.createCompletable(jVar.f147114a, false, true, new gv9.d(jVar, aVarJ, 0));
    }
}
