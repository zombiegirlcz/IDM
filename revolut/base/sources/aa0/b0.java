package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionItem;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.revolut.feature.backend_flow.domain.models.IconizedSingleChoiceButtonItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.ProductSelectionItem;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.RadioButtonItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import com.revolut.feature.backend_flow.domain.models.SingleChoiceButtonItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.backend_flow.domain.models.SummaryScreen;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature.backend_flow.domain.models.YesNoInputItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f2723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f2724b;

    public b0(z80.b phoneTools, y cardNumberValidator) {
        Intrinsics.checkNotNullParameter(phoneTools, "phoneTools");
        Intrinsics.checkNotNullParameter(cardNumberValidator, "cardNumberValidator");
        this.f2723a = phoneTools;
        this.f2724b = cardNumberValidator;
    }

    public static boolean a(SelectionItem selectionItem) {
        String str;
        String f63596g;
        SelectionItem.CustomOption e = selectionItem.getE();
        return e != null && (str = e.f63609a) != null && selectionItem.getF63640g().contains(str) && (f63596g = selectionItem.getF63596g()) != null && f63596g.length() > 0 && Intrinsics.f(selectionItem.getI(), ValidationResult.Valid.f63719a);
    }

    public static boolean c(SelectionItem selectionItem) {
        String str;
        SelectionItem.CustomOption e = selectionItem.getE();
        return !((e == null || (str = e.f63609a) == null) ? selectionItem.getF63640g() : zhm.a1.j(selectionItem.getF63640g(), str)).isEmpty() || a(selectionItem);
    }

    public static boolean e(BackendScreen screen) {
        List<BackendItem> list;
        boolean z;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (!(screen instanceof FormScreen)) {
            if (screen instanceof TutorialScreen) {
                TutorialScreen tutorialScreen = (TutorialScreen) screen;
                return tutorialScreen.f63712b == null || tutorialScreen.f63716j != null;
            }
            if (screen instanceof SummaryScreen) {
                return true;
            }
            if ((screen instanceof BottomPromptScreen) || (screen instanceof DeeplinkScreen) || (screen instanceof HtmlPromptScreen) || (screen instanceof PromptScreen) || (screen instanceof StatusDialogScreen) || (screen instanceof StoriesScreen)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        FormScreen formScreen = (FormScreen) screen;
        List list2 = formScreen.f63468b;
        List list3 = formScreen.e;
        if ((list3 == null || list3.isEmpty()) && !uc0.b.r(screen)) {
            if (uc0.b.t(screen)) {
                return hx7.a.r(formScreen).f63707g instanceof SelectionStyle.MultiSelection;
            }
            Intrinsics.checkNotNullParameter(screen, "<this>");
            if (zhm.d0.d0(((FormScreen) screen).f63468b) instanceof EntitiesSelectionItem) {
                return ue8.c.J(formScreen).e instanceof SelectionStyle.MultiSelection;
            }
            if (foh.i.n(formScreen).size() < 2 && (!((z = (list = list2) instanceof Collection)) || !list.isEmpty())) {
                for (BackendItem backendItem : list) {
                    InputItem inputItem = backendItem instanceof InputItem ? (InputItem) backendItem : null;
                    if (!(inputItem instanceof CurrencySelectionItem) && !(inputItem instanceof IconizedSingleChoiceButtonItem) && !(inputItem instanceof ProductSelectionItem) && !(inputItem instanceof RadioButtonItem) && !(inputItem instanceof SingleChoiceButtonItem) && !(inputItem instanceof YesNoInputItem)) {
                        if (inputItem instanceof SingleSelectionItem) {
                            Intrinsics.i(backendItem, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.SingleSelectionItem");
                            SingleSelectionItem.Style style = ((SingleSelectionItem) backendItem).i;
                            if (!Intrinsics.f(style, SingleSelectionItem.Style.CellSelection.f63651a) && !Intrinsics.f(style, SingleSelectionItem.Style.ContinueButton.f63652a)) {
                                if (!Intrinsics.f(style, SingleSelectionItem.Style.RadioButton.f63653a) && !(style instanceof SingleSelectionItem.Style.Unknown)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            if (((BackendItem) it8.next()) instanceof RadioButtonTextInputItem) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x02c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02c9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.revolut.feature.backend_flow.domain.models.InputItem r9) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.b0.b(com.revolut.feature.backend_flow.domain.models.InputItem):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.revolut.feature.backend_flow.domain.models.BackendScreen r8) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.b0.d(com.revolut.feature.backend_flow.domain.models.BackendScreen):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.revolut.feature.backend_flow.domain.models.InputItem r4) {
        /*
            r3 = this;
            boolean r0 = r4.getF63425c()
            if (r0 == 0) goto Lb
            boolean r4 = r3.b(r4)
            return r4
        Lb:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.TextInputItem
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.TextInputItem r0 = (com.revolut.feature.backend_flow.domain.models.TextInputItem) r0
            java.lang.String r0 = r0.d
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            goto L22
        L1f:
            r0 = r2
            goto L85
        L22:
            r0 = r1
            goto L85
        L24:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.SignatureInputItem
            if (r0 == 0) goto L36
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.SignatureInputItem r0 = (com.revolut.feature.backend_flow.domain.models.SignatureInputItem) r0
            java.lang.String r0 = r0.f63628b
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            goto L22
        L36:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.CardInputItem
            if (r0 == 0) goto L48
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.CardInputItem r0 = (com.revolut.feature.backend_flow.domain.models.CardInputItem) r0
            java.lang.String r0 = r0.f63344c
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            goto L22
        L48:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.PhoneInputItem
            if (r0 == 0) goto L5a
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.PhoneInputItem r0 = (com.revolut.feature.backend_flow.domain.models.PhoneInputItem) r0
            java.lang.String r0 = r0.f63572g
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            goto L22
        L5a:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem
            if (r0 == 0) goto L6a
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem r0 = (com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem) r0
            java.util.List r0 = r0.getE()
            boolean r0 = r0.isEmpty()
            goto L85
        L6a:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.SingleSelectionItem
            if (r0 == 0) goto L78
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.SingleSelectionItem r0 = (com.revolut.feature.backend_flow.domain.models.SingleSelectionItem) r0
            java.util.Set r0 = r0.f63640g
            boolean r0 = r0.isEmpty()
            goto L85
        L78:
            boolean r0 = r4 instanceof com.revolut.feature.backend_flow.domain.models.MultiSelectionItem
            if (r0 == 0) goto L22
            r0 = r4
            com.revolut.feature.backend_flow.domain.models.MultiSelectionItem r0 = (com.revolut.feature.backend_flow.domain.models.MultiSelectionItem) r0
            java.util.Set r0 = r0.f63544g
            boolean r0 = r0.isEmpty()
        L85:
            if (r0 != 0) goto L8f
            boolean r4 = r3.b(r4)
            if (r4 == 0) goto L8e
            goto L8f
        L8e:
            return r2
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.b0.f(com.revolut.feature.backend_flow.domain.models.InputItem):boolean");
    }
}
