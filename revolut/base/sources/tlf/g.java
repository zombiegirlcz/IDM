package tlf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnf.b f272068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f272069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ynf.f f272070c;
    public final dl3.f d;

    public g(wnf.b legacyCommonMapper, thf.d transactionIconResourcesMapper, ynf.f transferUserDescriptionMapper, dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(legacyCommonMapper, "legacyCommonMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transferUserDescriptionMapper, "transferUserDescriptionMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f272068a = legacyCommonMapper;
        this.f272069b = transactionIconResourcesMapper;
        this.f272070c = transferUserDescriptionMapper;
        this.d = contactsMapper;
    }
}
