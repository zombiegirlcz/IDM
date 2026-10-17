package ki2;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import dj0.d;
import elm.f;
import hy2.e;
import ih2.c;
import jh2.n;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import pyc.p;
import skm.e0;
import skm.p0;
import u6k.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f184166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax1.a f184167b;

    public b(c weroPayRepository, ax1.a apmMoneyRequestInteractor, pz1.b apmMoneyRequestsActionsRepository, vv9.c moneyRequestInteractor) {
        Intrinsics.checkNotNullParameter(weroPayRepository, "weroPayRepository");
        Intrinsics.checkNotNullParameter(apmMoneyRequestInteractor, "apmMoneyRequestInteractor");
        Intrinsics.checkNotNullParameter(apmMoneyRequestsActionsRepository, "apmMoneyRequestsActionsRepository");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        this.f184166a = weroPayRepository;
        this.f184167b = apmMoneyRequestInteractor;
    }

    public static n d(MoneyRequest moneyRequest) {
        String str = moneyRequest.f60314a;
        d dVar = moneyRequest.d;
        String str2 = moneyRequest.f60317g;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str3 = moneyRequest.e;
        DateTime dateTime = moneyRequest.f60318h;
        return new n(str, dVar, str2, str3, dateTime != null ? jli.b.g(dateTime) : null);
    }

    public final Object a(gim.c cVar) {
        c cVar2 = this.f184166a;
        cVar2.getClass();
        e eVar = new e(cVar2, null, 24);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, eVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ki2.a
            if (r0 == 0) goto L13
            r0 = r6
            ki2.a r0 = (ki2.a) r0
            int r1 = r0.f184165w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184165w = r1
            goto L18
        L13:
            ki2.a r0 = new ki2.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184165w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f184165w = r3
            ax1.a r6 = r4.f184167b
            pz1.c r6 = (pz1.c) r6
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.revolut.domain.models.moneyrequest.MoneyRequest r6 = (com.revolut.domain.models.moneyrequest.MoneyRequest) r6
            jh2.n r5 = d(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ki2.b.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final akg.n c() {
        pz1.c cVar = (pz1.c) this.f184167b;
        MoneyRequestChannel.Wero channel = MoneyRequestChannel.Wero.f60336b;
        Intrinsics.checkNotNullParameter(channel, "channel");
        return nim.a.v(rd0.e.b(nim.a.w(((h) cVar.f240866b).d(false), new p(13))), new kh4.b(this, 10));
    }
}
