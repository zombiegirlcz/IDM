package f9g;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.retail.core.navigation.NaviCommand;
import f2i.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f132937b;

    public /* synthetic */ a(c cVar, int i) {
        this.f132936a = i;
        this.f132937b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f132936a) {
            case 0:
                TravelHotelsDropoff dropoff = (TravelHotelsDropoff) obj2;
                Intrinsics.checkNotNullParameter(dropoff, "dropoff");
                c cVar = this.f132937b;
                return new pfm.a(cVar.f132941b.a(dropoff), new o(new a(cVar, 1), 26), 3);
            default:
                NaviCommand dropoffNaviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(dropoffNaviCommand, "dropoffNaviCommand");
                pfm.h hVar = new pfm.h(new f0d.m(this.f132937b, dropoffNaviCommand, 2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
        }
    }
}
