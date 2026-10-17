package ee7;

import com.revolut.feature.in_app_calls.di.VoiceCallsEmptyWrapper;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f125132b;

    public /* synthetic */ f(g gVar, int i) {
        this.f125131a = i;
        this.f125132b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pe7.f fVar;
        int i = this.f125131a;
        g gVar = this.f125132b;
        switch (i) {
            case 0:
                xg0.a aVar = gVar.f125134b;
                z70.a aVar2 = gVar.f125133a;
                if (!((oi0.b) aVar).d(aVar2.getContext(), y0.b(gVar.f125135c)).f305464a.isEmpty()) {
                    return VoiceCallsEmptyWrapper.INSTANCE;
                }
                try {
                    uh0.a.f280049a.a(aVar2.getContext());
                    break;
                } catch (Exception e) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "InAppCalls", j6.a.q("attachContext failed: ", e.getMessage()), null, null, 16);
                }
                try {
                    Class<?> cls = Class.forName("com.revolut.feature.in_app_calls.TwilioVoiceCallsWrapper");
                    Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                    Object objK = nim.a.r(cls).k();
                    Intrinsics.i(objK, "null cannot be cast to non-null type com.revolut.feature.in_app_calls.wrapper.VoiceCallsWrapper");
                    fVar = (pe7.f) objK;
                    break;
                } catch (Throwable th10) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "InAppCalls", j6.a.q("Unable to find class com.revolut.feature.in_app_calls.TwilioVoiceCallsWrapper: ", th10.getMessage()), null, null, 16);
                    fVar = null;
                }
                return fVar == null ? VoiceCallsEmptyWrapper.INSTANCE : fVar;
            default:
                KProperty[] kPropertyArr = g.e;
                gVar.a();
                return Unit.f186387a;
        }
    }
}
