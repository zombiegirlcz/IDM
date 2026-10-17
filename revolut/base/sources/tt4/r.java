package tt4;

import com.revolut.feature.credit.card.models.CreditCard;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f274228a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CreditCard it8 = (CreditCard) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.f69800n;
    }
}
