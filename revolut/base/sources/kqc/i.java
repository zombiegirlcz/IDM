package kqc;

import com.revolut.feature.salary_switch.impl.models.v2.Institution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f188366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Institution f188367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f188368c;

    public i(h scheme, Institution sourceAgent, a aVar) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(sourceAgent, "sourceAgent");
        this.f188366a = scheme;
        this.f188367b = sourceAgent;
        this.f188368c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f188366a == iVar.f188366a && Intrinsics.f(this.f188367b, iVar.f188367b) && Intrinsics.f(this.f188368c, iVar.f188368c);
    }

    public final int hashCode() {
        int iHashCode = (this.f188367b.hashCode() + (this.f188366a.hashCode() * 31)) * 961;
        a aVar = this.f188368c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
