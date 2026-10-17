package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o2 extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        View p0 = (View) obj2;
        NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart p17 = (NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        NavBarContentCenterView.b((NavBarContentCenterView) this.receiver, p0, p17);
        return Unit.f186387a;
    }
}
