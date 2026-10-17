package oqk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.actions.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(boolean r7, boolean r8) {
        /*
            r0 = 0
            if (r7 == 0) goto L7
            zhm.f0 r7 = zhm.f0.f322471a
        L5:
            r1 = r7
            goto L22
        L7:
            if (r8 == 0) goto Lb
            r1 = r0
            goto L22
        Lb:
            ip0.pb0 r7 = new ip0.pb0
            java.lang.String r8 = "TX_LOADING__1"
            r7.<init>(r8)
            ip0.pb0 r8 = new ip0.pb0
            java.lang.String r1 = "TX_LOADING__2"
            r8.<init>(r1)
            ip0.pb0[] r7 = new ip0.pb0[]{r7, r8}
            java.util.List r7 = zhm.v.k(r7)
            goto L5
        L22:
            if (r1 == 0) goto L2e
            r5 = 0
            r6 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            yp0.b.k(r1, r2, r3, r4, r5, r6)
            return r1
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oqk.m.a(boolean, boolean):java.util.List");
    }

    public static List b(List transactionItems, ParcelableDestination seeAllDestination, int i) {
        Intrinsics.checkNotNullParameter(transactionItems, "transactionItems");
        Intrinsics.checkNotNullParameter(seeAllDestination, "seeAllDestination");
        if (transactionItems.size() > i) {
            transactionItems = zhm.d0.F0(new LargeActionButtonDelegate.Model("TX_WIDGET_LIST_ID_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.home_widget_button_see_all, null, null, 14), false, null, null, seeAllDestination, null, 744), zhm.d0.V0(transactionItems, i));
        }
        List list = transactionItems;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }
}
