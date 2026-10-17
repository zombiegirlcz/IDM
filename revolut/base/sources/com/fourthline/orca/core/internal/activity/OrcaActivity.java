package com.fourthline.orca.core.internal.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.content.NavHostController;
import androidx.content.Navigator;
import androidx.content.compose.NavHostControllerKt;
import androidx.view.ComponentActivity;
import androidx.view.EdgeToEdge;
import androidx.view.compose.ComponentActivityKt;
import com.fourthline.orca.internal.a80;
import com.fourthline.orca.internal.bj0;
import com.fourthline.orca.internal.cj0;
import com.fourthline.orca.internal.d;
import com.fourthline.orca.internal.dh0;
import com.fourthline.orca.internal.gj0;
import com.fourthline.orca.internal.hj0;
import com.fourthline.orca.internal.pg0;
import com.fourthline.orca.internal.s80;
import com.fourthline.orca.internal.t80;
import com.fourthline.orca.internal.wp0;
import com.fourthline.orca.internal.zp0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/fourthline/orca/core/internal/activity/OrcaActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/fourthline/orca/internal/bj0;", "", "a", "(Lcom/fourthline/orca/internal/bj0;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "Landroidx/navigation/NavHostController;", "navController", "(Landroidx/navigation/NavHostController;)Lcom/fourthline/orca/internal/bj0;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onNewIntent", "onDestroy", "", "b", "()Z", "isOrcaInstanceCurrent", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrcaActivity extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f26647b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static dh0 f26648c;
    private static d d;
    private static String e;

    /* JADX INFO: renamed from: com.fourthline.orca.core.internal.activity.OrcaActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(dh0 dh0Var) {
            OrcaActivity.f26648c = dh0Var;
        }

        private Companion() {
        }

        public final d a() {
            return OrcaActivity.d;
        }

        public final void a(String str) {
            OrcaActivity.e = str;
        }
    }

    public static final /* synthetic */ class b extends q implements Function0 {
        public b(Object obj2) {
            super(0, 0, OrcaActivity.class, obj2, "finish", "finish()V");
        }

        public final void a() {
            ((OrcaActivity) this.receiver).finish();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(OrcaActivity orcaActivity, bj0 bj0Var, int i, Composer composer, int i2) {
        orcaActivity.a(bj0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    private final boolean b() {
        return Intrinsics.f(e, getIntent().getStringExtra("productName"));
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        d dVar = d;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        window.setAttributes(attributes);
        if (savedInstanceState != null || f26648c == null) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1330793609, true, new c(this, 0)), 1, null);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (b()) {
            f26648c = null;
            d = null;
        }
        super.onDestroy();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        d dVar = d;
        if (dVar != null) {
            dVar.a(intent);
        } else {
            a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(OrcaActivity orcaActivity, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1330793609, i, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.onCreate.<anonymous> (OrcaActivity.kt:50)");
            }
            NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
            boolean zChanged = composer.changed(f26648c);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = f26648c != null ? orcaActivity.a(navHostControllerRememberNavController) : null;
                composer.updateRememberedValue(objRememberedValue);
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) pg0.b().provides(orcaActivity), ComposableLambdaKt.rememberComposableLambda(1620373833, true, new a((bj0) objRememberedValue, orcaActivity), composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bj0 bj0Var, OrcaActivity orcaActivity, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1620373833, i, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.onCreate.<anonymous>.<anonymous> (OrcaActivity.kt:60)");
            }
            if (bj0Var == null) {
                composer.startReplaceGroup(1419455368);
            } else {
                composer.startReplaceGroup(-1893873767);
                orcaActivity.a(bj0Var, composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private final void a(bj0 bj0Var, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1680374697);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bj0Var) : composerStartRestartGroup.changedInstance(bj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1680374697, i2, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.OrcaComposable (OrcaActivity.kt:69)");
            }
            hj0.a((gj0) SnapshotStateKt.collectAsState(bj0Var.q().a(), null, composerStartRestartGroup, 0, 1).getValue(), ComposableLambdaKt.rememberComposableLambda(-1584277331, true, new a(SnapshotStateKt.collectAsState(bj0Var.k().c(), null, composerStartRestartGroup, 0, 1), bj0Var, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.fourthline.orca.core.internal.activity.b(this, bj0Var, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(State state, bj0 bj0Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1584277331, i, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.OrcaComposable.<anonymous> (OrcaActivity.kt:75)");
            }
            Modifier modifierA = a80.a(SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), state.getValue() == null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierA);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            s80.a(bj0Var, composer, 0);
            composer.endNode();
            wp0.a((zp0) state.getValue(), bj0Var.k().b(), composer, 0);
            bj0Var.x().startDataCollection();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private final void a(Intent intent) {
        String type = intent.getType();
        if (type == null) {
            type = "n/a";
        }
        Pair pair = new Pair("type", type);
        String str = intent.getPackage();
        if (str == null) {
            str = "n/a";
        }
        Pair pair2 = new Pair("package", str);
        String action = intent.getAction();
        hb.a.b(2, "android_unexpected_intent", null, r0.k(pair, pair2, new Pair("action", action != null ? action : "n/a")));
    }

    private final bj0 a(NavHostController navController) {
        dh0 dh0Var = f26648c;
        if (dh0Var != null) {
            cj0 cj0VarB = dh0Var.b();
            d dVar = new d(this, dh0Var.a().getFlavor().getLocalization(), new b(this));
            d = dVar;
            cj0 cj0VarA = cj0VarB.a(dVar);
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            bj0 bj0VarBuild = cj0VarA.a(new t80(navController, window)).build();
            bj0VarBuild.j().a();
            return bj0VarBuild;
        }
        throw new RuntimeException("FL developer error. Check that component was set!");
    }
}
