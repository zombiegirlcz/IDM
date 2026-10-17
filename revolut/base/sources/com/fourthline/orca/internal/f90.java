package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f90 implements qg0.a, ib.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28385c;
    private final int d;
    private final long e;
    private final bb0 f;

    public f90(String name, int i, int i2, long j2, bb0 bb0Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f28384b = name;
        this.f28385c = i;
        this.d = i2;
        this.e = j2;
        this.f = bb0Var;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f90)) {
            return false;
        }
        f90 f90Var = (f90) obj2;
        return Intrinsics.f(this.f28384b, f90Var.f28384b) && this.f28385c == f90Var.f28385c && this.d == f90Var.d && this.e == f90Var.e && Intrinsics.f(this.f, f90Var.f);
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        String strG;
        aim.f builder = new aim.f();
        builder.put("name", this.f28384b);
        builder.put("elapsed_time", Long.valueOf(getElapsedTime()));
        builder.put("status_code", Integer.valueOf(this.d));
        builder.put("request_size", Integer.valueOf(this.f28385c));
        bb0 bb0Var = this.f;
        if (bb0Var == null || (strG = bb0Var.g()) == null) {
            strG = "unknown";
        }
        builder.put("network_strength", strG);
        bb0 bb0Var2 = this.f;
        if (bb0Var2 != null) {
            aim.f builder2 = new aim.f();
            builder2.put("metrics_version", "v1");
            builder2.put("total_duration_ms", Long.valueOf(bb0Var2.p()));
            builder2.put("request_body_bytes_sent", Long.valueOf(bb0Var2.i()));
            builder2.put("response_body_bytes_received", Long.valueOf(bb0Var2.k()));
            Double dB = bb0Var2.b();
            if (dB != null) {
                builder2.put("dns_lookup_duration_ms", Double.valueOf(dB.doubleValue()));
            }
            Double dM = bb0Var2.m();
            if (dM != null) {
                builder2.put("tcp_connect_duration_ms", Double.valueOf(dM.doubleValue()));
            }
            Double dO = bb0Var2.o();
            if (dO != null) {
                builder2.put("tls_handshake_duration_ms", Double.valueOf(dO.doubleValue()));
            }
            Double dJ = bb0Var2.j();
            if (dJ != null) {
                builder2.put("request_upload_duration_ms", Double.valueOf(dJ.doubleValue()));
            }
            Double dN = bb0Var2.n();
            if (dN != null) {
                builder2.put("time_to_first_byte_ms", Double.valueOf(dN.doubleValue()));
            }
            Double dL = bb0Var2.l();
            if (dL != null) {
                builder2.put("response_download_duration_ms", Double.valueOf(dL.doubleValue()));
            }
            Double dE = bb0Var2.e();
            if (dE != null) {
                builder2.put("network_latency_ms", Double.valueOf(dE.doubleValue()));
            }
            Double dA = bb0Var2.a();
            if (dA != null) {
                builder2.put("backend_latency_ms", Double.valueOf(dA.doubleValue()));
            }
            Double dF = bb0Var2.f();
            if (dF != null) {
                builder2.put("network_phase_ms", Double.valueOf(dF.doubleValue()));
            }
            Double dQ = bb0Var2.q();
            if (dQ != null) {
                builder2.put("upload_throughput_kbps", Double.valueOf(dQ.doubleValue()));
            }
            Double dC = bb0Var2.c();
            if (dC != null) {
                builder2.put("download_throughput_kbps", Double.valueOf(dC.doubleValue()));
            }
            Boolean boolR = bb0Var2.r();
            if (boolR != null) {
                builder2.put("is_reused_connection", boolR);
            }
            String strH = bb0Var2.h();
            if (strH != null) {
                builder2.put("protocol_name", strH);
            }
            String strD = bb0Var2.d();
            if (strD != null) {
                builder2.put("latency_diagnosis", strD);
            }
            String strG2 = bb0Var2.g();
            if (strG2 != null) {
                builder2.put("network_strength", strG2);
            }
            Intrinsics.checkNotNullParameter(builder2, "builder");
            builder.put("metrics", builder2.b());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public long getElapsedTime() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "network_request_completed";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/network_request_completed/jsonschema/1-0-0";
    }

    public int hashCode() {
        int iHashCode = ((((((this.f28384b.hashCode() * 31) + Integer.hashCode(this.f28385c)) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31;
        bb0 bb0Var = this.f;
        return iHashCode + (bb0Var == null ? 0 : bb0Var.hashCode());
    }

    public String toString() {
        return "RequestCompleted(name=" + this.f28384b + ", requestSize=" + this.f28385c + ", statusCode=" + this.d + ", elapsedTime=" + this.e + ", metrics=" + this.f + ")";
    }
}
