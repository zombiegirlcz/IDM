package qn2;

import com.revolut.feature.bank_account_switching.impl.ui.request_status.domain.RequestStatus$Link;
import kotlin.jvm.internal.Intrinsics;
import rn2.x;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f247867a = new p();

    private p() {
    }

    public static RequestStatus$Link a(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return new RequestStatus$Link(xVar.getTitle(), xVar.getUrl());
    }
}
