package bd2;

import bg2.g;
import blj.h;
import bq5.a0;
import bzg.k;
import c2d.h0;
import c2d.y0;
import com.revolut.data.network.models.statements.StatementTemplateInfoDto;
import com.revolut.domain.models.statement.StatementTemplateId;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFeatureConfig;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nel.n;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14517b;

    public /* synthetic */ b(String str, int i) {
        this.f14516a = i;
        this.f14517b = str;
    }

    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        vyg.d dVar;
        int i = this.f14516a;
        Object obj3 = null;
        String id10 = this.f14517b;
        switch (i) {
            case 0:
                cd2.d dto = (cd2.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto.getIsRegistered() ? new IDealFeatureConfig(new IDealFlowDestination(new IDealFlowDestination.StartType.AddAccounts(id10))) : new IDealFeatureConfig(new IDealFlowDestination(new IDealFlowDestination.StartType.StartRegistrationFromPayment(id10)));
            case 1:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, this.f14517b, null, null, null, null, false, null, 8183);
            case 2:
                bl6.g update2 = (bl6.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return bl6.g.a(update2, null, id10, 1);
            case 3:
                return TabInvestControllerContract$State.c((TabInvestControllerContract$State) obj2, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, this.f14517b, null, 1610612735);
            case 4:
                h update3 = (h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return h.a(update3, id10, null, null, 6);
            case 5:
                a0 update4 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return a0.a(update4, null, null, null, null, null, null, null, null, null, null, null, this.f14517b, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073733631);
            case 6:
                a0 update5 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return a0.a(update5, null, null, null, null, null, null, null, null, null, null, this.f14517b, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073737727);
            case 7:
                a0 update6 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return a0.a(update6, null, null, null, this.f14517b, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073741815);
            case 8:
                a0 update7 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return a0.a(update7, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f14517b, null, null, null, false, null, null, false, false, null, null, null, null, 1073709055);
            case 9:
                a0 update8 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return a0.a(update8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, this.f14517b, false, false, null, null, null, null, 1069547519);
            case 10:
                a0 update9 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return a0.a(update9, null, null, null, null, null, null, null, null, null, null, null, null, this.f14517b, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073725439);
            case 11:
                a0 update10 = (a0) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return a0.a(update10, null, null, null, null, null, null, null, null, null, this.f14517b, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073739775);
            case 12:
                Set kidsCodes = (Set) obj2;
                Intrinsics.checkNotNullParameter(kidsCodes, "kidsCodes");
                return Boolean.valueOf(kidsCodes.contains(id10));
            case 13:
                bu4.a update11 = (bu4.a) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return bu4.a.a(update11, null, id10, 1);
            case 14:
                bw6.g update12 = (bw6.g) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return bw6.g.a(update12, null, false, id10, 3);
            case 15:
                List recipientSettings = (List) obj2;
                Intrinsics.checkNotNullParameter(recipientSettings, "recipientSettings");
                Iterator it8 = recipientSettings.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((RecipientPaymentsSettings) next).f79672a, id10)) {
                            obj3 = next;
                        }
                    }
                }
                return (RecipientPaymentsSettings) obj3;
            case 16:
                k update13 = (k) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return k.a(update13, null, null, vyg.c.valueOf(id10), null, null, null, null, null, false, null, null, false, null, null, null, null, null, 2097143);
            case 17:
                k update14 = (k) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                if (Intrinsics.f(id10, "LINE_CHART_TAB_ID")) {
                    dVar = vyg.d.LINE;
                } else {
                    if (!Intrinsics.f(id10, "BAR_CHART_TAB_ID")) {
                        throw new IllegalStateException(l.r("Unsupported chart type: ", id10));
                    }
                    dVar = vyg.d.BAR;
                }
                return k.a(update14, null, null, null, dVar, null, null, null, null, false, null, null, false, null, null, null, null, null, 2097119);
            case 18:
                c17.h update15 = (c17.h) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return c17.h.a(update15, id10, null, 29);
            case 19:
                List<n> instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                for (n nVar : instruments) {
                    if (Intrinsics.f(nVar.a(), id10)) {
                        return nVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 20:
                List<n> instruments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                for (n nVar2 : instruments2) {
                    if (Intrinsics.f(nVar2.f214596b, id10) || Intrinsics.f(nVar2.e, id10)) {
                        return nVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                List<n> instruments3 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments3, "instruments");
                for (n nVar3 : instruments3) {
                    if (Intrinsics.f(nVar3.a(), id10) || Intrinsics.f(nVar3.e, id10)) {
                        return nVar3;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 22:
                List<n> instruments4 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments4, "instruments");
                for (n nVar4 : instruments4) {
                    if (Intrinsics.f(nVar4.f214596b, id10) || Intrinsics.f(nVar4.e, id10)) {
                        return nVar4;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 23:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : assets) {
                    if (cp5.d.F((ogd.e) obj4, id10)) {
                        arrayList.add(obj4);
                    }
                }
                return d0.P0(arrayList, new h0());
            case 24:
                List assets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(assets2, "assets");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : assets2) {
                    if (cp5.d.F((ogd.e) obj5, id10)) {
                        arrayList2.add(obj5);
                    }
                }
                return d0.P0(arrayList2, new y0());
            case 25:
                StatementTemplateInfoDto dto2 = (StatementTemplateInfoDto) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                Object obj6 = p11.a.f231605a;
                Intrinsics.checkNotNullParameter(dto2, "<this>");
                Intrinsics.checkNotNullParameter(id10, "id");
                return new c71.b((StatementTemplateId) u1.u(id10, p11.a.f231605a), dto2.getUrl(), dto2.getCheckSum());
            case 26:
                c3k.c update16 = (c3k.c) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                return c3k.c.a(update16, null, id10, 1);
            case 27:
                c42.a update17 = (c42.a) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                return c42.a.a(update17, null, id10, false, 29);
            case 28:
                c7k.a updateState = (c7k.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return c7k.a.a(updateState, id10, id10.length() <= 100, 1);
            default:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "DeviceLockProtectionActivityDelegate", p.a.p("[", id10, "] Starting"), null, null, 16);
                return Unit.f186387a;
        }
    }
}
