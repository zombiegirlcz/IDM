package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ag;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xg implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p70 f34978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p70 f34979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z10 f34980c;
    private final ag.b d;

    public xg(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        p70 p70VarA = lottieServiceLocator.a(k70.k);
        this.f34978a = p70VarA;
        p70 p70VarA2 = lottieServiceLocator.a(k70.i);
        this.f34979b = p70VarA2;
        this.f34980c = imageServiceLocator.a(r10.J0);
        c81.a aVar = c81.f27404a;
        this.d = new ag.b(c81.a.a(aVar, R.string.step_document_processing_header_processing, 0, 2, null), c81.a.a(aVar, R.string.step_document_processing_message, 0, 2, null), p70VarA, p70VarA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ag.b a(xg xgVar, ag agVar) {
        Intrinsics.checkNotNullParameter(agVar, "<this>");
        return ag.b.a(xgVar.getInitialState(), null, c81.a.a(c81.f27404a, R.string.step_document_processing_message_waiting, 0, 2, null), null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ag.a b(xg xgVar, ag agVar) {
        Intrinsics.checkNotNullParameter(agVar, "<this>");
        return new ag.a(c81.a.a(c81.f27404a, R.string.step_document_processing_header_success, 0, 2, null), c81.b.f27406b, xgVar.f34978a, xgVar.f34980c);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ag.b getInitialState() {
        return this.d;
    }

    public final Function1 s() {
        return new mt1(this, 1);
    }

    public final Function1 v() {
        return new mt1(this, 0);
    }
}
