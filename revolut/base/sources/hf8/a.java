package hf8;

import kotlin.jvm.internal.Intrinsics;
import sf0.h;
import v60.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f151778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f151779b;

    public a(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f151778a = serverErrorParser;
        this.f151779b = serverErrorsProvider;
    }
}
