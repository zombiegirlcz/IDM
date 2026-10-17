package omi;

import elm.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f226855a = v.k(3, 4, 5, 6, 7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f226856b = v.k(3, 4);

    public static final class a {
        private a() {
        }
    }

    public d() {
        this(0);
    }

    public d(int i) {
        p0 p0Var = p0.f264001a;
        f ioDispatcher = f.f127540b;
        omi.a connectionProvider = omi.a.f226854a;
        Intrinsics.checkNotNullParameter(connectionProvider, "connectionProvider");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
    }
}
