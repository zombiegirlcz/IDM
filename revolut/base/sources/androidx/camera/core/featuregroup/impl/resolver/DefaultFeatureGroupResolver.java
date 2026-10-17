package androidx.camera.core.featuregroup.impl.resolver;

import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J8\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002J\u0012\u0010\u0015\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\f0\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolver;", "cameraInfoInternal", "Landroidx/camera/core/impl/CameraInfoInternal;", "<init>", "(Landroidx/camera/core/impl/CameraInfoInternal;)V", "resolveFeatureGroup", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "sessionConfig", "Landroidx/camera/core/SessionConfig;", "getMissingUseCase", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "useCases", "", "Landroidx/camera/core/UseCase;", "getFeatureListResolvedByPriority", "orderedPreferredFeatures", "index", "", "currentOptionalFeatures", "isConflictFree", "", "", "Companion", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultFeatureGroupResolver implements FeatureGroupResolver {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final CameraInfoInternal cameraInfoInternal;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver$Companion;", "", "<init>", "()V", "TAG", "", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoStabilization.values().length];
            try {
                iArr[VideoStabilization.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoStabilization.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeatureTypeInternal.values().length];
            try {
                iArr2[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FeatureTypeInternal.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DefaultFeatureGroupResolver(@NotNull CameraInfoInternal cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        this.cameraInfoInternal = cameraInfoInternal;
    }

    private final FeatureGroupResolutionResult getFeatureListResolvedByPriority(SessionConfig sessionConfig, List<? extends GroupableFeature> orderedPreferredFeatures, int index, List<? extends GroupableFeature> currentOptionalFeatures) {
        if (index < orderedPreferredFeatures.size()) {
            int i = index + 1;
            FeatureGroupResolutionResult featureListResolvedByPriority = getFeatureListResolvedByPriority(sessionConfig, orderedPreferredFeatures, i, d0.F0(orderedPreferredFeatures.get(index), currentOptionalFeatures));
            return featureListResolvedByPriority instanceof FeatureGroupResolutionResult.Supported ? featureListResolvedByPriority : getFeatureListResolvedByPriority(sessionConfig, orderedPreferredFeatures, i, currentOptionalFeatures);
        }
        LinkedHashSet linkedHashSetL = a1.l(sessionConfig.getRequiredFeatureGroup(), currentOptionalFeatures);
        Logger.d("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetL + ", useCases = " + sessionConfig.getUseCases());
        return (isConflictFree(linkedHashSetL) && this.cameraInfoInternal.isResolvedFeatureGroupSupported(new ResolvedFeatureGroup(linkedHashSetL), sessionConfig)) ? new FeatureGroupResolutionResult.Supported(new ResolvedFeatureGroup(linkedHashSetL)) : FeatureGroupResolutionResult.Unsupported.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FeatureGroupResolutionResult getFeatureListResolvedByPriority$default(DefaultFeatureGroupResolver defaultFeatureGroupResolver, SessionConfig sessionConfig, List list, int i, List list2, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            list2 = f0.f322471a;
        }
        return defaultFeatureGroupResolver.getFeatureListResolvedByPriority(sessionConfig, list, i, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing getMissingUseCase(androidx.camera.core.featuregroup.GroupableFeature r9, java.util.List<? extends androidx.camera.core.UseCase> r10) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver.getMissingUseCase(androidx.camera.core.featuregroup.GroupableFeature, java.util.List):androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult$UseCaseMissing");
    }

    private final boolean isConflictFree(Set<? extends GroupableFeature> set) {
        Set<? extends GroupableFeature> set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator<T> it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((GroupableFeature) it8.next()).getFeatureTypeInternal());
        }
        for (FeatureTypeInternal featureTypeInternal : d0.U(arrayList)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((GroupableFeature) obj2).getFeatureTypeInternal() == featureTypeInternal) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() > 1) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver
    @NotNull
    public FeatureGroupResolutionResult resolveFeatureGroup(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        List<UseCase> useCases = sessionConfig.getUseCases();
        Set<GroupableFeature> requiredFeatureGroup = sessionConfig.getRequiredFeatureGroup();
        List<GroupableFeature> preferredFeatureGroup = sessionConfig.getPreferredFeatureGroup();
        if (requiredFeatureGroup.isEmpty() && preferredFeatureGroup.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (UseCase useCase : useCases) {
            if (UseCaseType.INSTANCE.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                return new FeatureGroupResolutionResult.UnsupportedUseCase(useCase);
            }
        }
        Iterator<T> it8 = requiredFeatureGroup.iterator();
        while (it8.hasNext()) {
            FeatureGroupResolutionResult.UseCaseMissing missingUseCase = getMissingUseCase((GroupableFeature) it8.next(), useCases);
            if (missingUseCase != null) {
                return missingUseCase;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : preferredFeatureGroup) {
            FeatureGroupResolutionResult.UseCaseMissing missingUseCase2 = getMissingUseCase((GroupableFeature) obj2, useCases);
            if (missingUseCase2 != null) {
                Logger.d("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + missingUseCase2);
            } else {
                missingUseCase2 = null;
            }
            if (missingUseCase2 == null) {
                arrayList.add(obj2);
            }
        }
        Logger.d("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return getFeatureListResolvedByPriority$default(this, sessionConfig, arrayList, 0, null, 12, null);
    }
}
