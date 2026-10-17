package ss3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginPayload f265262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265263b;

    public b(PluginPayload pluginPayload, String str) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        this.f265262a = pluginPayload;
        this.f265263b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265262a, bVar.f265262a) && Intrinsics.f(this.f265263b, bVar.f265263b);
    }

    public final int hashCode() {
        int iHashCode = this.f265262a.hashCode() * 31;
        String str = this.f265263b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
