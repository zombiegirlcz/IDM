package fq;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.AndroidRemoteViewsKt;
import androidx.glance.layout.SizeModifiersKt;
import com.revolut.appwidget_core.a;
import k01.p;
import k01.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137141a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StateFlow f137142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appwidget_core.a f137143c;

    public /* synthetic */ e(com.revolut.appwidget_core.a aVar, StateFlow stateFlow) {
        this.f137143c = aVar;
        this.f137142b = stateFlow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f137141a;
        com.revolut.appwidget_core.a aVar = this.f137143c;
        StateFlow stateFlow = this.f137142b;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1511458451, iIntValue, -1, "com.revolut.appwidget_core.AppWidget.collectAndRender.<anonymous>.<anonymous> (AppWidget.kt:75)");
                    }
                    ProvidableCompositionLocal providableCompositionLocal = q.f179917a;
                    a.C0392a c0392a = com.revolut.appwidget_core.a.Companion;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) providableCompositionLocal.provides((p) aVar.f.getValue()), ComposableLambdaKt.rememberComposableLambda(-1003037523, true, new e(stateFlow, aVar), composer, 54), composer, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1003037523, iIntValue, -1, "com.revolut.appwidget_core.AppWidget.collectAndRender.<anonymous>.<anonymous>.<anonymous> (AppWidget.kt:76)");
                    }
                    k01.n nVar = (k01.n) SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1).getValue();
                    if (nVar instanceof k01.b) {
                        composer.startReplaceGroup(-1403194672);
                        ((k01.b) nVar).a(composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1403111747);
                        a.C0392a c0392a2 = com.revolut.appwidget_core.a.Companion;
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

    public /* synthetic */ e(StateFlow stateFlow, com.revolut.appwidget_core.a aVar) {
        this.f137142b = stateFlow;
        this.f137143c = aVar;
    }
}
