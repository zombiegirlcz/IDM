package com.onfido.hosted.web.module.model;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKStudioTask;", "", "seen1", "", "taskDefinitionId", "", "taskId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getTaskDefinitionId$annotations", "()V", "getTaskDefinitionId", "()Ljava/lang/String;", "getTaskId$annotations", "getTaskId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class CaptureSDKStudioTask {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String taskDefinitionId;

    @NotNull
    private final String taskId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKStudioTask$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/CaptureSDKStudioTask;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CaptureSDKStudioTask$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ CaptureSDKStudioTask(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(CaptureSDKStudioTask$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.taskDefinitionId = str;
        this.taskId = str2;
    }

    public static /* synthetic */ CaptureSDKStudioTask copy$default(CaptureSDKStudioTask captureSDKStudioTask, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = captureSDKStudioTask.taskDefinitionId;
        }
        if ((i & 2) != 0) {
            str2 = captureSDKStudioTask.taskId;
        }
        return captureSDKStudioTask.copy(str, str2);
    }

    public static /* synthetic */ void getTaskDefinitionId$annotations() {
    }

    public static /* synthetic */ void getTaskId$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(CaptureSDKStudioTask self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.taskDefinitionId);
        output.encodeStringElement(serialDesc, 1, self.taskId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskDefinitionId() {
        return this.taskDefinitionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final CaptureSDKStudioTask copy(@NotNull String taskDefinitionId, @NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskDefinitionId, "taskDefinitionId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        return new CaptureSDKStudioTask(taskDefinitionId, taskId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureSDKStudioTask)) {
            return false;
        }
        CaptureSDKStudioTask captureSDKStudioTask = (CaptureSDKStudioTask) other;
        return Intrinsics.f(this.taskDefinitionId, captureSDKStudioTask.taskDefinitionId) && Intrinsics.f(this.taskId, captureSDKStudioTask.taskId);
    }

    @NotNull
    public final String getTaskDefinitionId() {
        return this.taskDefinitionId;
    }

    @NotNull
    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return this.taskId.hashCode() + (this.taskDefinitionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("CaptureSDKStudioTask(taskDefinitionId=");
        sb6.append(this.taskDefinitionId);
        sb6.append(", taskId=");
        return a.u(sb6, this.taskId, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public CaptureSDKStudioTask(@NotNull String taskDefinitionId, @NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskDefinitionId, "taskDefinitionId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.taskDefinitionId = taskDefinitionId;
        this.taskId = taskId;
    }
}
