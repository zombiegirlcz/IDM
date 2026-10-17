package tnb;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f272418a = new v();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return (List) getDefaultErrorItems.invoke(new iii.d(8, null, true, false, "savings_challenge_error_state_id"));
    }
}
