package ahd;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ogd.k f4965b;

    public /* synthetic */ w(ogd.k kVar, int i) {
        this.f4964a = i;
        this.f4965b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4964a) {
            case 0:
                return n.a((n) obj2, this.f4965b, null, null, null, 14);
            default:
                jhd.f update = (jhd.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List availableSortingTypes = update.f174208b;
                ogd.k selected = this.f4965b;
                Intrinsics.checkNotNullParameter(selected, "selected");
                Intrinsics.checkNotNullParameter(availableSortingTypes, "availableSortingTypes");
                return new jhd.f(selected, availableSortingTypes);
        }
    }
}
