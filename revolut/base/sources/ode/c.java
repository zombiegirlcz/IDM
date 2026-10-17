package ode;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import java.time.format.DateTimeFormatter;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import pde.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static e a(TransferArrivalRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        jo3.a aVarP = mo3.a.p(request.f89381a);
        String str = request.f89382b;
        String str2 = request.f89383c.format(DateTimeFormatter.ISO_LOCAL_DATE);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String[] elements = {request.d ? "SALARY_PAYMENT" : null, request.e ? "WIRE" : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new e(str, str2, d.L(elements), aVarP);
    }
}
