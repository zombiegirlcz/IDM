package e31;

import com.revolut.domain.models.topup.TopUpType;
import java.util.Map;
import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f122185a = r0.k(new Pair("CARD", TopUpType.CARD), new Pair("DEPOSIT_CHECK", TopUpType.DEPOSIT_CHECK), new Pair("GOOGLE_PAY", TopUpType.GOOGLE_PAY), new Pair("EXTERNAL_POCKET_ONE_OFF_TOPUP", TopUpType.EXTERNAL_POCKET_ONE_OFF_TOPUP), new Pair("CARD_ONE_OFF_TOPUP", TopUpType.CARD_ONE_OFF_TOPUP), new Pair("MULIT_CURRENCY", TopUpType.MULTI_CURRENCY), new Pair("PREORDER_AND_PAY_LATER", TopUpType.PREORDER_AND_PAY_LATER), new Pair("PIX", TopUpType.PIX), new Pair("NONE", TopUpType.NONE));

    private k() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Map a() {
        return f122185a;
    }
}
