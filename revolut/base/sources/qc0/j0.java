package qc0;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
import com.revolut.core.backend_flow.ui.BackendFlowChooserConfigurationType;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowExitDialog;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.ChooserItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.backend_flow.domain.models.SelectedTransaction;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q97.h2;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 extends ori.a implements h, zc0.g, com.revolut.feature.chooser.c {
    public final aa0.s A;
    public final aa0.f B;
    public final aa0.g C;
    public final aa0.u D;
    public final aa0.g0 E;
    public final aa0.q F;
    public final aa0.s G;
    public final aa0.k H;
    public final aa0.a I;
    public final aa0.d0 J;
    public final eli.j K;
    public final ca0.a L;
    public final bd0.d M;
    public final yc0.f N;
    public final ad0.a O;
    public final aa0.o P;
    public final dd0.c Q;
    public final cd0.d R;
    public final tm.g S;
    public ofm.h T;
    public final v60.i U;
    public final ihm.b V;
    public final ihm.f W;
    public final ihm.f X;
    public final ihm.f Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f244440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wl2.f f244441c;
    public final ifm.b d;
    public final com.revolut.feature.chooser.a e;
    public final yc0.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aa0.f0 f244442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aa0.z f244443h;
    public final aa0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aa0.c0 f244444j;
    public final aa0.k0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aa0.i0 f244445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final aa0.b0 f244446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aa0.h f244447n;
    public final aa0.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aa0.d f244448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aa0.p f244449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aa0.l f244450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aa0.m f244451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aa0.a0 f244452t;
    public final aa0.i1 u;
    public final aa0.l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final aa0.e0 f244453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final aa0.j0 f244454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final aa0.j f244455y;
    public final aa0.t z;

    public j0(k state, wl2.f backendFlowInteractor, ifm.b compositeDisposable, com.revolut.feature.chooser.a chooserPresentationModel, yc0.k datePickerDialogMapper, aa0.f0 radioButtonsInteractor, aa0.z moneyInputInteractor, aa0.b checkboxInteractor, aa0.c0 noneApplyInteractor, aa0.k0 textInputInteractor, aa0.i0 signatureInputInteractor, aa0.b0 buttonVisibilityInteractor, aa0.h chooserInteractor, aa0.n documentInteractor, aa0.d cardInteractor, aa0.p dualChoiceSelectionInteractor, aa0.l dateInputInteractor, aa0.m dayPickerInteractor, aa0.a0 monthPickerInteractor, aa0.i1 yearPickerInteractor, aa0.l0 timeInputInteractor, aa0.e0 phoneInputInteractor, aa0.j0 ratingInputInteractor, aa0.j countrySelectionInteractor, aa0.t fileInputInteractor, dcl.q transitionsInteractor, aa0.s transactionSelectionInteractor, aa0.f cardSelectionInteractor, aa0.g chipSelectionInteractor, aa0.u filtersSelectionInteractor, aa0.g0 selectionInteractor, aa0.q editableListInputInteractor, aa0.s entitiesSelectionInteractor, aa0.k currencySelectionInteractor, aa0.a addressInputInteractor, aa0.d0 permissionInputInteractor, com.google.firebase.messaging.t actionDelegateFactory, eli.j twoFaErrorHandler, ca0.a twoFaCodeResolver, bd0.d searchDetector, yc0.f iconMapper, ad0.a actionsMapper, aa0.o dropDownInteractor, dd0.c textItemValueValidator, cd0.d validationRequestHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(backendFlowInteractor, "backendFlowInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chooserPresentationModel, "chooserPresentationModel");
        Intrinsics.checkNotNullParameter(datePickerDialogMapper, "datePickerDialogMapper");
        Intrinsics.checkNotNullParameter(radioButtonsInteractor, "radioButtonsInteractor");
        Intrinsics.checkNotNullParameter(moneyInputInteractor, "moneyInputInteractor");
        Intrinsics.checkNotNullParameter(checkboxInteractor, "checkboxInteractor");
        Intrinsics.checkNotNullParameter(noneApplyInteractor, "noneApplyInteractor");
        Intrinsics.checkNotNullParameter(textInputInteractor, "textInputInteractor");
        Intrinsics.checkNotNullParameter(signatureInputInteractor, "signatureInputInteractor");
        Intrinsics.checkNotNullParameter(buttonVisibilityInteractor, "buttonVisibilityInteractor");
        Intrinsics.checkNotNullParameter(chooserInteractor, "chooserInteractor");
        Intrinsics.checkNotNullParameter(documentInteractor, "documentInteractor");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(dualChoiceSelectionInteractor, "dualChoiceSelectionInteractor");
        Intrinsics.checkNotNullParameter(dateInputInteractor, "dateInputInteractor");
        Intrinsics.checkNotNullParameter(dayPickerInteractor, "dayPickerInteractor");
        Intrinsics.checkNotNullParameter(monthPickerInteractor, "monthPickerInteractor");
        Intrinsics.checkNotNullParameter(yearPickerInteractor, "yearPickerInteractor");
        Intrinsics.checkNotNullParameter(timeInputInteractor, "timeInputInteractor");
        Intrinsics.checkNotNullParameter(phoneInputInteractor, "phoneInputInteractor");
        Intrinsics.checkNotNullParameter(ratingInputInteractor, "ratingInputInteractor");
        Intrinsics.checkNotNullParameter(countrySelectionInteractor, "countrySelectionInteractor");
        Intrinsics.checkNotNullParameter(fileInputInteractor, "fileInputInteractor");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(transactionSelectionInteractor, "transactionSelectionInteractor");
        Intrinsics.checkNotNullParameter(cardSelectionInteractor, "cardSelectionInteractor");
        Intrinsics.checkNotNullParameter(chipSelectionInteractor, "chipSelectionInteractor");
        Intrinsics.checkNotNullParameter(filtersSelectionInteractor, "filtersSelectionInteractor");
        Intrinsics.checkNotNullParameter(selectionInteractor, "selectionInteractor");
        Intrinsics.checkNotNullParameter(editableListInputInteractor, "editableListInputInteractor");
        Intrinsics.checkNotNullParameter(entitiesSelectionInteractor, "entitiesSelectionInteractor");
        Intrinsics.checkNotNullParameter(currencySelectionInteractor, "currencySelectionInteractor");
        Intrinsics.checkNotNullParameter(addressInputInteractor, "addressInputInteractor");
        Intrinsics.checkNotNullParameter(permissionInputInteractor, "permissionInputInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(twoFaCodeResolver, "twoFaCodeResolver");
        Intrinsics.checkNotNullParameter(searchDetector, "searchDetector");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(dropDownInteractor, "dropDownInteractor");
        Intrinsics.checkNotNullParameter(textItemValueValidator, "textItemValueValidator");
        Intrinsics.checkNotNullParameter(validationRequestHandler, "validationRequestHandler");
        this.f244440b = state;
        this.f244441c = backendFlowInteractor;
        this.d = compositeDisposable;
        this.e = chooserPresentationModel;
        this.f = datePickerDialogMapper;
        this.f244442g = radioButtonsInteractor;
        this.f244443h = moneyInputInteractor;
        this.i = checkboxInteractor;
        this.f244444j = noneApplyInteractor;
        this.k = textInputInteractor;
        this.f244445l = signatureInputInteractor;
        this.f244446m = buttonVisibilityInteractor;
        this.f244447n = chooserInteractor;
        this.o = documentInteractor;
        this.f244448p = cardInteractor;
        this.f244449q = dualChoiceSelectionInteractor;
        this.f244450r = dateInputInteractor;
        this.f244451s = dayPickerInteractor;
        this.f244452t = monthPickerInteractor;
        this.u = yearPickerInteractor;
        this.v = timeInputInteractor;
        this.f244453w = phoneInputInteractor;
        this.f244454x = ratingInputInteractor;
        this.f244455y = countrySelectionInteractor;
        this.z = fileInputInteractor;
        this.A = transactionSelectionInteractor;
        this.B = cardSelectionInteractor;
        this.C = chipSelectionInteractor;
        this.D = filtersSelectionInteractor;
        this.E = selectionInteractor;
        this.F = editableListInputInteractor;
        this.G = entitiesSelectionInteractor;
        this.H = currencySelectionInteractor;
        this.I = addressInputInteractor;
        this.J = permissionInputInteractor;
        this.K = twoFaErrorHandler;
        this.L = twoFaCodeResolver;
        this.M = searchDetector;
        this.N = iconMapper;
        this.O = actionsMapper;
        this.P = dropDownInteractor;
        this.Q = textItemValueValidator;
        this.R = validationRequestHandler;
        this.S = actionDelegateFactory.f(new o(this, 2));
        this.U = new v60.i();
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.V = bVarE;
        this.W = v0.a.d("create(...)");
        this.X = v0.a.d("create(...)");
        this.Y = v0.a.d("create(...)");
    }

    public static final efm.r j3(String str, j0 j0Var) {
        efm.r rVarDistinctUntilChanged = ((te0.r) j0Var.f244440b.k()).c(te0.s.f270018a).filter(new u(new qb5.a(10), 12)).map(new u(new qb5.a(11), 13)).flatMapMaybe(new u(new w(str, 0), 14)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public static String k3(Stack stack) {
        String str = (String) zhm.d0.o0(stack);
        if (str == null || str.equals("STEP_RESULT")) {
            return null;
        }
        return str;
    }

    @Override // zc0.g
    public final pfm.a A2(String id10, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(id10, new r(this, id10, localDate, 0));
    }

    @Override // zc0.g
    public final ihm.f B2() {
        return this.X;
    }

    @Override // zc0.g
    public final pfm.a C2(String id10, String amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return v1(id10, amount);
    }

    @Override // zc0.g
    public final ihm.f G2() {
        return this.W;
    }

    @Override // zc0.g
    public final pfm.a H(String itemId, CurrencySelectionOption currencyOption) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currencyOption, "currencyOption");
        return m3(null, new pza.d(this, 6, itemId, currencyOption));
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b H0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.e.H0(query);
    }

    @Override // zc0.g
    public final void I1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f244440b.i().set(id10);
    }

    @Override // zc0.g
    public final pfm.a K2(int i, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(id10, new a94.e(this, id10, i, 9));
    }

    @Override // zc0.g
    public final pfm.a N(SelectedTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return m3(null, new q2g.h(this, transaction, 19));
    }

    @Override // zc0.g
    public final pfm.a N0(String itemId, xl2.r entity) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return m3(itemId, new pza.d(this, 14, itemId, entity));
    }

    @Override // qc0.h
    public final pfm.a N1(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return m3(null, new q2g.h(this, address, 18));
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.d0 N2() {
        return this.e.N2();
    }

    @Override // qc0.h
    public final pfm.a P2(String itemId, BackendFlowUploadResult result) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(result, "result");
        return m3(itemId, new pza.d(this, 11, itemId, result));
    }

    @Override // zc0.g
    public final void Q() {
        this.V.onNext(Boolean.FALSE);
    }

    @Override // qc0.h
    public final pfm.a Q0(DocumentItem documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        return m3(null, new q2g.h(this, documentItem, 23));
    }

    @Override // zc0.g
    public final pfm.a Q2(String id10, String originalText) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        return m3(null, new m(id10, this, originalText, 5));
    }

    @Override // zc0.g
    public final v60.i R() {
        v60.i pollingResult = this.U;
        Intrinsics.checkNotNullExpressionValue(pollingResult, "pollingResult");
        return pollingResult;
    }

    @Override // zc0.g
    public final pfm.a R0(String itemId, String cardId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return m3(itemId, new m(this, itemId, cardId, 7));
    }

    @Override // f5l.a
    public final vkm.d S1() {
        efm.r map = n().map(new h2(19, new qb5.a(13)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b T0() {
        this.e.T0();
        return pfm.m.f235744a;
    }

    @Override // zc0.g
    public final void U1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f244440b.g().set(id10);
    }

    @Override // zc0.g
    public final pfm.a V1(String id10, aa0.h1 value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return m3(id10, new pza.d(this, 9, id10, value));
    }

    @Override // zc0.g
    public final pfm.a W1(String inputItemId, String editableListItemId) {
        Intrinsics.checkNotNullParameter(inputItemId, "inputItemId");
        Intrinsics.checkNotNullParameter(editableListItemId, "editableListItemId");
        return m3(editableListItemId, new m(this, editableListItemId, inputItemId, 6));
    }

    @Override // zc0.g
    public final pfm.a X0(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return m3(id10, new m(this, id10, value, 3));
    }

    @Override // zc0.g
    public final efm.r X2() {
        efm.r map = o1().map(new u(new o(this, 7), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // zc0.g
    public final pfm.a Y0(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(id10, new s(this, id10, z));
    }

    @Override // zc0.g
    public final pfm.a a0(xu.i media) {
        Intrinsics.checkNotNullParameter(media, "media");
        if (!(media instanceof xu.i)) {
            throw new NoWhenBranchMatchedException();
        }
        File file = media.f308850a;
        pfm.a aVarE = m3(null, new q(this, file, 0)).e(new pfm.h(new phc.d(this, file, 12), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        String str = ((BackendFlowChooserConfigurationType) this.f244440b.f0().get()).f51307a;
        FormScreen formScreenE0 = e0();
        Object obj2 = null;
        if (formScreenE0 != null) {
            List list = formScreenE0.f63468b;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof InputItem) {
                    arrayList.add(obj3);
                }
            }
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((InputItem) next).getId(), str)) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (InputItem) obj2;
        }
        if (obj2 instanceof ChooserItem) {
            return m3(str, new m(this, str, id10, 8));
        }
        if (obj2 instanceof DropDownItem) {
            return m3(str, new m(this, str, id10, 9));
        }
        if (obj2 instanceof PhoneInputItem) {
            return new pfm.a(d1(id10), new u(new p(this, str, 5), 22), 4);
        }
        if (obj2 instanceof MoneyInputItem) {
            return m3(str, new m(this, str, id10, 0));
        }
        if (obj2 instanceof CountrySelectionItem) {
            return m3(str, new m(this, str, id10, 1));
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // zc0.g
    public final String b() {
        return (String) this.f244440b.b().get();
    }

    @Override // zc0.g
    public final pfm.a b1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int i = 4;
        pfm.a aVar = new pfm.a(new rfm.o(new pu9.a(this, id10, i)), new h2(24, new o(this, i)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // zc0.g
    public final pfm.a b2(String id10, LocalDate value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return m3(id10, new r(this, id10, value, 2));
    }

    @Override // zc0.g
    public final pfm.f b3(List medias) {
        Intrinsics.checkNotNullParameter(medias, "medias");
        List list = medias;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(a0((xu.i) it8.next()));
        }
        pfm.f fVarI = efm.b.i(arrayList);
        Intrinsics.checkNotNullExpressionValue(fVarI, "concat(...)");
        return fVarI;
    }

    @Override // qc0.h
    public final pfm.a c0(PermissionFlowResult permissionData) {
        Intrinsics.checkNotNullParameter(permissionData, "permissionData");
        return m3(null, new q2g.h(permissionData, this, 21));
    }

    @Override // zc0.g
    public final pfm.a c2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(id10, new p(this, id10, 2));
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.d0 d1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.e.d1(id10);
    }

    @Override // zc0.g
    public final pfm.a d3(String id10, String number) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        return m3(id10, new m(this, id10, number, 4));
    }

    @Override // zc0.g
    public final String e() {
        return (String) this.f244440b.e().get();
    }

    @Override // zc0.g
    public final FormScreen e0() {
        BackendScreen backendScreenL3 = l3();
        if (backendScreenL3 instanceof FormScreen) {
            return (FormScreen) backendScreenL3;
        }
        return null;
    }

    @Override // zc0.g
    public final void e1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f244440b.b().set(id10);
    }

    @Override // zc0.g
    public final pfm.a e3(String itemId, FiltersInputItem.Option option) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(option, "option");
        return m3(itemId, new pza.d(this, 13, itemId, option));
    }

    @Override // zc0.g
    public final efm.r f1() {
        efm.r map = o1().map(new h2(23, new o(this, 5)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // zc0.g
    public final pfm.a f3(String itemId, ChipsSelectionItem.Chip chip) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(chip, "chip");
        return m3(itemId, new pza.d(this, 12, itemId, chip));
    }

    @Override // zc0.g
    public final String g() {
        return (String) this.f244440b.g().get();
    }

    @Override // zc0.g
    public final pfm.h h2() {
        return this.S.a(e.f244410a);
    }

    @Override // zc0.g
    public final void h3(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f244440b.e().set(id10);
    }

    @Override // zc0.g
    public final String i() {
        return (String) this.f244440b.i().get();
    }

    @Override // ori.a, nri.a
    public final void i3() {
        int i = 20;
        efm.b bVarFlatMapCompletable = o70.a.f(this.Y).flatMapCompletable(new h2(i, new o(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        lhi.b bVar = new lhi.b(22, new pzc.g(new BreadcrumbException(), i));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new m3l.d(20, d0.f244409a), c0.f244405a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.d;
        te0.w.j0(bVar2, hVarW);
        k kVar = this.f244440b;
        int i2 = 21;
        efm.r rVarSwitchMap = kVar.r0().c(te0.s.f270018a).switchMap(new h2(i2, new o(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarOnErrorResumeNext = rVarSwitchMap.onErrorResumeNext(new lhi.b(22, new pzc.g(new BreadcrumbException(), i2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m3l.d(20, e0.f244411a), new m3l.d(20, f0.f244415a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        te0.w.j0(bVar2, cVarSubscribe);
        te0.r rVar = (te0.r) kVar.k();
        if (rVar.isInitialized() && ((od0.i) rVar.get()).d()) {
            return;
        }
        pfm.a aVar2 = new pfm.a(h2(), new lhi.b(22, new pzc.g(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new m3l.d(20, b0.f244399a), a0.f244390a);
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar2, hVarW2);
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r j() {
        return this.e.j();
    }

    @Override // zc0.g
    public final pfm.a j2(SelectionItem item, String optionId) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return m3(item.getId(), new pza.d(this, 16, item, optionId));
    }

    @Override // zc0.g
    public final void k0() {
        ofm.h hVar = this.T;
        if (hVar != null) {
            lfm.d.a(hVar);
        }
        this.T = null;
    }

    @Override // qc0.h
    public final ufm.c l0(final int i) {
        ufm.c cVar = new ufm.c(new Callable() { // from class: qc0.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BackendFlow backendFlow;
                k kVar = this.f244464a.f244440b;
                od0.i iVar = (od0.i) te0.w.O(kVar.k());
                if (iVar == null || (backendFlow = (BackendFlow) iVar.f224257a) == null) {
                    throw new IllegalStateException("No backendFlow in state");
                }
                String str = (String) zhm.d0.o0((List) kVar.r0().get());
                if (str == null) {
                    throw new IllegalStateException("Current screen cannot be found");
                }
                for (BackendScreen backendScreen : backendFlow.e) {
                    if (Intrinsics.f(backendScreen.getId(), str)) {
                        return (BackendItem) ((FormScreen) backendScreen).f63468b.get(i);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }, 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final BackendScreen l3() {
        String str;
        k kVar = this.f244440b;
        BackendFlow backendFlow = (BackendFlow) te0.w.L(kVar.k());
        if (backendFlow == null || (str = (String) zhm.d0.o0((List) kVar.r0().get())) == null) {
            return null;
        }
        for (BackendScreen backendScreen : backendFlow.e) {
            if (Intrinsics.f(backendScreen.getId(), str)) {
                return backendScreen;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.r m() {
        return this.e.m();
    }

    @Override // zc0.g
    public final pfm.a m1(String id10, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.b bVar = pfm.m.f235744a;
        if (str != null) {
            BackendFlow backendFlow = (BackendFlow) te0.w.L(this.f244440b.k());
            if (backendFlow == null || (str2 = backendFlow.f63264b) == null) {
                Intrinsics.checkNotNullExpressionValue(bVar, "complete(...)");
            } else {
                efm.b bVarRemoveFile = this.f244441c.removeFile(str2, str);
                eli.j jVar = this.K;
                jVar.getClass();
                pfm.a aVar = new pfm.a(bVarRemoveFile.h(new eli.a(jVar, this.L)), mfm.f.f205044g, 1);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
                bVar = aVar;
            }
        }
        pfm.a aVarE = bVar.e(m3(null, new p(this, id10, 0)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a m3(String str, Function1 function1) {
        rfm.o oVar = new rfm.o(new t(this, 1));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        rfm.m mVar = new rfm.m(oVar, new u(new w(str, this), 19), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        int i = 28;
        pfm.a aVar = new pfm.a(new rfm.m(mVar, new h2(27, new js7.c(16, function1)), 0), new h2(i, new pvc.e(1, this, j0.class, "updateScreen", "updateScreen(Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;)Lio/reactivex/Completable;", 0, 16)), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // zc0.g
    public final efm.r n() {
        efm.r map = ((te0.r) this.f244440b.k()).c(te0.s.f270018a).filter(new u(new qb5.a(7), 1)).map(new u(new qb5.a(8), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // qc0.h
    public final pfm.h n0(BackendFlowExitDialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        pfm.h hVar = new pfm.h(new phc.d(this, dialog, 14), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // zc0.g
    public final efm.r n1() {
        efm.r map = w0().map(new u(new o(this, 8), 17));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // zc0.g
    public final pfm.a n2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(id10, new p(this, id10, 1));
    }

    @Override // qc0.h
    public final efm.r o1() {
        efm.r rVarSwitchMap = this.f244440b.r0().c(te0.s.f270018a).flatMapMaybe(new h2(29, new o(this, 6))).switchMap(new u(new pvc.e(1, this, j0.class, "observeScreenById", "observeScreenById(Ljava/lang/String;)Lio/reactivex/Observable;", 0, 14), 0));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // zc0.g
    public final pfm.a p0(String id10, ba0.j value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return m3(id10, new pza.d(this, 15, id10, value));
    }

    @Override // qc0.h
    public final pfm.a p1() {
        pfm.h hVar = new pfm.h(new x(this, 1), 2);
        k kVar = this.f244440b;
        pfm.t tVarZ0 = te0.w.z0(kVar.r0(), new Stack());
        te0.v vVarK = kVar.k();
        od0.i.Companion.getClass();
        pfm.a aVarE = hVar.e(efm.b.p(tVarZ0, te0.w.z0(vVarK, od0.i.f224256b))).e(h2()).e(pfm.m.f235744a);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // zc0.g
    public final efm.r q2() {
        efm.r rVarDistinctUntilChanged = w0().map(new u(new pvc.e(1, this.M, bd0.d.class, "isSearchable", "isSearchable(Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;)Z", 0, 15), 18)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    @Override // zc0.g
    public final pfm.a s(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        k kVar = this.f244440b;
        int i = 1;
        pfm.a aVar = new pfm.a(new rfm.m(new rfm.m(new rfm.o(new v(kVar.k(), 0)), new u(new q2g.h(this, screen, 22), 7), 0), new u(new pvc.e(i, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 17), 8), 1), new u(new pvc.e(i, kVar.k(), te0.w.class, "updateCompletable", "updateCompletable(Lcom/revolut/core/data/state/StateField;Ljava/lang/Object;)Lio/reactivex/Completable;", 1, 18), 9), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // zc0.g
    public final pfm.a t(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(null, new s(id10, this, z));
    }

    @Override // zc0.g
    public final void t0(long j2) {
        k0();
        k kVar = this.f244440b;
        BackendFlow backendFlow = (BackendFlow) te0.w.L(kVar.k());
        if (backendFlow == null) {
            throw new IllegalStateException("No backendFlow in state");
        }
        efm.d0 d0VarA = this.f244441c.a(BackendFlow.a(backendFlow, null, k3((Stack) kVar.r0().get()), OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG));
        eli.j jVar = this.K;
        jVar.getClass();
        efm.b bVarH = new pfm.a(d0VarA.g(new eli.a(jVar, this.L)), new u(new csl.a(backendFlow, j2, this, 14), 5), 4).h(new u(this, 6));
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        pfm.a aVar = new pfm.a(ue0.e.v(bVarH), new lhi.b(22, new pzc.g(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new m3l.d(20, h0.f244436a), g0.f244425a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        this.T = hVarW;
        te0.w.j0(this.d, hVarW);
    }

    @Override // zc0.g
    public final boolean u2() {
        return ((Stack) this.f244440b.r0().get()).isEmpty();
    }

    @Override // zc0.g
    public final pfm.a v1(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return m3(null, new m(id10, this, text, 2));
    }

    @Override // zc0.g
    public final pfm.a w(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(null, new p(this, id10, 4));
    }

    @Override // zc0.g
    public final sfm.b w0() {
        sfm.b bVar = new sfm.b(new rfm.o(new t(this, 2)), new u(new pvc.e(1, this, j0.class, "observeScreenById", "observeScreenById(Ljava/lang/String;)Lio/reactivex/Observable;", 0, 13), 4), 1);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    @Override // zc0.g
    public final pfm.a x0(String id10, LocalDate value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return m3(id10, new r(this, id10, value, 1));
    }

    @Override // qc0.h
    public final pfm.a y0(Action.Submit action) {
        Intrinsics.checkNotNullParameter(action, "action");
        pfm.a aVar = new pfm.a(new rfm.m(new rfm.o(new t(this, 0)), new h2(25, new q2g.h(this, action, 20)), 0), new h2(26, new i0(1, 0, j0.class, this, "updateScreen", "updateScreen(Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;)Lio/reactivex/Completable;")), 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // zc0.g
    public final pfm.a y2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return m3(id10, new p(this, id10, 3));
    }

    @Override // zc0.g
    public final void z0() {
        this.V.onNext(Boolean.TRUE);
    }
}
