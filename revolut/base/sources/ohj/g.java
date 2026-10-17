package ohj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EsimProfile f225379b;

    public /* synthetic */ g(EsimProfile esimProfile, int i) {
        this.f225378a = i;
        this.f225379b = esimProfile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f225378a) {
            case 0:
                c update = (c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List esimProfiles = update.f225374a;
                Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
                return new c(esimProfiles, this.f225379b);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    return qij.e.f246730a;
                }
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                return new qij.b(this.f225379b);
        }
    }
}
