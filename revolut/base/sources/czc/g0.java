package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    @NotNull
    private static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f110198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f110199b;

    public g0(thf.m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f110198a = transactionTextResourcesMapper;
        this.f110199b = transactionIconResourcesMapper;
    }

    public static String a(z zVar) {
        if (zVar instanceof w) {
            DocumentType documentType = ((w) zVar).f110220a;
            String str = documentType.d;
            return str == null ? documentType.f85860b : str;
        }
        if (zVar instanceof x) {
            x xVar = (x) zVar;
            String str2 = xVar.a().d;
            return str2 == null ? xVar.a().f85860b : str2;
        }
        if (zVar instanceof y) {
            return ((y) zVar).f110223a.f85860b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
