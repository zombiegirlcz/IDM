package m1i;

import com.revolut.feature.exchange.models.ExchangeResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v {
    public static final boolean a(ExchangeResult.Success success) {
        Intrinsics.checkNotNullParameter(success, "<this>");
        return cp5.d.z(success.f72153a.f115083b) || cp5.d.z(success.f72154b.f115083b);
    }
}
