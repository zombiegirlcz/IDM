package com.fourthline.orca.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.fourthline.orca.internal.b;
import com.fourthline.orca.internal.fj0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a30 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f26689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26690c;
        final /* synthetic */ MutableState d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState mutableState, String str, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.f26689b = mutableState;
            this.f26690c = str;
            this.d = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f26689b, this.f26690c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f26688a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f26689b.setValue(this.f26690c);
            if (!Intrinsics.f(this.f26690c, ((TextFieldValue) this.d.getValue()).getText())) {
                MutableState mutableState = this.d;
                String str = this.f26690c;
                mutableState.setValue(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusRequester focusRequester, Continuation continuation) {
            super(2, continuation);
            this.f26692b = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f26692b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f26691a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            FocusRequester.m1781requestFocus3ESFkO8$default(this.f26692b, 0, 1, null);
            return Unit.f186387a;
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f26694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.f26694b = context;
            this.f26695c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new c(this.f26694b, this.f26695c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f26693a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f26693a = 1;
                if (skm.k0.b(100L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            vc.a(this.f26694b, this.f26695c, false, 2, null);
            String str = this.f26695c;
            if (str != null && !kotlin.text.d0.W(str)) {
                Object systemService = this.f26694b.getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    Context context = this.f26694b;
                    String str2 = this.f26695c;
                    accessibilityEventObtain.setEventType(16384);
                    accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
                    accessibilityEventObtain.setPackageName(context.getPackageName());
                    accessibilityEventObtain.getText().add(str2);
                    accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                }
            }
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l20.values().length];
            try {
                iArr[l20.f30508b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l20.f30509c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l20.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, boolean z, Function2 function2, Function2 function22, Function2 function23, boolean z3, boolean z4, String str5, z10 z10Var, Function1 function1, Function1 function12, boolean z6, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, q20 q20Var, int i, String str6, String str7, Float f, int i2, int i3, int i5, int i6, Composer composer, int i21) {
        a(modifier, str, r20Var, l20Var, str2, str3, str4, z, function2, function22, function23, z3, z4, str5, z10Var, function1, function12, z6, keyboardOptions, keyboardActions, visualTransformation, q20Var, i, str6, str7, f, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, l20 l20Var, String str, z10 z10Var, String str2, b81 b81Var, String str3, int i, int i2, Composer composer, int i3) {
        a(modifier, l20Var, str, z10Var, str2, b81Var, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(boolean z) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(boolean z) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(boolean z) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, com.fourthline.orca.internal.b bVar, String str4, boolean z, Function1 function1, int i, String str5, z10 z10Var, Function1 function12, boolean z3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, q20 q20Var, VisualTransformation visualTransformation, String str6, String str7, Float f, int i2, int i3, int i5, int i6, Composer composer, int i21) {
        a(modifier, str, r20Var, l20Var, str2, str3, bVar, str4, z, function1, i, str5, z10Var, function12, z3, keyboardOptions, keyboardActions, q20Var, visualTransformation, str6, str7, f, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(long j2, long j3, Function2 function2, int i, Composer composer, int i2) {
        a(j2, j3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(497397510, i, -1, "com.fourthline.orca.core.internal.composable.SpinnerInputView.<anonymous> (InputViews.kt:511)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, Function2 function2, Function1 function1, String str5, z10 z10Var, Function1 function12, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, String str6, String str7, int i, int i2, int i3, Composer composer, int i5) {
        a(modifier, str, r20Var, l20Var, str2, str3, str4, function2, function1, str5, z10Var, function12, keyboardOptions, keyboardActions, str6, str7, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, Function1 function1, String str5, z10 z10Var, z10 z10Var2, Function1 function12, Function2 function2, boolean z, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, String str6, String str7, int i, int i2, int i3, Composer composer, int i5) {
        a(modifier, str, r20Var, l20Var, str2, str3, str4, function1, str5, z10Var, z10Var2, function12, function2, z, keyboardOptions, keyboardActions, str6, str7, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, String str5, z10 z10Var, Function2 function2, z10 z10Var2, Function1 function1, Function1 function12, String str6, String str7, Float f, int i, int i2, int i3, Composer composer, int i5) {
        a(modifier, str, r20Var, l20Var, str2, str3, str4, str5, z10Var, function2, z10Var2, function1, function12, str6, str7, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r52, java.lang.String r53, final com.fourthline.orca.internal.r20 r54, final com.fourthline.orca.internal.l20 r55, final java.lang.String r56, final java.lang.String r57, final java.lang.String r58, boolean r59, kotlin.jvm.functions.Function2 r60, kotlin.jvm.functions.Function2 r61, kotlin.jvm.functions.Function2 r62, boolean r63, boolean r64, final java.lang.String r65, com.fourthline.orca.internal.z10 r66, final kotlin.jvm.functions.Function1 r67, final kotlin.jvm.functions.Function1 r68, boolean r69, androidx.compose.foundation.text.KeyboardOptions r70, androidx.compose.foundation.text.KeyboardActions r71, androidx.compose.ui.text.input.VisualTransformation r72, com.fourthline.orca.internal.q20 r73, int r74, java.lang.String r75, java.lang.String r76, java.lang.Float r77, androidx.compose.runtime.Composer r78, final int r79, final int r80, final int r81, final int r82) {
        /*
            Method dump skipped, instruction units count: 2085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a30.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.r20, com.fourthline.orca.internal.l20, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, java.lang.String, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.text.input.VisualTransformation, com.fourthline.orca.internal.q20, int, java.lang.String, java.lang.String, java.lang.Float, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final String str, float f, final b81 b81Var, String str2, float f4, Function2 function2, MutableState mutableState, MutableState mutableState2, l20 l20Var, float f5, float f6, Function2 function22, Float f32, String str3, String str4, r20 r20Var, boolean z, final MutableState mutableState3, FocusRequester focusRequester, Function1 function1, final q20 q20Var, final int i, final Function1 function12, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final MutableState mutableState4, final boolean z4, final boolean z6, final String str5, Function2 function23, Composer composer, int i2) {
        long jM1993getTransparent0d7_KjU;
        Function2 function24;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1325294734, i2, -1, "com.fourthline.orca.core.internal.composable.BaseInputView.<anonymous>.<anonymous> (InputViews.kt:167)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m866paddingqDBjuR0$default(a80.a(a80.a((Modifier) companion, false), "inputLabel", str), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, 5, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            int iM3228getStarte0LSkKk = TextAlign.INSTANCE.m3228getStarte0LSkKk();
            a81 label = b81Var.getLabel();
            fj0.a aVar = fj0.a.f28536a;
            TextKt.m1280Text4IGK_g(str2, modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(iM3228getStarte0LSkKk), 0L, 0, false, 0, 0, null, label.a(TextUnit.m3364boximpl(aVar.a()), composer, 6, 0), composer, 0, 0, 65020);
            Modifier modifierM876heightInVpY3zN4$default = SizeKt.m876heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null), f4, BitmapDescriptorFactory.HUE_RED, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            int i3 = 0;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM876heightInVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            long jA = b81Var.getBorder().getColor().a(composer, 0);
            l20 l20Var2 = l20.f30508b;
            if (l20Var == l20Var2) {
                composer.startReplaceGroup(1670925433);
                jM1993getTransparent0d7_KjU = b81Var.getShadow().a(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1670925983);
                composer.endReplaceGroup();
                jM1993getTransparent0d7_KjU = Color.INSTANCE.m1993getTransparent0d7_KjU();
            }
            Modifier modifierA = a80.a(modifierFillMaxWidth$default2, jA, jM1993getTransparent0d7_KjU, b81Var.getBackground().a(composer, 0), f5, f6, Dp.m3297constructorimpl(l20Var == l20Var2 ? 10 : 0), BitmapDescriptorFactory.HUE_RED, 64, (Object) null);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new jn1(mutableState2, mutableState, 4);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierA, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composer, 0);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (function22 != null) {
                composer.startReplaceGroup(-431566552);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM1662constructorimpl4 = Updater.m1662constructorimpl(composer);
                Updater.m1665setimpl(composerM1662constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m1665setimpl(composerM1662constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (composerM1662constructorimpl4.getInserting() || !Intrinsics.f(composerM1662constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    composerM1662constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                    composerM1662constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                }
                Updater.m1665setimpl(composerM1662constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                function24 = function22;
                function24.invoke(composer, 0);
                composer.endNode();
            } else {
                function24 = function22;
                composer.startReplaceGroup(-441061852);
            }
            composer.endReplaceGroup();
            Modifier modifierM855offsetVpY3zN4$default = OffsetKt.m855offsetVpY3zN4$default(companion, Dp.m3297constructorimpl(function24 != null ? -8 : 0), BitmapDescriptorFactory.HUE_RED, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM855offsetVpY3zN4$default);
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM1662constructorimpl5 = Updater.m1662constructorimpl(composer);
            Updater.m1665setimpl(composerM1662constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl5.getInserting() || !Intrinsics.f(composerM1662constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                composerM1662constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                composerM1662constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
            }
            Updater.m1665setimpl(composerM1662constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            TextStyle textStyleA = b81Var.getValue().a(false, TextUnit.m3364boximpl(aVar.a()), composer, 48, 1);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(FocusRequesterModifierKt.focusRequester(a80.a(a80.a(a80.a(companion, f32, str3, str4, r20Var), z, mutableState3), "inputText", str), focusRequester), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new li1(i3, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFillMaxHeight$default, (Function1) objRememberedValue2);
            boolean z11 = l20Var != l20.d;
            TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getValue();
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            long jM2972getColor0d7_KjU = textStyleA.m2972getColor0d7_KjU();
            Color.Companion companion5 = Color.INSTANCE;
            TextFieldColors textFieldColorsM1267textFieldColorsdx8h9Zs = textFieldDefaults.m1267textFieldColorsdx8h9Zs(0L, 0L, companion5.m1993getTransparent0d7_KjU(), jM2972getColor0d7_KjU, 0L, companion5.m1993getTransparent0d7_KjU(), companion5.m1993getTransparent0d7_KjU(), companion5.m1993getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, b81Var.getIcon().a(composer, 0), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 14352768, 0, 48, 2092819);
            boolean zChanged2 = composer.changed(q20Var.ordinal()) | composer.changed(i) | composer.changed(function12);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.fourthline.orca.internal.mi1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return a30.a(q20Var, i, mutableState3, mutableState4, function12, (TextFieldValue) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            TextFieldKt.TextField(textFieldValue, (Function1) objRememberedValue3, modifierOnFocusChanged, z11, z3, textStyleA, null, ComposableLambdaKt.rememberComposableLambda(710532543, true, new Function2() { // from class: com.fourthline.orca.internal.ni1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return a30.a(z4, str, z6, b81Var, str5, (Composer) obj2, iIntValue);
                }
            }, composer, 54), null, ComposableLambdaKt.rememberComposableLambda(878293629, true, new oi1(0, function23), composer, 54), false, visualTransformation, keyboardOptions, keyboardActions, true, 1, 0, null, null, textFieldColorsM1267textFieldColorsdx8h9Zs, composer, 817889280, 221184, 460096);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (function2 != null) {
                composer.startReplaceGroup(-1771526593);
                a(((Offset) mutableState.getValue()).getPackedValue(), ((IntSize) mutableState2.getValue()).getPackedValue(), function2, composer, 0);
            } else {
                composer.startReplaceGroup(-1786346732);
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
    public static final Unit a(MutableState mutableState, MutableState mutableState2, LayoutCoordinates coordinates) {
        LayoutCoordinates parentCoordinates;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        mutableState.setValue(IntSize.m3350boximpl(coordinates.mo2533getSizeYbymL2g()));
        long jPositionInParent = LayoutCoordinatesKt.positionInParent(coordinates);
        LayoutCoordinates parentCoordinates2 = coordinates.getParentCoordinates();
        mutableState2.setValue(Offset.m1826boximpl(Offset.m1839plusMKHz9U((parentCoordinates2 == null || (parentCoordinates = parentCoordinates2.getParentCoordinates()) == null) ? Offset.INSTANCE.m1845getZeroF1C5BW0() : LayoutCoordinatesKt.positionInParent(parentCoordinates), jPositionInParent)));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, FocusState it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(Boolean.valueOf(it8.isFocused()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z, String str, boolean z3, b81 b81Var, String str2, Composer composer, int i) {
        TextStyle textStyleA;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710532543, i, -1, "com.fourthline.orca.core.internal.composable.BaseInputView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InputViews.kt:253)");
            }
            Modifier modifierA = a80.a(SizeKt.fillMaxHeight$default(a80.a(Modifier.INSTANCE, z), BitmapDescriptorFactory.HUE_RED, 1, null), "inputPlaceholder", str);
            if (z3) {
                composer.startReplaceGroup(1877104256);
                mz typographyMonospace = b81Var.getValue().getTypographyMonospace();
                Pair pairA = typographyMonospace.a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0);
                textStyleA = new TextStyle(b81Var.getPlaceholder().getColor().a(composer, 0), ((TextUnit) pairA.f186385a).getPackedValue(), null, null, null, typographyMonospace.getFamily(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777180, null);
                composer.endReplaceGroup();
            } else if (!z3) {
                composer.startReplaceGroup(-77975176);
                textStyleA = b81Var.getPlaceholder().a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-78007901);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            TextKt.m1280Text4IGK_g(str2, modifierA, 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3226getLefte0LSkKk()), 0L, 0, false, 1, 0, null, textStyleA, composer, 0, 3072, 56828);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function2 function2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(878293629, i, -1, "com.fourthline.orca.core.internal.composable.BaseInputView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InputViews.kt:278)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(q20 q20Var, int i, MutableState mutableState, MutableState mutableState2, Function1 function1, TextFieldValue it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (q20Var.a(it8.getText()) && it8.getText().length() <= i) {
            mutableState.setValue(it8);
            if (!Intrinsics.f(it8.getText(), mutableState2.getValue())) {
                mutableState2.setValue(it8.getText());
                function1.invoke(it8.getText());
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r53, java.lang.String r54, final com.fourthline.orca.internal.r20 r55, final com.fourthline.orca.internal.l20 r56, final java.lang.String r57, final java.lang.String r58, com.fourthline.orca.internal.b r59, final java.lang.String r60, boolean r61, kotlin.jvm.functions.Function1 r62, int r63, java.lang.String r64, com.fourthline.orca.internal.z10 r65, kotlin.jvm.functions.Function1 r66, boolean r67, androidx.compose.foundation.text.KeyboardOptions r68, androidx.compose.foundation.text.KeyboardActions r69, com.fourthline.orca.internal.q20 r70, androidx.compose.ui.text.input.VisualTransformation r71, java.lang.String r72, java.lang.String r73, java.lang.Float r74, androidx.compose.runtime.Composer r75, final int r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a30.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.r20, com.fourthline.orca.internal.l20, java.lang.String, java.lang.String, com.fourthline.orca.internal.b, java.lang.String, boolean, kotlin.jvm.functions.Function1, int, java.lang.String, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, com.fourthline.orca.internal.q20, androidx.compose.ui.text.input.VisualTransformation, java.lang.String, java.lang.String, java.lang.Float, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(com.fourthline.orca.internal.b bVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1650958714, i, -1, "com.fourthline.orca.core.internal.composable.InputView.<anonymous> (InputViews.kt:360)");
            }
            if (bVar instanceof b.a) {
                composer.startReplaceGroup(2040653012);
                ImageKt.Image(a20.a(((b.a) bVar).a(), composer, 0), null, SizeKt.m882size3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(24)), null, null, BitmapDescriptorFactory.HUE_RED, null, composer, 432, SyslogConstants.LOG_CLOCK);
                composer.endReplaceGroup();
            } else if (bVar instanceof b.C0166b) {
                composer.startReplaceGroup(2040951201);
                g81.a(SizeKt.m882size3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(24)), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, ((b.C0166b) bVar).a(), null, null, null, composer, 12582918, 0, 15230);
                composer.endReplaceGroup();
            } else {
                if (bVar != null) {
                    composer.startReplaceGroup(1728393059);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(2041215910);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f A[PHI: r39
      0x013f: PHI (r39v18 int) = (r39v4 int), (r39v10 int), (r39v11 int) binds: [B:80:0x013d, B:91:0x015c, B:90:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r42, java.lang.String r43, final com.fourthline.orca.internal.r20 r44, final com.fourthline.orca.internal.l20 r45, final java.lang.String r46, final java.lang.String r47, final java.lang.String r48, kotlin.jvm.functions.Function1 r49, java.lang.String r50, com.fourthline.orca.internal.z10 r51, final com.fourthline.orca.internal.z10 r52, kotlin.jvm.functions.Function1 r53, kotlin.jvm.functions.Function2 r54, boolean r55, androidx.compose.foundation.text.KeyboardOptions r56, androidx.compose.foundation.text.KeyboardActions r57, java.lang.String r58, java.lang.String r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a30.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.r20, com.fourthline.orca.internal.l20, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, com.fourthline.orca.internal.z10, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199149430, i, -1, "com.fourthline.orca.core.internal.composable.SearchInputView.<anonymous> (InputViews.kt:424)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r42, java.lang.String r43, com.fourthline.orca.internal.r20 r44, com.fourthline.orca.internal.l20 r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function1 r50, java.lang.String r51, com.fourthline.orca.internal.z10 r52, kotlin.jvm.functions.Function1 r53, androidx.compose.foundation.text.KeyboardOptions r54, androidx.compose.foundation.text.KeyboardActions r55, java.lang.String r56, java.lang.String r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a30.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.r20, com.fourthline.orca.internal.l20, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, java.lang.String, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r37, java.lang.String r38, com.fourthline.orca.internal.r20 r39, com.fourthline.orca.internal.l20 r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, com.fourthline.orca.internal.z10 r45, kotlin.jvm.functions.Function2 r46, com.fourthline.orca.internal.z10 r47, kotlin.jvm.functions.Function1 r48, kotlin.jvm.functions.Function1 r49, java.lang.String r50, java.lang.String r51, java.lang.Float r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.a30.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.r20, com.fourthline.orca.internal.l20, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function2, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, java.lang.Float, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void a(Modifier modifier, final l20 state, final String status, z10 z10Var, final String testTagPrefix, final b81 styling, final String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final z10 z10Var2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(testTagPrefix, "testTagPrefix");
        Intrinsics.checkNotNullParameter(styling, "styling");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2034885130);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(status) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(testTagPrefix) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(styling) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            final z10 z10Var3 = i6 != 0 ? null : z10Var;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2034885130, i3, -1, "com.fourthline.orca.core.internal.composable.InputStatusView (InputViews.kt:537)");
            }
            final float fM3297constructorimpl = Dp.m3297constructorimpl(4);
            Modifier modifierA = a80.a(modifier3, false);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            pq0.a(false, ComposableLambdaKt.rememberComposableLambda(-1621282796, true, new Function2() { // from class: com.fourthline.orca.internal.gi1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return a30.a(rowScopeInstance, styling, z10Var3, testTagPrefix, fM3297constructorimpl, status, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            composerStartRestartGroup.endNode();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | ((3670016 & i3) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c(context, str, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(str, state, (Function2) objRememberedValue, composerStartRestartGroup, ((i3 >> 18) & 14) | (i3 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z10Var2 = z10Var3;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z10Var2 = z10Var;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.orca.internal.ii1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return a30.a(modifier4, state, status, z10Var2, testTagPrefix, styling, str, i, i2, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(RowScope rowScope, b81 b81Var, z10 z10Var, String str, float f, String str2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621282796, i, -1, "com.fourthline.orca.core.internal.composable.InputStatusView.<anonymous>.<anonymous> (InputViews.kt:545)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.Spacer(RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null), composer, 0);
            TextStyle textStyleA = b81Var.getStatus().a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0);
            if (z10Var != null) {
                composer.startReplaceGroup(1566653143);
                IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, PaddingKt.m866paddingqDBjuR0$default(SizeKt.m884sizeVpY3zN4(companion, Dp.m3297constructorimpl(TextUnit.m3370getValueimpl(textStyleA.m2973getFontSizeXSAIIZE())), Dp.m3297constructorimpl(TextUnit.m3370getValueimpl(textStyleA.m2973getFontSizeXSAIIZE()))), BitmapDescriptorFactory.HUE_RED, Dp.m3297constructorimpl(0), Dp.m3297constructorimpl(4), BitmapDescriptorFactory.HUE_RED, 9, null), zi0.a(fj0.f28535a.a(composer, 6)).a(composer, 0), composer, 48, 0);
            } else {
                composer.startReplaceGroup(1543132110);
            }
            composer.endReplaceGroup();
            TextKt.m1280Text4IGK_g(str2, PaddingKt.m866paddingqDBjuR0$default(a80.a(companion, "inputViewStatus", str), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, 5, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composer, 0, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public static final void a(final long j2, final long j3, final Function2 content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-973343470);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-973343470, i2, -1, "com.fourthline.orca.core.internal.composable.InputViewPopup (InputViews.kt:598)");
            }
            composerStartRestartGroup.startReplaceGroup(-1550866569);
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            AndroidPopup_androidKt.m3417PopupK5zGePQ(Alignment.INSTANCE.getTopStart(), IntOffset.m3329constructorimpl((((long) ((int) (Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) + ((int) (j3 & BodyPartID.bodyIdMax))))) & BodyPartID.bodyIdMax) | (((long) ((int) Float.intBitsToFloat((int) (j2 >> 32)))) << 32)), null, null, ComposableLambdaKt.rememberComposableLambda(-216271279, true, new Function2() { // from class: com.fourthline.orca.internal.ji1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return a30.a(density, j3, content, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 12);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.fourthline.orca.internal.ki1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return a30.a(j2, j3, content, i, (Composer) obj2, iIntValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Density density, long j2, Function2 function2, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-216271279, i, -1, "com.fourthline.orca.core.internal.composable.InputViewPopup.<anonymous> (InputViews.kt:612)");
            }
            Modifier modifierM887width3ABfNKs = SizeKt.m887width3ABfNKs(PaddingKt.m864paddingVpY3zN4$default(Modifier.INSTANCE, fj0.f28535a.c(composer, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null), density.mo765toDpu2uoSUM((int) (j2 >> 32)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM887width3ABfNKs);
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
            function2.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public static final void a(FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(focusManager, "<this>");
        focusManager.clearFocus(true);
    }
}
