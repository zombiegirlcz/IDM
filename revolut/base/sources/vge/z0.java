package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f289067a = new z0();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        ProductAccountMetadata productAccountMetadata = (ProductAccountMetadata) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (productAccountMetadata == null) {
            return error;
        }
        return null;
    }
}
