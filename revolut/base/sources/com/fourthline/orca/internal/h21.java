package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.c21;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h21 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(c21.b bVar, Function1 function1, Function0 function0, Function1 function12, int i, Composer composer, int i2) {
        a(bVar, function1, function0, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(c21.b bVar, Function1 function1, Function0 function0, Function1 function12, int i, Composer composer, int i2) {
        b(bVar, function1, function0, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    private static final void a(c21.b bVar, Function1 function1, Function0 function0, Function1 function12, Composer composer, int i) {
        int i2;
        Function1 function13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-720319755);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bVar) : composerStartRestartGroup.changedInstance(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function13 = function12;
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function12;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-720319755, i2, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen (SelfieScannerOverlayScreen.kt:63)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new vm1(mutableState, function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AnimatedVisibilityKt.AnimatedVisibility(!(bVar instanceof c21.b.e), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, BitmapDescriptorFactory.HUE_RED, 3, null), EnterExitTransitionKt.fadeOut$default(null, BitmapDescriptorFactory.HUE_RED, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(310356253, true, new pi1(bVar, mutableState, function0, (Function1) objRememberedValue2, function13), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sm1(bVar, function1, function0, function12, i, 0));
        }
    }

    public static final void b(c21.b state, Function1 onMaskPositionUpdated, Function0 onClosedClicked, Function1 onLivenessFaceDirectionAnimationFinishedPlaying, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onMaskPositionUpdated, "onMaskPositionUpdated");
        Intrinsics.checkNotNullParameter(onClosedClicked, "onClosedClicked");
        Intrinsics.checkNotNullParameter(onLivenessFaceDirectionAnimationFinishedPlaying, "onLivenessFaceDirectionAnimationFinishedPlaying");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1202534435);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMaskPositionUpdated) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClosedClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLivenessFaceDirectionAnimationFinishedPlaying) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1202534435, i2, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.SelfieScannerOverlayScreen (SelfieScannerOverlayScreen.kt:48)");
            }
            composer2 = composerStartRestartGroup;
            a(state, onMaskPositionUpdated, onClosedClicked, onLivenessFaceDirectionAnimationFinishedPlaying, composer2, i2 & 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sm1(state, onMaskPositionUpdated, onClosedClicked, onLivenessFaceDirectionAnimationFinishedPlaying, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit b(com.fourthline.orca.internal.c21.b r8, androidx.compose.runtime.Composer r9, int r10) {
        /*
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r3
        La:
            r1 = r10 & 1
            boolean r0 = r9.shouldExecute(r0, r1)
            if (r0 == 0) goto Lc1
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L21
            r0 = -1
            java.lang.String r1 = "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (SelfieScannerOverlayScreen.kt:122)"
            r4 = 363441185(0x15a9ac21, float:6.853013E-26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r10, r0, r1)
        L21:
            boolean r10 = r8 instanceof com.fourthline.orca.internal.c21.b.c
            r0 = 0
            if (r10 == 0) goto L73
            r10 = -336100054(0xffffffffebf7852a, float:-5.9846705E26)
            r9.startReplaceGroup(r10)
            r10 = r8
            com.fourthline.orca.internal.c21$b$c r10 = (com.fourthline.orca.internal.c21.b.c) r10
            boolean r1 = r10 instanceof com.fourthline.orca.internal.c21.b.c.a
            if (r1 == 0) goto L46
            r10 = 1374634009(0x51ef4019, float:1.2844657E11)
            r9.startReplaceGroup(r10)
            com.fourthline.orca.internal.c21$b$c$a r8 = (com.fourthline.orca.internal.c21.b.c.a) r8
            kotlin.Pair r8 = r8.q()
            com.fourthline.orca.internal.py0.a(r0, r8, r9, r3, r2)
            r9.endReplaceGroup()
            goto L60
        L46:
            boolean r10 = r10 instanceof com.fourthline.orca.internal.c21.b.c.C0177b
            if (r10 == 0) goto L64
            r10 = -335880791(0xffffffffebfadda9, float:-6.0655643E26)
            r9.startReplaceGroup(r10)
            com.fourthline.orca.internal.c21$b$c$b r8 = (com.fourthline.orca.internal.c21.b.c.C0177b) r8
            kotlin.Pair r10 = r8.n()
            com.fourthline.orca.internal.z10 r8 = r8.o()
            com.fourthline.orca.internal.py0.a(r8, r10, r9, r3, r3)
            r9.endReplaceGroup()
        L60:
            r9.endReplaceGroup()
            goto Lb7
        L64:
            r8 = 1374631384(0x51ef35d8, float:1.2842507E11)
            r9.startReplaceGroup(r8)
            r9.endReplaceGroup()
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L73:
            r10 = -335623739(0xffffffffebfec9c5, float:-6.1603998E26)
            r9.startReplaceGroup(r10)
            boolean r10 = r8 instanceof com.fourthline.orca.internal.c21.b.C0176b
            if (r10 == 0) goto L86
            r10 = r8
            com.fourthline.orca.internal.c21$b$b r10 = (com.fourthline.orca.internal.c21.b.C0176b) r10
            com.fourthline.orca.internal.z00 r10 = r10.n()
        L84:
            r1 = r10
            goto L93
        L86:
            boolean r10 = r8 instanceof com.fourthline.orca.internal.c21.b.a
            if (r10 == 0) goto L92
            r10 = r8
            com.fourthline.orca.internal.c21$b$a r10 = (com.fourthline.orca.internal.c21.b.a) r10
            com.fourthline.orca.internal.z00 r10 = r10.n()
            goto L84
        L92:
            r1 = r0
        L93:
            boolean r10 = r8 instanceof com.fourthline.orca.internal.d21
            if (r10 == 0) goto La0
            r10 = r8
            com.fourthline.orca.internal.d21 r10 = (com.fourthline.orca.internal.d21) r10
            com.fourthline.orca.internal.z10 r10 = r10.n()
            r2 = r10
            goto La1
        La0:
            r2 = r0
        La1:
            boolean r10 = r8 instanceof com.fourthline.orca.internal.c21.b.d
            if (r10 == 0) goto Lab
            com.fourthline.orca.internal.c21$b$d r8 = (com.fourthline.orca.internal.c21.b.d) r8
            com.fourthline.orca.internal.p70 r0 = r8.n()
        Lab:
            r3 = r0
            r6 = 0
            r7 = 8
            r4 = 0
            r5 = r9
            com.fourthline.orca.internal.j21.a(r1, r2, r3, r4, r5, r6, r7)
            r5.endReplaceGroup()
        Lb7:
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto Lc5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto Lc5
        Lc1:
            r5 = r9
            r5.skipToGroupEnd()
        Lc5:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.h21.b(com.fourthline.orca.internal.c21$b, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, Function1 function1, Rect position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (!Intrinsics.f(mutableState.getValue(), position)) {
            function1.invoke(position);
            mutableState.setValue(position);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(c21.b bVar, MutableState mutableState, Function0 function0, Function1 function1, Function1 function12, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        long jA;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(310356253, i, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen.<anonymous> (SelfieScannerOverlayScreen.kt:78)");
        }
        if (a(bVar)) {
            composer.startReplaceGroup(1899618760);
            composer.endReplaceGroup();
            jA = Color.INSTANCE.m1993getTransparent0d7_KjU();
        } else {
            composer.startReplaceGroup(1899620418);
            jA = zi0.a(fj0.f28535a.b(composer, 6).getIb.b.Scanner java.lang.String()).a(composer, 0);
            composer.endReplaceGroup();
        }
        Rect zero = a(bVar) ? Rect.INSTANCE.getZero() : (Rect) mutableState.getValue();
        kr0.a(jA, zero, false, ComposableLambdaKt.rememberComposableLambda(1263034557, true, new um1(bVar, function0, function1, function12, 0), composer, 54), composer, 3072, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(c21.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(779797406, i, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (SelfieScannerOverlayScreen.kt:84)");
            }
            if (a(bVar)) {
                composer.startReplaceGroup(-533520381);
                a(composer, 0);
            } else {
                composer.startReplaceGroup(-537325724);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(c21.b bVar, ColumnScope it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1420592201, i, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (SelfieScannerOverlayScreen.kt:89)");
            }
            Modifier modifierA = a80.a(Modifier.INSTANCE, 1.0f);
            fj0 fj0Var = fj0.f28535a;
            qz0.a(PaddingKt.m866paddingqDBjuR0$default(modifierA, fj0Var.c(composer, 6).f(), BitmapDescriptorFactory.HUE_RED, fj0Var.c(composer, 6).f(), Dp.m3297constructorimpl(32), 2, null), d81.c(bVar.getTitle(), composer, 0), d81.a(bVar.getTitle(), composer, 0), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(c21.b bVar, Function1 function1, Function1 function12, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502226592, i, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous>.<anonymous> (SelfieScannerOverlayScreen.kt:102)");
            }
            c21.b bVar2 = bVar != null ? bVar : null;
            if (bVar2 == null) {
                composer.startReplaceGroup(-1833556334);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1833556333);
                if (bVar2 instanceof c21.b.c) {
                    composer.startReplaceGroup(-1240742577);
                    qy0.a((Modifier) null, (c21.b.c) bVar2, function1, function12, composer, 0, 1);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1240327673);
                    le1 mask = bVar2.getMask();
                    if (mask == null) {
                        composer.startReplaceGroup(-1240327674);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1240327673);
                        ke1.a(SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), mask, function1, composer, 6, 0);
                        composer.endReplaceGroup();
                        Unit unit = Unit.f186387a;
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final c21.b bVar, Function0 function0, Function1 function1, Function1 function12, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1263034557, i, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.ScannerScreen.<anonymous>.<anonymous> (SelfieScannerOverlayScreen.kt:82)");
            }
            final int i2 = 0;
            final int i3 = 1;
            me1.a(null, 0L, null, bVar.b(), ComposableLambdaKt.rememberComposableLambda(779797406, true, new Function2() { // from class: com.fourthline.orca.internal.rm1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = i2;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i5) {
                        case 0:
                            return h21.a(bVar, composer2, iIntValue);
                        default:
                            return h21.b(bVar, composer2, iIntValue);
                    }
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-1420592201, true, new ak1(bVar, 2), composer, 54), ComposableLambdaKt.rememberComposableLambda(502226592, true, new uj1(bVar, 1, function1, function12), composer, 54), ComposableLambdaKt.rememberComposableLambda(363441185, true, new Function2() { // from class: com.fourthline.orca.internal.rm1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = i3;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i5) {
                        case 0:
                            return h21.a(bVar, composer2, iIntValue);
                        default:
                            return h21.b(bVar, composer2, iIntValue);
                    }
                }
            }, composer, 54), function0, new Pair(Float.valueOf(2.0f), Float.valueOf(1.0f)), composer, 14376960, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private static final void a(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1949897286);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949897286, i, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.overlay.GradientOverlay (SelfieScannerOverlayScreen.kt:157)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jm1(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(DrawModifierKt.drawBehind(modifierFillMaxSize$default, (Function1) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm1(i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Color.Companion companion = Color.INSTANCE;
        long jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(companion.m1987getBlack0d7_KjU(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        long jM1993getTransparent0d7_KjU = companion.m1993getTransparent0d7_KjU();
        Brush.Companion companion2 = Brush.INSTANCE;
        DrawScope.m2206drawRectAsUm42w$default(drawBehind, Brush.Companion.m1960verticalGradient8A3gB4$default(companion2, zhm.v.k(Color.m1972boximpl(jM1976copywmQWz5c$default), Color.m1972boximpl(jM1993getTransparent0d7_KjU)), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.3f, 0, 10, null), 0L, Size.m1864copyxjbvk4A$default(drawBehind.mo2212getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.3f, 1, null), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
        DrawScope.m2206drawRectAsUm42w$default(drawBehind, Brush.Companion.m1960verticalGradient8A3gB4$default(companion2, zhm.v.k(Color.m1972boximpl(jM1993getTransparent0d7_KjU), Color.m1972boximpl(jM1976copywmQWz5c$default)), Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.7f, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)), 0, 8, null), Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.7f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32)), Size.m1864copyxjbvk4A$default(drawBehind.mo2212getSizeNHjbRc(), BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawBehind.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.3f, 1, null), BitmapDescriptorFactory.HUE_RED, null, null, 0, SyslogConstants.LOG_CLOCK, null);
        return Unit.f186387a;
    }

    private static final boolean a(c21.b bVar) {
        return (bVar instanceof c21.b.C0176b) || (bVar instanceof c21.b.a) || (bVar instanceof d21);
    }
}
