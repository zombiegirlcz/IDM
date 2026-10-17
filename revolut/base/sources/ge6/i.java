package ge6;

import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f143237b;

    public /* synthetic */ i(l lVar, int i) {
        this.f143236a = i;
        this.f143237b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ExtensionAuthRequestData requestData = (ExtensionAuthRequestData) obj2;
        switch (this.f143236a) {
            case 0:
                Intrinsics.checkNotNullParameter(requestData, "it");
                fe6.a aVar = this.f143237b.f143240a;
                Intrinsics.checkNotNullParameter(requestData, "requestData");
                return ((be6.j) aVar.f134453a).a(requestData.getF72187h()).D(requestData);
            default:
                te0.e eVarW0 = ((w) this.f143237b.f143241b).w0();
                Intrinsics.h(requestData);
                eVarW0.set(requestData);
                return Unit.f186387a;
        }
    }
}
