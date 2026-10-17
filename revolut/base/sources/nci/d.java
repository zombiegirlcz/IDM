package nci;

import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadTermsController f214201b;

    public /* synthetic */ d(ReadTermsController readTermsController, int i) {
        this.f214200a = i;
        this.f214201b = readTermsController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f214200a;
        ReadTermsController readTermsController = this.f214201b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = ReadTermsController.T;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.f179521c = false;
                setup.d = new d(readTermsController, 1);
                break;
            default:
                Exception error = (Exception) obj2;
                KProperty[] kPropertyArr2 = ReadTermsController.T;
                Intrinsics.checkNotNullParameter(error, "error");
                r rVar = (r) readTermsController.e3();
                rVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                rVar.H2(rVar.f214217s, new ab4.q(error, 29));
                break;
        }
        return Unit.f186387a;
    }
}
