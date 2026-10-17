package zk9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f322927a;

    public q(String str, jf0.c cVar) {
        Matcher matcher = Pattern.compile(str).matcher(cVar.f173629c);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f322927a = matcher;
    }
}
