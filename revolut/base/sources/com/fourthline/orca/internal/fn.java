package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.ho;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.lo;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fn implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg0 f28571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l70 f28573c;
    private final hq0 d;
    private final Lazy e;

    public fn(qg0 analytics, v10 imageServiceLocator, l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f28571a = analytics;
        this.f28572b = imageServiceLocator;
        this.f28573c = lottieServiceLocator;
        this.d = lo.a.f30691a;
        this.e = yhm.j.b(new ul1(this, 4));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f28571a.track(ho.a.g.f29357b);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.b a(fn fnVar) {
        p70 p70VarA = fnVar.f28573c.a(k70.f30163q);
        c81.a aVar = c81.f27404a;
        c81.d dVarA = c81.a.a(aVar, R.string.shared_dialog_action_ready_document_header, 0, 2, null);
        c81.d dVarA2 = c81.a.a(aVar, R.string.shared_dialog_action_ready_document_message, 0, 2, null);
        List<Pair> listK = zhm.v.k(new Pair(r10.T0, Integer.valueOf(R.string.shared_dialog_action_ready_document_hint1)), new Pair(r10.U0, Integer.valueOf(R.string.shared_dialog_action_ready_document_hint2)), new Pair(r10.V0, Integer.valueOf(R.string.shared_dialog_action_ready_document_hint3)));
        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
        for (Pair pair : listK) {
            arrayList.add(new zp0.b.a(fnVar.f28572b.a((r10) pair.f186385a), new tj1(1, pair)));
        }
        return new zp0.b(dVarA, p70VarA, dVarA2, arrayList, new kd1.d(null, 1, null), new kd1.a(null, 1, null), false, 64, null);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(Pair pair, Composer composer, int i) {
        composer.startReplaceGroup(661325365);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(661325365, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.popup.DocumentReadyPopupProvider.state$delegate.<anonymous>.<anonymous>.<anonymous> (DocumentReadyPopupProvider.kt:41)");
        }
        String strC = d81.c(c81.a.a(c81.f27404a, ((Number) pair.f186386b).intValue(), 0, 2, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strC;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void a() {
        this.f28571a.track(ho.a.h.f29358b);
    }
}
