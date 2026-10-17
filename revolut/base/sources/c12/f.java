package c12;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface f {
    default boolean A(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return false;
    }

    default Clause Z0() {
        return null;
    }

    default void d(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    default String t0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    void x(ApmContact apmContact, hrf.f fVar);
}
