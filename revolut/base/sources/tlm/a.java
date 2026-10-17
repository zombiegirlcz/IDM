package tlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f272125a;

    public a(KSerializer serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f272125a = serializer;
    }

    @Override // tlm.c
    public final KSerializer a(List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return this.f272125a;
    }

    public final KSerializer b() {
        return this.f272125a;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof a) && Intrinsics.f(((a) obj2).f272125a, this.f272125a);
    }

    public final int hashCode() {
        return this.f272125a.hashCode();
    }
}
