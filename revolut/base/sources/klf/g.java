package klf;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f185481a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (PocketWithSubaccount) zhm.d0.d0(it8);
    }
}
