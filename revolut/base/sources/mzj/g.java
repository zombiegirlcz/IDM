package mzj;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import efm.d0;
import hha.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mzj.e;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj2.a f210790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f210791b;

    public g(zj2.a atmDestinationsResolver, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f210790a = atmDestinationsResolver;
        this.f210791b = featureToggleInteractor;
    }

    public static ufm.b a(d promptClickData) {
        Intrinsics.checkNotNullParameter(promptClickData, "promptClickData");
        String str = promptClickData.f210777a;
        mha.m.Companion.getClass();
        if (Intrinsics.f(str, mha.m.f205456b.f205460a)) {
            ufm.b bVarM = d0.m(e.c.f210782a);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        boolean zF = Intrinsics.f(str, mha.m.e.f205460a);
        e.a aVar = e.a.f210780a;
        if (zF) {
            ufm.b bVarM2 = d0.m(aVar);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (Intrinsics.f(str, mha.m.f.f205460a)) {
            ufm.b bVarM3 = d0.m(e.g.f210786a);
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        if (Intrinsics.f(str, "TRANSFER_YEARLY")) {
            ufm.b bVarM4 = d0.m(e.f.f210785a);
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            return bVarM4;
        }
        if (Intrinsics.f(str, "INBOUND_TRANSFER_YEARLY")) {
            ufm.b bVarM5 = d0.m(aVar);
            Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
            return bVarM5;
        }
        if (Intrinsics.f(str, "BRL_TO_USD_EXCHANGE_YEARLY")) {
            ufm.b bVarM6 = d0.m(e.C1189e.f210784a);
            Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
            return bVarM6;
        }
        ufm.b bVarM7 = d0.m(e.d.f210783a);
        Intrinsics.checkNotNullExpressionValue(bVarM7, "just(...)");
        return bVarM7;
    }

    public static ufm.b b(d promptClickData) {
        Object fVar;
        Intrinsics.checkNotNullParameter(promptClickData, "promptClickData");
        String str = promptClickData.f210777a;
        if (Intrinsics.f(str, "INBOUND_TRANSFER_YEARLY") || Intrinsics.f(str, "BRL_TO_USD_EXCHANGE_YEARLY")) {
            ufm.b bVarM = d0.m(e.b.f210781a);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String str2 = promptClickData.f210777a;
        List list = promptClickData.f210778b;
        mha.m.Companion.getClass();
        if (Intrinsics.f(str2, mha.m.f205456b.f205460a)) {
            u.Companion.getClass();
            fVar = new f(u.e, list, xfa.b.PROFILE_LIMITS_ATM);
        } else if (Intrinsics.f(str2, mha.m.f.f205460a)) {
            u.Companion.getClass();
            fVar = new f(u.o, list, xfa.b.PROFILE_LIMITS_TRADING);
        } else if (Intrinsics.f(str2, mha.m.e.f205460a)) {
            u.Companion.getClass();
            fVar = new f(u.f, list, xfa.b.PROFILE_LIMITS_FX);
        } else {
            fVar = e.f.f210785a;
        }
        ufm.b bVarM2 = d0.m(fVar);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }

    public static BridgeDestination c(FeatureConfig featureConfig) {
        return new BridgeDestination(new FeatureCommand(featureConfig));
    }
}
