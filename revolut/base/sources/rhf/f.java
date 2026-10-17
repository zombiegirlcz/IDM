package rhf;

import java.util.Set;
import k71.i;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f254446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f254447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f254448c;

    public f(i transactionDescriptor, d entryPoint, Set additionalConfig) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
        this.f254446a = transactionDescriptor;
        this.f254447b = entryPoint;
        this.f254448c = additionalConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f254446a, fVar.f254446a) && this.f254447b == fVar.f254447b && Intrinsics.f(this.f254448c, fVar.f254448c);
    }

    public final int hashCode() {
        return this.f254448c.hashCode() + ((this.f254447b.hashCode() + (this.f254446a.hashCode() * 31)) * 31);
    }

    public f(i iVar, d dVar) {
        this(iVar, dVar, h0.f322473a);
    }
}
