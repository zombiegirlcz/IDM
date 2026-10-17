package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import oim.n;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedContentKt$AnimatedContent$6$1 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ n $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function3 {
        final /* synthetic */ n $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
        final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SnapshotStateList<S> snapshotStateList, S s2, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, n nVar) {
            super(3);
            this.$currentlyVisible = snapshotStateList;
            this.$stateForContent = s2;
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$content = nVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
            invoke((AnimatedVisibilityScope) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.f186387a;
        }

        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(animatedVisibilityScope) : composer.changedInstance(animatedVisibilityScope) ? 4 : 2;
            }
            if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-143346359, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
            }
            boolean zChanged = composer.changed(this.$currentlyVisible) | composer.changedInstance(this.$stateForContent) | composer.changedInstance(this.$rootScope);
            SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
            S s2 = this.$stateForContent;
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.$rootScope;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AnimatedContentKt$AnimatedContent$6$1$5$1$1(snapshotStateList, s2, animatedContentTransitionScopeImpl);
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(animatedVisibilityScope, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, i & 14);
            MutableScatterMap targetSizeMap$animation = this.$rootScope.getTargetSizeMap$animation();
            S s3 = this.$stateForContent;
            Intrinsics.i(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            targetSizeMap$animation.set(s3, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation());
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                composer.updateRememberedValue(objRememberedValue2);
            }
            this.$content.invoke((AnimatedContentScopeImpl) objRememberedValue2, this.$stateForContent, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentKt$AnimatedContent$6$1(Transition<S> transition, S s2, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, n nVar) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s2;
        this.$transitionSpec = function1;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$currentlyVisible = snapshotStateList;
        this.$content = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-23915175, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
        }
        Function1<AnimatedContentTransitionScope<S>, ContentTransform> function1 = this.$transitionSpec;
        Object obj2 = this.$rootScope;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = (ContentTransform) function1.invoke(obj2);
            composer.updateRememberedValue(objRememberedValue);
        }
        ContentTransform contentTransform = (ContentTransform) objRememberedValue;
        boolean zChanged = composer.changed(Intrinsics.f(this.$this_AnimatedContent.getSegment().getTargetState(), this.$stateForContent));
        Transition<S> transition = this.$this_AnimatedContent;
        S s2 = this.$stateForContent;
        Function1<AnimatedContentTransitionScope<S>, ContentTransform> function12 = this.$transitionSpec;
        Object obj3 = this.$rootScope;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = Intrinsics.f(transition.getSegment().getTargetState(), s2) ? ExitTransition.INSTANCE.getNone() : ((ContentTransform) function12.invoke(obj3)).getInitialContentExit();
            composer.updateRememberedValue(objRememberedValue2);
        }
        ExitTransition exitTransition = (ExitTransition) objRememberedValue2;
        S s3 = this.$stateForContent;
        Transition<S> transition2 = this.$this_AnimatedContent;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.f(s3, transition2.getTargetState()));
            composer.updateRememberedValue(objRememberedValue3);
        }
        AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objRememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        boolean zChangedInstance = composer.changedInstance(contentTransform);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new AnimatedContentKt$AnimatedContent$6$1$1$1(contentTransform);
            composer.updateRememberedValue(objRememberedValue4);
        }
        Modifier modifierLayout = LayoutModifierKt.layout(companion2, (Function3) objRememberedValue4);
        childData.setTarget(Intrinsics.f(this.$stateForContent, this.$this_AnimatedContent.getTargetState()));
        Modifier modifierThen = modifierLayout.then(childData);
        Transition<S> transition3 = this.$this_AnimatedContent;
        boolean zChangedInstance2 = composer.changedInstance(this.$stateForContent);
        S s4 = this.$stateForContent;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new AnimatedContentKt$AnimatedContent$6$1$3$1(s4);
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function13 = (Function1) objRememberedValue5;
        boolean zChanged2 = composer.changed(exitTransition);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new AnimatedContentKt$AnimatedContent$6$1$4$1(exitTransition);
            composer.updateRememberedValue(objRememberedValue6);
        }
        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition3, function13, modifierThen, targetContentEnter, exitTransition, (Function2) objRememberedValue6, null, ComposableLambdaKt.rememberComposableLambda(-143346359, true, new AnonymousClass5(this.$currentlyVisible, this.$stateForContent, this.$rootScope, this.$content), composer, 54), composer, 12582912, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
