package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1xSDK {

    @NotNull
    final Intent valueOf;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1xSDK$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventType", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Boolean> {
        private /* synthetic */ String $AFInAppEventType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$AFInAppEventType = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1xSDK.this.valueOf.hasExtra(this.$AFInAppEventType));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1xSDK$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "values", "()Landroid/content/Intent;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<Intent> {
        private /* synthetic */ long $AFInAppEventType;
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, long j2) {
            super(0);
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventType = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1xSDK.this.valueOf.putExtra(this.$AFKeystoreWrapper, this.$AFInAppEventType);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1xSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "AFInAppEventParameterName", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function0 {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1xSDK.this.valueOf.getParcelableExtra(this.$valueOf);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1xSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFInAppEventType", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function0<String> {
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str) {
            super(0);
            this.$AFKeystoreWrapper = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1xSDK.this.valueOf.getStringExtra(this.$AFKeystoreWrapper);
        }
    }

    public AFj1xSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.valueOf = intent;
    }

    public final boolean AFInAppEventParameterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str);
        StringBuilder sb6 = new StringBuilder("Error while trying to check presence of ");
        sb6.append(str);
        sb6.append(" extra from intent");
        Boolean bool = (Boolean) AFInAppEventType(anonymousClass1, sb6.toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T AFInAppEventType(kotlin.jvm.functions.Function0<? extends T> r8, java.lang.String r9, T r10, boolean r11) {
        /*
            r7 = this;
            android.content.Intent r0 = r7.valueOf
            monitor-enter(r0)
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> La
            java.lang.Object r1 = r8.invoke()     // Catch: java.lang.Throwable -> La
            goto L11
        La:
            r1 = move-exception
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L88
            yhm.n r1 = yhm.o.a(r1)     // Catch: java.lang.Throwable -> L88
        L11:
            java.lang.Class<java.util.ConcurrentModificationException> r2 = java.util.ConcurrentModificationException.class
            kotlin.jvm.internal.p0 r3 = kotlin.jvm.internal.o0.f186429a     // Catch: java.lang.Throwable -> L88
            kotlin.reflect.KClass r2 = r3.b(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.Class<java.lang.ArrayIndexOutOfBoundsException> r4 = java.lang.ArrayIndexOutOfBoundsException.class
            kotlin.reflect.KClass r4 = r3.b(r4)     // Catch: java.lang.Throwable -> L88
            r5 = 2
            kotlin.reflect.KClass[] r5 = new kotlin.reflect.KClass[r5]     // Catch: java.lang.Throwable -> L88
            r6 = 0
            r5[r6] = r2     // Catch: java.lang.Throwable -> L88
            r2 = 1
            r5[r2] = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Throwable r4 = yhm.m.a(r1)     // Catch: java.lang.Throwable -> L88
            if (r4 != 0) goto L2f
            goto L54
        L2f:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L44
            kotlin.reflect.KClass r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L44
            boolean r1 = kotlin.collections.d.I(r5, r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L4c
            if (r11 == 0) goto L46
            java.lang.Object r8 = r7.AFInAppEventType(r8, r9, r10, r6)     // Catch: java.lang.Throwable -> L44
            goto L4a
        L44:
            r8 = move-exception
            goto L4d
        L46:
            com.appsflyer.AFLogger.afErrorLog(r9, r4, r6, r6)     // Catch: java.lang.Throwable -> L44
            r8 = r10
        L4a:
            r1 = r8
            goto L54
        L4c:
            throw r4     // Catch: java.lang.Throwable -> L44
        L4d:
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L88
            yhm.n r8 = yhm.o.a(r8)     // Catch: java.lang.Throwable -> L88
            goto L4a
        L54:
            java.lang.Class<java.lang.RuntimeException> r8 = java.lang.RuntimeException.class
            kotlin.jvm.internal.p0 r11 = kotlin.jvm.internal.o0.f186429a     // Catch: java.lang.Throwable -> L88
            kotlin.reflect.KClass r8 = r11.b(r8)     // Catch: java.lang.Throwable -> L88
            kotlin.reflect.KClass[] r2 = new kotlin.reflect.KClass[r2]     // Catch: java.lang.Throwable -> L88
            r2[r6] = r8     // Catch: java.lang.Throwable -> L88
            java.lang.Throwable r8 = yhm.m.a(r1)     // Catch: java.lang.Throwable -> L88
            if (r8 != 0) goto L67
            goto L83
        L67:
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L79
            kotlin.reflect.KClass r11 = r11.b(r1)     // Catch: java.lang.Throwable -> L79
            boolean r11 = kotlin.collections.d.I(r2, r11)     // Catch: java.lang.Throwable -> L79
            if (r11 == 0) goto L7b
            com.appsflyer.AFLogger.afErrorLog(r9, r8, r6, r6)     // Catch: java.lang.Throwable -> L79
            goto L82
        L79:
            r8 = move-exception
            goto L7c
        L7b:
            throw r8     // Catch: java.lang.Throwable -> L79
        L7c:
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L88
            yhm.n r10 = yhm.o.a(r8)     // Catch: java.lang.Throwable -> L88
        L82:
            r1 = r10
        L83:
            yhm.o.b(r1)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r0)
            return r1
        L88:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1xSDK.AFInAppEventType(kotlin.jvm.functions.Function0, java.lang.String, java.lang.Object, boolean):java.lang.Object");
    }

    public final String valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(str);
        StringBuilder sb6 = new StringBuilder("Error while trying to read ");
        sb6.append(str);
        sb6.append(" extra from intent");
        return (String) AFInAppEventType(anonymousClass5, sb6.toString(), null, true);
    }

    public final Intent valueOf(@NotNull String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, j2);
        StringBuilder sb6 = new StringBuilder("Error while trying to write ");
        sb6.append(str);
        sb6.append(" extra to intent");
        return (Intent) AFInAppEventType(anonymousClass2, sb6.toString(), null, true);
    }
}
