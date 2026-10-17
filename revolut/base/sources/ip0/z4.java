package ip0;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarRowDelegate f167395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarRowDelegate.Model f167396c;

    public /* synthetic */ z4(CalendarRowDelegate calendarRowDelegate, CalendarRowDelegate.Model model, int i) {
        this.f167394a = i;
        this.f167395b = calendarRowDelegate;
        this.f167396c = model;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f167394a) {
            case 0:
                this.f167395b.f51750g.onNext(this.f167396c);
                break;
            default:
                this.f167395b.f51751h.onNext(this.f167396c);
                break;
        }
        return Unit.f186387a;
    }
}
