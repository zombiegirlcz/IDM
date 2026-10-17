package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation;

import ah1.d;
import ah1.e;
import ah1.k;
import ah1.o;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import k7i.i;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import o5l.g;
import oki.h;
import sg1.c;
import vkm.j2;
import yji.l;
import z6l.s;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements d {
    public final GooglePayConfirmationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f60897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f60898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f60899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f60900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f60901t;

    public b(n stateMapper, GooglePayConfirmationControllerContract$InputData inputData, i sharedCardsInteractor, s revolutCardInteractor, c googlePayInteractor, b0 sharedCardsConfigInteractor, c90.c uiResources) {
        g gVar;
        Data data;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedCardsInteractor, "sharedCardsInteractor");
        Intrinsics.checkNotNullParameter(revolutCardInteractor, "revolutCardInteractor");
        Intrinsics.checkNotNullParameter(googlePayInteractor, "googlePayInteractor");
        Intrinsics.checkNotNullParameter(sharedCardsConfigInteractor, "sharedCardsConfigInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = inputData;
        this.f60897p = sharedCardsInteractor;
        this.f60898q = revolutCardInteractor;
        this.f60899r = googlePayInteractor;
        this.f60900s = sharedCardsConfigInteractor;
        Data data2 = new Data(null, null, true, 3, null);
        int i = k.f4864c[uiResources.a().ordinal()];
        if (i == 1) {
            gVar = g.MDPI;
        } else if (i == 2) {
            gVar = g.HDPI;
        } else if (i == 3) {
            gVar = g.XHDPI;
        } else if (i == 4) {
            gVar = g.XXHDPI;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = g.XXXHDPI;
        }
        g gVar2 = gVar;
        Data data3 = new Data(null, null, true, 3, null);
        boolean z = inputData instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation;
        if (z) {
            data = new Data(((GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) inputData).f60895b, null, false, 6, null);
        } else {
            if (!(inputData instanceof GooglePayConfirmationControllerContract$InputData.Confirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            data = new Data(null, null, true, 3, null);
        }
        this.f60901t = mra.d.b(this, new e(data2, data3, gVar2, z, data), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str;
        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = this.o;
        Continuation continuation = null;
        if (googlePayConfirmationControllerContract$InputData instanceof GooglePayConfirmationControllerContract$InputData.Confirmation) {
            GooglePayConfirmationControllerContract$InputData.Confirmation confirmation = (GooglePayConfirmationControllerContract$InputData.Confirmation) googlePayConfirmationControllerContract$InputData;
            boolean z = confirmation.f60893b;
            String cardInfoEncodedBase64 = confirmation.f60892a;
            c cVar = this.f60899r;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(cardInfoEncodedBase64, "cardInfoEncodedBase64");
            if (cVar.a(cardInfoEncodedBase64, z) != null) {
                Intrinsics.checkNotNullParameter(cardInfoEncodedBase64, "cardInfoEncodedBase64");
                sg1.a aVarA = cVar.a(cardInfoEncodedBase64, z);
                if (aVarA != null) {
                    str = aVarA.f262578b;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't verify Google Pay data");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
            str = null;
        } else {
            if (!(googlePayConfirmationControllerContract$InputData instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) googlePayConfirmationControllerContract$InputData).f60894a;
        }
        if (str != null) {
            l2(new af4.e(this, str, continuation, 6), new yi5.b(26));
        } else {
            l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.google_pay_confirm_wrong_gp_params_dialog_title, null, null, 14), new TextLocalisedClause(R$string.google_pay_confirm_wrong_gp_params_dialog_message, null, null, 14), new TextLocalisedClause(R$string.google_pay_confirm_wrong_gp_params_dialog_ok_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new o(this, null, 1), 3);
        }
    }

    public final jg1.g I2() {
        jg1.g gVar = (jg1.g) ((e) ((j2) this.f60901t.f22677a).getValue()).e.getContent();
        return gVar == null ? jg1.g.GOOGLE_PAY : gVar;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f60901t;
    }
}
