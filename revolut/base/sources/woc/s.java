package woc;

import ch.qos.logback.classic.Level;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import grl.b4;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Integer[] f298931a = {1000, Integer.valueOf(b4.EXPIRED_OR_INVALID_KEY_VALUE), 2500, Integer.valueOf(Level.TRACE_INT), 10000, Integer.valueOf(Level.INFO_INT), Integer.valueOf(LivenessConstants.LIVE_VIDEO_MAX_DURATION_MS), 50000, 100000, 200000, 250000, Integer.valueOf(LivenessConstants.OUT_OF_STORAGE_THRESHOLD_BYTES)};

    public static final class a {
        private a() {
        }
    }

    public static alc.g a(dj0.d goalTargetAmount) {
        Object next;
        Intrinsics.checkNotNullParameter(goalTargetAmount, "goalTargetAmount");
        dj0.d dVar = new dj0.d(0L, goalTargetAmount.f115083b);
        xi0.b bVar = goalTargetAmount.f115083b;
        dj0.d dVar2 = new dj0.d(0L, bVar);
        double d = goalTargetAmount.f115082a / 2500;
        Integer[] numArr = f298931a;
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        if (numArr.length != 0) {
            Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            numArr = (Comparable[]) objArrCopyOf;
            Intrinsics.checkNotNullParameter(numArr, "<this>");
            if (numArr.length > 1) {
                Arrays.sort(numArr);
            }
        }
        Iterator it8 = zhm.p.c(numArr).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Number) next).intValue() >= d) {
                break;
            }
        }
        return new alc.g(new alc.f(dVar, goalTargetAmount, dVar2, new dj0.d(((Integer) next) != null ? r11.intValue() : ((Number) d0.m0(r9)).intValue(), bVar)), new alc.f(new dj0.d(0L, bVar), new dj0.d(2500000L, bVar), new dj0.d(0L, bVar), new dj0.d(1000L, bVar)));
    }
}
