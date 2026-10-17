package fzd;

import com.revolut.feature.statements.api.models.CustomisationSelection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomisationSelection f139151b;

    public /* synthetic */ n(CustomisationSelection customisationSelection, int i) {
        this.f139150a = i;
        this.f139151b = customisationSelection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139150a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, null, this.f139151b, 1);
            case 1:
                j update2 = (j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return j.a(update2, null, this.f139151b, 1);
            case 2:
                return j.a((j) obj2, null, this.f139151b, 1);
            case 3:
                return j.a((j) obj2, null, this.f139151b, 1);
            case 4:
                return j.a((j) obj2, null, this.f139151b, 1);
            case 5:
                return j.a((j) obj2, null, this.f139151b, 1);
            default:
                xzd.k update3 = (xzd.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xzd.k.a(update3, null, this.f139151b, null, false, 13);
        }
    }
}
