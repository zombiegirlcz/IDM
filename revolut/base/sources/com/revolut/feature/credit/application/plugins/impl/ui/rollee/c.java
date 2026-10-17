package com.revolut.feature.credit.application.plugins.impl.ui.rollee;

import android.os.Parcelable;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import grl.k9;
import ht3.l0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import qh4.g;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements qh4.c {

    @NotNull
    public static final qh4.d Companion = new qh4.d();
    public static final long u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RolleeFlowContract$InputData f68334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cy3.a f68335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f68336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f68337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68338t;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        u = kotlin.time.c.g(1, e.MINUTES);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RolleeFlowContract$InputData inputData, cy3.a rolleeInteractor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rolleeInteractor, "rolleeInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68334p = inputData;
        this.f68335q = rolleeInteractor;
        this.f68336r = new AtomicBoolean(false);
        this.f68337s = new AtomicReference(null);
        l0 l0Var = inputData.f68324a;
        this.f68338t = cp5.d.a(this, l0Var != null ? new RolleeFlowContract$Step.Intro(l0Var) : RolleeFlowContract$Step.Login.f68328a, f0.f322471a, new q5g.f0(this, 21));
    }

    public final y0 P2() {
        qh4.e eVar = (qh4.e) this.f68337s.getAndSet(null);
        if (eVar != null) {
            eVar.f246456b.f(null);
        }
        if (eVar != null) {
            return eVar.f246455a;
        }
        return null;
    }

    @Override // c84.t, yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (super.o1(throwable)) {
            return true;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_error_title, null, null, 14);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        l.a1(this, X1(new y0(null, new z(textLocalisedClause, null, null, null, null, null, true, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, null, null, null, 31998), false, 5)), null, null, new g((Continuation) null, this, 1), 3);
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68338t;
    }
}
