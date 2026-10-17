package u4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n3j.q;
import tw9.h;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f277370b;

    public /* synthetic */ c(f fVar, int i) {
        this.f277369a = i;
        this.f277370b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f277369a) {
            case 0:
                q output = (q) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                f fVar = this.f277370b;
                h hVar = new h(fVar, output, null, 3);
                output.getClass();
                fVar.J2("AccountFieldsScreenContract_BUTTON_TAG", hVar);
                break;
            default:
                x2j.b it8 = (x2j.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f277370b.C2(it8);
                break;
        }
        return Unit.f186387a;
    }
}
