package com.revolut.core.backend_flow.impl.ui.form_screen;

import a0e.n;
import aa0.a1;
import aa0.e1;
import aa0.m0;
import aa0.r;
import aa0.s0;
import aa0.z0;
import cd0.d;
import cli.y;
import com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract$ModalStep;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendCardPhotoItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.ChooserItem;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MailItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.SummarySectionItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import com.revolut.feature.backend_flow.domain.models.TimeInputItem;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import dd0.c;
import e60.s;
import hx7.e;
import ip0.az;
import ip0.u00;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jb0.f;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import lb0.d0;
import lb0.p;
import lb0.q;
import lb0.r0;
import lb0.x;
import lb0.z;
import ob0.i;
import oki.h;
import sa0.k;
import skm.a2;
import vkm.j2;
import vkm.t;
import vkm.v0;
import vkm.v1;
import xl2.v;
import yji.l;
import zc0.b3;
import zc0.d3;
import zc0.e3;
import zc0.h3;
import zc0.i3;
import zc0.j3;
import zc0.k3;
import zc0.l3;
import zc0.s3;
import zc0.t3;
import zc0.u3;
import zc0.x3;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends k implements q, ua0.a {
    public final i A;
    public a2 B;
    public final y C;
    public final com.revolut.kompot.navigable.vc.modal.a D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jx0.a f51283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f51284t;
    public final b u;
    public final e60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ob0.a f51285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ua0.a f51286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f51287y;
    public final d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jx0.a fileRepository, r0 stateMapper, b modalControllersFactory, e60.a mediaPickerControllerExtension, ob0.a inputItemInteractorProvider, ua0.a itemsScreenControllerModelExtension, c textItemValueValidator, d validationRequestHandler, i fileUploadValidationInteractor, j60.a bottomDialogExtension, qa0.b externalNavigationExtension, c70.a clipboard, FormScreen screen) {
        super(stateMapper, clipboard, externalNavigationExtension, bottomDialogExtension);
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(modalControllersFactory, "modalControllersFactory");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(inputItemInteractorProvider, "inputItemInteractorProvider");
        Intrinsics.checkNotNullParameter(itemsScreenControllerModelExtension, "itemsScreenControllerModelExtension");
        Intrinsics.checkNotNullParameter(textItemValueValidator, "textItemValueValidator");
        Intrinsics.checkNotNullParameter(validationRequestHandler, "validationRequestHandler");
        Intrinsics.checkNotNullParameter(fileUploadValidationInteractor, "fileUploadValidationInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f51283s = fileRepository;
        this.f51284t = stateMapper;
        this.u = modalControllersFactory;
        this.v = mediaPickerControllerExtension;
        this.f51285w = inputItemInteractorProvider;
        this.f51286x = itemsScreenControllerModelExtension;
        this.f51287y = textItemValueValidator;
        this.z = validationRequestHandler;
        this.A = fileUploadValidationInteractor;
        boolean zD = uc0.b.d(screen);
        Data data = new Data(zD ? null : f0.f322471a, null, zD, 2, null);
        m70.a.c(t0.f186434a);
        this.C = mra.d.a(this, new p(screen, "", data), stateMapper, new FormScreenSaveStateDelegate(), true);
        this.D = e.a(this, new x(this, 1));
    }

    public static InputItem M2(FormScreen formScreen, String str) {
        List list = formScreen.f63468b;
        ArrayList<InputItem> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof InputItem) {
                arrayList.add(obj2);
            }
        }
        for (InputItem inputItem : arrayList) {
            if (Intrinsics.f(inputItem.getId(), str)) {
                return inputItem;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // ua0.a
    public final void F0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f51286x.F0(clickData);
    }

    @Override // yji.l
    public final void I1() {
        Flow screenChangesFlow = this.C.B(new h0() { // from class: lb0.a0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((p) obj2).f193546a;
            }
        });
        x onUpdate = new x(this, 0);
        a3 validate = new a3(this, null);
        d dVar = this.z;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(screenChangesFlow, "screenChangesFlow");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(validate, "validate");
        l.a1(this, rd0.e.b(dVar.a(rd0.e.c(screenChangesFlow, g.f186406a), onUpdate, validate)), null, null, null, 7);
        l.a1(this, new kx4.f0(rd0.e.b(((s) this.v).f122868g), 12), null, null, new z(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // sa0.k
    public final void L2(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        H2(this.C, new f(screen, 1));
    }

    @Override // ua0.a
    public final void N0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f51286x.N0(clickData);
    }

    public final InputItem N2(String str) {
        return M2(((p) ((j2) this.C.f22677a).getValue()).f193546a, str);
    }

    public final void O2(String listId, String value) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        InputItem inputItemN2 = N2(listId);
        Object z0Var = null;
        if (inputItemN2 instanceof TextInputItem) {
            if (((TextInputItem) inputItemN2).k == null) {
                z0Var = new e1(value, true, true);
            }
        } else if (inputItemN2 instanceof SignatureInputItem) {
            z0Var = new e1(value, true, true);
        } else if (inputItemN2 instanceof MoneyInputItem) {
            z0Var = new s0(value);
        } else if ((inputItemN2 instanceof SelectionItem) || (inputItemN2 instanceof RadioButtonTextInputItem) || (inputItemN2 instanceof CheckboxTextInputItem)) {
            z0Var = new z0(value);
        } else if (!(inputItemN2 instanceof DateInputItem) && !(inputItemN2 instanceof ChooserItem) && !(inputItemN2 instanceof TimeInputItem)) {
            throw new IllegalArgumentException("Can't process onTextInputChanged from item: " + inputItemN2);
        }
        if (z0Var == null) {
            return;
        }
        S2(z0Var, listId);
    }

    public final void P2(String str) {
        FlowStep dropDownOptionSelection;
        InputItem inputItemN2 = N2(str);
        if (inputItemN2 instanceof MoneyInputItem) {
            dropDownOptionSelection = new FormControllerContract$ModalStep.CurrencySelection((MoneyInputItem) inputItemN2);
        } else if (inputItemN2 instanceof CountrySelectionItem) {
            dropDownOptionSelection = new FormControllerContract$ModalStep.CountrySelection((CountrySelectionItem) inputItemN2);
        } else if (inputItemN2 instanceof PhoneInputItem) {
            dropDownOptionSelection = new FormControllerContract$ModalStep.PhoneCodeSelection((PhoneInputItem) inputItemN2);
        } else {
            if (!(inputItemN2 instanceof DropDownItem)) {
                throw new IllegalStateException("Modal screen is not implemented for item " + inputItemN2);
            }
            dropDownOptionSelection = new FormControllerContract$ModalStep.DropDownOptionSelection((DropDownItem) inputItemN2);
        }
        h.v2(this.D, dropDownOptionSelection, ModalDestination.Style.POPUP.f98311a);
    }

    public final void Q2() {
        a2 a2Var = this.B;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.B = l.a1(this, X0(((p) ((j2) this.C.f22677a).getValue()).f193546a), null, null, new z(this, continuation, 1), 3);
    }

    public final void R2(String str, LocalDate localDate) {
        rp0.y model = this.f51284t.d(((p) ((j2) this.C.f22677a).getValue()).f193546a, (DateInputItem) N2(str), localDate);
        Intrinsics.checkNotNullParameter(model, "model");
        n2(new rhl.b(this, model, null, 21), new whi.b(6));
    }

    @Override // ua0.a
    public final void S0(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f51286x.S0(link);
    }

    public final void S2(Object obj2, String str) {
        H2(this.C, new khg.s(this, 25, str, obj2));
    }

    @Override // sa0.k, sa0.a
    public final void T(LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.i;
        if (obj2 instanceof e3) {
            e3 e3Var = (e3) obj2;
            S2(new m0(e3Var.f321044b), e3Var.f321043a);
        } else if (obj2 instanceof d3) {
            d3 d3Var = (d3) obj2;
            S2(new m0(d3Var.f321036b), d3Var.f321035a);
        } else {
            this.f51286x.U0(((p) ((j2) this.C.f22677a).getValue()).f193546a, model);
        }
        super.T(model);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Q2();
    }

    public final a2 T2(String str, List list) {
        Continuation continuation;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            continuation = null;
            if (!it8.hasNext()) {
                break;
            }
            File file = (File) it8.next();
            jx0.a aVar = this.f51283s;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(file, "file");
            ul2.c cVar = (ul2.c) aVar.f179039c;
            BackendFlow backendFlow = (BackendFlow) aVar.f179038b;
            Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
            Intrinsics.checkNotNullParameter(file, "file");
            arrayList.add(new v1(new ul2.a(file, cVar, backendFlow, null)));
        }
        t tVar = new t(new vkm.y(new la8.h(this, continuation, 3), vkm.q.I(arrayList)), new n(this, continuation, 10));
        d0 d0Var = new d0(this, str, continuation, 0);
        int i = v0.f290132a;
        v0b.b bVar = new v0b.b(tVar, d0Var, 12);
        if (i > 0) {
            return l.a1(this, i == 1 ? new vkm.t0(bVar, 0) : new wkm.f(i, -2, g.f186406a, bVar, ukm.f.SUSPEND), null, null, new d0(this, str, continuation, 1), 3);
        }
        throw new IllegalArgumentException(a0.d.n("Expected positive concurrency level, but had ", i).toString());
    }

    @Override // ua0.a
    public final void U0(BackendScreen screen, LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f51286x.U0(screen, model);
    }

    @Override // ua0.a
    public final void V0(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (obj2 instanceof l3) {
            String strA = ((l3) obj2).f321082b.a();
            if (strA != null) {
                S0(strA);
                return;
            }
            return;
        }
        if (obj2 instanceof b3) {
            b3 b3Var = (b3) obj2;
            S2(b3Var.f321014b, b3Var.f321013a);
            Unit unit = Unit.f186387a;
            J2();
            return;
        }
        if (obj2 instanceof DocumentItem) {
            DocumentItem documentItem = (DocumentItem) obj2;
            S2(Unit.f186387a, documentItem.f63393a);
            S0(documentItem.f63396g);
            return;
        }
        if (obj2 instanceof s3) {
            s3 s3Var = (s3) obj2;
            S2(new a1(s3Var.f321123b), s3Var.f321122a.getId());
            J2();
            return;
        }
        if (obj2 instanceof u3) {
            String str = ((u3) obj2).f321136a;
            S2(new a1(str), str);
            J2();
            return;
        }
        if (obj2 instanceof MailItem) {
            S0(((MailItem) obj2).f63518c);
            return;
        }
        if (obj2 instanceof BackendFlowUploadItem) {
            BackendFlowUploadItem backendFlowUploadItem = (BackendFlowUploadItem) obj2;
            if (!(backendFlowUploadItem instanceof BackendCardPhotoItem)) {
                ((s) this.v).T(new e60.i(backendFlowUploadItem.getId(), null, null, true, 0, 0, null, null, false, u00.BACK, null, 11766));
                return;
            } else {
                h.v2(this.D, new FormControllerContract$ModalStep.CardPhoto(((BackendCardPhotoItem) obj2).f63257a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                return;
            }
        }
        if (obj2 instanceof h3) {
            h3 h3Var = (h3) obj2;
            S2(new r(h3Var.f321061b), h3Var.f321060a.f63400a);
            J2();
            return;
        }
        if (obj2 instanceof SummarySectionItem) {
            SummarySectionItem summarySectionItem = (SummarySectionItem) obj2;
            throw new IllegalArgumentException(a0.d.s("Unsupported summary section item with nextViewId=", summarySectionItem.e, " and section=", summarySectionItem.d));
        }
        if (obj2 instanceof x3) {
            return;
        }
        boolean z = obj2 instanceof k3;
        ua0.a aVar = this.f51286x;
        if (!z) {
            if (!(obj2 instanceof t3)) {
                aVar.V0(model);
                return;
            }
            t3 t3Var = (t3) obj2;
            S2(new e1(t3Var.f321130b, true, true), t3Var.f321129a);
            return;
        }
        k3 k3Var = (k3) obj2;
        if (k3Var instanceof i3) {
            K2(((i3) obj2).f321065b);
        } else {
            if (!(k3Var instanceof j3)) {
                throw new NoWhenBranchMatchedException();
            }
            j3 j3Var = (j3) obj2;
            aVar.v0(((p) ((j2) this.C.f22677a).getValue()).f193546a, j3Var.f321069a, j3Var.f321070b);
        }
    }

    @Override // sa0.a
    public final void W0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        H2(this.C, new l3d.a(query, 7));
    }

    @Override // ua0.a
    public final Flow X0(v screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f51286x.X0(screen);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }

    @Override // ua0.a
    public final void j1(ProgressStepVerticalV2Delegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f51286x.j1(model);
    }

    @Override // ua0.a
    public final void r1(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f51286x.r1(clickData);
    }

    @Override // ua0.a
    public final void v0(BackendScreen screen, String summaryId, EntityType type) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f51286x.v0(screen, summaryId, type);
    }

    @Override // ua0.a
    public final void w1(az clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f51286x.w1(clickData);
    }
}
