package fzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.CustomisationState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomisationParameters f139156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomisationSelection f139157c;

    public /* synthetic */ p(CustomisationParameters customisationParameters, CustomisationSelection customisationSelection, int i) {
        this.f139155a = i;
        this.f139156b = customisationParameters;
        this.f139157c = customisationSelection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139155a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data parameters = new Data(this.f139156b, null, false, 6, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                CustomisationSelection selection = this.f139157c;
                Intrinsics.checkNotNullParameter(selection, "selection");
                return new j(parameters, selection);
            default:
                return pzd.p.a((pzd.p) obj2, null, null, null, null, null, zi0.c.P(new CustomisationState(this.f139156b, this.f139157c), false, null, 3), 383);
        }
    }
}
