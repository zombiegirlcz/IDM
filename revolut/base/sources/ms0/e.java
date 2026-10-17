package ms0;

import android.os.Parcelable;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.AppTipView;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f208232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppTipView f208233c;

    public /* synthetic */ e(View.OnClickListener onClickListener, AppTipView appTipView, int i) {
        this.f208231a = i;
        this.f208232b = onClickListener;
        this.f208233c = appTipView;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r110;
        switch (this.f208231a) {
            case 0:
                this.f208232b.onClick(view);
                Intrinsics.h(view);
                py0.b bVar = new py0.b(new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                AppTipView appTipView = this.f208233c;
                py0.f fVarN0 = or0.u.k(appTipView).n0();
                TrackableItem.Companion companion = TrackableItem.INSTANCE;
                AppTipUIModel boundModel = appTipView.getBoundModel();
                Parcelable parcelable = boundModel != null ? boundModel.f57730j : null;
                companion.getClass();
                fVarN0.a(view, TrackableItem.Companion.a(appTipView, parcelable), bVar);
                break;
            default:
                this.f208232b.onClick(view);
                Intrinsics.h(view);
                AppTipView appTipView2 = this.f208233c;
                AppTipUIModel boundModel2 = appTipView2.getBoundModel();
                py0.c cVar = (boundModel2 == null || (r110 = boundModel2.f57727c) == 0) ? null : new py0.c(r110);
                py0.f fVarN02 = or0.u.k(appTipView2).n0();
                TrackableItem.Companion companion2 = TrackableItem.INSTANCE;
                AppTipUIModel boundModel3 = appTipView2.getBoundModel();
                Parcelable parcelable2 = boundModel3 != null ? boundModel3.f57730j : null;
                companion2.getClass();
                fVarN02.a(view, TrackableItem.Companion.a(appTipView2, parcelable2), cVar);
                break;
        }
    }
}
