package hk5;

import kotlin.jvm.internal.t0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements sj5.b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final String a(String str) {
        if (str != null) {
            return str.length() > 12 ? com.google.android.gms.internal.mlkit_vision_face.a.o(f0.U0(6, str), "…", f0.V0(6, str)) : str;
        }
        m70.a.c(t0.f186434a);
        return "";
    }
}
