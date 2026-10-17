package uij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f280452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.e f280453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f280454c;

    public a(gej.a bytesFormatter, ynj.e commonUiBuilder, b bottomViewMapper) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(bottomViewMapper, "bottomViewMapper");
        this.f280452a = bytesFormatter;
        this.f280453b = commonUiBuilder;
        this.f280454c = bottomViewMapper;
    }
}
