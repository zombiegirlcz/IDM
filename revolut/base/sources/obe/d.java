package obe;

import dl3.f;
import kotlin.jvm.internal.Intrinsics;
import l80.e;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f223933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f223934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f223935c;
    public final cl3.a d;

    public d(a9e.b commonSubscriptionMapper, e dateProvider, f contactsMapper, cl3.a contactsInteractor, c descriptionMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        this.f223933a = commonSubscriptionMapper;
        this.f223934b = dateProvider;
        this.f223935c = contactsMapper;
        this.d = contactsInteractor;
    }
}
