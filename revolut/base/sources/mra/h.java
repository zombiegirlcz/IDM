package mra;

import com.revolut.feature.address.models.Address;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mqa.l;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static mqa.f a(fqa.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof fqa.h)) {
            if (request instanceof fqa.i) {
                return new mqa.f(lqa.g.SELF, b(((fqa.i) request).f137236a), null, null, null, null, null, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        lqa.g gVar = lqa.g.OTHER;
        fqa.h hVar = (fqa.h) request;
        fqa.a aVar = hVar.f137232a;
        l lVarB = aVar != null ? b(aVar) : null;
        String str = hVar.f137233b;
        String str2 = hVar.f137234c;
        String str3 = hVar.d;
        String str4 = hVar.e;
        String str5 = hVar.f;
        Address address = hVar.f137235g;
        return new mqa.f(gVar, lVarB, str, str2, str3, str4, str5, address != null ? oo3.a.d(address) : null);
    }

    public static l b(fqa.a aVar) {
        int i = g.f208093a[aVar.ordinal()];
        if (i == 1) {
            return l.MANUAL;
        }
        if (i == 2) {
            return l.CAMERA;
        }
        if (i == 3) {
            return l.NFC;
        }
        throw new NoWhenBranchMatchedException();
    }
}
