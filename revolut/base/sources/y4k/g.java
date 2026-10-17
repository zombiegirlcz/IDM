package y4k;

import kotlin.jvm.internal.Intrinsics;
import m3j.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f310964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f310965b;

    public g(h accountFieldsMapper, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(accountFieldsMapper, "accountFieldsMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f310964a = accountFieldsMapper;
        this.f310965b = languageProvider;
    }
}
