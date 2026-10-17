package rd3;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbj.c f253321a;

    public b(bbj.c cryptoDisclaimerMapper, bbj.a commoditiesDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(cryptoDisclaimerMapper, "cryptoDisclaimerMapper");
        Intrinsics.checkNotNullParameter(commoditiesDisclaimerMapper, "commoditiesDisclaimerMapper");
        this.f253321a = cryptoDisclaimerMapper;
    }

    public final List a(Data footerTypeData) {
        Intrinsics.checkNotNullParameter(footerTypeData, "footerTypeData");
        return (List) iii.c.f(footerTypeData, new rbj.g(12), new rbh.j(14), new qbg.j(this, 24));
    }
}
