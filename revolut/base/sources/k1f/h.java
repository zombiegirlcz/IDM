package k1f;

import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.trade_rev_points.impl.data.network.TradeRevPointsService;
import efm.d0;
import ip0.v7;
import j1f.i;
import j1f.k;
import j1f.o;
import j1f.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jyk.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n09.j0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsService f180234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f180235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1f.d f180236c;
    public final w4l.f d;
    public final w4l.f e;

    public h(TradeRevPointsService service, ne0.j memoryCache, n1f.d agentDetailsDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(agentDetailsDao, "agentDetailsDao");
        this.f180234a = service;
        this.f180235b = memoryCache;
        this.f180236c = agentDetailsDao;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: k1f.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180233b;

            {
                this.f180233b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String agentId = (String) obj2;
                        u2f.d agent = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        Intrinsics.checkNotNullParameter(agent, "agent");
                        this.f180233b.f180235b.f("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_" + agentId, agent);
                        return Unit.f186387a;
                    case 1:
                        u2f.d agent2 = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(agent2, "agent");
                        n1f.d dVar = this.f180233b.f180236c;
                        p1f.b bVarH = h1f.a.h(agent2);
                        dVar.getClass();
                        DBUtil.performBlocking(dVar.f211320a, false, true, new j0(dVar, bVarH, 11));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u2f.j product = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<o> agents = this.f180233b.f180234a.getAgents(product.name());
                        g0 g0Var = new g0(new jyk.d0(28), 12);
                        agents.getClass();
                        ufm.i iVar = new ufm.i(agents, g0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u2f.j product2 = (u2f.j) obj2;
                        List agents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(agents2, "agents");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product2.name(), this.f180233b.f180235b, agents2);
                        return Unit.f186387a;
                    case 4:
                        u2f.j product3 = (u2f.j) obj2;
                        List agents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(agents3, "agents");
                        n1f.d dVar2 = this.f180233b.f180236c;
                        String strName = product3.name();
                        List list = agents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.h((u2f.d) it8.next()));
                        }
                        DBUtil.performBlocking(dVar2.f211320a, false, true, new moe.c(dVar2, strName, arrayList, 23));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String agentId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        d0<j1f.n> agentDetails = this.f180233b.f180234a.getAgentDetails(agentId2);
                        g0 g0Var2 = new g0(new jyk.d0(27), 11);
                        agentDetails.getClass();
                        ufm.i iVar2 = new ufm.i(agentDetails, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: k1f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180231b;

            {
                this.f180231b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String agentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        return (u2f.d) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_", agentId, this.f180231b.f180235b);
                    case 1:
                        final String agentId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        final n1f.d dVar = this.f180231b.f180236c;
                        final int i2 = 1;
                        p1f.b bVar = (p1f.b) DBUtil.performBlocking(dVar.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i3;
                                int i5;
                                String text2;
                                String text3;
                                String text4;
                                int i6;
                                k kVar;
                                k kVar2;
                                switch (i2) {
                                    case 0:
                                        d dVar2 = dVar;
                                        m1f.b bVar2 = dVar2.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = agentId2;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar2;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i5 = columnIndexOrThrow2;
                                                    i3 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i3 = columnIndexOrThrow3;
                                                    i5 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i21 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i22 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22);
                                                columnIndexOrThrow14 = i22;
                                                d dVar4 = dVar3;
                                                int i32 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i59 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i59)) {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = sQLiteStatementPrepare.getText(i59);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i66 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i66)) {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = sQLiteStatementPrepare.getText(i66);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i6 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i6 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i32;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i5;
                                                columnIndexOrThrow3 = i3;
                                                columnIndexOrThrow = i21;
                                                columnIndexOrThrow15 = i6;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = agentId2;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        if (bVar != null) {
                            return h1f.a.d(bVar);
                        }
                        return null;
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product.name(), this.f180231b.f180235b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        final n1f.d dVar2 = this.f180231b.f180236c;
                        final String strName = product2.name();
                        final int i3 = 0;
                        List list = (List) DBUtil.performBlocking(dVar2.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i32;
                                int i5;
                                String text2;
                                String text3;
                                String text4;
                                int i6;
                                k kVar;
                                k kVar2;
                                switch (i3) {
                                    case 0:
                                        d dVar22 = dVar2;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = strName;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i5 = columnIndexOrThrow2;
                                                    i32 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i32 = columnIndexOrThrow3;
                                                    i5 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i21 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i22 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22);
                                                columnIndexOrThrow14 = i22;
                                                d dVar4 = dVar3;
                                                int i322 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i59 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i59)) {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = sQLiteStatementPrepare.getText(i59);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i66 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i66)) {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = sQLiteStatementPrepare.getText(i66);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i6 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i6 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i322;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i5;
                                                columnIndexOrThrow3 = i32;
                                                columnIndexOrThrow = i21;
                                                columnIndexOrThrow15 = i6;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar2;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = strName;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.d((p1f.b) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 3;
        Function2 function22 = new Function2(this) { // from class: k1f.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180233b;

            {
                this.f180233b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String agentId = (String) obj2;
                        u2f.d agent = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        Intrinsics.checkNotNullParameter(agent, "agent");
                        this.f180233b.f180235b.f("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_" + agentId, agent);
                        return Unit.f186387a;
                    case 1:
                        u2f.d agent2 = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(agent2, "agent");
                        n1f.d dVar = this.f180233b.f180236c;
                        p1f.b bVarH = h1f.a.h(agent2);
                        dVar.getClass();
                        DBUtil.performBlocking(dVar.f211320a, false, true, new j0(dVar, bVarH, 11));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u2f.j product = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<o> agents = this.f180233b.f180234a.getAgents(product.name());
                        g0 g0Var = new g0(new jyk.d0(28), 12);
                        agents.getClass();
                        ufm.i iVar = new ufm.i(agents, g0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u2f.j product2 = (u2f.j) obj2;
                        List agents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(agents2, "agents");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product2.name(), this.f180233b.f180235b, agents2);
                        return Unit.f186387a;
                    case 4:
                        u2f.j product3 = (u2f.j) obj2;
                        List agents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(agents3, "agents");
                        n1f.d dVar2 = this.f180233b.f180236c;
                        String strName = product3.name();
                        List list = agents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.h((u2f.d) it8.next()));
                        }
                        DBUtil.performBlocking(dVar2.f211320a, false, true, new moe.c(dVar2, strName, arrayList, 23));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String agentId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        d0<j1f.n> agentDetails = this.f180233b.f180234a.getAgentDetails(agentId2);
                        g0 g0Var2 = new g0(new jyk.d0(27), 11);
                        agentDetails.getClass();
                        ufm.i iVar2 = new ufm.i(agentDetails, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: k1f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180231b;

            {
                this.f180231b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String agentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        return (u2f.d) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_", agentId, this.f180231b.f180235b);
                    case 1:
                        final String agentId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        final n1f.d dVar = this.f180231b.f180236c;
                        final int i22 = 1;
                        p1f.b bVar = (p1f.b) DBUtil.performBlocking(dVar.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i32;
                                int i5;
                                String text2;
                                String text3;
                                String text4;
                                int i6;
                                k kVar;
                                k kVar2;
                                switch (i22) {
                                    case 0:
                                        d dVar22 = dVar;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = agentId2;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i5 = columnIndexOrThrow2;
                                                    i32 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i32 = columnIndexOrThrow3;
                                                    i5 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i21 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i222 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i222) ? null : sQLiteStatementPrepare.getText(i222);
                                                columnIndexOrThrow14 = i222;
                                                d dVar4 = dVar3;
                                                int i322 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i59 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i59)) {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = sQLiteStatementPrepare.getText(i59);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i66 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i66)) {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = sQLiteStatementPrepare.getText(i66);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i6 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i6 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i322;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i5;
                                                columnIndexOrThrow3 = i32;
                                                columnIndexOrThrow = i21;
                                                columnIndexOrThrow15 = i6;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = agentId2;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        if (bVar != null) {
                            return h1f.a.d(bVar);
                        }
                        return null;
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product.name(), this.f180231b.f180235b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        final n1f.d dVar2 = this.f180231b.f180236c;
                        final String strName = product2.name();
                        final int i3 = 0;
                        List list = (List) DBUtil.performBlocking(dVar2.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i32;
                                int i5;
                                String text2;
                                String text3;
                                String text4;
                                int i6;
                                k kVar;
                                k kVar2;
                                switch (i3) {
                                    case 0:
                                        d dVar22 = dVar2;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = strName;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i5 = columnIndexOrThrow2;
                                                    i32 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i32 = columnIndexOrThrow3;
                                                    i5 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i21 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i222 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i222) ? null : sQLiteStatementPrepare.getText(i222);
                                                columnIndexOrThrow14 = i222;
                                                d dVar4 = dVar3;
                                                int i322 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i59 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i59)) {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i59;
                                                    text2 = sQLiteStatementPrepare.getText(i59);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i66 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i66)) {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i66;
                                                    text3 = sQLiteStatementPrepare.getText(i66);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i6 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i6 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i322;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i5;
                                                columnIndexOrThrow3 = i32;
                                                columnIndexOrThrow = i21;
                                                columnIndexOrThrow15 = i6;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar2;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = strName;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.d((p1f.b) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 4;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: k1f.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180233b;

            {
                this.f180233b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String agentId = (String) obj2;
                        u2f.d agent = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        Intrinsics.checkNotNullParameter(agent, "agent");
                        this.f180233b.f180235b.f("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_" + agentId, agent);
                        return Unit.f186387a;
                    case 1:
                        u2f.d agent2 = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(agent2, "agent");
                        n1f.d dVar = this.f180233b.f180236c;
                        p1f.b bVarH = h1f.a.h(agent2);
                        dVar.getClass();
                        DBUtil.performBlocking(dVar.f211320a, false, true, new j0(dVar, bVarH, 11));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u2f.j product = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<o> agents = this.f180233b.f180234a.getAgents(product.name());
                        g0 g0Var = new g0(new jyk.d0(28), 12);
                        agents.getClass();
                        ufm.i iVar = new ufm.i(agents, g0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u2f.j product2 = (u2f.j) obj2;
                        List agents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(agents2, "agents");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product2.name(), this.f180233b.f180235b, agents2);
                        return Unit.f186387a;
                    case 4:
                        u2f.j product3 = (u2f.j) obj2;
                        List agents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(agents3, "agents");
                        n1f.d dVar2 = this.f180233b.f180236c;
                        String strName = product3.name();
                        List list = agents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.h((u2f.d) it8.next()));
                        }
                        DBUtil.performBlocking(dVar2.f211320a, false, true, new moe.c(dVar2, strName, arrayList, 23));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String agentId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        d0<j1f.n> agentDetails = this.f180233b.f180234a.getAgentDetails(agentId2);
                        g0 g0Var2 = new g0(new jyk.d0(27), 11);
                        agentDetails.getClass();
                        ufm.i iVar2 = new ufm.i(agentDetails, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 5;
        Function2 function23 = new Function2(this) { // from class: k1f.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180233b;

            {
                this.f180233b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        String agentId = (String) obj2;
                        u2f.d agent = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        Intrinsics.checkNotNullParameter(agent, "agent");
                        this.f180233b.f180235b.f("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_" + agentId, agent);
                        return Unit.f186387a;
                    case 1:
                        u2f.d agent2 = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(agent2, "agent");
                        n1f.d dVar = this.f180233b.f180236c;
                        p1f.b bVarH = h1f.a.h(agent2);
                        dVar.getClass();
                        DBUtil.performBlocking(dVar.f211320a, false, true, new j0(dVar, bVarH, 11));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u2f.j product = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<o> agents = this.f180233b.f180234a.getAgents(product.name());
                        g0 g0Var = new g0(new jyk.d0(28), 12);
                        agents.getClass();
                        ufm.i iVar = new ufm.i(agents, g0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u2f.j product2 = (u2f.j) obj2;
                        List agents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(agents2, "agents");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product2.name(), this.f180233b.f180235b, agents2);
                        return Unit.f186387a;
                    case 4:
                        u2f.j product3 = (u2f.j) obj2;
                        List agents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(agents3, "agents");
                        n1f.d dVar2 = this.f180233b.f180236c;
                        String strName = product3.name();
                        List list = agents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.h((u2f.d) it8.next()));
                        }
                        DBUtil.performBlocking(dVar2.f211320a, false, true, new moe.c(dVar2, strName, arrayList, 23));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String agentId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        d0<j1f.n> agentDetails = this.f180233b.f180234a.getAgentDetails(agentId2);
                        g0 g0Var2 = new g0(new jyk.d0(27), 11);
                        agentDetails.getClass();
                        ufm.i iVar2 = new ufm.i(agentDetails, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i6 = 0;
        Function1 function13 = new Function1(this) { // from class: k1f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180231b;

            {
                this.f180231b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        String agentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        return (u2f.d) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_", agentId, this.f180231b.f180235b);
                    case 1:
                        final String agentId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        final n1f.d dVar = this.f180231b.f180236c;
                        final int i22 = 1;
                        p1f.b bVar = (p1f.b) DBUtil.performBlocking(dVar.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i32;
                                int i59;
                                String text2;
                                String text3;
                                String text4;
                                int i66;
                                k kVar;
                                k kVar2;
                                switch (i22) {
                                    case 0:
                                        d dVar22 = dVar;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = agentId2;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i59 = columnIndexOrThrow2;
                                                    i32 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i32 = columnIndexOrThrow3;
                                                    i59 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i21 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i222 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i222) ? null : sQLiteStatementPrepare.getText(i222);
                                                columnIndexOrThrow14 = i222;
                                                d dVar4 = dVar3;
                                                int i322 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i592 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i592)) {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = sQLiteStatementPrepare.getText(i592);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i662 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i662)) {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = sQLiteStatementPrepare.getText(i662);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i66 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i66 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i322;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i59;
                                                columnIndexOrThrow3 = i32;
                                                columnIndexOrThrow = i21;
                                                columnIndexOrThrow15 = i66;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = agentId2;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        if (bVar != null) {
                            return h1f.a.d(bVar);
                        }
                        return null;
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product.name(), this.f180231b.f180235b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        final n1f.d dVar2 = this.f180231b.f180236c;
                        final String strName = product2.name();
                        final int i32 = 0;
                        List list = (List) DBUtil.performBlocking(dVar2.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i322;
                                int i59;
                                String text2;
                                String text3;
                                String text4;
                                int i66;
                                k kVar;
                                k kVar2;
                                switch (i32) {
                                    case 0:
                                        d dVar22 = dVar2;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = strName;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i59 = columnIndexOrThrow2;
                                                    i322 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i322 = columnIndexOrThrow3;
                                                    i59 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i21 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i222 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i222) ? null : sQLiteStatementPrepare.getText(i222);
                                                columnIndexOrThrow14 = i222;
                                                d dVar4 = dVar3;
                                                int i3222 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i592 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i592)) {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = sQLiteStatementPrepare.getText(i592);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i662 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i662)) {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = sQLiteStatementPrepare.getText(i662);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i66 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i66 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i3222;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i59;
                                                columnIndexOrThrow3 = i322;
                                                columnIndexOrThrow = i21;
                                                columnIndexOrThrow15 = i66;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar2;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = strName;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.d((p1f.b) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        };
        Function2 function24 = new Function2(this) { // from class: k1f.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180233b;

            {
                this.f180233b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String agentId = (String) obj2;
                        u2f.d agent = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        Intrinsics.checkNotNullParameter(agent, "agent");
                        this.f180233b.f180235b.f("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_" + agentId, agent);
                        return Unit.f186387a;
                    case 1:
                        u2f.d agent2 = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(agent2, "agent");
                        n1f.d dVar = this.f180233b.f180236c;
                        p1f.b bVarH = h1f.a.h(agent2);
                        dVar.getClass();
                        DBUtil.performBlocking(dVar.f211320a, false, true, new j0(dVar, bVarH, 11));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u2f.j product = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<o> agents = this.f180233b.f180234a.getAgents(product.name());
                        g0 g0Var = new g0(new jyk.d0(28), 12);
                        agents.getClass();
                        ufm.i iVar = new ufm.i(agents, g0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u2f.j product2 = (u2f.j) obj2;
                        List agents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(agents2, "agents");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product2.name(), this.f180233b.f180235b, agents2);
                        return Unit.f186387a;
                    case 4:
                        u2f.j product3 = (u2f.j) obj2;
                        List agents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(agents3, "agents");
                        n1f.d dVar2 = this.f180233b.f180236c;
                        String strName = product3.name();
                        List list = agents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.h((u2f.d) it8.next()));
                        }
                        DBUtil.performBlocking(dVar2.f211320a, false, true, new moe.c(dVar2, strName, arrayList, 23));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String agentId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        d0<j1f.n> agentDetails = this.f180233b.f180234a.getAgentDetails(agentId2);
                        g0 g0Var2 = new g0(new jyk.d0(27), 11);
                        agentDetails.getClass();
                        ufm.i iVar2 = new ufm.i(agentDetails, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i21 = 1;
        this.e = new w4l.f(function23, function13, function24, new Function1(this) { // from class: k1f.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180231b;

            {
                this.f180231b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        String agentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        return (u2f.d) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_", agentId, this.f180231b.f180235b);
                    case 1:
                        final String agentId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        final n1f.d dVar = this.f180231b.f180236c;
                        final int i22 = 1;
                        p1f.b bVar = (p1f.b) DBUtil.performBlocking(dVar.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i322;
                                int i59;
                                String text2;
                                String text3;
                                String text4;
                                int i66;
                                k kVar;
                                k kVar2;
                                switch (i22) {
                                    case 0:
                                        d dVar22 = dVar;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = agentId2;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i59 = columnIndexOrThrow2;
                                                    i322 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i322 = columnIndexOrThrow3;
                                                    i59 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i212 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i222 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i222) ? null : sQLiteStatementPrepare.getText(i222);
                                                columnIndexOrThrow14 = i222;
                                                d dVar4 = dVar3;
                                                int i3222 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i592 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i592)) {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = sQLiteStatementPrepare.getText(i592);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i662 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i662)) {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = sQLiteStatementPrepare.getText(i662);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i66 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i66 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i3222;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i59;
                                                columnIndexOrThrow3 = i322;
                                                columnIndexOrThrow = i212;
                                                columnIndexOrThrow15 = i66;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = agentId2;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        if (bVar != null) {
                            return h1f.a.d(bVar);
                        }
                        return null;
                    case 2:
                        u2f.j product = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (List) v7.r("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product.name(), this.f180231b.f180235b);
                    default:
                        u2f.j product2 = (u2f.j) obj2;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        final n1f.d dVar2 = this.f180231b.f180236c;
                        final String strName = product2.name();
                        final int i32 = 0;
                        List list = (List) DBUtil.performBlocking(dVar2.f211320a, true, false, new Function1() { // from class: n1f.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                SQLiteStatement sQLiteStatementPrepare;
                                String text;
                                int i322;
                                int i59;
                                String text2;
                                String text3;
                                String text4;
                                int i66;
                                k kVar;
                                k kVar2;
                                switch (i32) {
                                    case 0:
                                        d dVar22 = dVar2;
                                        m1f.b bVar2 = dVar22.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE product = ?");
                                        String str = strName;
                                        try {
                                            if (str == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str);
                                            }
                                            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            d dVar3 = dVar22;
                                            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            ArrayList arrayList = new ArrayList();
                                            while (sQLiteStatementPrepare.step()) {
                                                i iVar = null;
                                                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                                                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                                                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                                                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                                    text = null;
                                                    i59 = columnIndexOrThrow2;
                                                    i322 = columnIndexOrThrow3;
                                                } else {
                                                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                                    i322 = columnIndexOrThrow3;
                                                    i59 = columnIndexOrThrow2;
                                                }
                                                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                                                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                                                String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                                                bVar2.getClass();
                                                rlm.o oVar = bVar2.f201492a;
                                                int i212 = columnIndexOrThrow;
                                                Intrinsics.checkNotNullParameter(value, "value");
                                                oVar.getClass();
                                                x xVar = (x) oVar.b(x.Companion.serializer(), value);
                                                int i222 = columnIndexOrThrow14;
                                                String text15 = sQLiteStatementPrepare.isNull(i222) ? null : sQLiteStatementPrepare.getText(i222);
                                                columnIndexOrThrow14 = i222;
                                                d dVar4 = dVar3;
                                                int i3222 = columnIndexOrThrow13;
                                                List listA = dVar4.d.a(text15);
                                                int i33 = columnIndexOrThrow15;
                                                String text16 = sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33);
                                                int i43 = columnIndexOrThrow16;
                                                String text17 = sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43);
                                                int i592 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i592)) {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = null;
                                                } else {
                                                    columnIndexOrThrow17 = i592;
                                                    text2 = sQLiteStatementPrepare.getText(i592);
                                                }
                                                List listA2 = bVar2.a(text2);
                                                int i662 = columnIndexOrThrow18;
                                                if (sQLiteStatementPrepare.isNull(i662)) {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = null;
                                                } else {
                                                    columnIndexOrThrow18 = i662;
                                                    text3 = sQLiteStatementPrepare.getText(i662);
                                                }
                                                List listA3 = bVar2.a(text3);
                                                int i74 = columnIndexOrThrow19;
                                                if (sQLiteStatementPrepare.isNull(i74)) {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = null;
                                                } else {
                                                    columnIndexOrThrow19 = i74;
                                                    text4 = sQLiteStatementPrepare.getText(i74);
                                                }
                                                if (text4 != null) {
                                                    oVar.getClass();
                                                    i66 = i33;
                                                    kVar = (k) oVar.b(nlm.a.c(k.INSTANCE.serializer()), text4);
                                                } else {
                                                    i66 = i33;
                                                    kVar = null;
                                                }
                                                int i92 = columnIndexOrThrow20;
                                                String text18 = sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92);
                                                if (text18 != null) {
                                                    oVar.getClass();
                                                    columnIndexOrThrow20 = i92;
                                                    iVar = (i) oVar.b(nlm.a.c(i.Companion.serializer()), text18);
                                                } else {
                                                    columnIndexOrThrow20 = i92;
                                                }
                                                arrayList.add(new p1f.b(text5, text6, text7, text8, text9, text10, text11, text12, text13, text, z, text14, xVar, listA, text16, text17, listA2, listA3, kVar, iVar));
                                                columnIndexOrThrow16 = i43;
                                                columnIndexOrThrow13 = i3222;
                                                dVar3 = dVar4;
                                                columnIndexOrThrow2 = i59;
                                                columnIndexOrThrow3 = i322;
                                                columnIndexOrThrow = i212;
                                                columnIndexOrThrow15 = i66;
                                                break;
                                            }
                                            sQLiteStatementPrepare.close();
                                            return arrayList;
                                        } finally {
                                        }
                                    default:
                                        d dVar5 = dVar2;
                                        m1f.b bVar3 = dVar5.f211322c;
                                        sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM trade_rev_points_agents WHERE id = ?");
                                        String str2 = strName;
                                        try {
                                            if (str2 == null) {
                                                sQLiteStatementPrepare.bindNull(1);
                                            } else {
                                                sQLiteStatementPrepare.bindText(1, str2);
                                            }
                                            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                                            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                                            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeName");
                                            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "programmeDescription");
                                            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                                            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                                            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logoUrl");
                                            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "learnMoreUrl");
                                            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalInfoUrl");
                                            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "suggested");
                                            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backgroundUrl");
                                            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyaltyProgramme");
                                            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemTypes");
                                            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "websiteUrl");
                                            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherProductGroupId");
                                            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "redeemOptions");
                                            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extraRedeemOptions");
                                            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalDetails");
                                            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                                            Object bVar4 = null;
                                            if (sQLiteStatementPrepare.step()) {
                                                String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                                                String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                                                String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                                                String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                                                String text23 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                                                String text24 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                                                String text25 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                                                String text26 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                                String text27 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                                String text28 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow31)) != 0;
                                                String text29 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                                String value2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                                                bVar3.getClass();
                                                rlm.o oVar2 = bVar3.f201492a;
                                                Intrinsics.checkNotNullParameter(value2, "value");
                                                oVar2.getClass();
                                                x xVar2 = (x) oVar2.b(x.Companion.serializer(), value2);
                                                List listA4 = dVar5.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34));
                                                String text30 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                                                String text31 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                                List listA5 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37));
                                                List listA6 = bVar3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                                String text32 = sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39);
                                                if (text32 != null) {
                                                    oVar2.getClass();
                                                    kVar2 = (k) oVar2.b(nlm.a.c(k.INSTANCE.serializer()), text32);
                                                } else {
                                                    kVar2 = null;
                                                }
                                                String text33 = sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40);
                                                if (text33 != null) {
                                                    oVar2.getClass();
                                                    bVar4 = (i) oVar2.b(nlm.a.c(i.Companion.serializer()), text33);
                                                }
                                                bVar4 = new p1f.b(text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, z3, text29, xVar2, listA4, text30, text31, listA5, listA6, kVar2, bVar4);
                                            }
                                            sQLiteStatementPrepare.close();
                                            return bVar4;
                                        } finally {
                                        }
                                }
                            }
                        });
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.d((p1f.b) it8.next()));
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: k1f.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f180233b;

            {
                this.f180233b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        String agentId = (String) obj2;
                        u2f.d agent = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        Intrinsics.checkNotNullParameter(agent, "agent");
                        this.f180233b.f180235b.f("CACHE_KEY_TRADE_REV_POINTS_AGENT_DETAILS_" + agentId, agent);
                        return Unit.f186387a;
                    case 1:
                        u2f.d agent2 = (u2f.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(agent2, "agent");
                        n1f.d dVar = this.f180233b.f180236c;
                        p1f.b bVarH = h1f.a.h(agent2);
                        dVar.getClass();
                        DBUtil.performBlocking(dVar.f211320a, false, true, new j0(dVar, bVarH, 11));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        u2f.j product = (u2f.j) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(product, "product");
                        d0<o> agents = this.f180233b.f180234a.getAgents(product.name());
                        g0 g0Var = new g0(new jyk.d0(28), 12);
                        agents.getClass();
                        ufm.i iVar = new ufm.i(agents, g0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        u2f.j product2 = (u2f.j) obj2;
                        List agents2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product2, "product");
                        Intrinsics.checkNotNullParameter(agents2, "agents");
                        ehe.n.z("CACHE_KEY_TRADE_REV_POINTS_AGENTS_", product2.name(), this.f180233b.f180235b, agents2);
                        return Unit.f186387a;
                    case 4:
                        u2f.j product3 = (u2f.j) obj2;
                        List agents3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(product3, "product");
                        Intrinsics.checkNotNullParameter(agents3, "agents");
                        n1f.d dVar2 = this.f180233b.f180236c;
                        String strName = product3.name();
                        List list = agents3;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(h1f.a.h((u2f.d) it8.next()));
                        }
                        DBUtil.performBlocking(dVar2.f211320a, false, true, new moe.c(dVar2, strName, arrayList, 23));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String agentId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        d0<j1f.n> agentDetails = this.f180233b.f180234a.getAgentDetails(agentId2);
                        g0 g0Var2 = new g0(new jyk.d0(27), 11);
                        agentDetails.getClass();
                        ufm.i iVar2 = new ufm.i(agentDetails, g0Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
