package com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country;

import cli.y;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.IndiaTopupSelectCountryScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n0f.g;
import n0f.i;
import n0f.j;
import n0f.k;
import n0f.n;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import wi0.b;
import x7a.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements g {

    @NotNull
    public static final n Companion = new n();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n8b.a f91083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f91084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91085r;

    public a(cli.n stateMapper, d countryPrefixPickerControllerInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(countryPrefixPickerControllerInteractor, "countryPrefixPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.o = countryPrefixPickerControllerInteractor;
        this.f91083p = countryInteractor;
        this.f91084q = mra.d.b(this, new n0f.d(null, null), stateMapper, null, false, 12);
        this.f91085r = e.a(this, new r(this, 3));
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(n0f.h.f211025a)) {
            b bVar = ((n0f.d) ((j2) this.f91084q.f22677a).getValue()).f211022a;
            if (bVar == null) {
                return;
            }
            C2(new n0f.e(bVar));
            return;
        }
        if (event.equals(i.f211026a)) {
            h.v2(this.f91085r, IndiaTopupSelectCountryScreenContract$ModalStep.SelectCountry.f91082a, ModalDestination.Style.POPUP.f98311a);
        } else {
            if (!event.equals(j.f211027a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91085r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f91084q;
    }
}
