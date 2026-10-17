package gi1;

import com.revolut.feature.address.models.CountryState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountryState f144053b;

    public /* synthetic */ u(CountryState countryState, int i) {
        this.f144052a = i;
        this.f144053b = countryState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144052a) {
            case 0:
                k kVar = (k) obj2;
                return k.a(kVar, sh1.h.a(kVar.f144028a, null, null, new sh1.g(this.f144053b.getName(), null, 6), null, null, null, null, null, null, null, null, null, 8183), null, null, null, false, null, null, null, null, null, null, 65534);
            default:
                sh1.h hVar = (sh1.h) obj2;
                return sh1.h.a(hVar, null, null, sh1.g.a(hVar.d, this.f144053b.getName(), null, 6), null, null, null, null, null, null, null, null, null, 8183);
        }
    }
}
