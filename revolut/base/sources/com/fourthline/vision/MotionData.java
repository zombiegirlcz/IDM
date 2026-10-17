package com.fourthline.vision;

import aem.v;
import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.core.internal.devicedata.MotionFrame$$serializer;
import com.fourthline.core.internal.devicedata.MotionTimestampSerializer;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0007\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001fR \u0010\u000b\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010%R \u0010\r\u001a\u00020\f8\u0006X\u0087D¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010#R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/fourthline/vision/MotionData;", "", "", "videoStartTimestamp", "", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "motionFrames", "<init>", "(JLjava/util/List;)V", "", "seen0", "version", "", "platform", "", "attitudeIsAbsolute", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/util/List;ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$fourthline_vision_release", "(Lcom/fourthline/vision/MotionData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/fourthline/vision/MotionData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getVideoStartTimestamp", "getVideoStartTimestamp$annotations", "()V", "b", "Ljava/util/List;", "getMotionFrames", "c", "I", "getVersion", "getVersion$annotations", "d", "Ljava/lang/String;", "getPlatform", "getPlatform$annotations", "e", "Z", "getAttitudeIsAbsolute", "()Z", "getAttitudeIsAbsolute$annotations", "Companion", "$serializer", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class MotionData {
    private static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long videoStartTimestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List motionFrames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String platform;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean attitudeIsAbsolute;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/fourthline/vision/MotionData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/fourthline/vision/MotionData;", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MotionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f = new Lazy[]{j.c(kVar, new v(10)), j.c(kVar, new v(11)), null, null, null};
    }

    public /* synthetic */ MotionData(int i, long j2, List list, int i2, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(MotionData$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.videoStartTimestamp = j2;
        this.motionFrames = list;
        if ((i & 4) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
        if ((i & 8) == 0) {
            this.platform = "android";
        } else {
            this.platform = str;
        }
        if ((i & 16) == 0) {
            this.attitudeIsAbsolute = true;
        } else {
            this.attitudeIsAbsolute = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new MotionTimestampSerializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new e(MotionFrame$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MotionData copy$default(MotionData motionData, long j2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = motionData.videoStartTimestamp;
        }
        if ((i & 2) != 0) {
            list = motionData.motionFrames;
        }
        return motionData.copy(j2, list);
    }

    public static /* synthetic */ void getAttitudeIsAbsolute$annotations() {
    }

    public static /* synthetic */ void getPlatform$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    @g(with = MotionTimestampSerializer.class)
    public static /* synthetic */ void getVideoStartTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_vision_release(MotionData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeSerializableElement(serialDesc, 0, (h) lazyArr[0].getValue(), Long.valueOf(self.videoStartTimestamp));
        output.encodeSerializableElement(serialDesc, 1, (h) lazyArr[1].getValue(), self.motionFrames);
        output.encodeIntElement(serialDesc, 2, self.version);
        output.encodeStringElement(serialDesc, 3, self.platform);
        output.encodeBooleanElement(serialDesc, 4, self.attitudeIsAbsolute);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    @NotNull
    public final List<MotionFrame> component2() {
        return this.motionFrames;
    }

    @NotNull
    public final MotionData copy(long videoStartTimestamp, @NotNull List<MotionFrame> motionFrames) {
        Intrinsics.checkNotNullParameter(motionFrames, "motionFrames");
        return new MotionData(videoStartTimestamp, motionFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionData)) {
            return false;
        }
        MotionData motionData = (MotionData) other;
        return this.videoStartTimestamp == motionData.videoStartTimestamp && Intrinsics.f(this.motionFrames, motionData.motionFrames);
    }

    public final boolean getAttitudeIsAbsolute() {
        return this.attitudeIsAbsolute;
    }

    @NotNull
    public final List<MotionFrame> getMotionFrames() {
        return this.motionFrames;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public final int getVersion() {
        return this.version;
    }

    public final long getVideoStartTimestamp() {
        return this.videoStartTimestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.videoStartTimestamp) * 31) + this.motionFrames.hashCode();
    }

    @NotNull
    public String toString() {
        return "MotionData(videoStartTimestamp=" + this.videoStartTimestamp + ", motionFrames=" + this.motionFrames + ")";
    }

    public MotionData(long j2, @NotNull List<MotionFrame> motionFrames) {
        Intrinsics.checkNotNullParameter(motionFrames, "motionFrames");
        this.videoStartTimestamp = j2;
        this.motionFrames = motionFrames;
        this.version = 1;
        this.platform = "android";
        this.attitudeIsAbsolute = true;
    }
}
