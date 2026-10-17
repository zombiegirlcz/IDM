package no;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.NudgeContext;
import grl.i7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class p1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217825a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f217826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f217827c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p1(long j2, boolean z, Modifier modifier, OffsetProvider offsetProvider) {
        this.f217826b = j2;
        this.f217827c = z;
        this.d = modifier;
        this.e = offsetProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f217825a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj2;
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) obj3;
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                NudgeContext.a aVarA = r1.a((r1) obj5, (txl.e) obj4);
                i7 i7Var = i7.Disappeared;
                aVarA.c();
                ((NudgeContext) aVarA.f49761b).setAction(i7Var);
                aVarA.c();
                NudgeContext nudgeContext = (NudgeContext) aVarA.f49761b;
                boolean z = this.f217827c;
                nudgeContext.setInterrupted(z);
                if (z) {
                    aVarA.c();
                    ((NudgeContext) aVarA.f49761b).setDuration(this.f217826b);
                }
                Unit unit = Unit.f186387a;
                com.google.protobuf.w0 w0VarA = aVarA.a();
                companion.getClass();
                return new ho.f(str, analyticsProduct, AnalyticsContext.Companion.a(w0VarA));
            default:
                int iIntValue = ((Integer) obj3).intValue();
                return AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1$0(this.f217826b, this.f217827c, (Modifier) obj5, (OffsetProvider) obj4, (Composer) obj2, iIntValue);
        }
    }

    public /* synthetic */ p1(r1 r1Var, txl.e eVar, boolean z, long j2) {
        this.d = r1Var;
        this.e = eVar;
        this.f217827c = z;
        this.f217826b = j2;
    }
}
