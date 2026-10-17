package tb;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y extends kotlin.jvm.internal.u implements Function2 {
    public static final y f = new y(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SaverScope listSaver = (SaverScope) obj2;
        a0 it8 = (a0) obj3;
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it8, "it");
        return zhm.u.c(Integer.valueOf(it8.b()));
    }
}
