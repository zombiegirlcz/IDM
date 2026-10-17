package com.revolut.retail.feature.api.userauth.navigation;

import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import efm.d0;
import ixj.b;
import kotlin.jvm.internal.Intrinsics;
import kq5.d;
import kxb.c;
import kxj.h;
import skm.p0;
import te0.w;
import ue0.e;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    static i a(a aVar, boolean z, UserOnboardingNavigationProvider$UseCase useCase, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            useCase = UserOnboardingNavigationProvider$UseCase.Default.f99363a;
        }
        h hVar = (h) aVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        if (useCase instanceof UserOnboardingNavigationProvider$UseCase.Default) {
            i iVar = new i(e.I(w.o0(p0.f264003c, new d(hVar, null, 17)), h0.f322473a, new c(4)), new ksb.a(new g48.h(hVar, z, (UserOnboardingNavigationProvider$UseCase.Default) useCase, 26), 28), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        d0 d0VarA = ((b) hVar.f190594c).a();
        ksb.a aVar2 = new ksb.a(new g48.h(hVar, z, useCase, 27), 29);
        d0VarA.getClass();
        i iVar2 = new i(d0VarA, aVar2, 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
