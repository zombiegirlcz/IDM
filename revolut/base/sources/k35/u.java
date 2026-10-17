package k35;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class u {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f180618a;

    public u(String str, String str2) {
        Matcher matcher = Pattern.compile(str.concat("(?:\\?(.*))?$")).matcher(str2);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f180618a = matcher;
    }
}
