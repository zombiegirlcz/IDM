package ob0;

import com.revolut.feature.backend_flow.domain.models.CountrySelectionOption;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223825a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f223826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f223827c;

    public /* synthetic */ j(String str, m mVar) {
        this.f223827c = str;
        this.f223826b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CountrySelectionOption model = (CountrySelectionOption) obj2;
        switch (this.f223825a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f63373b;
                String str2 = this.f223827c;
                return Boolean.valueOf(!((str != null && a0.H(str, str2, true)) || a0.H(model.f63372a.f297794a, str2, true) || a0.H(this.f223826b.p(model), str2, true)));
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                String strP = model.f63373b;
                if (strP == null) {
                    strP = this.f223826b.p(model);
                }
                String str3 = this.f223827c;
                if (d0.J(strP, str3, true)) {
                    return Integer.valueOf(d0.T(strP, str3, 0, true, 2));
                }
                return Integer.MAX_VALUE;
        }
    }

    public /* synthetic */ j(m mVar, String str) {
        this.f223826b = mVar;
        this.f223827c = str;
    }
}
