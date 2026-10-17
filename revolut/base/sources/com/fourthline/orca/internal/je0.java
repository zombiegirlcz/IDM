package com.fourthline.orca.internal;

import android.app.PendingIntent;
import android.nfc.NfcAdapter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.view.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class je0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(853238935);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(853238935, i, -1, "com.fourthline.orca.core.internal.capabilities.nfc.NfcForegroundDispatcher (NfcForegroundDispatcher.kt:21)");
            }
            ComponentActivity componentActivity = (ComponentActivity) composerStartRestartGroup.consume(pg0.b());
            boolean zChanged = composerStartRestartGroup.changed(componentActivity);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = NfcAdapter.getDefaultAdapter(componentActivity.getApplicationContext());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            NfcAdapter nfcAdapter = (NfcAdapter) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(componentActivity) | composerStartRestartGroup.changedInstance(nfcAdapter);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new jn1(componentActivity, nfcAdapter, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mg0.a((Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm1(i, 1));
        }
    }

    private static final Unit a(NfcAdapter nfcAdapter, ComponentActivity componentActivity) {
        if (nfcAdapter == null) {
            return null;
        }
        nfcAdapter.disableForegroundDispatch(componentActivity);
        return Unit.f186387a;
    }

    private static final void a(ComponentActivity componentActivity, NfcAdapter nfcAdapter) {
        PendingIntent activity = PendingIntent.getActivity(componentActivity, 0, componentActivity.getIntent(), 33554432);
        if (nfcAdapter != null) {
            nfcAdapter.enableForegroundDispatch(componentActivity, activity, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ComponentActivity componentActivity, NfcAdapter nfcAdapter, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            a(componentActivity, nfcAdapter);
        } else if (i == 2) {
            a(nfcAdapter, componentActivity);
        }
        return Unit.f186387a;
    }
}
