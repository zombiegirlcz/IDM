package jsl;

import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchExperience;
import ft3.h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f178236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f178237x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i, com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = 11;
        this.f178237x = cVar;
        this.v = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t0((u0) this.f178236w, (p0) this.f178237x, continuation, 0);
            case 1:
                return new t0((jt1.z) this.f178236w, (yof.b) this.f178237x, continuation, 1);
            case 2:
                return new t0((jt1.z) this.f178236w, (h1j.d) this.f178237x, continuation, 2);
            case 3:
                return new t0((com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b) this.f178236w, (bp9.f) this.f178237x, continuation, 3);
            case 4:
                return new t0((jta.v) this.f178236w, (String) this.f178237x, continuation, 4);
            case 5:
                return new t0((com.revolut.feature.security_hub.impl.ui.security_hub.c) this.f178237x, continuation, 5);
            case 6:
                return new t0((jvf.c) this.f178236w, (List) this.f178237x, continuation, 6);
            case 7:
                t0 t0Var = new t0((jwb.c) this.f178237x, continuation, 7);
                t0Var.f178236w = obj2;
                return t0Var;
            case 8:
                t0 t0Var2 = new t0((jwf.n) this.f178237x, continuation, 8);
                t0Var2.f178236w = obj2;
                return t0Var2;
            case 9:
                return new t0((com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b) this.f178237x, continuation, 9);
            case 10:
                return new t0((ti0.c) this.f178236w, (lx.a) this.f178237x, continuation, 10);
            case 11:
                t0 t0Var3 = new t0(this.v, (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) this.f178237x, continuation);
                t0Var3.f178236w = obj2;
                return t0Var3;
            case 12:
                return new t0((com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) this.f178236w, (String) this.f178237x, continuation, 12);
            case 13:
                return new t0((String) this.f178236w, (jyk.r) this.f178237x, continuation, 13);
            case 14:
                return new t0((jyk.j0) this.f178236w, (String) this.f178237x, continuation, 14);
            case 15:
                t0 t0Var4 = new t0((jz.l) this.f178237x, continuation, 15);
                t0Var4.f178236w = obj2;
                return t0Var4;
            case 16:
                t0 t0Var5 = new t0((k09.g) this.f178237x, continuation, 16);
                t0Var5.f178236w = obj2;
                return t0Var5;
            case 17:
                return new t0((u09.q) this.f178236w, (k09.g) this.f178237x, continuation, 17);
            case 18:
                return new t0((k0g.c) this.f178236w, (kyf.a) this.f178237x, continuation, 18);
            case 19:
                return new t0((k1c.d) this.f178236w, (m1c.l0) this.f178237x, continuation, 19);
            case 20:
                return new t0((k1c.d) this.f178236w, (String) this.f178237x, continuation, 20);
            case 21:
                return new t0((fmc.z) this.f178236w, (String) this.f178237x, continuation, 21);
            case 22:
                t0 t0Var6 = new t0((k25.u) this.f178237x, continuation, 22);
                t0Var6.f178236w = obj2;
                return t0Var6;
            case 23:
                return new t0((k2h.n) this.f178236w, (ArrayList) this.f178237x, continuation, 23);
            case 24:
                return new t0((k34.a) this.f178236w, (h1) this.f178237x, continuation, 24);
            case 25:
                return new t0((k3g.o) this.f178236w, (TravelSearchAttraction) this.f178237x, continuation, 25);
            case 26:
                return new t0((k3g.o) this.f178236w, (TravelSearchDestination) this.f178237x, continuation, 26);
            case 27:
                return new t0((k3g.o) this.f178236w, (TravelSearchExperience) this.f178237x, continuation, 27);
            case 28:
                return new t0((k3g.o) this.f178236w, (String) this.f178237x, continuation, 28);
            default:
                return new t0((k3k.t0) this.f178236w, (yof.b) this.f178237x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 6:
                break;
        }
        return ((t0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:363:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x08d0  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jsl.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178236w = obj2;
        this.f178237x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178237x = obj2;
    }
}
