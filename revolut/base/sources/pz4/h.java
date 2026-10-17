package pz4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f240895a;

    public h(String str, jf0.c cVar) {
        Matcher matcher = Pattern.compile(str).matcher(hb9.b.z(cVar.f173629c));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f240895a = matcher;
    }
}
