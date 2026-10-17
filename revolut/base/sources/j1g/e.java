package j1g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelExperienceDatesSelection f170458b;

    public /* synthetic */ e(TravelExperienceDatesSelection travelExperienceDatesSelection, int i) {
        this.f170457a = i;
        this.f170458b = travelExperienceDatesSelection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f170457a) {
            case 0:
                c update = (c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                TravelExperienceDatesSelection datesSelection = this.f170458b;
                Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
                return new c(datesSelection);
            default:
                o3g.f updateState = (o3g.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return o3g.f.a(updateState, this.f170458b);
        }
    }
}
