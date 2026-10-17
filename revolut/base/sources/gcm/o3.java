package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class o3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ecm.c f142792g = ecm.c.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f142793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f142794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f142795c;
    public final Integer d;
    public final o5 e;
    public final s1 f;

    public o3(Map map, int i, int i2, boolean z) {
        long j2;
        boolean z3;
        o5 o5Var;
        s1 s1Var;
        this.f142793a = k2.i("timeout", map);
        this.f142794b = k2.b("waitForReady", map);
        Integer numF = k2.f("maxResponseMessageBytes", map);
        this.f142795c = numF;
        if (numF != null) {
            Preconditions.checkArgument(numF.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numF);
        }
        Integer numF2 = k2.f("maxRequestMessageBytes", map);
        this.d = numF2;
        if (numF2 != null) {
            Preconditions.checkArgument(numF2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numF2);
        }
        Map mapG = z ? k2.g("retryPolicy", map) : null;
        if (mapG == null) {
            j2 = 0;
            o5Var = null;
            z3 = true;
        } else {
            int iIntValue = ((Integer) Preconditions.checkNotNull(k2.f("maxAttempts", mapG), "maxAttempts cannot be empty")).intValue();
            Preconditions.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            long jLongValue = ((Long) Preconditions.checkNotNull(k2.i("initialBackoff", mapG), "initialBackoff cannot be empty")).longValue();
            Preconditions.checkArgument(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) Preconditions.checkNotNull(k2.i("maxBackoff", mapG), "maxBackoff cannot be empty")).longValue();
            j2 = 0;
            z3 = true;
            Preconditions.checkArgument(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d = (Double) Preconditions.checkNotNull(k2.e("backoffMultiplier", mapG), "backoffMultiplier cannot be empty");
            double dDoubleValue = d.doubleValue();
            Preconditions.checkArgument(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d);
            Long lI = k2.i("perAttemptRecvTimeout", mapG);
            Preconditions.checkArgument(lI == null || lI.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lI);
            Set setM = z5.m("retryableStatusCodes", mapG);
            Verify.verify(setM != null, "%s is required in retry policy", "retryableStatusCodes");
            Verify.verify(!setM.contains(ecm.e2.OK), "%s must not contain OK", "retryableStatusCodes");
            Preconditions.checkArgument((lI == null && setM.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            o5Var = new o5(iMin, jLongValue, jLongValue2, dDoubleValue, lI, setM);
        }
        this.e = o5Var;
        Map mapG2 = z ? k2.g("hedgingPolicy", map) : null;
        if (mapG2 == null) {
            s1Var = null;
        } else {
            int iIntValue2 = ((Integer) Preconditions.checkNotNull(k2.f("maxAttempts", mapG2), "maxAttempts cannot be empty")).intValue();
            Preconditions.checkArgument(iIntValue2 >= 2 ? z3 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, i2);
            long jLongValue3 = ((Long) Preconditions.checkNotNull(k2.i("hedgingDelay", mapG2), "hedgingDelay cannot be empty")).longValue();
            Preconditions.checkArgument(jLongValue3 >= j2 ? z3 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setM2 = z5.m("nonFatalStatusCodes", mapG2);
            if (setM2 == null) {
                setM2 = Collections.unmodifiableSet(EnumSet.noneOf(ecm.e2.class));
            } else {
                Verify.verify(!setM2.contains(ecm.e2.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            s1Var = new s1(iMin2, jLongValue3, setM2);
        }
        this.f = s1Var;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Objects.equal(this.f142793a, o3Var.f142793a) && Objects.equal(this.f142794b, o3Var.f142794b) && Objects.equal(this.f142795c, o3Var.f142795c) && Objects.equal(this.d, o3Var.d) && Objects.equal(this.e, o3Var.e) && Objects.equal(this.f, o3Var.f);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f142793a, this.f142794b, this.f142795c, this.d, this.e, this.f);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("timeoutNanos", this.f142793a).add("waitForReady", this.f142794b).add("maxInboundMessageSize", this.f142795c).add("maxOutboundMessageSize", this.d).add("retryPolicy", this.e).add("hedgingPolicy", this.f).toString();
    }
}
