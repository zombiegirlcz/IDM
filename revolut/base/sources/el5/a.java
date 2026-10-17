package el5;

import cl5.a;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import n14.k;
import wk5.d;
import wk5.e;
import wk5.f;
import wk5.g;
import wk5.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final CryptoAddressCounterparty a(cl5.a aVar) {
        g gVar;
        h hVar;
        d dVar;
        f fVar;
        e eVar;
        f fVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String address = aVar.getAddress();
        String state = aVar.getState();
        if (state != null) {
            g[] gVarArrValues = g.values();
            int length = gVarArrValues.length;
            for (int i = 0; i < length; i++) {
                gVar = gVarArrValues[i];
                if (a0.z(gVar.name(), state, true)) {
                    break;
                }
            }
            gVar = null;
        } else {
            gVar = null;
        }
        String hostingType = aVar.getHostingType();
        if (hostingType != null) {
            h[] hVarArrValues = h.values();
            int length2 = hVarArrValues.length;
            for (int i2 = 0; i2 < length2; i2++) {
                hVar = hVarArrValues[i2];
                if (a0.z(hVar.name(), hostingType, true)) {
                    break;
                }
            }
            hVar = null;
        } else {
            hVar = null;
        }
        String hostingVerification = aVar.getHostingVerification();
        if (hostingVerification != null) {
            d[] dVarArrValues = d.values();
            int length3 = dVarArrValues.length;
            for (int i3 = 0; i3 < length3; i3++) {
                dVar = dVarArrValues[i3];
                if (a0.z(dVar.name(), hostingVerification, true)) {
                    break;
                }
            }
            dVar = null;
        } else {
            dVar = null;
        }
        String hostingPlatform = aVar.getHostingPlatform();
        bl5.b details = aVar.getDetails();
        CryptoAddressRecipientDetails cryptoAddressRecipientDetailsX = details != null ? k.x(details) : null;
        String ownershipState = aVar.getOwnershipState();
        if (ownershipState != null) {
            f[] fVarArrValues = f.values();
            int length4 = fVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    fVar2 = null;
                    break;
                }
                fVar2 = fVarArrValues[i5];
                if (a0.z(fVar2.name(), ownershipState, true)) {
                    break;
                }
                i5++;
            }
            fVar = fVar2;
        } else {
            fVar = null;
        }
        String ownershipMethod = aVar.getOwnershipMethod();
        if (ownershipMethod != null) {
            e[] eVarArrValues = e.values();
            int length5 = eVarArrValues.length;
            for (int i6 = 0; i6 < length5; i6++) {
                eVar = eVarArrValues[i6];
                if (a0.z(eVar.name(), ownershipMethod, true)) {
                    break;
                }
            }
            eVar = null;
        } else {
            eVar = null;
        }
        a.c ownershipPayload = aVar.getOwnershipPayload();
        CryptoAddressCounterparty.OwnershipPayload ownershipPayload2 = ownershipPayload != null ? new CryptoAddressCounterparty.OwnershipPayload(ownershipPayload.getToken()) : null;
        Long updatedDate = aVar.getUpdatedDate();
        return new CryptoAddressCounterparty(id10, address, gVar, hVar, dVar, hostingPlatform, cryptoAddressRecipientDetailsX, fVar, eVar, ownershipPayload2, updatedDate != null ? Instant.ofEpochMilli(updatedDate.longValue()) : null);
    }
}
