package lu6;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f200055a = new q();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set currencies = (Set) obj2;
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return new k(currencies);
    }
}
