package o8c;

import android.graphics.drawable.Drawable;
import bjl.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f223001b;

    public /* synthetic */ e(l lVar, int i) {
        this.f223000a = i;
        this.f223001b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f223000a;
        l lVar = this.f223001b;
        switch (i) {
            case 0:
                y modalResult = (y) obj2;
                Intrinsics.checkNotNullParameter(modalResult, "modalResult");
                if (lVar.d()) {
                    m.Companion companion = m.INSTANCE;
                    lVar.resumeWith(modalResult);
                }
                return Unit.f186387a;
            case 1:
                bpf.c result = (bpf.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (lVar.d()) {
                    m.Companion companion2 = m.INSTANCE;
                    lVar.resumeWith(result);
                }
                return Unit.f186387a;
            case 2:
                dsf.e result2 = (dsf.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                if (lVar.d()) {
                    m.Companion companion3 = m.INSTANCE;
                    TransferReasonsValues transferReasonsValues = result2.f117310a;
                    Intrinsics.checkNotNullParameter(transferReasonsValues, "<this>");
                    lVar.resumeWith(new bsf.f(new rtf.b(transferReasonsValues)));
                }
                return Unit.f186387a;
            case 3:
                t1.H(lVar, Boolean.TRUE);
                return Unit.f186387a;
            default:
                Drawable drawable = (Drawable) obj2;
                if (lVar.d()) {
                    if (drawable != null) {
                        m.Companion companion4 = m.INSTANCE;
                        lVar.resumeWith(drawable);
                    } else {
                        m.Companion companion5 = m.INSTANCE;
                        lVar.resumeWith(o.a(new RuntimeException("Unable to load image")));
                    }
                }
                return Unit.f186387a;
        }
    }
}
