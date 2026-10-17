package androidx.compose.ui.window;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<Function2<Composer, Integer, Unit>> $currentContent$delegate;
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ State<Function2<Composer, Integer, Unit>> $currentContent$delegate;
        final /* synthetic */ PopupLayout $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PopupLayout popupLayout, State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
            super(2);
            this.$this_apply = popupLayout;
            this.$currentContent$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Composer) obj2, ((Number) obj3).intValue());
            return Unit.f186387a;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022273628, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:322)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.INSTANCE;
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
            boolean zChangedInstance = composer.changedInstance(this.$this_apply);
            PopupLayout popupLayout = this.$this_apply;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1(popupLayout);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, (Function1) objRememberedValue2), this.$this_apply.getCanCalculatePosition() ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            Function2 function2Popup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(this.$currentContent$delegate);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1

                    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass1 extends u implements Function1<Placeable.PlacementScope, Unit> {
                        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                        public AnonymousClass1() {
                            super(1);
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Placeable.PlacementScope) obj2);
                            return Unit.f186387a;
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass2 extends u implements Function1<Placeable.PlacementScope, Unit> {
                        final /* synthetic */ Placeable $p;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(Placeable placeable) {
                            super(1);
                            this.$p = placeable;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Placeable.PlacementScope) obj2);
                            return Unit.f186387a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$p, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class AnonymousClass3 extends u implements Function1<Placeable.PlacementScope, Unit> {
                        final /* synthetic */ List<Placeable> $placeables;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass3(List<? extends Placeable> list) {
                            super(1);
                            this.$placeables = list;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Placeable.PlacementScope) obj2);
                            return Unit.f186387a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                            int iJ = v.j(this.$placeables);
                            if (iJ < 0) {
                                return;
                            }
                            int i = 0;
                            while (true) {
                                Placeable.PlacementScope placementScope2 = placementScope;
                                Placeable.PlacementScope.placeRelative$default(placementScope2, this.$placeables.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                                if (i == iJ) {
                                    return;
                                }
                                i++;
                                placementScope = placementScope2;
                            }
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo520measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        if (size == 0) {
                            return MeasureScope.layout$default(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
                        }
                        if (size == 1) {
                            Placeable placeableMo2530measureBRTryo0 = list.get(0).mo2530measureBRTryo0(j2);
                            return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new AnonymousClass2(placeableMo2530measureBRTryo0), 4, null);
                        }
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        int iMax = 0;
                        int iMax2 = 0;
                        for (int i2 = 0; i2 < size2; i2++) {
                            Placeable placeableMo2530measureBRTryo02 = list.get(i2).mo2530measureBRTryo0(j2);
                            iMax = Math.max(iMax, placeableMo2530measureBRTryo02.getWidth());
                            iMax2 = Math.max(iMax2, placeableMo2530measureBRTryo02.getHeight());
                            arrayList.add(placeableMo2530measureBRTryo02);
                        }
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new AnonymousClass3(arrayList), 4, null);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, a10.b.x(companion3, composerM1662constructorimpl, Integer.valueOf(iHashCode), composerM1662constructorimpl));
            function2Popup$lambda$0.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        super(2);
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-297523940, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
        }
        CompositionLocalKt.CompositionLocalProvider(AndroidPopup_androidKt.getLocalIsInPopupLayout().provides(Boolean.TRUE), ComposableLambdaKt.rememberComposableLambda(1022273628, true, new AnonymousClass1(this.$this_apply, this.$currentContent$delegate), composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
