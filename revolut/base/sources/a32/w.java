package a32;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f1041a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        m update = (m) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return m.a(update, null, null, Data.copy$default(update.e, null, null, true, 3, null), 15);
    }
}
