package sua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265695a;

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f265695a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f265695a, ((a) obj2).f265695a);
    }

    public final int hashCode() {
        return this.f265695a.hashCode();
    }
}
