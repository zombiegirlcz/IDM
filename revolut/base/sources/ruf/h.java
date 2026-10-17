package ruf;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h {
    public static final g a(PurchasedTransitTicket.Activated activated, long j2) {
        int i;
        Intrinsics.checkNotNullParameter(activated, "<this>");
        LocalDateTime localDateTime = activated.f92643t.f92701a;
        if (localDateTime == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jR = oi0.d.R(localDateTime);
        LocalDateTime localDateTime2 = activated.f92643t.f92702b;
        if (localDateTime2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jR2 = oi0.d.R(localDateTime2);
        if (jR > jR2) {
            return new g(0, 0, R$attr.uikit_colorBlack);
        }
        int iMin = (int) Math.min(Math.max((Math.abs(j2 - jR) * ((long) 100)) / (jR2 - jR), 0L), 100L);
        int i2 = iMin >= 0 ? iMin == 100 ? 100 : iMin > 100 ? iMin : 100 - iMin : 0;
        if (iMin < 0) {
            IllegalStateException illegalStateException = new IllegalStateException("Percent should be between 0 and 100");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
            i = R$attr.uikit_colorBlack;
        } else if (iMin <= 50) {
            i = R$attr.uikit_colorGreen;
        } else if (iMin <= 70) {
            i = R$attr.uikit_colorOrange;
        } else if (iMin <= 100) {
            i = R$attr.uikit_colorRed;
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Percent should be between 0 and 100");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
            i = R$attr.uikit_colorGreyTone10;
        }
        return new g(iMin, i2, i);
    }
}
