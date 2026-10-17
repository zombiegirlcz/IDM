package b63;

import android.content.Intent;
import android.nfc.NfcAdapter;
import d9.e1;
import f63.d;
import g63.e;
import kotlin.jvm.internal.Intrinsics;
import ni0.f;
import v60.i;
import w53.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends e {
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f12529j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f12530l;

    public a(b cardScannerNfcManager, f paymentCardRecognitionResultExtractor) {
        Intrinsics.checkNotNullParameter(cardScannerNfcManager, "cardScannerNfcManager");
        Intrinsics.checkNotNullParameter(paymentCardRecognitionResultExtractor, "paymentCardRecognitionResultExtractor");
        this.i = cardScannerNfcManager;
        this.f12529j = paymentCardRecognitionResultExtractor;
        this.k = new i();
        this.f12530l = new i();
    }

    @Override // fsi.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        ni0.e eVarA;
        if (i == 11) {
            if (intent != null) {
                this.f12529j.getClass();
                eVarA = f.a(intent);
            } else {
                eVarA = null;
            }
            if (eVarA != null) {
                x53.a aVarB0 = e1.b0(eVarA);
                i resultSubject = this.k;
                Intrinsics.checkNotNullExpressionValue(resultSubject, "resultSubject");
                resultSubject.onNext(aVarB0);
            }
        }
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        f63.b bVar = ((d) this.i).f132401a;
        NfcAdapter nfcAdapter = bVar.f132398b;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(bVar.f132397a);
        }
        super.onPause();
    }

    @Override // fsi.a
    public final void onResume() {
        b bVar = this.i;
        ((d) bVar).c();
        boolean zB = ((d) bVar).b();
        i iVar = this.f12530l;
        if (!zB) {
            iVar.onNext(z53.a.NOT_SUPPORTED);
        } else if (((d) bVar).a()) {
            iVar.onNext(z53.a.ENABLED);
        } else {
            iVar.onNext(z53.a.DISABLED);
        }
    }
}
