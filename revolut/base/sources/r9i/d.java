package r9i;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f252731a = new d();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
        return null;
    }
}
