package ynj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static long a(i iVar) {
        pkm.e durationUnit = pkm.e.SECONDS;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(durationUnit, "durationUnit");
        return kotlin.time.c.h(1L, durationUnit);
    }

    public static long b(i iVar) {
        pkm.e durationUnit = pkm.e.SECONDS;
        Intrinsics.checkNotNullParameter(durationUnit, "durationUnit");
        return kotlin.time.c.h(5L, durationUnit);
    }
}
