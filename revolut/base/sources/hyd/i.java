package hyd;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156805c;
    public final JsonObject d;

    public /* synthetic */ i(int i, String str, String str2, String str3, JsonObject jsonObject) {
        if (1 != (i & 1)) {
            j1.f(g.f156798a.getDescriptor(), i, 1);
            throw null;
        }
        this.f156803a = str;
        if ((i & 2) == 0) {
            this.f156804b = null;
        } else {
            this.f156804b = str2;
        }
        if ((i & 4) == 0) {
            this.f156805c = null;
        } else {
            this.f156805c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jsonObject;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f156803a, iVar.f156803a) && Intrinsics.f(this.f156804b, iVar.f156804b) && Intrinsics.f(this.f156805c, iVar.f156805c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f156803a.hashCode() * 31;
        String str = this.f156804b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156805c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        JsonObject jsonObject = this.d;
        return iHashCode3 + (jsonObject != null ? jsonObject.f187951a.hashCode() : 0);
    }
}
