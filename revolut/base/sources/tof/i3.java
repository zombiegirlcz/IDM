package tof;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i3 implements Serializable {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static k3 a() {
            return new k3(l2.GENERAL);
        }
    }

    private i3() {
    }

    public abstract String getId();
}
