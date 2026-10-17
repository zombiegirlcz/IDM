package kmb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.retail.savings.impl.common.product_info.a f185745a;

    public b(com.revolut.feature.retail.savings.impl.common.product_info.a extraProductInformationItemMapper, rkb.d generalSectionItemsMapperImpl) {
        Intrinsics.checkNotNullParameter(extraProductInformationItemMapper, "extraProductInformationItemMapper");
        Intrinsics.checkNotNullParameter(generalSectionItemsMapperImpl, "generalSectionItemsMapperImpl");
        this.f185745a = extraProductInformationItemMapper;
    }
}
