package ip0;

import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.core.ui_kit.delegates.WallpaperPreviewDelegate;
import com.revolut.core.ui_kit.delegates.WidgetContainerDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.vaults.R$string;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class qn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166029a;

    public /* synthetic */ qn0(int i) {
        this.f166029a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f166029a) {
            case 0:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.vi);
            case 1:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof un0);
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "model");
                return Boolean.valueOf(data instanceof VoucherExtraSmallTileDelegate.Model);
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof bo0);
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "model");
                return Boolean.valueOf(data instanceof VoucherSmallTileDelegate.Model);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof WalletWidgetDelegate.Model);
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof to0);
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof WallpaperPreviewDelegate.Model);
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.delegates.kj);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof fp0);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof WidgetContainerDelegate.Model);
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof pp0);
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof up0);
            case 14:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new ip4.k(null, null, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), 7);
            case 15:
                Function1 defaultItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new ip7.i(new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), (List) defaultItems.invoke(new iii.d(14, null, false, false, null)), false);
            case 16:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 17:
                Throwable error = (Throwable) obj2;
                ilc.a aVar = (ilc.a) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar != null) {
                    return error;
                }
                return null;
            case 18:
                Function1 errorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return (List) errorItems.invoke(new iii.d(14, null, true, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new lw0.a(new TextLocalisedClause(R$string.vaults_spare_change_bottom_sheet_title, null, null, 14), null, null, null, false, 30);
            case 20:
                Throwable error2 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 21:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 22:
                Throwable error4 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list3 == null) {
                    return error4;
                }
                return null;
            case 23:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.f0.f322471a;
            case 26:
                Throwable th10 = (Throwable) obj2;
                if (((isl.e) data) == null) {
                    return th10;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.f0.f322471a;
            case 28:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar = (od0.i) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar == null) {
                    return error5;
                }
                return null;
            default:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new iug.i(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null)));
        }
    }

    public /* synthetic */ qn0(iug.n nVar) {
        this.f166029a = 29;
    }
}
