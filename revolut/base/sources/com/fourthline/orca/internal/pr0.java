package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.rr0;
import com.fourthline.orca.internal.tr0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class pr0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0.a aVar, Function1 function1, int i, Composer composer, int i2) {
        a(aVar, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(tr0.a aVar, Function1 function1, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1440514882, i, -1, "com.fourthline.orca.qes.internal.screens.agreements.QesAgreementsCheckboxContainer.<anonymous>.<anonymous> (QesAgreementsCheckboxContainer.kt:69)");
            }
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new eq1(16, function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            a(aVar, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tr0.a aVar, String str, boolean z, boolean z3, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        a(aVar, str, z, z3, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.fourthline.orca.internal.tr0.a r26, java.lang.String r27, final boolean r28, final boolean r29, final kotlin.jvm.functions.Function1 r30, final kotlin.jvm.functions.Function1 r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pr0.a(com.fourthline.orca.internal.tr0$a, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, boolean z) {
        function1.invoke(new rr0.a(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, boolean z) {
        function1.invoke(new rr0.h(z));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, tr0.a.InterfaceC0287a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new rr0.b(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, MutableState mutableState2, Function1 function1) {
        if (((Number) mutableState.getValue()).intValue() == 4) {
            mutableState.setValue(Integer.MAX_VALUE);
            mutableState2.setValue(c81.a.a(c81.f27404a, R.string.shared_button_show_less, 0, 2, null));
            function1.invoke(Boolean.TRUE);
        } else {
            mutableState.setValue(4);
            mutableState2.setValue(c81.a.a(c81.f27404a, R.string.shared_button_show_more, 0, 2, null));
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, RowScope TextButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-7393121, i, -1, "com.fourthline.orca.qes.internal.screens.agreements.QesAgreementsCheckboxContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QesAgreementsCheckboxContainer.kt:119)");
            }
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m3297constructorimpl(0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            TextKt.m1280Text4IGK_g(d81.c((c81) mutableState.getValue(), composer, 0), modifierM866paddingqDBjuR0$default, 0L, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m3263getEllipsisgIe3tQ8(), false, 1, 0, null, fj0.f28535a.b(composer, 6).getLinkButton().getDefault().getLink().a(null, composer, 0, 1), composer, 100663344, 3120, 54524);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private static final void a(tr0.a aVar, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1681312955);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1681312955, i2, -1, "com.fourthline.orca.qes.internal.screens.agreements.LegalDocuments (QesAgreementsCheckboxContainer.kt:139)");
            }
            List listB = aVar.b();
            int i3 = i2;
            AnnotatedString annotatedStringA = a(listB, composerStartRestartGroup, 0);
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(a80.a(Modifier.INSTANCE, "termsAndConditionMessage", (String) null, 2, (Object) null), null, false, 3, null), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(14), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            TextStyle textStyleA = fj0.f28535a.b(composerStartRestartGroup, 6).getLinkButton().getMessage().a(null, composerStartRestartGroup, 0, 1);
            boolean zChanged = composerStartRestartGroup.changed(annotatedStringA) | composerStartRestartGroup.changedInstance(listB) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new com.fourthline.core.location.internal.b(annotatedStringA, 4, listB, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ClickableTextKt.m978ClickableText4YKlhWE(annotatedStringA, modifierM866paddingqDBjuR0$default, textStyleA, false, 0, 0, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, SyslogConstants.LOG_CLOCK);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bl1(aVar, function1, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(AnnotatedString annotatedString, List list, Function1 function1, int i) {
        AnnotatedString.Range range = (AnnotatedString.Range) zhm.d0.d0(annotatedString.getStringAnnotations("URL", i, i));
        Object obj2 = null;
        String str = range != null ? (String) range.getItem() : null;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((tr0.a.InterfaceC0287a.C0288a) next).a(), str)) {
                obj2 = next;
                break;
            }
        }
        tr0.a.InterfaceC0287a.C0288a c0288a = (tr0.a.InterfaceC0287a.C0288a) obj2;
        if (c0288a != null) {
            function1.invoke(c0288a);
        }
        return Unit.f186387a;
    }

    private static final AnnotatedString a(List list, Composer composer, int i) {
        c81.c cVarA;
        String strC;
        List listC;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1467352332, i, -1, "com.fourthline.orca.qes.internal.screens.agreements.getTextForMultipleLegalDocuments (QesAgreementsCheckboxContainer.kt:160)");
        }
        composer.startReplaceGroup(-1376312293);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        boolean zA = lh0.f30621a.a();
        if (zA) {
            composer.startReplaceGroup(-420639970);
            strC = d81.c(c81.f27404a.a(R.string.step_qes_agree_checkbox_fourthline, ((tr0.a.InterfaceC0287a.C0288a) zhm.d0.b0(list)).a()), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-420456202);
            int size = list.size();
            if (size == 2) {
                cVarA = c81.f27404a.a(R.string.step_qes_agree_checkbox_namirial, ((tr0.a.InterfaceC0287a.C0288a) zhm.d0.b0(list)).a(), ((tr0.a.InterfaceC0287a.C0288a) list.get(1)).a());
            } else {
                if (size != 3) {
                    throw new IllegalStateException(("Unsupported combination. Legal Documents size: " + list.size()).toString());
                }
                cVarA = c81.f27404a.a(R.string.step_qes_agree_checkbox_infocert, ((tr0.a.InterfaceC0287a.C0288a) zhm.d0.b0(list)).a(), ((tr0.a.InterfaceC0287a.C0288a) list.get(1)).a(), ((tr0.a.InterfaceC0287a.C0288a) list.get(2)).a());
            }
            strC = d81.c(cVarA, composer, 0);
            composer.endReplaceGroup();
        }
        fj0 fj0Var = fj0.f28535a;
        TextStyle textStyleA = fj0Var.b(composer, 6).getLinkButton().getMessage().a(null, composer, 0, 1);
        long jA = fj0Var.b(composer, 6).getIb.b.Screen java.lang.String().getMessage().getColor().a(composer, 0);
        int iPushStyle = builder.pushStyle(new ParagraphStyle(0, 0, textStyleA.m2979getLineHeightXSAIIZE(), null, null, null, 0, 0, null, 507, null));
        try {
            int iPushStyle2 = builder.pushStyle(new SpanStyle(jA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                builder.append(strC);
                Unit unit = Unit.f186387a;
                if (zA) {
                    listC = zhm.u.c(((tr0.a.InterfaceC0287a.C0288a) zhm.d0.b0(list)).a());
                } else {
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((tr0.a.InterfaceC0287a.C0288a) it8.next()).a());
                    }
                    listC = arrayList;
                }
                composer.startReplaceGroup(-1376268182);
                int i2 = 0;
                for (Object obj2 : listC) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str = (String) obj2;
                        builder.addStyle(new SpanStyle(fj0.f28535a.b(composer, 6).getLinkButton().getDefault().getLink().getColor().a(composer, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, null, 61438, null), kotlin.text.d0.T(strC, str, 0, false, 6), kotlin.text.d0.T(strC, str, 0, false, 6) + str.length());
                        builder.addStringAnnotation("URL", str, kotlin.text.d0.T(strC, str, 0, false, 6), kotlin.text.d0.T(strC, str, 0, false, 6) + str.length());
                        i2 = i3;
                    } else {
                        zhm.v.s();
                        throw null;
                    }
                }
                composer.endReplaceGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return annotatedString;
            } finally {
                builder.pop(iPushStyle2);
            }
        } finally {
            builder.pop(iPushStyle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, String str, Function1 function1, MutableState mutableState2, Composer composer, int i) {
        MutableState mutableState3;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-433876308, i, -1, "com.fourthline.orca.qes.internal.screens.agreements.QesAgreementsCheckboxContainer.<anonymous>.<anonymous>.<anonymous> (QesAgreementsCheckboxContainer.kt:87)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1280Text4IGK_g(str, PaddingKt.m866paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(a80.a(companion, "legalClauseMessage", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(14), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3228getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m3263getEllipsisgIe3tQ8(), false, ((Number) mutableState.getValue()).intValue(), 0, null, fj0.f28535a.b(composer, 6).getLinkButton().getMessage().a(null, composer, 0, 1), composer, 0, 48, 54780);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(4)), composer, 6);
            int i2 = 0;
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            PaddingValues paddingValuesM857PaddingValues0680j_4 = PaddingKt.m857PaddingValues0680j_4(Dp.m3297constructorimpl(0));
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState3 = mutableState2;
                objRememberedValue = new ir1(mutableState, mutableState3, function1, i2);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState3 = mutableState2;
            }
            ButtonKt.TextButton(i81.a(0L, (Function0) objRememberedValue, composer, 0, 1), modifierWrapContentSize$default, false, null, null, null, null, null, paddingValuesM857PaddingValues0680j_4, ComposableLambdaKt.rememberComposableLambda(-7393121, true, new ak1(mutableState3, 7), composer, 54), composer, 905969712, Constants.TAG_FC_SPEED_MODE);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
