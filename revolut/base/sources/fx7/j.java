package fx7;

import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx7.g f138766a;

    public j(kx7.g petDocumentRepository) {
        Intrinsics.checkNotNullParameter(petDocumentRepository, "petDocumentRepository");
        this.f138766a = petDocumentRepository;
    }

    public static r a(j jVar, String policyId, String documentType) {
        jVar.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        kx7.m mVar = (kx7.m) jVar.f138766a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return ((w4l.f) mVar.d.getValue()).f(new kx7.k(policyId, documentType), false);
    }
}
