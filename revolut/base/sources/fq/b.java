package fq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.AndroidRemoteViewsKt;
import androidx.glance.layout.SizeModifiersKt;
import com.revolut.appwidget_core.a;
import k01.p;
import k01.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137137a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k01.e f137138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appwidget_core.a f137139c;
    public final /* synthetic */ k01.n d;

    public /* synthetic */ b(com.revolut.appwidget_core.a aVar, k01.e eVar, k01.n nVar) {
        this.f137139c = aVar;
        this.f137138b = eVar;
        this.d = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f137137a;
        k01.n nVar = this.d;
        com.revolut.appwidget_core.a aVar = this.f137139c;
        k01.e eVar = this.f137138b;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                a.C0392a c0392a = com.revolut.appwidget_core.a.Companion;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1610095792, iIntValue, -1, "com.revolut.appwidget_core.AppWidget.renderOnboardingState.<anonymous> (AppWidget.kt:147)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) q.f179917a.provides((p) aVar.f.getValue()), ComposableLambdaKt.rememberComposableLambda(-595406864, true, new b(eVar, aVar, nVar), composer, 54), composer, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                a.C0392a c0392a2 = com.revolut.appwidget_core.a.Companion;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-595406864, iIntValue, -1, "com.revolut.appwidget_core.AppWidget.renderOnboardingState.<anonymous>.<anonymous> (AppWidget.kt:148)");
                    }
                    if (eVar instanceof k01.b) {
                        composer.startReplaceGroup(449101122);
                        ((k01.b) eVar).a(composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(449193843);
                        AndroidRemoteViewsKt.AndroidRemoteViews(((k01.d) aVar.f50369c.getValue()).a(nVar, com.revolut.appwidget_core.a.a(composer)), SizeModifiersKt.fillMaxHeight(SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE)), composer, 0, 0);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ b(k01.e eVar, com.revolut.appwidget_core.a aVar, k01.n nVar) {
        this.f137138b = eVar;
        this.f137139c = aVar;
        this.d = nVar;
    }
}
