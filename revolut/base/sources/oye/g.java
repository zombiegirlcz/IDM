package oye;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3i.b f231033a;

    public g(n3i.b externalCardMapper) {
        Intrinsics.checkNotNullParameter(externalCardMapper, "externalCardMapper");
        this.f231033a = externalCardMapper;
    }

    public static TextLocalisedClause a(Object obj2, Object obj3) {
        return new TextLocalisedClause(R$string.topup_amount_method_and_currency, v.k(obj2, obj3), null, 12);
    }
}
