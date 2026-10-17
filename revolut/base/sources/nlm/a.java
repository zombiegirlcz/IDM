package nlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.KSerializer;
import qlm.c1;
import qlm.e;
import qlm.h0;
import qlm.v1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final e a(KSerializer elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new e(elementSerializer);
    }

    public static final h0 b(KSerializer keySerializer, KSerializer valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new h0(keySerializer, valueSerializer, 1);
    }

    public static final KSerializer c(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().f() ? kSerializer : new c1(kSerializer);
    }

    public static final void d(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        v1 v1Var = v1.f247718a;
    }
}
