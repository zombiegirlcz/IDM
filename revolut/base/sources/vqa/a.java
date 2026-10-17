package vqa;

import kotlin.jvm.internal.Intrinsics;
import uqa.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static b a(String input, String regex, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return input.length() == 0 ? !z ? b.Valid : b.Empty : (regex.length() <= 0 || ch.qos.logback.core.util.a.x(regex, input)) ? b.Valid : z3 ? b.InvalidFilled : b.Invalid;
    }
}
