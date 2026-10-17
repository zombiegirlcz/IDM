package androidx.camera.core;

import android.util.Range;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;
import b0.m;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001GBc\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0012*\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b*\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b+\u0010#R\u001a\u0010-\u001a\u00020,8\u0017X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001a\u00100\u001a\u00020\n8\u0017X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020,8\u0017X\u0096D¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010/R\u001c\u00107\u001a\u0004\u0018\u0001068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020,8\u0017X\u0096D¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b;\u0010/R<\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0<2\u0012\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0<8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010C\u001a\u00020B2\u0006\u0010=\u001a\u00020B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Landroidx/camera/core/SessionConfig;", "", "", "Landroidx/camera/core/UseCase;", "useCases", "Landroidx/camera/core/ViewPort;", "viewPort", "Landroidx/camera/core/CameraEffect;", "effects", "Landroid/util/Range;", "", "frameRateRange", "", "Landroidx/camera/core/featuregroup/GroupableFeature;", "requiredFeatureGroup", "preferredFeatureGroup", "<init>", "(Ljava/util/List;Landroidx/camera/core/ViewPort;Ljava/util/List;Landroid/util/Range;Ljava/util/Set;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "validateFrameRate", "()V", "validateFeatureGroups", "validateRequiredFeatures", "validateDefaultGroupableFeatureValues", "(Landroidx/camera/core/UseCase;)V", "getUseCaseName", "(Landroidx/camera/core/UseCase;)Ljava/lang/String;", "Landroidx/camera/core/ViewPort;", "getViewPort", "()Landroidx/camera/core/ViewPort;", "Ljava/util/List;", "getEffects", "()Ljava/util/List;", "Landroid/util/Range;", "getFrameRateRange", "()Landroid/util/Range;", "Ljava/util/Set;", "getRequiredFeatureGroup", "()Ljava/util/Set;", "getPreferredFeatureGroup", "getUseCases", "", "isLegacy", "Z", "()Z", "sessionType", "I", "getSessionType", "()I", "requireNonEmptyUseCases", "getRequireNonEmptyUseCases", "Landroidx/camera/core/CameraFilter;", "cameraFilter", "Landroidx/camera/core/CameraFilter;", "getCameraFilter", "()Landroidx/camera/core/CameraFilter;", "isAutoRotationEnabled", "Landroidx/core/util/Consumer;", "value", "featureSelectionListener", "Landroidx/core/util/Consumer;", "getFeatureSelectionListener", "()Landroidx/core/util/Consumer;", "Ljava/util/concurrent/Executor;", "featureSelectionListenerExecutor", "Ljava/util/concurrent/Executor;", "getFeatureSelectionListenerExecutor", "()Ljava/util/concurrent/Executor;", "Builder", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SessionConfig {
    private final CameraFilter cameraFilter;

    @NotNull
    private final List<CameraEffect> effects;

    @NotNull
    private Consumer<Set<GroupableFeature>> featureSelectionListener;

    @NotNull
    private Executor featureSelectionListenerExecutor;

    @NotNull
    private final Range<Integer> frameRateRange;
    private final boolean isAutoRotationEnabled;
    private final boolean isLegacy;

    @NotNull
    private final List<GroupableFeature> preferredFeatureGroup;
    private final boolean requireNonEmptyUseCases;

    @NotNull
    private final Set<GroupableFeature> requiredFeatureGroup;
    private final int sessionType;

    @NotNull
    private final List<UseCase> useCases;
    private final ViewPort viewPort;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeatureTypeInternal.values().length];
            try {
                iArr[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionConfig(List list, ViewPort viewPort, List list2, Range FRAME_RATE_RANGE_UNSPECIFIED, Set set, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ViewPort viewPort2 = (i & 2) != 0 ? null : viewPort;
        List list4 = (i & 4) != 0 ? f0.f322471a : list2;
        if ((i & 8) != 0) {
            FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
        }
        this(list, viewPort2, list4, FRAME_RATE_RANGE_UNSPECIFIED, (i & 16) != 0 ? h0.f322473a : set, (i & 32) != 0 ? f0.f322471a : list3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void featureSelectionListener$lambda$0(Set set) {
    }

    private final String getUseCaseName(UseCase useCase) {
        return useCase instanceof Preview ? "Preview" : useCase instanceof ImageCapture ? "ImageCapture" : useCase instanceof ImageAnalysis ? "ImageAnalysis" : UseCaseUtil.isVideoCapture(useCase) ? "VideoCapture" : "UseCase";
    }

    private final void validateDefaultGroupableFeatureValues(UseCase useCase) {
        String strR;
        String str;
        String str2;
        String useCaseName = getUseCaseName(useCase);
        FeatureTypeInternal appConfiguredGroupableFeatureType$camera_core = UseCaseType.INSTANCE.getAppConfiguredGroupableFeatureType$camera_core(useCase);
        if (appConfiguredGroupableFeatureType$camera_core == null) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("A ");
        Intrinsics.h(appConfiguredGroupableFeatureType$camera_core);
        sb6.append(appConfiguredGroupableFeatureType$camera_core.name());
        sb6.append(" value is set to ");
        sb6.append(useCaseName);
        sb6.append(" despite using feature groups. Do not use APIs like ");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[appConfiguredGroupableFeatureType$camera_core.ordinal()];
        if (i == 1) {
            strR = a0.d.r(useCaseName, ".Builder.setDynamicRange");
        } else if (i == 2) {
            strR = a0.d.r(useCaseName, ".Builder.setTargetFrameRateRange");
        } else if (i == 3) {
            strR = UseCaseUtil.isVideoCapture(useCase) ? a0.d.r(useCaseName, ".Builder.setVideoStabilizationEnabled") : a0.d.r(useCaseName, ".Builder.setPreviewStabilizationEnabled");
        } else if (i == 4) {
            strR = a0.d.r(useCaseName, ".Builder.setOutputFormat");
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            strR = "Recorder.Builder.setQualitySelector";
        }
        sb6.append(strR);
        sb6.append(" while using feature groups. If, for example, ");
        int i2 = iArr[appConfiguredGroupableFeatureType$camera_core.ordinal()];
        if (i2 == 1) {
            str = "HDR";
        } else if (i2 == 2) {
            str = "60 FPS";
        } else if (i2 == 3) {
            str = "stabilization";
        } else if (i2 == 4) {
            str = "JPEG_R output format";
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UHD recording quality";
        }
        sb6.append(str);
        sb6.append(" is required, instead set ");
        int i3 = iArr[appConfiguredGroupableFeatureType$camera_core.ordinal()];
        if (i3 == 1) {
            str2 = "GroupableFeature.HDR_HLG10";
        } else if (i3 == 2) {
            str2 = "GroupableFeature.FPS_60";
        } else if (i3 == 3) {
            str2 = "GroupableFeature.PREVIEW_STABILIZATION";
        } else if (i3 == 4) {
            str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "GroupableFeatures.UHD_RECORDING";
        }
        throw new IllegalArgumentException(v0.a.i(sb6, str2, " as either a required or preferred feature.").toString());
    }

    private final void validateFeatureGroups() {
        if (this.requiredFeatureGroup.isEmpty() && this.preferredFeatureGroup.isEmpty()) {
            return;
        }
        validateRequiredFeatures();
        if (d0.U(this.preferredFeatureGroup).size() != this.preferredFeatureGroup.size()) {
            throw new IllegalArgumentException(m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.preferredFeatureGroup, new StringBuilder("Duplicate values in preferredFeatures(")).toString());
        }
        Set setH0 = d0.h0(this.requiredFeatureGroup, this.preferredFeatureGroup);
        if (!setH0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setH0).toString());
        }
        for (UseCase useCase : this.useCases) {
            if (UseCaseType.INSTANCE.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                throw new IllegalArgumentException((useCase + " is not supported with feature group").toString());
            }
            validateDefaultGroupableFeatureValues(useCase);
        }
    }

    private final void validateFrameRate() {
        if (Intrinsics.f(this.frameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            return;
        }
        Iterator<UseCase> it8 = this.useCases.iterator();
        while (it8.hasNext()) {
            if (it8.next().getAppConfig().hasTargetFrameRate()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    private final void validateRequiredFeatures() {
        Set<GroupableFeature> set = this.requiredFeatureGroup;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator<T> it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((GroupableFeature) it8.next()).getFeatureTypeInternal());
        }
        for (FeatureTypeInternal featureTypeInternal : d0.U(arrayList)) {
            Set<GroupableFeature> set2 = this.requiredFeatureGroup;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((GroupableFeature) obj2).getFeatureTypeInternal() == featureTypeInternal) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    public CameraFilter getCameraFilter() {
        return this.cameraFilter;
    }

    @NotNull
    public final List<CameraEffect> getEffects() {
        return this.effects;
    }

    @NotNull
    public final Consumer<Set<GroupableFeature>> getFeatureSelectionListener() {
        return this.featureSelectionListener;
    }

    @NotNull
    public final Executor getFeatureSelectionListenerExecutor() {
        return this.featureSelectionListenerExecutor;
    }

    @NotNull
    public final Range<Integer> getFrameRateRange() {
        return this.frameRateRange;
    }

    @NotNull
    public final List<GroupableFeature> getPreferredFeatureGroup() {
        return this.preferredFeatureGroup;
    }

    public abstract boolean getRequireNonEmptyUseCases();

    @NotNull
    public final Set<GroupableFeature> getRequiredFeatureGroup() {
        return this.requiredFeatureGroup;
    }

    public int getSessionType() {
        return this.sessionType;
    }

    @NotNull
    public final List<UseCase> getUseCases() {
        return this.useCases;
    }

    public final ViewPort getViewPort() {
        return this.viewPort;
    }

    /* JADX INFO: renamed from: isAutoRotationEnabled, reason: from getter */
    public boolean getIsAutoRotationEnabled() {
        return this.isAutoRotationEnabled;
    }

    /* JADX INFO: renamed from: isLegacy, reason: from getter */
    public boolean getIsLegacy() {
        return this.isLegacy;
    }

    @NotNull
    public String toString() {
        return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + this.useCases + ", frameRateRange=" + this.frameRateRange + ", requiredFeatureGroup=" + this.requiredFeatureGroup + ", preferredFeatureGroup=" + this.preferredFeatureGroup + ", effects=" + this.effects + ", viewPort=" + this.viewPort + CoreConstants.CURLY_RIGHT;
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Landroidx/camera/core/SessionConfig$Builder;", "", "", "Landroidx/camera/core/UseCase;", "useCases", "<init>", "(Ljava/util/List;)V", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "(Landroidx/camera/core/SessionConfig;)V", "Landroidx/camera/core/ViewPort;", "viewPort", "setViewPort", "(Landroidx/camera/core/ViewPort;)Landroidx/camera/core/SessionConfig$Builder;", "build", "()Landroidx/camera/core/SessionConfig;", "Ljava/util/List;", "Landroidx/camera/core/ViewPort;", "", "Landroidx/camera/core/CameraEffect;", "effects", "Landroid/util/Range;", "", "frameRateRange", "Landroid/util/Range;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "requiredFeatureGroup", "preferredFeatureGroup", "", "isAutoRotationEnabled", "Z", "Landroidx/camera/core/CameraFilter;", "cameraFilter", "Landroidx/camera/core/CameraFilter;", "sessionType", "I", "requireNonEmptyUseCases", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private CameraFilter cameraFilter;

        @NotNull
        private List<CameraEffect> effects;

        @NotNull
        private Range<Integer> frameRateRange;
        private boolean isAutoRotationEnabled;

        @NotNull
        private final List<GroupableFeature> preferredFeatureGroup;
        private boolean requireNonEmptyUseCases;

        @NotNull
        private final List<GroupableFeature> requiredFeatureGroup;
        private int sessionType;

        @NotNull
        private final List<UseCase> useCases;
        private ViewPort viewPort;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(@NotNull List<? extends UseCase> useCases) {
            Intrinsics.checkNotNullParameter(useCases, "useCases");
            this.useCases = useCases;
            this.effects = new ArrayList();
            Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
            this.frameRateRange = FRAME_RATE_RANGE_UNSPECIFIED;
            this.requiredFeatureGroup = new ArrayList();
            this.preferredFeatureGroup = new ArrayList();
            this.requireNonEmptyUseCases = true;
        }

        @NotNull
        public final SessionConfig build() {
            final List<UseCase> list = this.useCases;
            final ViewPort viewPort = this.viewPort;
            final List listD1 = d0.d1(this.effects);
            final Range<Integer> range = this.frameRateRange;
            final Set setI1 = d0.i1(this.requiredFeatureGroup);
            final List listD12 = d0.d1(this.preferredFeatureGroup);
            return new SessionConfig(this, list, viewPort, listD1, range, setI1, listD12) { // from class: androidx.camera.core.SessionConfig$Builder$build$1
                private final CameraFilter cameraFilter;
                private final boolean isAutoRotationEnabled;
                private final boolean requireNonEmptyUseCases;
                private final int sessionType;

                {
                    this.isAutoRotationEnabled = this.isAutoRotationEnabled;
                    this.cameraFilter = this.cameraFilter;
                    this.sessionType = this.sessionType;
                    this.requireNonEmptyUseCases = this.requireNonEmptyUseCases;
                }

                @Override // androidx.camera.core.SessionConfig
                public CameraFilter getCameraFilter() {
                    return this.cameraFilter;
                }

                @Override // androidx.camera.core.SessionConfig
                public boolean getRequireNonEmptyUseCases() {
                    return this.requireNonEmptyUseCases;
                }

                @Override // androidx.camera.core.SessionConfig
                public int getSessionType() {
                    return this.sessionType;
                }

                @Override // androidx.camera.core.SessionConfig
                /* JADX INFO: renamed from: isAutoRotationEnabled, reason: from getter */
                public boolean getIsAutoRotationEnabled() {
                    return this.isAutoRotationEnabled;
                }
            };
        }

        @NotNull
        public final Builder setViewPort(@NotNull ViewPort viewPort) {
            Intrinsics.checkNotNullParameter(viewPort, "viewPort");
            this.viewPort = viewPort;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull SessionConfig sessionConfig) {
            this(sessionConfig.getUseCases());
            Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
            this.viewPort = sessionConfig.getViewPort();
            this.effects = d0.f1(sessionConfig.getEffects());
            this.frameRateRange = sessionConfig.getFrameRateRange();
            this.requiredFeatureGroup.addAll(sessionConfig.getRequiredFeatureGroup());
            this.preferredFeatureGroup.addAll(sessionConfig.getPreferredFeatureGroup());
            this.isAutoRotationEnabled = sessionConfig.getIsAutoRotationEnabled();
            this.cameraFilter = sessionConfig.getCameraFilter();
            this.sessionType = sessionConfig.getSessionType();
            this.requireNonEmptyUseCases = sessionConfig.getRequireNonEmptyUseCases();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionConfig(@NotNull List<? extends UseCase> useCases, ViewPort viewPort, @NotNull List<? extends CameraEffect> effects, @NotNull Range<Integer> frameRateRange, @NotNull Set<? extends GroupableFeature> requiredFeatureGroup, @NotNull List<? extends GroupableFeature> preferredFeatureGroup) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
        Intrinsics.checkNotNullParameter(requiredFeatureGroup, "requiredFeatureGroup");
        Intrinsics.checkNotNullParameter(preferredFeatureGroup, "preferredFeatureGroup");
        this.viewPort = viewPort;
        this.effects = effects;
        this.frameRateRange = frameRateRange;
        this.requiredFeatureGroup = requiredFeatureGroup;
        this.preferredFeatureGroup = preferredFeatureGroup;
        this.useCases = d0.U(useCases);
        this.requireNonEmptyUseCases = true;
        this.featureSelectionListener = new m(0);
        ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceMainThreadExecutor, "mainThreadExecutor(...)");
        this.featureSelectionListenerExecutor = scheduledExecutorServiceMainThreadExecutor;
        if (getRequireNonEmptyUseCases() && useCases.isEmpty()) {
            throw new IllegalArgumentException("SessionConfig must contain at least one UseCase.");
        }
        validateFrameRate();
        validateFeatureGroups();
    }
}
