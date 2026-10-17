package xaa;

import a12.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f303796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8a.a f303797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f303798c;

    public f(j apmAreaMapper, j8a.a keyFormatter, d keyManagementSectionMapper) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(keyFormatter, "keyFormatter");
        Intrinsics.checkNotNullParameter(keyManagementSectionMapper, "keyManagementSectionMapper");
        this.f303796a = apmAreaMapper;
        this.f303797b = keyFormatter;
        this.f303798c = keyManagementSectionMapper;
    }
}
