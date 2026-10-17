package p35;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements Serializable {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f232601c = new a0("", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f232603b;

    public a0(String key, List list) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f232602a = key;
        this.f232603b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f232602a, a0Var.f232602a) && Intrinsics.f(this.f232603b, a0Var.f232603b);
    }

    public final int hashCode() {
        int iHashCode = this.f232602a.hashCode() * 31;
        List list = this.f232603b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
