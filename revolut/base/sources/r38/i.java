package r38;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f251212a = new i();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i jointAccountOptional = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(jointAccountOptional, "jointAccountOptional");
        od0.i.Companion.getClass();
        return new Pair(od0.i.f224256b, jointAccountOptional);
    }
}
