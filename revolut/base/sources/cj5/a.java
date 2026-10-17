package cj5;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerController;
import kotlin.jvm.internal.Intrinsics;
import zi5.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            return ((c) descriptor).a(new CryptoQrScannerController());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
