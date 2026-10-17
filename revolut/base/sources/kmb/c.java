package kmb;

import jmb.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f185746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f185747b;

    public c(f highlightsMapper, b productInfoMapper, k48.a partnerSectionItemsMapper) {
        Intrinsics.checkNotNullParameter(highlightsMapper, "highlightsMapper");
        Intrinsics.checkNotNullParameter(productInfoMapper, "productInfoMapper");
        Intrinsics.checkNotNullParameter(partnerSectionItemsMapper, "partnerSectionItemsMapper");
        this.f185746a = highlightsMapper;
        this.f185747b = productInfoMapper;
    }
}
