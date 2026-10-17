package eke;

import kotlin.jvm.internal.Intrinsics;
import r10.q;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbb.c f127039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final utk.f f127040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j40.a f127041c;
    public final q d;

    public h(kbb.c headerUiParamsProvider, utk.f profileNotificationInteractor, j40.a assistantModelExtension, q userRegisteredIdentitiesInteractor) {
        Intrinsics.checkNotNullParameter(headerUiParamsProvider, "headerUiParamsProvider");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        this.f127039a = headerUiParamsProvider;
        this.f127040b = profileNotificationInteractor;
        this.f127041c = assistantModelExtension;
        this.d = userRegisteredIdentitiesInteractor;
    }
}
