package ak8;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import com.youTransactor.uCube.rpc.Constants;
import fy6.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlin.text.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.TextData f5742b;

    public /* synthetic */ i(InputTextDelegate.TextData textData, int i) {
        this.f5741a = i;
        this.f5742b = textData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f5741a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String mail = this.f5742b.f52598b.toString();
                String existingMail = update.f5737b;
                Intrinsics.checkNotNullParameter(mail, "mail");
                Intrinsics.checkNotNullParameter(existingMail, "existingMail");
                return new e(mail, existingMail);
            case 1:
                cc7.d updateDetailedSurveyDialog = (cc7.d) obj2;
                Intrinsics.checkNotNullParameter(updateDetailedSurveyDialog, "$this$updateDetailedSurveyDialog");
                return cc7.d.a(updateDetailedSurveyDialog, null, null, this.f5742b.f52598b.toString(), 3);
            case 2:
                cq9.f update2 = (cq9.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return cq9.f.a(update2, 0L, this.f5742b.f52598b.toString(), 0, 5);
            case 3:
                h3g.a it8 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(this.f5742b.f52597a, it8.f149114a.b()) && it8.f149114a.f92761a.f92790c != myf.f.DATE);
            case 4:
                ew6.d updateState = (ew6.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                InputTextDelegate.TextData textData = this.f5742b;
                String string = textData.f52598b.toString();
                String str = textData.f52597a;
                boolean z = false;
                if (Intrinsics.f(str, "ITEM_ID_NAME")) {
                    String str2 = updateState.f130097b;
                    if (string != null && string.length() != 0) {
                        if ((str2 != null ? y.k(str2) : null) != null) {
                            z = true;
                        }
                    }
                    return ew6.d.a(updateState, string, null, z, 2);
                }
                if (!Intrinsics.f(str, "ITEM_ID_RATE")) {
                    return updateState;
                }
                String str3 = updateState.f130096a;
                if (str3 != null && str3.length() != 0) {
                    if ((string != null ? y.k(string) : null) != null) {
                        z = true;
                    }
                }
                return ew6.d.a(updateState, null, string, z, 1);
            case 5:
                fy6.i update3 = (fy6.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                fy6.h hVar = update3.f138939c;
                return fy6.i.a(update3, null, null, hVar != null ? fy6.h.a(hVar, null, new fy6.j(z.m(this.f5742b.f52598b.toString())), 1) : null, null, 11);
            case 6:
                fy6.i update4 = (fy6.i) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                fy6.h hVar2 = update4.f138939c;
                return fy6.i.a(update4, null, null, hVar2 != null ? fy6.h.a(hVar2, n.a(hVar2.f138935a, z.m(this.f5742b.f52598b.toString()), null, 2), null, 2) : null, null, 11);
            case 7:
                h45.f update5 = (h45.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                x35.h iban = new x35.h(this.f5742b.f52598b.toString());
                update5.getClass();
                Intrinsics.checkNotNullParameter(iban, "iban");
                return new h45.f(iban);
            case 8:
                je1.f update6 = (je1.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return je1.f.a(update6, this.f5742b.f52598b.toString(), null, 6);
            case 9:
                mek.g update7 = (mek.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return mek.g.a(update7, this.f5742b.f52598b.toString(), null, null, null, null, false, null, 254);
            case 10:
                mek.g update8 = (mek.g) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return mek.g.a(update8, null, this.f5742b.f52598b.toString(), null, null, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 11:
                mek.g update9 = (mek.g) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return mek.g.a(update9, null, null, this.f5742b.f52598b.toString(), null, null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 12:
                nqf.h updateState2 = (nqf.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return nqf.h.a(updateState2, null, this.f5742b.f52598b.toString(), null, null, null, 29);
            case 13:
                nqf.h updateState3 = (nqf.h) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return nqf.h.a(updateState3, null, null, this.f5742b.f52598b.toString(), null, null, 27);
            case 14:
                nqf.h updateState4 = (nqf.h) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return nqf.h.a(updateState4, new krf.d(this.f5742b.f52598b.toString()), null, null, null, null, 30);
            case 15:
                oe1.g update10 = (oe1.g) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return oe1.g.a(update10, null, 0L, this.f5742b.f52598b.toString(), null, 0, od1.b.DESCRIPTION, 55);
            case 16:
                oog.g update11 = (oog.g) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return oog.g.a(update11, null, this.f5742b.f52598b.toString(), null, 5);
            case 17:
                oug.e update12 = (oug.e) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                String string2 = this.f5742b.f52598b.toString();
                AccountClosureFeedbackFeature feature = update12.f229871a;
                Intrinsics.checkNotNullParameter(feature, "feature");
                return new oug.e(feature, string2);
            case 18:
                oy6.f update13 = (oy6.f) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return oy6.f.a(update13, new oy6.g(z.m(this.f5742b.f52598b.toString())), null, 5);
            case 19:
                oy6.f update14 = (oy6.f) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                oy6.j jVar = update14.f230894c;
                return oy6.f.a(update14, null, jVar != null ? oy6.j.a(jVar, null, z.m(this.f5742b.f52598b.toString()), 1) : null, 3);
            case 20:
                q22.a update15 = (q22.a) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return q22.a.a(update15, null, null, null, null, null, null, this.f5742b.f52598b.toString(), false, false, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 21:
                q22.a update16 = (q22.a) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                return q22.a.a(update16, null, null, null, null, this.f5742b.f52598b.toString(), null, null, false, false, 495);
            case 22:
                q22.a update17 = (q22.a) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                return q22.a.a(update17, null, null, null, null, null, this.f5742b.f52598b.toString(), null, false, false, 479);
            case 23:
                h3g.a it9 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(this.f5742b.f52597a, it9.f149114a.b()) && it9.f149114a.f92761a.f92790c != myf.f.DATE);
            case 24:
                k50.y update18 = (k50.y) obj2;
                Intrinsics.checkNotNullParameter(update18, "$this$update");
                return k50.y.a(update18, null, null, this.f5742b.f52598b.toString(), Constants.TAG_BLE_FIRMWARE_VERSION);
            case 25:
                vb2.e update19 = (vb2.e) obj2;
                Intrinsics.checkNotNullParameter(update19, "$this$update");
                return vb2.e.a(update19, null, this.f5742b.f52598b.toString(), null, null, 13);
            case 26:
                vb2.e update20 = (vb2.e) obj2;
                Intrinsics.checkNotNullParameter(update20, "$this$update");
                return vb2.e.a(update20, null, null, this.f5742b.f52598b.toString(), null, 11);
            case 27:
                vb2.e update21 = (vb2.e) obj2;
                Intrinsics.checkNotNullParameter(update21, "$this$update");
                return vb2.e.a(update21, null, null, null, this.f5742b.f52598b.toString(), 7);
            case 28:
                vml.f update22 = (vml.f) obj2;
                Intrinsics.checkNotNullParameter(update22, "$this$update");
                String email = this.f5742b.f52598b.toString();
                update22.getClass();
                Intrinsics.checkNotNullParameter(email, "email");
                return new vml.f(email);
            default:
                vqc.f update23 = (vqc.f) obj2;
                Intrinsics.checkNotNullParameter(update23, "$this$update");
                return vqc.f.a(update23, this.f5742b.f52598b.toString(), null, 2);
        }
    }

    public /* synthetic */ i(InputTextDelegate.TextData textData, ew6.g gVar) {
        this.f5741a = 4;
        this.f5742b = textData;
    }
}
