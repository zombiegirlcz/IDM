package au0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9238c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f9236a = i;
        this.f9238c = obj2;
        this.f9237b = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f9236a) {
            case 0:
                Intrinsics.h(view);
                f fVar = ((e) this.f9238c).e;
                if (fVar == null) {
                    return true;
                }
                fVar.f9194g.invoke(view, (NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart) this.f9237b);
                return true;
            case 1:
                Intrinsics.h(view);
                NavBarContentCenterView navBarContentCenterView = (NavBarContentCenterView) this.f9238c;
                NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart subtitlePart = (NavBarCenterViewModel.Subtitle.CaptionComplex.SubtitlePart) this.f9237b;
                if (subtitlePart == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                NavBarContentCenterView.b(navBarContentCenterView, view, subtitlePart);
                return true;
            case 2:
                Intrinsics.h(view);
                ((SmallStockCardDelegate) this.f9238c).e.onNext((SmallStockCardDelegate.Model) this.f9237b);
                return true;
            default:
                Intrinsics.h(view);
                ((ChatTableDelegate) this.f9238c).f53905c.onNext((ChatTableDelegate.Model) this.f9237b);
                return true;
        }
    }
}
