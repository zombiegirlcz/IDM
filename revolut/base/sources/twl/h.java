package twl;

import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.BackgroundContentView;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import efm.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tx0.h1;
import tx0.k1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f275054b;

    public /* synthetic */ h(int i, Function1 function1) {
        this.f275053a = i;
        this.f275054b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f275053a;
        Function1 function1 = this.f275054b;
        switch (i) {
            case 1:
                ((su0.c) function1).invoke(obj2);
                return;
            case 2:
            case 4:
            case 5:
            case 21:
            default:
                NavBarBottomSheet.Companion companion = NavBarBottomSheet.INSTANCE;
                ((k1) function1).invoke(obj2);
                return;
            case 3:
                ((j) function1).invoke(obj2);
                return;
            case 6:
                AccountSelectionNavBarContentView.Companion companion2 = AccountSelectionNavBarContentView.INSTANCE;
                ((tx0.a) function1).invoke(obj2);
                return;
            case 7:
                AccountSelectionNavBarContentView.Companion companion3 = AccountSelectionNavBarContentView.INSTANCE;
                ((tx0.a) function1).invoke(obj2);
                return;
            case 8:
                AccountSelectionNavBarContentView.Companion companion4 = AccountSelectionNavBarContentView.INSTANCE;
                ((tx0.a) function1).invoke(obj2);
                return;
            case 9:
                ((com.revolut.core.ui_kit.views.navbar.a) function1).invoke(obj2);
                return;
            case 10:
                ((com.revolut.core.ui_kit.views.navbar.a) function1).invoke(obj2);
                return;
            case 11:
                ((com.revolut.core.ui_kit.views.navbar.a) function1).invoke(obj2);
                return;
            case 12:
                ((tx0.a) function1).invoke(obj2);
                throw null;
            case 13:
                ((com.revolut.core.ui_kit.views.navbar.a) function1).invoke(obj2);
                return;
            case 14:
                ((com.revolut.core.ui_kit.views.navbar.a) function1).invoke(obj2);
                return;
            case 15:
                ((com.revolut.core.ui_kit.views.navbar.a) function1).invoke(obj2);
                return;
            case 16:
                ((tx0.a) function1).invoke(obj2);
                return;
            case 17:
                ((tx0.a) function1).invoke(obj2);
                return;
            case 18:
                ((tx0.a) function1).invoke(obj2);
                return;
            case 19:
                ((tx0.a) function1).invoke(obj2);
                return;
            case 20:
                BackgroundContentView.Companion aVar = BackgroundContentView.INSTANCE;
                ((tpl.o) function1).invoke(obj2);
                return;
            case 22:
                ((tpl.o) function1).invoke(obj2);
                return;
            case 23:
                MarketingPhotoHeaderContentView.Companion aVar2 = MarketingPhotoHeaderContentView.INSTANCE;
                ((su0.c) function1).invoke(obj2);
                return;
            case 24:
                MarketingPhotoHeaderContentView.Companion aVar3 = MarketingPhotoHeaderContentView.INSTANCE;
                ((tpl.o) function1).invoke(obj2);
                return;
            case 25:
                NavBar.Companion aVar4 = NavBar.INSTANCE;
                ((h1) function1).invoke(obj2);
                return;
            case 26:
                NavBar.Companion aVar5 = NavBar.INSTANCE;
                ((h1) function1).invoke(obj2);
                return;
            case 27:
                NavBarBottomSheet.Companion companion5 = NavBarBottomSheet.INSTANCE;
                ((k1) function1).invoke(obj2);
                return;
            case 28:
                NavBarBottomSheet.Companion companion6 = NavBarBottomSheet.INSTANCE;
                ((k1) function1).invoke(obj2);
                return;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f275053a) {
            case 0:
                g gVar = (g) this.f275054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) gVar.invoke(p0);
            case 1:
            case 3:
            case 4:
            default:
                tx.f fVar = (tx.f) this.f275054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.views.navbar.e) fVar.invoke(p0);
            case 2:
                j jVar = (j) this.f275054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) jVar.invoke(p0);
            case 5:
                j jVar2 = (j) this.f275054b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) jVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        tsk.j jVar = (tsk.j) this.f275054b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) jVar.invoke(p0)).booleanValue();
    }
}
