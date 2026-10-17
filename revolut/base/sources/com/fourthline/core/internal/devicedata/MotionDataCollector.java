package com.fourthline.core.internal.devicedata;

import aem.q;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import gim.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u0018\u0010\u001fJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b\u0016\u0010\"J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020#H\u0002¢\u0006\u0004\b\u0019\u0010$J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020#H\u0002¢\u0006\u0004\b\u0016\u0010$J\u001b\u0010\u0016\u001a\u00020\r2\n\u0010&\u001a\u00020%\"\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010'J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u001aH\u0002¢\u0006\u0004\b\u0016\u0010(J\u0013\u0010\u0016\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050 ¢\u0006\u0004\b,\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010>\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00101R\u0014\u0010B\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00101R\u0014\u0010F\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00109R\u0018\u0010H\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00109R\u0016\u0010J\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00101R\u0014\u0010M\u001a\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010L¨\u0006O"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionDataCollector;", "Lcom/fourthline/core/internal/devicedata/DeviceDataCollector;", "Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;", "helper", "", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "destination", "", "", "", "motionMetadata", "", "enabled", "", "collectionInterval", "Lcom/fourthline/core/internal/devicedata/MotionFusedOrientationNormalizer;", "fallbackOrientationNormalizer", "<init>", "(Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;Ljava/util/List;Ljava/util/Map;ZJLcom/fourthline/core/internal/devicedata/MotionFusedOrientationNormalizer;)V", "Landroid/hardware/SensorEvent;", "event", "", "a", "(Landroid/hardware/SensorEvent;)V", "c", "b", "Lcom/fourthline/core/internal/devicedata/b;", "d", "()Lcom/fourthline/core/internal/devicedata/b;", "Lcom/fourthline/core/internal/devicedata/Orientation;", "e", "()Lcom/fourthline/core/internal/devicedata/Orientation;", "", "", "()Ljava/util/List;", "", "([F)Ljava/util/List;", "", "timestamps", "([J)J", "(Lcom/fourthline/core/internal/devicedata/b;)Ljava/util/List;", "(J)J", "startDataCollection", "()V", "stop", "Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;", "Ljava/util/List;", "Ljava/util/Map;", "Z", "J", "f", "Lcom/fourthline/core/internal/devicedata/MotionFusedOrientationNormalizer;", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "collectionJob", "h", "[F", "gravity", "i", "orientationAngles", "j", "rotationRate", "k", "gyroscopeTimestamp", "l", "linearAcceleration", "m", "accelerometerTimestamp", "n", "rotationMatrix", "o", "lastRotationVector", "p", "lastRotationTimestamp", "Lcom/fourthline/core/internal/devicedata/a;", "()Lcom/fourthline/core/internal/devicedata/a;", "motionFrameData", "Companion", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MotionDataCollector implements DeviceDataCollector {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List f26314q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidDataCollectorHelper helper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map motionMetadata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long collectionInterval;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final MotionFusedOrientationNormalizer fallbackOrientationNormalizer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Job collectionJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float[] gravity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float[] orientationAngles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float[] rotationRate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long gyroscopeTimestamp;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float[] linearAcceleration;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long accelerometerTimestamp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float[] rotationMatrix;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float[] lastRotationVector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long lastRotationTimestamp;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f26345b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f26346c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class a extends i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26325a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return MotionDataCollector.this.new a(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:12:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.f26325a
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                yhm.o.b(r6)
                goto L27
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                yhm.o.b(r6)
            L18:
                com.fourthline.core.internal.devicedata.MotionDataCollector r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                long r3 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getCollectionInterval$p(r6)
                r5.f26325a = r2
                java.lang.Object r6 = skm.k0.b(r3, r5)
                if (r6 != r0) goto L27
                return r0
            L27:
                com.fourthline.core.internal.devicedata.MotionDataCollector r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                com.fourthline.core.internal.devicedata.a r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getMotionFrameData(r6)
                com.fourthline.core.internal.devicedata.MotionDataCollector r1 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                java.util.List r1 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getDestination$p(r1)
                com.fourthline.core.internal.devicedata.MotionFrame r3 = r6.b()
                r1.add(r3)
                com.fourthline.core.internal.devicedata.MotionDataCollector r1 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                java.util.Map r1 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getMotionMetadata$p(r1)
                boolean r6 = r6.a()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r3 = "attitudeIsAbsolute"
                r1.put(r3, r6)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.core.internal.devicedata.MotionDataCollector.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Double dValueOf = Double.valueOf(0.0d);
        f26314q = v.k(dValueOf, dValueOf, dValueOf);
    }

    public MotionDataCollector(@NotNull AndroidDataCollectorHelper helper, @NotNull List<MotionFrame> destination, @NotNull Map<String, Object> motionMetadata, boolean z, long j2, @NotNull MotionFusedOrientationNormalizer fallbackOrientationNormalizer) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(motionMetadata, "motionMetadata");
        Intrinsics.checkNotNullParameter(fallbackOrientationNormalizer, "fallbackOrientationNormalizer");
        this.helper = helper;
        this.destination = destination;
        this.motionMetadata = motionMetadata;
        this.enabled = z;
        this.collectionInterval = j2;
        this.fallbackOrientationNormalizer = fallbackOrientationNormalizer;
        System.identityHashCode(this);
        this.gravity = new float[3];
        this.orientationAngles = new float[3];
        this.rotationRate = new float[3];
        this.linearAcceleration = new float[3];
        this.rotationMatrix = new float[9];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(MotionDataCollector motionDataCollector, SensorEvent sensorEvent) {
        Sensor sensor;
        Integer numValueOf = (sensorEvent == null || (sensor = sensorEvent.sensor) == null) ? null : Integer.valueOf(sensor.getType());
        if (numValueOf != null && numValueOf.intValue() == 1) {
            motionDataCollector.a(sensorEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            motionDataCollector.c(sensorEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 11) {
            motionDataCollector.b(sensorEvent);
        }
        return Unit.f186387a;
    }

    private final void c(SensorEvent event) {
        this.gyroscopeTimestamp = event.timestamp;
        if (e() == null) {
            MotionFusedOrientationNormalizer motionFusedOrientationNormalizer = this.fallbackOrientationNormalizer;
            float[] values = event.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            motionFusedOrientationNormalizer.onGyroscopeEvent$fourthline_core_release(values, event.timestamp);
        }
        float[] fArr = event.values;
        System.arraycopy(fArr, 0, this.rotationRate, 0, fArr.length);
    }

    private final b d() {
        Orientation orientationE = e();
        if (orientationE != null) {
            return new b(orientationE, a(), this.lastRotationTimestamp, c.f26345b, true);
        }
        Orientation orientationC = c();
        return orientationC != null ? new b(orientationC, a(), a(this.gyroscopeTimestamp, this.accelerometerTimestamp), c.f26346c, false) : new b(new Orientation(0.0d, 0.0d, 0.0d, 0.0d), f26314q, 0L, c.d, false);
    }

    private final Orientation e() {
        float[] fArr = this.lastRotationVector;
        if (fArr != null && fArr.length >= 3) {
            try {
                SensorManager.getRotationMatrixFromVector(this.rotationMatrix, fArr);
                SensorManager.getOrientation(this.rotationMatrix, this.orientationAngles);
                double degrees = Math.toDegrees(this.orientationAngles[1]);
                double degrees2 = Math.toDegrees(this.orientationAngles[2]);
                double degrees3 = Math.toDegrees(this.orientationAngles[0]);
                double d = 360;
                return new Orientation(degrees, degrees2, -degrees3, (degrees3 + d) % d);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.enabled) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.helper;
            Job job2 = this.collectionJob;
            if (job2 != null) {
                job2.f(null);
            }
            this.collectionJob = e0.C(androidDataCollectorHelper, p0.f264002b, null, new a(null), 2);
            androidDataCollectorHelper.onSensorChanged(new q(this, 6));
        }
    }

    @NotNull
    public final List<MotionFrame> stop() {
        Job job2 = this.collectionJob;
        if (job2 != null) {
            job2.f(null);
        }
        return this.destination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.fourthline.core.internal.devicedata.a b() {
        b bVarD = d();
        long jA = a(bVarD.d());
        bVarD.c().b();
        return new com.fourthline.core.internal.devicedata.a(new MotionFrame(a(bVarD), bVarD.b(), b(this.gravity), b(this.linearAcceleration), bVarD.a().getAzimuth(), System.currentTimeMillis() - jA), bVarD.e());
    }

    private final void a(SensorEvent event) {
        this.accelerometerTimestamp = event.timestamp;
        float[] fArr = this.gravity;
        float f = fArr[0] * 0.8f;
        float f4 = 1 - 0.8f;
        float[] fArr2 = event.values;
        float f5 = f + (fArr2[0] * f4);
        fArr[0] = f5;
        float f6 = (fArr[1] * 0.8f) + (fArr2[1] * f4);
        fArr[1] = f6;
        float f32 = (fArr[2] * 0.8f) + (f4 * fArr2[2]);
        fArr[2] = f32;
        float[] fArr3 = this.linearAcceleration;
        fArr3[0] = fArr2[0] - f5;
        fArr3[1] = fArr2[1] - f6;
        fArr3[2] = fArr2[2] - f32;
    }

    private final Orientation c() {
        return this.fallbackOrientationNormalizer.currentFallbackOrientation$fourthline_core_release(this.gyroscopeTimestamp > 0);
    }

    private final List a() {
        if (this.gyroscopeTimestamp > 0) {
            return a(this.rotationRate);
        }
        return f26314q;
    }

    public /* synthetic */ MotionDataCollector(AndroidDataCollectorHelper androidDataCollectorHelper, List list, Map map, boolean z, long j2, MotionFusedOrientationNormalizer motionFusedOrientationNormalizer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidDataCollectorHelper, list, map, z, (i & 16) != 0 ? 1000L : j2, (i & 32) != 0 ? new MotionFusedOrientationNormalizer(0.0d, 1, null) : motionFusedOrientationNormalizer);
    }

    private final List a(b bVar) {
        Double dValueOf = Double.valueOf(0.0d);
        Orientation orientationA = bVar.a();
        int i = WhenMappings.$EnumSwitchMapping$0[bVar.c().ordinal()];
        if (i == 1) {
            return v.k(Double.valueOf(orientationA.getPitch()), Double.valueOf(orientationA.getRoll()), Double.valueOf(orientationA.getYaw()));
        }
        if (i == 2) {
            return v.k(Double.valueOf(orientationA.getPitch()), Double.valueOf(orientationA.getRoll()), Double.valueOf(orientationA.getYaw()));
        }
        if (i == 3) {
            return v.k(dValueOf, dValueOf, dValueOf);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void b(SensorEvent event) {
        float[] values = event.values;
        Intrinsics.checkNotNullExpressionValue(values, "values");
        float[] fArrCopyOf = Arrays.copyOf(values, values.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this.lastRotationVector = fArrCopyOf;
        this.lastRotationTimestamp = event.timestamp;
    }

    private final List b(float[] fArr) {
        List listS0 = kotlin.collections.d.s0(fArr);
        ArrayList arrayList = new ArrayList(w.t(listS0, 10));
        Iterator it8 = listS0.iterator();
        while (it8.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it8.next()).floatValue()));
        }
        return arrayList;
    }

    private final long a(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(SystemClock.elapsedRealtimeNanos() - j2, TimeUnit.NANOSECONDS);
    }

    private final List a(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Double.valueOf(Math.toDegrees(f)));
        }
        return arrayList;
    }

    private final long a(long... timestamps) {
        Long lValueOf;
        int length = timestamps.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lValueOf = null;
                break;
            }
            long j2 = timestamps[i];
            if (j2 > 0) {
                lValueOf = Long.valueOf(j2);
                break;
            }
            i++;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }
}
