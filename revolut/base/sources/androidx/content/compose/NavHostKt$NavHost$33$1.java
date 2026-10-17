package androidx.content.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.content.NavBackStackEntry;
import androidx.content.NavHostController;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class NavHostKt$NavHost$33$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ MutableObjectFloatMap<String> $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$33$1(Transition<NavBackStackEntry> transition, NavHostController navHostController, NavBackStackEntry navBackStackEntry, MutableObjectFloatMap<String> mutableObjectFloatMap, State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator, Continuation<? super NavHostKt$NavHost$33$1> continuation) {
        super(2, continuation);
        this.$transition = transition;
        this.$navController = navHostController;
        this.$backStackEntry = navBackStackEntry;
        this.$zIndices = mutableObjectFloatMap;
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new NavHostKt$NavHost$33$1(this.$transition, this.$navController, this.$backStackEntry, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r0 = r14.label
            if (r0 != 0) goto Laf
            yhm.o.b(r15)
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r15 = r14.$transition
            java.lang.Object r15 = r15.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r0 = r14.$transition
            java.lang.Object r0 = r0.getTargetState()
            boolean r15 = kotlin.jvm.internal.Intrinsics.f(r15, r0)
            if (r15 == 0) goto Lac
            androidx.navigation.NavHostController r15 = r14.$navController
            androidx.navigation.NavBackStackEntry r15 = r15.getCurrentBackStackEntry()
            if (r15 == 0) goto L31
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r15 = r14.$transition
            java.lang.Object r15 = r15.getTargetState()
            androidx.navigation.NavBackStackEntry r0 = r14.$backStackEntry
            boolean r15 = kotlin.jvm.internal.Intrinsics.f(r15, r0)
            if (r15 == 0) goto Lac
        L31:
            androidx.compose.runtime.State<java.util.List<androidx.navigation.NavBackStackEntry>> r15 = r14.$visibleEntries$delegate
            java.util.List r15 = androidx.content.compose.NavHostKt.access$NavHost$lambda$53(r15)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            androidx.navigation.compose.ComposeNavigator r0 = r14.$composeNavigator
            java.util.Iterator r15 = r15.iterator()
        L3f:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r15.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.content.NavBackStackEntry) r1
            r0.onTransitionComplete(r1)
            goto L3f
        L4f:
            androidx.collection.MutableObjectFloatMap<java.lang.String> r15 = r14.$zIndices
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r0 = r14.$transition
            long[] r1 = r15.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto Lac
            r3 = 0
            r4 = r3
        L5c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto La7
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L76:
            if (r9 >= r7) goto La5
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto La1
            int r10 = r4 << 3
            int r10 = r10 + r9
            java.lang.Object[] r11 = r15.keys
            r11 = r11[r10]
            float[] r12 = r15.values
            r12 = r12[r10]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.getTargetState()
            androidx.navigation.NavBackStackEntry r12 = (androidx.content.NavBackStackEntry) r12
            java.lang.String r12 = r12.getId()
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r12)
            if (r11 != 0) goto La1
            r15.removeValueAt(r10)
        La1:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L76
        La5:
            if (r7 != r8) goto Lac
        La7:
            if (r4 == r2) goto Lac
            int r4 = r4 + 1
            goto L5c
        Lac:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        Laf:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.compose.NavHostKt$NavHost$33$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NavHostKt$NavHost$33$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
