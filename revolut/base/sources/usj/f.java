package usj;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonObject f282945c;
    public final Boolean d;

    public /* synthetic */ f(int i, String str, String str2, JsonObject jsonObject, Boolean bool) {
        if (3 != (i & 3)) {
            j1.f(d.f282940a.getDescriptor(), i, 3);
            throw null;
        }
        this.f282943a = str;
        this.f282944b = str2;
        if ((i & 4) == 0) {
            this.f282945c = null;
        } else {
            this.f282945c = jsonObject;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f282943a, fVar.f282943a) && Intrinsics.f(this.f282944b, fVar.f282944b) && Intrinsics.f(this.f282945c, fVar.f282945c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f282943a.hashCode() * 31, 31, this.f282944b);
        JsonObject jsonObject = this.f282945c;
        int iHashCode = (iC + (jsonObject == null ? 0 : jsonObject.f187951a.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public f(String category, String currency, JsonObject jsonObject, Boolean bool) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f282943a = category;
        this.f282944b = currency;
        this.f282945c = jsonObject;
        this.d = bool;
    }
}
