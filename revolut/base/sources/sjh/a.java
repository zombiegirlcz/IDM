package sjh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import io3.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p5d.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f263731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f263732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationRequest f263733c;
    public final b d;
    public final w0 e;

    public a(d selectedPocket, ArrayList allPockets, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        Intrinsics.checkNotNullParameter(allPockets, "allPockets");
        this.f263731a = selectedPocket;
        this.f263732b = allPockets;
        this.f263733c = animationRequest;
        this.d = new b(selectedPocket.f163147c, "commodity", null);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(selectedPocket.f163147c);
        aVarNewBuilder.i(hd.COMMODITY);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.e = AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return new AnalyticsContext(this.e);
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return this.f263733c;
    }

    @Override // p5d.a
    public final b c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f263731a, aVar.f263731a) && this.f263732b.equals(aVar.f263732b) && Intrinsics.f(this.f263733c, aVar.f263733c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f263732b, this.f263731a.hashCode() * 31, 31);
        AnimationRequest animationRequest = this.f263733c;
        return iB + (animationRequest == null ? 0 : animationRequest.hashCode());
    }
}
