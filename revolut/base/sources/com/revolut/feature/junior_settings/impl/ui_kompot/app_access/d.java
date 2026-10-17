package com.revolut.feature.junior_settings.impl.ui_kompot.app_access;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import d4f.m;
import do8.o;
import do8.s;
import do8.u;
import do8.w;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import w4l.i;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements do8.h {

    @NotNull
    public static final o Companion = new o();
    public final JuniorAppAccessControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f77287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zq.a f77288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fo8.a f77289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f77290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nn8.a f77291t;
    public final jl8.c u;
    public final kgm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f77292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f77293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77294y;

    public d(JuniorAppAccessControllerContract$InputData inputData, hj8.a profileInteractor, zq.a remoteLoginInteractor, fo8.a devToolsAcceptInvitationExtension, j60.a bottomDialogExtension, nn8.a dataConsentsExtension, jl8.c juniorInvitationProductArticleFactory, kgm.c juniorDeviceInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(profileInteractor, "profileInteractor");
        Intrinsics.checkNotNullParameter(remoteLoginInteractor, "remoteLoginInteractor");
        Intrinsics.checkNotNullParameter(devToolsAcceptInvitationExtension, "devToolsAcceptInvitationExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dataConsentsExtension, "dataConsentsExtension");
        Intrinsics.checkNotNullParameter(juniorInvitationProductArticleFactory, "juniorInvitationProductArticleFactory");
        Intrinsics.checkNotNullParameter(juniorDeviceInteractor, "juniorDeviceInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f77287p = profileInteractor;
        this.f77288q = remoteLoginInteractor;
        this.f77289r = devToolsAcceptInvitationExtension;
        this.f77290s = bottomDialogExtension;
        this.f77291t = dataConsentsExtension;
        this.u = juniorInvitationProductArticleFactory;
        this.v = juniorDeviceInteractor;
        this.f77292w = new vii.b(i.f294643c);
        this.f77293x = mra.d.b(this, new do8.i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, new w(), false, 8);
        this.f77294y = e.a(this, new dgj.h(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData = this.o;
        akg.n nVarA = hj8.a.a(this.f77287p, juniorAppAccessControllerContract$InputData.f77277a, w4l.h.f294642c);
        Continuation continuation = null;
        s sVar = new s(1, this, continuation);
        vii.b bVar = this.f77292w;
        l.a1(this, yh5.b.d(nVarA, q.Q(bVar, sVar)), null, null, new u(1, this, continuation), 3);
        int i = 0;
        l.a1(this, q.Q(bVar, new s(i, this, continuation)), null, null, new u(i, this, continuation), 3);
        l.a1(this, this.f77291t.Z2(juniorAppAccessControllerContract$InputData.f77277a), new m(2, 6, continuation), null, new b(this, null), 2);
    }

    public final void I2() {
        JuniorBankingProfile juniorBankingProfile;
        Object content;
        try {
            content = ((do8.i) ((j2) this.f77293x.f22677a).getValue()).f116451a.getContent();
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            juniorBankingProfile = null;
        }
        if (content == null) {
            throw new IllegalArgumentException(("Can't start create phone number flow as junior profile is empty for " + f0.U0(4, this.o.f77277a)).toString());
        }
        juniorBankingProfile = (JuniorBankingProfile) content;
        if (juniorBankingProfile == null) {
            return;
        }
        C1(new JuniorCreatePhoneNumberDestination(new JuniorCreatePhoneNumberDestination.InputData(juniorBankingProfile)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77294y;
    }

    @Override // cli.z
    public final g getState() {
        return this.f77293x;
    }
}
