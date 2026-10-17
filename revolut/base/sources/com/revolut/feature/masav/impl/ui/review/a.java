package com.revolut.feature.masav.impl.ui.review;

import cli.g;
import cli.y;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import i69.f;
import i69.i;
import i69.j;
import i69.k;
import i69.l;
import i69.o;
import i69.p;
import i69.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rea.m;
import vkm.j2;
import yi5.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i69.h {

    @NotNull
    public static final q Companion = new q();
    public final l2j.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f78128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugc.a f78129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f78130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78131s;

    public a(MasavDirectDebitReviewScreenContract$InputData inputData, l2j.a currencyChooserFlowFactory, m pocketDetailsInteractor, ugc.a masavDirectDebitInteractor, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(masavDirectDebitInteractor, "masavDirectDebitInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = currencyChooserFlowFactory;
        this.f78128p = pocketDetailsInteractor;
        this.f78129q = masavDirectDebitInteractor;
        this.f78130r = d.b(this, new f(inputData.f78125a, inputData.f78126b), stateMapper, null, false, 12);
        this.f78131s = e.a(this, new p(this, 0));
    }

    public final void I2(i69.m uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (uiEvent.equals(i.f158896a)) {
            B2();
            return;
        }
        if (uiEvent.equals(l.f158899a)) {
            return;
        }
        if (uiEvent.equals(j.f158897a)) {
            h.v2(this.f78131s, new MasavDirectDebitReviewScreenContract$ModalStep.PocketSelector(((f) ((j2) this.f78130r.f22677a).getValue()).f158894b), ModalDestination.Style.POPUP.f98311a);
        } else {
            if (!uiEvent.equals(k.f158898a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new hy2.e(this, null, 12), new b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78131s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f78130r;
    }
}
