package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f187470a = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f187471b = "$context_receiver";

    @NotNull
    public static final Name contextReceiverName(int i) {
        Name nameIdentifier = Name.identifier(f187471b + '_' + i);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f187470a.replace(name, "_");
    }
}
