package bq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f17706a = new e1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return CryptoAddressHostingCheckResult.NotFound.f71075a;
    }
}
