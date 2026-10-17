package androidx.camera.core.featuregroup.impl.resolver;

import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "", "Supported", "UseCaseMissing", "UnsupportedUseCase", "Unsupported", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Unsupported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FeatureGroupResolutionResult {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "resolvedFeatureGroup", "<init>", "(Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "getResolvedFeatureGroup", "()Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Supported implements FeatureGroupResolutionResult {

        @NotNull
        private final ResolvedFeatureGroup resolvedFeatureGroup;

        public Supported(@NotNull ResolvedFeatureGroup resolvedFeatureGroup) {
            Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "resolvedFeatureGroup");
            this.resolvedFeatureGroup = resolvedFeatureGroup;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Supported) && Intrinsics.f(this.resolvedFeatureGroup, ((Supported) other).resolvedFeatureGroup);
        }

        @NotNull
        public final ResolvedFeatureGroup getResolvedFeatureGroup() {
            return this.resolvedFeatureGroup;
        }

        public int hashCode() {
            return this.resolvedFeatureGroup.hashCode();
        }

        @NotNull
        public String toString() {
            return "Supported(resolvedFeatureGroup=" + this.resolvedFeatureGroup + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Unsupported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "<init>", "()V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unsupported implements FeatureGroupResolutionResult {

        @NotNull
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "Landroidx/camera/core/UseCase;", "unsupportedUseCase", "<init>", "(Landroidx/camera/core/UseCase;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/core/UseCase;", "getUnsupportedUseCase", "()Landroidx/camera/core/UseCase;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnsupportedUseCase implements FeatureGroupResolutionResult {

        @NotNull
        private final UseCase unsupportedUseCase;

        public UnsupportedUseCase(@NotNull UseCase unsupportedUseCase) {
            Intrinsics.checkNotNullParameter(unsupportedUseCase, "unsupportedUseCase");
            this.unsupportedUseCase = unsupportedUseCase;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedUseCase) && Intrinsics.f(this.unsupportedUseCase, ((UnsupportedUseCase) other).unsupportedUseCase);
        }

        @NotNull
        public final UseCase getUnsupportedUseCase() {
            return this.unsupportedUseCase;
        }

        public int hashCode() {
            return this.unsupportedUseCase.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.unsupportedUseCase + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "", "requiredUseCases", "Landroidx/camera/core/featuregroup/GroupableFeature;", "featureRequiring", "<init>", "(Ljava/lang/String;Landroidx/camera/core/featuregroup/GroupableFeature;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequiredUseCases", "Landroidx/camera/core/featuregroup/GroupableFeature;", "getFeatureRequiring", "()Landroidx/camera/core/featuregroup/GroupableFeature;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UseCaseMissing implements FeatureGroupResolutionResult {

        @NotNull
        private final GroupableFeature featureRequiring;

        @NotNull
        private final String requiredUseCases;

        public UseCaseMissing(@NotNull String requiredUseCases, @NotNull GroupableFeature featureRequiring) {
            Intrinsics.checkNotNullParameter(requiredUseCases, "requiredUseCases");
            Intrinsics.checkNotNullParameter(featureRequiring, "featureRequiring");
            this.requiredUseCases = requiredUseCases;
            this.featureRequiring = featureRequiring;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UseCaseMissing)) {
                return false;
            }
            UseCaseMissing useCaseMissing = (UseCaseMissing) other;
            return Intrinsics.f(this.requiredUseCases, useCaseMissing.requiredUseCases) && Intrinsics.f(this.featureRequiring, useCaseMissing.featureRequiring);
        }

        @NotNull
        public final GroupableFeature getFeatureRequiring() {
            return this.featureRequiring;
        }

        @NotNull
        public final String getRequiredUseCases() {
            return this.requiredUseCases;
        }

        public int hashCode() {
            return this.featureRequiring.hashCode() + (this.requiredUseCases.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.requiredUseCases + ", featureRequiring=" + this.featureRequiring + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }
}
