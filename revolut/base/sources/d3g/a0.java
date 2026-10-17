package d3g;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3g.a f111103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1g.c f111104c;

    public /* synthetic */ a0(h3g.a aVar, c1g.c cVar, int i) {
        this.f111102a = i;
        this.f111103b = aVar;
        this.f111104c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111102a) {
            case 0:
                h3g.a updateAnswer = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer, "$this$updateAnswer");
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = this.f111103b.f149114a;
                c1g.c cVar = this.f111104c;
                return h3g.a.a(updateAnswer, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer, cVar.f20473a, null, 29), new TextClause(cVar.f20474b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
            default:
                h3g.a updateAnswer2 = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer2, "$this$updateAnswer");
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer2 = this.f111103b.f149114a;
                c1g.c cVar2 = this.f111104c;
                return h3g.a.a(updateAnswer2, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer2, cVar2.f20473a, null, 29), new TextClause(cVar2.f20474b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
        }
    }
}
