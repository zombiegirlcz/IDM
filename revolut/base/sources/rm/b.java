package rm;

import ihm.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f255130a;

    public b() {
        j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f255130a = jVarD;
    }

    @Override // rm.f
    public final j a() {
        return this.f255130a;
    }
}
