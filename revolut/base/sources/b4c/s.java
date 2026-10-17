package b4c;

import com.revolut.feature.revolut_shop.api.domain.model.FiscalProfileDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f12277a = new s();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FiscalProfileDetails it8 = (FiscalProfileDetails) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.f84193b;
    }
}
