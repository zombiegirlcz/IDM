package bu0;

import android.view.View;
import aw0.x8;
import com.revolut.core.ui_kit.internal.views.navbar.preview.WallpaperPreviewView;
import ju0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yw0.f;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x8 f18655b;

    public /* synthetic */ b(x8 x8Var, int i) {
        this.f18654a = i;
        this.f18655b = x8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f18654a;
        x8 x8Var = this.f18655b;
        switch (i) {
            case 0:
                View view = (View) obj2;
                WallpaperPreviewView.Companion companion = WallpaperPreviewView.INSTANCE;
                Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof com.revolut.core.ui_kit.internal.views.navbar.preview.a) {
                    ((com.revolut.core.ui_kit.internal.views.navbar.preview.a) view).r(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
                }
                return Unit.f186387a;
            default:
                a.C1014a it8 = (a.C1014a) obj2;
                f.a aVar = f.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                return x8Var;
        }
    }
}
