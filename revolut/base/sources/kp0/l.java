package kp0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.ImageSwitcher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListItemDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.b2;
import com.revolut.core.ui_kit.delegates.widgets.u4;
import com.revolut.core.ui_kit.delegates.widgets.z3;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.internal.delegates.SpinnerPickerItemDelegate;
import com.revolut.core.ui_kit.internal.delegates.WidgetHeaderDelegate;
import com.revolut.core.ui_kit.internal.views.BadgesPanel;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.SwitcherView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardBottomBarView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core_ui_custom_font.TypefaceButton;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogTextDelegate;
import com.revolut.uicomponent.dialogs.bottom.delegate.BottomDialogTextRowDelegate;
import com.revolut.uicomponent.dialogs.delegate.DialogTextRowDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.b4;
import mx0.d8;
import mx0.lc;
import mx0.nc;
import rp0.i1;
import rp0.k1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f188032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188033c;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f188031a = i;
        this.f188032b = obj2;
        this.f188033c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Image imageD;
        Image imageD2;
        int i = this.f188031a;
        Object obj2 = this.f188033c;
        Object obj3 = this.f188032b;
        switch (i) {
            case 0:
                ((ChatAttachmentListItemDelegate) obj3).f53805c.onNext((ChatAttachmentListBubbleDelegate.AttachmentItem) obj2);
                return;
            case 1:
                ((ChatBubbleDelegate) obj3).f53809j.onNext((ChatBubbleDelegate.ButtonModel) obj2);
                return;
            case 2:
                ((ChatBubbleDelegate) obj3).f53812n.onNext((ChatBubbleDelegate.Model) obj2);
                return;
            case 3:
                int i2 = ReactionsKeyboardBottomBarView.i;
                ((ReactionsKeyboardBottomBarView) obj3).d(((lu0.b) obj2).f199982a);
                return;
            case 4:
                ((BadgesPanel) obj3).f56099r.onNext((TagViewData) obj2);
                return;
            case 5:
                LabelView labelView = (LabelView) obj3;
                View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                int i3 = LabelView.f56193x;
                wy0.a aVarK = or0.u.k(labelView);
                ty0.c cVarB0 = aVarK.b0();
                UIKitTextView uIKitTextView = labelView.f56194g;
                if (uIKitTextView == null) {
                    Intrinsics.r("titleView");
                    throw null;
                }
                Clause clauseO = ((bp0.y) cVarB0).o(uIKitTextView);
                py0.d cVar = clauseO != null ? new py0.c(clauseO) : null;
                if (cVar == null) {
                    ImageSwitcher imageSwitcher = labelView.f56195h;
                    View currentView = imageSwitcher != null ? imageSwitcher.getCurrentView() : null;
                    AppCompatImageView appCompatImageView = currentView instanceof AppCompatImageView ? (AppCompatImageView) currentView : null;
                    cVar = (appCompatImageView == null || (imageD2 = aVarK.Q().d(appCompatImageView)) == null) ? null : new py0.b(imageD2);
                }
                if (cVar == null) {
                    AppCompatImageView appCompatImageView2 = labelView.i;
                    if (appCompatImageView2 != null && (imageD = aVarK.Q().d(appCompatImageView2)) != null) {
                        bVar = new py0.b(imageD);
                    }
                    cVar = bVar;
                }
                aVarK.n0().a(labelView, labelView, cVar);
                onClickListener.onClick(labelView);
                return;
            case 6:
                SmallActionButton smallActionButton = (SmallActionButton) obj3;
                SmallActionButton.Companion aVar = SmallActionButton.INSTANCE;
                Intrinsics.h(view);
                smallActionButton.m(view);
                smallActionButton.I.b0();
                ((View.OnClickListener) obj2).onClick(view);
                smallActionButton.f56386h.onNext(Unit.f186387a);
                return;
            case 7:
                ((SwitcherView) obj3).f56429a.b0();
                ((View.OnClickListener) obj2).onClick(view);
                return;
            case 8:
                ((ChatInputView) obj3).M.onNext((b4) obj2);
                return;
            case 9:
                KeyboardSuggestionsView keyboardSuggestionsView = (KeyboardSuggestionsView) obj3;
                int i5 = KeyboardSuggestionsView.f58685j;
                ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(keyboardSuggestionsView).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
                keyboardSuggestionsView.d.onNext((d8) obj2);
                return;
            case 10:
                nc ncVar = (nc) obj3;
                lc lcVar = (lc) obj2;
                int i6 = nc.d;
                py0.f fVarN0 = or0.u.k(ncVar).n0();
                TrackableItem.Companion companion = TrackableItem.INSTANCE;
                Parcelable parcelable = lcVar.f209807b;
                companion.getClass();
                CustomTrackableComponent customTrackableComponentA = TrackableItem.Companion.a(ncVar, parcelable);
                Image imageD3 = or0.u.k(ncVar).Q().d(ncVar.f209863a);
                fVarN0.a(ncVar, customTrackableComponentA, imageD3 != null ? new py0.b(imageD3) : null);
                ncVar.f209864b.onNext(lcVar);
                return;
            case 11:
                ((AmountEditView) obj3).f58934h.onNext((bw0.n) obj2);
                return;
            case 12:
                GoalProgressWidgetDelegate goalProgressWidgetDelegate = (GoalProgressWidgetDelegate) obj3;
                GoalProgressWidgetDelegate.Model model = (GoalProgressWidgetDelegate.Model) obj2;
                goalProgressWidgetDelegate.f55143h.onNext(model);
                goalProgressWidgetDelegate.r(model, new com.revolut.core.ui_kit.delegates.widgets.c1(model.f55144b, model));
                return;
            case 13:
                GridWidgetDelegate.Model model2 = (GridWidgetDelegate.Model) obj2;
                ((GridWidgetDelegate) obj3).r(model2, new b2(model2.getF58155c()));
                return;
            case 14:
                SimpleTileWidgetDelegate.Model model3 = (SimpleTileWidgetDelegate.Model) obj2;
                ((SimpleTileWidgetDelegate) obj3).r(model3, new z3(model3.f55232b, model3));
                return;
            case 15:
                TravelModeWidgetDelegate.Model model4 = (TravelModeWidgetDelegate.Model) obj2;
                TravelModeWidgetDelegate.Companion aVar2 = TravelModeWidgetDelegate.INSTANCE;
                ((TravelModeWidgetDelegate) obj3).r(model4, new u4(model4.f55280b, model4));
                return;
            case 16:
                WebViewActivity webViewActivity = (WebViewActivity) obj3;
                WebViewActivity.Companion companion2 = WebViewActivity.INSTANCE;
                webViewActivity.getClass();
                webViewActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) obj2)));
                return;
            case 17:
                ((SpinnerPickerItemDelegate) obj3).f55846c.onNext((SpinnerPickerItemDelegateModel) obj2);
                return;
            case 18:
                ((WidgetHeaderDelegate) obj3).f55848c.onNext((pq0.o) obj2);
                return;
            case 19:
                ((BottomDialogTextDelegate) obj3).f107159c.invoke((ryl.f) obj2);
                return;
            case 20:
                ((BottomDialogTextRowDelegate) obj3).f107160c.invoke((ryl.h) obj2);
                return;
            case 21:
                syl.m model5 = (syl.m) obj2;
                syl.l lVar = ((DialogTextRowDelegate) obj3).f107162c;
                if (lVar != null) {
                    tyl.d dVar = (tyl.d) lVar;
                    Intrinsics.checkNotNullParameter(model5, "model");
                    AlertDialog alertDialog = dVar.f275727l;
                    if (alertDialog == null) {
                        Intrinsics.r("dialog");
                        throw null;
                    }
                    alertDialog.dismiss();
                    dVar.f275723c.invoke(model5);
                    dVar.d.invoke(model5.f266709a, null);
                    return;
                }
                return;
            case 22:
                BasicNavBar basicNavBar = (BasicNavBar) obj3;
                TagViewData tagViewData = (TagViewData) obj2;
                int i21 = BasicNavBar.H;
                py0.f fVarN02 = or0.u.k(basicNavBar).n0();
                Clause clause = tagViewData.f57641b;
                if (clause != null) {
                    bVar = new py0.c(clause);
                } else {
                    Image image = tagViewData.f57640a;
                    if (image != null) {
                        bVar = new py0.b(image);
                    }
                }
                fVarN02.a(basicNavBar, basicNavBar, bVar);
                basicNavBar.f.onNext(tagViewData);
                return;
            case 23:
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) obj3;
                TagViewData tagViewData2 = (TagViewData) obj2;
                NavBarWithToolbar.Companion companion3 = NavBarWithToolbar.INSTANCE;
                py0.f fVarN03 = or0.u.k(navBarWithToolbar).n0();
                Clause clause2 = tagViewData2.f57641b;
                if (clause2 != null) {
                    bVar = new py0.c(clause2);
                } else {
                    Image image2 = tagViewData2.f57640a;
                    if (image2 != null) {
                        bVar = new py0.b(image2);
                    }
                }
                fVarN03.a(navBarWithToolbar, navBarWithToolbar, bVar);
                navBarWithToolbar.W0.onNext(tagViewData2);
                return;
            case 24:
                ((ux0.a) obj3).f.onNext(((ux0.l) ((ux0.h) obj2).f283750b.f283788c).f283781b);
                return;
            case 25:
                TypefaceButton typefaceButton = (TypefaceButton) obj3;
                TypefaceButton.a aVar3 = TypefaceButton.Companion;
                Context context = typefaceButton.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                jh.d.f(context).n0().a(typefaceButton, typefaceButton, null);
                ((View.OnClickListener) obj2).onClick(view);
                return;
            case 26:
                Button button = (Button) obj2;
                InputConnection inputConnection = ((wv0.d) obj3).f300255a;
                if (inputConnection != null) {
                    inputConnection.commitText(button.getText(), 1);
                }
                button.performHapticFeedback(3);
                return;
            case 27:
                mw0.b bVar = (mw0.b) obj2;
                Function1 function1 = ((yr0.a) obj3).f316050a;
                if (function1 != null) {
                    function1.invoke(new mw0.d(bVar.f209283c));
                    return;
                }
                return;
            case 28:
                Function1 function12 = ((yr0.a) obj3).f316050a;
                if (function12 != null) {
                    function12.invoke(new mw0.e(obj2));
                    return;
                }
                return;
            default:
                i1 i1Var = (i1) obj3;
                yr0.r rVar = (yr0.r) obj2;
                k1 k1Var = i1Var.f256095c;
                View view2 = k1Var.f256108a;
                py0.f fVarN04 = or0.u.k(view2).n0();
                ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration = i1Var.f256093a;
                Clause clause3 = shotDialogDisplayer$Configuration.d;
                fVarN04.a(view2, shotDialogDisplayer$Configuration, clause3 != null ? new py0.c(clause3) : null);
                i1Var.f256094b = true;
                k1Var.d.onNext(new rp0.b1(shotDialogDisplayer$Configuration));
                rVar.dismiss();
                return;
        }
    }
}
