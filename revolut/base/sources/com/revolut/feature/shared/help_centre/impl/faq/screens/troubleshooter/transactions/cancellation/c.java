package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation;

import ahd.y;
import b8d.l0;
import c9d.h;
import c9d.i;
import c9d.k;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import d9d.d;
import g9d.f;
import jki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import mde.e;
import org.jetbrains.annotations.NotNull;
import qua.p;
import r10.q;
import vkm.q0;
import vkm.z1;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends g implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f86335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d9d.c f86336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f86337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l0 f86338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SubscriptionCancellationScreenContract$InputData.RecurrentPayment f86339t;
    public final e u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f86340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f86341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p f86342y;
    public final h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jki.p stateMapper, j60.a bottomSheet, d9d.c customTroubleshooterActionsHandler, x deeplinkHandler, l0 deeplinkModifier, SubscriptionCancellationScreenContract$InputData.RecurrentPayment inputData, e sharedHelpDestinationProvider, d subscriptionCancellationInteractor, q upcomingTransactionTroubleshooterInteractor, n widgetsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Intrinsics.checkNotNullParameter(customTroubleshooterActionsHandler, "customTroubleshooterActionsHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(subscriptionCancellationInteractor, "subscriptionCancellationInteractor");
        Intrinsics.checkNotNullParameter(upcomingTransactionTroubleshooterInteractor, "upcomingTransactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f86335p = bottomSheet;
        this.f86336q = customTroubleshooterActionsHandler;
        this.f86337r = deeplinkHandler;
        this.f86338s = deeplinkModifier;
        this.f86339t = inputData;
        this.u = sharedHelpDestinationProvider;
        this.v = subscriptionCancellationInteractor;
        this.f86340w = upcomingTransactionTroubleshooterInteractor;
        this.f86341x = widgetsInteractor;
        this.z = new h(new Data(null, null, true, 3, null), inputData.e);
    }

    @Override // yji.l
    public final void T1(long j2) {
        SubscriptionCancellationScreenContract$InputData.RecurrentPayment recurrentPayment = this.f86339t;
        if (recurrentPayment == null) {
            throw new NoWhenBranchMatchedException();
        }
        String paymentId = recurrentPayment.f86331a;
        bvb.a doOnMissingTransaction = new bvb.a(this, 11);
        boolean zC = this.f86341x.c();
        q qVar = this.f86340w;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(doOnMissingTransaction, "doOnMissingTransaction");
        l.b1(this, vkm.q.q(new q0(new y(new q0(vkm.q.Q((z1) qVar.d, new f((Continuation) null, qVar, paymentId, zC, doOnMissingTransaction)), new a(this, null), 1), this, recurrentPayment, 11), new b(this, recurrentPayment, null), 1)), null, null, 7);
        n2(new af3.f((Object) this, false, (Continuation) null, 4), new whi.b(6));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01df  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y2(java.lang.Object r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c.y2(java.lang.Object, java.lang.String):void");
    }
}
