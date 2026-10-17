package zsc;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static c a(Function1 predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return new c(predicate);
        }
    }

    public abstract boolean a(Object obj2);

    public boolean equals(Object obj2) {
        if (this != obj2) {
            return getClass().equals(obj2 != null ? obj2.getClass() : null);
        }
        return true;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
