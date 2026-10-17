package com.onfido.android.sdk.capture.internal.util.logging;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import p.a;
import vc.s;
import yhm.f;
import yhm.j;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003-./B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016J5\u0010\u0017\u001a(\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u0019 \u001a*\u0014\u0012\u000e\b\u0001\u0012\n \u001a*\u0004\u0018\u00010\u00190\u0019\u0018\u00010\u00180\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\nH\u0001¢\u0006\u0002\b\u001eJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0010H\u0016J,\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\r\u0010(\u001a\u00020$H\u0000¢\u0006\u0002\b)J4\u0010*\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u0015H\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0010H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree;", "Lcom/onfido/android/sdk/capture/internal/util/logging/Timber$DebugTree;", "repository", "Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerRepository;", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "remoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "(Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerRepository;Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "isRemoteLoggingEnabled", "", "()Z", "isRemoteLoggingEnabled$delegate", "Lkotlin/Lazy;", "remoteEnabledLogPriorities", "", "", "getRemoteEnabledLogPriorities", "()Ljava/util/Set;", "remoteEnabledLogPriorities$delegate", "getLogInfo", "Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree$LogInfo;", "getLogInfo$onfido_capture_sdk_core_release", "getStackTraces", "", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "getStackTraces$onfido_capture_sdk_core_release", "()[Ljava/lang/StackTraceElement;", "isInDebug", "isInDebug$onfido_capture_sdk_core_release", "isLoggable", "tag", "", "priority", "log", "", "message", "t", "", "onUproot", "onUproot$onfido_capture_sdk_core_release", "sendToRemote", "logInfo", "shouldSendToRemote", "Companion", "LogInfo", "RemoteSupportedLevels", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RemoteLoggerTree extends Timber.DebugTree {
    private static final int PRIORITY_NOT_DEFINED = -1;

    /* JADX INFO: renamed from: isRemoteLoggingEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isRemoteLoggingEnabled;

    /* JADX INFO: renamed from: remoteEnabledLogPriorities$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteEnabledLogPriorities;

    @NotNull
    private final LoggerRepository repository;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private static final String LINE_FIELD_KEY = "line";

    @NotNull
    private static final String METHOD_FIELD_KEY = "method";

    @NotNull
    private static final String THROWABLE_FIELD_KEY = "exception";

    @NotNull
    private static final String MESSAGE_FIELD_KEY = "message";

    @NotNull
    private static final String FILE_FIELD_KEY = "file";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> ignoredClasses = v.k(RemoteLoggerTree.class.getName(), Timber.class.getName(), Timber.Tree.class.getName(), Timber.DebugTree.class.getName(), Timber.Companion.class.getName());

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\u00020\u0004*\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u00040\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree$Companion;", "", "()V", "FILE_FIELD_KEY", "", "LINE_FIELD_KEY", "MESSAGE_FIELD_KEY", "METHOD_FIELD_KEY", "PRIORITY_NOT_DEFINED", "", "THROWABLE_FIELD_KEY", "ignoredClasses", "", "kotlin.jvm.PlatformType", "getIgnoredClasses", "()Ljava/util/List;", "mapToPriority", "levelName", "toLogInfo", "Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree$LogInfo;", "trace", "Ljava/lang/StackTraceElement;", "toPriorityName", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final int mapToPriority(String levelName) {
            String upperCase = levelName.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case 2251950:
                    return !upperCase.equals("INFO") ? -1 : 4;
                case 2656902:
                    return !upperCase.equals("WARN") ? -1 : 5;
                case 64921139:
                    return !upperCase.equals("DEBUG") ? -1 : 3;
                case 66247144:
                    return !upperCase.equals("ERROR") ? -1 : 6;
                case 1069090146:
                    return !upperCase.equals("VERBOSE") ? -1 : 2;
                case 1940088646:
                    return !upperCase.equals("ASSERT") ? -1 : 7;
                default:
                    return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toPriorityName(int i) {
            switch (i) {
                case 2:
                    return "VERBOSE";
                case 3:
                    return "DEBUG";
                case 4:
                    return "INFO";
                case 5:
                    return "WARN";
                case 6:
                    return "ERROR";
                case 7:
                    return "ASSERT";
                default:
                    return "NOT DEFINED";
            }
        }

        @NotNull
        public final List<String> getIgnoredClasses() {
            return RemoteLoggerTree.ignoredClasses;
        }

        @NotNull
        public final LogInfo toLogInfo(@NotNull StackTraceElement trace) {
            Intrinsics.checkNotNullParameter(trace, "trace");
            String fileName = trace.getFileName();
            if (fileName == null) {
                fileName = "";
            }
            String methodName = trace.getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "getMethodName(...)");
            return new LogInfo(fileName, methodName, trace.getLineNumber());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree$LogInfo;", "", "file", "", "method", "line", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getFile", "()Ljava/lang/String;", "getLine", "()I", "getMethod", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogInfo {

        @NotNull
        private final String file;
        private final int line;

        @NotNull
        private final String method;

        public LogInfo(@NotNull String file, @NotNull String method, int i) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(method, "method");
            this.file = file;
            this.method = method;
            this.line = i;
        }

        public static /* synthetic */ LogInfo copy$default(LogInfo logInfo, String str, String str2, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                str = logInfo.file;
            }
            if ((i2 & 2) != 0) {
                str2 = logInfo.method;
            }
            if ((i2 & 4) != 0) {
                i = logInfo.line;
            }
            return logInfo.copy(str, str2, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFile() {
            return this.file;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getLine() {
            return this.line;
        }

        @NotNull
        public final LogInfo copy(@NotNull String file, @NotNull String method, int line) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(method, "method");
            return new LogInfo(file, method, line);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogInfo)) {
                return false;
            }
            LogInfo logInfo = (LogInfo) other;
            return Intrinsics.f(this.file, logInfo.file) && Intrinsics.f(this.method, logInfo.method) && this.line == logInfo.line;
        }

        @NotNull
        public final String getFile() {
            return this.file;
        }

        public final int getLine() {
            return this.line;
        }

        @NotNull
        public final String getMethod() {
            return this.method;
        }

        public int hashCode() {
            return Integer.hashCode(this.line) + a.c(this.file.hashCode() * 31, 31, this.method);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("LogInfo(file=");
            sb6.append(this.file);
            sb6.append(", method=");
            sb6.append(this.method);
            sb6.append(", line=");
            return j6.a.t(sb6, this.line, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/RemoteLoggerTree$RemoteSupportedLevels;", "", "(Ljava/lang/String;I)V", "ERROR", "WARN", "DEBUG", "VERBOSE", "INFO", "ASSERT", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RemoteSupportedLevels {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RemoteSupportedLevels[] $VALUES;
        public static final RemoteSupportedLevels ERROR = new RemoteSupportedLevels("ERROR", 0);
        public static final RemoteSupportedLevels WARN = new RemoteSupportedLevels("WARN", 1);
        public static final RemoteSupportedLevels DEBUG = new RemoteSupportedLevels("DEBUG", 2);
        public static final RemoteSupportedLevels VERBOSE = new RemoteSupportedLevels("VERBOSE", 3);
        public static final RemoteSupportedLevels INFO = new RemoteSupportedLevels("INFO", 4);
        public static final RemoteSupportedLevels ASSERT = new RemoteSupportedLevels("ASSERT", 5);

        private static final /* synthetic */ RemoteSupportedLevels[] $values() {
            return new RemoteSupportedLevels[]{ERROR, WARN, DEBUG, VERBOSE, INFO, ASSERT};
        }

        static {
            RemoteSupportedLevels[] remoteSupportedLevelsArr$values = $values();
            $VALUES = remoteSupportedLevelsArr$values;
            $ENTRIES = s.n(remoteSupportedLevelsArr$values);
        }

        private RemoteSupportedLevels(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static RemoteSupportedLevels valueOf(String str) {
            return (RemoteSupportedLevels) Enum.valueOf(RemoteSupportedLevels.class, str);
        }

        public static RemoteSupportedLevels[] values() {
            return (RemoteSupportedLevels[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.util.logging.RemoteLoggerTree$isRemoteLoggingEnabled$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<Boolean> {
        final /* synthetic */ OnfidoRemoteConfig $remoteConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OnfidoRemoteConfig onfidoRemoteConfig) {
            super(0);
            this.$remoteConfig = onfidoRemoteConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.$remoteConfig.getLoggerConfiguration().isEnabled());
        }
    }

    public RemoteLoggerTree(@NotNull LoggerRepository repository, @NotNull TimeProvider timeProvider, @NotNull OnfidoRemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.repository = repository;
        this.timeProvider = timeProvider;
        this.isRemoteLoggingEnabled = j.b(new AnonymousClass2(remoteConfig));
        this.remoteEnabledLogPriorities = j.b(new RemoteLoggerTree$remoteEnabledLogPriorities$2(remoteConfig));
    }

    private final Set<Integer> getRemoteEnabledLogPriorities() {
        return (Set) this.remoteEnabledLogPriorities.getValue();
    }

    private final boolean isRemoteLoggingEnabled() {
        return ((Boolean) this.isRemoteLoggingEnabled.getValue()).booleanValue();
    }

    private final void sendToRemote(int priority, String tag2, String message, Throwable t2, LogInfo logInfo) {
        String priorityName = Companion.toPriorityName(priority);
        if (tag2 == null) {
            tag2 = "";
        }
        List listC = zhm.u.c(tag2);
        String currentTimeIsoFormat = this.timeProvider.getCurrentTimeIsoFormat();
        Pair pair = new Pair("message", message);
        Pair pair2 = new Pair("method", logInfo.getMethod());
        Pair pair3 = new Pair("line", String.valueOf(logInfo.getLine()));
        Pair pair4 = new Pair("file", logInfo.getFile());
        String strB = t2 != null ? f.b(t2) : null;
        this.repository.log$onfido_capture_sdk_core_release(new OnfidoRemoteLog(priorityName, listC, currentTimeIsoFormat, r0.k(pair, pair2, pair3, pair4, new Pair("exception", strB != null ? strB : ""))), priority == 6);
    }

    private final boolean shouldSendToRemote(int priority) {
        return isRemoteLoggingEnabled() && getRemoteEnabledLogPriorities().contains(Integer.valueOf(priority));
    }

    @NotNull
    public final LogInfo getLogInfo$onfido_capture_sdk_core_release() {
        StackTraceElement[] stackTraces$onfido_capture_sdk_core_release = getStackTraces$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(stackTraces$onfido_capture_sdk_core_release, "getStackTraces(...)");
        for (StackTraceElement stackTraceElement : stackTraces$onfido_capture_sdk_core_release) {
            if (!ignoredClasses.contains(stackTraceElement.getClassName())) {
                return Companion.toLogInfo(stackTraceElement);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final StackTraceElement[] getStackTraces$onfido_capture_sdk_core_release() {
        return new Throwable().getStackTrace();
    }

    public final boolean isInDebug$onfido_capture_sdk_core_release() {
        return false;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.logging.Timber.Tree
    public boolean isLoggable(String tag2, int priority) {
        return isInDebug$onfido_capture_sdk_core_release() || getRemoteEnabledLogPriorities().contains(Integer.valueOf(priority));
    }

    @Override // com.onfido.android.sdk.capture.internal.util.logging.Timber.DebugTree, com.onfido.android.sdk.capture.internal.util.logging.Timber.Tree
    public void log(int priority, String tag2, @NotNull String message, Throwable t2) {
        Intrinsics.checkNotNullParameter(message, "message");
        LogInfo logInfo$onfido_capture_sdk_core_release = getLogInfo$onfido_capture_sdk_core_release();
        if (shouldSendToRemote(priority)) {
            sendToRemote(priority, tag2, message, t2, logInfo$onfido_capture_sdk_core_release);
        }
        super.log(priority, tag2, message + '\n' + logInfo$onfido_capture_sdk_core_release, t2);
    }

    public final void onUproot$onfido_capture_sdk_core_release() {
        this.repository.submitLogs$onfido_capture_sdk_core_release();
    }
}
