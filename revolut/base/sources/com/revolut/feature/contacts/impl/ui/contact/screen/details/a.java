package com.revolut.feature.contacts.impl.ui.contact.screen.details;

import aii.m;
import b6k.e;
import cli.n;
import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import dm3.a0;
import dm3.j;
import dm3.p;
import dm3.r;
import dm3.x;
import dm3.z;
import gck.v;
import go.g;
import hm3.d;
import hm3.e;
import hm3.f;
import im3.c;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.l0;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qz0.b;
import r10.t;
import r10.w;
import retrofit2.HttpException;
import w4l.i;
import wl3.u;
import yji.l;
import zhm.f0;
import zhm.h0;
import zm3.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements j {

    @NotNull
    public static final p Companion = new p();
    public final w A;
    public final f B;
    public final b C;
    public final d2a.a D;
    public final c E;
    public final nhf.a F;
    public final y G;
    public final com.revolut.kompot.navigable.vc.modal.a H;
    public final ContactDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f66007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wif.a f66008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.a f66009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f66010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f66011t;
    public final hm3.a u;
    public final t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sf0.h f66012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final im3.d f66013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c70.a f66014y;
    public final z1l.d z;

    public a(n stateMapper, ContactDetailsScreenContract$InputData inputData, whf.b transactionsContentProvider, wif.a userFeaturesChecker, r10.a analyticsInteractor, u revolutContactPaymentsSettingsInteractor, d contactTransactionsFilterInteractor, hm3.a contactDetailsInteractor, t contactDetailActionsInteractor, sf0.h serverErrorParser, im3.d contactDetailsDialogModelProvider, c70.a clipboard, z1l.d contactBlockAvailabilityProvider, w contactDetailGiftPlanInteractor, f planGiftingControllerModelExtension, dl3.f contactsMapper, b contactImagesRepository, d2a.a wallpaperPickerControllerModelExtension, c deleteChatDialogModelProvider, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(contactTransactionsFilterInteractor, "contactTransactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(contactDetailsInteractor, "contactDetailsInteractor");
        Intrinsics.checkNotNullParameter(contactDetailActionsInteractor, "contactDetailActionsInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(contactDetailsDialogModelProvider, "contactDetailsDialogModelProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(contactBlockAvailabilityProvider, "contactBlockAvailabilityProvider");
        Intrinsics.checkNotNullParameter(contactDetailGiftPlanInteractor, "contactDetailGiftPlanInteractor");
        Intrinsics.checkNotNullParameter(planGiftingControllerModelExtension, "planGiftingControllerModelExtension");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(contactImagesRepository, "contactImagesRepository");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(deleteChatDialogModelProvider, "deleteChatDialogModelProvider");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.o = inputData;
        this.f66007p = transactionsContentProvider;
        this.f66008q = userFeaturesChecker;
        this.f66009r = analyticsInteractor;
        this.f66010s = revolutContactPaymentsSettingsInteractor;
        this.f66011t = contactTransactionsFilterInteractor;
        this.u = contactDetailsInteractor;
        this.v = contactDetailActionsInteractor;
        this.f66012w = serverErrorParser;
        this.f66013x = contactDetailsDialogModelProvider;
        this.f66014y = clipboard;
        this.z = contactBlockAvailabilityProvider;
        this.A = contactDetailGiftPlanInteractor;
        this.B = planGiftingControllerModelExtension;
        this.C = contactImagesRepository;
        this.D = wallpaperPickerControllerModelExtension;
        this.E = deleteChatDialogModelProvider;
        this.F = unitedWalletInteractor;
        zm3.a aVar = inputData.f66002a;
        AvatarModel.Default defaultB = dl3.f.b(contactsMapper, aVar, dl3.d.f115697a, 4);
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        e eVar = new e(null, null);
        q.Companion.getClass();
        this.G = mra.d.b(this, new dm3.e(aVar, defaultB, data, data2, data3, data4, data5, false, eVar, false, false, k71.p.a()), stateMapper, null, false, 12);
        this.H = hx7.e.a(this, new dgj.h(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        Flow gVar;
        Flow gVar2;
        l.a1(this, rd0.e.b(this.f66008q.d(wog.a.PRICING_PLANS)), null, null, new r(this, null), 3);
        ContactDetailsScreenContract$InputData contactDetailsScreenContract$InputData = this.o;
        zm3.a aVar = contactDetailsScreenContract$InputData.f66002a;
        this.f66011t.getClass();
        l.a1(this, rd0.e.b(whf.b.a(this.f66007p, d.b(aVar), null, null, null, 14)), null, null, new z(this, null), 3);
        zm3.a contact = contactDetailsScreenContract$InputData.f66002a;
        hm3.c cVar = (hm3.c) this.u;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof zm3.l) {
            gVar = nim.a.v(rd0.e.b(xua.a.a(cVar.f153526a, null, 3)), new v(contact, 1));
        } else {
            if (!(contact instanceof zm3.e) && !(contact instanceof zm3.f) && !(contact instanceof zm3.n) && !(contact instanceof o)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        l.a1(this, gVar, null, null, new x(this, null), 3);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        l.a1(this, nim.a.v(rd0.e.b(((mr9.a) cVar.f153527b).i(false)), new hm3.b(cVar, cVar.a(contact), 0)), null, null, new dm3.t(this, null), 3);
        l.a1(this, rd0.e.b(contact instanceof zm3.l ? this.f66010s.e((zm3.l) contact) : zi0.c.j(f0.f322471a)), null, null, new dm3.v(this, null), 3);
        z1l.d dVar = this.z;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        l.a1(this, ((contact instanceof zm3.l) && hx7.q.N((zm3.l) contact)) ? mo3.a.f(((nj8.n) ((hj8.a) dVar.f318897a)).l(w4l.h.f294642c), new zk1.p(12), new ymk.y(contact, 17), new zk1.p(13)) : new g(Boolean.TRUE, 2), null, null, new dm3.u(this, null), 3);
        w wVar = this.A;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (((tbk.b) wVar.f250866b).a() && (contact instanceof zm3.l)) {
            t1j.b bVar = (t1j.b) wVar.f250865a;
            String receiverUsername = ((zm3.l) contact).N0();
            Intrinsics.checkNotNullParameter(receiverUsername, "receiverUsername");
            wbk.b bVar2 = (wbk.b) bVar.f267380b;
            Intrinsics.checkNotNullParameter(receiverUsername, "receiverUsername");
            i loadingStrategy = i.f294643c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            gVar2 = nim.a.v(bVar2.f296242c.b(receiverUsername, loadingStrategy), new hhd.n(25));
        } else {
            gVar2 = new g(zi0.c.P(hm3.l.f153536a, false, null, 3), 2);
        }
        l.a1(this, rd0.e.n(gVar2, h0.f322473a), null, null, new dm3.w(this, null), 3);
        l.a1(this, rd0.e.b(((njf.j) this.F).f()), null, null, new a0(this, null), 3);
        ContactImage image = n14.e.l(contact, null, 3);
        xz0.c cVar2 = (xz0.c) this.C;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(image, "image");
        String strB = ((i51.a) cVar2.f309759b).b(image);
        if (strB == null) {
            r6.b.D("ContactImage request cannot be null");
            return;
        }
        String str = image.d;
        if (str == null) {
            str = "";
        }
        com.bumptech.glide.j jVarB = cVar2.b(image, null, new xz0.j(strB, new xz0.h(str)), null, null, true);
        jVarB.S(v8.j.h(jVarB.f26098x, Integer.MIN_VALUE, Integer.MIN_VALUE), null, jVarB, y8.f.f311599a);
    }

    public final void I2(Throwable th10) {
        ServerError serverErrorC = th10 instanceof HttpException ? this.f66012w.c((HttpException) th10) : th10 instanceof ServerErrorException ? ((ServerErrorException) th10).f : null;
        if (serverErrorC == null || serverErrorC.f51362a != 70000) {
            X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
        } else {
            this.f66013x.getClass();
            X1(new y0(null, new l0(new TextLocalisedClause(com.revolut.feature.contacts.impl.R$string.payments_block_user_error_overlapping_group_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.contacts.impl.R$string.payments_block_user_error_overlapping_group_subtitle, null, null, 14), null, null, null, null, false, null, 1020), false, 5));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.H;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }

    @Override // yji.l
    public final aii.n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.f(event, e.a.f153528b)) {
            return super.o2(event);
        }
        C2(dm3.g.f115837a);
        return dm3.q.f115847a;
    }
}
