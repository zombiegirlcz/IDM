package tqa;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f273544a = w.y0(new tl7.a(13));

    public static final class a {
        private a() {
        }
    }

    public static String a(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (str == null) {
            return text;
        }
        if (d0.J(str, "{ }", false) || d0.J(str, " ", false)) {
            text = a0.D(text, " ", "", false);
        }
        if (d0.J(str, "(", false)) {
            text = a0.D(text, "(", "", false);
        }
        if (d0.J(str, ")", false)) {
            text = a0.D(text, ")", "", false);
        }
        return (d0.J(str, "{-}", false) || d0.J(str, "-", false)) ? a0.D(text, "-", "", false) : text;
    }
}
