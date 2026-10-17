package lq3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f199187a;

    public c(jf0.c cVar) {
        Matcher matcher = Pattern.compile("revolut://app/credit-retail/post-activation-flow").matcher(hb9.b.z(cVar.f173629c));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f199187a = matcher;
    }
}
