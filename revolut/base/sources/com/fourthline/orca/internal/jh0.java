package com.fourthline.orca.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jh0 {

    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f29893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f29894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f29895c;
        final /* synthetic */ MutableState d;
        final /* synthetic */ float e;
        final /* synthetic */ ih0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ tb.a0 f29896g;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.jh0$a$a, reason: collision with other inner class name */
        public static final class C0225a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f29898b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MutableState f29899c;
            final /* synthetic */ CoroutineScope d;
            final /* synthetic */ MutableState e;
            final /* synthetic */ MutableState f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f29900g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ih0 f29901h;
            final /* synthetic */ tb.a0 i;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.jh0$a$a$a, reason: collision with other inner class name */
            public static final class C0226a extends gim.h implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f29902a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f29903b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MutableState f29904c;
                final /* synthetic */ CoroutineScope d;
                final /* synthetic */ MutableState e;
                final /* synthetic */ MutableState f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ float f29905g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ ih0 f29906h;
                final /* synthetic */ tb.a0 i;

                /* JADX INFO: renamed from: com.fourthline.orca.internal.jh0$a$a$a$a, reason: collision with other inner class name */
                public static final class C0227a extends gim.i implements Function2 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f29907a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ tb.a0 f29908b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0227a(tb.a0 a0Var, Continuation continuation) {
                        super(2, continuation);
                        this.f29908b = a0Var;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C0227a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                    }

                    @Override // gim.a
                    public final Continuation create(Object obj2, Continuation continuation) {
                        return new C0227a(this.f29908b, continuation);
                    }

                    @Override // gim.a
                    public final Object invokeSuspend(Object obj2) {
                        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                        int i = this.f29907a;
                        if (i == 0) {
                            yhm.o.b(obj2);
                            tb.a0 a0Var = this.f29908b;
                            this.f29907a = 1;
                            if (jh0.b(a0Var, false, this) == aVar) {
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

                /* JADX INFO: renamed from: com.fourthline.orca.internal.jh0$a$a$a$b */
                public static final class b extends gim.i implements Function2 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f29909a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ tb.a0 f29910b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(tb.a0 a0Var, Continuation continuation) {
                        super(2, continuation);
                        this.f29910b = a0Var;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                    }

                    @Override // gim.a
                    public final Continuation create(Object obj2, Continuation continuation) {
                        return new b(this.f29910b, continuation);
                    }

                    @Override // gim.a
                    public final Object invokeSuspend(Object obj2) {
                        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                        int i = this.f29909a;
                        if (i == 0) {
                            yhm.o.b(obj2);
                            tb.a0 a0Var = this.f29910b;
                            this.f29909a = 1;
                            if (jh0.b(a0Var, true, this) == aVar) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0226a(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3, float f, ih0 ih0Var, tb.a0 a0Var, Continuation continuation) {
                    super(2, continuation);
                    this.f29904c = mutableState;
                    this.d = coroutineScope;
                    this.e = mutableState2;
                    this.f = mutableState3;
                    this.f29905g = f;
                    this.f29906h = ih0Var;
                    this.i = a0Var;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((C0226a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.f186387a);
                }

                @Override // gim.a
                public final Continuation create(Object obj2, Continuation continuation) {
                    C0226a c0226a = new C0226a(this.f29904c, this.d, this.e, this.f, this.f29905g, this.f29906h, this.i, continuation);
                    c0226a.f29903b = obj2;
                    return c0226a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
                
                    if (r14 == r0) goto L15;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003f -> B:16:0x0042). Please report as a decompilation issue!!! */
                @Override // gim.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 282
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.jh0.a.C0225a.C0226a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0225a(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3, float f, ih0 ih0Var, tb.a0 a0Var, Continuation continuation) {
                super(2, continuation);
                this.f29899c = mutableState;
                this.d = coroutineScope;
                this.e = mutableState2;
                this.f = mutableState3;
                this.f29900g = f;
                this.f29901h = ih0Var;
                this.i = a0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                return ((C0225a) create(pointerInputScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0225a c0225a = new C0225a(this.f29899c, this.d, this.e, this.f, this.f29900g, this.f29901h, this.i, continuation);
                c0225a.f29898b = obj2;
                return c0225a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                PointerInputScope pointerInputScope = (PointerInputScope) this.f29898b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f29897a;
                if (i == 0) {
                    yhm.o.b(obj2);
                    C0226a c0226a = new C0226a(this.f29899c, this.d, this.e, this.f, this.f29900g, this.f29901h, this.i, null);
                    this.f29898b = null;
                    this.f29897a = 1;
                    if (pointerInputScope.awaitPointerEventScope(c0226a, this) == aVar) {
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

        public a(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3, float f, ih0 ih0Var, tb.a0 a0Var) {
            this.f29893a = mutableState;
            this.f29894b = coroutineScope;
            this.f29895c = mutableState2;
            this.d = mutableState3;
            this.e = f;
            this.f = ih0Var;
            this.f29896g = a0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            Object objForEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new C0225a(this.f29893a, this.f29894b, this.f29895c, this.d, this.e, this.f, this.f29896g, null), continuation);
            return objForEachGesture == fim.a.COROUTINE_SUSPENDED ? objForEachGesture : Unit.f186387a;
        }
    }

    public static final class b implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ih0 f29911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f29912b;

        public b(ih0 ih0Var, Function1 function1) {
            this.f29911a = ih0Var;
            this.f29912b = function1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            Map mapD = this.f29911a.d();
            Function1 function1 = this.f29912b;
            if (function1 != null) {
                function1.invoke(mapD);
            }
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Continuation continuation) {
            super(2, continuation);
            this.f29914b = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ScrollScope scrollScope, Continuation continuation) {
            return ((c) create(scrollScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new c(this.f29914b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29913a;
            if (i == 0) {
                yhm.o.b(obj2);
                if (this.f29914b) {
                    return Unit.f186387a;
                }
                this.f29913a = 1;
                if (skm.k0.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, ImageBitmap imageBitmap, tb.a0 a0Var, ih0 ih0Var, float f, float f4, ContentScale contentScale, boolean z, int i, int i2, Composer composer, int i3) {
        a(modifier, imageBitmap, a0Var, ih0Var, f, f4, contentScale, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, List list, long j2, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        a(modifier, list, j2, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    private static final float b(ImageBitmap imageBitmap, float f, float f4, float f5) {
        float height = imageBitmap.getHeight() / f5;
        float f6 = f * height;
        float fMax = BitmapDescriptorFactory.HUE_RED;
        if (f6 > f4) {
            fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f4 - height) / 2;
        }
        return ((f6 - height) / 2) - fMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.ui.Modifier r26, final java.util.List r27, long r28, kotlin.jvm.functions.Function1 r30, boolean r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.jh0.a(androidx.compose.ui.Modifier, java.util.List, long, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(tb.a0 a0Var, boolean z, Continuation continuation) {
        Object objScroll = a0Var.scroll(MutatePriority.PreventUserInput, new c(z, null), continuation);
        return objScroll == fim.a.COROUTINE_SUSPENDED ? objScroll : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, tb.a0 a0Var, ih0 ih0Var, boolean z, tb.w VerticalPager, int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(VerticalPager, "$this$VerticalPager");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449365613, i3, -1, "com.fourthline.orca.qes.internal.screens.pdf.OrcaDocumentViewer.<anonymous>.<anonymous> (OrcaDocumentViewer.kt:59)");
            }
            a(null, (ImageBitmap) list.get(i), a0Var, ih0Var, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z, composer, 0, 113);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(androidx.compose.ui.Modifier r42, final androidx.compose.ui.graphics.ImageBitmap r43, final tb.a0 r44, final com.fourthline.orca.internal.ih0 r45, float r46, float r47, androidx.compose.ui.layout.ContentScale r48, boolean r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.jh0.a(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.ImageBitmap, tb.a0, com.fourthline.orca.internal.ih0, float, float, androidx.compose.ui.layout.ContentScale, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a() {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, float f, float f4, MutableState mutableState2, MutableState mutableState3) {
        Float fValueOf = Float.valueOf(1.0f);
        ((Number) mutableState.getValue()).floatValue();
        if (((Number) mutableState.getValue()).floatValue() >= ((f4 - f) / 2) + f) {
            mutableState.setValue(Float.valueOf(f));
            mutableState2.setValue(fValueOf);
            mutableState3.setValue(fValueOf);
        } else {
            mutableState.setValue(Float.valueOf(f4));
        }
        return Unit.f186387a;
    }

    private static final void a(ih0 ih0Var, float f, float f4) {
        if (f4 > f && !ih0Var.e()) {
            ih0Var.b();
        } else {
            if (f4 > f || !ih0Var.e()) {
                return;
            }
            ih0Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MutableState mutableState, LayoutCoordinates it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        LayoutCoordinates parentLayoutCoordinates = it8.getParentLayoutCoordinates();
        mutableState.setValue(Size.m1861boximpl(parentLayoutCoordinates != null ? IntSizeKt.m3363toSizeozmzZPI(parentLayoutCoordinates.mo2533getSizeYbymL2g()) : Size.INSTANCE.m1875getZeroNHjbRc()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(float f, float f4, MutableState mutableState, ImageBitmap imageBitmap, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ih0 ih0Var, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        float fMax = Math.max(f, Math.min(f4, ((Number) mutableState.getValue()).floatValue()));
        a(ih0Var, f, fMax);
        float fA = a(imageBitmap, ((Size) mutableState2.getValue()).getPackedValue());
        float fA2 = a(imageBitmap, fMax, Float.intBitsToFloat((int) (((Size) mutableState2.getValue()).getPackedValue() >> 32)), fA);
        float fB = b(imageBitmap, fMax, Float.intBitsToFloat((int) (((Size) mutableState2.getValue()).getPackedValue() & BodyPartID.bodyIdMax)), fA);
        graphicsLayer.setScaleX(fMax);
        graphicsLayer.setScaleY(fMax);
        graphicsLayer.setTranslationX(Math.max(-fA2, Math.min(fA2, ((Number) mutableState3.getValue()).floatValue())));
        graphicsLayer.setTranslationY(Math.max(-fB, Math.min(fB, ((Number) mutableState4.getValue()).floatValue())));
        return Unit.f186387a;
    }

    private static final float a(ImageBitmap imageBitmap, long j2) {
        return Math.max(1.0f, Math.max(imageBitmap.getWidth() / Float.intBitsToFloat((int) (j2 >> 32)), imageBitmap.getHeight() / Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))));
    }

    private static final float a(ImageBitmap imageBitmap, float f, float f4, float f5) {
        float width = imageBitmap.getWidth() / f5;
        float f6 = f * width;
        float fMax = BitmapDescriptorFactory.HUE_RED;
        if (f6 > f4) {
            fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f4 - width) / 2;
        }
        return ((f6 - width) / 2) - fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult a(ih0 ih0Var, Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new b(ih0Var, function1);
    }
}
