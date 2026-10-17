package nc1;

import com.revolut.feature.acquiring.lite_pos.api.model.LitePosReceiptState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f214133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f214134c;
    public final /* synthetic */ dj0.d d;

    public /* synthetic */ i(m mVar, String str, dj0.d dVar, int i) {
        this.f214132a = i;
        this.f214133b = mVar;
        this.f214134c = str;
        this.d = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        n1 dialogResult = (n1) obj2;
        switch (this.f214132a) {
            case 0:
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                m mVar = this.f214133b;
                mVar.A.d.onNext(xc1.d.f);
                if (dialogResult instanceof l1) {
                    mVar.C2();
                } else if (dialogResult instanceof m1) {
                    mVar.u2();
                } else if (!(dialogResult instanceof j1) || (str = this.f214134c) == null) {
                    mVar.B2();
                    mVar.G2(d.AMOUNT);
                    mVar.B.S(false);
                } else {
                    mVar.B2();
                    mVar.G2(d.NONE);
                    mVar.E2(str, this.d, LitePosReceiptState.DECLINED);
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                m mVar2 = this.f214133b;
                mVar2.A.d.onNext(xc1.d.f);
                if (dialogResult instanceof m1) {
                    mVar2.u2();
                } else if (dialogResult instanceof j1) {
                    mVar2.B2();
                    mVar2.G2(d.NONE);
                    String str2 = this.f214134c;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mVar2.E2(str2, this.d, LitePosReceiptState.APPROVED);
                } else {
                    mVar2.B2();
                    mVar2.G2(d.AMOUNT);
                    mVar2.B.S(false);
                }
                return Unit.f186387a;
        }
    }
}
