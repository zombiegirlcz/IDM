package a1a;

import a41.c1;
import a41.l1;
import a41.x;
import a80.h;
import a97.k;
import a9j.u;
import ahd.c0;
import ahe.w0;
import ahf.z;
import akf.s1;
import akg.n;
import akl.e1;
import akl.n0;
import akl.n1;
import akl.r;
import akl.s0;
import android.hardware.SensorManager;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.UserInfo;
import ft3.h1;
import gim.i;
import java.io.File;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import qua.p;
import r7g.g;
import tof.a3;
import u4b.f;
import vkm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f570w = dVar;
        this.f571x = str;
        this.f572y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((d) this.f570w, (com.revolut.feature.payments.splitbill.models.recurringsplit.b) this.f572y, continuation, 0);
            case 1:
                return new b((d) this.f570w, (String) this.f571x, (String) this.f572y, continuation);
            case 2:
                return new b((f) this.f570w, (com.revolut.feature.retail.cfd.impl.flows.withdraw.a) this.f572y, continuation, 2);
            case 3:
                b bVar = new b((x) this.f570w, (LinkedHashMap) this.f572y, continuation, 3);
                bVar.f571x = obj2;
                return bVar;
            case 4:
                return new b((l1) this.f571x, (SensorManager) this.f570w, (c1) this.f572y, continuation, 4);
            case 5:
                return new b((a44.d) this.f571x, (h1) this.f570w, (List) this.f572y, continuation, 5);
            case 6:
                return new b((a44.d) this.f571x, (ry3.a) this.f570w, (h1) this.f572y, continuation, 6);
            case 7:
                return new b((a72.d) this.f571x, (String) this.f570w, (String) this.f572y, continuation, 7);
            case 8:
                return new b((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f571x, (FlightSearchRequestFilters) this.f570w, (g) this.f572y, continuation, 8);
            case 9:
                return new b((com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) this.f571x, (FlightSearchQuery) this.f570w, (g) this.f572y, continuation, 9);
            case 10:
                return new b((h) this.f571x, (InputStream) this.f570w, (String) this.f572y, continuation, 10);
            case 11:
                return new b((h) this.f571x, (byte[]) this.f570w, (String) this.f572y, continuation, 11);
            case 12:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) this.f571x, (String) this.f570w, (a2j.c) this.f572y, continuation, 12);
            case 13:
                b bVar2 = new b((k) this.f570w, (FlowCollector) this.f572y, continuation, 13);
                bVar2.f571x = obj2;
                return bVar2;
            case 14:
                return new b((u) this.f572y, continuation);
            case 15:
                return new b((aae.h) this.f571x, (p) this.f570w, (LocalDate) this.f572y, continuation, 15);
            case 16:
                b bVar3 = new b((aci.h) this.f570w, (wi0.b) this.f572y, continuation, 16);
                bVar3.f571x = obj2;
                return bVar3;
            case 17:
                b bVar4 = new b((v1) this.f570w, continuation, this.f572y, 17);
                bVar4.f571x = obj2;
                return bVar4;
            case 18:
                b bVar5 = new b((com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) this.f570w, (String) this.f572y, continuation, 18);
                bVar5.f571x = obj2;
                return bVar5;
            case 19:
                b bVar6 = new b((com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b) this.f570w, (String) this.f572y, continuation, 19);
                bVar6.f571x = obj2;
                return bVar6;
            case 20:
                return new b((ah4.h) this.f571x, (String) this.f570w, (File) this.f572y, continuation, 20);
            case 21:
                return new b((c0) this.f571x, (String) this.f570w, this.f572y, continuation, 21);
            case 22:
                b bVar7 = new b((n) this.f570w, continuation, (w0) this.f572y, 22);
                bVar7.f571x = obj2;
                return bVar7;
            case 23:
                return new b((z) this.f570w, (RecurringPaymentAccount) this.f572y, continuation, 23);
            case 24:
                return new b((s1) this.f571x, (p) this.f570w, (a3) this.f572y, continuation, 24);
            case 25:
                return new b((r) this.f571x, (String) this.f570w, (Evidence) this.f572y, continuation, 25);
            case 26:
                return new b((r) this.f571x, (gkl.n) this.f570w, (String) this.f572y, continuation, 26);
            case 27:
                return new b((n0) this.f571x, (cjl.n) this.f570w, (String) this.f572y, continuation, 27);
            case 28:
                return new b((e1) this.f571x, (s0) this.f570w, (UserInfo) this.f572y, continuation, 28);
            default:
                return new b((n1) this.f571x, (String) this.f570w, (String) this.f572y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f1  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1a.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u uVar, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.f572y = uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f571x = obj2;
        this.f570w = obj3;
        this.f572y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f570w = obj2;
        this.f572y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Flow flow, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.u = i;
        this.f570w = flow;
        this.f572y = obj2;
    }
}
