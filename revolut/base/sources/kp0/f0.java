package kp0;

import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f188000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188001c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(long j2, String str, String str2, String str3) {
        this.f187999a = 3;
        this.f188001c = str;
        this.d = str2;
        this.f188000b = j2;
        this.e = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f187999a) {
            case 0:
                j0 j0Var = (j0) this.f188001c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                Function0 function0 = (Function0) this.e;
                if (this.f188000b != j0Var.f) {
                    return Unit.f186387a;
                }
                ref$BooleanRef.f186407a = true;
                function0.invoke();
                return Unit.f186387a;
            case 1:
                return new AnalyticsContext(m72.b.h((String) this.f188001c, com.bumptech.glide.c.g(new e4k.m0(this.f188000b, (Map) this.d, (com.revolut.analytics.tracking.v3.f) this.e)), AnalyticsContext.INSTANCE));
            case 2:
                return new AnalyticsContext(m72.b.h("screen_performance", com.bumptech.glide.c.g(new e1.e((uo.o0) this.f188001c, this.f188000b, (aim.f) this.d, (com.revolut.analytics.tracking.v3.f) this.e, 5)), AnalyticsContext.INSTANCE));
            case 3:
                return new AnalyticsContext(m72.b.h("retail_database_migration_result", com.bumptech.glide.c.g(new e1.e((String) this.f188001c, (String) this.d, this.f188000b, (String) this.e, 4)), AnalyticsContext.INSTANCE));
            default:
                ro0.y yVar = (ro0.y) this.f188001c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                String str = (String) this.e;
                long j2 = this.f188000b;
                if (!yVar.d(recyclerView, str, j2)) {
                    return Unit.f186387a;
                }
                OneShotPreDrawListener oneShotPreDrawListener = yVar.f255793g;
                if (oneShotPreDrawListener != null) {
                    oneShotPreDrawListener.removeListener();
                }
                yVar.f255793g = OneShotPreDrawListener.add(recyclerView, new yc.d(recyclerView, yVar, recyclerView, str, j2, 2));
                recyclerView.postInvalidateOnAnimation();
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f0(long j2, j0 j0Var, Ref$BooleanRef ref$BooleanRef, Function0 function0) {
        this.f187999a = 0;
        this.f188000b = j2;
        this.f188001c = j0Var;
        this.d = ref$BooleanRef;
        this.e = function0;
    }

    public /* synthetic */ f0(Object obj2, long j2, Map map, com.revolut.analytics.tracking.v3.f fVar, int i) {
        this.f187999a = i;
        this.f188001c = obj2;
        this.f188000b = j2;
        this.d = map;
        this.e = fVar;
    }

    public /* synthetic */ f0(ro0.y yVar, RecyclerView recyclerView, String str, long j2) {
        this.f187999a = 4;
        this.f188001c = yVar;
        this.d = recyclerView;
        this.e = str;
        this.f188000b = j2;
    }
}
