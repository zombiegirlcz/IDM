package com.fourthline.orca.workflow;

import com.fourthline.orca.core.ProductConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mb.b;
import mb.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowConfig;", "Lcom/fourthline/orca/core/ProductConfig;", "Lmb/d;", "networkEnvironment", "<init>", "(Lmb/d;)V", "component1", "()Lmb/d;", "copy", "(Lmb/d;)Lcom/fourthline/orca/workflow/WorkflowConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmb/d;", "getNetworkEnvironment", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowConfig implements ProductConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d networkEnvironment;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WorkflowConfig copy$default(WorkflowConfig workflowConfig, d dVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            dVar = workflowConfig.networkEnvironment;
        }
        return workflowConfig.copy(dVar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final d getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    @NotNull
    public final WorkflowConfig copy(@NotNull d networkEnvironment) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        return new WorkflowConfig(networkEnvironment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WorkflowConfig) && Intrinsics.f(this.networkEnvironment, ((WorkflowConfig) other).networkEnvironment);
    }

    @NotNull
    public final d getNetworkEnvironment() {
        return this.networkEnvironment;
    }

    public int hashCode() {
        return this.networkEnvironment.hashCode();
    }

    @NotNull
    public String toString() {
        return "WorkflowConfig(networkEnvironment=" + this.networkEnvironment + ")";
    }

    public WorkflowConfig(@NotNull d networkEnvironment) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        this.networkEnvironment = networkEnvironment;
    }

    public /* synthetic */ WorkflowConfig(d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.f204053a : dVar);
    }
}
