package ip0;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CardDesignCatalogueDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164337a;

    public /* synthetic */ g4(int i) {
        this.f164337a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f164337a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof BigTileDelegate.Model);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof v4);
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CalendarRowDelegate.Model);
            case 3:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof b5);
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof g5);
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CardDesignCatalogueDelegate.Model);
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof m5);
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof o5);
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.a2);
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof t5);
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsActionDelegate.Model);
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsActionListDelegate.Model);
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof f6);
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsAttachmentDelegate.Model);
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof q6);
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof t6);
            case 16:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsChevronDelegate.Model);
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsDelegate.Model);
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 19:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsHeadlineDelegate.Model);
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof g7);
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof i7);
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof m7);
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsListDelegate.Model);
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof s7);
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof CellDetailsNoteDelegate.Model);
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof w7);
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof y7);
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof b8);
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof e8);
        }
    }
}
