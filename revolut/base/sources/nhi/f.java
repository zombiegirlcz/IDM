package nhi;

import aii.u;
import aii.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface f extends h {

    @NotNull
    public static final e Companion = e.f215501a;

    default aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    default Object d(x xVar, Continuation continuation) {
        return null;
    }

    com.revolut.kompot.navigable.a g(u uVar, dki.g gVar);

    default u i(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return null;
    }
}
