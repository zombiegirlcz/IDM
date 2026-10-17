package pq3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class z {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f238681a;

    public z(String str, jf0.c cVar) {
        Matcher matcher = Pattern.compile(str).matcher(hb9.b.z(cVar.f173629c));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f238681a = matcher;
    }
}
