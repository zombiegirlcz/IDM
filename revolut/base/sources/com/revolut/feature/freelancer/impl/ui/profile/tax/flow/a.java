package com.revolut.feature.freelancer.impl.ui.profile.tax.flow;

import com.revolut.feature.freelancer.impl.ui.profile.tax.flow.FreelancerTaxSettingsFlowContract$Step;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pu4.d;
import q07.b;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {

    @NotNull
    public static final C0492a Companion = new C0492a();
    public final yki.a o;

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.impl.ui.profile.tax.flow.a$a, reason: collision with other inner class name */
    public static final class C0492a {
        private C0492a() {
        }
    }

    public a() {
        d dVar = new d(this, 18);
        this.o = cp5.d.a(this, FreelancerTaxSettingsFlowContract$Step.TaxSettings.f74060a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
