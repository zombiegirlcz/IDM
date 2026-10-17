package com.revolut.sso.impl.ui.combined_authentication.unified;

import akl.z;
import bjl.p0;
import cjl.q;
import cli.g;
import cli.n;
import cli.y;
import col.c;
import com.revolut.data.model.Data;
import com.revolut.sso.impl.domain.models.Identifier;
import eql.i;
import gkl.o;
import hx7.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q5g.f0;
import qll.e0;
import qll.g0;
import qll.j;
import rqk.b;
import rqk.k;
import vkm.j2;
import x7a.d;
import yji.l;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements j {

    @NotNull
    public static final e0 Companion = new e0();
    public final b A;
    public final c B;
    public final d C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f106434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iy8.b f106435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uil.a f106436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p0 f106437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gnl.a f106438t;
    public final z80.b u;
    public final tll.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gql.a f106439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f106440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f106441y;
    public final jol.b z;

    public a(p bankIdIntentHandler, fkg.a dapIntentHandler, iy8.b uaePassAppAvailabilityChecker, uil.a revolutAccountsManager, p0 revolutSsoDependenciesProvider, gnl.a countriesProvider, z80.b phoneToolsProvider, tll.c identifierValidator, gql.a googleMobileServicesAvailabilityManager, z configurationRepository, i googleSignInControllerModelExtension, jol.b dialogsFactory, b debugMenuNavigationDestination, c passkeysControllerModelExtension, d pickerControllerInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(bankIdIntentHandler, "bankIdIntentHandler");
        Intrinsics.checkNotNullParameter(dapIntentHandler, "dapIntentHandler");
        Intrinsics.checkNotNullParameter(uaePassAppAvailabilityChecker, "uaePassAppAvailabilityChecker");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(countriesProvider, "countriesProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(identifierValidator, "identifierValidator");
        Intrinsics.checkNotNullParameter(googleMobileServicesAvailabilityManager, "googleMobileServicesAvailabilityManager");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(googleSignInControllerModelExtension, "googleSignInControllerModelExtension");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(debugMenuNavigationDestination, "debugMenuNavigationDestination");
        Intrinsics.checkNotNullParameter(passkeysControllerModelExtension, "passkeysControllerModelExtension");
        Intrinsics.checkNotNullParameter(pickerControllerInteractor, "pickerControllerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = bankIdIntentHandler;
        this.f106434p = dapIntentHandler;
        this.f106435q = uaePassAppAvailabilityChecker;
        this.f106436r = revolutAccountsManager;
        this.f106437s = revolutSsoDependenciesProvider;
        this.f106438t = countriesProvider;
        this.u = phoneToolsProvider;
        this.v = identifierValidator;
        this.f106439w = googleMobileServicesAvailabilityManager;
        this.f106440x = configurationRepository;
        this.f106441y = googleSignInControllerModelExtension;
        this.z = dialogsFactory;
        this.A = debugMenuNavigationDestination;
        this.B = passkeysControllerModelExtension;
        this.C = pickerControllerInteractor;
        List<o.b> listA = configurationRepository.a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (o.b bVar : listA) {
            wi0.a aVar = wi0.b.Companion;
            String value = bVar.getValue();
            aVar.getClass();
            arrayList.add(wi0.a.a(value));
        }
        wi0.b bVar2 = arrayList.size() == 1 ? (wi0.b) d0.b0(arrayList) : (wi0.b) v13.d.b(arrayList, this.f106438t.a());
        String strJ = this.u.j(bVar2);
        fj0.b.Companion.getClass();
        Serializable serializableB = fj0.a.b(strJ);
        yhm.o.b(serializableB);
        Identifier.Phone phone = new Identifier.Phone(((fj0.b) serializableB).f135518a, "", bVar2);
        Identifier.Email email = new Identifier.Email("");
        ((k) this.f106437s).getClass();
        q[] elements = {q.PHONE, q.EMAIL, q.GOOGLE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.D = mra.d.b(this, new qll.q(qll.n.f247593a, phone, email, kotlin.collections.d.y0(elements), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.E = e.a(this, new f0(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new g0(this, null), new yi5.b(26));
        boolean zA = this.f106439w.a();
        l.a1(this, this.f106440x.e.c(Unit.f186387a, false), null, null, new qll.f0(this, zA, null), 3);
        if (zA) {
            l.a1(this, ((cki.a) this.f106441y).c3(), null, null, new qc3.c(this, continuation, 22), 3);
        }
    }

    public final void I2(String str) {
        y yVar = this.D;
        ((qll.q) ((j2) yVar.f22677a).getValue()).f247597c.getClass();
        H2(yVar, new pza.d(this, 22, Identifier.Email.a(str), str));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // cli.z
    public final g getState() {
        return this.D;
    }
}
