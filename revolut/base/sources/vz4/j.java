package vz4;

import aa0.h1;
import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlowExitDialog;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import efm.d0;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qc0.j0;
import te0.s;
import te0.w;
import vf0.q;
import xl2.r;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends ori.a implements a, qc0.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f293392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f293393c;
    public final rz4.b d;
    public final b e;

    public j(j0 backendFlowPresentationModel, ifm.b flowDisposable, rz4.b creditInteractor, b state) {
        Intrinsics.checkNotNullParameter(backendFlowPresentationModel, "backendFlowPresentationModel");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(creditInteractor, "creditInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f293392b = backendFlowPresentationModel;
        this.f293393c = flowDisposable;
        this.d = creditInteractor;
        this.e = state;
    }

    @Override // zc0.g
    public final pfm.a A2(String id10, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.A2(id10, localDate);
    }

    @Override // zc0.g
    public final ihm.f B2() {
        return this.f293392b.X;
    }

    @Override // zc0.g
    public final pfm.a C2(String id10, String amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return this.f293392b.C2(id10, amount);
    }

    @Override // zc0.g
    public final ihm.f G2() {
        return this.f293392b.W;
    }

    @Override // zc0.g
    public final pfm.a H(String itemId, CurrencySelectionOption currencyOption) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currencyOption, "currencyOption");
        return this.f293392b.H(itemId, currencyOption);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b H0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f293392b.H0(query);
    }

    @Override // zc0.g
    public final void I1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f293392b.I1(id10);
    }

    @Override // zc0.g
    public final pfm.a K2(int i, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.K2(i, id10);
    }

    @Override // zc0.g
    public final String L0() {
        this.f293392b.getClass();
        return null;
    }

    @Override // zc0.g
    public final pfm.a N(SelectedTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return this.f293392b.N(transaction);
    }

    @Override // zc0.g
    public final pfm.a N0(String itemId, r entity) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f293392b.N0(itemId, entity);
    }

    @Override // qc0.h
    public final pfm.a N1(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return this.f293392b.N1(address);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 N2() {
        return this.f293392b.e.N2();
    }

    @Override // qc0.h
    public final pfm.a P2(String itemId, BackendFlowUploadResult result) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(result, "result");
        return this.f293392b.P2(itemId, result);
    }

    @Override // zc0.g
    public final void Q() {
        this.f293392b.Q();
    }

    @Override // qc0.h
    public final pfm.a Q0(DocumentItem documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        return this.f293392b.Q0(documentItem);
    }

    @Override // zc0.g
    public final pfm.a Q2(String id10, String originalText) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        return this.f293392b.Q2(id10, originalText);
    }

    @Override // zc0.g
    public final v60.i R() {
        return this.f293392b.R();
    }

    @Override // zc0.g
    public final pfm.a R0(String itemId, String cardId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return this.f293392b.R0(itemId, cardId);
    }

    @Override // f5l.a
    public final vkm.d S1() {
        return this.f293392b.S1();
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b T0() {
        this.f293392b.T0();
        return pfm.m.f235744a;
    }

    @Override // zc0.g
    public final void U1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f293392b.U1(id10);
    }

    @Override // zc0.g
    public final pfm.a V1(String id10, h1 value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f293392b.V1(id10, value);
    }

    @Override // zc0.g
    public final pfm.a W1(String inputItemId, String editableListItemId) {
        Intrinsics.checkNotNullParameter(inputItemId, "inputItemId");
        Intrinsics.checkNotNullParameter(editableListItemId, "editableListItemId");
        return this.f293392b.W1(inputItemId, editableListItemId);
    }

    @Override // zc0.g
    public final pfm.a X0(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f293392b.X0(id10, value);
    }

    @Override // zc0.g
    public final efm.r X2() {
        return this.f293392b.X2();
    }

    @Override // zc0.g
    public final pfm.a Y0(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.Y0(id10, z);
    }

    @Override // zc0.g
    public final pfm.a a0(xu.i media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.f293392b.a0(media);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.a2(id10);
    }

    @Override // zc0.g
    public final String b() {
        return this.f293392b.b();
    }

    @Override // zc0.g
    public final pfm.a b1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.b1(id10);
    }

    @Override // zc0.g
    public final pfm.a b2(String id10, LocalDate value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f293392b.b2(id10, value);
    }

    @Override // zc0.g
    public final pfm.f b3(List medias) {
        Intrinsics.checkNotNullParameter(medias, "medias");
        return this.f293392b.b3(medias);
    }

    @Override // qc0.h
    public final pfm.a c0(PermissionFlowResult permissionData) {
        Intrinsics.checkNotNullParameter(permissionData, "permissionData");
        return this.f293392b.c0(permissionData);
    }

    @Override // zc0.g
    public final pfm.a c2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.c2(id10);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 d1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.d1(id10);
    }

    @Override // zc0.g
    public final pfm.a d3(String id10, String number) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        return this.f293392b.d3(id10, number);
    }

    @Override // zc0.g
    public final String e() {
        return this.f293392b.e();
    }

    @Override // zc0.g
    public final FormScreen e0() {
        return this.f293392b.e0();
    }

    @Override // zc0.g
    public final void e1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f293392b.e1(id10);
    }

    @Override // zc0.g
    public final pfm.a e3(String itemId, FiltersInputItem.Option option) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(option, "option");
        return this.f293392b.e3(itemId, option);
    }

    @Override // zc0.g
    public final efm.r f1() {
        return this.f293392b.f1();
    }

    @Override // zc0.g
    public final pfm.a f3(String itemId, ChipsSelectionItem.Chip chip) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(chip, "chip");
        return this.f293392b.f3(itemId, chip);
    }

    @Override // zc0.g
    public final String g() {
        return this.f293392b.g();
    }

    @Override // zc0.g
    public final pfm.h h2() {
        return this.f293392b.h2();
    }

    @Override // zc0.g
    public final void h3(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f293392b.h3(id10);
    }

    @Override // zc0.g
    public final String i() {
        return this.f293392b.i();
    }

    @Override // ori.a, nri.a
    public final void i3() {
        m mVar = (m) this.e;
        efm.r rVarC = mVar.e.getValue(mVar, m.f[2]).c(s.f270018a);
        i iVar = i.f;
        efm.b bVarSwitchMapCompletable = rVarC.filter(new q(10)).switchMapCompletable(new c(new d(this, 0), 1));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        o9h.d dVar = new o9h.d(24, new vx5.r(new BreadcrumbException(), 10));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new nw8.d(16, f.f293389a), e.f293388a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f293393c, hVarW);
        efm.b bVarFlatMapCompletable = m70.a.g(this.d.b((String) mVar.b0().get(), w4l.h.f294642c), null, new vv7.l(18), 1).flatMapCompletable(new c(new d(this, 1), 2));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        o9h.d dVar2 = new o9h.d(24, new vx5.r(new BreadcrumbException(), 11));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar2.w(new nw8.d(16, h.f293391a), g.f293390a), "subscribe(...)");
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r j() {
        return this.f293392b.e.j();
    }

    @Override // zc0.g
    public final pfm.a j2(SelectionItem item, String optionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f293392b.j2(item, optionId);
    }

    public final efm.r j3(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        efm.r rVarOnErrorReturn = new sfm.b(this.d.a((String) ((m) this.e).b0().get(), applicationId), new vx9.w(new vz1.h(1), 29), 1).onErrorReturn(new c(new vz1.h(2), 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
        return rVarOnErrorReturn;
    }

    @Override // zc0.g
    public final void k0() {
        this.f293392b.k0();
    }

    @Override // qc0.h
    public final ufm.c l0(int i) {
        return this.f293392b.l0(i);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r m() {
        return this.f293392b.e.m();
    }

    @Override // zc0.g
    public final pfm.a m1(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.m1(id10, str);
    }

    @Override // zc0.g
    public final efm.r n() {
        return this.f293392b.n();
    }

    @Override // qc0.h
    public final pfm.h n0(BackendFlowExitDialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        return this.f293392b.n0(dialog);
    }

    @Override // zc0.g
    public final efm.r n1() {
        return this.f293392b.n1();
    }

    @Override // zc0.g
    public final pfm.a n2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.n2(id10);
    }

    @Override // qc0.h
    public final efm.r o1() {
        return this.f293392b.o1();
    }

    @Override // zc0.g
    public final pfm.a p0(String id10, ba0.j value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f293392b.p0(id10, value);
    }

    @Override // qc0.h
    public final pfm.a p1() {
        return this.f293392b.p1();
    }

    @Override // zc0.g
    public final efm.r q2() {
        return this.f293392b.q2();
    }

    @Override // zc0.g
    public final pfm.a s(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f293392b.s(screen);
    }

    @Override // zc0.g
    public final pfm.a t(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.t(id10, z);
    }

    @Override // zc0.g
    public final void t0(long j2) {
        this.f293392b.t0(j2);
    }

    @Override // zc0.g
    public final boolean u2() {
        return this.f293392b.u2();
    }

    @Override // zc0.g
    public final pfm.a v1(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return this.f293392b.v1(id10, text);
    }

    @Override // zc0.g
    public final pfm.a w(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.w(id10);
    }

    @Override // zc0.g
    public final sfm.b w0() {
        return this.f293392b.w0();
    }

    @Override // zc0.g
    public final pfm.a x0(String id10, LocalDate value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f293392b.x0(id10, value);
    }

    @Override // qc0.h
    public final pfm.a y0(Action.Submit action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f293392b.y0(action);
    }

    @Override // zc0.g
    public final pfm.a y2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f293392b.y2(id10);
    }

    @Override // zc0.g
    public final void z0() {
        this.f293392b.z0();
    }
}
