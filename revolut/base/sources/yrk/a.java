package yrk;

import efm.r;
import efm.w;
import efm.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ypd.i;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements x {

    @NotNull
    public static final C1764a Companion = new C1764a();

    /* JADX INFO: renamed from: yrk.a$a, reason: collision with other inner class name */
    public static final class C1764a {
        private C1764a() {
        }
    }

    public static List a(List list) {
        return d0.P0(d0.P0(list, new b()), new c());
    }

    @Override // efm.x
    public final w apply(r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return nim.a.w(upstream, new i(this, 25));
    }
}
