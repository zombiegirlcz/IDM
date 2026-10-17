package qp5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoWithdrawToAddressConfirmationActivity f248252b;

    public /* synthetic */ a(CryptoWithdrawToAddressConfirmationActivity cryptoWithdrawToAddressConfirmationActivity, int i) {
        this.f248251a = i;
        this.f248252b = cryptoWithdrawToAddressConfirmationActivity;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f248251a;
        CryptoWithdrawToAddressConfirmationActivity cryptoWithdrawToAddressConfirmationActivity = this.f248252b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), new ListCellDelegate(), (CellDetailsDelegate) cryptoWithdrawToAddressConfirmationActivity.f71168x0.getValue(), (CellDetailsActionDelegate) cryptoWithdrawToAddressConfirmationActivity.f71167w0.getValue(), cryptoWithdrawToAddressConfirmationActivity.y0, new PlainTextWarningDelegate(), cryptoWithdrawToAddressConfirmationActivity.D0, cryptoWithdrawToAddressConfirmationActivity.B0, cryptoWithdrawToAddressConfirmationActivity.C0, (RowDelegate) cryptoWithdrawToAddressConfirmationActivity.z0.getValue(), (HighlightTileDelegate) cryptoWithdrawToAddressConfirmationActivity.A0.getValue()), false);
            case 1:
                KProperty[] kPropertyArr2 = CryptoWithdrawToAddressConfirmationActivity.I0;
                return new z4l.j(7, zhm.v.k(new CellDetailsDelegate(), (LargeActionButtonDelegate) cryptoWithdrawToAddressConfirmationActivity.F0.getValue(), (TwinHorizontalButtonDelegate) cryptoWithdrawToAddressConfirmationActivity.G0.getValue(), new PlainTextDelegate()), false);
            default:
                return (z4l.j) cryptoWithdrawToAddressConfirmationActivity.H0.getValue();
        }
    }
}
