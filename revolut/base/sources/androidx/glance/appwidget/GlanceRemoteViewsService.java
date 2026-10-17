package androidx.glance.appwidget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "Companion", "GlanceRemoteViewsFactory", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceRemoteViewsService extends RemoteViewsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RemoteCollectionItemsInMemoryStore InMemoryStore = new RemoteCollectionItemsInMemoryStore();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService$Companion;", "", "<init>", "()V", "", "appWidgetId", "viewId", "", "sizeInfo", "Landroidx/glance/appwidget/RemoteCollectionItems;", "getItems", "(IILjava/lang/String;)Landroidx/glance/appwidget/RemoteCollectionItems;", "", "removeItems", "(IILjava/lang/String;)V", "EXTRA_SIZE_INFO", "Ljava/lang/String;", "EXTRA_VIEW_ID", "Landroidx/glance/appwidget/RemoteCollectionItemsInMemoryStore;", "InMemoryStore", "Landroidx/glance/appwidget/RemoteCollectionItemsInMemoryStore;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RemoteCollectionItems getItems(int appWidgetId, int viewId, String sizeInfo) {
            RemoteCollectionItems items;
            synchronized (GlanceRemoteViewsService.InMemoryStore) {
                items = GlanceRemoteViewsService.InMemoryStore.getItems(appWidgetId, viewId, sizeInfo);
            }
            return items;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeItems(int appWidgetId, int viewId, String sizeInfo) {
            synchronized (GlanceRemoteViewsService.InMemoryStore) {
                GlanceRemoteViewsService.InMemoryStore.removeItems(appWidgetId, viewId, sizeInfo);
                Unit unit = Unit.f186387a;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0019\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService$GlanceRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "appWidgetId", "", "viewId", "size", "", "(Landroid/content/Context;IILjava/lang/String;)V", "getCount", "getItemId", "", "position", "getLoadingView", "", "getViewAt", "Landroid/widget/RemoteViews;", "getViewTypeCount", "hasStableIds", "", "items", "Landroidx/glance/appwidget/RemoteCollectionItems;", "loadData", "", "onCreate", "onDataSetChanged", "onDestroy", "startSessionAndWaitUntilReady", "glanceId", "Landroidx/glance/appwidget/AppWidgetId;", "(Landroidx/glance/appwidget/AppWidgetId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GlanceRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
        private final int appWidgetId;

        @NotNull
        private final Context context;

        @NotNull
        private final String size;
        private final int viewId;

        public GlanceRemoteViewsFactory(@NotNull Context context, int i, int i2, @NotNull String str) {
            this.context = context;
            this.appWidgetId = i;
            this.viewId = i2;
            this.size = str;
        }

        private final RemoteCollectionItems items() {
            return GlanceRemoteViewsService.INSTANCE.getItems(this.appWidgetId, this.viewId, this.size);
        }

        private final void loadData() throws Throwable {
            e0.E(g.f186406a, new GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        
            if (r14.waitForReady(r0) == r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object startSessionAndWaitUntilReady(androidx.glance.appwidget.AppWidgetId r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1
                if (r0 == 0) goto L13
                r0 = r15
                androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 r0 = (androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 r0 = new androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.result
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L3b
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2b
                yhm.o.b(r15)
                goto L98
            L2b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L33:
                java.lang.Object r14 = r0.L$0
                androidx.glance.appwidget.AppWidgetSession r14 = (androidx.glance.appwidget.AppWidgetSession) r14
                yhm.o.b(r15)
                goto L8d
            L3b:
                yhm.o.b(r15)
                android.content.Context r15 = r13.context
                android.appwidget.AppWidgetManager r15 = android.appwidget.AppWidgetManager.getInstance(r15)
                int r2 = r13.appWidgetId
                android.appwidget.AppWidgetProviderInfo r15 = r15.getAppWidgetInfo(r2)
                if (r15 == 0) goto L4f
                android.content.ComponentName r2 = r15.provider
                goto L50
            L4f:
                r2 = r5
            L50:
                if (r2 == 0) goto L9b
                android.content.ComponentName r15 = r15.provider
                java.lang.String r15 = r15.getClassName()
                java.lang.Class r15 = java.lang.Class.forName(r15)
                java.lang.reflect.Constructor r15 = r15.getDeclaredConstructor(r5)
                java.lang.Object r15 = r15.newInstance(r5)
                java.lang.String r2 = "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver"
                kotlin.jvm.internal.Intrinsics.i(r15, r2)
                androidx.glance.appwidget.GlanceAppWidgetReceiver r15 = (androidx.glance.appwidget.GlanceAppWidgetReceiver) r15
                androidx.glance.appwidget.GlanceAppWidget r7 = r15.getGlanceAppWidget()
                androidx.glance.appwidget.AppWidgetSession r6 = new androidx.glance.appwidget.AppWidgetSession
                r11 = 12
                r12 = 0
                r9 = 0
                r10 = 0
                r8 = r14
                r6.<init>(r7, r8, r9, r10, r11, r12)
                androidx.glance.session.SessionManager r14 = androidx.glance.session.SessionManagerKt.getGlanceSessionManager()
                android.content.Context r15 = r13.context
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r14 = r14.startSession(r15, r6, r0)
                if (r14 != r1) goto L8c
                goto L97
            L8c:
                r14 = r6
            L8d:
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r14 = r14.waitForReady(r0)
                if (r14 != r1) goto L98
            L97:
                return r1
            L98:
                kotlin.Unit r14 = kotlin.Unit.f186387a
                return r14
            L9b:
                kotlin.Unit r14 = kotlin.Unit.f186387a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory.startSessionAndWaitUntilReady(androidx.glance.appwidget.AppWidgetId, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getCount() {
            return items().getItemCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public long getItemId(int position) {
            try {
                return items().getItemId(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public Void getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        @NotNull
        public RemoteViews getViewAt(int position) {
            try {
                return items().getItemView(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.context.getPackageName(), R$layout.glance_invalid_list_item);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getViewTypeCount() {
            return items().get_viewTypeCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public boolean hasStableIds() {
            return items().getHasStableIds();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onCreate() {
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDataSetChanged() throws Throwable {
            loadData();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDestroy() {
            GlanceRemoteViewsService.INSTANCE.removeItems(this.appWidgetId, this.viewId, this.size);
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return (RemoteViews) getLoadingView();
        }
    }

    @Override // android.widget.RemoteViewsService
    @NotNull
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            throw new IllegalStateException("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalStateException("No size info was present in the intent");
        }
        return new GlanceRemoteViewsFactory(this, intExtra, intExtra2, stringExtra);
    }
}
