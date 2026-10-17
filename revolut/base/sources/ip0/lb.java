package ip0;

import com.revolut.core.ui_kit.delegates.ComponentDelegate;
import com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.DialogHeaderSubtitleDelegate;
import com.revolut.core.ui_kit.delegates.DrivingScoreDelegate;
import com.revolut.core.ui_kit.delegates.EmojiDelegate;
import com.revolut.core.ui_kit.delegates.EmojiImageDelegate;
import com.revolut.core.ui_kit.delegates.ThumbnailPreviewDelegate;
import java.time.LocalDate;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class lb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165167a;

    public /* synthetic */ lb(int i) {
        this.f165167a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        bv0.b bVar;
        boolean z = false;
        switch (this.f165167a) {
            case 0:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.g4);
            case 1:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof nb);
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qb);
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 4:
                Integer num = (Integer) obj2;
                num.getClass();
                ComponentDelegate.a aVar = ComponentDelegate.Companion;
                Intrinsics.checkNotNullParameter(data, "data");
                cc ccVar = data instanceof cc ? (cc) data : null;
                if (ccVar != null && (bVar = ccVar.f163710b) != null && ((Boolean) jij.m.f174586a.invoke(num, bVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof kc);
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof xc);
            case 7:
                ((Integer) obj2).intValue();
                int i = ContextualBarChartDelegate.f52126l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ContextualBarChartDelegate.Model);
            case 8:
                ((Integer) obj2).intValue();
                int i2 = ContextualLineChartDelegate.f52136l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ContextualLineChartDelegate.Model);
            case 9:
                ((Integer) obj2).intValue();
                int i3 = ContextualSegmentedBarDelegate.f52146l;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ContextualSegmentedBarDelegate.Model);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof dd);
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof id);
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CounterTextDelegate.Model);
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof ThumbnailPreviewDelegate.Model) && ((ThumbnailPreviewDelegate.Model) data).f == com.revolut.core.ui_kit.delegates.ei.DARK) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.g5);
            case 15:
                od0.i selectedDateOptional = (od0.i) obj2;
                LocalDate presentedMonth = (LocalDate) data;
                Intrinsics.checkNotNullParameter(selectedDateOptional, "selectedDateOptional");
                Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
                return new Pair(selectedDateOptional, presentedMonth);
            case 16:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof DetailGridItemDelegate.Model);
            case 17:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ce);
            case 18:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 19:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof DialogHeaderSubtitleDelegate.Model);
            case 20:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ke);
            case 21:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ne);
            case 22:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof re);
            case 23:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof bf);
            case 24:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof DrivingScoreDelegate.Model);
            case 25:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof gf);
            case 26:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof EmojiDelegate.Model);
            case 27:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof EmojiImageDelegate.Model);
            case 28:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            default:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof xf);
        }
    }
}
