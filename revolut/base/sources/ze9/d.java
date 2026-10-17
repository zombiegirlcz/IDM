package ze9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yqi.f;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        String validationData = (String) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.length() < 8) {
            return new yqi.d(validationData, ye9.d.f312823a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
