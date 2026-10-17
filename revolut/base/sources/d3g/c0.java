package d3g;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencesBookingPrerequisiteQuestion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.TextData f111111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111112c;

    public /* synthetic */ c0(InputTextDelegate.TextData textData, String str, int i) {
        this.f111110a = i;
        this.f111111b = textData;
        this.f111112c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f111110a) {
        }
        return new TravelExperiencesBookingPrerequisiteQuestion(this.f111111b.f52597a, this.f111112c);
    }
}
