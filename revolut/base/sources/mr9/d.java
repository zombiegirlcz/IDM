package mr9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mlk.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i90.b f208088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f208089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final er9.e f208090c;

    public d(i90.b uuidGenerator, e dateProvider, er9.e repository) {
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f208088a = uuidGenerator;
        this.f208089b = dateProvider;
        this.f208090c = repository;
    }

    public final pfm.a a(String str) {
        d0 d0VarFirstOrError = m70.a.g(this.f208090c.a(str), null, new mqg.a(4), 1).firstOrError();
        b0 b0Var = new b0(new b(this, str, 1), 17);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, b0Var, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
