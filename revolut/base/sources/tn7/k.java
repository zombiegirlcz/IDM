package tn7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f272333a;

    public k(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f272333a = languageProvider;
    }

    public static TextLocalisedClause b(d dVar) {
        int i;
        int i2 = j.f272332a[dVar.f272322b.ordinal()];
        if (i2 == 1) {
            i = R$string.car_insurance_certificate_shipping_details_temporary_cert_header_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.car_insurance_certificate_shipping_details_annual_cert_header_title;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f272321a, new tjf.e(this, domainState, 16), new ta8.a(this, domainState, 23), new si5.c(this, domainState, 20));
    }
}
