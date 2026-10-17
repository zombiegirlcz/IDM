package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JU\u0010\u000f\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010&J-\u0010*\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020$¢\u0006\u0004\b0\u00101JK\u00109\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u0007082\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0010\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b022\f\u00107\u001a\b\u0012\u0004\u0012\u00020602¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010@¨\u0006B"}, d2 = {"Landroidx/camera/camera2/internal/DynamicRangeResolver;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;)V", "", "Landroidx/camera/core/DynamicRange;", "supportedDynamicRanges", "orderedExistingDynamicRanges", "orderedNewDynamicRanges", "Landroidx/camera/core/impl/UseCaseConfig;", "config", "", "outCombinedConstraints", "resolveDynamicRangeAndUpdateConstraints", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Landroidx/camera/core/impl/UseCaseConfig;Ljava/util/Set;)Landroidx/camera/core/DynamicRange;", "requestedDynamicRange", "combinedConstraints", "", "rangeOwnerLabel", "resolveDynamicRange", "(Landroidx/camera/core/DynamicRange;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;)Landroidx/camera/core/DynamicRange;", "newDynamicRange", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "dynamicRangesInfo", "", "updateConstraints", "(Ljava/util/Set;Landroidx/camera/core/DynamicRange;Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;)V", "rangeToMatch", "", "fullySpecifiedCandidateRanges", "constraints", "findSupportedHdrMatch", "(Landroidx/camera/core/DynamicRange;Ljava/util/Collection;Ljava/util/Set;)Landroidx/camera/core/DynamicRange;", "dynamicRange", "", "isFullyUnspecified", "(Landroidx/camera/core/DynamicRange;)Z", "isPartiallySpecified", "rangeToResolve", "candidateRange", "canResolveWithinConstraints", "(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/DynamicRange;Ljava/util/Set;)Z", "testRange", "fullySpecifiedRange", "canResolveDynamicRange", "(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/DynamicRange;)Z", "is10BitDynamicRangeSupported", "()Z", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "existingSurfaces", "newUseCaseConfigs", "", "useCasePriorityOrder", "", "resolveAndValidateDynamicRanges", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getCameraMetadata", "()Landroidx/camera/camera2/pipe/CameraMetadata;", "is10BitSupported", "Z", "Landroidx/camera/camera2/compat/DynamicRangeProfilesCompat;", "Api33Impl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicRangeResolver {

    @NotNull
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final DynamicRangeProfilesCompat dynamicRangesInfo;
    private final boolean is10BitSupported;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/internal/DynamicRangeResolver$Api33Impl;", "", "<init>", "()V", "getRecommended10BitDynamicRange", "Landroidx/camera/core/DynamicRange;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api33Impl {

        @NotNull
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final DynamicRange getRecommended10BitDynamicRange(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
            CameraCharacteristics.Key REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
            Intrinsics.checkNotNullExpressionValue(REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE, "REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE");
            Long l2 = (Long) cameraMetadata.get(REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l2 != null) {
                return DynamicRangeConversions.INSTANCE.profileToDynamicRange(l2.longValue());
            }
            return null;
        }
    }

    public DynamicRangeResolver(@NotNull CameraMetadata cameraMetadata) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        this.cameraMetadata = cameraMetadata;
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraMetadata.get(REQUEST_AVAILABLE_CAPABILITIES);
        this.is10BitSupported = iArr != null ? d.G(iArr, 18) : false;
        this.dynamicRangesInfo = DynamicRangeProfilesCompat.INSTANCE.fromCameraMetaData(cameraMetadata);
    }

    private final boolean canResolveDynamicRange(DynamicRange testRange, DynamicRange fullySpecifiedRange) {
        if (!fullySpecifiedRange.isFullySpecified()) {
            throw new IllegalStateException(("Fully specified range " + fullySpecifiedRange + " not actually fully specified.").toString());
        }
        if (testRange.getEncoding() == 2 && fullySpecifiedRange.getEncoding() == 1) {
            return false;
        }
        if (testRange.getEncoding() == 2 || testRange.getEncoding() == 0 || testRange.getEncoding() == fullySpecifiedRange.getEncoding()) {
            return testRange.getBitDepth() == 0 || testRange.getBitDepth() == fullySpecifiedRange.getBitDepth();
        }
        return false;
    }

    private final boolean canResolveWithinConstraints(DynamicRange rangeToResolve, DynamicRange candidateRange, Set<DynamicRange> constraints) {
        if (constraints.contains(candidateRange)) {
            return canResolveDynamicRange(rangeToResolve, candidateRange);
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isDebugEnabled("CXCP")) {
            return false;
        }
        String unused = Camera2Logger.TRUNCATED_TAG;
        String str = "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + rangeToResolve + "\nCandidate dynamic range:\n  " + candidateRange;
        return false;
    }

    private final DynamicRange findSupportedHdrMatch(DynamicRange rangeToMatch, Collection<DynamicRange> fullySpecifiedCandidateRanges, Set<DynamicRange> constraints) {
        if (rangeToMatch.getEncoding() == 1) {
            return null;
        }
        for (DynamicRange dynamicRange : fullySpecifiedCandidateRanges) {
            int encoding = dynamicRange.getEncoding();
            if (!dynamicRange.isFullySpecified()) {
                throw new IllegalStateException("Fully specified DynamicRange must have fully defined encoding.");
            }
            if (encoding != 1 && canResolveWithinConstraints(rangeToMatch, dynamicRange, constraints)) {
                return dynamicRange;
            }
        }
        return null;
    }

    private final boolean isFullyUnspecified(DynamicRange dynamicRange) {
        return Intrinsics.f(dynamicRange, DynamicRange.UNSPECIFIED);
    }

    private final boolean isPartiallySpecified(DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() == 2) {
            return true;
        }
        if (dynamicRange.getEncoding() == 0 || dynamicRange.getBitDepth() != 0) {
            return dynamicRange.getEncoding() == 0 && dynamicRange.getBitDepth() != 0;
        }
        return true;
    }

    private final DynamicRange resolveDynamicRange(DynamicRange requestedDynamicRange, Set<DynamicRange> combinedConstraints, Set<DynamicRange> orderedExistingDynamicRanges, Set<DynamicRange> orderedNewDynamicRanges, String rangeOwnerLabel) {
        DynamicRange recommended10BitDynamicRange;
        if (requestedDynamicRange.isFullySpecified()) {
            if (combinedConstraints.contains(requestedDynamicRange)) {
                return requestedDynamicRange;
            }
            return null;
        }
        int encoding = requestedDynamicRange.getEncoding();
        int bitDepth = requestedDynamicRange.getBitDepth();
        if (encoding == 1 && bitDepth == 0) {
            DynamicRange dynamicRange = DynamicRange.SDR;
            if (combinedConstraints.contains(dynamicRange)) {
                return dynamicRange;
            }
            return null;
        }
        DynamicRange dynamicRangeFindSupportedHdrMatch = findSupportedHdrMatch(requestedDynamicRange, orderedExistingDynamicRanges, combinedConstraints);
        if (dynamicRangeFindSupportedHdrMatch != null) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "DynamicRangeResolver: Resolved dynamic range for use case " + rangeOwnerLabel + " from existing attached surface.\n" + requestedDynamicRange + "\n->\n" + dynamicRangeFindSupportedHdrMatch;
            }
            return dynamicRangeFindSupportedHdrMatch;
        }
        DynamicRange dynamicRangeFindSupportedHdrMatch2 = findSupportedHdrMatch(requestedDynamicRange, orderedNewDynamicRanges, combinedConstraints);
        if (dynamicRangeFindSupportedHdrMatch2 != null) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "DynamicRangeResolver: Resolved dynamic range for use case " + rangeOwnerLabel + " from concurrently bound use case.\n" + requestedDynamicRange + "\n->\n" + dynamicRangeFindSupportedHdrMatch2;
            }
            return dynamicRangeFindSupportedHdrMatch2;
        }
        DynamicRange SDR = DynamicRange.SDR;
        Intrinsics.checkNotNullExpressionValue(SDR, "SDR");
        if (canResolveWithinConstraints(requestedDynamicRange, SDR, combinedConstraints)) {
            Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused3 = Camera2Logger.TRUNCATED_TAG;
                String str3 = "DynamicRangeResolver: Resolved dynamic range for use case " + rangeOwnerLabel + " to no compatible HDR dynamic ranges.\n" + requestedDynamicRange + "\n->\n" + SDR;
            }
            return SDR;
        }
        if (encoding == 2 && (bitDepth == 10 || bitDepth == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                recommended10BitDynamicRange = Api33Impl.INSTANCE.getRecommended10BitDynamicRange(this.cameraMetadata);
                if (recommended10BitDynamicRange != null) {
                    linkedHashSet.add(recommended10BitDynamicRange);
                }
            } else {
                recommended10BitDynamicRange = null;
            }
            DynamicRange HLG_10_BIT = DynamicRange.HLG_10_BIT;
            Intrinsics.checkNotNullExpressionValue(HLG_10_BIT, "HLG_10_BIT");
            linkedHashSet.add(HLG_10_BIT);
            DynamicRange dynamicRangeFindSupportedHdrMatch3 = findSupportedHdrMatch(requestedDynamicRange, linkedHashSet, combinedConstraints);
            if (dynamicRangeFindSupportedHdrMatch3 != null) {
                Camera2Logger camera2Logger4 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused4 = Camera2Logger.TRUNCATED_TAG;
                    StringBuilder sbX = a.x("DynamicRangeResolver: Resolved dynamic range for use case ", rangeOwnerLabel, "from ");
                    sbX.append(dynamicRangeFindSupportedHdrMatch3.equals(recommended10BitDynamicRange) ? "recommended" : "required");
                    sbX.append(" 10-bit supported dynamic range.\n");
                    sbX.append(requestedDynamicRange);
                    sbX.append("\n->\n");
                    sbX.append(dynamicRangeFindSupportedHdrMatch3);
                    sbX.toString();
                }
                return dynamicRangeFindSupportedHdrMatch3;
            }
        }
        for (DynamicRange dynamicRange2 : combinedConstraints) {
            if (!dynamicRange2.isFullySpecified()) {
                throw new IllegalStateException("Candidate dynamic range must be fully specified.");
            }
            if (!dynamicRange2.equals(DynamicRange.SDR) && canResolveDynamicRange(requestedDynamicRange, dynamicRange2)) {
                Camera2Logger camera2Logger5 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused5 = Camera2Logger.TRUNCATED_TAG;
                    String str4 = "DynamicRangeResolver: Resolved dynamic range for use case " + rangeOwnerLabel + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + requestedDynamicRange + "\n->\n" + dynamicRange2;
                }
                return dynamicRange2;
            }
        }
        return null;
    }

    private final DynamicRange resolveDynamicRangeAndUpdateConstraints(Set<DynamicRange> supportedDynamicRanges, Set<DynamicRange> orderedExistingDynamicRanges, Set<DynamicRange> orderedNewDynamicRanges, UseCaseConfig<?> config, Set<DynamicRange> outCombinedConstraints) {
        DynamicRange dynamicRange = config.getDynamicRange();
        Intrinsics.checkNotNullExpressionValue(dynamicRange, "getDynamicRange(...)");
        String targetName = config.getTargetName();
        Intrinsics.checkNotNullExpressionValue(targetName, "getTargetName(...)");
        DynamicRange dynamicRangeResolveDynamicRange = resolveDynamicRange(dynamicRange, outCombinedConstraints, orderedExistingDynamicRanges, orderedNewDynamicRanges, targetName);
        if (dynamicRangeResolveDynamicRange != null) {
            updateConstraints(outCombinedConstraints, dynamicRangeResolveDynamicRange, this.dynamicRangesInfo);
            return dynamicRangeResolveDynamicRange;
        }
        throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + config.getTargetName() + "\nRequested dynamic range:\n  " + dynamicRange + "\nSupported dynamic ranges:\n  " + supportedDynamicRanges + "\nConstrained set of concurrent dynamic ranges:\n  " + outCombinedConstraints);
    }

    private final void updateConstraints(Set<DynamicRange> combinedConstraints, DynamicRange newDynamicRange, DynamicRangeProfilesCompat dynamicRangesInfo) {
        Preconditions.checkState(!combinedConstraints.isEmpty(), "Cannot update already-empty constraints.");
        Set<DynamicRange> dynamicRangeCaptureRequestConstraints = dynamicRangesInfo.getDynamicRangeCaptureRequestConstraints(newDynamicRange);
        Set<DynamicRange> set = dynamicRangeCaptureRequestConstraints;
        if (set.isEmpty()) {
            return;
        }
        Set setI1 = d0.i1(combinedConstraints);
        combinedConstraints.retainAll(set);
        if (combinedConstraints.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + newDynamicRange + "\nConstraints:\n  " + dynamicRangeCaptureRequestConstraints + "\nExisting constraints:\n  " + setI1).toString());
        }
    }

    /* JADX INFO: renamed from: is10BitDynamicRangeSupported, reason: from getter */
    public final boolean getIs10BitSupported() {
        return this.is10BitSupported;
    }

    @NotNull
    public final Map<UseCaseConfig<?>, DynamicRange> resolveAndValidateDynamicRanges(@NotNull List<? extends AttachedSurfaceInfo> existingSurfaces, @NotNull List<? extends UseCaseConfig<?>> newUseCaseConfigs, @NotNull List<Integer> useCasePriorityOrder) {
        Intrinsics.checkNotNullParameter(existingSurfaces, "existingSurfaces");
        Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
        Intrinsics.checkNotNullParameter(useCasePriorityOrder, "useCasePriorityOrder");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends AttachedSurfaceInfo> it8 = existingSurfaces.iterator();
        while (it8.hasNext()) {
            DynamicRange dynamicRange = it8.next().getDynamicRange();
            Intrinsics.checkNotNullExpressionValue(dynamicRange, "getDynamicRange(...)");
            linkedHashSet.add(dynamicRange);
        }
        Set<DynamicRange> supportedDynamicRanges = this.dynamicRangesInfo.getSupportedDynamicRanges();
        Set<DynamicRange> setH1 = d0.h1(supportedDynamicRanges);
        Iterator<DynamicRange> it9 = linkedHashSet.iterator();
        while (it9.hasNext()) {
            updateConstraints(setH1, it9.next(), this.dynamicRangesInfo);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it10 = useCasePriorityOrder.iterator();
        while (it10.hasNext()) {
            UseCaseConfig<?> useCaseConfig = newUseCaseConfigs.get(it10.next().intValue());
            DynamicRange dynamicRange2 = useCaseConfig.getDynamicRange();
            Intrinsics.checkNotNullExpressionValue(dynamicRange2, "getDynamicRange(...)");
            if (isFullyUnspecified(dynamicRange2)) {
                arrayList3.add(useCaseConfig);
            } else if (isPartiallySpecified(dynamicRange2)) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<UseCaseConfig<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (UseCaseConfig<?> useCaseConfig2 : arrayList4) {
            DynamicRange dynamicRangeResolveDynamicRangeAndUpdateConstraints = resolveDynamicRangeAndUpdateConstraints(supportedDynamicRanges, linkedHashSet, linkedHashSet2, useCaseConfig2, setH1);
            linkedHashMap.put(useCaseConfig2, dynamicRangeResolveDynamicRangeAndUpdateConstraints);
            if (!linkedHashSet.contains(dynamicRangeResolveDynamicRangeAndUpdateConstraints)) {
                linkedHashSet2.add(dynamicRangeResolveDynamicRangeAndUpdateConstraints);
            }
        }
        return linkedHashMap;
    }
}
