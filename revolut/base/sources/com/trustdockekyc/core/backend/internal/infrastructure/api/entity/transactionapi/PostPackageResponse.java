package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.ProcessResult;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import w1m.k;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse;", "", "", "id", "packageId", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse$Process;", "processes", "selectedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse;", "Process", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostPackageResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f107391c;
    public final String d;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse$Process;", "", "", "id", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;", "type", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;)V", "Lw1m/k;", "toModel", "()Lw1m/k;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse$Process;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/ProcessResult$ProcessType;", "getType", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @m(generateAdapter = true)
    public static final /* data */ class Process {

        @NotNull
        private final String id;

        @NotNull
        private final ProcessResult.ProcessType type;

        public Process(@NotNull String id10, @NotNull ProcessResult.ProcessType type) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            this.id = id10;
            this.type = type;
        }

        public static /* synthetic */ Process copy$default(Process process, String str, ProcessResult.ProcessType processType, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = process.id;
            }
            if ((i & 2) != 0) {
                processType = process.type;
            }
            return process.copy(str, processType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ProcessResult.ProcessType getType() {
            return this.type;
        }

        @NotNull
        public final Process copy(@NotNull String id10, @NotNull ProcessResult.ProcessType type) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Process(id10, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Process)) {
                return false;
            }
            Process process = (Process) other;
            return Intrinsics.f(this.id, process.id) && this.type == process.type;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final ProcessResult.ProcessType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public final k toModel() {
            return new k(this.id, this.type.toModel());
        }

        @NotNull
        public String toString() {
            return "Process(id=" + this.id + ", type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public PostPackageResponse(@i(name = "id") @NotNull String id10, @i(name = "package_id") @NotNull String packageId, @i(name = "processes") @NotNull List<Process> processes, @i(name = "selected_at") @NotNull String selectedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(processes, "processes");
        Intrinsics.checkNotNullParameter(selectedAt, "selectedAt");
        this.f107389a = id10;
        this.f107390b = packageId;
        this.f107391c = processes;
        this.d = selectedAt;
    }

    @NotNull
    public final PostPackageResponse copy(@i(name = "id") @NotNull String id10, @i(name = "package_id") @NotNull String packageId, @i(name = "processes") @NotNull List<Process> processes, @i(name = "selected_at") @NotNull String selectedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(processes, "processes");
        Intrinsics.checkNotNullParameter(selectedAt, "selectedAt");
        return new PostPackageResponse(id10, packageId, processes, selectedAt);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostPackageResponse)) {
            return false;
        }
        PostPackageResponse postPackageResponse = (PostPackageResponse) obj2;
        return Intrinsics.f(this.f107389a, postPackageResponse.f107389a) && Intrinsics.f(this.f107390b, postPackageResponse.f107390b) && Intrinsics.f(this.f107391c, postPackageResponse.f107391c) && Intrinsics.f(this.d, postPackageResponse.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + e0.a(w0.a(this.f107390b, this.f107389a.hashCode() * 31), this.f107391c);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PostPackageResponse(id=");
        sb6.append(this.f107389a);
        sb6.append(", packageId=");
        sb6.append(this.f107390b);
        sb6.append(", processes=");
        sb6.append(this.f107391c);
        sb6.append(", selectedAt=");
        return j6.a.u(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
