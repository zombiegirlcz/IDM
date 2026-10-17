package androidx.camera.core.featuregroup.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver;
import androidx.camera.core.impl.CameraInfoInternal;
import ch.qos.logback.core.CoreConstants;
import ib.b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "", b.Features, "", "Landroidx/camera/core/featuregroup/GroupableFeature;", "<init>", "(Ljava/util/Set;)V", "getFeatures", "()Ljava/util/Set;", "toString", "", "Companion", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResolvedFeatureGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Set<GroupableFeature> features;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup$Companion;", "", "<init>", "()V", "TAG", "", "resolveFeatureGroup", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "Landroidx/camera/core/SessionConfig;", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "resolver", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolver;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResolvedFeatureGroup resolveFeatureGroup$default(Companion companion, SessionConfig sessionConfig, CameraInfoInternal cameraInfoInternal, FeatureGroupResolver featureGroupResolver, int i, Object obj2) {
            if ((i & 2) != 0) {
                featureGroupResolver = new DefaultFeatureGroupResolver(cameraInfoInternal);
            }
            return companion.resolveFeatureGroup(sessionConfig, cameraInfoInternal, featureGroupResolver);
        }

        public final ResolvedFeatureGroup resolveFeatureGroup(@NotNull SessionConfig sessionConfig, @NotNull CameraInfoInternal cameraInfoInternal) {
            Intrinsics.checkNotNullParameter(sessionConfig, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            return resolveFeatureGroup$default(this, sessionConfig, cameraInfoInternal, null, 2, null);
        }

        private Companion() {
        }

        public final ResolvedFeatureGroup resolveFeatureGroup(@NotNull SessionConfig sessionConfig, @NotNull CameraInfoInternal cameraInfoInternal, @NotNull FeatureGroupResolver resolver) {
            Intrinsics.checkNotNullParameter(sessionConfig, "<this>");
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Logger.d("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + sessionConfig + ", lensFacing = " + cameraInfoInternal.getLensFacing());
            if (sessionConfig.getRequiredFeatureGroup().isEmpty() && sessionConfig.getPreferredFeatureGroup().isEmpty()) {
                return null;
            }
            FeatureGroupResolutionResult featureGroupResolutionResultResolveFeatureGroup = resolver.resolveFeatureGroup(sessionConfig);
            if (featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.Supported) {
                ResolvedFeatureGroup resolvedFeatureGroup = ((FeatureGroupResolutionResult.Supported) featureGroupResolutionResultResolveFeatureGroup).getResolvedFeatureGroup();
                Logger.d("ResolvedFeatureGroup", "resolvedFeatureGroup = " + resolvedFeatureGroup);
                return resolvedFeatureGroup;
            }
            if (featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.Unsupported) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.UnsupportedUseCase) {
                throw new IllegalArgumentException(((FeatureGroupResolutionResult.UnsupportedUseCase) featureGroupResolutionResultResolveFeatureGroup).getUnsupportedUseCase() + " is not supported");
            }
            if (!(featureGroupResolutionResultResolveFeatureGroup instanceof FeatureGroupResolutionResult.UseCaseMissing)) {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder sb6 = new StringBuilder();
            FeatureGroupResolutionResult.UseCaseMissing useCaseMissing = (FeatureGroupResolutionResult.UseCaseMissing) featureGroupResolutionResultResolveFeatureGroup;
            sb6.append(useCaseMissing.getRequiredUseCases());
            sb6.append(" must be added for ");
            sb6.append(useCaseMissing.getFeatureRequiring());
            throw new IllegalArgumentException(sb6.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedFeatureGroup(@NotNull Set<? extends GroupableFeature> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.features = features;
    }

    public static final ResolvedFeatureGroup resolveFeatureGroup(@NotNull SessionConfig sessionConfig, @NotNull CameraInfoInternal cameraInfoInternal) {
        return INSTANCE.resolveFeatureGroup(sessionConfig, cameraInfoInternal);
    }

    @NotNull
    public final Set<GroupableFeature> getFeatures() {
        return this.features;
    }

    @NotNull
    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.features + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
