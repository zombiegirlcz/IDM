package twb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f275004a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        m1c.z status = (m1c.z) obj2;
        Intrinsics.checkNotNullParameter(status, "status");
        m1c.y yVar = status instanceof m1c.y ? (m1c.y) status : null;
        if (yVar != null) {
            return yVar.f201475a;
        }
        return null;
    }
}
