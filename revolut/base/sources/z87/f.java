package z87;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import o97.y;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public interface f {
    default boolean b() {
        return false;
    }

    default void c(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
    }

    default void d() {
    }

    default void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
    }

    r h();

    default Set j() {
        return h0.f322473a;
    }

    default Object k(o97.b bVar) {
        return o97.e.f223096a;
    }

    Object l(String str, y yVar, Continuation continuation);
}
