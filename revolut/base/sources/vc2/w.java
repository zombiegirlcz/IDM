package vc2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v02.a f287644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.u f287645b;

    public w(v02.a aliasMapper, a12.u settingsMapper) {
        Intrinsics.checkNotNullParameter(aliasMapper, "aliasMapper");
        Intrinsics.checkNotNullParameter(settingsMapper, "settingsMapper");
        this.f287644a = aliasMapper;
        this.f287645b = settingsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c) iii.c.f(domainState.f287615a, new v80.a(20), new v78.d(11), new uk2.w(this, 23));
    }
}
