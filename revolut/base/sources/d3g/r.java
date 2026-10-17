package d3g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3g.b f111134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111135c;

    public /* synthetic */ r(h3g.b bVar, String str, int i) {
        this.f111133a = i;
        this.f111134b = bVar;
        this.f111135c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f111133a) {
        }
        return new TravelExperiencesBookingPrerequisiteQuestion(this.f111134b.f149117a, this.f111135c);
    }
}
