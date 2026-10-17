package a26;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f691b;

    public /* synthetic */ r(int i, ArrayList arrayList) {
        this.f690a = i;
        this.f691b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f690a) {
            case 0:
                return this.f691b;
            case 1:
                return t17.a.c((ju6.b) d0.b0(this.f691b)).f267205a;
            default:
                return new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_header_title, u.c(Integer.valueOf(this.f691b.size())), null, 12);
        }
    }

    public /* synthetic */ r(u17.a aVar, ArrayList arrayList) {
        this.f690a = 1;
        this.f691b = arrayList;
    }
}
