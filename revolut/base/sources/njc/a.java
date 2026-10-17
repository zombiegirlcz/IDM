package njc;

import blh.c;
import kotlin.jvm.internal.Intrinsics;
import zsc.d;
import zsc.m;
import zsc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f216445a = new a();

    private a() {
    }

    @Override // zsc.s
    public final d a(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new c(query, 1);
    }
}
