package rm;

import efm.i;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f255131a;

    public c() {
        j jVarD = new gam.b(i.f125385a, hhm.f.f152430b).d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f255131a = jVarD;
    }

    @Override // rm.f
    public final j a() {
        return this.f255131a;
    }
}
