package ip0;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.ExtraSmallLoadingTileDelegate;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.delegates.FeedCollectionDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class zf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167456a;

    public /* synthetic */ zf(int i) {
        this.f167456a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f167456a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ag);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof dg);
            case 2:
                Intrinsics.checkNotNullParameter(data, "model");
                return Boolean.valueOf(data instanceof EsimDelegate.Model);
            case 3:
                Intrinsics.checkNotNullParameter(data, "model");
                return Boolean.valueOf(data instanceof EsimDetailsDelegate.Model);
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof kg);
            case 5:
                ResourceImage resourceImage = ExpandableCellDelegate.f;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ExpandableCellDelegate.Model);
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof og);
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ExtraLargeListingCardDelegate.Model);
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof zg);
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ExtraSmallCardDelegate.Model);
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof kh);
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ExtraSmallLoadingTileDelegate.Model);
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof rh);
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof FcaDisclaimerDelegate.Model);
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof FeedCollectionDelegate.Model);
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof di);
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ji);
            case 19:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof FixedTabsDelegate.Model);
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qi);
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ui);
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof yi);
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof FlightSegmentDelegate.Model);
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ej);
            case 25:
                FooterTextLoadingDelegate.Companion aVar = FooterTextLoadingDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ij);
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qj);
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof tj);
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof wj);
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof FullScreenStateDelegate.Model);
        }
    }
}
