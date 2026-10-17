package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.BackHandlerKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerComposableKt;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cf0;
import com.fourthline.orca.internal.df0;
import com.fourthline.orca.internal.ff0;
import com.fourthline.orca.internal.fj0;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jf0 {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f29874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29875c;
        final /* synthetic */ MutableState d;
        final /* synthetic */ ManagedActivityResultLauncher e;
        final /* synthetic */ Lazy f;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.jf0$a$a, reason: collision with other inner class name */
        public static final class C0224a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29877b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f29878c;
            final /* synthetic */ MutableState d;
            final /* synthetic */ ManagedActivityResultLauncher e;
            final /* synthetic */ Lazy f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0224a(Context context, MutableState mutableState, ManagedActivityResultLauncher managedActivityResultLauncher, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f29878c = context;
                this.d = mutableState;
                this.e = managedActivityResultLauncher;
                this.f = lazy;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(bf0 bf0Var, Continuation continuation) {
                return ((C0224a) create(bf0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0224a c0224a = new C0224a(this.f29878c, this.d, this.e, this.f, continuation);
                c0224a.f29877b = obj2;
                return c0224a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                bf0 bf0Var = (bf0) this.f29877b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f29876a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (!(bf0Var instanceof bf0.c)) {
                    if (bf0Var instanceof bf0.e) {
                        vc.a(this.f29878c, 0L, 1, null);
                    } else if (bf0Var instanceof bf0.a) {
                        this.d.setValue(Boolean.FALSE);
                    } else if (bf0Var instanceof bf0.b) {
                        this.d.setValue(Boolean.TRUE);
                    } else {
                        if (!(bf0Var instanceof bf0.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.e.launch(jf0.a(this.f));
                    }
                }
                return Unit.f186387a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Context context, MutableState mutableState, ManagedActivityResultLauncher managedActivityResultLauncher, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f29874b = flow;
            this.f29875c = context;
            this.d = mutableState;
            this.e = managedActivityResultLauncher;
            this.f = lazy;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f29874b, this.f29875c, this.d, this.e, this.f, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29873a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flow = this.f29874b;
                if (flow != null) {
                    C0224a c0224a = new C0224a(this.f29875c, this.d, this.e, this.f, null);
                    this.f29873a = 1;
                    if (wz.a(flow, c0224a, this) == aVar) {
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
        int f29879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f29880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f29880b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f29880b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29879a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            this.f29880b.invoke(cf0.d.f27455a);
            return Unit.f186387a;
        }
    }

    public static final class c implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f29881a;

        public c(Function1 function1) {
            this.f29881a = function1;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f29881a.invoke(cf0.c.f27454a);
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f29883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f29883b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new d(this.f29883b, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29882a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f29882a = 1;
                if (skm.k0.b(1000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            this.f29883b.invoke(cf0.e.f27456a);
            return Unit.f186387a;
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ff0.a.InterfaceC0196a f29885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29886c;
        final /* synthetic */ Pair d;
        final /* synthetic */ ExoPlayer e;
        final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ff0.a.InterfaceC0196a interfaceC0196a, Context context, Pair pair, ExoPlayer exoPlayer, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f29885b = interfaceC0196a;
            this.f29886c = context;
            this.d = pair;
            this.e = exoPlayer;
            this.f = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new e(this.f29885b, this.f29886c, this.d, this.e, this.f, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            MediaItem mediaItemFromUri;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29884a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            ff0.a.InterfaceC0196a interfaceC0196a = this.f29885b;
            if (interfaceC0196a instanceof ff0.a.InterfaceC0196a.C0197a) {
                mediaItemFromUri = MediaItem.fromUri(((ff0.a.InterfaceC0196a.C0197a) interfaceC0196a).b());
            } else {
                if (!(interfaceC0196a instanceof ff0.a.InterfaceC0196a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                mediaItemFromUri = MediaItem.fromUri(RawResourceDataSource.buildRawResourceUri(((ff0.a.InterfaceC0196a.b) interfaceC0196a).b()));
            }
            Intrinsics.h(mediaItemFromUri);
            MediaSource mediaSourceCreateMediaSource = new DefaultMediaSourceFactory(this.f29886c).createMediaSource(mediaItemFromUri);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long jIntValue = ((Number) this.d.f186385a).intValue();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            ClippingMediaSource clippingMediaSource = new ClippingMediaSource(mediaSourceCreateMediaSource, timeUnit.convert(jIntValue, timeUnit2), timeUnit.convert(((Number) this.d.f186386b).intValue(), timeUnit2));
            ExoPlayer exoPlayer = this.e;
            boolean z = this.f;
            exoPlayer.setMediaSource(clippingMediaSource);
            exoPlayer.prepare();
            exoPlayer.setPlayWhenReady(true);
            exoPlayer.setRepeatMode(z ? 1 : 0);
            return Unit.f186387a;
        }
    }

    public static final class f implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f29887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f29888b;

        public f(ExoPlayer exoPlayer, g gVar) {
            this.f29887a = exoPlayer;
            this.f29888b = gVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            ExoPlayer exoPlayer = this.f29887a;
            exoPlayer.removeListener(this.f29888b);
            exoPlayer.release();
        }
    }

    public static final class g implements Player.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29889a;

        public g(Function0 function0) {
            this.f29889a = function0;
        }

        public void onPlaybackStateChanged(int i) {
            if (i == 4) {
                this.f29889a.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, z10 z10Var, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, z10Var, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ff0 ff0Var, Function1 function1, int i, Composer composer, int i2) {
        b(ff0Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, int i2, int i3, Composer composer, int i5) {
        a(i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(cf0.b.f27453a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ff0 ff0Var, int i, Composer composer, int i2) {
        a(ff0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void b(ff0 state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(2043035487);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2043035487, i2, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.NfcScannerViewWithLoader (NfcScannerScreen.kt:161)");
            }
            if (state instanceof ff0.b) {
                composerStartRestartGroup.startReplaceGroup(88774221);
                ff0.b bVar = (ff0.b) state;
                k31.a(bVar.getTitle(), bVar.n(), (a9) null, (Function0) null, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(88895803);
                a(state, onEventSent, composerStartRestartGroup, i2 & 126);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new co1(state, onEventSent, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ff0 ff0Var, NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback, Flow flow, Function1 function1, int i, Composer composer, int i2) {
        a(ff0Var, nfcScannerConfig, extraNfcScannerConfig, nfcScannerCallback, flow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ff0 ff0Var, Function1 function1, int i, Composer composer, int i2) {
        a(ff0Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, ff0.a.InterfaceC0196a interfaceC0196a, Pair pair, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, interfaceC0196a, pair, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(df0 df0Var, int i, Composer composer, int i2) {
        a(df0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void a(ff0 state, NfcScannerConfig config, ExtraNfcScannerConfig extraConfig, NfcScannerCallback callback, Flow flow, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Object aVar;
        int i3;
        Unit unit;
        int i5;
        ?? r152;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(extraConfig, "extraConfig");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1431913037);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(config) : composerStartRestartGroup.changedInstance(config) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(extraConfig) : composerStartRestartGroup.changedInstance(extraConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(callback) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(flow) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 131072 : 65536;
        }
        int i6 = i2;
        if (composerStartRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1431913037, i6, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.NfcScannerScreen (NfcScannerScreen.kt:103)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new wn1(7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Lazy lazyB = yhm.j.b((Function0) objRememberedValue2);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            int i21 = i6 & 458752;
            boolean z = i21 == 131072;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new mn1(18, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            Unit unit2 = Unit.f186387a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(flow) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult) | composerStartRestartGroup.changedInstance(lazyB);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                i3 = i21;
                unit = unit2;
                i5 = i6;
                r152 = 0;
                aVar = new a(flow, context, mutableState, managedActivityResultLauncherRememberLauncherForActivityResult, lazyB, null);
                composerStartRestartGroup.updateRememberedValue(aVar);
            } else {
                unit = unit2;
                aVar = objRememberedValue4;
                i5 = i6;
                r152 = 0;
                i3 = i21;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) aVar, composerStartRestartGroup, 6);
            ?? r102 = i3 == 131072 ? 1 : r152;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (r102 != 0 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new mn1(19, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 6);
            ?? r103 = i3 == 131072 ? 1 : r152;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (r103 != 0 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new lj1(20, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            BackHandlerKt.BackHandler(r152, (Function0) objRememberedValue6, composerStartRestartGroup, r152, 1);
            b(state, onEventSent, composerStartRestartGroup, (i5 & 14) | ((i5 >> 12) & 112));
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(507657163);
                int i22 = i5 >> 3;
                NfcScannerComposableKt.NfcScanner(config, extraConfig, callback, composerStartRestartGroup, NfcScannerConfig.$stable | (i22 & 14) | (ExtraNfcScannerConfig.$stable << 3) | (i22 & 112) | (i22 & 896));
            } else {
                composerStartRestartGroup.startReplaceGroup(501007477);
            }
            composerStartRestartGroup.endReplaceGroup();
            je0.a(composerStartRestartGroup, (int) r152);
            ?? r104 = i3 == 131072 ? 1 : r152;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (r104 != 0 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new b(onEventSent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new do1(state, config, extraConfig, callback, flow, onEventSent, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(cf0.e.f27456a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m2837setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m2813getAssertive0phEisY());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ff0 ff0Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(154800204, i, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Footer.<anonymous>.<anonymous>.<anonymous> (NfcScannerScreen.kt:309)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a(companion, "hintView", (String) null, 2, (Object) null);
            AnnotatedString annotatedStringB = d81.b(ff0Var.getTitle(), composer, 0);
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            int iM3223getCentere0LSkKk = companion2.m3223getCentere0LSkKk();
            fj0 fj0Var = fj0.f28535a;
            a81 a81VarE = fj0Var.b(composer, 6).getIb.b.Screen java.lang.String().getHeader();
            fj0.a aVar = fj0.a.f28536a;
            TextKt.m1281TextIbK3jfQ(annotatedStringB, modifierA, 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(iM3223getCentere0LSkKk), 0L, 0, false, 0, 0, null, null, a81VarE.a(TextUnit.m3364boximpl(aVar.c()), composer, 6, 0), composer, 0, 0, 130556);
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(companion, Dp.m3297constructorimpl(16)), composer, 6);
            TextKt.m1281TextIbK3jfQ(d81.b(ff0Var.a(), composer, 0), a80.a(companion, "hintView", (String) null, 2, (Object) null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(companion2.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, fj0Var.b(composer, 6).getIb.b.Screen java.lang.String().getMessage().a(TextUnit.m3364boximpl(aVar.a()), composer, 6, 0), composer, 0, 0, 130556);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        return new Intent("android.settings.NFC_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, ActivityResult it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        function1.invoke(cf0.a.f27452a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(cf0.c.f27454a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void a(ff0 state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        ?? r2;
        int i3;
        fj0 fj0Var;
        boolean z;
        float f4;
        String str;
        int i5;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1341579304);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341579304, i2, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.NfcScannerView (NfcScannerScreen.kt:177)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = a80.a(a80.b(companion, "nfc_scan"));
            fj0 fj0Var2 = fj0.f28535a;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m613backgroundbw27NRU$default(modifierA, zi0.a(fj0Var2.b(composerStartRestartGroup, 6)).a().a(composerStartRestartGroup, 0), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new jm1(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1665setimpl(composerM1662constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM1662constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m1665setimpl(composerM1662constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if ((state instanceof ff0.e) && (((ff0.e) state).m().a() instanceof p70)) {
                composerStartRestartGroup.startReplaceGroup(-1348910463);
                boolean z3 = (i2 & 112) == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new d(onEventSent, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1356712140);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, a80.a(a80.a(companion), 2.0f), 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopEnd(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl2 = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl2.getInserting() || !Intrinsics.f(composerM1662constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM1662constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM1662constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m1665setimpl(composerM1662constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1217532737);
            ff0.a aVarM = state.m();
            z00 z00VarA = aVarM.a();
            if (z00VarA instanceof p70) {
                composerStartRestartGroup.startReplaceGroup(-1842925483);
                i3 = i2;
                z = false;
                fj0Var = fj0Var2;
                g81.a(SizeKt.fillMaxWidth$default(a80.a(a80.a((Modifier) companion, false), "illustrationView", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, (p70) z00VarA, null, null, null, composerStartRestartGroup, 12582912, 0, 15230);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                f4 = BitmapDescriptorFactory.HUE_RED;
                str = null;
                i5 = 32;
            } else {
                i3 = i2;
                fj0Var = fj0Var2;
                z = false;
                z = false;
                if (z00VarA instanceof ff0.a.InterfaceC0196a) {
                    composerStartRestartGroup.startReplaceGroup(-1999098252);
                    str = null;
                    Modifier modifierA2 = a80.a(a80.a((Modifier) companion, false), "illustrationView", (String) null, 2, (Object) null);
                    f4 = BitmapDescriptorFactory.HUE_RED;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifierA2, BitmapDescriptorFactory.HUE_RED, 1, null);
                    ff0.a.InterfaceC0196a interfaceC0196a = (ff0.a.InterfaceC0196a) z00VarA;
                    Pair pairB = aVarM.b();
                    boolean zC = aVarM.c();
                    i5 = 32;
                    boolean z4 = (i3 & 112) == 32;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = new lj1(18, onEventSent);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    a(modifierFillMaxWidth$default2, interfaceC0196a, pairB, zC, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    f4 = BitmapDescriptorFactory.HUE_RED;
                    str = null;
                    i5 = 32;
                    composerStartRestartGroup.startReplaceGroup(-1999082905);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            Unit unit = Unit.f186387a;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM862padding3ABfNKs = PaddingKt.m862padding3ABfNKs(a80.a(companion, "closeButton", str, 2, str), Dp.m3297constructorimpl(16));
            z10 z10VarB = state.b();
            boolean z6 = (i3 & 112) == i5 ? true : z ? 1 : 0;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new lj1(19, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            a(modifierM862padding3ABfNKs, z10VarB, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            Modifier modifierA3 = a80.a(a80.a(companion, str, 1, str), 1.0f);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new jm1(10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierM866paddingqDBjuR0$default = PaddingKt.m866paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SemanticsModifierKt.semantics$default(modifierA3, z, (Function1) objRememberedValue5, 1, str), f4, 1, str), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fj0Var.c(composerStartRestartGroup, 6).f(), 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), z);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, z ? 1 : 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM866paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl3 = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m1665setimpl(composerM1662constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM1662constructorimpl3.getInserting() || !Intrinsics.f(composerM1662constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM1662constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM1662constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m1665setimpl(composerM1662constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            a(state, composerStartRestartGroup, i3 & 14);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            r2 = z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                r2 = z;
            }
        } else {
            r2 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new co1(state, onEventSent, i, r2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.f186387a;
    }

    private static final void a(Modifier modifier, z10 z10Var, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1490204859);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(z10Var) : composerStartRestartGroup.changedInstance(z10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1490204859, i3, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.CloseButton (NfcScannerScreen.kt:256)");
            }
            IconButtonKt.IconButton(function0, a80.a(modifier, d81.c(c81.a.a(c81.f27404a, R.string.shared_button_close_acessibility, 0, 2, null), composerStartRestartGroup, 0), false, 2, (Object) null), false, null, ComposableLambdaKt.rememberComposableLambda(-951632809, true, new ei1(z10Var, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ck1(modifier2, z10Var, function0, i, i2, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-951632809, i, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.CloseButton.<anonymous> (NfcScannerScreen.kt:262)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, (Modifier) null, zi0.a(fj0.f28535a.b(composer, 6)).b().a(composer, 0), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(com.fourthline.orca.internal.ff0 r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.jf0.a(com.fourthline.orca.internal.ff0, androidx.compose.runtime.Composer, int):void");
    }

    private static final void a(df0 df0Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-528277062);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(df0Var) : composerStartRestartGroup.changedInstance(df0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-528277062, i2, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.ProgressAnimation (NfcScannerScreen.kt:331)");
            }
            if (df0Var instanceof df0.b) {
                composerStartRestartGroup.startReplaceGroup(-868110736);
                float f4 = 64;
                g81.a(SizeKt.m874height3ABfNKs(SizeKt.m887width3ABfNKs(a80.a(Modifier.INSTANCE, "loadingView", (String) null, 2, (Object) null), Dp.m3297constructorimpl(f4)), Dp.m3297constructorimpl(f4)), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, ((df0.b) df0Var).a(), null, null, null, composerStartRestartGroup, 12582912, 0, 15230);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                if (!(df0Var instanceof df0.a)) {
                    composer2.startReplaceGroup(-868112937);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-868098838);
                df0.a aVar = (df0.a) df0Var;
                a(aVar.b(), aVar.a(), composer2, 0);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new al1(df0Var, i, 4));
        }
    }

    private static final void a(int i, int i2, Composer composer, int i3) {
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1358182915);
        int i21 = 2;
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i22 = 16;
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        int i32 = 0;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1358182915, i5, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.CustomProgressBar (NfcScannerScreen.kt:355)");
            }
            Object obj2 = null;
            Modifier modifierM874height3ABfNKs = SizeKt.m874height3ABfNKs(a80.a(Modifier.INSTANCE, "loadingView", (String) null, 2, (Object) null), Dp.m3297constructorimpl(64));
            float f4 = BitmapDescriptorFactory.HUE_RED;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM874height3ABfNKs, BitmapDescriptorFactory.HUE_RED, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(967362151);
            int i33 = i + 1;
            int i43 = 1;
            while (i43 < i33) {
                br0 br0VarC = zi0.a(fj0.f28535a.b(composerStartRestartGroup, 6)).c();
                ea eaVarC = i43 <= i2 ? br0VarC.getHighlight() : br0VarC.getBackground().getColor();
                SurfaceKt.m1257SurfaceFjzlyU(SizeKt.m887width3ABfNKs(SizeKt.m874height3ABfNKs(PaddingKt.m864paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3297constructorimpl(3), f4, i21, obj2), Dp.m3297constructorimpl(i22)), Dp.m3297constructorimpl(12)), MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), eaVarC.a(composerStartRestartGroup, i32), ColorsKt.m1197contentColorForek8zF_U(eaVarC.a(composerStartRestartGroup, i32), composerStartRestartGroup, i32), null, Dp.m3297constructorimpl(i32), ua.f33984a.a(), composerStartRestartGroup, 1794054, 0);
                i43++;
                i33 = i33;
                f4 = 0.0f;
                i21 = 2;
                i22 = i22;
                obj2 = obj2;
                i32 = i32;
            }
            i6 = 1;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i6 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nk1(i, i2, i3, i6));
        }
    }

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
    private static final void a(Modifier modifier, ff0.a.InterfaceC0196a interfaceC0196a, Pair pair, boolean z, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        Object eVar;
        int i5;
        Object[] objArr;
        ExoPlayer exoPlayer;
        Composer composerStartRestartGroup = composer.startRestartGroup(2039368192);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(interfaceC0196a) : composerStartRestartGroup.changedInstance(interfaceC0196a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(pair) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i21 = i3;
        if (composerStartRestartGroup.shouldExecute((i21 & 9363) != 9362, i21 & 1)) {
            Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039368192, i21, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Player (NfcScannerScreen.kt:396)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z3 = (57344 & i21) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            g gVar = (g) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj2 = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                exoPlayerBuild.addListener(gVar);
                composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                obj2 = exoPlayerBuild;
            }
            ExoPlayer exoPlayer2 = (ExoPlayer) obj2;
            Intrinsics.h(exoPlayer2);
            Object[] objArr2 = {interfaceC0196a, pair, Boolean.valueOf(z), gVar};
            boolean zChangedInstance = ((i21 & 112) == 32 || ((i21 & 64) != 0 && composerStartRestartGroup.changedInstance(interfaceC0196a))) | composerStartRestartGroup.changedInstance(context) | ((i21 & 896) == 256) | composerStartRestartGroup.changedInstance(exoPlayer2) | ((i21 & 7168) == 2048);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                i5 = 0;
                objArr = objArr2;
                eVar = new e(interfaceC0196a, context, pair, exoPlayer2, z, null);
                exoPlayer = exoPlayer2;
                composerStartRestartGroup.updateRememberedValue(eVar);
            } else {
                objArr = objArr2;
                eVar = objRememberedValue3;
                exoPlayer = exoPlayer2;
                i5 = 0;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) eVar, composerStartRestartGroup, i5);
            int iM2002toArgb8_81llA = ColorKt.m2002toArgb8_81llA(zi0.a(fj0.f28535a.b(composerStartRestartGroup, 6)).a().a(composerStartRestartGroup, i5));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changed(iM2002toArgb8_81llA);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new eo1(context, exoPlayer, iM2002toArgb8_81llA);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifier5 = modifier4;
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue4, modifier5, null, composerStartRestartGroup, (i21 << 3) & 112, 4);
            Composer composer3 = composerStartRestartGroup;
            Unit unit = Unit.f186387a;
            boolean zChangedInstance3 = composer3.changedInstance(exoPlayer) | composer3.changed(gVar);
            Object objRememberedValue5 = composer3.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new jn1(exoPlayer, gVar, 1);
                composer3.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer3, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            composer2 = composer3;
        } else {
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composer4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tn1(modifier3, interfaceC0196a, pair, z, function0, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StyledPlayerView a(Context context, ExoPlayer exoPlayer, int i, Context it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setPlayer(exoPlayer);
        styledPlayerView.setUseController(false);
        styledPlayerView.setShutterBackgroundColor(i);
        return styledPlayerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult a(Function1 function1, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new c(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult a(ExoPlayer exoPlayer, g gVar, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new f(exoPlayer, gVar);
    }
}
