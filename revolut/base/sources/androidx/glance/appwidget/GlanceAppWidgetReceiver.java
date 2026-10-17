package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import fim.a;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8WX\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "context", "", "updateManager", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "", "appWidgetId", "Landroid/os/Bundle;", "newOptions", "onAppWidgetOptionsChanged", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V", "onDeleted", "(Landroid/content/Context;[I)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "Landroidx/glance/appwidget/GlanceAppWidget;", "getGlanceAppWidget", "()Landroidx/glance/appwidget/GlanceAppWidget;", "glanceAppWidget", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GlanceAppWidgetReceiver extends AppWidgetProvider {

    @NotNull
    private final CoroutineContext coroutineContext = p0.f264002b;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1", f = "GlanceAppWidgetReceiver.kt", l = {121}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Context $context;
        final /* synthetic */ Bundle $newOptions;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, int i, Bundle bundle, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$appWidgetId = i;
            this.$newOptions = bundle;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = GlanceAppWidgetReceiver.this.new AnonymousClass1(this.$context, this.$appWidgetId, this.$newOptions, continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                GlanceAppWidgetReceiver.this.updateManager((CoroutineScope) this.L$0, this.$context);
                GlanceAppWidget glanceAppWidget = GlanceAppWidgetReceiver.this.getGlanceAppWidget();
                Context context = this.$context;
                int i2 = this.$appWidgetId;
                Bundle bundle = this.$newOptions;
                this.label = 1;
                if (glanceAppWidget.resize$glance_appwidget_release(context, i2, bundle, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1", f = "GlanceAppWidgetReceiver.kt", l = {129}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19391 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ Context $context;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19391(Context context, int[] iArr, Continuation<? super C19391> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$appWidgetIds = iArr;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C19391 c19391 = GlanceAppWidgetReceiver.this.new C19391(this.$context, this.$appWidgetIds, continuation);
            c19391.L$0 = obj2;
            return c19391;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:13:0x005c). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L25
                if (r1 != r2) goto L1d
                int r1 = r8.I$1
                int r3 = r8.I$0
                java.lang.Object r4 = r8.L$2
                android.content.Context r4 = (android.content.Context) r4
                java.lang.Object r5 = r8.L$1
                androidx.glance.appwidget.GlanceAppWidgetReceiver r5 = (androidx.glance.appwidget.GlanceAppWidgetReceiver) r5
                java.lang.Object r6 = r8.L$0
                int[] r6 = (int[]) r6
                yhm.o.b(r9)
                goto L5c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                yhm.o.b(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                androidx.glance.appwidget.GlanceAppWidgetReceiver r1 = androidx.glance.appwidget.GlanceAppWidgetReceiver.this
                android.content.Context r3 = r8.$context
                androidx.glance.appwidget.GlanceAppWidgetReceiver.access$updateManager(r1, r9, r3)
                int[] r9 = r8.$appWidgetIds
                androidx.glance.appwidget.GlanceAppWidgetReceiver r1 = androidx.glance.appwidget.GlanceAppWidgetReceiver.this
                android.content.Context r3 = r8.$context
                int r4 = r9.length
                r5 = 0
                r6 = r5
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r6
                r6 = r9
            L41:
                if (r3 >= r1) goto L5e
                r9 = r6[r3]
                androidx.glance.appwidget.GlanceAppWidget r7 = r5.getGlanceAppWidget()
                r8.L$0 = r6
                r8.L$1 = r5
                r8.L$2 = r4
                r8.I$0 = r3
                r8.I$1 = r1
                r8.label = r2
                java.lang.Object r9 = r7.deleted$glance_appwidget_release(r4, r9, r8)
                if (r9 != r0) goto L5c
                return r0
            L5c:
                int r3 = r3 + r2
                goto L41
            L5e:
                kotlin.Unit r9 = kotlin.Unit.f186387a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetReceiver.C19391.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19391) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onUpdate$1", f = "GlanceAppWidgetReceiver.kt", l = {LDSFile.EF_DG12_TAG}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19401 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19401(Context context, int[] iArr, Continuation<? super C19401> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$appWidgetIds = iArr;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C19401 c19401 = GlanceAppWidgetReceiver.this.new C19401(this.$context, this.$appWidgetIds, continuation);
            c19401.L$0 = obj2;
            return c19401;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                GlanceAppWidgetReceiver.this.updateManager(coroutineScope, this.$context);
                int[] iArr = this.$appWidgetIds;
                GlanceAppWidgetReceiver glanceAppWidgetReceiver = GlanceAppWidgetReceiver.this;
                Context context = this.$context;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    arrayList.add(e0.g(coroutineScope, null, null, new GlanceAppWidgetReceiver$onUpdate$1$1$1(glanceAppWidgetReceiver, context, i2, null), 3));
                }
                this.label = 1;
                if (e0.h(arrayList, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19401) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetReceiver$updateManager$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$updateManager$1", f = "GlanceAppWidgetReceiver.kt", l = {137}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19411 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ GlanceAppWidgetReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19411(Context context, GlanceAppWidgetReceiver glanceAppWidgetReceiver, Continuation<? super C19411> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = glanceAppWidgetReceiver;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new C19411(this.$context, this.this$0, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    o.b(obj2);
                    Context context = this.$context;
                    GlanceAppWidgetReceiver glanceAppWidgetReceiver = this.this$0;
                    GlanceAppWidgetManager glanceAppWidgetManager = new GlanceAppWidgetManager(context);
                    GlanceAppWidget glanceAppWidget = glanceAppWidgetReceiver.getGlanceAppWidget();
                    this.label = 1;
                    if (glanceAppWidgetManager.updateReceiver$glance_appwidget_release(glanceAppWidgetReceiver, glanceAppWidget, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
            } catch (CancellationException unused) {
            } catch (Throwable th10) {
                AppWidgetUtilsKt.logException(th10);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19411) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateManager(CoroutineScope coroutineScope, Context context) {
        e0.C(coroutineScope, null, null, new C19411(context, this, null), 3);
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public abstract GlanceAppWidget getGlanceAppWidget();

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, @NotNull Bundle newOptions) {
        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new AnonymousClass1(context, appWidgetId, newOptions, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] appWidgetIds) {
        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new C19391(context, appWidgetIds, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: all -> 0x0049, CancellationException -> 0x00b7, TryCatch #3 {CancellationException -> 0x00b7, all -> 0x0049, blocks: (B:21:0x0042, B:28:0x0052, B:29:0x005a, B:30:0x005b, B:31:0x0063, B:32:0x0064, B:48:0x00b0, B:38:0x007a, B:40:0x008c, B:42:0x0097, B:44:0x00a3, B:43:0x009f, B:46:0x00a7, B:47:0x00af, B:35:0x006f), top: B:55:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[Catch: all -> 0x0049, CancellationException -> 0x00b7, TryCatch #3 {CancellationException -> 0x00b7, all -> 0x0049, blocks: (B:21:0x0042, B:28:0x0052, B:29:0x005a, B:30:0x005b, B:31:0x0063, B:32:0x0064, B:48:0x00b0, B:38:0x007a, B:40:0x008c, B:42:0x0097, B:44:0x00a3, B:43:0x009f, B:46:0x00a7, B:47:0x00af, B:35:0x006f), top: B:55:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r9.getAction()     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            if (r1 == 0) goto L1b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L6f
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L64
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1f
        L1b:
            r2 = r7
            r3 = r8
            goto Lb0
        L1f:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            if (r0 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            if (r5 == 0) goto L5b
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r9.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            if (r4 == r1) goto L52
            kotlin.coroutines.CoroutineContext r9 = r7.getCoroutineContext()     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1 r1 = new androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1     // Catch: java.lang.Throwable -> L4d java.util.concurrent.CancellationException -> L50
            r6 = 0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            androidx.glance.appwidget.CoroutineBroadcastReceiverKt.goAsync(r7, r9, r1)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            return
        L49:
            r0 = move-exception
        L4a:
            r8 = r0
            goto Lb4
        L4d:
            r0 = move-exception
            r2 = r7
            goto L4a
        L50:
            r2 = r7
            goto Lb7
        L52:
            r2 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            java.lang.String r9 = "Intent is missing AppWidgetId extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            throw r8     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
        L5b:
            r2 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            java.lang.String r9 = "Intent is missing ActionKey extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            throw r8     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
        L64:
            r2 = r7
            r3 = r8
            java.lang.String r8 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            if (r8 != 0) goto L7a
            goto Lb0
        L6f:
            r2 = r7
            r3 = r8
            java.lang.String r8 = "android.intent.action.LOCALE_CHANGED"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            if (r8 != 0) goto L7a
            goto Lb0
        L7a:
            android.appwidget.AppWidgetManager r8 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            if (r4 == 0) goto La7
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            boolean r1 = r9.hasExtra(r0)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            if (r1 == 0) goto L9f
            int[] r9 = r9.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            kotlin.jvm.internal.Intrinsics.h(r9)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            goto La3
        L9f:
            int[] r9 = r8.getAppWidgetIds(r5)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
        La3:
            r7.onUpdate(r3, r8, r9)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            return
        La7:
            java.lang.String r8 = "no canonical name"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            throw r9     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
        Lb0:
            super.onReceive(r3, r9)     // Catch: java.lang.Throwable -> L49 java.util.concurrent.CancellationException -> Lb7
            return
        Lb4:
            androidx.glance.appwidget.AppWidgetUtilsKt.logException(r8)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new C19401(context, appWidgetIds, null));
    }
}
