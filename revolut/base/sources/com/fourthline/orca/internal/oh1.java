package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class oh1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(gf1 gf1Var) {
        String strF;
        lg1 lg1VarA = gf1Var.a();
        if (lg1VarA == null || (strF = lg1VarA.f()) == null) {
            throw new IllegalStateException("FL Developer error. Next endpoint requires valid 'workflowId'.");
        }
        return strF;
    }

    public final xg1 a(gf1 dataBundle) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        return dataBundle.b();
    }

    public final Function0 b(gf1 dataBundle) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        return new uq1(dataBundle, 0);
    }

    public final dh1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new u40(context);
    }

    public final yg1 a(mb.d networkEnvironment, ib0 networkService, dh1 workflowSessionStore, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(workflowSessionStore, "workflowSessionStore");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (a1m.e.B(networkEnvironment)) {
            Object obj2 = stubProvider.get();
            Intrinsics.h(obj2);
            return (yg1) obj2;
        }
        return new qb0(networkService, workflowSessionStore);
    }

    public final kh1 a(mb.d networkEnvironment, ib0 statusNetworkService, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(statusNetworkService, "statusNetworkService");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (a1m.e.B(networkEnvironment)) {
            Object obj2 = stubProvider.get();
            Intrinsics.h(obj2);
            return (kh1) obj2;
        }
        return new sb0(statusNetworkService);
    }

    public final lz a(mb.d networkEnvironment, phm.a networkWhatsNextProvider, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(networkWhatsNextProvider, "networkWhatsNextProvider");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (a1m.e.B(networkEnvironment)) {
            Object obj2 = stubProvider.get();
            Intrinsics.h(obj2);
            return (lz) obj2;
        }
        Object obj3 = networkWhatsNextProvider.get();
        Intrinsics.h(obj3);
        return (lz) obj3;
    }

    public final t9 a(kb0 networkServiceProvider, zw etagSharedPreference) {
        Intrinsics.checkNotNullParameter(networkServiceProvider, "networkServiceProvider");
        Intrinsics.checkNotNullParameter(etagSharedPreference, "etagSharedPreference");
        return new s90(networkServiceProvider, etagSharedPreference);
    }

    public final jz a(r70 mainRepository, ib0 networkService) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        if (mainRepository.c()) {
            return new a61(null, 0L, 3, null);
        }
        return new ga0(networkService);
    }
}
