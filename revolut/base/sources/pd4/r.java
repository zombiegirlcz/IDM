package pd4;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.Keyword;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f235086a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Keyword it8 = (Keyword) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.f66470a + "(" + it8.f66471b + ")";
    }
}
