package ewa;

import com.revolut.feature.referrals.code.data.impl.service.ReferralCodeService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralCodeService f130117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f130118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.a f130119c;

    static {
        Intrinsics.checkNotNullParameter("HAS_BOUND_REFERRER", "id");
    }

    public e(ReferralCodeService service, ue0.c storage, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f130117a = service;
        this.f130118b = storage;
        this.f130119c = personalisationStorage;
    }
}
