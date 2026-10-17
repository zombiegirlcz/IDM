package ip0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.delegates.CardDesignCatalogueDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit.delegates.EmojiDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.delegates.gridselector.GridCellDelegate;
import com.revolut.core.ui_kit.internal.views.card_design.CardDesign2dView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f164790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f164791c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j5(Object obj2, int i, Object obj3, Object obj4) {
        this.f164789a = i;
        this.f164790b = obj2;
        this.f164791c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f164789a;
        Object obj2 = this.d;
        Object obj3 = this.f164791c;
        Object obj4 = this.f164790b;
        switch (i) {
            case 0:
                CardDesignCatalogueDelegate.Model model = (CardDesignCatalogueDelegate.Model) obj2;
                CardDesign2dView cardDesign2dView = ((l5) obj3).f;
                or0.u.k(cardDesign2dView).n0().a(cardDesign2dView, model, new py0.b(model.f51770b));
                ((CardDesignCatalogueDelegate) obj4).f51768c.onNext(model);
                break;
            case 1:
                ((a6) obj4).f163398j.b0();
                ((CellDetailsActionDelegate) obj3).d.onNext((CellDetailsActionDelegate.Model) obj2);
                break;
            case 2:
                ((d8) obj4).i.b0();
                ((CellDetailsReceiptDelegate) obj3).f51888c.onNext((b8) obj2);
                break;
            case 3:
                EmojiDelegate.Model model2 = (EmojiDelegate.Model) obj2;
                ImageView imageView = ((lf) obj3).f;
                or0.u.k(imageView).n0().a(imageView, model2, new py0.b(new ResourceImage(model2.f52219b, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                ((EmojiDelegate) obj4).f52217c.onNext(model2);
                break;
            case 4:
                en enVar = (en) obj4;
                HighlightTileDelegate.Model model3 = (HighlightTileDelegate.Model) obj3;
                HighlightTileDelegate.Companion companion = HighlightTileDelegate.INSTANCE;
                View itemView = enVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                py0.f fVarN0 = or0.u.k(itemView).n0();
                View itemView2 = enVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                fVarN0.a(itemView2, model3, new py0.c(model3.f52439b));
                ((HighlightTileDelegate) obj2).f52437c.onNext(model3);
                break;
            case 5:
                PromotionalMediumTileDelegate.Model model4 = (PromotionalMediumTileDelegate.Model) obj4;
                k60 k60Var = (k60) obj3;
                py0.c cVar = new py0.c(model4.f53040b);
                View itemView3 = k60Var.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                py0.f fVarN02 = or0.u.k(itemView3).n0();
                View itemView4 = k60Var.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                fVarN02.a(itemView4, model4, cVar);
                ((PromotionalMediumTileDelegate) obj2).f53038c.onNext(model4);
                break;
            case 6:
                RowDelegate.Model model5 = (RowDelegate.Model) obj2;
                RowDelegate.Companion companion2 = RowDelegate.INSTANCE;
                ((com.revolut.core.ui_kit.delegates.zf) obj4).R.b0();
                Intrinsics.h(view);
                RowDelegate.C(view, model5);
                ((RowDelegate) obj3).f53218h.onNext(model5);
                break;
            case 7:
                Intrinsics.h(view);
                or0.u.k(view).n0().a(view, (TrackableItem) obj4, (py0.d) obj3);
                ((View.OnClickListener) obj2).onClick(view);
                break;
            default:
                ((GridCellDelegate) obj4).f55868c.onNext(new tq0.c((tq0.a) obj3, ((tq0.f) obj2).getAdapterPosition()));
                break;
        }
    }
}
