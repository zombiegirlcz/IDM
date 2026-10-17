package prc;

import android.print.PrintManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f238974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrintManager f238975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f238976c;

    public c(f01.c resources, PrintManager printManager, a provider) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f238974a = resources;
        this.f238975b = printManager;
        this.f238976c = provider;
    }
}
