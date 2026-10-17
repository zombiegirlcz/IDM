package dsh;

import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Serializable {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f117319a;

    public e(f builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f117319a = builder.f117320a;
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj2 = this.f117319a.get(key);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!e.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.widgets.api.model.WidgetConfiguration");
        return Intrinsics.f(this.f117319a, ((e) obj2).f117319a);
    }

    public final int hashCode() {
        return this.f117319a.hashCode();
    }

    public final String toString() {
        return "WidgetConfiguration(map=" + this.f117319a + ")";
    }
}
