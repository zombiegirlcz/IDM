package a05;

import aa0.b0;
import aa0.h1;
import ba0.j;
import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
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
import ihm.f;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import qc0.h;
import qc0.j0;
import v60.i;
import xl2.r;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends ori.a implements c05.c, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f129c;

    public b(j0 backendFlowPresentationModel, b0 buttonVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(backendFlowPresentationModel, "backendFlowPresentationModel");
        Intrinsics.checkNotNullParameter(buttonVisibilityInteractor, "buttonVisibilityInteractor");
        this.f128b = backendFlowPresentationModel;
        this.f129c = buttonVisibilityInteractor;
    }

    @Override // zc0.g
    public final pfm.a A2(String id10, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.A2(id10, localDate);
    }

    @Override // zc0.g
    public final f B2() {
        return this.f128b.X;
    }

    @Override // zc0.g
    public final pfm.a C2(String id10, String amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return this.f128b.C2(id10, amount);
    }

    @Override // zc0.g
    public final f G2() {
        return this.f128b.W;
    }

    @Override // zc0.g
    public final pfm.a H(String itemId, CurrencySelectionOption currencyOption) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currencyOption, "currencyOption");
        return this.f128b.H(itemId, currencyOption);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b H0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f128b.H0(query);
    }

    @Override // zc0.g
    public final void I1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f128b.I1(id10);
    }

    @Override // zc0.g
    public final pfm.a K2(int i, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.K2(i, id10);
    }

    @Override // zc0.g
    public final String L0() {
        this.f128b.getClass();
        return null;
    }

    @Override // zc0.g
    public final pfm.a N(SelectedTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return this.f128b.N(transaction);
    }

    @Override // zc0.g
    public final pfm.a N0(String itemId, r entity) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return this.f128b.N0(itemId, entity);
    }

    @Override // qc0.h
    public final pfm.a N1(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return this.f128b.N1(address);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 N2() {
        return this.f128b.e.N2();
    }

    @Override // qc0.h
    public final pfm.a P2(String itemId, BackendFlowUploadResult result) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(result, "result");
        return this.f128b.P2(itemId, result);
    }

    @Override // zc0.g
    public final void Q() {
        this.f128b.Q();
    }

    @Override // qc0.h
    public final pfm.a Q0(DocumentItem documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        return this.f128b.Q0(documentItem);
    }

    @Override // zc0.g
    public final pfm.a Q2(String id10, String originalText) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        return this.f128b.Q2(id10, originalText);
    }

    @Override // zc0.g
    public final i R() {
        return this.f128b.R();
    }

    @Override // zc0.g
    public final pfm.a R0(String itemId, String cardId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return this.f128b.R0(itemId, cardId);
    }

    @Override // f5l.a
    public final vkm.d S1() {
        return this.f128b.S1();
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b T0() {
        this.f128b.T0();
        return m.f235744a;
    }

    @Override // zc0.g
    public final void U1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f128b.U1(id10);
    }

    @Override // zc0.g
    public final pfm.a V1(String id10, h1 value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f128b.V1(id10, value);
    }

    @Override // zc0.g
    public final pfm.a W1(String inputItemId, String editableListItemId) {
        Intrinsics.checkNotNullParameter(inputItemId, "inputItemId");
        Intrinsics.checkNotNullParameter(editableListItemId, "editableListItemId");
        return this.f128b.W1(inputItemId, editableListItemId);
    }

    @Override // zc0.g
    public final pfm.a X0(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f128b.X0(id10, value);
    }

    @Override // zc0.g
    public final efm.r X2() {
        efm.r map = this.f128b.o1().map(new a(new a0.c(this, 1), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // zc0.g
    public final pfm.a Y0(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.Y0(id10, z);
    }

    @Override // zc0.g
    public final pfm.a a0(xu.i media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.f128b.a0(media);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.a2(id10);
    }

    @Override // zc0.g
    public final String b() {
        return this.f128b.b();
    }

    @Override // zc0.g
    public final pfm.a b1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.b1(id10);
    }

    @Override // zc0.g
    public final pfm.a b2(String id10, LocalDate value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f128b.b2(id10, value);
    }

    @Override // zc0.g
    public final pfm.f b3(List medias) {
        Intrinsics.checkNotNullParameter(medias, "medias");
        return this.f128b.b3(medias);
    }

    @Override // qc0.h
    public final pfm.a c0(PermissionFlowResult permissionData) {
        Intrinsics.checkNotNullParameter(permissionData, "permissionData");
        return this.f128b.c0(permissionData);
    }

    @Override // zc0.g
    public final pfm.a c2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.c2(id10);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 d1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.d1(id10);
    }

    @Override // zc0.g
    public final pfm.a d3(String id10, String number) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        return this.f128b.d3(id10, number);
    }

    @Override // zc0.g
    public final String e() {
        return this.f128b.e();
    }

    @Override // zc0.g
    public final FormScreen e0() {
        return this.f128b.e0();
    }

    @Override // zc0.g
    public final void e1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f128b.e1(id10);
    }

    @Override // zc0.g
    public final pfm.a e3(String itemId, FiltersInputItem.Option option) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(option, "option");
        return this.f128b.e3(itemId, option);
    }

    @Override // zc0.g
    public final efm.r f1() {
        return this.f128b.f1();
    }

    @Override // zc0.g
    public final pfm.a f3(String itemId, ChipsSelectionItem.Chip chip) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(chip, "chip");
        return this.f128b.f3(itemId, chip);
    }

    @Override // zc0.g
    public final String g() {
        return this.f128b.g();
    }

    @Override // zc0.g
    public final pfm.h h2() {
        return this.f128b.h2();
    }

    @Override // zc0.g
    public final void h3(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f128b.h3(id10);
    }

    @Override // zc0.g
    public final String i() {
        return this.f128b.i();
    }

    @Override // nri.a, e0m.d
    public final void init() {
        super.init();
        this.f128b.init();
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r j() {
        return this.f128b.e.j();
    }

    @Override // zc0.g
    public final pfm.a j2(SelectionItem item, String optionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f128b.j2(item, optionId);
    }

    @Override // zc0.g
    public final void k0() {
        this.f128b.k0();
    }

    @Override // qc0.h
    public final ufm.c l0(int i) {
        return this.f128b.l0(i);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r m() {
        return this.f128b.e.m();
    }

    @Override // zc0.g
    public final pfm.a m1(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.m1(id10, str);
    }

    @Override // zc0.g
    public final efm.r n() {
        return this.f128b.n();
    }

    @Override // qc0.h
    public final pfm.h n0(BackendFlowExitDialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        return this.f128b.n0(dialog);
    }

    @Override // zc0.g
    public final efm.r n1() {
        return this.f128b.n1();
    }

    @Override // zc0.g
    public final pfm.a n2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.n2(id10);
    }

    @Override // qc0.h
    public final efm.r o1() {
        return this.f128b.o1();
    }

    @Override // zc0.g
    public final pfm.a p0(String id10, j value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f128b.p0(id10, value);
    }

    @Override // qc0.h
    public final pfm.a p1() {
        return this.f128b.p1();
    }

    @Override // zc0.g
    public final efm.r q2() {
        return this.f128b.q2();
    }

    @Override // zc0.g
    public final pfm.a s(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f128b.s(screen);
    }

    @Override // zc0.g
    public final pfm.a t(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.t(id10, z);
    }

    @Override // zc0.g
    public final void t0(long j2) {
        this.f128b.t0(j2);
    }

    @Override // zc0.g
    public final boolean u2() {
        return this.f128b.u2();
    }

    @Override // zc0.g
    public final pfm.a v1(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return this.f128b.v1(id10, text);
    }

    @Override // zc0.g
    public final pfm.a w(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.w(id10);
    }

    @Override // zc0.g
    public final sfm.b w0() {
        return this.f128b.w0();
    }

    @Override // zc0.g
    public final pfm.a x0(String id10, LocalDate value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f128b.x0(id10, value);
    }

    @Override // qc0.h
    public final pfm.a y0(Action.Submit action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f128b.y0(action);
    }

    @Override // zc0.g
    public final pfm.a y2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f128b.y2(id10);
    }

    @Override // zc0.g
    public final void z0() {
        this.f128b.z0();
    }
}
