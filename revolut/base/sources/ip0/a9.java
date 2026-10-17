package ip0;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.ComponentDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import java.time.LocalDate;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a9 implements kfm.o, kfm.g, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f163412b;

    public /* synthetic */ a9(Function function, int i) {
        this.f163411a = i;
        this.f163412b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f163411a) {
            case 16:
                ((ijg.c) this.f163412b).invoke(obj2);
                break;
            case 17:
            default:
                ((ad) this.f163412b).invoke(obj2);
                break;
            case 18:
                ((ad) this.f163412b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f163411a;
        Function function = this.f163412b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (aw0.f4) ((z8) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CenteredAmountDelegate.Model) ((z8) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CenteredAmountDelegate.Model) ((z8) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CenteredAmountDelegate.Model) ((z8) function).invoke(p0);
            case 4:
                ChatContextualChartDelegate.Companion aVar = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.h3) ((ja) function).invoke(p0);
            case 5:
                ChatContextualChartDelegate.Companion aVar2 = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.f3) ((ja) function).invoke(p0);
            case 6:
                ChatContextualChartDelegate.Companion aVar3 = ChatContextualChartDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.g3) ((ja) function).invoke(p0);
            case 7:
                ChatItemsDelegate.Companion aVar4 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.i3) ((la) function).invoke(p0);
            case 8:
                ChatItemsDelegate.Companion aVar5 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.i3) ((la) function).invoke(p0);
            case 9:
                ChatItemsDelegate.Companion aVar6 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.i3) ((la) function).invoke(p0);
            case 10:
                ChatItemsDelegate.Companion aVar7 = ChatItemsDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.i3) ((la) function).invoke(p0);
            case 11:
                ChatTilesCollectionDelegate.Companion aVar8 = ChatTilesCollectionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.r3) ((qa) function).invoke(p0);
            case 12:
                ChatTilesCollectionDelegate.Companion aVar9 = ChatTilesCollectionDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.o3) ((qa) function).invoke(p0);
            case 13:
                int i2 = ChatTravelPreviewDelegate.f52077l;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.s3) ((ii4.b) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CircleActionButtonsBarDelegate.CircleActionButton) ((ijg.c) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((za) function).invoke(p0);
            case 16:
            case 18:
            case 19:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rh) ((ph) function).invoke(p0);
            case 17:
                ComponentDelegate.Companion aVar10 = ComponentDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wb) ((ii4.b) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CounterTextDelegate.Model) ((ad) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vd) ((ud) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((za) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocalDate) ((za) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wd) ((ud) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((ad) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((ad) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ExtraLargeListingCardDelegate.Model) ((ad) function).invoke(p0);
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        lb lbVar = (lb) this.f163412b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) lbVar.invoke(p0, p17);
    }
}
