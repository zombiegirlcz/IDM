package b4d;

import a26.s;
import av8.o;
import blh.k0;
import bq5.a0;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$Step;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreenContract$InputData;
import com.revolut.feature.in_app_calls.Callee;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.messaging.data.api.model.Bill;
import com.revolut.feature.payments.messaging.data.api.model.MessageAuthor;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.Settlement;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import o97.m;
import oq9.c0;
import org.joda.time.DateTime;
import te0.w;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zsc.d;
import zsc.l;
import zsc.p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12296c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Callee callee, com.revolut.feature.in_app_calls.b bVar, UUID uuid, UUID uuid2) {
        this.f12294a = 11;
        this.f12295b = callee;
        this.f12296c = uuid;
        this.d = uuid2;
    }

    private final Object a(Object obj2) {
        Object next;
        r rVarW;
        r rVar = (r) this.f12295b;
        k0 k0Var = (k0) this.d;
        String str = (String) this.f12296c;
        List accounts = (List) obj2;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Iterator it8 = accounts.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof WealthAccount.Securities) {
                break;
            }
        }
        WealthAccount.Securities securities = (WealthAccount.Securities) next;
        if (securities == null || !securities.available()) {
            return w.h(zi0.c.P(f0.f322471a, false, null, 3));
        }
        b4f.b bVar = k0Var.f;
        m mVar = k0Var.k;
        if (mVar == null) {
            rVarW = r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.h(rVarW);
        } else {
            rVarW = nim.a.w(rVar, new s(mVar, bVar, 8));
        }
        return pd.b.r(rVarW, new beg.k(k0Var, str, 24));
    }

    private final Object b(Object obj2) {
        k0 k0Var = (k0) this.f12295b;
        String str = (String) this.f12296c;
        List list = (List) this.d;
        List instruments = (List) obj2;
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        zsc.m.Companion.getClass();
        zsc.m mVarA = l.a(str);
        blh.a aVar = new blh.a();
        p pVar = p.WORD_PREFIX;
        zsc.f fVar = new zsc.f(new zsc.h(new Pair(aVar, pVar), new Pair(tz4.d.a(k0Var.f16667a, R$string.search_block_ipos_name), pVar)), mVarA);
        d.a aVar2 = zsc.d.Companion;
        bhl.g gVar = new bhl.g(fVar, 9);
        aVar2.getClass();
        List listR = knm.b.r(d.a.a(gVar), instruments, list, new blh.b(), null, 56);
        List list2 = listR;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((n) it8.next()).f214596b);
        }
        return listR.isEmpty() ? zi0.c.i(f0.f322471a) : nim.a.v(k0Var.f16670g.z(d0.i1(arrayList), w4l.i.f294643c), new o(listR, 2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    private final Object c(Object obj2) {
        com.revolut.feature.apm.bills.bpay.impl.flow.a aVar = (com.revolut.feature.apm.bills.bpay.impl.flow.a) this.f12295b;
        ?? r06 = aVar.f61204t;
        BPayFlowContract$InputData bPayFlowContract$InputData = aVar.o;
        yki.l lVar = (yki.l) this.f12296c;
        BPayFlowContract$Step bPayFlowContract$Step = (BPayFlowContract$Step) this.d;
        fo1.k result = (fo1.k) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof fo1.j) {
            fo1.j jVar = (fo1.j) result;
            oki.h.t2(aVar, lVar, new BPayFlowContract$Step.Review(new BPayReviewScreenContract$InputData(jVar.f136760a, ((BPayFlowContract$Step.Amount) bPayFlowContract$Step).f61195a.f61219b, jVar.f136761b, bPayFlowContract$InputData.f61194c, (ScreenConfiguration) r06.getValue(), jVar.f136762c, jVar.d)), true, null, false, 12);
        } else if (result instanceof fo1.h) {
            fo1.h hVar = (fo1.h) result;
            oki.h.t2(aVar, lVar, new BPayFlowContract$Step.Review(new BPayReviewScreenContract$InputData(hVar.f136755a, ((BPayFlowContract$Step.Amount) bPayFlowContract$Step).f61195a.f61219b, hVar.f136756b, bPayFlowContract$InputData.f61194c, (ScreenConfiguration) r06.getValue(), hVar.f136757c, hVar.d)), true, null, false, 12);
        } else {
            if (!(result instanceof fo1.i)) {
                throw new NoWhenBranchMatchedException();
            }
            fo1.i iVar = (fo1.i) result;
            oki.h.w2(lVar, new BPayFlowContract$Step.TransferBreakdown(iVar.f136758a, iVar.f136759b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }

    private final Object d(Object obj2) {
        String str = (String) this.f12296c;
        String str2 = (String) this.f12295b;
        kn5.o oVar = (kn5.o) this.d;
        a0 update = (a0) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return a0.a(update, null, null, str, str2, null, null, null, null, null, null, null, null, null, null, null, oVar != null ? oVar.f186009a : null, null, false, null, null, false, false, null, null, null, null, 1073479667);
    }

    private final Object e(Object obj2) {
        b9k.f fVar = (b9k.f) this.f12295b;
        do3.n user = (do3.n) this.f12296c;
        PaymentGroup paymentGroup = (PaymentGroup) this.d;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        mq9.c cVar = (mq9.c) pair.f186385a;
        List list = (List) pair.f186386b;
        List list2 = cVar.f207899b;
        List list3 = cVar.f207900c;
        fVar.getClass();
        List<oq9.i> list4 = list2;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        for (oq9.i iVar : list4) {
            String id10 = iVar.getId();
            DateTime dateTimeB = iVar.b();
            dv9.n nVar = oi0.d.G(iVar.c(), user) ? dv9.n.OUTGOING : dv9.n.INCOMING;
            boolean zN = nz8.d.n(user, iVar.k());
            boolean zG = oi0.d.G(iVar.h(), user);
            List listK = iVar.k();
            Intrinsics.checkNotNullParameter(listK, "<this>");
            Intrinsics.checkNotNullParameter(user, "user");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listK) {
                List list5 = list;
                if (oi0.d.G(((oq9.j) obj3).d, user)) {
                    arrayList2.add(obj3);
                }
                list = list5;
            }
            List list6 = list;
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj4 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                if (i == 0) {
                    oq9.j jVar = (oq9.j) obj4;
                    dj0.d dVar = jVar.f;
                    if (dVar == null) {
                        dVar = jVar.e;
                    }
                    dVarO = dVar;
                } else {
                    oq9.j jVar2 = (oq9.j) obj4;
                    dj0.d dVar2 = jVar2.f;
                    if (dVar2 == null) {
                        dVar2 = jVar2.e;
                    }
                    dVarO = pyd.c.O(dVarO, dVar2);
                }
                i = i2;
            }
            List listK2 = iVar.k();
            Intrinsics.checkNotNullParameter(listK2, "<this>");
            Intrinsics.checkNotNullParameter(user, "user");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : listK2) {
                if (oi0.d.F(((oq9.j) obj5).d, user)) {
                    arrayList3.add(obj5);
                }
            }
            dj0.d.Companion.getClass();
            dj0.d dVarO2 = dj0.d.e;
            int i3 = 0;
            for (Object obj6 : arrayList3) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                if (i3 == 0) {
                    oq9.j jVar3 = (oq9.j) obj6;
                    dVarO2 = jVar3.f;
                    if (dVarO2 == null) {
                        dVarO2 = jVar3.e;
                    }
                } else {
                    oq9.j jVar4 = (oq9.j) obj6;
                    dj0.d dVar3 = jVar4.f;
                    if (dVar3 == null) {
                        dVar3 = jVar4.e;
                    }
                    dVarO2 = pyd.c.O(dVarO2, dVar3);
                }
                i3 = i5;
            }
            arrayList.add(new Bill(id10, dateTimeB, nVar, zN, zG, dVarO2, dVarO, iVar, null));
            list = list6;
        }
        List list7 = list;
        List<c0> list8 = list3;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(list8, 10));
        for (c0 c0Var : list8) {
            arrayList4.add(new Settlement(c0Var.getId(), c0Var.c(), oi0.d.G(c0Var.b(), user) ? dv9.n.OUTGOING : dv9.n.INCOMING, oi0.d.G(c0Var.f(), user), c0Var));
        }
        ArrayList arrayListE0 = d0.E0(arrayList4, arrayList);
        List<MessageItem> list9 = list7;
        ArrayList arrayList5 = new ArrayList(zhm.w.t(list9, 10));
        for (MessageItem messageItem : list9) {
            oq9.o oVarH = oi0.d.h(messageItem.e.f79529a, paymentGroup.d);
            arrayList5.add(MessageItem.a(messageItem, MessageAuthor.a(messageItem.e, oVarH != null ? oi0.d.p(oVarH) : null), null, null, 4079));
        }
        return d0.E0(arrayList5, arrayListE0);
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0567 A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0575 A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0588 A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05a1 A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05cb A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05d9 A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ec A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0605 A[Catch: all -> 0x0358, TryCatch #2 {all -> 0x0358, blocks: (B:75:0x0353, B:80:0x035e, B:83:0x0369, B:86:0x0371, B:88:0x037a, B:89:0x0403, B:91:0x0409, B:95:0x0418, B:100:0x0427, B:102:0x0430, B:107:0x043f, B:109:0x0448, B:111:0x044e, B:113:0x0454, B:115:0x045a, B:117:0x0460, B:119:0x0466, B:121:0x046c, B:123:0x0472, B:156:0x04ff, B:158:0x0505, B:172:0x0537, B:174:0x053d, B:176:0x0545, B:183:0x055f, B:187:0x056b, B:191:0x057d, B:196:0x058d, B:197:0x059b, B:199:0x05a1, B:201:0x05a9, B:208:0x05c3, B:212:0x05cf, B:216:0x05e1, B:221:0x05f1, B:222:0x05ff, B:224:0x0605, B:228:0x0611, B:230:0x061f, B:227:0x060d, B:220:0x05ec, B:215:0x05d9, B:211:0x05cb, B:195:0x0588, B:190:0x0575, B:186:0x0567, B:162:0x0511, B:166:0x051d, B:171:0x0530, B:170:0x052b, B:165:0x0519, B:127:0x0481, B:131:0x0490, B:135:0x049f, B:139:0x04ac, B:143:0x04c5, B:147:0x04d5, B:151:0x04e5, B:155:0x04f8, B:154:0x04f2, B:150:0x04e1, B:146:0x04d1, B:142:0x04c1, B:138:0x04a8, B:134:0x0499, B:130:0x048a, B:105:0x0439, B:98:0x0421, B:94:0x0412, B:87:0x0376, B:81:0x0363), top: B:414:0x0353 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0982  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4d.c.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c(Object obj2, int i, Object obj3, Object obj4) {
        this.f12294a = i;
        this.f12295b = obj2;
        this.f12296c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ c(Object obj2, Object obj3, String str, int i) {
        this.f12294a = i;
        this.f12295b = obj2;
        this.d = obj3;
        this.f12296c = str;
    }

    public /* synthetic */ c(String str, String str2, int i, Object obj2) {
        this.f12294a = i;
        this.f12296c = str;
        this.f12295b = str2;
        this.d = obj2;
    }
}
