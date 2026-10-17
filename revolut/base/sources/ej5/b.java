package ej5;

import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import e2j.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements zi5.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126715a;

    public b(List prefixes) {
        Intrinsics.checkNotNullParameter(prefixes, "prefixes");
        this.f126715a = prefixes;
    }

    @Override // zi5.b
    public final CryptoQrCodeParseResult parse(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        CryptoQrCodeParseResult cryptoQrCodeParseResult = (CryptoQrCodeParseResult) y.r(y.x(d0.Q(this.f126715a), new i(this, qrCode)));
        return cryptoQrCodeParseResult == null ? CryptoQrCodeParseResult.NotDetected.f70895a : cryptoQrCodeParseResult;
    }
}
