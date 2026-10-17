package pz5;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements oz5.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // oz5.a
    public final String name() {
        return "Revolut-Device-Model";
    }

    @Override // oz5.a
    public final String value() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return f0.U0(150, MODEL);
    }
}
