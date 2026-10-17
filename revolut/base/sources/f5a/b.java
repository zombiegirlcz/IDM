package f5a;

import kkd.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // kkd.f
    public final Boolean b(kkd.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return Boolean.valueOf(d0.J(event.a(), "revolut://app/payments/set-profile-pic", false));
    }
}
