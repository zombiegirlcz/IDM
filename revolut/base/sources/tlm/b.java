package tlm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f272126a;

    public b(Function1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f272126a = provider;
    }

    @Override // tlm.c
    public final KSerializer a(List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return (KSerializer) this.f272126a.invoke(typeArgumentsSerializers);
    }

    public final Function1 b() {
        return this.f272126a;
    }
}
