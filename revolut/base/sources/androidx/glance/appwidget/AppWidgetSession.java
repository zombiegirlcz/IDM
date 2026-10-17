package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.action.LambdaAction;
import androidx.glance.session.Session;
import androidx.glance.state.ConfigManager;
import androidx.glance.state.GlanceState;
import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.c;
import gim.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 =2\u00020\u0001:\u0005=>?@AB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R(\u00103\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020201008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R.\u00107\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C²\u0006\f\u0010B\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession;", "Landroidx/glance/session/Session;", "Landroidx/glance/appwidget/GlanceAppWidget;", "widget", "Landroidx/glance/appwidget/AppWidgetId;", "id", "Landroid/os/Bundle;", "initialOptions", "Landroidx/glance/state/ConfigManager;", "configManager", "<init>", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroidx/glance/appwidget/AppWidgetId;Landroid/os/Bundle;Landroidx/glance/state/ConfigManager;)V", "Landroidx/glance/appwidget/RemoteViewsRoot;", "createRootEmittable", "()Landroidx/glance/appwidget/RemoteViewsRoot;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "provideGlance", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function2;", "Landroidx/glance/EmittableWithChildren;", "root", "", "processEmittableTree", "(Landroid/content/Context;Landroidx/glance/EmittableWithChildren;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "event", "processEvent", "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateGlance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newOptions", "updateAppWidgetOptions", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "runLambda", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForReady", "Landroidx/glance/appwidget/GlanceAppWidget;", "Landroidx/glance/appwidget/AppWidgetId;", "Landroid/os/Bundle;", "Landroidx/glance/state/ConfigManager;", "Landroidx/compose/runtime/MutableState;", "glanceState", "Landroidx/compose/runtime/MutableState;", "options", "", "", "Landroidx/glance/action/LambdaAction;", "lambdas", "Ljava/util/Map;", "Landroid/widget/RemoteViews;", "<set-?>", "lastRemoteViews", "Landroid/widget/RemoteViews;", "getLastRemoteViews$glance_appwidget_release", "()Landroid/widget/RemoteViews;", "getLastRemoteViews$glance_appwidget_release$annotations", "()V", "Companion", "RunLambda", "UpdateAppWidgetOptions", "UpdateGlanceState", "WaitForReady", "configIsReady", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppWidgetSession extends Session {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ConfigManager configManager;

    @NotNull
    private final MutableState<Object> glanceState;

    @NotNull
    private final AppWidgetId id;
    private final Bundle initialOptions;

    @NotNull
    private Map<String, ? extends List<LambdaAction>> lambdas;
    private RemoteViews lastRemoteViews;

    @NotNull
    private final MutableState<Bundle> options;

    @NotNull
    private final GlanceAppWidget widget;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$Companion;", "", "()V", "DEBUG", "", "TAG", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$RunLambda;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RunLambda {

        @NotNull
        private final String key;

        public RunLambda(@NotNull String str) {
            this.key = str;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$UpdateAppWidgetOptions;", "", "newOptions", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getNewOptions", "()Landroid/os/Bundle;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpdateAppWidgetOptions {

        @NotNull
        private final Bundle newOptions;

        public UpdateAppWidgetOptions(@NotNull Bundle bundle) {
            this.newOptions = bundle;
        }

        @NotNull
        public final Bundle getNewOptions() {
            return this.newOptions;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$UpdateGlanceState;", "", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpdateGlanceState {

        @NotNull
        public static final UpdateGlanceState INSTANCE = new UpdateGlanceState();

        private UpdateGlanceState() {
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$processEmittableTree$1, reason: invalid class name */
    @d(c = "androidx.glance.appwidget.AppWidgetSession", f = "AppWidgetSession.kt", l = {124, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, Constants.EMVTag.TAG_9A_TRANSACTION_DATE}, m = "processEmittableTree")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return AppWidgetSession.this.processEmittableTree(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$processEvent$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.glance.appwidget.AppWidgetSession", f = "AppWidgetSession.kt", l = {Constants.TAG_EMVL3_VERSION, 189}, m = "processEvent")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19341 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19341(Continuation<? super C19341> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return AppWidgetSession.this.processEvent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$provideGlance$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19351 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AppWidgetSession this$0;

        /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C00571 extends u implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ AppWidgetSession this$0;

            /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass4 extends u implements Function0<Unit> {
                final /* synthetic */ AppWidgetSession this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(AppWidgetSession appWidgetSession) {
                    super(0);
                    this.this$0 = appWidgetSession;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3487invoke();
                    return Unit.f186387a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3487invoke() {
                    this.this$0.glanceState.getValue();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00571(Context context, AppWidgetSession appWidgetSession) {
                super(2);
                this.$context = context;
                this.this$0 = appWidgetSession;
            }

            private static final boolean invoke$lambda$2(State<Boolean> state) {
                return state.getValue().booleanValue();
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.f186387a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1688971311, i, -1, "androidx.glance.appwidget.AppWidgetSession.provideGlance.<anonymous>.<anonymous> (AppWidgetSession.kt:89)");
                }
                Context context = this.$context;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = AppWidgetUtilsKt.getAppWidgetManager(context);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                AppWidgetManager appWidgetManager = (AppWidgetManager) objRememberedValue;
                Context context2 = this.$context;
                AppWidgetSession appWidgetSession = this.this$0;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = DpSize.m3317boximpl(AppWidgetUtilsKt.appWidgetMinSize(context2.getResources().getDisplayMetrics(), appWidgetManager, appWidgetSession.id.getAppWidgetId()));
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                long packedValue = ((DpSize) objRememberedValue2).getPackedValue();
                Unit unit = null;
                State stateProduceState = SnapshotStateKt.produceState(Boolean.FALSE, new AppWidgetSession$provideGlance$1$1$configIsReady$2(this.this$0, appWidgetManager, this.$context, null), composer, 70);
                AppWidgetSession appWidgetSession2 = this.this$0;
                Context context3 = this.$context;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = AppWidgetUtilsKt.runGlance(appWidgetSession2.widget, context3, appWidgetSession2.id);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                State stateCollectAsState = SnapshotStateKt.collectAsState((Flow) objRememberedValue3, null, null, composer, 56, 2);
                if (!invoke$lambda$2(stateProduceState)) {
                    stateCollectAsState = null;
                }
                Function2 function2 = stateCollectAsState != null ? (Function2) stateCollectAsState.getValue() : null;
                composer.startReplaceableGroup(-1186217115);
                if (function2 != null) {
                    SizeBoxKt.m3497ForEachSizeeVKgIn8(this.this$0.widget.getSizeMode(), packedValue, function2, composer, 48);
                    unit = Unit.f186387a;
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-1186217263);
                if (unit == null) {
                    IgnoreResultKt.IgnoreResult(composer, 0);
                }
                composer.endReplaceableGroup();
                EffectsKt.SideEffect(new AnonymousClass4(this.this$0), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19351(Context context, AppWidgetSession appWidgetSession) {
            super(2);
            this.$context = context;
            this.this$0 = appWidgetSession;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Composer) obj2, ((Number) obj3).intValue());
            return Unit.f186387a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1784282257, i, -1, "androidx.glance.appwidget.AppWidgetSession.provideGlance.<anonymous> (AppWidgetSession.kt:83)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{androidx.glance.CompositionLocalsKt.getLocalContext().provides(this.$context), androidx.glance.CompositionLocalsKt.getLocalGlanceId().provides(this.this$0.id), CompositionLocalsKt.getLocalAppWidgetOptions().provides(this.this$0.options.getValue()), androidx.glance.CompositionLocalsKt.getLocalState().provides(this.this$0.glanceState.getValue())}, ComposableLambdaKt.composableLambda(composer, 1688971311, true, new C00571(this.$context, this.this$0)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetSession$waitForReady$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.glance.appwidget.AppWidgetSession", f = "AppWidgetSession.kt", l = {Constants.TAG_PCI_PED_CHECKSUM, Constants.TAG_EMV_L1_VERSION}, m = "waitForReady")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19361 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19361(Continuation<? super C19361> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return AppWidgetSession.this.waitForReady(this);
        }
    }

    public /* synthetic */ AppWidgetSession(GlanceAppWidget glanceAppWidget, AppWidgetId appWidgetId, Bundle bundle, ConfigManager configManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(glanceAppWidget, appWidgetId, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? GlanceState.INSTANCE : configManager);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(4:18|35|57|58)(1:(2:15|16)(3:17|52|53)))(1:19))(2:20|(2:22|23)(3:24|(1:27)|56))|28|60|29|(2:31|32)(2:38|39)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r15.save(r5) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        if (r7.widget.getErrorUiLayout() != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:
    
        androidx.glance.appwidget.AppWidgetUtilsKt.logException(r0);
        r0 = new android.widget.RemoteViews(r12.getPackageName(), r7.widget.getErrorUiLayout());
        r2.updateAppWidget(r7.id.getAppWidgetId(), r0);
        r7.lastRemoteViews = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0130, code lost:
    
        r5.L$0 = null;
        r5.L$1 = null;
        r5.L$2 = null;
        r5.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013c, code lost:
    
        if (r15.save(r5) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0141, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        r5.L$0 = r0;
        r5.L$1 = null;
        r5.L$2 = null;
        r5.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        if (r15.save(r5) != r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0157, code lost:
    
        r5.L$0 = null;
        r5.L$1 = null;
        r5.L$2 = null;
        r5.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0163, code lost:
    
        if (r15.save(r5) != r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // androidx.glance.session.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object processEmittableTree(@org.jetbrains.annotations.NotNull android.content.Context r21, @org.jetbrains.annotations.NotNull androidx.glance.EmittableWithChildren r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.processEmittableTree(android.content.Context, androidx.glance.EmittableWithChildren, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0159, code lost:
    
        if (r8.send(r9, r0) == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.session.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object processEvent(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull java.lang.Object r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.processEvent(android.content.Context, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.glance.session.Session
    @NotNull
    public Function2<Composer, Integer, Unit> provideGlance(@NotNull Context context) {
        return ComposableLambdaKt.composableLambdaInstance(-1784282257, true, new C19351(context, this));
    }

    public final Object runLambda(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSendEvent = sendEvent(new RunLambda(str), continuation);
        return objSendEvent == a.COROUTINE_SUSPENDED ? objSendEvent : Unit.f186387a;
    }

    public final Object updateAppWidgetOptions(@NotNull Bundle bundle, @NotNull Continuation<? super Unit> continuation) {
        Object objSendEvent = sendEvent(new UpdateAppWidgetOptions(bundle), continuation);
        return objSendEvent == a.COROUTINE_SUSPENDED ? objSendEvent : Unit.f186387a;
    }

    public final Object updateGlance(@NotNull Continuation<? super Unit> continuation) {
        Object objSendEvent = sendEvent(UpdateGlanceState.INSTANCE, continuation);
        return objSendEvent == a.COROUTINE_SUSPENDED ? objSendEvent : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7.j(r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForReady(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.glance.appwidget.AppWidgetSession.C19361
            if (r0 == 0) goto L13
            r0 = r7
            androidx.glance.appwidget.AppWidgetSession$waitForReady$1 r0 = (androidx.glance.appwidget.AppWidgetSession.C19361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.appwidget.AppWidgetSession$waitForReady$1 r0 = new androidx.glance.appwidget.AppWidgetSession$waitForReady$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)
            goto L5d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            java.lang.Object r2 = r0.L$0
            androidx.glance.appwidget.AppWidgetSession$WaitForReady r2 = (androidx.glance.appwidget.AppWidgetSession.WaitForReady) r2
            yhm.o.b(r7)
            goto L4e
        L3b:
            yhm.o.b(r7)
            androidx.glance.appwidget.AppWidgetSession$WaitForReady r2 = new androidx.glance.appwidget.AppWidgetSession$WaitForReady
            r2.<init>(r4, r5, r4)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r7 = r6.sendEvent(r2, r0)
            if (r7 != r1) goto L4e
            goto L5c
        L4e:
            ukm.u r7 = r2.getResume()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r7.j(r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AppWidgetSession.waitForReady(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$WaitForReady;", "", "Lukm/u;", "", "resume", "<init>", "(Lukm/u;)V", "Lukm/u;", "getResume", "()Lukm/u;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WaitForReady {

        @NotNull
        private final ukm.u resume;

        public WaitForReady(@NotNull ukm.u uVar) {
            this.resume = uVar;
        }

        @NotNull
        public final ukm.u getResume() {
            return this.resume;
        }

        public /* synthetic */ WaitForReady(ukm.u uVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? s.a(-1, null, null, 6) : uVar);
        }
    }

    @Override // androidx.glance.session.Session
    @NotNull
    public RemoteViewsRoot createRootEmittable() {
        return new RemoteViewsRoot(50);
    }

    public AppWidgetSession(@NotNull GlanceAppWidget glanceAppWidget, @NotNull AppWidgetId appWidgetId, Bundle bundle, @NotNull ConfigManager configManager) {
        super(AppWidgetUtilsKt.toSessionKey(appWidgetId));
        this.widget = glanceAppWidget;
        this.id = appWidgetId;
        this.initialOptions = bundle;
        this.configManager = configManager;
        this.glanceState = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.options = SnapshotStateKt.mutableStateOf(new Bundle(), SnapshotStateKt.neverEqualPolicy());
        this.lambdas = r0.g();
    }
}
