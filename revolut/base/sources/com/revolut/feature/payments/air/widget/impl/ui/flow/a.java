package com.revolut.feature.payments.air.widget.impl.ui.flow;

import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import d8l.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qc0.e1;
import qo9.c;
import qo9.k;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements c {
    public final PaymentWidget o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ResolvedRecipient f79132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final no9.a f79133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f79134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qo9.a f79135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f79136t;

    public a(PaymentWidget widget, ResolvedRecipient resolvedRecipient, no9.a paymentWidgetInteractor, b stepResolver, qo9.a recipientCreationDescriptorFactory) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(resolvedRecipient, "resolvedRecipient");
        Intrinsics.checkNotNullParameter(paymentWidgetInteractor, "paymentWidgetInteractor");
        Intrinsics.checkNotNullParameter(stepResolver, "stepResolver");
        Intrinsics.checkNotNullParameter(recipientCreationDescriptorFactory, "recipientCreationDescriptorFactory");
        this.o = widget;
        this.f79132p = resolvedRecipient;
        this.f79133q = paymentWidgetInteractor;
        this.f79134r = stepResolver;
        this.f79135s = recipientCreationDescriptorFactory;
        this.f79136t = d.a(this, new qm2.c(this, 3));
    }

    public static final void I2(a aVar, Throwable th10) {
        aVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        h.D2(aVar.f79136t);
    }

    public final void J2(String str) {
        l2(new e1(this, str, null, 18), new qi3.i(1, this, a.class, "handleSilentError", "handleSilentError(Ljava/lang/Throwable;)Z", 0, 9));
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 1), new qi3.i(1, this, a.class, "handleInitialisationError", "handleInitialisationError(Ljava/lang/Throwable;)Z", 0, 10));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79136t;
    }
}
