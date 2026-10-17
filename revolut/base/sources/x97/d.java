package x97;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.i1;
import zh9.j1;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f303588a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        j1 it8 = (j1) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8 instanceof i1);
    }
}
