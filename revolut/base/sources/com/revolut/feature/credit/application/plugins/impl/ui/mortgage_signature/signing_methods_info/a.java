package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info;

import cli.g;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import x2g.b;
import xe4.c;
import xe4.f;
import xe4.j;
import xe4.k;
import yy3.l;
import yy3.n;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements f {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f68053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f68054q;

    public a(k singingMethodsAppStoreNaviCommandFactory, xe4.h stateMapper) {
        Intrinsics.checkNotNullParameter(singingMethodsAppStoreNaviCommandFactory, "singingMethodsAppStoreNaviCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = singingMethodsAppStoreNaviCommandFactory;
        this.f68053p = d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
        this.f68054q = e.a(this, new b(this, 21));
    }

    public final void I2(xe4.e event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof xe4.d) {
            B2();
            return;
        }
        if (!(event instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj2 = ((c) event).f304530a.d;
        if (obj2 instanceof l) {
            h.v2(this.f68054q, new SigningMethodsInfoScreenContract$ModalStep.InfoPopup(((l) obj2).f317783a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (!(obj2 instanceof yy3.k)) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SigningMethodsInfoScreenModel", a0.d.m(obj2, "Unsupported parcel: "), null, h0Var);
            return;
        }
        n application = ((yy3.k) obj2).f317782a;
        k kVar = this.o;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(application, "application");
        gh0.d dVar = gh0.d.GOOGLE;
        int i = j.f304536a[dVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (j.f304537b[application.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "104434253";
        } else {
            if (j.f304537b[application.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "com.smart_id";
        }
        C1(kVar.f304538a.b(str, dVar));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f68054q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f68053p;
    }
}
