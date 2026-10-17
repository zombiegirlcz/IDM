package hl6;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f153004a = new s();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        od0.i content = (od0.i) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        Boolean bool = (Boolean) content.f224257a;
        return bool == null ? h.UNAVAILABLE : bool.equals(Boolean.TRUE) ? h.ENABLED : h.DISABLED;
    }
}
