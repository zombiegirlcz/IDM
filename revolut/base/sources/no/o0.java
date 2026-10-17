package no;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes17.dex */
public final class o0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.analytics.tracking.v3.f f217823b;

    public /* synthetic */ o0(com.revolut.analytics.tracking.v3.f fVar, int i) {
        this.f217822a = i;
        this.f217823b = fVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f217822a) {
            case 0:
                final boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                com.revolut.analytics.tracking.v3.f.g(this.f217823b, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new Function0() { // from class: no.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new AnalyticsContext(m72.b.h("screen_recording_detection", com.bumptech.glide.c.g(new lph.c(zBooleanValue, 22)), AnalyticsContext.INSTANCE));
                    }
                }, 14);
                break;
            default:
                kj0.c cVar = (kj0.c) obj2;
                String str = cVar.f184259a;
                String str2 = cVar.f184260b;
                String str3 = cVar.f184261c;
                String str4 = cVar.d;
                com.revolut.analytics.tracking.v3.f.g(this.f217823b, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new bib.b(str, str2, str3, str4, 21), 14);
                break;
        }
        return Unit.f186387a;
    }
}
