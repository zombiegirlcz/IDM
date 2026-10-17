package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen;

import cli.n;
import cli.y;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a;
import com.revolut.feature.retail.privacy.api.navigation.RetailPrivacyDestination;
import dz6.o;
import e0a.b0;
import e0a.l;
import e0a.m;
import e0a.r;
import g0a.g;
import g0a.j;
import k7i.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import mp.p;
import mx0.b4;
import mx0.e4;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import vkm.j2;
import zz9.c0;
import zz9.h0;
import zz9.q;
import zz9.s;
import zz9.w;
import zz9.x;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements x {

    @NotNull
    private static final c0 Companion = new c0();
    public final i0a.c A;
    public final g81.a B;
    public final b81.c C;
    public final wu9.h D;
    public final qu9.b E;
    public final l0 F;
    public final i G;
    public volatile boolean H;
    public final y I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final c0a.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0a.i f79778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f79779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f79780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f79781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f79782t;
    public final e0a.c0 u;
    public final e0a.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f79783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f79784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f0a.c f79785y;
    public final i0a.b z;

    public d(c0a.b stateProvider, b0a.i eligibilityProvider, p bottomStateProvider, l keyboardExtension, b0 messageSendingExtension, j60.a bottomExpandableDialog, e0a.c0 startupExtension, e0a.e clicksExtension, r messageClicksExtension, m messageActionsExtension, f0a.c eligibilityExtension, i0a.b warningExtension, i0a.c warningMapper, g81.a errorHandler, b81.c errorActionPerformer, wu9.h reactionsDelegate, qu9.b chatBubbleClauseClickExtension, l0 popupMenuDialogDisplayer, i transactionsRefresher, PeerToPeerChatScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(eligibilityProvider, "eligibilityProvider");
        Intrinsics.checkNotNullParameter(bottomStateProvider, "bottomStateProvider");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(messageSendingExtension, "messageSendingExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(startupExtension, "startupExtension");
        Intrinsics.checkNotNullParameter(clicksExtension, "clicksExtension");
        Intrinsics.checkNotNullParameter(messageClicksExtension, "messageClicksExtension");
        Intrinsics.checkNotNullParameter(messageActionsExtension, "messageActionsExtension");
        Intrinsics.checkNotNullParameter(eligibilityExtension, "eligibilityExtension");
        Intrinsics.checkNotNullParameter(warningExtension, "warningExtension");
        Intrinsics.checkNotNullParameter(warningMapper, "warningMapper");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(errorActionPerformer, "errorActionPerformer");
        Intrinsics.checkNotNullParameter(reactionsDelegate, "reactionsDelegate");
        Intrinsics.checkNotNullParameter(chatBubbleClauseClickExtension, "chatBubbleClauseClickExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(transactionsRefresher, "transactionsRefresher");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = stateProvider;
        this.f79778p = eligibilityProvider;
        this.f79779q = bottomStateProvider;
        this.f79780r = keyboardExtension;
        this.f79781s = messageSendingExtension;
        this.f79782t = bottomExpandableDialog;
        this.u = startupExtension;
        this.v = clicksExtension;
        this.f79783w = messageClicksExtension;
        this.f79784x = messageActionsExtension;
        this.f79785y = eligibilityExtension;
        this.z = warningExtension;
        this.A = warningMapper;
        this.B = errorHandler;
        this.C = errorActionPerformer;
        this.D = reactionsDelegate;
        this.E = chatBubbleClauseClickExtension;
        this.F = popupMenuDialogDisplayer;
        this.G = transactionsRefresher;
        zm3.a aVar = inputData.f79768a;
        s sVar = s.DISABLED;
        m70.a.c(t0.f186434a);
        e4 e4Var = e4.ONLY_TEXT;
        zz9.n.Companion.getClass();
        zz9.n nVar = zz9.n.e;
        keyboardExtension.getClass();
        this.I = mra.d.b(this, new q(aVar, a.b.f79776a, sVar, "", e4Var, nVar, fu9.a.NONE, 0, false, inputData.f79770c, inputData.d), stateMapper, null, false, 12);
        this.J = hx7.e.a(this, new zo2.h(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02cc  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d.I1():void");
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "listId");
        Continuation continuation = null;
        if (Intrinsics.f(id10, "MESSAGING_BOTTOM_DIALOG_ACTION_OK") || Intrinsics.f(id10, "GIFT_ACTION_PRIMARY_BUTTON_ID")) {
            j60.a.v(this.f79782t, false, null, 3);
            return;
        }
        if (!Intrinsics.f(id10, "GIFT_ACTION_SECONDARY_BUTTON_ID")) {
            String[] elements = {"ACTION_SHOW_DISABLED_INPUT_VIEW_DISCLAIMER_ACTION_TURN_ON_GLOBAL_ID", "ACTION_SHOW_DISABLED_INPUT_VIEW_DISCLAIMER_ACTION_UNBLOCK_ID"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(id10)) {
                zm3.a contact = ((q) ((j2) this.I.f22677a).getValue()).f326625a;
                f0a.c cVar = this.f79785y;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(contact, "contact");
                cVar.T2(new etj.l(id10, cVar, contact, continuation, 8), new yi5.b(27));
                return;
            }
            return;
        }
        j jVar = obj2 instanceof j ? (j) obj2 : null;
        g gVar = (g) ((e0a.q) this.f79784x).f121518p;
        gVar.getClass();
        g0a.i iVar = jVar != null ? jVar.d : null;
        int i = iVar == null ? -1 : g0a.b.f139380b[iVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                gVar.T2(new etj.l(gVar, jVar.f139396b, jVar.f139395a, continuation, 26), new yi5.b(27));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = 0;
                gVar.T2(new g0a.e(i2, gVar, jVar.f139397c, jVar.f139396b, jVar.f139395a, null), new yi5.b(27));
            }
        }
        j60.a.v(gVar.o, false, null, 3);
    }

    public final void J2(b4 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        l lVar = this.f79780r;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        lVar.T2(new o(action, lVar, null, 3), new yi5.b(27));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    public final void K2(String newInput) {
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        H2(this.I, new zuj.x(newInput, 5));
        l lVar = this.f79780r;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        lVar.T2(new o(lVar, d0.W(newInput) ? fu9.a.REACTIONS_KEYBOARD : fu9.a.SEND_MESSAGE, null, 4), new yi5.b(27));
    }

    public final void L2(w action) {
        Intrinsics.checkNotNullParameter(action, "action");
        zm3.a contact = ((q) ((j2) this.I.f22677a).getValue()).f326625a;
        int i = zz9.d0.f326606a[action.ordinal()];
        Continuation continuation = null;
        i0a.b bVar = this.z;
        if (i == 1) {
            bVar.getClass();
            bVar.A2(new RetailPrivacyDestination(null));
            return;
        }
        if (i == 2) {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(contact, "contact");
            bVar.T2(new i0a.a(bVar, contact, continuation, 1), new yi5.b(27));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.getClass();
            Intrinsics.checkNotNullParameter(contact, "contact");
            if ((contact instanceof zm3.g) || (contact instanceof zm3.p)) {
                return;
            }
            if (!(contact instanceof zm3.l)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.T2(new i0a.a(bVar, contact, continuation, 0), new yi5.b(27));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new h0(2, this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.I;
    }
}
