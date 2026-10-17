package mwk;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f209525a = new r();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        od0.i iVar = (od0.i) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (iVar == null) {
            return error;
        }
        return null;
    }
}
