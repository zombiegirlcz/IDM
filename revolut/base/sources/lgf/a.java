package lgf;

import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethod.StoredMethod f195110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoTopUpState f195111b;

    public a(TopupMethod.StoredMethod method, AutoTopUpState state) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f195110a = method;
        this.f195111b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f195110a, aVar.f195110a) && Intrinsics.f(this.f195111b, aVar.f195111b);
    }

    public final int hashCode() {
        return this.f195111b.hashCode() + (this.f195110a.hashCode() * 31);
    }
}
