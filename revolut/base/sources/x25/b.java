package x25;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x15.b0;
import x15.c0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f302507a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b0 application = (b0) obj2;
        Intrinsics.checkNotNullParameter(application, "application");
        return new c0(application);
    }
}
