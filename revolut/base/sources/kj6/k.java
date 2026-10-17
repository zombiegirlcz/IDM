package kj6;

import cli.n;
import cli.o;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f184312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazilConsentsScreenContract$InputData f184313b;

    public k(je6.h institutionLogoMapper, BrazilConsentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(institutionLogoMapper, "institutionLogoMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f184312a = institutionLogoMapper;
        this.f184313b = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(domainState.f184308a, new kh4.b(17), new kd8.f(24), new kcg.j(this, 3)));
    }
}
