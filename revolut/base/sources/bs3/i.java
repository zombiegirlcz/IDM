package bs3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f18041c;

    public i(String eventName, Map parameters, g providerType) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(providerType, "providerType");
        this.f18039a = eventName;
        this.f18040b = parameters;
        this.f18041c = providerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f18039a, iVar.f18039a) && Intrinsics.f(this.f18040b, iVar.f18040b) && this.f18041c == iVar.f18041c;
    }

    public final int hashCode() {
        return this.f18041c.hashCode() + p.a.e(this.f18039a.hashCode() * 31, 31, this.f18040b);
    }

    public /* synthetic */ i(String str, g gVar) {
        this(str, r0.g(), gVar);
    }
}
