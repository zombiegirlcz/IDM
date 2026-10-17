package xji;

import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface b extends a {
    default void P1(com.revolut.kompot.navigable.a aVar, com.revolut.kompot.navigable.a aVar2, TransitionAnimation transition, boolean z) {
        Intrinsics.checkNotNullParameter(transition, "transition");
    }

    default void f2(ControllerKey key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
