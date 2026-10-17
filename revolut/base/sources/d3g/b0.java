package d3g;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f111108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111109c;

    public /* synthetic */ b0(String str, String str2, int i) {
        this.f111107a = i;
        this.f111108b = str;
        this.f111109c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f111107a) {
            case 0:
                return new TravelExperiencesBookingPrerequisiteQuestion(this.f111108b, this.f111109c);
            case 1:
                return new AnalyticsContext(m72.b.h("detected_malicious_software_info", com.bumptech.glide.c.g(new avj.o(this.f111108b, this.f111109c, 22)), AnalyticsContext.INSTANCE));
            default:
                return new TravelExperiencesBookingPrerequisiteQuestion(this.f111108b, this.f111109c);
        }
    }
}
