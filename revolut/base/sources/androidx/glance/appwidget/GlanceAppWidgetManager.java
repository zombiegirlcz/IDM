package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.glance.GlanceId;
import ch.qos.logback.core.CoreConstants;
import fim.a;
import gim.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import sim.d;
import yhm.j;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0019\u001a\u00020\u0016\"\b\b\u0000\u0010\u0011*\u00020\u0010\"\b\b\u0001\u0010\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\"\b\b\u0000\u0010\u001a*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u0016H\u0080@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getOrCreateDataStore", "()Landroidx/datastore/core/DataStore;", "prefs", "Landroidx/glance/appwidget/GlanceAppWidgetManager$State;", "createState", "(Landroidx/datastore/preferences/core/Preferences;)Landroidx/glance/appwidget/GlanceAppWidgetManager$State;", "getState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "R", "Landroidx/glance/appwidget/GlanceAppWidget;", "P", "receiver", "provider", "", "updateReceiver$glance_appwidget_release", "(Landroidx/glance/appwidget/GlanceAppWidgetReceiver;Landroidx/glance/appwidget/GlanceAppWidget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateReceiver", "T", "Ljava/lang/Class;", "", "Landroidx/glance/GlanceId;", "getGlanceIds", "(Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glanceId", "", "getAppWidgetId", "(Landroidx/glance/GlanceId;)I", "cleanReceivers$glance_appwidget_release", "cleanReceivers", "Landroid/content/Context;", "Landroid/appwidget/AppWidgetManager;", "kotlin.jvm.PlatformType", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "dataStore$delegate", "Lkotlin/Lazy;", "getDataStore", "dataStore", "Companion", "State", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceAppWidgetManager {
    private static DataStore<Preferences> dataStoreSingleton;
    private final AppWidgetManager appWidgetManager;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataStore = j.b(new GlanceAppWidgetManager$dataStore$2(this));

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final d appManagerDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("GlanceAppWidgetManager", null, null, null, 14, null);

    @NotNull
    private static final Preferences.Key<Set<String>> providersKey = PreferencesKeys.stringSetKey("list::Providers");

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$Companion;", "", "<init>", "()V", "", "provider", "Landroidx/datastore/preferences/core/Preferences$Key;", "providerKey", "(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "appManagerDataStore$delegate", "Lsim/d;", "getAppManagerDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "appManagerDataStore", "dataStoreSingleton", "Landroidx/datastore/core/DataStore;", "", "providersKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {o0.f186429a.k(new j0(h.NO_RECEIVER, Companion.class, "appManagerDataStore", "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore<Preferences> getAppManagerDataStore(Context context) {
            return (DataStore) GlanceAppWidgetManager.appManagerDataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Preferences.Key<String> providerKey(String provider) {
            return PreferencesKeys.stringKey("provider:" + provider);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetManager$getGlanceIds$1, reason: invalid class name */
    @gim.d(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", l = {102}, m = "getGlanceIds")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T extends GlanceAppWidget> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceAppWidgetManager.this.getGlanceIds(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceAppWidgetManager$getState$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.glance.appwidget.GlanceAppWidgetManager", f = "GlanceAppWidgetManager.kt", l = {96}, m = "getState")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19381 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19381(Continuation<? super C19381> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceAppWidgetManager.this.getState(this);
        }
    }

    public GlanceAppWidgetManager(@NotNull Context context) {
        this.context = context;
        this.appWidgetManager = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final State createState(Preferences prefs) {
        String packageName = this.context.getPackageName();
        Set<String> set = (Set) prefs.get(providersKey);
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (set == null) {
            return new State(map, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            ComponentName componentName = new ComponentName(packageName, str);
            String str2 = (String) prefs.get(Companion.providerKey(str));
            Pair pair = str2 == null ? null : new Pair(componentName, str2);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new State(r0.t(arrayList));
    }

    private final DataStore<Preferences> getDataStore() {
        return (DataStore) this.dataStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStore<Preferences> getOrCreateDataStore() {
        DataStore<Preferences> appManagerDataStore;
        Companion companion = Companion;
        synchronized (companion) {
            appManagerDataStore = dataStoreSingleton;
            if (appManagerDataStore == null) {
                appManagerDataStore = companion.getAppManagerDataStore(this.context);
                dataStoreSingleton = appManagerDataStore;
            }
        }
        return appManagerDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getState(kotlin.coroutines.Continuation<? super androidx.glance.appwidget.GlanceAppWidgetManager.State> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.glance.appwidget.GlanceAppWidgetManager.C19381
            if (r0 == 0) goto L13
            r0 = r5
            androidx.glance.appwidget.GlanceAppWidgetManager$getState$1 r0 = (androidx.glance.appwidget.GlanceAppWidgetManager.C19381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.appwidget.GlanceAppWidgetManager$getState$1 r0 = new androidx.glance.appwidget.GlanceAppWidgetManager$getState$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.glance.appwidget.GlanceAppWidgetManager r0 = (androidx.glance.appwidget.GlanceAppWidgetManager) r0
            yhm.o.b(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            androidx.datastore.core.DataStore r5 = r4.getDataStore()
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = vkm.q.z(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            if (r5 == 0) goto L56
            androidx.glance.appwidget.GlanceAppWidgetManager$State r5 = r0.createState(r5)
            if (r5 != 0) goto L55
            goto L56
        L55:
            return r5
        L56:
            androidx.glance.appwidget.GlanceAppWidgetManager$State r5 = new androidx.glance.appwidget.GlanceAppWidgetManager$State
            r0 = 3
            r1 = 0
            r5.<init>(r1, r1, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetManager.getState(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object cleanReceivers$glance_appwidget_release(@NotNull Continuation<? super Unit> continuation) {
        String packageName = this.context.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.appWidgetManager.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : installedProviders) {
            if (Intrinsics.f(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it8.next()).provider.getClassName());
        }
        Object objUpdateData = getDataStore().updateData(new GlanceAppWidgetManager$cleanReceivers$2(d0.i1(arrayList2), null), continuation);
        return objUpdateData == a.COROUTINE_SUSPENDED ? objUpdateData : Unit.f186387a;
    }

    public final int getAppWidgetId(@NotNull GlanceId glanceId) {
        if (glanceId instanceof AppWidgetId) {
            return ((AppWidgetId) glanceId).getAppWidgetId();
        }
        throw new IllegalArgumentException("This method only accepts App Widget Glance Id");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends androidx.glance.appwidget.GlanceAppWidget> java.lang.Object getGlanceIds(@org.jetbrains.annotations.NotNull java.lang.Class<T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.glance.GlanceId>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.glance.appwidget.GlanceAppWidgetManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.glance.appwidget.GlanceAppWidgetManager$getGlanceIds$1 r0 = (androidx.glance.appwidget.GlanceAppWidgetManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.appwidget.GlanceAppWidgetManager$getGlanceIds$1 r0 = new androidx.glance.appwidget.GlanceAppWidgetManager$getGlanceIds$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.L$1
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.Object r0 = r0.L$0
            androidx.glance.appwidget.GlanceAppWidgetManager r0 = (androidx.glance.appwidget.GlanceAppWidgetManager) r0
            yhm.o.b(r9)
            goto L48
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r7.getState(r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            r0 = r7
        L48:
            androidx.glance.appwidget.GlanceAppWidgetManager$State r9 = (androidx.glance.appwidget.GlanceAppWidgetManager.State) r9
            java.lang.String r8 = r8.getCanonicalName()
            if (r8 == 0) goto L98
            java.util.Map r9 = r9.getProviderNameToReceivers()
            java.lang.Object r8 = r9.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L5f
            zhm.f0 r8 = zhm.f0.f322471a
            return r8
        L5f:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L6a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            android.appwidget.AppWidgetManager r2 = r0.appWidgetManager
            int[] r1 = r2.getAppWidgetIds(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        L84:
            if (r4 >= r3) goto L93
            r5 = r1[r4]
            androidx.glance.appwidget.AppWidgetId r6 = new androidx.glance.appwidget.AppWidgetId
            r6.<init>(r5)
            r2.add(r6)
            int r4 = r4 + 1
            goto L84
        L93:
            zhm.a0.x(r2, r9)
            goto L6a
        L97:
            return r9
        L98:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "no canonical provider name"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetManager.getGlanceIds(java.lang.Class, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R extends GlanceAppWidgetReceiver, P extends GlanceAppWidget> Object updateReceiver$glance_appwidget_release(@NotNull R r2, @NotNull P p2, @NotNull Continuation<? super Unit> continuation) {
        String canonicalName = r2.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = p2.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objUpdateData = getDataStore().updateData(new GlanceAppWidgetManager$updateReceiver$2(canonicalName, canonicalName2, null), continuation);
        return objUpdateData == a.COROUTINE_SUSPENDED ? objUpdateData : Unit.f186387a;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0002¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetManager$State;", "", "", "Landroid/content/ComponentName;", "", "receiverToProviderName", "", "providerNameToReceivers", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getReceiverToProviderName", "()Ljava/util/Map;", "getProviderNameToReceivers", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class State {

        @NotNull
        private final Map<String, List<ComponentName>> providerNameToReceivers;

        @NotNull
        private final Map<ComponentName, String> receiverToProviderName;

        /* JADX WARN: Multi-variable type inference failed */
        public State(@NotNull Map<ComponentName, String> map, @NotNull Map<String, ? extends List<ComponentName>> map2) {
            this.receiverToProviderName = map;
            this.providerNameToReceivers = map2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.f(this.receiverToProviderName, state.receiverToProviderName) && Intrinsics.f(this.providerNameToReceivers, state.providerNameToReceivers);
        }

        @NotNull
        public final Map<String, List<ComponentName>> getProviderNameToReceivers() {
            return this.providerNameToReceivers;
        }

        public int hashCode() {
            return this.providerNameToReceivers.hashCode() + (this.receiverToProviderName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "State(receiverToProviderName=" + this.receiverToProviderName + ", providerNameToReceivers=" + this.providerNameToReceivers + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ State(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? r0.g() : map, (i & 2) != 0 ? r0.g() : map2);
        }

        public State(@NotNull Map<ComponentName, String> map) {
            this(map, GlanceAppWidgetManagerKt.reverseMapping(map));
        }
    }
}
