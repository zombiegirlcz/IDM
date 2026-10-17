package mv9;

import a09.a0;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService;
import dv9.l;
import dv9.m;
import efm.d0;
import efm.r;
import gqd.s;
import iv9.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeUtils;
import rfm.y;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f209176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f209177c;

    public /* synthetic */ e(k kVar, m mVar, int i) {
        this.f209175a = i;
        this.f209176b = kVar;
        this.f209177c = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0<kv9.h> d0VarSendMessage;
        int i = this.f209175a;
        int i2 = 22;
        int i3 = 25;
        int i5 = 13;
        int i6 = 2;
        int i21 = 0;
        m conversation = this.f209177c;
        k kVar = this.f209176b;
        int i22 = 1;
        switch (i) {
            case 0:
                iv9.a newMessage = (iv9.a) obj2;
                Intrinsics.checkNotNullParameter(newMessage, "it");
                sv9.c cVar = (sv9.c) kVar.f209189c;
                cv9.a aVar = cVar.f265858b;
                Intrinsics.checkNotNullParameter(newMessage, "newMessage");
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                iv9.k kVar2 = cVar.e;
                String str = newMessage.e;
                if (str == null) {
                    str = "";
                }
                String str2 = newMessage.d;
                if (!(kVar2.a(str, str2 != null ? str2 : "") instanceof MessageType.Text)) {
                    return d0.m(newMessage);
                }
                if (conversation instanceof l) {
                    pv9.d dVar = (pv9.d) aVar;
                    ufm.c cVarJ = dVar.j();
                    gv9.j jVar = (gv9.j) cVar.f265859c;
                    ufm.i iVar = new ufm.i(dVar.j(), new sp5.h(26, new sv9.b((iv9.a) DBUtil.performBlocking(jVar.f147114a, true, false, new gv9.e(jVar, newMessage.f168779c, 1)), cVar, 4)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    return new ufm.i(new ufm.i(w.H0(cVarJ, iVar), new sp5.h(i2, new sv9.b(cVar, newMessage, i21)), 0), new sp5.h(23, new sv9.b(newMessage, cVar, i22)), 1);
                }
                if (!(conversation instanceof dv9.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                pv9.d dVar2 = (pv9.d) aVar;
                dVar2.getClass();
                ufm.c cVar2 = new ufm.c(new nc0.a(dVar2, i5), 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                return new ufm.i(new ufm.i(cVar2, new sp5.h(24, new sv9.b(cVar, newMessage, i6)), 0), new sp5.h(i3, new sv9.b(newMessage, cVar, 3)), 1);
            case 1:
                iv9.a aVar2 = (iv9.a) obj2;
                iv9.k kVar3 = kVar.f209190g;
                Intrinsics.h(aVar2);
                return kVar3.i(aVar2, conversation, null);
            case 2:
                List messages = (List) obj2;
                Intrinsics.checkNotNullParameter(messages, "messages");
                gv9.j jVar2 = (gv9.j) kVar.f209188b;
                jVar2.getClass();
                messages.getClass();
                efm.b bVarCreateCompletable = RxRoom.createCompletable(jVar2.f147114a, false, true, new s(jVar2, messages, i3));
                jv9.b bVar = kVar.f209187a;
                Intrinsics.checkNotNullParameter(messages, "messages");
                pfm.h hVar = new pfm.h(new a0(messages, i2, bVar, conversation), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return bVarCreateCompletable.e(hVar);
            case 3:
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                kVar.f209192j.onNext(conversation);
                return Unit.f186387a;
            case 4:
                iv9.a message = (iv9.a) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                pfm.a aVarE = kVar.b(message.f168777a, conversation).e(gv9.c.a(kVar.f209188b, message.f168777a, dv9.d.SENT.getId(), dv9.f.DELETED.getId(), null, null, 24));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return ue0.e.A(aVarE, new mt9.c(kVar, message, 6));
            case 5:
                List pendingMessages = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.VERBOSE, "MessagesRepositoryImpl", a0.d.n("sendPendingMessages(): pendingMessages = ", pendingMessages.size()), null, null, 16);
                r rVarFlatMapSingle = r.fromIterable(pendingMessages).flatMapSingle(new msb.e(i5, new e(kVar, conversation, i21)));
                Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
                return w.a0(rVarFlatMapSingle, new e(kVar, conversation, i22));
            case 6:
                List<gv9.a> messagesWithLocalId = (List) obj2;
                Intrinsics.checkNotNullParameter(messagesWithLocalId, "messagesWithLocalId");
                ArrayList arrayList = new ArrayList();
                for (gv9.a aVar3 : messagesWithLocalId) {
                    iv9.k kVar4 = kVar.f209190g;
                    iv9.a aVar4 = aVar3.f147089a;
                    n nVar = aVar3.f147090b;
                    MessageItem messageItemI = kVar4.i(aVar4, conversation, nVar != null ? nVar.f168799a : null);
                    if (messageItemI != null) {
                        arrayList.add(messageItemI);
                    }
                }
                return arrayList;
            default:
                MessageItem reaction = (MessageItem) obj2;
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                if (DateTimeUtils.currentTimeMillis() - reaction.f79532b.getMillis() >= 300000) {
                    return gv9.c.a(kVar.f209188b, reaction.f79531a, dv9.d.ERROR.getId(), null, null, null, 28);
                }
                jv9.b bVar2 = kVar.f209187a;
                iv9.k kVar5 = bVar2.f178791b;
                SocialPaymentsService socialPaymentsService = bVar2.f178790a;
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                if (conversation instanceof dv9.k) {
                    d0VarSendMessage = socialPaymentsService.sendGroupMessage(conversation.f118076a, kVar5.k(reaction));
                } else {
                    if (!(conversation instanceof l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d0VarSendMessage = socialPaymentsService.sendMessage(kVar5.k(reaction));
                }
                msb.e eVar = new msb.e(11, new c(kVar, i6));
                d0VarSendMessage.getClass();
                rfm.j jVar3 = new rfm.j(d0VarSendMessage, eVar, i6);
                msb.e eVar2 = new msb.e(12, new d(kVar, reaction, i21));
                dfm.c cVar3 = mfm.f.d;
                rfm.s sVar = new rfm.s(new y(jVar3, cVar3, eVar2, cVar3, mfm.f.f205043c));
                Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
                return ue0.e.A(sVar, new d(kVar, reaction, i22));
        }
    }
}
