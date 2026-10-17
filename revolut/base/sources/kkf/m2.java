package kkf;

import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m2 extends yji.n implements elf.s0 {

    @NotNull
    public static final k2 Companion = new k2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184822m;

    public m2(klf.h0 commonDataSource, klf.m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f184821l = commonDataSource;
        this.f184822m = juniorDataSource;
    }

    public final cmf.p Z2() {
        return new cmf.p(new t38.e(this.f184821l.h(new kjk.x(11)), 24, new iyg.b0(this.f184822m.a(), 26), new ael.l0(3, this, m2.class, "buildBlock", "buildBlock(ZZ)Ljava/util/List;", 4, 14)), new i0(13), zhm.u.c(this), "Kyc");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean zF = Intrinsics.f(str, "ID_VERIFY_IDENTITY_ACTION");
        boolean z = false;
        if (zF) {
            A2(zh9.u0.c(new KycFeatureConfig.InitKyc(null, false, 31)));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
