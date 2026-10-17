package yki;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h extends b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static boolean a(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getBoolean("FLOW_TRANSIENT_STATE_ARG", false);
        }
    }
}
