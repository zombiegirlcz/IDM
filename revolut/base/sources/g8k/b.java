package g8k;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uli.c f141408a;

    public b(uli.c hostsProvider) {
        Intrinsics.checkNotNullParameter(hostsProvider, "hostsProvider");
        this.f141408a = hostsProvider;
    }

    public final String a(dj0.d dVar, String username, String str) {
        Intrinsics.checkNotNullParameter(username, "username");
        Uri.Builder builderScheme = new Uri.Builder().scheme("https");
        this.f141408a.getClass();
        Uri.Builder builderAppendPath = builderScheme.authority("revolut.me").appendPath(username);
        if (dVar != null) {
            builderAppendPath.appendQueryParameter("currency", dVar.f115083b.f306286a);
            builderAppendPath.appendQueryParameter("amount", String.valueOf(dVar.f115082a));
        }
        if (str != null && str.length() != 0) {
            builderAppendPath.appendQueryParameter("note", str);
        }
        String string = builderAppendPath.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
