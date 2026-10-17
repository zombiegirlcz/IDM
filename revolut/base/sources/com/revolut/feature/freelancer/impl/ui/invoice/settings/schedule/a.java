package com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$InputData;
import et6.p1;
import hx7.e;
import java.util.ArrayList;
import js7.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import s9b.n;
import sy6.f;
import sy6.g;
import sy6.j;
import sy6.l;
import vii.b;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {
    public final p1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f73941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f73943r;

    public a(p1 invoiceInteractor, l stateMapper) {
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = invoiceInteractor;
        this.f73941p = new b();
        this.f73942q = e.a(this, new suf.a(this, 10));
        this.f73943r = d.b(this, new f(0), stateMapper, null, false, 12);
    }

    public static FreelancerSingleChoiceScreen I2(TextLocalisedClause textLocalisedClause, ArrayList arrayList, String str, Function1 function1) {
        FreelancerSingleChoiceScreen freelancerSingleChoiceScreen = new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(textLocalisedClause, null, arrayList, str));
        c block = new c(25, function1);
        Intrinsics.checkNotNullParameter(block, "block");
        freelancerSingleChoiceScreen.H = block;
        return freelancerSingleChoiceScreen;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f73941p, new n(continuation, this, 17)), null, null, new j(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73942q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f73943r;
    }
}
