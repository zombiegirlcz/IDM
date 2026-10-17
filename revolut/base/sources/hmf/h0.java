package hmf;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f153774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zq.a f153775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f153776c;

    public h0(klf.h0 commonDataSource, zq.a screenBuilderKeySelector, ImmutableMap screenBuilders) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(screenBuilderKeySelector, "screenBuilderKeySelector");
        Intrinsics.checkNotNullParameter(screenBuilders, "screenBuilders");
        this.f153774a = commonDataSource;
        this.f153775b = screenBuilderKeySelector;
        this.f153776c = screenBuilders;
    }
}
