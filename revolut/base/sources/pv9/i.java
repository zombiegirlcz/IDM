package pv9;

import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.MessagingEncryptionService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessagingEncryptionService f240028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f240029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f240030c;
    public final cv9.a d;
    public final qv9.a e;

    public i(MessagingEncryptionService encryptionService, a31.a encryptionKeysEncoder, ang.f userInteractor, cv9.a encryptionInteractor, qv9.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        Intrinsics.checkNotNullParameter(encryptionKeysEncoder, "encryptionKeysEncoder");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(encryptionInteractor, "encryptionInteractor");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f240028a = encryptionService;
        this.f240029b = encryptionKeysEncoder;
        this.f240030c = userInteractor;
        this.d = encryptionInteractor;
        this.e = base64Wrapper;
    }
}
