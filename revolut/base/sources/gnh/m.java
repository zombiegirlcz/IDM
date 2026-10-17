package gnh;

import aw0.d0;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f145010c = new d0(167, Constants.TAG_POWER_OFF_TIMEOUT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f145011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f145012b;

    public m(jbh.e performanceAssetMapper, k columnWithRowsMapper, hnh.a subheaderMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(columnWithRowsMapper, "columnWithRowsMapper");
        Intrinsics.checkNotNullParameter(subheaderMapper, "subheaderMapper");
        this.f145011a = performanceAssetMapper;
        this.f145012b = columnWithRowsMapper;
    }

    public static String a(String str) {
        return j6.a.q("trade-widget-", str);
    }
}
