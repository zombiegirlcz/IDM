package klf;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j2 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f185517a = new j2();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        od0.i content = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        v61.h hVar = (v61.h) content.g();
        return hVar != null ? new q2(hVar) : o2.f185549a;
    }
}
