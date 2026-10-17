package bkc;

import aw0.p9;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final TextLocalisedQuantityClause a(double d, p9 signShowingPolicy) {
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return nub.a.q(qvb.a.a(d), null, new nub.b(signShowingPolicy), null, 5);
    }
}
