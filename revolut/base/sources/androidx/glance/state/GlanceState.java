package androidx.glance.state;

import androidx.datastore.core.DataStore;
import ch.qos.logback.core.net.SyslogConstants;
import gim.c;
import hlm.a;
import hlm.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ[\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/glance/state/GlanceState;", "Landroidx/glance/state/ConfigManager;", "<init>", "()V", "T", "Landroid/content/Context;", "context", "Landroidx/glance/state/GlanceStateDefinition;", "definition", "", "fileKey", "Landroidx/datastore/core/DataStore;", "getDataStore", "(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValue", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "updateBlock", "updateValue", "(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteStore", "Lhlm/a;", "mutex", "Lhlm/a;", "", "dataStores", "Ljava/util/Map;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceState implements ConfigManager {

    @NotNull
    public static final GlanceState INSTANCE = new GlanceState();

    @NotNull
    private static final a mutex = d.a();

    @NotNull
    private static final Map<String, DataStore<?>> dataStores = new LinkedHashMap();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.glance.state.GlanceState$deleteStore$1, reason: invalid class name */
    @gim.d(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {183}, m = "deleteStore")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceState.this.deleteStore(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.state.GlanceState$getDataStore$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {183, SyslogConstants.LOG_LOCAL2}, m = "getDataStore")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19481<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C19481(Continuation<? super C19481> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceState.this.getDataStore(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.state.GlanceState$getValue$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG}, m = "getValue")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19491<T> extends c {
        int label;
        /* synthetic */ Object result;

        public C19491(Continuation<? super C19491> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceState.this.getValue(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.state.GlanceState$updateValue$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", l = {122, 122}, m = "updateValue")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19501<T> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19501(Continuation<? super C19501> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return GlanceState.this.updateValue(null, null, null, null, this);
        }
    }

    private GlanceState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object getDataStore(android.content.Context r7, androidx.glance.state.GlanceStateDefinition<T> r8, java.lang.String r9, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStore<T>> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.glance.state.GlanceState.C19481
            if (r0 == 0) goto L13
            r0 = r10
            androidx.glance.state.GlanceState$getDataStore$1 r0 = (androidx.glance.state.GlanceState.C19481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.state.GlanceState$getDataStore$1 r0 = new androidx.glance.state.GlanceState$getDataStore$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L59
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.L$2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.L$1
            hlm.a r8 = (hlm.a) r8
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L37
            goto L8b
        L37:
            r7 = move-exception
            goto La2
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            java.lang.Object r7 = r0.L$3
            hlm.a r7 = (hlm.a) r7
            java.lang.Object r8 = r0.L$2
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$1
            androidx.glance.state.GlanceStateDefinition r8 = (androidx.glance.state.GlanceStateDefinition) r8
            java.lang.Object r2 = r0.L$0
            android.content.Context r2 = (android.content.Context) r2
            yhm.o.b(r10)
            r10 = r7
            r7 = r2
            goto L6f
        L59:
            yhm.o.b(r10)
            hlm.a r10 = androidx.glance.state.GlanceState.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r4
            java.lang.Object r2 = r10.lock(r5, r0)
            if (r2 != r1) goto L6f
            goto L87
        L6f:
            java.util.Map<java.lang.String, androidx.datastore.core.DataStore<?>> r2 = androidx.glance.state.GlanceState.dataStores     // Catch: java.lang.Throwable -> L92
            java.lang.Object r4 = r2.get(r9)     // Catch: java.lang.Throwable -> L92
            if (r4 != 0) goto L95
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L92
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L92
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L92
            r0.L$3 = r5     // Catch: java.lang.Throwable -> L92
            r0.label = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r8.getDataStore(r7, r9, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            r8 = r10
            r10 = r7
            r7 = r2
        L8b:
            r4 = r10
            androidx.datastore.core.DataStore r4 = (androidx.datastore.core.DataStore) r4     // Catch: java.lang.Throwable -> L37
            r7.put(r9, r4)     // Catch: java.lang.Throwable -> L37
            goto L96
        L92:
            r7 = move-exception
            r8 = r10
            goto La2
        L95:
            r8 = r10
        L96:
            java.lang.String r7 = "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>"
            kotlin.jvm.internal.Intrinsics.i(r4, r7)     // Catch: java.lang.Throwable -> L37
            androidx.datastore.core.DataStore r4 = (androidx.datastore.core.DataStore) r4     // Catch: java.lang.Throwable -> L37
            r8.unlock(r5)
            return r4
        La2:
            r8.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.getDataStore(android.content.Context, androidx.glance.state.GlanceStateDefinition, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteStore(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull androidx.glance.state.GlanceStateDefinition<?> r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.glance.state.GlanceState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.glance.state.GlanceState$deleteStore$1 r0 = (androidx.glance.state.GlanceState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.state.GlanceState$deleteStore$1 r0 = new androidx.glance.state.GlanceState$deleteStore$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$3
            hlm.a r6 = (hlm.a) r6
            java.lang.Object r7 = r0.L$2
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$1
            androidx.glance.state.GlanceStateDefinition r7 = (androidx.glance.state.GlanceStateDefinition) r7
            java.lang.Object r0 = r0.L$0
            android.content.Context r0 = (android.content.Context) r0
            yhm.o.b(r9)
            r9 = r6
            r6 = r0
            goto L59
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            yhm.o.b(r9)
            hlm.a r9 = androidx.glance.state.GlanceState.mutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            java.util.Map<java.lang.String, androidx.datastore.core.DataStore<?>> r0 = androidx.glance.state.GlanceState.dataStores     // Catch: java.lang.Throwable -> L6b
            r0.remove(r8)     // Catch: java.lang.Throwable -> L6b
            java.io.File r6 = r7.getLocation(r6, r8)     // Catch: java.lang.Throwable -> L6b
            r6.delete()     // Catch: java.lang.Throwable -> L6b
            r9.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6b:
            r6 = move-exception
            r9.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.deleteStore(android.content.Context, androidx.glance.state.GlanceStateDefinition, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.state.ConfigManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object getValue(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull androidx.glance.state.GlanceStateDefinition<T> r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.glance.state.GlanceState.C19491
            if (r0 == 0) goto L13
            r0 = r9
            androidx.glance.state.GlanceState$getValue$1 r0 = (androidx.glance.state.GlanceState.C19491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.state.GlanceState$getValue$1 r0 = new androidx.glance.state.GlanceState$getValue$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r9)
            goto L42
        L36:
            yhm.o.b(r9)
            r0.label = r4
            java.lang.Object r9 = r5.getDataStore(r6, r7, r8, r0)
            if (r9 != r1) goto L42
            goto L50
        L42:
            androidx.datastore.core.DataStore r9 = (androidx.datastore.core.DataStore) r9
            kotlinx.coroutines.flow.Flow r6 = r9.getData()
            r0.label = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.getValue(android.content.Context, androidx.glance.state.GlanceStateDefinition, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object updateValue(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull androidx.glance.state.GlanceStateDefinition<T> r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.glance.state.GlanceState.C19501
            if (r0 == 0) goto L13
            r0 = r10
            androidx.glance.state.GlanceState$updateValue$1 r0 = (androidx.glance.state.GlanceState.C19501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.state.GlanceState$updateValue$1 r0 = new androidx.glance.state.GlanceState$updateValue$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            r9 = r6
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            yhm.o.b(r10)
            goto L49
        L3b:
            yhm.o.b(r10)
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = r5.getDataStore(r6, r7, r8, r0)
            if (r10 != r1) goto L49
            goto L56
        L49:
            androidx.datastore.core.DataStore r10 = (androidx.datastore.core.DataStore) r10
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r10.updateData(r9, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.state.GlanceState.updateValue(android.content.Context, androidx.glance.state.GlanceStateDefinition, java.lang.String, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
