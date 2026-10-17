package com.appsflyer;

import ch.qos.logback.core.net.SyslogConstants;
import com.appsflyer.internal.AFg1bSDK;
import com.appsflyer.internal.AFg1cSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J+\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J3\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0015J#\u0010\u0016\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0013J+\u0010\u0016\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\tJ'\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$JG\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010$J!\u0010.\u001a\u00020\u00042\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010,\"\u00020\u0001¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00042\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010,\"\u00020\u0001¢\u0006\u0004\b0\u0010/J'\u00101\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010$J'\u00102\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010$R\u0017\u00104\u001a\u0006*\u00020303X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b4\u00105R\u0019\u00108\u001a\b\u0012\u0004\u0012\u00020\u000106X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b7\u00105"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1cSDK;", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFg1bSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFg1cSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "AFInAppEventParameterName", "Lkotlin/Lazy;", "", "values", "AFKeystoreWrapper", "<init>", "()V", "LogLevel"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFLogger extends AFg1cSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    private static final Lazy AFKeystoreWrapper = j.b(AnonymousClass9.AFKeystoreWrapper);

    @NotNull
    private static final Lazy AFInAppEventParameterName = j.b(AnonymousClass5.AFInAppEventType);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "AFInAppEventType", "(Lcom/appsflyer/internal/AFg1cSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ AFg1bSDK $AFInAppEventType;
        private /* synthetic */ String $valueOf;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventType = aFg1bSDK;
            this.$valueOf = str;
            this.$values = z;
        }

        public final void AFInAppEventType(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.i(this.$AFInAppEventType, this.$valueOf, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj2) {
            AFInAppEventType((AFg1cSDK) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "AFInAppEventType", "(Lcom/appsflyer/internal/AFg1cSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass10 extends u implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ AFg1bSDK $AFInAppEventType;
        private /* synthetic */ String $valueOf;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventType = aFg1bSDK;
            this.$valueOf = str;
            this.$values = z;
        }

        public final void AFInAppEventType(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.v(this.$AFInAppEventType, this.$valueOf, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj2) {
            AFInAppEventType((AFg1cSDK) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFg1cSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ AFg1bSDK $AFInAppEventType;
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventType = aFg1bSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventParameterName = z;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.d(this.$AFInAppEventType, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj2) {
            AFInAppEventParameterName((AFg1cSDK) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFg1cSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ AFg1bSDK $AFInAppEventParameterName;
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1bSDK aFg1bSDK, String str) {
            super(1);
            this.$AFInAppEventParameterName = aFg1bSDK;
            this.$AFKeystoreWrapper = str;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.force(this.$AFInAppEventParameterName, this.$AFKeystoreWrapper);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj2) {
            AFInAppEventParameterName((AFg1cSDK) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFg1cSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ String $AFInAppEventParameterName;
        private /* synthetic */ Throwable $AFInAppEventType;
        private /* synthetic */ boolean $AFKeystoreWrapper;
        private /* synthetic */ boolean $e;
        private /* synthetic */ boolean $registerClient;
        private /* synthetic */ boolean $valueOf;
        private /* synthetic */ AFg1bSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1bSDK aFg1bSDK, String str, Throwable th10, boolean z, boolean z3, boolean z4, boolean z6) {
            super(1);
            this.$values = aFg1bSDK;
            this.$AFInAppEventParameterName = str;
            this.$AFInAppEventType = th10;
            this.$AFKeystoreWrapper = z;
            this.$valueOf = z3;
            this.$registerClient = z4;
            this.$e = z6;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.e(this.$values, this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$AFKeystoreWrapper, this.$valueOf, this.$registerClient, this.$e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj2) {
            AFInAppEventParameterName((AFg1cSDK) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFInAppEventParameterName", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFInAppEventType = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFg1cSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass7 extends u implements Function1<AFg1cSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventType;
        private /* synthetic */ AFg1bSDK $valueOf;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AFg1bSDK aFg1bSDK, String str, boolean z) {
            super(1);
            this.$valueOf = aFg1bSDK;
            this.$values = str;
            this.$AFInAppEventType = z;
        }

        public final void AFKeystoreWrapper(@NotNull AFg1cSDK aFg1cSDK) {
            Intrinsics.checkNotNullParameter(aFg1cSDK, "");
            aFg1cSDK.w(this.$valueOf, this.$values, this.$AFInAppEventType);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj2) {
            AFKeystoreWrapper((AFg1cSDK) obj2);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/appsflyer/internal/AFg1cSDK;", "", "AFInAppEventParameterName", "()Ljava/util/Set;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass9 extends u implements Function0<Set<AFg1cSDK>> {
        public static final AnonymousClass9 AFKeystoreWrapper = new AnonymousClass9();

        public AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1cSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "AFInAppEventType", "I", "getLevel", "()I", "level", "p0", "<init>", "(Ljava/lang/String;II)V", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);


        /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFg1cSDK[] aFg1cSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1cSDKArr, "");
        Lazy lazy = AFKeystoreWrapper;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(d.y0(aFg1cSDKArr));
            Unit unit = Unit.f186387a;
        }
    }

    @yhm.d
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1bSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @yhm.d
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex4, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex4, "");
        AFg1cSDK.e$default(INSTANCE, AFg1bSDK.OTHER, message, ex4, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @yhm.d
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex4) {
        AFLogger aFLogger = INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.OTHER;
        if (errorLogMessage == null || d0.W(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex4 == null) {
            ex4 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1cSDK.e$default(aFLogger, aFg1bSDK, str, ex4, false, false, true, false, 64, null);
    }

    @yhm.d
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1bSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @yhm.d
    public static final void afLogForce(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFg1bSDK.OTHER, logMessage);
    }

    @yhm.d
    public static final void afRDLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1bSDK.OTHER, rdLogMessage, true);
    }

    @yhm.d
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1bSDK.OTHER, rdLogMessage, false);
    }

    @yhm.d
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFg1bSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFg1cSDK[] aFg1cSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1cSDKArr, "");
        Lazy lazy = AFKeystoreWrapper;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            a0.z((Set) value2, aFg1cSDKArr);
            Unit unit = Unit.f186387a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy lazy = AFKeystoreWrapper;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = lazy.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it8 = ((Set) value2).iterator();
                while (it8.hasNext()) {
                    function1.invoke((AFg1cSDK) it8.next());
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void d(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new androidx.view.d(new AnonymousClass2(tag2, msg, shouldRemoteDebug), 6));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void e(@NotNull AFg1bSDK tag2, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new androidx.view.d(new AnonymousClass4(tag2, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug), 6));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void force(@NotNull AFg1bSDK tag2, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new androidx.view.d(new AnonymousClass3(tag2, msg), 6));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void i(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new androidx.view.d(new AnonymousClass1(tag2, msg, shouldRemoteDebug), 6));
    }

    public final void registerClient(@NotNull AFg1cSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(client, 0));
    }

    public final void unregisterClient(@NotNull AFg1cSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(client, 1));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void v(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new androidx.view.d(new AnonymousClass10(tag2, msg, shouldRemoteDebug), 6));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void w(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new androidx.view.d(new AnonymousClass7(tag2, msg, shouldRemoteDebug), 6));
    }

    @yhm.d
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1bSDK.OTHER, debugLogMessage, true);
    }

    @yhm.d
    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1bSDK.OTHER, logMessage, true);
    }

    @yhm.d
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFg1cSDK.w$default(INSTANCE, AFg1bSDK.OTHER, warningLogMessage, false, 4, null);
    }

    @yhm.d
    public static final void afErrorLog(String errorLogMessage, Throwable ex4) {
        AFLogger aFLogger = INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.OTHER;
        if (errorLogMessage == null || d0.W(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex4 == null) {
            ex4 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1cSDK.e$default(aFLogger, aFg1bSDK, str, ex4, false, false, false, false, SyslogConstants.LOG_CLOCK, null);
    }

    @yhm.d
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex4, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.OTHER;
        if (errorLogMessage == null || d0.W(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex4 == null) {
            ex4 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1cSDK.e$default(aFLogger, aFg1bSDK, str, ex4, false, false, !disableReporting, false, 64, null);
    }

    @yhm.d
    public static final void afErrorLog(String errorLogMessage, Throwable ex4, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.OTHER;
        if (errorLogMessage == null || d0.W(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex4 == null) {
            ex4 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1cSDK.e$default(aFLogger, aFg1bSDK, str, ex4, false, printThrowable, false, false, 104, null);
    }

    @yhm.d
    public static final void afErrorLog(String errorLogMessage, Throwable ex4, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.OTHER;
        if (errorLogMessage == null || d0.W(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex4 == null) {
            ex4 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1cSDK.e$default(aFLogger, aFg1bSDK, str, ex4, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
