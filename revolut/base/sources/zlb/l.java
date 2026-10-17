package zlb;

import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f323220b;

    public /* synthetic */ l(List list, int i) {
        this.f323219a = i;
        this.f323220b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323219a) {
            case 0:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new a(this.f323220b, (OnboardingConfig) it8.g());
            default:
                return zs2.k.a((zs2.k) obj2, false, this.f323220b, null, null, 13);
        }
    }
}
