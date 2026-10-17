package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class e10 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, AnnotatedString annotatedString, int i, long j2, z10 z10Var, Function0 function0, int i2, int i3, Composer composer, int i5) {
        a(modifier, annotatedString, i, j2, z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(AnnotatedString annotatedString, int i, long j2, z10 z10Var, Function0 function0, int i2, int i3, Composer composer, int i5) {
        a(annotatedString, i, j2, z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, int i, long j2, z10 z10Var, int i2, int i3, Composer composer, int i5) {
        a(modifier, str, i, j2, z10Var, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, AnnotatedString annotatedString, int i, long j2, z10 z10Var, int i2, int i3, Composer composer, int i5) {
        a(modifier, annotatedString, i, j2, z10Var, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    public static final void a(Modifier modifier, String text, int i, long j2, z10 z10Var, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i5;
        int iM3226getLefte0LSkKk;
        long jA;
        z10 z10Var2;
        Modifier modifier3;
        int i6;
        long j3;
        long j5;
        int i21;
        Modifier modifier4;
        z10 z10Var3 = z10Var;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-770844760);
        int i22 = i3 & 1;
        if (i22 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                iM3226getLefte0LSkKk = i;
                int i32 = composerStartRestartGroup.changed(iM3226getLefte0LSkKk) ? 256 : 128;
                i5 |= i32;
            } else {
                iM3226getLefte0LSkKk = i;
            }
            i5 |= i32;
        } else {
            iM3226getLefte0LSkKk = i;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jA = j2;
                int i33 = composerStartRestartGroup.changed(jA) ? 2048 : 1024;
                i5 |= i33;
            } else {
                jA = j2;
            }
            i5 |= i33;
        } else {
            jA = j2;
        }
        int i43 = i3 & 16;
        if (i43 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(z10Var3) : composerStartRestartGroup.changedInstance(z10Var3) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i5 &= -7169;
                }
                j5 = jA;
                i21 = iM3226getLefte0LSkKk;
                modifier4 = modifier2;
            } else {
                Modifier modifier5 = i22 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                    iM3226getLefte0LSkKk = TextAlign.INSTANCE.m3226getLefte0LSkKk();
                }
                if ((i3 & 8) != 0) {
                    jA = fj0.f28535a.b(composerStartRestartGroup, 6).getHint().getDefault().getBorder().getColor().a(composerStartRestartGroup, 0);
                    i5 &= -7169;
                }
                if (i43 != 0) {
                    j5 = jA;
                    z10Var3 = null;
                } else {
                    j5 = jA;
                }
                i21 = iM3226getLefte0LSkKk;
                modifier4 = modifier5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-770844760, i5, -1, "com.fourthline.orca.core.internal.composable.HintText (HintText.kt:40)");
            }
            z10 z10Var4 = z10Var3;
            a(modifier4, new AnnotatedString(text, null, 2, null), i21, j5, z10Var4, (Function0) null, composerStartRestartGroup, i5 & 65422, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            i6 = i21;
            j3 = j5;
            z10Var2 = z10Var4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z10Var2 = z10Var3;
            modifier3 = modifier2;
            i6 = iM3226getLefte0LSkKk;
            j3 = jA;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el1(modifier3, text, i6, j3, z10Var2, i2, i3));
        }
    }

    public static final void a(Modifier modifier, AnnotatedString annotatedString, int i, long j2, z10 z10Var, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i5;
        int i6;
        long jA;
        Modifier modifier3;
        int i21;
        long j3;
        z10 z10Var2;
        int iM3226getLefte0LSkKk;
        z10 z10Var3;
        Modifier modifier4;
        int i22;
        z10 z10Var4 = z10Var;
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1989332370);
        int i32 = i3 & 1;
        if (i32 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                i6 = i;
                int i33 = composerStartRestartGroup.changed(i6) ? 256 : 128;
                i5 |= i33;
            } else {
                i6 = i;
            }
            i5 |= i33;
        } else {
            i6 = i;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jA = j2;
                int i43 = composerStartRestartGroup.changed(jA) ? 2048 : 1024;
                i5 |= i43;
            } else {
                jA = j2;
            }
            i5 |= i43;
        } else {
            jA = j2;
        }
        int i59 = i3 & 16;
        if (i59 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(z10Var4) : composerStartRestartGroup.changedInstance(z10Var4) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i5 &= -7169;
                }
                i22 = i5;
                z10Var3 = z10Var4;
                modifier4 = modifier2;
                iM3226getLefte0LSkKk = i6;
            } else {
                Modifier modifier5 = i32 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 4) != 0) {
                    iM3226getLefte0LSkKk = TextAlign.INSTANCE.m3226getLefte0LSkKk();
                    i5 &= -897;
                } else {
                    iM3226getLefte0LSkKk = i6;
                }
                if ((i3 & 8) != 0) {
                    jA = fj0.f28535a.b(composerStartRestartGroup, 6).getHint().getDefault().getBorder().getColor().a(composerStartRestartGroup, 0);
                    i5 &= -7169;
                }
                if (i59 != 0) {
                    z10Var4 = null;
                }
                int i66 = i5;
                z10Var3 = z10Var4;
                modifier4 = modifier5;
                i22 = i66;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1989332370, i22, -1, "com.fourthline.orca.core.internal.composable.HintText (HintText.kt:57)");
            }
            long j5 = jA;
            int i74 = iM3226getLefte0LSkKk;
            a(modifier4, annotatedString, i74, j5, z10Var3, (Function0) null, composerStartRestartGroup, 65534 & i22, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            z10Var2 = z10Var3;
            j3 = j5;
            i21 = i74;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            i21 = i6;
            j3 = jA;
            z10Var2 = z10Var4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el1(modifier3, annotatedString, i21, j3, z10Var2, i2, i3));
        }
    }

    public static final void a(AnnotatedString text, int i, long j2, z10 z10Var, Function0 onClick, Composer composer, int i2, int i3) {
        int i5;
        int i6;
        long jA;
        z10 z10Var2;
        int i21;
        z10 z10Var3 = z10Var;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(364668659);
        if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(j2)) ? 256 : 128;
        }
        int i22 = i3 & 8;
        if (i22 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(z10Var3) : composerStartRestartGroup.changedInstance(z10Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i3 & 2) != 0) {
                    i = TextAlign.INSTANCE.m3226getLefte0LSkKk();
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    jA = fj0.f28535a.b(composerStartRestartGroup, 6).getHint().getDefault().getBorder().getColor().a(composerStartRestartGroup, 0);
                    i5 &= -897;
                } else {
                    jA = j2;
                }
                if (i22 != 0) {
                    z10Var3 = null;
                }
                int i32 = i5;
                i6 = i;
                i21 = i32;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i5 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                int i33 = i5;
                i6 = i;
                i21 = i33;
                jA = j2;
            }
            z10Var2 = z10Var3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364668659, i21, -1, "com.fourthline.orca.core.internal.composable.ClickableHintText (HintText.kt:74)");
            }
            a((Modifier) null, text, i6, jA, z10Var2, onClick, composerStartRestartGroup, (i21 << 3) & 524272, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i6 = i;
            jA = j2;
            z10Var2 = z10Var3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el1(text, i6, jA, z10Var2, onClick, i2, i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(androidx.compose.ui.Modifier r37, final androidx.compose.ui.text.AnnotatedString r38, int r39, long r40, com.fourthline.orca.internal.z10 r42, kotlin.jvm.functions.Function0 r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.e10.a(androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, int, long, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
