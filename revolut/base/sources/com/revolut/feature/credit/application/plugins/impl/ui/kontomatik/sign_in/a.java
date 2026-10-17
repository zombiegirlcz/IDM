package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in;

import cli.n;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInControllerContract$ModalStep;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import hx7.e;
import iv3.c;
import iv3.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qd0.b;
import y8a.g;
import ybh.a0;
import yc4.f;
import yc4.i;
import yc4.j;
import yc4.k;
import yc4.l;
import yc4.m;
import yc4.o;
import yc4.p;
import yc4.q;
import yc4.r;
import yc4.s;
import yc4.v;
import yc4.x;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements v {

    @NotNull
    public static final x Companion = new x();
    public final KontomatikSignInControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yc4.a f67823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f67824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67825r;

    public a(KontomatikSignInControllerContract$InputData inputData, b languageProvider, n stateMapper, yc4.a kontomatikErrorParser) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(kontomatikErrorParser, "kontomatikErrorParser");
        this.o = inputData;
        this.f67823p = kontomatikErrorParser;
        this.f67824q = d.b(this, new f(inputData.f67819a, inputData.d, inputData.f67821c, ((s80.b) languageProvider).b(), true), stateMapper, null, false, 12);
        this.f67825r = e.a(this, new g(this, 11));
    }

    public final void I2(o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(yc4.h.f312518a)) {
            C2(p.f312526a);
            return;
        }
        if (event instanceof yc4.g) {
            String message = ((yc4.g) event).f312517a;
            this.f67823p.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            C2(new q(Intrinsics.f(message, "UserAbortedAuthorization") ? f.a.f168711a : new iv3.e(message)));
            return;
        }
        if (event instanceof i) {
            c cVar = ((i) event).f312519a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "Kontomatik", "Expected error on iframe with cause = " + cVar, null, null, 16);
            C2(new q(cVar));
            return;
        }
        if (event.equals(j.f312520a)) {
            C2(r.f312528a);
            return;
        }
        if (event instanceof k) {
            k kVar = (k) event;
            C2(new s(new iv3.b(kVar.f312521a, kVar.f312522b)));
            return;
        }
        if (!event.equals(l.f312523a)) {
            if (event.equals(m.f312524a)) {
                H2(this.f67824q, new a0(15));
                return;
            } else {
                if (!(event instanceof yc4.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(((yc4.n) event).f312525a, null, true, true, 26))));
                return;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "Kontomatik", "User bank is not presented in iframe", null, null, 16);
        if (this.o.e) {
            h.v2(this.f67825r, KontomatikSignInControllerContract$ModalStep.KontomatikSelection.f67822a, ModalDestination.Style.POPUP.f98311a);
        } else {
            int i = 6;
            n2(new y7i.h(this, null, i), new whi.b(i));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67825r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67824q;
    }
}
