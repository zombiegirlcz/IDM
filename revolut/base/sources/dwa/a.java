package dwa;

import awa.b;
import com.revolut.feature.referrals.code.data.api.AddReferrerButtonToggle;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wli.p;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f120353a;

    public a(b referralCodeSideEffect) {
        Intrinsics.checkNotNullParameter(referralCodeSideEffect, "referralCodeSideEffect");
        this.f120353a = referralCodeSideEffect;
    }

    @Override // nte.a
    public final List e() {
        return u.c(AddReferrerButtonToggle.f81676c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
