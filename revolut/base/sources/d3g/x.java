package d3g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3g.a f111150b;

    public /* synthetic */ x(h3g.a aVar, int i) {
        this.f111149a = i;
        this.f111150b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f111149a) {
            case 0:
                String strB = this.f111150b.f149114a.b();
                m70.a.c(t0.f186434a);
                return new TravelExperiencesBookingPrerequisiteQuestion(strB, "");
            default:
                String strB2 = this.f111150b.f149114a.b();
                m70.a.c(t0.f186434a);
                return new TravelExperiencesBookingPrerequisiteQuestion(strB2, "");
        }
    }
}
