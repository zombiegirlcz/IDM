package gmd;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f144806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f144807b;

    public b(wsg.b walletsInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f144806a = walletsInteractor;
        this.f144807b = jointAccountsInteractor;
    }
}
