package qcg;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f244783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f244784b;

    public e(LinkedHashMap destinationsById, Map destinationsCountById) {
        Intrinsics.checkNotNullParameter(destinationsById, "destinationsById");
        Intrinsics.checkNotNullParameter(destinationsCountById, "destinationsCountById");
        this.f244783a = destinationsById;
        this.f244784b = destinationsCountById;
    }
}
