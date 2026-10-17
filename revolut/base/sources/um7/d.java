package um7;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import upd.h;
import ut.g;
import ut.k;
import ut.l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281266b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f281265a = i;
        this.f281266b = obj2;
    }

    private final Object a(Object obj2) {
        l lVar = (l) this.f281266b;
        g update = (g) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        BiometricVerificationDocument biometricVerificationDocument = ((k) lVar).f283006a;
        wi0.b currentCountry = update.f283000a;
        List documents = update.f283001b;
        Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new g(currentCountry, documents, biometricVerificationDocument);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0694 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f3  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um7.d.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ d(h hVar, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar) {
        this.f281265a = 19;
        this.f281266b = aVar;
    }
}
