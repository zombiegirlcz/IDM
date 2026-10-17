package tg1;

import com.google.gson.JsonSyntaxException;
import com.revolut.feature.add_card_to_google_pay_shared.impl.tapandpay.GooglePayCardActivationService;
import jg1.e;
import jg1.f;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import pfm.r;
import te0.w;
import yg1.c;
import yg1.d;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayCardActivationService f271038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f271039b;

    public a(GooglePayCardActivationService service, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f271038a = service;
        this.f271039b = base64Wrapper;
    }

    public final r a(jg1.a cardActivation) {
        Intrinsics.checkNotNullParameter(cardActivation, "cardActivation");
        Intrinsics.checkNotNullParameter(cardActivation, "<this>");
        String str = cardActivation.f173894a;
        String str2 = cardActivation.f173895b;
        String expiry = cardActivation.f173896c;
        if (expiry != null) {
            Intrinsics.checkNotNullParameter(expiry, "expiry");
            if (expiry.length() == 4) {
                String strSubstring = expiry.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = expiry.substring(2, expiry.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                expiry = com.google.android.gms.internal.mlkit_vision_face.a.o(strSubstring, "/", strSubstring2);
            }
        } else {
            expiry = null;
        }
        return w.g0(this.f271038a.activateCard(new yg1.a(str, str2, expiry, cardActivation.d)));
    }

    public final e b(String str) {
        try {
            String str2 = str != null ? new String(this.f271039b.a(str), Charsets.UTF_8) : null;
            if (str2 == null) {
                str2 = "";
            }
            c cVar = (c) new o().c(str2, c.class);
            if (cVar != null) {
                return new e(cVar.getPaymentAppProviderId(), cVar.getPaymentAppInstanceId(), cVar.getTokenUniqueReference(), cVar.getAccountPanSuffix(), cVar.getAccountExpiry());
            }
        } catch (JsonSyntaxException unused) {
        }
        return null;
    }

    public final f c(String str) {
        try {
            String str2 = str != null ? new String(this.f271039b.a(str), Charsets.UTF_8) : null;
            if (str2 == null) {
                str2 = "";
            }
            d dVar = (d) new o().c(str2, d.class);
            if (dVar != null) {
                return new f(dVar.getPanReferenceId(), dVar.getTokenRequestorId(), dVar.getTokenReferenceID(), dVar.getWalletAccountID(), dVar.getPanLast4(), dVar.getDeviceID());
            }
        } catch (JsonSyntaxException unused) {
        }
        return null;
    }
}
