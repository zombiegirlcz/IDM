package com.fourthline.core.internal.devicedata;

import aem.v;
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
import qlm.x;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#Jd\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010!R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010#¨\u0006B"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionFrame;", "", "", "", "attitude", "rotationRate", "gravity", "acceleration", "heading", "", "timestamp", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DJ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$fourthline_core_release", "(Lcom/fourthline/core/internal/devicedata/MotionFrame;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "()D", "component6", "()J", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DJ)Lcom/fourthline/core/internal/devicedata/MotionFrame;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAttitude", "b", "getRotationRate", "c", "getGravity", "d", "getAcceleration", "e", "D", "getHeading", "f", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class MotionFrame {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Lazy[] f26327g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List attitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List rotationRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List gravity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List acceleration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double heading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long timestamp;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionFrame$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MotionFrame$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f26327g = new Lazy[]{j.c(kVar, new v(4)), j.c(kVar, new v(5)), j.c(kVar, new v(6)), j.c(kVar, new v(7)), null, j.c(kVar, new v(8))};
    }

    public /* synthetic */ MotionFrame(int i, List list, List list2, List list3, List list4, double d, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            j1.f(MotionFrame$$serializer.INSTANCE.getDescriptor(), i, 63);
            throw null;
        }
        this.attitude = list;
        this.rotationRate = list2;
        this.gravity = list3;
        this.acceleration = list4;
        this.heading = d;
        this.timestamp = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new e(x.f247723a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new e(x.f247723a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer c() {
        return new e(x.f247723a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MotionFrame copy$default(MotionFrame motionFrame, List list, List list2, List list3, List list4, double d, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = motionFrame.attitude;
        }
        if ((i & 2) != 0) {
            list2 = motionFrame.rotationRate;
        }
        if ((i & 4) != 0) {
            list3 = motionFrame.gravity;
        }
        if ((i & 8) != 0) {
            list4 = motionFrame.acceleration;
        }
        if ((i & 16) != 0) {
            d = motionFrame.heading;
        }
        if ((i & 32) != 0) {
            j2 = motionFrame.timestamp;
        }
        long j3 = j2;
        double d5 = d;
        return motionFrame.copy(list, list2, list3, list4, d5, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        return new e(x.f247723a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer e() {
        return new MotionTimestampSerializer();
    }

    @g(with = MotionTimestampSerializer.class)
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_core_release(MotionFrame self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f26327g;
        output.encodeSerializableElement(serialDesc, 0, (h) lazyArr[0].getValue(), self.attitude);
        output.encodeSerializableElement(serialDesc, 1, (h) lazyArr[1].getValue(), self.rotationRate);
        output.encodeSerializableElement(serialDesc, 2, (h) lazyArr[2].getValue(), self.gravity);
        output.encodeSerializableElement(serialDesc, 3, (h) lazyArr[3].getValue(), self.acceleration);
        output.encodeDoubleElement(serialDesc, 4, self.heading);
        output.encodeSerializableElement(serialDesc, 5, (h) lazyArr[5].getValue(), Long.valueOf(self.timestamp));
    }

    @NotNull
    public final List<Double> component1() {
        return this.attitude;
    }

    @NotNull
    public final List<Double> component2() {
        return this.rotationRate;
    }

    @NotNull
    public final List<Double> component3() {
        return this.gravity;
    }

    @NotNull
    public final List<Double> component4() {
        return this.acceleration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final MotionFrame copy(@NotNull List<Double> attitude, @NotNull List<Double> rotationRate, @NotNull List<Double> gravity, @NotNull List<Double> acceleration, double heading, long timestamp) {
        Intrinsics.checkNotNullParameter(attitude, "attitude");
        Intrinsics.checkNotNullParameter(rotationRate, "rotationRate");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(acceleration, "acceleration");
        return new MotionFrame(attitude, rotationRate, gravity, acceleration, heading, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionFrame)) {
            return false;
        }
        MotionFrame motionFrame = (MotionFrame) other;
        return Intrinsics.f(this.attitude, motionFrame.attitude) && Intrinsics.f(this.rotationRate, motionFrame.rotationRate) && Intrinsics.f(this.gravity, motionFrame.gravity) && Intrinsics.f(this.acceleration, motionFrame.acceleration) && Double.compare(this.heading, motionFrame.heading) == 0 && this.timestamp == motionFrame.timestamp;
    }

    @NotNull
    public final List<Double> getAcceleration() {
        return this.acceleration;
    }

    @NotNull
    public final List<Double> getAttitude() {
        return this.attitude;
    }

    @NotNull
    public final List<Double> getGravity() {
        return this.gravity;
    }

    public final double getHeading() {
        return this.heading;
    }

    @NotNull
    public final List<Double> getRotationRate() {
        return this.rotationRate;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((this.attitude.hashCode() * 31) + this.rotationRate.hashCode()) * 31) + this.gravity.hashCode()) * 31) + this.acceleration.hashCode()) * 31) + Double.hashCode(this.heading)) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "MotionFrame(attitude=" + this.attitude + ", rotationRate=" + this.rotationRate + ", gravity=" + this.gravity + ", acceleration=" + this.acceleration + ", heading=" + this.heading + ", timestamp=" + this.timestamp + ")";
    }

    public MotionFrame(@NotNull List<Double> attitude, @NotNull List<Double> rotationRate, @NotNull List<Double> gravity, @NotNull List<Double> acceleration, double d, long j2) {
        Intrinsics.checkNotNullParameter(attitude, "attitude");
        Intrinsics.checkNotNullParameter(rotationRate, "rotationRate");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(acceleration, "acceleration");
        this.attitude = attitude;
        this.rotationRate = rotationRate;
        this.gravity = gravity;
        this.acceleration = acceleration;
        this.heading = d;
        this.timestamp = j2;
    }
}
