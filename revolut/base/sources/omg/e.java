package omg;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oo2.p;
import ood.q0;
import oph.m;
import osk.n;
import ot1.b0;
import ow1.q;
import ow6.j;
import p75.h;
import pdg.i0;
import pdi.k;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f226839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226839w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((g) this.f226839w, continuation, 0);
            case 1:
                return new e((k18.c) this.f226839w, continuation, 1);
            case 2:
                return new e((ona.i) this.f226839w, continuation, 2);
            case 3:
                return new e((p) this.f226839w, continuation, 3);
            case 4:
                return new e((q0) this.f226839w, continuation, 4);
            case 5:
                return new e((m) this.f226839w, continuation, 5);
            case 6:
                return new e((opl.d) this.f226839w, continuation, 6);
            case 7:
                return new e((oq3.m) this.f226839w, continuation, 7);
            case 8:
                return new e((com.revolut.feature.salary_switch.impl.ui.brazil.flow.b) this.f226839w, continuation, 8);
            case 9:
                return new e((com.revolut.feature.credit.card.impl.ui.documents_rates.a) this.f226839w, continuation, 9);
            case 10:
                return new e((n) this.f226839w, continuation, 10);
            case 11:
                return new e((b0) this.f226839w, continuation, 11);
            case 12:
                return new e((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) this.f226839w, continuation, 12);
            case 13:
                return new e((com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.f226839w, continuation, 13);
            case 14:
                return new e((GlossaryScreen) this.f226839w, continuation, 14);
            case 15:
                return new e((q) this.f226839w, continuation, 15);
            case 16:
                return new e((j) this.f226839w, continuation, 16);
            case 17:
                return new e((oxe.n) this.f226839w, continuation, 17);
            case 18:
                return new e((dsd.i) this.f226839w, continuation, 18);
            case 19:
                return new e((p24.p) this.f226839w, continuation, 19);
            case 20:
                return new e((com.revolut.chat.ui.chat_profile.profile_screen.b) this.f226839w, continuation, 20);
            case 21:
                return new e((com.revolut.feature.joint.impl.ui.close_flow.a) this.f226839w, continuation, 21);
            case 22:
                return new e((com.revolut.feature.apm.iris.impl.ui.settings.a) this.f226839w, continuation, 22);
            case 23:
                return new e((p68.i) this.f226839w, continuation, 23);
            case 24:
                return new e((h) this.f226839w, continuation, 24);
            case 25:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) this.f226839w, continuation, 25);
            case 26:
                return new e((com.revolut.feature.onboarding.impl.onboarding.country.flow.c) this.f226839w, continuation, 26);
            case 27:
                return new e((com.revolut.feature.apm.qvik.impl.ui.home.a) this.f226839w, continuation, 27);
            case 28:
                return new e((i0) this.f226839w, continuation, 28);
            default:
                return new e((k) this.f226839w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v107, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: omg.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
