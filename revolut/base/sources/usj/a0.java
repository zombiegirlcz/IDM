package usj;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonObject f282934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f282935c;

    public /* synthetic */ a0(int i, String str, JsonObject jsonObject, Boolean bool) {
        if (1 != (i & 1)) {
            j1.f(y.f282977a.getDescriptor(), i, 1);
            throw null;
        }
        this.f282933a = str;
        if ((i & 2) == 0) {
            this.f282934b = null;
        } else {
            this.f282934b = jsonObject;
        }
        if ((i & 4) == 0) {
            this.f282935c = null;
        } else {
            this.f282935c = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f282933a, a0Var.f282933a) && Intrinsics.f(this.f282934b, a0Var.f282934b) && Intrinsics.f(this.f282935c, a0Var.f282935c);
    }

    public final int hashCode() {
        int iHashCode = this.f282933a.hashCode() * 31;
        JsonObject jsonObject = this.f282934b;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.f187951a.hashCode())) * 31;
        Boolean bool = this.f282935c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public a0(String currency, JsonObject jsonObject, Boolean bool) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f282933a = currency;
        this.f282934b = jsonObject;
        this.f282935c = bool;
    }
}
