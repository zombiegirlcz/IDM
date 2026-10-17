package com.fourthline.orca.internal;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorMatrix;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.TextUnit;
import androidx.view.compose.BackHandlerKt;
import com.fourthline.orca.internal.fj0;
import com.fourthline.orca.internal.zp0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hi0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.f29269b = context;
            this.f29270c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f29269b, this.f29270c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29268a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            vc.a(this.f29269b, this.f29270c, true);
            return Unit.f186387a;
        }
    }

    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29271a;

        public b(Function0 function0) {
            this.f29271a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(Function0 function0, Offset offset) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f186387a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new in1(0, this.f29271a), continuation, 7, null);
            return objDetectTapGestures$default == fim.a.COROUTINE_SUSPENDED ? objDetectTapGestures$default : Unit.f186387a;
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[r10.values().length];
            try {
                iArr[r10.D0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r10.F0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r10.E0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r10.J0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animatable f29272a;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f29273a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f29274b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f29275c;
            final /* synthetic */ PointerInputScope d;
            final /* synthetic */ Animatable e;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.hi0$d$a$a, reason: collision with other inner class name */
            public static final class C0209a extends gim.h implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29276a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f29277b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f29278c;
                final /* synthetic */ Animatable d;
                final /* synthetic */ CoroutineScope e;

                /* JADX INFO: renamed from: com.fourthline.orca.internal.hi0$d$a$a$a, reason: collision with other inner class name */
                public static final class C0210a extends gim.i implements Function2 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f29279a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ float f29280b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Animatable f29281c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0210a(float f, Animatable animatable, Continuation continuation) {
                        super(2, continuation);
                        this.f29280b = f;
                        this.f29281c = animatable;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C0210a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                    }

                    @Override // gim.a
                    public final Continuation create(Object obj2, Continuation continuation) {
                        return new C0210a(this.f29280b, this.f29281c, continuation);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
                    
                        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, null, null, null, r13, 14, null) == r0) goto L21;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
                    
                        if (r1.snapTo(r3, r13) == r0) goto L21;
                     */
                    @Override // gim.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            r13 = this;
                            fim.a r0 = fim.a.COROUTINE_SUSPENDED
                            int r1 = r13.f29279a
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L1e
                            if (r1 == r3) goto L19
                            if (r1 != r2) goto L11
                            yhm.o.b(r14)
                            r10 = r13
                            goto L59
                        L11:
                            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r14.<init>(r0)
                            throw r14
                        L19:
                            yhm.o.b(r14)
                        L1c:
                            r10 = r13
                            goto L5b
                        L1e:
                            yhm.o.b(r14)
                            float r14 = r13.f29280b
                            r1 = 0
                            int r4 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                            if (r4 >= 0) goto L2b
                            kotlin.Unit r14 = kotlin.Unit.f186387a
                            goto L1c
                        L2b:
                            r4 = 1092616192(0x41200000, float:10.0)
                            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                            if (r4 >= 0) goto L48
                            androidx.compose.animation.core.Animatable r5 = r13.f29281c
                            java.lang.Float r6 = new java.lang.Float
                            r6.<init>(r1)
                            r13.f29279a = r3
                            r11 = 14
                            r12 = 0
                            r7 = 0
                            r8 = 0
                            r9 = 0
                            r10 = r13
                            java.lang.Object r14 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
                            if (r14 != r0) goto L5b
                            goto L58
                        L48:
                            r10 = r13
                            androidx.compose.animation.core.Animatable r1 = r10.f29281c
                            java.lang.Float r3 = new java.lang.Float
                            r3.<init>(r14)
                            r10.f29279a = r2
                            java.lang.Object r14 = r1.snapTo(r3, r13)
                            if (r14 != r0) goto L59
                        L58:
                            return r0
                        L59:
                            kotlin.Unit r14 = kotlin.Unit.f186387a
                        L5b:
                            kotlin.Unit r14 = kotlin.Unit.f186387a
                            return r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hi0.d.a.C0209a.C0210a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0209a(long j2, Animatable animatable, CoroutineScope coroutineScope, Continuation continuation) {
                    super(2, continuation);
                    this.f29278c = j2;
                    this.d = animatable;
                    this.e = coroutineScope;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((C0209a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    C0209a c0209a = new C0209a(this.f29278c, this.d, this.e, continuation);
                    c0209a.f29277b = obj2;
                    return c0209a;
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f29277b;
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    int i = this.f29276a;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return obj2;
                    }
                    yhm.o.b(obj2);
                    long j2 = this.f29278c;
                    jn1 jn1Var = new jn1(this.d, this.e, 0);
                    this.f29277b = null;
                    this.f29276a = 1;
                    Object objM705dragjO51t88 = DragGestureDetectorKt.m705dragjO51t88(awaitPointerEventScope, j2, jn1Var, this);
                    return objM705dragjO51t88 == aVar ? aVar : objM705dragjO51t88;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit a(Animatable animatable, CoroutineScope coroutineScope, PointerInputChange pointerInputChange) {
                    skm.e0.C(coroutineScope, null, null, new C0210a(((Number) animatable.getValue()).floatValue() + Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) & BodyPartID.bodyIdMax)), animatable, null), 3);
                    PointerEventKt.consumePositionChange(pointerInputChange);
                    return Unit.f186387a;
                }
            }

            public static final class b extends gim.i implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29282a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Animatable f29283b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Animatable animatable, Continuation continuation) {
                    super(2, continuation);
                    this.f29283b = animatable;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    return new b(this.f29283b, continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    int i = this.f29282a;
                    if (i == 0) {
                        yhm.o.b(obj2);
                        Animatable animatable = this.f29283b;
                        Float f = new Float(BitmapDescriptorFactory.HUE_RED);
                        this.f29282a = 1;
                        if (Animatable.animateTo$default(animatable, f, null, null, null, this, 14, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return Unit.f186387a;
                }
            }

            public static final class c extends gim.h implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29284a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f29285b;

                public c(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((c) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    c cVar = new c(continuation);
                    cVar.f29285b = obj2;
                    return cVar;
                }

                @Override // gim.a
                public final Object invokeSuspend(Object obj2) {
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f29285b;
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    int i = this.f29284a;
                    if (i == 0) {
                        yhm.o.b(obj2);
                        this.f29285b = null;
                        this.f29284a = 1;
                        obj2 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return PointerId.m2456boximpl(((PointerInputChange) obj2).getId());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PointerInputScope pointerInputScope, Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.d = pointerInputScope;
                this.e = animatable;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                a aVar = new a(this.d, this.e, continuation);
                aVar.f29275c = obj2;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r1 r8
              0x0027: PHI (r1v2 kotlinx.coroutines.CoroutineScope) = (r1v6 kotlinx.coroutines.CoroutineScope), (r1v1 kotlinx.coroutines.CoroutineScope) binds: [B:18:0x0057, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
              0x0027: PHI (r8v0 long) = (r8v1 long), (r8v4 long) binds: [B:18:0x0057, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r1 r3
              0x0045: PHI (r1v6 kotlinx.coroutines.CoroutineScope) = (r1v7 kotlinx.coroutines.CoroutineScope), (r1v1 kotlinx.coroutines.CoroutineScope) binds: [B:15:0x0042, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x0045: PHI (r3v1 java.lang.Object) = (r3v6 java.lang.Object), (r3v8 java.lang.Object) binds: [B:15:0x0042, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:24:0x0072). Please report as a decompilation issue!!! */
            @Override // gim.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    r16 = this;
                    r0 = r16
                    java.lang.Object r1 = r0.f29275c
                    kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                    fim.a r2 = fim.a.COROUTINE_SUSPENDED
                    int r3 = r0.f29274b
                    r4 = 0
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r3 == 0) goto L30
                    if (r3 == r7) goto L2a
                    if (r3 == r6) goto L22
                    if (r3 != r5) goto L1a
                    yhm.o.b(r17)
                    goto L72
                L1a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L22:
                    long r8 = r0.f29273a
                    yhm.o.b(r17)
                L27:
                    r14 = r1
                    r11 = r8
                    goto L5a
                L2a:
                    yhm.o.b(r17)
                    r3 = r17
                    goto L45
                L30:
                    yhm.o.b(r17)
                L33:
                    androidx.compose.ui.input.pointer.PointerInputScope r3 = r0.d
                    com.fourthline.orca.internal.hi0$d$a$c r8 = new com.fourthline.orca.internal.hi0$d$a$c
                    r8.<init>(r4)
                    r0.f29275c = r1
                    r0.f29274b = r7
                    java.lang.Object r3 = r3.awaitPointerEventScope(r8, r0)
                    if (r3 != r2) goto L45
                    goto L70
                L45:
                    androidx.compose.ui.input.pointer.PointerId r3 = (androidx.compose.ui.input.pointer.PointerId) r3
                    long r8 = r3.getValue()
                    androidx.compose.animation.core.Animatable r3 = r0.e
                    r0.f29275c = r1
                    r0.f29273a = r8
                    r0.f29274b = r6
                    java.lang.Object r3 = r3.stop(r0)
                    if (r3 != r2) goto L27
                    goto L70
                L5a:
                    androidx.compose.ui.input.pointer.PointerInputScope r1 = r0.d
                    com.fourthline.orca.internal.hi0$d$a$a r10 = new com.fourthline.orca.internal.hi0$d$a$a
                    androidx.compose.animation.core.Animatable r13 = r0.e
                    r15 = 0
                    r10.<init>(r11, r13, r14, r15)
                    r0.f29275c = r14
                    r0.f29273a = r11
                    r0.f29274b = r5
                    java.lang.Object r1 = r1.awaitPointerEventScope(r10, r0)
                    if (r1 != r2) goto L71
                L70:
                    return r2
                L71:
                    r1 = r14
                L72:
                    com.fourthline.orca.internal.hi0$d$a$b r3 = new com.fourthline.orca.internal.hi0$d$a$b
                    androidx.compose.animation.core.Animatable r8 = r0.e
                    r3.<init>(r8, r4)
                    skm.e0.C(r1, r4, r4, r3, r5)
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hi0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(Animatable animatable) {
            this.f29272a = animatable;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            Object objO = skm.e0.o(new a(pointerInputScope, this.f29272a, null), continuation);
            return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, int i, Composer composer, int i2) {
        a(zp0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(zp0 zp0Var, Function1 function1, Function1 function12, Function2 function2, int i, int i2, Composer composer, int i3) {
        b(zp0Var, function1, function12, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(zp0 zp0Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2055615987, i, -1, "com.fourthline.orca.core.internal.popup.PopupUpper.<anonymous> (OrcaPopup.kt:280)");
            }
            d(zp0Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public static final void d(zp0 zp0Var, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(zp0Var, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1275561984);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(zp0Var) : composerStartRestartGroup.changedInstance(zp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1275561984, i2, -1, "com.fourthline.orca.core.internal.popup.Title (OrcaPopup.kt:371)");
            }
            c81 title = zp0Var.getTitle();
            if (title == null) {
                composerStartRestartGroup.startReplaceGroup(-1603515568);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1603515567);
                Modifier.Companion companion = Modifier.INSTANCE;
                TextKt.m1420TextNvy7gAk(d81.c(title, composerStartRestartGroup, 0), a80.a(companion, "popupTitle", (String) null, 2, (Object) null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, fj0.f28535a.b(composerStartRestartGroup, 6).getDialog().getDefault().getHeader().a(null, composerStartRestartGroup, 0, 1), composerStartRestartGroup, 0, 0, 130044);
                composerStartRestartGroup = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(24)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new en1(zp0Var, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, Function1 function1, Function1 function12, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(zp0Var, function1, function12, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(zp0 zp0Var, int i, Composer composer, int i2) {
        d(zp0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(list, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void b(com.fourthline.orca.internal.zp0 r13, kotlin.jvm.functions.Function1 r14, kotlin.jvm.functions.Function1 r15, kotlin.jvm.functions.Function2 r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hi0.b(com.fourthline.orca.internal.zp0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        a(function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, Function2 function2, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        a(zp0Var, function2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p70 p70Var, int i, Composer composer, int i2) {
        a(p70Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        a(zp0Var, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, int i, Composer composer, int i2) {
        a(z10Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope columnScope, zp0 zp0Var, Function2 function2, Function2 function22, Function2 function23, int i, int i2, Composer composer, int i3) {
        a(columnScope, zp0Var, function2, function22, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(zp0 zp0Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088924400, i, -1, "com.fourthline.orca.core.internal.popup.PopupUpper.<anonymous> (OrcaPopup.kt:279)");
            }
            a(zp0Var, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.fourthline.orca.internal.zp0 r13, kotlin.jvm.functions.Function1 r14, kotlin.jvm.functions.Function1 r15, kotlin.jvm.functions.Function2 r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hi0.a(com.fourthline.orca.internal.zp0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final ColorFilter b(z10 z10Var, Composer composer, int i) {
        ColorFilter colorFilterA;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-226124436, i, -1, "com.fourthline.orca.core.internal.popup.popupIconColorFilter (OrcaPopup.kt:457)");
        }
        r10 key = z10Var.getKey();
        int i2 = key != null ? c.$EnumSwitchMapping$0[key.ordinal()] : -1;
        if (i2 == 1) {
            composer.startReplaceGroup(1737752432);
            colorFilterA = a(ColorKt.Color(4294599680L), fj0.f28535a.b(composer, 6).getGraphic().getWarning().getHighlight().a(composer, 0));
            composer.endReplaceGroup();
        } else if (i2 == 2 || i2 == 3) {
            composer.startReplaceGroup(1737758479);
            colorFilterA = a(ColorKt.Color(4292878368L), fj0.f28535a.b(composer, 6).getGraphic().getDanger().getHighlight().a(composer, 0));
            composer.endReplaceGroup();
        } else if (i2 != 4) {
            composer.startReplaceGroup(-1963763375);
            composer.endReplaceGroup();
            colorFilterA = null;
        } else {
            composer.startReplaceGroup(1737763600);
            colorFilterA = a(ColorKt.Color(4278247522L), fj0.f28535a.b(composer, 6).getGraphic().getSuccess().getHighlight().a(composer, 0));
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorFilterA;
    }

    public static final void a(List items, Function1 onItemClicked, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1261572486);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(items) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onItemClicked) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                function0 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1261572486, i3, -1, "com.fourthline.orca.core.internal.popup.OrcaMenuPopup (OrcaPopup.kt:128)");
            }
            a(function0, ComposableLambdaKt.rememberComposableLambda(1528206745, true, new cn1(items, onItemClicked, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Function0 function02 = function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(items, onItemClicked, function02, i, i2, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Throwable] */
    public static final Unit a(List list, final Function1 function1, Composer composer, int i) {
        Composer composer2 = composer;
        final int i2 = 0;
        ?? r142 = 1;
        if (composer2.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1528206745, i, -1, "com.fourthline.orca.core.internal.popup.OrcaMenuPopup.<anonymous> (OrcaPopup.kt:130)");
            }
            fj0 fj0Var = fj0.f28535a;
            int i3 = 6;
            float fC = fj0Var.c(composer2, 6).c();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM613backgroundbw27NRU$default = BackgroundKt.m613backgroundbw27NRU$default(ClipKt.clip(a(companion), RoundedCornerShapeKt.m970RoundedCornerShapea9UjIt4$default(fC, fC, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null)), fj0Var.b(composer2, 6).getDialog().getBackground().a(composer2, 0), null, 2, null);
            float f = fj0Var.c(composer2, 6).f();
            float f4 = BitmapDescriptorFactory.HUE_RED;
            String str = null;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m864paddingVpY3zN4$default(modifierM613backgroundbw27NRU$default, f, BitmapDescriptorFactory.HUE_RED, 2, null));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierNavigationBarsPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer2);
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f5 = 12;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(f5)), composer2, 6);
            composer2.startReplaceGroup(-801376601);
            for (Object obj2 : list) {
                int i5 = i2 + 1;
                if (i2 >= 0) {
                    Pair pair = (Pair) obj2;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m874height3ABfNKs(a80.a(Modifier.INSTANCE, "listItem" + i2, str, 2, str), th0.f33777a.a()), f4, r142, str);
                    boolean zChanged = composer2.changed(function1) | composer2.changed(i2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.fourthline.orca.internal.bn1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return hi0.a(function1, i2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ButtonKt.TextButton(i81.a(0L, (Function0) objRememberedValue, composer2, 0, 1), modifierFillMaxWidth$default, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(38056617, r142, new ak1(pair, 4), composer2, 54), composer, 805306368, 508);
                    composer2 = composer;
                    i3 = i3;
                    i2 = i5;
                    f5 = f5;
                    f4 = f4;
                    str = str;
                    r142 = 1;
                } else {
                    ?? r202 = str;
                    zhm.v.s();
                    throw r202;
                }
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(f5)), composer2, i3);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Pair pair, RowScope TextButton, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(TextButton) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38056617, i2, -1, "com.fourthline.orca.core.internal.popup.OrcaMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrcaPopup.kt:150)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM882size3ABfNKs = SizeKt.m882size3ABfNKs(companion, Dp.m3297constructorimpl(24));
            Painter painterA = a20.a((z10) pair.f186386b, composer, 0);
            fj0 fj0Var = fj0.f28535a;
            IconKt.m1371Iconww6aTOc(painterA, null, modifierM882size3ABfNKs, fj0Var.b(composer, 6).getDialog().getSelector().getOption().getIcon().a(composer, 0), composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m887width3ABfNKs(companion, Dp.m3297constructorimpl(32)), composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(TextButton, companion, 1.0f, false, 2, null);
            TextKt.m1420TextNvy7gAk(d81.c((c81) pair.f186385a, composer, 0), modifierWeight$default, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3226getLefte0LSkKk()), 0L, TextOverflow.INSTANCE.m3263getEllipsisgIe3tQ8(), false, 1, 0, null, fj0Var.b(composer, 6).getDialog().getSelector().getOption().getText().a(null, composer, 0, 1), composer, 0, 24960, 109564);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public static final void a(Function0 function0, Function2 body, Composer composer, int i, int i2) {
        Function0 function02;
        int i3;
        Function0 function03;
        Intrinsics.checkNotNullParameter(body, "body");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1515857937);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = i | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(body) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Function0 function04 = i5 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1515857937, i3, -1, "com.fourthline.orca.core.internal.popup.OrcaPopup (OrcaPopup.kt:179)");
            }
            if (function04 == null) {
                composerStartRestartGroup.startReplaceGroup(-1637531888);
                qf.a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1637490968);
                boolean z = (i3 & 14) == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new xj1(4, function04);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new jm1(6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM613backgroundbw27NRU$default = BackgroundKt.m613backgroundbw27NRU$default(a80.a(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue3, 1, null), "popup", (String) null, 2, (Object) null), Color.m1976copywmQWz5c$default(Color.INSTANCE.m1987getBlack0d7_KjU(), 0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new an1(mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM613backgroundbw27NRU$default, (Function1) objRememberedValue4), BitmapDescriptorFactory.HUE_RED, 1, null);
            Unit unit = Unit.f186387a;
            boolean z3 = (i3 & 14) == 4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new b(function04);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, unit, (PointerInputEventHandler) objRememberedValue5);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPointerInput);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 50, null, 4, null);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new jm1(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, zBooleanValue, null, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue6), ExitTransition.INSTANCE.getNone(), null, ComposableLambdaKt.rememberComposableLambda(-119485855, true, new ak1(body, 3), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942, 18);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function03 = function04;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cj1(i, function03, body, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, " ");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, LayoutCoordinates it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        mutableState.setValue(Boolean.TRUE);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function2 function2, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-119485855, i, -1, "com.fourthline.orca.core.internal.popup.OrcaPopup.<anonymous>.<anonymous> (OrcaPopup.kt:214)");
        }
        function2.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, Function2 function2, Function1 function1, Function1 function12, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(321884093, i, -1, "com.fourthline.orca.core.internal.popup.OrcaPopup.<anonymous> (OrcaPopup.kt:228)");
            }
            a(zp0Var, function2, function1, function12, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    private static final void a(final zp0 zp0Var, Function2 function2, Function1 function1, Function1 function12, Composer composer, int i, int i2) {
        int i3;
        Function1 function13;
        Function1 function14;
        Function2 function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1129703197);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(zp0Var) : composerStartRestartGroup.changedInstance(zp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function13 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
        } else {
            function13 = function1;
        }
        if ((i & 3072) == 0) {
            function14 = function12;
            i3 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
        } else {
            function14 = function12;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            final Function2 function23 = i5 != 0 ? null : function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1129703197, i3, -1, "com.fourthline.orca.core.internal.popup.OrcaPopupContent (OrcaPopup.kt:248)");
            }
            final float fC = fj0.f28535a.c(composerStartRestartGroup, 6).c();
            final Function1 function15 = function13;
            final Function1 function16 = function14;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), Alignment.INSTANCE.getBottomCenter(), false, ComposableLambdaKt.rememberComposableLambda(532090227, true, new Function3() { // from class: com.fourthline.orca.internal.hn1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return hi0.a(fC, zp0Var, function23, function15, function16, (BoxWithConstraintsScope) obj2, (Composer) obj3, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function23;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function22 = function2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zm1(zp0Var, function22, function1, function12, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, zp0 zp0Var, Function2 function2, Function1 function1, Function1 function12, BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(532090227, i2, -1, "com.fourthline.orca.core.internal.popup.OrcaPopupContent.<anonymous> (OrcaPopup.kt:254)");
            }
            float fM3297constructorimpl = Dp.m3297constructorimpl(BoxWithConstraints.mo846getMaxHeightD9Ej5fM() * 0.8f);
            Modifier modifierClip = ClipKt.clip(a80.a(Modifier.INSTANCE), RoundedCornerShapeKt.m970RoundedCornerShapea9UjIt4$default(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null));
            fj0 fj0Var = fj0.f28535a;
            Modifier modifierM876heightInVpY3zN4$default = SizeKt.m876heightInVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m864paddingVpY3zN4$default(BackgroundKt.m613backgroundbw27NRU$default(modifierClip, fj0Var.b(composer, 6).getDialog().getBackground().a(composer, 0), null, 2, null), fj0Var.c(composer, 6).f(), BitmapDescriptorFactory.HUE_RED, 2, null)), BitmapDescriptorFactory.HUE_RED, fM3297constructorimpl, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM876heightInVpY3zN4$default);
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            a(ColumnScopeInstance.INSTANCE, zp0Var, (Function2) null, (Function2) null, function2, composer, 6, 6);
            a(zp0Var, function1, function12, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.foundation.layout.ColumnScope r17, com.fourthline.orca.internal.zp0 r18, kotlin.jvm.functions.Function2 r19, kotlin.jvm.functions.Function2 r20, kotlin.jvm.functions.Function2 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hi0.a(androidx.compose.foundation.layout.ColumnScope, com.fourthline.orca.internal.zp0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zp0 zp0Var, Function2 function2, Function2 function22, Function2 function23, ColumnScope OrcaScrollableColumn, Composer composer, int i) {
        TextStyle textStyleA;
        float fM3297constructorimpl;
        String str;
        float fM3297constructorimpl2;
        float fM3297constructorimpl3;
        boolean z;
        int i2;
        float f;
        Intrinsics.checkNotNullParameter(OrcaScrollableColumn, "$this$OrcaScrollableColumn");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502819551, i, -1, "com.fourthline.orca.core.internal.popup.PopupUpper.<anonymous> (OrcaPopup.kt:290)");
            }
            if (zp0Var instanceof zp0.e) {
                composer.startReplaceGroup(638740966);
                textStyleA = fj0.f28535a.b(composer, 6).getDialog().getDefault().getTitle().a(null, composer, 0, 1);
                float f4 = 16;
                fM3297constructorimpl = Dp.m3297constructorimpl(f4);
                fM3297constructorimpl3 = Dp.m3297constructorimpl(24);
                fM3297constructorimpl2 = Dp.m3297constructorimpl(f4);
                composer.endReplaceGroup();
                str = "popupTitle";
                z = false;
            } else {
                composer.startReplaceGroup(639043464);
                textStyleA = fj0.f28535a.b(composer, 6).getDialog().getDefault().getMessage().a(TextUnit.m3364boximpl(fj0.a.f28536a.d()), composer, 6, 0);
                fM3297constructorimpl = Dp.m3297constructorimpl(zp0Var instanceof zp0.g ? 0 : 24);
                float f5 = 24;
                float fM3297constructorimpl4 = Dp.m3297constructorimpl(f5);
                float fM3297constructorimpl5 = Dp.m3297constructorimpl(f5);
                composer.endReplaceGroup();
                str = "popupMessage";
                fM3297constructorimpl2 = fM3297constructorimpl5;
                fM3297constructorimpl3 = fM3297constructorimpl4;
                z = true;
            }
            if (function2 == null) {
                composer.startReplaceGroup(639504123);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(639504124);
                Modifier.Companion companion = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(40)), composer, 6);
                function2.invoke(composer, 0);
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, fM3297constructorimpl), composer, 0);
                composer.endReplaceGroup();
            }
            if (function22 == null) {
                composer.startReplaceGroup(639703143);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(639703144);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierA = a80.a(companion2, BitmapDescriptorFactory.HUE_RED);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierA);
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
                function22.invoke(composer, 0);
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion2, fM3297constructorimpl2), composer, 0);
                composer.endReplaceGroup();
            }
            c81 c81VarA = zp0Var.a();
            if (c81VarA == null) {
                composer.startReplaceGroup(640025450);
                composer.endReplaceGroup();
                i2 = 0;
            } else {
                composer.startReplaceGroup(640025451);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1802837436, true, new uj1(str, 2, c81VarA, textStyleA), composer, 54);
                i2 = 0;
                pq0.a(z, composableLambdaRememberComposableLambda, composer, 48, 0);
                composer.endReplaceGroup();
            }
            if (zp0Var instanceof zp0.c) {
                composer.startReplaceGroup(640560201);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion4, fM3297constructorimpl3), composer, i2);
                f = fM3297constructorimpl3;
                e10.a(a80.a(companion4, 2.0f), d81.c(((zp0.c) zp0Var).e(), composer, i2), 0, 0L, (z10) null, composer, 0, 28);
            } else {
                f = fM3297constructorimpl3;
                composer.startReplaceGroup(627275244);
            }
            composer.endReplaceGroup();
            if (function23 == null) {
                composer.startReplaceGroup(640835325);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(640835326);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion5, f), composer, 0);
                Modifier modifierA2 = a80.a(companion5, 2.0f);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierA2);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                function23.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(20)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, c81 c81Var, TextStyle textStyle, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1802837436, i, -1, "com.fourthline.orca.core.internal.popup.PopupUpper.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrcaPopup.kt:337)");
            }
            TextKt.m1421TextZ58ophY(d81.b(c81Var, composer, 0), a80.a(a80.a(Modifier.INSTANCE, str, (String) null, 2, (Object) null), 1.0f), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, textStyle, composer, 0, 0, 261116);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public static final void a(zp0 zp0Var, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(zp0Var, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-821084797);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(zp0Var) : composerStartRestartGroup.changedInstance(zp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821084797, i2, -1, "com.fourthline.orca.core.internal.popup.Image (OrcaPopup.kt:384)");
            }
            if (zp0Var instanceof zp0.a) {
                composerStartRestartGroup.startReplaceGroup(1211495615);
                a(((zp0.a) zp0Var).e(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (zp0Var instanceof zp0.b) {
                composerStartRestartGroup.startReplaceGroup(1211498271);
                a(((zp0.b) zp0Var).f(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (zp0Var instanceof zp0.e) {
                composerStartRestartGroup.startReplaceGroup(1211500602);
                a(((zp0.e) zp0Var).e(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(zp0Var instanceof zp0.d) && !(zp0Var instanceof zp0.c) && !(zp0Var instanceof zp0.g) && !(zp0Var instanceof zp0.f)) {
                    composerStartRestartGroup.startReplaceGroup(1211494193);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1211507207);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new en1(zp0Var, i, 1));
        }
    }

    public static final void a(zp0 state, Function1 onPrimaryClicked, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Unit unit;
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPrimaryClicked, "onPrimaryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1880236385);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2;
        if (composerStartRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1880236385, i5, -1, "com.fourthline.orca.core.internal.popup.PopupFooter (OrcaPopup.kt:402)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion3, Dp.m3297constructorimpl(20)), composerStartRestartGroup, 6);
            kd1 kd1VarB = state.b();
            if (kd1VarB == null) {
                composerStartRestartGroup.startReplaceGroup(-1105001905);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion3;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1105001904);
                companion = companion3;
                wg0.a(a80.a(companion3, 3.0f), kd1VarB, false, false, false, onPrimaryClicked, composerStartRestartGroup, 458752 & (i5 << 12), 28);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean z = false;
            kd1 kd1VarD = state.d();
            if (kd1VarD == null) {
                composerStartRestartGroup.startReplaceGroup(-1104736545);
                composerStartRestartGroup.endReplaceGroup();
                unit = null;
                companion2 = companion;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1104736544);
                Modifier modifierA = a80.a(companion, 4.0f);
                if ((i5 & 896) == 256) {
                    z = true;
                }
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new li1(23, function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                companion2 = companion;
                p9.a(modifierA, null, kd1VarD, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 26);
                composerStartRestartGroup.endReplaceGroup();
                unit = Unit.f186387a;
            }
            if (unit == null) {
                composerStartRestartGroup.startReplaceGroup(795655663);
                i3 = 6;
                SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion2, th0.f33777a.a()), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = 6;
                composerStartRestartGroup.startReplaceGroup(795646704);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion2, Dp.m3297constructorimpl(24)), composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ek1((Object) state, onPrimaryClicked, (Object) function1, i, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (function1 != null) {
            function1.invoke(it8);
        }
        return Unit.f186387a;
    }

    private static final void a(p70 p70Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(849862335);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(p70Var) : composerStartRestartGroup.changedInstance(p70Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(849862335, i2, -1, "com.fourthline.orca.core.internal.popup.PopupAnimation (OrcaPopup.kt:428)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            g81.a(null, false, false, 0L, 0L, 0L, 0L, 0, BitmapDescriptorFactory.HUE_RED, null, p70Var, null, null, null, composer2, 48, i2 & 14, 15357);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xk1(p70Var, i, 1));
        }
    }

    private static final void a(z10 z10Var, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(388831952);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(388831952, i2, -1, "com.fourthline.orca.core.internal.popup.PopupImage (OrcaPopup.kt:438)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = i2 & 14;
            Painter painterA = a20.a(z10Var, composerStartRestartGroup, i3);
            if (painterA instanceof fw) {
                painterA = null;
            }
            if (painterA == null) {
                composerStartRestartGroup.startReplaceGroup(-249189249);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-249189248);
                ImageKt.Image(painterA, null, columnScopeInstance.align(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(64)), companion2.getCenterHorizontally()), null, ContentScale.INSTANCE.getFillHeight(), BitmapDescriptorFactory.HUE_RED, b(z10Var, composerStartRestartGroup, i3), composerStartRestartGroup, 24624, 40);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(z10Var, i, 1));
        }
    }

    private static final ColorFilter a(long j2, long j3) {
        float[] fArrA = a(j2, Color.m1983getRedimpl(j3));
        float[] fArrA2 = a(j2, Color.m1982getGreenimpl(j3));
        float[] fArrA3 = a(j2, Color.m1980getBlueimpl(j3));
        return ColorFilter.INSTANCE.m1997colorMatrixjHGOpc(ColorMatrix.m2003constructorimpl(new float[]{fArrA[0], fArrA[1], fArrA[2], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fArrA2[0], fArrA2[1], fArrA2[2], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fArrA3[0], fArrA3[1], fArrA3[2], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED}));
    }

    private static final float[] a(long j2, float f) {
        float[] fArr = {Color.m1983getRedimpl(j2), Color.m1982getGreenimpl(j2), Color.m1980getBlueimpl(j2)};
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d5 = 0.0d;
        int i = 0;
        double d6 = 0.0d;
        for (int i2 = 0; i2 < 3; i2++) {
            d6 += (double) fArr[i2];
            i++;
        }
        float f4 = (float) (i == 0 ? Double.NaN : d6 / ((double) i));
        ArrayList arrayList = new ArrayList(3);
        for (int i3 = 0; i3 < 3; i3++) {
            arrayList.add(Float.valueOf(fArr[i3] - f4));
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            float fFloatValue = ((Number) obj2).floatValue();
            d5 += (double) (fFloatValue * fFloatValue);
        }
        float f5 = (float) d5;
        if (f5 == BitmapDescriptorFactory.HUE_RED) {
            return new float[]{0.33333334f, 0.33333334f, 0.33333334f};
        }
        float f6 = (f - f4) / f5;
        return new float[]{(((Number) arrayList.get(0)).floatValue() * f6) + 0.33333334f, (((Number) arrayList.get(1)).floatValue() * f6) + 0.33333334f, (f6 * ((Number) arrayList.get(2)).floatValue()) + 0.33333334f};
    }

    private static final Modifier a(Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new dn1(0), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset a(Animatable animatable, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m3328boximpl(IntOffset.m3329constructorimpl((((long) rim.d.c(((Number) animatable.getValue()).floatValue())) & BodyPartID.bodyIdMax) | (((long) 0) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier a(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-263833580);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-263833580, i, -1, "com.fourthline.orca.core.internal.popup.enableVerticalDrag.<anonymous> (OrcaPopup.kt:515)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        Animatable animatable = (Animatable) objRememberedValue;
        Unit unit = Unit.f186387a;
        boolean zChangedInstance = composer.changedInstance(animatable);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new d(animatable);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(composed, unit, (PointerInputEventHandler) objRememberedValue2);
        boolean zChangedInstance2 = composer.changedInstance(animatable);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new mp1(animatable, 12);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Modifier modifierOffset = OffsetKt.offset(modifierPointerInput, (Function1) objRememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierOffset;
    }
}
