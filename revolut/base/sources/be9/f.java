package be9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zsc.j;
import zsc.r;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14724b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f14725a;

    public f(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        j moneyFilterFactory = j.f324876a;
        Intrinsics.checkNotNullParameter(moneyFilterFactory, "moneyFilterFactory");
        r stringFilterFactory = r.f324883a;
        Intrinsics.checkNotNullParameter(stringFilterFactory, "stringFilterFactory");
        this.f14725a = uiKitResources;
    }
}
