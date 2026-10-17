package zkh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements o97.z, p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o97.y f323000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5d.b f323001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f323002c;

    public i(o97.y searchPayload, p5d.b swipeableAsset, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        Intrinsics.checkNotNullParameter(swipeableAsset, "swipeableAsset");
        this.f323000a = searchPayload;
        this.f323001b = swipeableAsset;
        this.f323002c = analyticsContext;
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return this.f323002c;
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f323001b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f323000a, iVar.f323000a) && Intrinsics.f(this.f323001b, iVar.f323001b) && Intrinsics.f(this.f323002c, iVar.f323002c);
    }

    public final int hashCode() {
        int iHashCode = (this.f323001b.hashCode() + (this.f323000a.hashCode() * 31)) * 31;
        AnalyticsContext analyticsContext = this.f323002c;
        return (iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(o97.y searchPayload, nel.n instrument) {
        this(searchPayload, instrument.f214596b, instrument.f214597c, null);
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
    }

    public i(o97.y searchPayload, String instrumentRef, nel.z instrumentType, String str) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        p5d.b bVar = new p5d.b(instrumentRef, "instrument", str);
        hd hdVarM = a.a.M(instrumentType);
        if (hdVarM != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
            aVarNewBuilder.h(instrumentRef);
            aVarNewBuilder.i(hdVarM);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else {
            analyticsContext = null;
        }
        this(searchPayload, bVar, analyticsContext);
    }
}
