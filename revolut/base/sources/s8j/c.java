package s8j;

import a0.d;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe0.e;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f261053a;

    public c(e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f261053a = storage;
    }

    public static String a(StakingProduct stakingProduct) {
        String str;
        String str2;
        boolean zB = stakingProduct.b();
        xi0.b bVar = stakingProduct.d;
        if (zB) {
            str = bVar.f306286a;
            str2 = "_AUTO_STAKING_KEY";
        } else {
            str = bVar.f306286a;
            str2 = "_MANUAL_STAKING_KEY";
        }
        return d.r(str, str2);
    }
}
