package m93;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import h93.f0;
import ia3.r;
import ia3.t;
import kotlin.jvm.internal.Intrinsics;
import yt8.i;

/* JADX INFO: loaded from: classes21.dex */
public interface c {
    static RowDelegate.Model a(ia3.f fVar, f0 card, i kycStatus, boolean z, String str) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        r rVar = fVar.f159933a;
        return new RowDelegate.Model(card.f150110a, new RowDelegate.Model.MainImage.Image40(((t) fVar.f159934b).d(card, true), rVar.j(card, kycStatus, null), null, false, 28), f.b(rVar, card, str, null, 8), null, 0, rVar.m(card, kycStatus, null), null, null, 0, null, false, null, z, null, null, null, null, null, null, card, null, 0, 0, 0, 0, 532668376);
    }
}
