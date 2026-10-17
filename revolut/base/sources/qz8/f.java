package qz8;

import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250382a;

    public /* synthetic */ f(int i) {
        this.f250382a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f250382a) {
            case 0:
                return pz8.b.Companion.serializer();
            case 1:
                return pz8.g.Companion.serializer();
            case 2:
                return zz8.c.INSTANCE.serializer();
            case 3:
                return n.Companion.serializer();
            case 4:
                return new qlm.e(v1.f247718a);
            case 5:
                return new qlm.e(g.f250383a);
            case 6:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.course.CourseStateDto", n.values(), new String[]{"AVAILABLE", "PROGRESS", "LOCKED"}, new Annotation[][]{null, null, null});
            case 7:
                return zz8.c.INSTANCE.serializer();
            case 8:
                return new qlm.e(a.f250379a);
            case 9:
                return new qlm.e(uz8.l.f284639a);
            case 10:
                return new qlm.e(uz8.i.INSTANCE.serializer());
            case 11:
                return pz8.b.Companion.serializer();
            case 12:
                return pz8.g.Companion.serializer();
            case 13:
                return zz8.c.INSTANCE.serializer();
            case 14:
                return n.Companion.serializer();
            case 15:
                return new qlm.e(v1.f247718a);
            case 16:
                KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                return v.k(new CellDetailsDelegate(), new ListSubheaderDelegate());
            case 17:
                KProperty[] kPropertyArr2 = McyExchangeRateScreen.U;
                return new ListCellDelegate();
            case 18:
                KProperty[] kPropertyArr3 = McyExchangeRateScreen.U;
                return new CellDetailsDelegate();
            case 19:
                KProperty[] kPropertyArr4 = McyExchangeRateScreen.U;
                return new CellDetailsNoteDelegate();
            case 20:
                KProperty[] kPropertyArr5 = McyExchangeRateScreen.U;
                return new CellDetailsActionDelegate();
            case 21:
                return TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider$lambda$0();
            case 22:
                return TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider$lambda$0();
            case 23:
                KProperty[] kPropertyArr6 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsDelegate();
            case 24:
                KProperty[] kPropertyArr7 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsActionDelegate();
            case 25:
                KProperty[] kPropertyArr8 = BankTransferReviewScreen.f102115n0;
                return new CellDetailsNoteDelegate();
            case 26:
                KProperty[] kPropertyArr9 = BankTransferReviewScreen.f102115n0;
                return new LargeActionButtonDelegate();
            case 27:
                KProperty[] kPropertyArr10 = BankTransferReviewScreen.f102115n0;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr11 = BankTransferReviewScreen.f102115n0;
                return new HighlightTileDelegate();
            default:
                KProperty[] kPropertyArr12 = BankTransferReviewScreen.f102115n0;
                return new TextDelegate();
        }
    }
}
