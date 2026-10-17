package y2i;

import h5i.g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import y2i.b;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f310666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f310667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2i.a f310668c;
    public final ihm.b d;
    public final AtomicBoolean e;

    public c(a presentationModel, g quoteMapper, d mapper, l4i.a amountConverter, r2i.a settlementDelayBannerMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(settlementDelayBannerMapper, "settlementDelayBannerMapper");
        this.f310666a = presentationModel;
        this.f310667b = quoteMapper;
        this.f310668c = settlementDelayBannerMapper;
        ihm.b bVarE = ihm.b.e(b.C1728b.f310665a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
        this.e = new AtomicBoolean();
    }
}
