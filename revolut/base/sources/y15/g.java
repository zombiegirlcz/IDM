package y15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f310304a;

    public g(jf0.c cVar) {
        Matcher matcher = Pattern.compile("revolut://app/credit/apply").matcher(hb9.b.z(cVar.f173629c));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f310304a = matcher;
    }
}
