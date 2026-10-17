package fjj;

import dej.t1;
import dej.w2;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f135675a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t1 subscription = (t1) obj2;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        w2 w2Var = subscription.k;
        return Optional.ofNullable(w2Var != null ? w2Var.f113681a : null);
    }
}
