package d3g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2g.d f111148b;

    public /* synthetic */ w(q2g.d dVar, int i) {
        this.f111147a = i;
        this.f111148b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111147a) {
            case 0:
                h3g.a updateAnswer = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer, "$this$updateAnswer");
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = updateAnswer.f149114a;
                q2g.e eVar = (q2g.e) this.f111148b;
                return h3g.a.a(updateAnswer, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer, eVar.f241646a.f92826a, myf.d.LOCATION_REF, 25), new TextClause(eVar.f241646a.f92827b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
            default:
                h3g.a updateAnswer2 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer2, "$this$updateAnswer");
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer2 = updateAnswer2.f149114a;
                q2g.e eVar2 = (q2g.e) this.f111148b;
                return h3g.a.a(updateAnswer2, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer2, eVar2.f241646a.f92826a, myf.d.LOCATION_REF, 25), new TextClause(eVar2.f241646a.f92827b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
        }
    }
}
