package cie;

import kotlin.jvm.internal.Intrinsics;
import vge.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.d f24538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f24539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f24540c;
    public final vge.d d;

    public z(mkd.d slotManagerFeedControllerModelExtension, z2 productAccountsInteractor, w productIntroChecker, vge.d accountInteractor) {
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(productIntroChecker, "productIntroChecker");
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        this.f24538a = slotManagerFeedControllerModelExtension;
        this.f24539b = productAccountsInteractor;
        this.f24540c = productIntroChecker;
        this.d = accountInteractor;
    }
}
