package com.revolut.sso.impl.ui.consent.qr;

import akl.n0;
import bjl.p0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.qr.QrConsentFlowContract$Step;
import gim.c;
import gvc.m;
import hml.d;
import hml.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import nii.l0;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import wli.x;
import yji.l;
import yki.i;
import zh9.u0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends zll.b implements hml.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final QrConsentFlowContract$InputData f106477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final knl.d f106478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p0 f106479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n0 f106480t;
    public final x u;
    public final i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(QrConsentFlowContract$InputData inputData, knl.d requestLocationControllerModelExtension, p0 revolutSsoDependenciesProvider, n0 qrConsentRepository, x deeplinkHandler, g1 shotDialogDisplayer) {
        super(revolutSsoDependenciesProvider, shotDialogDisplayer);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(requestLocationControllerModelExtension, "requestLocationControllerModelExtension");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(qrConsentRepository, "qrConsentRepository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f106477q = inputData;
        this.f106478r = requestLocationControllerModelExtension;
        this.f106479s = revolutSsoDependenciesProvider;
        this.f106480t = qrConsentRepository;
        this.u = deeplinkHandler;
        this.v = d8l.d.a(this, new hfb.d(this, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r11.N2(r1, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.consent.qr.b r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.consent.qr.b.J2(com.revolut.sso.impl.ui.consent.qr.b, gim.c):java.lang.Object");
    }

    public static final void K2(b bVar) {
        bVar.X1(new y0("DIALOG_ID_LOCATION_ERROR", new l0(new TextLocalisedClause(R$string.revolut_sso_request_rejection_popup_location_error_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_request_rejection_popup_location_error_description, null, null, 14), null, new TextLocalisedClause(R$string.revolut_sso_request_rejection_popup_location_error_primary_action, null, null, 14), null, null, false, null, 1012), false, 4));
    }

    public final Object L2(String str, ConsentChallenge.Qr.Delegated.Selection.Identity identity, ConsentChallenge.Qr qr10, c cVar) {
        a aVar = new a(identity, this, qr10, null);
        Object objP2 = str == null ? p2(cVar, aVar) : u0.b0(X(), str, aVar, cVar);
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 22), new hml.c(this, 0));
    }

    public final void M2(gkl.d dVar) {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.revolut_sso_request_rejection_popup_account_not_related_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_request_rejection_popup_account_not_related_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new hml.m(this, null, 1), 3);
    }

    public final Object N2(ConsentChallenge.Qr qr10, c cVar) {
        ConsentChallenge.Qr.Delegated.Selection.Identity identity;
        Object next;
        boolean z = qr10 instanceof ConsentChallenge.Qr.Delegated;
        i iVar = this.v;
        if (z) {
            ConsentChallenge.Qr.Delegated delegated = (ConsentChallenge.Qr.Delegated) qr10;
            ConsentChallenge.Qr.Delegated.Details details = delegated.i;
            ConsentChallenge.Qr.Delegated.Selection selection = delegated.f105916h;
            ArrayList arrayList = selection.f105920a;
            ArrayList arrayList2 = selection.f105920a;
            int size = arrayList.size();
            String str = this.f106477q.f106468c;
            if (str != null) {
                Iterator it8 = arrayList2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((ConsentChallenge.Qr.Delegated.Selection.Identity) next).f105921a, str)) {
                        break;
                    }
                }
                identity = (ConsentChallenge.Qr.Delegated.Selection.Identity) next;
                if (identity == null) {
                    NoSuchElementException noSuchElementException = new NoSuchElementException(v1.c.t(size, "Preselected subject: ", j6.a.q("..", f0.V0(4, str)), " not found in the BE-provided list of subjects: "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, noSuchElementException, h0Var);
                }
            } else {
                identity = null;
            }
            if (identity != null) {
                Object objL2 = L2(null, identity, qr10, cVar);
                return objL2 == fim.a.COROUTINE_SUSPENDED ? objL2 : Unit.f186387a;
            }
            if (size == 0) {
                ConsentChallenge.Qr.Delegated.Details.Action action = details != null ? details.f105917a : null;
                if (action != null) {
                    n2(new j(this, null, action, null), new whi.b(6));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot process QR-code Delegated consent, as selection identities empty and deeplink is null.");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                    h.D2(iVar);
                }
            } else {
                if (size == 1) {
                    if ((details != null ? details.f105917a : null) == null) {
                        Object objL22 = L2(null, (ConsentChallenge.Qr.Delegated.Selection.Identity) d0.K0(arrayList2), qr10, cVar);
                        return objL22 == fim.a.COROUTINE_SUSPENDED ? objL22 : Unit.f186387a;
                    }
                }
                h.t2(this, iVar, new QrConsentFlowContract$Step.SelectIdentity(delegated), false, TransitionAnimation.NONE.f98393a, false, 8);
            }
        } else {
            if (!(qr10 instanceof ConsentChallenge.Qr.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, iVar, new QrConsentFlowContract$Step.Confirmation(qr10, null), false, TransitionAnimation.NONE.f98393a, false, 8);
        }
        return Unit.f186387a;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
