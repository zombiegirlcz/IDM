package nx1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f220063a;

    public h(ue0.c apmStorage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(apmStorage, "apmStorage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f220063a = apmStorage;
    }

    public static String a(n02.b bVar, int i) {
        return v1.c.t(i, "V2_BUCKET_HASH_", bVar.a(), "_");
    }
}
