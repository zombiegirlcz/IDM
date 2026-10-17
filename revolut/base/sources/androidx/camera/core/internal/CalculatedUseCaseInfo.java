package androidx.camera.core.internal;

import androidx.camera.core.UseCase;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.streamsharing.StreamSharing;
import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b4\u00103¨\u00065"}, d2 = {"Landroidx/camera/core/internal/CalculatedUseCaseInfo;", "", "", "Landroidx/camera/core/UseCase;", "appUseCases", "cameraUseCases", "", "cameraUseCasesToAttach", "cameraUseCasesToKeep", "cameraUseCasesToDetach", "Landroidx/camera/core/streamsharing/StreamSharing;", "streamSharing", "placeholderForExtensions", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$ConfigPair;", "useCaseConfigs", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "primaryStreamSpecResult", "secondaryStreamSpecResult", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/streamsharing/StreamSharing;Landroidx/camera/core/UseCase;Ljava/util/Map;Landroidx/camera/core/internal/StreamSpecQueryResult;Landroidx/camera/core/internal/StreamSpecQueryResult;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Collection;", "getAppUseCases", "()Ljava/util/Collection;", "getCameraUseCases", "Ljava/util/List;", "getCameraUseCasesToAttach", "()Ljava/util/List;", "getCameraUseCasesToKeep", "getCameraUseCasesToDetach", "Landroidx/camera/core/streamsharing/StreamSharing;", "getStreamSharing", "()Landroidx/camera/core/streamsharing/StreamSharing;", "Landroidx/camera/core/UseCase;", "getPlaceholderForExtensions", "()Landroidx/camera/core/UseCase;", "Ljava/util/Map;", "getUseCaseConfigs", "()Ljava/util/Map;", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "getPrimaryStreamSpecResult", "()Landroidx/camera/core/internal/StreamSpecQueryResult;", "getSecondaryStreamSpecResult", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalculatedUseCaseInfo {

    @NotNull
    private final Collection<UseCase> appUseCases;

    @NotNull
    private final Collection<UseCase> cameraUseCases;

    @NotNull
    private final List<UseCase> cameraUseCasesToAttach;

    @NotNull
    private final List<UseCase> cameraUseCasesToDetach;

    @NotNull
    private final List<UseCase> cameraUseCasesToKeep;
    private final UseCase placeholderForExtensions;

    @NotNull
    private final StreamSpecQueryResult primaryStreamSpecResult;
    private final StreamSpecQueryResult secondaryStreamSpecResult;
    private final StreamSharing streamSharing;

    @NotNull
    private final Map<UseCase, CameraUseCaseAdapter.ConfigPair> useCaseConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public CalculatedUseCaseInfo(@NotNull Collection<? extends UseCase> appUseCases, @NotNull Collection<? extends UseCase> cameraUseCases, @NotNull List<? extends UseCase> cameraUseCasesToAttach, @NotNull List<? extends UseCase> cameraUseCasesToKeep, @NotNull List<? extends UseCase> cameraUseCasesToDetach, StreamSharing streamSharing, UseCase useCase, @NotNull Map<UseCase, ? extends CameraUseCaseAdapter.ConfigPair> useCaseConfigs, @NotNull StreamSpecQueryResult primaryStreamSpecResult, StreamSpecQueryResult streamSpecQueryResult) {
        Intrinsics.checkNotNullParameter(appUseCases, "appUseCases");
        Intrinsics.checkNotNullParameter(cameraUseCases, "cameraUseCases");
        Intrinsics.checkNotNullParameter(cameraUseCasesToAttach, "cameraUseCasesToAttach");
        Intrinsics.checkNotNullParameter(cameraUseCasesToKeep, "cameraUseCasesToKeep");
        Intrinsics.checkNotNullParameter(cameraUseCasesToDetach, "cameraUseCasesToDetach");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.appUseCases = appUseCases;
        this.cameraUseCases = cameraUseCases;
        this.cameraUseCasesToAttach = cameraUseCasesToAttach;
        this.cameraUseCasesToKeep = cameraUseCasesToKeep;
        this.cameraUseCasesToDetach = cameraUseCasesToDetach;
        this.streamSharing = streamSharing;
        this.placeholderForExtensions = useCase;
        this.useCaseConfigs = useCaseConfigs;
        this.primaryStreamSpecResult = primaryStreamSpecResult;
        this.secondaryStreamSpecResult = streamSpecQueryResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculatedUseCaseInfo)) {
            return false;
        }
        CalculatedUseCaseInfo calculatedUseCaseInfo = (CalculatedUseCaseInfo) other;
        return Intrinsics.f(this.appUseCases, calculatedUseCaseInfo.appUseCases) && Intrinsics.f(this.cameraUseCases, calculatedUseCaseInfo.cameraUseCases) && Intrinsics.f(this.cameraUseCasesToAttach, calculatedUseCaseInfo.cameraUseCasesToAttach) && Intrinsics.f(this.cameraUseCasesToKeep, calculatedUseCaseInfo.cameraUseCasesToKeep) && Intrinsics.f(this.cameraUseCasesToDetach, calculatedUseCaseInfo.cameraUseCasesToDetach) && Intrinsics.f(this.streamSharing, calculatedUseCaseInfo.streamSharing) && Intrinsics.f(this.placeholderForExtensions, calculatedUseCaseInfo.placeholderForExtensions) && Intrinsics.f(this.useCaseConfigs, calculatedUseCaseInfo.useCaseConfigs) && Intrinsics.f(this.primaryStreamSpecResult, calculatedUseCaseInfo.primaryStreamSpecResult) && Intrinsics.f(this.secondaryStreamSpecResult, calculatedUseCaseInfo.secondaryStreamSpecResult);
    }

    @NotNull
    public final Collection<UseCase> getAppUseCases() {
        return this.appUseCases;
    }

    @NotNull
    public final Collection<UseCase> getCameraUseCases() {
        return this.cameraUseCases;
    }

    @NotNull
    public final List<UseCase> getCameraUseCasesToAttach() {
        return this.cameraUseCasesToAttach;
    }

    @NotNull
    public final List<UseCase> getCameraUseCasesToDetach() {
        return this.cameraUseCasesToDetach;
    }

    @NotNull
    public final List<UseCase> getCameraUseCasesToKeep() {
        return this.cameraUseCasesToKeep;
    }

    public final UseCase getPlaceholderForExtensions() {
        return this.placeholderForExtensions;
    }

    @NotNull
    public final StreamSpecQueryResult getPrimaryStreamSpecResult() {
        return this.primaryStreamSpecResult;
    }

    public final StreamSpecQueryResult getSecondaryStreamSpecResult() {
        return this.secondaryStreamSpecResult;
    }

    public final StreamSharing getStreamSharing() {
        return this.streamSharing;
    }

    @NotNull
    public final Map<UseCase, CameraUseCaseAdapter.ConfigPair> getUseCaseConfigs() {
        return this.useCaseConfigs;
    }

    public int hashCode() {
        int iD = a.d(a.d(a.d((this.cameraUseCases.hashCode() + (this.appUseCases.hashCode() * 31)) * 31, 31, this.cameraUseCasesToAttach), 31, this.cameraUseCasesToKeep), 31, this.cameraUseCasesToDetach);
        StreamSharing streamSharing = this.streamSharing;
        int iHashCode = (iD + (streamSharing == null ? 0 : streamSharing.hashCode())) * 31;
        UseCase useCase = this.placeholderForExtensions;
        int iHashCode2 = (this.primaryStreamSpecResult.hashCode() + a.e((iHashCode + (useCase == null ? 0 : useCase.hashCode())) * 31, 31, this.useCaseConfigs)) * 31;
        StreamSpecQueryResult streamSpecQueryResult = this.secondaryStreamSpecResult;
        return iHashCode2 + (streamSpecQueryResult != null ? streamSpecQueryResult.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.appUseCases + ", cameraUseCases=" + this.cameraUseCases + ", cameraUseCasesToAttach=" + this.cameraUseCasesToAttach + ", cameraUseCasesToKeep=" + this.cameraUseCasesToKeep + ", cameraUseCasesToDetach=" + this.cameraUseCasesToDetach + ", streamSharing=" + this.streamSharing + ", placeholderForExtensions=" + this.placeholderForExtensions + ", useCaseConfigs=" + this.useCaseConfigs + ", primaryStreamSpecResult=" + this.primaryStreamSpecResult + ", secondaryStreamSpecResult=" + this.secondaryStreamSpecResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
