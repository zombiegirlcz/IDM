package lye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.d;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.e;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.f;
import grl.k;
import kotlin.NoWhenBranchMatchedException;
import vye.g;
import vye.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SelectedMethod f200810a;

    public static k a(SelectedMethod selectedMethod) {
        if (selectedMethod instanceof SelectedMethod.StoredMethod.Card) {
            return k.CARD;
        }
        if (selectedMethod instanceof d) {
            return k.CONNECTED_BANK;
        }
        if (selectedMethod instanceof e) {
            return k.PAY_TO;
        }
        if (!(selectedMethod instanceof f) && !(selectedMethod instanceof g)) {
            if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) {
                return ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) selectedMethod).f90918g ? k.MCY_NET_BANKING : k.NET_BANKING;
            }
            if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) {
                return ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) selectedMethod).f90932g ? k.MCY_UPI_APP : k.UPI_APP;
            }
            if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.a) {
                return k.AKAHU;
            }
            if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.b) {
                return k.GMO_PG_BANK_DIRECT;
            }
            if (selectedMethod instanceof vye.b) {
                return k.ADD_CARD;
            }
            if (selectedMethod instanceof vye.a) {
                return k.CASH;
            }
            if ((selectedMethod instanceof vye.e) || (selectedMethod instanceof vye.f) || (selectedMethod instanceof h)) {
                return k.DIRECT_BANK;
            }
            if (!(selectedMethod instanceof vye.d)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (a.f200809a[((vye.d) selectedMethod).e.ordinal()]) {
                case 1:
                    return k.XPAY;
                case 2:
                    return k.DIRECT_BANK;
                case 3:
                case 4:
                    return k.REVOLUT_ACCOUNT;
                case 5:
                    return k.PAY_TO;
                case 6:
                    return k.PIX;
                case 7:
                    return k.PIX_SMART_TRANSFER;
                case 8:
                case 9:
                case 19:
                    return null;
                case 10:
                    return k.UPI_APP;
                case 11:
                    return k.MCY_UPI_APP;
                case 12:
                    return k.NET_BANKING;
                case 13:
                    return k.MCY_NET_BANKING;
                case 14:
                    return k.MCY_BANK_TRANSFER;
                case 15:
                    return k.IDEAL;
                case 16:
                    return k.CHECK;
                case 17:
                    return k.AKAHU;
                case 18:
                    return k.PAYNOW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return k.PIX_SMART_TRANSFER;
    }
}
