package i5d;

import g5d.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f158809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df0.b f158810b;

    public c(d dao, df0.b dateProvider) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f158809a = dao;
        this.f158810b = dateProvider;
    }
}
