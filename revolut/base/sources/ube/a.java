package ube;

import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import k71.q;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f278839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f278840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f278841c;
    public final PixQrCodeDecodeResult d;

    public a(p subscription, Data transactionsResult, q qVar, PixQrCodeDecodeResult pixQrCodeDecodeResult) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(transactionsResult, "transactionsResult");
        this.f278839a = subscription;
        this.f278840b = transactionsResult;
        this.f278841c = qVar;
        this.d = pixQrCodeDecodeResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f278839a, aVar.f278839a) && Intrinsics.f(this.f278840b, aVar.f278840b) && Intrinsics.f(this.f278841c, aVar.f278841c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = e.c(this.f278840b, this.f278839a.hashCode() * 31, 31);
        q qVar = this.f278841c;
        int iHashCode = (iC + (qVar == null ? 0 : qVar.hashCode())) * 31;
        PixQrCodeDecodeResult pixQrCodeDecodeResult = this.d;
        return iHashCode + (pixQrCodeDecodeResult != null ? pixQrCodeDecodeResult.hashCode() : 0);
    }
}
