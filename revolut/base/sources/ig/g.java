package ig;

import android.net.Uri;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eg.b f161050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f161051b;

    public g(eg.b appInfo, CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.f161050a = appInfo;
        this.f161051b = blockingDispatcher;
    }

    public static final URL a(g gVar) {
        gVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        eg.b bVar = gVar.f161050a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f125401a).appendPath("settings");
        eg.a aVar = bVar.f125403c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f125394c).appendQueryParameter("display_version", aVar.f125393b).build().toString());
    }
}
