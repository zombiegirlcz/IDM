package rnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f255629a = new q();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (AnalyticsAccount) zhm.d0.d0(it8);
    }
}
