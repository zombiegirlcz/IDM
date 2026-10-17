package ha5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f150453a;

    public d(String str, String str2) {
        Matcher matcher = Pattern.compile(str.concat("(?:\\?(.*))?$")).matcher(str2);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f150453a = matcher;
    }
}
