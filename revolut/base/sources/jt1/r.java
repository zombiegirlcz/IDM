package jt1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f178296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f178297c;

    public /* synthetic */ r(z zVar, String str, int i) {
        this.f178295a = i;
        this.f178296b = zVar;
        this.f178297c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f178295a) {
            case 0:
                BizumTransferData updateTransferData = (BizumTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                w80.b bVar = this.f178296b.f178312y;
                updateTransferData.getClass();
                return BizumTransferData.e(updateTransferData, null, bVar.b(this.f178297c, gs1.b.f146272a.f306286a), null, null, 29);
            default:
                a updateState = (a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return a.a(updateState, BizumTransferData.e(this.f178296b.B2(), null, 0L, null, this.f178297c, 23), null, 0, 27);
        }
    }
}
