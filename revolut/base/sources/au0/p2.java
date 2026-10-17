package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.CircleActionView;
import com.revolut.core.ui_kit.internal.views.FilterButton;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.internal.views.SuggestionView;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.LabelButtonView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.buttons.GooglePayButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gif.TransferPersonalisationGifSelector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final class p2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9308b;

    public /* synthetic */ p2(Object obj2, int i) {
        this.f9307a = i;
        this.f9308b = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        py0.d bVar;
        List list;
        int i = this.f9307a;
        z0Var = null;
        tx0.z0 z0Var = null;
        Object obj2 = this.f9308b;
        switch (i) {
            case 0:
                Intrinsics.h(view);
                ((NavBarContentCenterView) obj2).u.onNext(Unit.f186387a);
                break;
            case 1:
                Intrinsics.h(view);
                Function0 function0 = (Function0) obj2;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 2:
                Intrinsics.h(view);
                CircleActionView circleActionView = (CircleActionView) obj2;
                circleActionView.f56129q.b0();
                circleActionView.f56119a.onNext(Unit.f186387a);
                break;
            case 3:
                Intrinsics.h(view);
                FilterButton filterButton = (FilterButton) obj2;
                CustomContentDescriptionClause customContentDescriptionClause = filterButton.f56181n;
                if (customContentDescriptionClause != null) {
                    bVar = new py0.c(customContentDescriptionClause);
                } else {
                    Image image = filterButton.o;
                    if (image != null) {
                        bVar = new py0.b(image);
                    } else {
                        Image image2 = filterButton.f56182p;
                        bVar = image2 != null ? new py0.b(image2) : null;
                    }
                }
                or0.u.k(filterButton).n0().a(view, filterButton, bVar);
                filterButton.u.b0();
                filterButton.f56177h.onNext(Unit.f186387a);
                break;
            case 4:
                Intrinsics.h(view);
                ProductIntroView productIntroView = (ProductIntroView) obj2;
                productIntroView.j0(productIntroView.f56311w.o());
                break;
            case 5:
                Intrinsics.h(view);
                ((SuggestionView) obj2).f56417b.onNext(Unit.f186387a);
                break;
            case 6:
                Intrinsics.h(view);
                ((ChatInputView) obj2).L.onNext(Unit.f186387a);
                break;
            case 7:
                Intrinsics.h(view);
                LabelButtonView labelButtonView = (LabelButtonView) obj2;
                Clause clauseO = ((bp0.y) or0.u.k(view).b0()).o(labelButtonView.getTitle());
                or0.u.k(view).n0().a(view, labelButtonView, clauseO != null ? new py0.c(clauseO) : null);
                labelButtonView.d.onNext(Unit.f186387a);
                break;
            case 8:
                Intrinsics.h(view);
                FormsActionButton formsActionButton = (FormsActionButton) obj2;
                formsActionButton.f58984p.b0();
                formsActionButton.f58987s.onNext(Unit.f186387a);
                break;
            case 9:
                Intrinsics.h(view);
                ((GooglePayButton) obj2).f58993m.onNext(Unit.f186387a);
                break;
            case 10:
                Intrinsics.h(view);
                ((qr0.d) obj2).f248588c.onNext(Unit.f186387a);
                break;
            case 11:
                Intrinsics.h(view);
                InputText inputText = (InputText) obj2;
                if (!inputText.getTextInputEditText().isFocusable()) {
                    inputText.u0.onNext(Unit.f186387a);
                }
                break;
            case 12:
                Intrinsics.h(view);
                MarketingPhotoHeaderContentView marketingPhotoHeaderContentView = (MarketingPhotoHeaderContentView) obj2;
                MarketingPhotoHeaderContentView.Companion aVar = MarketingPhotoHeaderContentView.INSTANCE;
                tx0.a1 a1Var = marketingPhotoHeaderContentView.f59252l;
                tx0.x0 x0Var = a1Var instanceof tx0.x0 ? (tx0.x0) a1Var : null;
                if (x0Var != null && (list = x0Var.f275269b) != null) {
                    z0Var = (tx0.z0) zhm.d0.e0(marketingPhotoHeaderContentView.f59253m, list);
                }
                if (z0Var != null) {
                    marketingPhotoHeaderContentView.z.onNext(z0Var);
                }
                break;
            case 13:
                Intrinsics.h(view);
                ((NavBarVaults) obj2).f59328m.onNext(Unit.f186387a);
                break;
            case 14:
                Intrinsics.h(view);
                ((NavBarWithBigTile) obj2).f59357t.onNext(Unit.f186387a);
                break;
            case 15:
                Intrinsics.h(view);
                ((PhotoHeaderView) obj2).Q.onNext(Unit.f186387a);
                break;
            case 16:
                Intrinsics.h(view);
                TransferPersonalisationGifSelector transferPersonalisationGifSelector = (TransferPersonalisationGifSelector) obj2;
                KProperty[] kPropertyArr = TransferPersonalisationGifSelector.V;
                InputText gifSelectorSearchInput = transferPersonalisationGifSelector.d3().f;
                Intrinsics.checkNotNullExpressionValue(gifSelectorSearchInput, "gifSelectorSearchInput");
                InputText.setText$default(gifSelectorSearchInput, null, false, 2, null);
                InputText gifSelectorSearchInput2 = transferPersonalisationGifSelector.d3().f;
                Intrinsics.checkNotNullExpressionValue(gifSelectorSearchInput2, "gifSelectorSearchInput");
                kli.c.c(gifSelectorSearchInput2, true);
                transferPersonalisationGifSelector.d3().f.clearFocus();
                w2a.s sVarE3 = transferPersonalisationGifSelector.e3();
                sVarE3.H2(sVarE3.f294007r, new w29.a(3));
                break;
            case 17:
                Intrinsics.h(view);
                yr0.k kVar = (yr0.k) obj2;
                ArrayList arrayList = kVar.d;
                if (!kVar.f && arrayList.size() >= 2) {
                    arrayList.remove(zhm.v.j(arrayList));
                    kVar.d(((yr0.j) zhm.d0.m0(arrayList)).d, false);
                }
                break;
            default:
                Intrinsics.h(view);
                com.revolut.core.ui_kit.views.o oVar = ((yt0.o) obj2).f316561a;
                if (!oVar.getNonCancelableActivator().a()) {
                    oVar.getOnDismiss$ui_kit_components_release().invoke();
                }
                break;
        }
    }
}
