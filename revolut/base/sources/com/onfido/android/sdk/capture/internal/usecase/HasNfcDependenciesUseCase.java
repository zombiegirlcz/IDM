package com.onfido.android.sdk.capture.internal.usecase;

import kotlin.Metadata;
import net.sf.scuba.smartcards.CardService;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.ejbca.cvc.CVCertificate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/HasNfcDependenciesUseCase;", "", "()V", "invoke", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HasNfcDependenciesUseCase {

    @NotNull
    public static final HasNfcDependenciesUseCase INSTANCE = new HasNfcDependenciesUseCase();

    private HasNfcDependenciesUseCase() {
    }

    public final boolean invoke() {
        try {
            int i = CardService.f214650a;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = EACObjectIdentifiers.bsi_de;
            int i2 = CVCertificate.f228961a;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
