package ise;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f168192a = new c0();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        n38.a content = (n38.a) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return l38.a.c(content);
    }
}
