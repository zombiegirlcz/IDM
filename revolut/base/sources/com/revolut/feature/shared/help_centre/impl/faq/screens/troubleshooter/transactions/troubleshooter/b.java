package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter;

import amh.w;
import b8d.l0;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreenContract$InputData;
import ewa.d;
import f9d.m;
import f9d.p;
import g9d.f;
import hj0.c;
import java.util.concurrent.CancellationException;
import jki.g;
import jki.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lde.n;
import mde.e;
import org.jetbrains.annotations.NotNull;
import r10.q;
import vkm.q0;
import vkm.y;
import vkm.z1;
import wli.x;
import yhm.m;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends g implements m {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f86360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l0 f86361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment f86362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f86363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f86364t;
    public final n u;
    public final f9d.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x deeplinkHandler, l0 deeplinkModifier, UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment inputData, e sharedHelpDestinationProvider, q upcomingTransactionTroubleshooterInteractor, n widgetsInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(upcomingTransactionTroubleshooterInteractor, "upcomingTransactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f86360p = deeplinkHandler;
        this.f86361q = deeplinkModifier;
        this.f86362r = inputData;
        this.f86363s = sharedHelpDestinationProvider;
        this.f86364t = upcomingTransactionTroubleshooterInteractor;
        this.u = widgetsInteractor;
        this.v = new f9d.g(new Data(null, null, true, 3, null), inputData.f86358b, inputData.d);
    }

    @Override // yji.l
    public final void T1(long j2) {
        UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment recurrentPayment = this.f86362r;
        if (recurrentPayment == null) {
            throw new NoWhenBranchMatchedException();
        }
        String paymentId = recurrentPayment.f86358b;
        es.e doOnMissingTransaction = new es.e(this, 19);
        boolean zC = this.u.c();
        q qVar = this.f86364t;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(doOnMissingTransaction, "doOnMissingTransaction");
        w wVar = new w(vkm.q.Q((z1) qVar.d, new f((Continuation) null, qVar, paymentId, zC, doOnMissingTransaction)), 10);
        Continuation continuation = null;
        l.b1(this, vkm.q.q(new q0(new y(wVar, new a82.q(3, 20, continuation)), new a(this, null), 1)), null, null, 7);
        n2(new d(this, continuation, 10), new whi.b(6));
    }

    @Override // jki.g
    public final i r2() {
        return this.v;
    }

    public final void y2(Object obj2, String itemId) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Continuation continuation = null;
        if (!Intrinsics.f(itemId, "ACTION_ITEM_ID")) {
            if (Intrinsics.f(itemId, "HELP_BUTTON_ITEM_ID")) {
                n2(new ev7.b(this, continuation, 20), new whi.b(6));
                return;
            } else {
                if (obj2 != null) {
                    e eVar = this.f86363s;
                    if (eVar.a(obj2)) {
                        C1(eVar.i(obj2));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!(obj2 instanceof hj0.d)) {
            if (obj2 instanceof hj0.e) {
                hj0.e eVar2 = (hj0.e) obj2;
                String str = eVar2.f152634c;
                UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment recurrentPayment = this.f86362r;
                if (recurrentPayment == null) {
                    throw new NoWhenBranchMatchedException();
                }
                v2(new f9d.i(recurrentPayment.f86358b, recurrentPayment.f86357a, str, eVar2.f152633b));
                return;
            }
            return;
        }
        try {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                try {
                    objA = (hj0.d) obj2;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        hj0.d dVar = (hj0.d) objA;
        if (dVar == null) {
            return;
        }
        c cVar = dVar.d;
        String str2 = cVar.f152628b;
        x xVar = this.f86360p;
        if (str2 == null || d0.W(str2) || !xVar.y1(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = cVar.f152627a;
        }
        String str3 = str2;
        n2(new ald.m(this, str3, str3 != null ? xVar.y1(str3) : false, continuation, 16), new whi.b(6));
    }
}
