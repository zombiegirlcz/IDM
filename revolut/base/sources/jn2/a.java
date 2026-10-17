package jn2;

import a0.d;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreen;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.sso.api.models.ConsentedClient;
import do3.n;
import do3.q;
import iii.c;
import ioe.x;
import ioe.y;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jnb.e;
import jnb.h;
import jnc.g;
import jnc.k;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.reflect.KProperty;
import le.u1;
import my8.r;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.LocalDate;
import retrofit2.HttpException;
import retrofit2.Response;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zme.i;
import zme.j;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176649a;

    public /* synthetic */ a(int i) {
        this.f176649a = i;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i iVar;
        Object obj3 = null;
        int i = 0;
        switch (this.f176649a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "<destruct>");
                n nVar = (n) data.component1();
                return Boolean.valueOf((nVar == null || nVar.f116412h) ? false : true);
            case 1:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new h((List) defaultItems.invoke(), e.f176672a);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 3:
                ListSubheaderDelegate.Model it8 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr = ProjectionScreen.c0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f52715m instanceof g);
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return k.f176696a;
            case 5:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 3);
                while (i < 3) {
                    i++;
                    arrayListP.add(new pb0(d.n("LOADING_STATE_ID_", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 6:
                alc.n it9 = (alc.n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                od0.h hVar = od0.i.Companion;
                PortfolioGoal portfolioGoal = it9.f6215n;
                hVar.getClass();
                return od0.h.a(portfolioGoal);
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                alc.n nVar2 = (alc.n) pair2.f186385a;
                Iterator it10 = ((List) pair2.f186386b).iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next = it10.next();
                        if (Intrinsics.f(((Template) next).f95706a, nVar2.f)) {
                            obj3 = next;
                        }
                    }
                }
                Template template = (Template) obj3;
                if (template != null) {
                    return template;
                }
                throw new IllegalStateException("Recommended template not found");
            case 8:
                lzi.n data2 = (lzi.n) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new jnd.b(data2.f200991b, data2.f200992c);
            case 9:
                jni.e update = (jni.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jni.e.a(update, "", 0L, false, null, null, false, ISO781611.SMT_TAG);
            case 10:
                jni.e update2 = (jni.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return jni.e.a(update2, "", 0L, false, null, null, false, 61);
            case 11:
                jni.e update3 = (jni.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return jni.e.a(update3, "", 0L, false, null, null, false, 61);
            case 12:
                return jni.e.a((jni.e) obj2, "", 0L, false, null, null, false, ISO781611.SMT_TAG);
            case 13:
                return jni.e.a((jni.e) obj2, null, 0L, false, null, null, true, 63);
            case 14:
                return jni.e.a((jni.e) obj2, null, 0L, false, null, null, false, 63);
            case 15:
                return jni.e.a((jni.e) obj2, null, 0L, false, null, null, true, 63);
            case 16:
                return jni.e.a((jni.e) obj2, null, 0L, false, null, null, false, 63);
            case 17:
                return jni.e.a((jni.e) obj2, null, 0L, false, null, null, false, 63);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return c.c(5);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = f.o(0, 2);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it11 = intRangeO.iterator();
                while (it11.f289625c) {
                    arrayList.add(new pb0(d.n("account.row.", it11.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                IntRange intRangeO2 = f.o(0, 2);
                ArrayList arrayList2 = new ArrayList(w.t(intRangeO2, 10));
                vim.f it12 = intRangeO2.iterator();
                while (it12.f289625c) {
                    arrayList2.add(new pb0(d.n("legal.row.", it12.nextInt())));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return i2b.a.o(arrayList, arrayList2);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 21:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<y> list2 = list;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                for (y yVar : list2) {
                    Object obj4 = joe.a.f176928a;
                    Intrinsics.checkNotNullParameter(yVar, "<this>");
                    j jVar = (j) u1.u(yVar.getType(), joe.a.f176930c);
                    String displayText = yVar.getDisplayText();
                    x details = yVar.getDetails();
                    if (details != null) {
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String documentScope = details.getDocumentScope();
                        r rVar = documentScope != null ? (r) u1.v(documentScope, tt8.h.f274285a) : null;
                        List steps = details.getSteps();
                        String restrictionsDate = details.getRestrictionsDate();
                        iVar = new i(rVar, steps, restrictionsDate != null ? LocalDate.parse(restrictionsDate) : null, details.getRestrictionsApplied());
                    } else {
                        iVar = null;
                    }
                    arrayList3.add(new zme.h(jVar, displayText, iVar));
                }
                return arrayList3;
            case 22:
                Response reponse = (Response) obj2;
                Intrinsics.checkNotNullParameter(reponse, "reponse");
                int iCode = reponse.code();
                if (iCode != 204) {
                    if (iCode != 400) {
                        throw new HttpException(reponse);
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                n it13 = (n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return q.y(it13);
            case 24:
                Intrinsics.checkNotNullParameter((jp3.e) obj2, "it");
                return Unit.f186387a;
            case 25:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new jpc.c((dj0.d) pair3.f186385a, (dj0.d) pair3.f186386b);
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 27:
                List clients = (List) obj2;
                Intrinsics.checkNotNullParameter(clients, "clients");
                List list3 = clients;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    arrayList4.add(new cjl.h((ConsentedClient) it14.next()));
                }
                return arrayList4;
            case 28:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return f0.f322471a;
            default:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return d0.E0((List) pair4.f186386b, (List) pair4.f186385a);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f176649a = i;
    }
}
