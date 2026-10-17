package ggc;

import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OutletAvailabilityInterval f143671a = new OutletAvailabilityInterval(new LocalTime("00:00"), new LocalTime("23:59"));

    public static final boolean a(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        a0 a0Var = lVar.f143644h.f;
        a0.Companion.getClass();
        return Intrinsics.f(a0Var, a0.f143607c);
    }

    public static final boolean b(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        y yVar = lVar.f143644h;
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        return yVar.f143675g == b0.PREMIUM_PARTNERSHIP;
    }
}
