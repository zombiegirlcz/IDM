package pq3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jf0.c f238675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matcher f238676b;

    public b(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f238675a = deeplink;
        Matcher matcher = Pattern.compile("revolut://app/credit/(.+)-application/([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})/akahu-callback/?").matcher(hb9.b.z(deeplink.f173629c));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        this.f238676b = matcher;
    }
}
