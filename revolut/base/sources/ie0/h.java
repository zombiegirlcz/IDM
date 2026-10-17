package ie0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160599b;

    public /* synthetic */ h(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(f.f160597a.getDescriptor(), i, 3);
            throw null;
        }
        this.f160598a = str;
        this.f160599b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f160598a, hVar.f160598a) && Intrinsics.f(this.f160599b, hVar.f160599b);
    }

    public final int hashCode() {
        return this.f160599b.hashCode() + (this.f160598a.hashCode() * 31);
    }

    public h(String value, String currency) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f160598a = value;
        this.f160599b = currency;
    }
}
