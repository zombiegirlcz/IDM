package ob0;

import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223836a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f223837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f223838c;

    public /* synthetic */ q(String str, s sVar) {
        this.f223838c = str;
        this.f223837b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PhoneInputItem.Country model = (PhoneInputItem.Country) obj2;
        switch (this.f223836a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f63576c;
                wi0.b bVar = model.f63574a;
                String str2 = this.f223838c;
                return Boolean.valueOf(!((str != null && a0.H(str, str2, true)) || a0.H(bVar.f297794a, str2, true) || a0.H(String.valueOf(model.f63575b), str2, true) || a0.H(this.f223837b.f223840a.b(new CountryClause(bVar, null)).toString(), str2, true)));
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                String string = model.f63576c;
                if (string == null) {
                    string = this.f223837b.f223840a.b(new CountryClause(model.f63574a, null)).toString();
                }
                String str3 = this.f223838c;
                if (d0.J(string, str3, true)) {
                    return Integer.valueOf(d0.T(string, str3, 0, true, 2));
                }
                return Integer.MAX_VALUE;
        }
    }

    public /* synthetic */ q(s sVar, String str) {
        this.f223837b = sVar;
        this.f223838c = str;
    }
}
