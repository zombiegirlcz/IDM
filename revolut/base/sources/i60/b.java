package i60;

import h60.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static f a(com.revolut.kompot.navigable.a controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new f(controller);
        }
    }
}
