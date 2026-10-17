package tl;

import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f271990c;
    public final NfcProperties d;

    public k(String documentId, String documentVideoId, boolean z, NfcProperties nfcProperties) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
        this.f271988a = documentId;
        this.f271989b = documentVideoId;
        this.f271990c = z;
        this.d = nfcProperties;
    }

    @Override // tl.m
    public final String a() {
        return this.f271988a;
    }

    @Override // tl.m
    public final boolean b() {
        return this.f271990c;
    }

    @Override // tl.m
    public final String c() {
        return this.f271989b;
    }
}
