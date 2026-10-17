package ip0;

import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherRoundedDelegate;
import com.revolut.core.ui_kit.delegates.ThumbnailPreviewDelegate;
import com.revolut.core.ui_kit.delegates.TransactionsCountPreviewDelegate;
import com.revolut.core.ui_kit.delegates.TransferAmountPagePreviewDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ri0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166194a;

    public /* synthetic */ ri0(int i) {
        this.f166194a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        int i = this.f166194a;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ui0);
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof xi0);
            case 2:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ej0);
            case 3:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof jj0);
            case 4:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf((data instanceof ThumbnailPreviewDelegate.Model) && ((ThumbnailPreviewDelegate.Model) data).f == com.revolut.core.ui_kit.delegates.ei.SYSTEM);
            case 5:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TabsDelegate.Model);
            case 6:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qj0);
            case 7:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof vj0);
            case 8:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TextDelegate.Model);
            case 9:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof jk0);
            case 10:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.ci);
            case 11:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ThemeSwitcherRoundedDelegate.Item);
            case 12:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof cl0);
            case 13:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof fl0);
            case 14:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof jl0);
            case 15:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 16:
                TransactionsCountPreviewDelegate.Companion aVar = TransactionsCountPreviewDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof nl0);
            case 17:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof rl0);
            case 18:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof vl0);
            case 19:
                TransferAmountPagePreviewDelegate.a aVar2 = TransferAmountPagePreviewDelegate.Companion;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TransferAmountPagePreviewDelegate.Model);
            case 20:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof zl0);
            case 21:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof dm0);
            case 22:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof jm0);
            case 23:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof TripDetailsDelegate.Model);
            case 24:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qm0);
            case 25:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof um0);
            case 26:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof an0);
            case 27:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof gn0);
            case 28:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof VaultsProgressDelegate.Model);
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof on0);
        }
    }
}
