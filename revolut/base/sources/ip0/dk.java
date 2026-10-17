package ip0;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalHistogramTileDelegate;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.IdDocumentDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class dk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163916a;

    public /* synthetic */ dk(int i) {
        this.f163916a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        boolean z;
        int i = this.f163916a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ek;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof kk;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof nk;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof pk;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof xk;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof com.revolut.core.ui_kit.delegates.s6;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof gl;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof HeaderDelegate.Model;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof yl;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof HeroBannerDelegate.Model;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof fm;
                break;
            case 11:
                HighlightTileDelegate.Companion aVar = HighlightTileDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof HighlightTileDelegate.Model;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof gn;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof kn;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof qn;
                break;
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof tn;
                break;
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof co;
                break;
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ho;
                break;
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof HorizontalHistogramTileDelegate.Model;
                break;
            case 19:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof no;
                break;
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof qo;
                break;
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof HybridTileDelegate.Model;
                break;
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof IconDelegate.Model;
                break;
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof ep;
                break;
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof IconSelectorDelegate.Model;
                break;
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof IdDocumentDelegate.Model;
                break;
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof xp;
                break;
            case 27:
                Intrinsics.checkNotNullParameter(data, "model");
                z = data instanceof zp;
                break;
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof cq;
                break;
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                z = data instanceof fq;
                break;
        }
        return Boolean.valueOf(z);
    }
}
