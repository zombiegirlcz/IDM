package androidx.camera.core;

import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.Identifier;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001aB!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/camera/core/CameraIdentifier;", "", "", "", "cameraIds", "Landroidx/camera/core/impl/Identifier;", "compatibilityId", "<init>", "(Ljava/util/List;Landroidx/camera/core/impl/Identifier;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCameraIds", "()Ljava/util/List;", "Landroidx/camera/core/impl/Identifier;", "getCompatibilityId", "()Landroidx/camera/core/impl/Identifier;", "getInternalId", "internalId", "Factory", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraIdentifier {

    @NotNull
    private final List<String> cameraIds;
    private final Identifier compatibilityId;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/CameraIdentifier$Factory;", "", "<init>", "()V", "create", "Landroidx/camera/core/CameraIdentifier;", "cameraIds", "", "", "compatibilityId", "Landroidx/camera/core/impl/Identifier;", "primaryCameraId", "secondaryCameraId", "fromAdapterInfos", "primaryInfo", "Landroidx/camera/core/impl/AdapterCameraInfo;", "secondaryInfo", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory {

        @NotNull
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @NotNull
        public static final CameraIdentifier create(@NotNull String primaryCameraId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            return create$default(primaryCameraId, null, null, 6, null);
        }

        public static /* synthetic */ CameraIdentifier create$default(String str, String str2, Identifier identifier, int i, Object obj2) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                identifier = null;
            }
            return create(str, str2, identifier);
        }

        @NotNull
        public static final CameraIdentifier fromAdapterInfos(@NotNull AdapterCameraInfo primaryInfo, AdapterCameraInfo secondaryInfo) {
            Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
            String cameraId = secondaryInfo != null ? secondaryInfo.getCameraId() : null;
            Identifier compatibilityId = primaryInfo.getCameraConfig().getCompatibilityId();
            Intrinsics.checkNotNullExpressionValue(compatibilityId, "getCompatibilityId(...)");
            String cameraId2 = primaryInfo.getCameraId();
            Intrinsics.checkNotNullExpressionValue(cameraId2, "getCameraId(...)");
            return create(cameraId2, cameraId, compatibilityId);
        }

        @NotNull
        public static final CameraIdentifier create(@NotNull List<String> cameraIds, Identifier compatibilityId) {
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            return new CameraIdentifier(cameraIds, compatibilityId, null);
        }

        @NotNull
        public static final CameraIdentifier create(@NotNull String primaryCameraId, String secondaryCameraId, Identifier compatibilityId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            ArrayList arrayListN = v.n(primaryCameraId);
            if (secondaryCameraId != null) {
                arrayListN.add(secondaryCameraId);
            }
            return create(arrayListN, compatibilityId);
        }
    }

    public /* synthetic */ CameraIdentifier(List list, Identifier identifier, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, identifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraIdentifier)) {
            return false;
        }
        CameraIdentifier cameraIdentifier = (CameraIdentifier) other;
        return Intrinsics.f(this.cameraIds, cameraIdentifier.cameraIds) && Intrinsics.f(this.compatibilityId, cameraIdentifier.compatibilityId);
    }

    @NotNull
    public final List<String> getCameraIds() {
        return this.cameraIds;
    }

    @NotNull
    public final String getInternalId() {
        Preconditions.checkState(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) d0.b0(this.cameraIds);
    }

    public int hashCode() {
        int iHashCode = this.cameraIds.hashCode() * 31;
        Identifier identifier = this.compatibilityId;
        return iHashCode + (identifier != null ? identifier.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r9.cameraIds
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r7 = 0
            r8 = 62
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r1 = zhm.d0.k0(r2, r3, r4, r5, r6, r7, r8)
            r0.append(r1)
            androidx.camera.core.impl.Identifier r1 = r9.compatibilityId
            if (r1 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ", compatId="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = j6.a.u(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraIdentifier.toString():java.lang.String");
    }

    private CameraIdentifier(List<String> list, Identifier identifier) {
        this.cameraIds = list;
        this.compatibilityId = identifier;
        Preconditions.checkArgument(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
