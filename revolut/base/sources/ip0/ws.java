package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardSmallDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit.delegates.PieChartVerticalLegendDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.PlanLargeDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressionCountDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.core.ui_kit.delegates.ReactionsKeyboardItemDelegate;
import com.revolut.core.ui_kit.delegates.SliderDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardCoverItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TrendPreviewDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ws implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f167060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167061c;

    public /* synthetic */ ws(Object obj2, Object obj3, int i) {
        this.f167059a = i;
        this.f167060b = obj2;
        this.f167061c = obj3;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f167059a;
        Object obj2 = this.f167061c;
        Object obj3 = this.f167060b;
        switch (i) {
            case 0:
                LightPromptDelegate.Model model = (LightPromptDelegate.Model) obj3;
                LightPromptDelegate lightPromptDelegate = (LightPromptDelegate) obj2;
                py0.f fVarW = h30.l.w(view, view);
                Clause clause = model.f52631b;
                if (clause == null) {
                    clause = model.f52632c;
                }
                fVarW.a(view, model, clause != null ? new py0.c(clause) : null);
                lightPromptDelegate.d.onNext(model);
                break;
            case 1:
                ((ListCellBulletDelegate) obj3).f52691c.onNext((ut) obj2);
                break;
            case 2:
                ((ListingCardSmallDelegate) obj3).d.onNext((TagViewData) obj2);
                break;
            case 3:
                ((MapPlainDelegate) obj3).f52768c.onNext((com.revolut.core.ui_kit.delegates.d9) obj2);
                break;
            case 4:
                ((NewProductDelegate) obj3).d.onNext((NewProductDelegate.Model) obj2);
                break;
            case 5:
                ((PermissionDelegate) obj3).f52893c.onNext((m00) obj2);
                break;
            case 6:
                ((PhotoDelegate) obj3).f52920c.onNext((com.revolut.core.ui_kit.delegates.na) obj2);
                break;
            case 7:
                ((PieChartVerticalLegendDelegate) obj3).f52923c.onNext((e10) obj2);
                break;
            case 8:
                ((PlaceholderRowDelegate) obj3).f52924c.onNext((k10) obj2);
                break;
            case 9:
                ((PlanLargeDelegate) obj3).f52941c.onNext((g20) obj2);
                break;
            case 10:
                ((ProgressStepVerticalDelegate) obj3).d.onNext((r40) obj2);
                break;
            case 11:
                ((ihm.f) ((ProgressionCountDelegate) obj3).f53037c.getValue()).onNext((com.revolut.core.ui_kit.delegates.tc) obj2);
                break;
            case 12:
                ((PromotionalMediumTileDelegate) obj3).e.onNext((PromotionalMediumTileDelegate.Model) obj2);
                break;
            case 13:
                ((ihm.f) ((PromptContentDelegate) obj3).f.getValue()).onNext((PromptContentDelegate.Model) obj2);
                break;
            case 14:
                ((PromptMarketingContentDelegate) obj3).f53079c.onNext((PromptMarketingContentDelegate.Model) obj2);
                break;
            case 15:
                ((PromptMarketingContentLoadingDelegate) obj3).p().onNext((x60) obj2);
                break;
            case 16:
                QRCodeDelegate.Companion aVar = QRCodeDelegate.INSTANCE;
                ((QRCodeDelegate) obj3).u().onNext((QRCodeDelegate.Model) obj2);
                break;
            case 17:
                ((ihm.f) ((RateDelegate) obj3).e.getValue()).onNext((y70) obj2);
                break;
            case 18:
                ((RateOneClickDelegate) obj3).f53145c.onNext((f90) obj2);
                break;
            case 19:
                ((ihm.f) ((ReactionsKeyboardItemDelegate) obj3).f53148c.getValue()).onNext((u90) obj2);
                break;
            case 20:
                ((ihm.k) obj3).onNext((com.revolut.core.ui_kit.delegates.ve) obj2);
                break;
            case 21:
                ((SliderDelegate) obj3).d.onNext((ef0) obj2);
                break;
            case 22:
                ((SmallCardDelegate) obj3).e.onNext((SmallCardDelegate.Model) obj2);
                break;
            case 23:
                ((SwipeableCardCoverItemDelegate) obj3).f53509c.onNext((ii0) obj2);
                break;
            case 24:
                ((SwipeableCardInnerRecyclerItemDelegate) obj3).d.onNext((ui0) obj2);
                break;
            case 25:
                ((SwipeableCardLoadingItemDelegate) obj3).f53513c.onNext((xi0) obj2);
                break;
            case 26:
                ((TagDelegate) obj3).d.onNext((vj0) obj2);
                break;
            case 27:
                ((TrendPreviewDelegate) obj3).f53560c.onNext((zl0) obj2);
                break;
            case 28:
                ((AmountForDualEditView) obj3).f56916r.onNext((bw0.n) obj2);
                break;
            default:
                ((BaseChatBubbleDelegate) obj3).f.onNext((BaseChatBubbleDelegate.BaseModel) obj2);
                break;
        }
    }
}
