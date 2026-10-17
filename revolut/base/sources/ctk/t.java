package ctk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f108701a;

    public t(jbh.e performanceAssetMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        this.f108701a = performanceAssetMapper;
    }

    public final List a(l state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Data data = state.f108691b;
        List list = data != null ? (List) iii.c.f(data, new cs.a(12), new ct6.o(2), new cab.m(state, this, 7)) : null;
        return list == null ? f0.f322471a : list;
    }
}
