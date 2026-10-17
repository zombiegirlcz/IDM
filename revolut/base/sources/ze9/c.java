package ze9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ye9.g;
import yqi.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f321647a = new Regex("(?=.[!@#$%^&*(),.?\"\\[\\]:{}|<>_])");

    public static final class a {
        private a() {
        }
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        String validationData = (String) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (f321647a.b(validationData) == null) {
            return new yqi.d(validationData, g.f312829a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
