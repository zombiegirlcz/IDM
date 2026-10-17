package ly7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteContract$CoPaySelection;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import ry7.q;
import rz7.l;
import rz7.n;
import te0.w;
import zhm.d0;
import zhm.h0;
import zw7.c0;
import zw7.h1;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends ori.a implements a, n, rz7.j, rz7.h, rz7.f, rz7.b, rz7.d, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f200728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz7.j f200729c;
    public final /* synthetic */ rz7.h d;
    public final /* synthetic */ rz7.f e;
    public final /* synthetic */ rz7.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rz7.d f200730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f200731h;
    public final fx7.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ifm.b f200732j;
    public final sz7.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f200733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fx7.f f200734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fx7.l f200735n;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l08.a f200736p;

    public h(n petTypeFieldPresentationModel, rz7.j petNameFieldPresentationModel, rz7.h petGenderFieldPresentationModel, rz7.f petDobFieldPresentationModel, rz7.b petAmountFieldPresentationModel, rz7.d petBreeFieldPresentationModel, l petSterilizedFieldPresentationModel, fx7.a petAnalyticsInteractor, ifm.b flowDisposable, sz7.b amountDataFactory, c state, fx7.f petInteractor, fx7.l quoteInteractor, q editQuotesConfigurator, l08.a petLocalDocumentProvider) {
        Intrinsics.checkNotNullParameter(petTypeFieldPresentationModel, "petTypeFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petNameFieldPresentationModel, "petNameFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petGenderFieldPresentationModel, "petGenderFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petDobFieldPresentationModel, "petDobFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petAmountFieldPresentationModel, "petAmountFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petBreeFieldPresentationModel, "petBreeFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petSterilizedFieldPresentationModel, "petSterilizedFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(amountDataFactory, "amountDataFactory");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(editQuotesConfigurator, "editQuotesConfigurator");
        Intrinsics.checkNotNullParameter(petLocalDocumentProvider, "petLocalDocumentProvider");
        this.f200728b = petTypeFieldPresentationModel;
        this.f200729c = petNameFieldPresentationModel;
        this.d = petGenderFieldPresentationModel;
        this.e = petDobFieldPresentationModel;
        this.f = petAmountFieldPresentationModel;
        this.f200730g = petBreeFieldPresentationModel;
        this.f200731h = petSterilizedFieldPresentationModel;
        this.i = petAnalyticsInteractor;
        this.f200732j = flowDisposable;
        this.k = amountDataFactory;
        this.f200733l = state;
        this.f200734m = petInteractor;
        this.f200735n = quoteInteractor;
        this.o = editQuotesConfigurator;
        this.f200736p = petLocalDocumentProvider;
    }

    @Override // rz7.b
    public final r A1() {
        return this.f.A1();
    }

    @Override // rz7.d
    public final r D() {
        return this.f200730g.D();
    }

    @Override // rz7.j
    public final r D2() {
        return this.f200729c.D2();
    }

    @Override // rz7.d
    public final efm.b E0(PetBreedDetailsContract$BreedParam breed) {
        Intrinsics.checkNotNullParameter(breed, "breed");
        return this.f200730g.E0(breed);
    }

    @Override // rz7.n
    public final r F() {
        return this.f200728b.F();
    }

    @Override // rz7.n
    public final efm.b I(c0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f200728b.I(type);
    }

    @Override // rz7.b
    public final r K() {
        return this.f.K();
    }

    @Override // rz7.f
    public final r M() {
        return this.e.M();
    }

    @Override // rz7.h
    public final efm.b M1(z gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        return this.d.M1(gender);
    }

    @Override // rz7.h
    public final r O() {
        return this.d.O();
    }

    @Override // rz7.d
    public final r O1() {
        return this.f200730g.O1();
    }

    @Override // rz7.h
    public final r R1() {
        return this.d.R1();
    }

    @Override // rz7.f
    public final r S() {
        return this.e.S();
    }

    @Override // rz7.j
    public final r Y() {
        return this.f200729c.Y();
    }

    @Override // rz7.l
    public final efm.b Z1(boolean z) {
        return this.f200731h.Z1(z);
    }

    @Override // rz7.l
    public final r f0() {
        return this.f200731h.f0();
    }

    @Override // rz7.n
    public final r g0() {
        return this.f200728b.g0();
    }

    @Override // ori.a, nri.a
    public final void i3() {
        efm.b bVarSwitchMapCompletable = ue0.e.q(m70.a.g(l3(), null, new lxi.g(5), 1), h0.f322473a).switchMapCompletable(new lxb.c(14, new d(this, 2)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        b0 b0Var = new b0(new lak.l(new BreadcrumbException(), 28), (byte) 0);
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, b0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new g(0, f.f200725a), e.f200724a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f200732j, hVarW);
    }

    public final h1 j3(ArrayList quotes, PetEditQuoteContract$CoPaySelection selectedCoPay) {
        Object next;
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(selectedCoPay, "selectedCoPay");
        this.o.getClass();
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(selectedCoPay, "selectedCoPay");
        List listA = q.a(quotes);
        if (quotes.size() <= 1) {
            return (h1) d0.d0(quotes);
        }
        Iterator it8 = quotes.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h1) next).d, listA.get(selectedCoPay.f76302a))) {
                break;
            }
        }
        return (h1) next;
    }

    public final ufm.i k3() {
        efm.d0 d0VarFirstOrError = this.f200728b.F().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        efm.d0 d0VarFirstOrError2 = this.f200729c.Y().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        efm.d0 d0VarFirstOrError3 = this.d.R1().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError3, "firstOrError(...)");
        rz7.d dVar = this.f200730g;
        efm.d0 d0VarFirstOrError4 = dVar.t2().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError4, "firstOrError(...)");
        efm.d0 d0VarFirstOrError5 = dVar.o().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError5, "firstOrError(...)");
        efm.d0 d0VarFirstOrError6 = this.e.M().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError6, "firstOrError(...)");
        efm.d0 d0VarFirstOrError7 = this.f.A1().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError7, "firstOrError(...)");
        efm.d0 d0VarFirstOrError8 = this.f200731h.f0().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError8, "firstOrError(...)");
        ufm.i iVar = new ufm.i(w.L0(d0VarFirstOrError, d0VarFirstOrError2, d0VarFirstOrError3, d0VarFirstOrError4, d0VarFirstOrError5, d0VarFirstOrError6, d0VarFirstOrError7, d0VarFirstOrError8), new lxb.c(13, new d(this, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final r l3() {
        sfm.b bVar = new sfm.b(w.N(((k) this.f200733l).w0()), new lxb.c(15, new d(this, 3)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final sfm.b m3() {
        sfm.b bVar = new sfm.b(w.H0(w.N(((k) this.f200733l).w0()), k3()), new lxb.c(12, new d(this, 0)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    @Override // rz7.d
    public final r o() {
        return this.f200730g.o();
    }

    @Override // rz7.j
    public final efm.b r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f200729c.r(name);
    }

    @Override // rz7.d
    public final efm.b r2(zw7.h type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f200730g.r2(type);
    }

    @Override // rz7.d
    public final r t2() {
        return this.f200730g.t2();
    }

    @Override // rz7.f
    public final efm.b u(DOBInputData date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return this.e.u(date);
    }

    @Override // rz7.h
    public final r v() {
        return this.d.v();
    }

    @Override // rz7.b
    public final efm.b w2(AmountData amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return this.f.w2(amount);
    }
}
