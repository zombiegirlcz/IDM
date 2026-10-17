package a97;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface g {
    default Object d(gim.c cVar) {
        return Boolean.TRUE;
    }

    h e();

    k f();

    default void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
    }

    default boolean isEnabled() {
        return true;
    }
}
