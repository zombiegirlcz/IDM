package do6;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f116447a;

    public b(j memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f116447a = memoryCache;
    }

    public final void a() {
        this.f116447a.clear();
    }

    public final NaviCommand b() {
        j jVar = this.f116447a;
        if (jVar.contains("KEY_CUSTOM_RESULT")) {
            return (NaviCommand) jVar.get("KEY_CUSTOM_RESULT");
        }
        return null;
    }

    public final void c(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        this.f116447a.f("KEY_CUSTOM_RESULT", naviCommand);
    }
}
