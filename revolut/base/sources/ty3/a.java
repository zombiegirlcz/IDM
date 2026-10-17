package ty3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f275463b;

    public a(String formKey, Map parameters) {
        Intrinsics.checkNotNullParameter(formKey, "formKey");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f275462a = formKey;
        this.f275463b = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f275462a, aVar.f275462a) && Intrinsics.f(this.f275463b, aVar.f275463b);
    }

    public final int hashCode() {
        return this.f275463b.hashCode() + (this.f275462a.hashCode() * 31);
    }
}
