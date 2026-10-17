package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.ActivityResult;
import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.jo;
import com.fourthline.vision.document.DocumentScannerConfig;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class xo {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f35052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f35053c;
        final /* synthetic */ ManagedActivityResultLauncher d;
        final /* synthetic */ ub.a e;
        final /* synthetic */ UriHandler f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy f35054g;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.xo$a$a, reason: collision with other inner class name */
        public static final class C0311a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f35056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f35057c;
            final /* synthetic */ ManagedActivityResultLauncher d;
            final /* synthetic */ ub.a e;
            final /* synthetic */ UriHandler f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Lazy f35058g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0311a(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ub.a aVar, UriHandler uriHandler, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f35057c = context;
                this.d = managedActivityResultLauncher;
                this.e = aVar;
                this.f = uriHandler;
                this.f35058g = lazy;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io ioVar, Continuation continuation) {
                return ((C0311a) create(ioVar, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0311a c0311a = new C0311a(this.f35057c, this.d, this.e, this.f, this.f35058g, continuation);
                c0311a.f35056b = obj2;
                return c0311a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                io ioVar = (io) this.f35056b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f35055a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (ioVar instanceof io.d) {
                    vc.a(this.f35057c, 0L, 1, null);
                } else if (ioVar instanceof io.b) {
                    this.d.launch(xo.a(this.f35058g));
                } else if (ioVar instanceof io.c) {
                    this.e.a();
                } else if (!(ioVar instanceof io.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ub.a aVar, UriHandler uriHandler, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f35052b = flow;
            this.f35053c = context;
            this.d = managedActivityResultLauncher;
            this.e = aVar;
            this.f = uriHandler;
            this.f35054g = lazy;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f35052b, this.f35053c, this.d, this.e, this.f, this.f35054g, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f35051a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f35052b;
                if (flow != null) {
                    C0311a c0311a = new C0311a(this.f35053c, this.d, this.e, this.f, this.f35054g, null);
                    this.f35051a = 1;
                    if (wz.a(flow, c0311a, this) == aVar) {
                        return aVar;
                    }
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

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f35060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ub.a f35061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, ub.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f35060b = function1;
            this.f35061c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f35060b, this.f35061c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35059a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f35060b.invoke(new jo.h(this.f35061c.b()));
            return Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo loVar, Flow flow, DocumentScannerConfig documentScannerConfig, Flow flow2, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        a(loVar, flow, documentScannerConfig, flow2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(jo.a.f29977a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(jo.f.f29982a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1) {
        function1.invoke(jo.b.f29978a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1) {
        function1.invoke(jo.c.f29979a);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.fourthline.orca.internal.lo r24, kotlinx.coroutines.flow.Flow r25, com.fourthline.vision.document.DocumentScannerConfig r26, kotlinx.coroutines.flow.Flow r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xo.a(com.fourthline.orca.internal.lo, kotlinx.coroutines.flow.Flow, com.fourthline.vision.document.DocumentScannerConfig, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect b(MutableState mutableState) {
        return a(mutableState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(jo.i.f29985a);
        return Unit.f186387a;
    }

    private static final void b(MutableState mutableState, Rect rect) {
        mutableState.setValue(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, Map permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        function1.invoke(new jo.g(permissions));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ub.a aVar, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        aVar.a();
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
    public static final Unit a(MutableState mutableState, Rect it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        b(mutableState, it8);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(jo.c.f29979a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, float f) {
        function1.invoke(jo.e.f29981a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, Bitmap it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(new jo.d(it8));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Rect a(MutableState mutableState) {
        return (Rect) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(lo loVar, Function1 function1, MutableState mutableState, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(562089819, i, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.DocumentScannerScreen.<anonymous>.<anonymous> (DocumentScannerScreen.kt:121)");
            }
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new an1(mutableState, 5);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ot1(3, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new qp1(28, function1);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            boolean zChanged3 = composer.changed(function1);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new qp1(29, function1);
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            boolean zChanged4 = composer.changed(function1);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new ot1(0, function1);
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function0 function04 = (Function0) objRememberedValue5;
            boolean zChanged5 = composer.changed(function1);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new jt1(5, function1);
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function1 function13 = (Function1) objRememberedValue6;
            boolean zChanged6 = composer.changed(function1);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new jt1(6, function1);
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function1 function14 = (Function1) objRememberedValue7;
            boolean zChanged7 = composer.changed(function1);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new ot1(1, function1);
                composer.updateRememberedValue(objRememberedValue8);
            }
            so.a(loVar, function12, function0, function02, function03, function04, function13, function14, (Function0) objRememberedValue8, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
