package xt9;

import com.revolut.feature.payments.impl.interactor.qr.QrCodeService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrCodeService f308781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f308782b;

    public f(QrCodeService service, o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f308781a = service;
        this.f308782b = gson;
    }
}
