package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit;

import av8.n;
import b74.s;
import b74.w;
import cli.g;
import cli.y;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import hx7.e;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements w {
    public final LegacyEditConsentPreferencesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f67279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67280q;

    public a(LegacyEditConsentPreferencesScreenContract$InputData inputData, b74.y stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67279p = d.b(this, new s(inputData.f67277a.getSelection(), J2(inputData.f67277a.getSelection())), stateMapper, null, false, 12);
        this.f67280q = e.a(this, new n(this, 25));
    }

    public final ConsentRetention I2(LocalDate localDate) {
        EditPreferencesConfiguration editPreferencesConfiguration = this.o.f67277a;
        if (editPreferencesConfiguration instanceof EditPreferencesConfiguration.ActiveFacility) {
            return new ConsentRetention.ActiveFacility.Until(localDate);
        }
        if (editPreferencesConfiguration instanceof EditPreferencesConfiguration.Application) {
            return new ConsentRetention.Application.Until(localDate);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean J2(ConsentRetention consentRetention) {
        LocalDate f66441a = consentRetention.getF66441a();
        if (f66441a == null) {
            return true;
        }
        LegacyEditConsentPreferencesScreenContract$InputData legacyEditConsentPreferencesScreenContract$InputData = this.o;
        return f66441a.compareTo((Object) legacyEditConsentPreferencesScreenContract$InputData.f67277a.getD()) <= 0 && f66441a.compareTo((Object) legacyEditConsentPreferencesScreenContract$InputData.f67277a.getF67267c()) >= 0;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67280q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f67279p;
    }
}
