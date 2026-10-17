package mv9;

import akl.s;
import androidx.room.RxRoom;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService;
import dv9.l;
import dv9.m;
import e4k.m0;
import efm.d0;
import efm.r;
import ie.b0;
import iv9.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import te0.w;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv9.b f209187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv9.c f209188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pv9.k f209189c;
    public final sv9.a d;
    public final kdh.b e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iv9.k f209190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kpj.f f209191h;
    public final r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.j f209192j;
    public final r k;

    public k(jv9.b apiMapper, gv9.c messagesDao, pv9.k messageEncryptor, sv9.a messageDecryptor, kdh.b messageReactionsInterceptor, b messageFilteringDelegate, a contactEligibilityMapper, iv9.k chatMessageMapper, kpj.f messageEntityMapper) {
        Intrinsics.checkNotNullParameter(apiMapper, "apiMapper");
        Intrinsics.checkNotNullParameter(messagesDao, "messagesDao");
        Intrinsics.checkNotNullParameter(messageEncryptor, "messageEncryptor");
        Intrinsics.checkNotNullParameter(messageDecryptor, "messageDecryptor");
        Intrinsics.checkNotNullParameter(messageReactionsInterceptor, "messageReactionsInterceptor");
        Intrinsics.checkNotNullParameter(messageFilteringDelegate, "messageFilteringDelegate");
        Intrinsics.checkNotNullParameter(contactEligibilityMapper, "contactEligibilityMapper");
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        Intrinsics.checkNotNullParameter(messageEntityMapper, "messageEntityMapper");
        this.f209187a = apiMapper;
        this.f209188b = messagesDao;
        this.f209189c = messageEncryptor;
        this.d = messageDecryptor;
        this.e = messageReactionsInterceptor;
        this.f = messageFilteringDelegate;
        this.f209190g = chatMessageMapper;
        this.f209191h = messageEntityMapper;
        r rVarShare = g(null).share();
        Intrinsics.checkNotNullExpressionValue(rVarShare, "share(...)");
        this.i = rVarShare;
        ihm.j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f209192j = jVarD;
        r rVarC = jVarD.toFlowable(efm.a.BUFFER).g(new b0(new s(this, 27), 9), 1).C();
        Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
        r rVarShare2 = rVarC.share();
        Intrinsics.checkNotNullExpressionValue(rVarShare2, "share(...)");
        this.k = rVarShare2;
    }

    public final pfm.r a(String messageId, m conversation) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        gv9.j jVar = (gv9.j) this.f209188b;
        efm.k kVarCreateMaybe = RxRoom.createMaybe(jVar.f147114a, true, false, new gv9.e(jVar, messageId, 0));
        od0.h hVar = od0.i.Companion;
        msb.e eVar = new msb.e(25, new mm7.h(hVar));
        kVarCreateMaybe.getClass();
        rfm.m mVar = new rfm.m(kVarCreateMaybe, eVar, 1);
        hVar.getClass();
        pfm.a aVar = new pfm.a(mVar.e(od0.i.f224256b), new msb.e(26, new moe.c(this, 6, messageId, conversation)), 3);
        String id10 = dv9.f.DELETED.getId();
        pfm.a aVarE = aVar.e(gv9.c.a(this.f209188b, messageId, dv9.d.SENT.getId(), id10, null, null, 24));
        jVar.getClass();
        pfm.h hVar2 = new pfm.h(new a08.d(jVar, 25), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        pfm.a aVarE2 = aVarE.e(hVar2);
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        return w.g0(aVarE2);
    }

    public final pfm.a b(String messageId, m conversation) {
        efm.b bVarDeleteMessage;
        SocialPaymentsService socialPaymentsService = this.f209187a.f178790a;
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (conversation instanceof dv9.k) {
            bVarDeleteMessage = socialPaymentsService.deleteGroupMessage(conversation.f118076a, messageId);
        } else {
            if (!(conversation instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarDeleteMessage = socialPaymentsService.deleteMessage(messageId);
        }
        return ue0.e.A(bVarDeleteMessage, new mul.k(9));
    }

    public final r c(ev9.a aVar, m mVar) {
        int i = j.f209186a[aVar.ordinal()];
        if (i == 1) {
            return w.h(Unit.f186387a);
        }
        r rVarG = this.i;
        if (i == 2) {
            if (mVar instanceof dv9.k) {
                rVarG = g(mVar);
            }
            return rVarG.firstOrError().x().startWith(Unit.f186387a);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (mVar instanceof dv9.k) {
            rVarG = g(mVar);
        }
        return rd0.e.p(rVarG, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 30000L, 25).startWith(Unit.f186387a);
    }

    public final r d(m mVar, final Long l2) {
        final String str = mVar.f118076a;
        final List listK = v.k(dv9.d.SENT.getId(), dv9.d.SENDING.getId(), dv9.d.ERROR.getId());
        final List listC = u.c(dv9.f.ACTIVE.getId());
        final boolean z = mVar instanceof dv9.k;
        final gv9.j jVar = (gv9.j) this.f209188b;
        jVar.getClass();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("\n        SELECT \n            * \n        FROM \n            payments_social_reactions \n        LEFT JOIN payments_social_sent_message ON payments_social_reactions.id == payments_social_sent_message.messageId\n        WHERE \n            (senderId = ? OR recipientId = ?) AND \n            status IN (");
        final int size = listK.size();
        StringUtil.appendPlaceholders(sb6, size);
        sb6.append(") AND ");
        sb6.append("\n");
        sb6.append("            state IN (");
        final int size2 = listC.size();
        StringUtil.appendPlaceholders(sb6, size2);
        sb6.append(") AND ");
        sb6.append("\n");
        sb6.append("            isGroupChat = ");
        j6.a.D(sb6, "?", " AND", "\n", "            (");
        j6.a.D(sb6, "?", " IS NULL OR createdDate >= ", "?", ")");
        j6.a.D(sb6, "\n", "        ORDER BY ", "\n", "            updatedDate ASC");
        final String strI = v0.a.i(sb6, "\n", "            ");
        r map = RxRoom.createObservable(jVar.f147114a, false, new String[]{"payments_social_reactions", "payments_social_sent_message"}, new Function1() { // from class: gv9.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String text;
                int i;
                int i2;
                int i3;
                int i5;
                n nVar;
                List<String> list = listK;
                int i6 = size;
                List<String> list2 = listC;
                int i21 = size2;
                boolean z3 = z;
                j jVar2 = jVar;
                jVar2.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(strI);
                String str2 = str;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    int i22 = 3;
                    for (String str3 : list) {
                        if (str3 == null) {
                            sQLiteStatementPrepare.bindNull(i22);
                        } else {
                            sQLiteStatementPrepare.bindText(i22, str3);
                        }
                        i22++;
                    }
                    int i32 = i6 + 3;
                    int i33 = i32;
                    for (String str4 : list2) {
                        if (str4 == null) {
                            sQLiteStatementPrepare.bindNull(i33);
                        } else {
                            sQLiteStatementPrepare.bindText(i33, str4);
                        }
                        i33++;
                    }
                    sQLiteStatementPrepare.bindLong(i32 + i21, z3 ? 1L : 0L);
                    int i43 = i6 + 4 + i21;
                    Long l3 = l2;
                    if (l3 == null) {
                        sQLiteStatementPrepare.bindNull(i43);
                    } else {
                        sQLiteStatementPrepare.bindLong(i43, l3.longValue());
                    }
                    int i59 = i6 + 5 + i21;
                    if (l3 == null) {
                        sQLiteStatementPrepare.bindNull(i59);
                    } else {
                        sQLiteStatementPrepare.bindLong(i59, l3.longValue());
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "senderId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "media");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isGroupChat");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "metadata");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "localId");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "messageId");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                            text = null;
                            i2 = columnIndexOrThrow2;
                            i = columnIndexOrThrow3;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                            i = columnIndexOrThrow3;
                            i2 = columnIndexOrThrow2;
                        }
                        iv9.a aVar = new iv9.a(text2, text3, text4, text5, text, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), jVar2.f147116c.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                            i5 = columnIndexOrThrow4;
                            nVar = null;
                            i3 = columnIndexOrThrow;
                        } else {
                            i3 = columnIndexOrThrow;
                            i5 = columnIndexOrThrow4;
                            nVar = new n(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                        }
                        arrayList.add(new a(aVar, nVar));
                        columnIndexOrThrow2 = i2;
                        columnIndexOrThrow4 = i5;
                        columnIndexOrThrow = i3;
                        columnIndexOrThrow3 = i;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        }).map(new h(7, new e(this, mVar, 6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r e(long j2, String str) {
        gv9.j jVar = (gv9.j) this.f209188b;
        r map = RxRoom.createObservable(jVar.f147114a, false, new String[]{"payments_social_reactions"}, new m0(jVar, j2, 4)).map(new msb.e(17, new mt9.c(this, str, 5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r f(m conversation, ev9.a observeMode, Long l2) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(observeMode, "observeMode");
        d0 d0VarFirstOrError = d(conversation, l2).firstOrError();
        h hVar = new h(4, new moe.c(observeMode, 7, this, conversation));
        d0VarFirstOrError.getClass();
        sfm.b bVar = new sfm.b(d0VarFirstOrError, hVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        r map = d(conversation, l2).map(new h(5, new mul.k(13)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF0 = w.f0(map);
        r rVarC = c(observeMode, conversation);
        Intrinsics.checkNotNullExpressionValue(rVarC, "getRemoteUpdateObservable(...)");
        r rVarDistinctUntilChanged = w.l(rVarF0, rVarC).map(new h(6, new mul.k(14))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarConcat = r.concat(bVar, rVarDistinctUntilChanged);
        Intrinsics.checkNotNullExpressionValue(rVarConcat, "concat(...)");
        r rVarDistinctUntilChanged2 = ue0.e.H(rVarConcat, h0.f322473a, new mul.k(12)).map(new h(1, new c(this, 3))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged2;
    }

    public final j01.b g(m mVar) {
        j01.b bVar = new j01.b(r.interval(0L, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS, hhm.f.f152431c).toFlowable(efm.a.DROP).f(new b0(new bsi.b(this, mVar, 2), 10), 1, efm.i.f125385a), 7);
        Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
        return bVar;
    }

    public final pfm.r h(MessageItem message, m conversation) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        long millis = DateTime.now().getMillis();
        efm.b bVarA = gv9.c.a(this.f209188b, message.getF79578a(), dv9.d.SENDING.getId(), null, Long.valueOf(millis), Long.valueOf(millis), 4);
        pfm.h hVar = new pfm.h(new la8.j(this, conversation, 18), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarA.e(hVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }

    public final r i(m conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        String str = conversation.f118076a;
        List listC = u.c(dv9.f.DELETED.getId());
        List listC2 = u.c(dv9.d.SENDING.getId());
        gv9.j jVar = (gv9.j) this.f209188b;
        d0 d0VarFirstOrError = jVar.b(str, conversation instanceof dv9.k, listC, listC2).firstOrError();
        msb.e eVar = new msb.e(27, new mul.k(10));
        d0VarFirstOrError.getClass();
        sfm.b bVar = new sfm.b(d0VarFirstOrError, eVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.b bVarFlatMapCompletable = w.w0(bVar).flatMapCompletable(new msb.e(28, new e(this, conversation, 4)));
        pfm.h hVar = new pfm.h(new a08.d(jVar, 25), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarFlatMapCompletable.e(hVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        r rVarC = w.g0(aVarE).C();
        Unit unit = Unit.f186387a;
        r rVarStartWith = rVarC.startWith(unit);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r rVarStartWith2 = this.k.startWith(unit);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith2, "startWith(...)");
        r rVarDistinctUntilChanged = w.l(rVarStartWith, rVarStartWith2).doOnSubscribe(new msb.e(22, new e(this, conversation, 3))).map(new msb.e(23, new mul.k(8))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final pfm.r j(MessageItem message, m conversation, String localId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(localId, "localId");
        iv9.a aVarJ = this.f209190g.j(MessageItem.a(message, null, null, dv9.d.SENDING, 3583));
        String messageId = message.getF79578a();
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(localId, "localId");
        pfm.h hVar = new pfm.h(new ly2.d(new n(localId, messageId), 8, this, aVarJ), 2);
        pfm.h hVar2 = new pfm.h(new la8.j(this, conversation, 18), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        pfm.a aVarE = hVar.e(hVar2);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }
}
