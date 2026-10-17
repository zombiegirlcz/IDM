package rt4;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f257180a = new n();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
        List list = (List) rVar.f314202b;
        return new d(zBooleanValue, d0.V0(list, 3), list.size() > 3, (xp3.c) ((od0.i) rVar.f314203c).f224257a);
    }
}
