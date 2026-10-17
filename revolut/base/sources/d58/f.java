package d58;

import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends Serializable {

    @NotNull
    public static final a Companion = a.f111395a;

    default String e5() {
        if (this instanceof e) {
            return ((e) this).f111401c;
        }
        if (this instanceof d) {
            return ((d) this).f111398b;
        }
        if (this instanceof b) {
            return ((b) this).f111396a.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
