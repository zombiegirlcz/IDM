package ci7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g(with = x.class)
public final class v {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24425b;

    public v(String key, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f24424a = key;
        this.f24425b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f24424a, vVar.f24424a) && this.f24425b.equals(vVar.f24425b);
    }

    public final int hashCode() {
        return this.f24425b.hashCode() + (this.f24424a.hashCode() * 31);
    }
}
