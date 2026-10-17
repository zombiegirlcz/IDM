package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.google.protobuf.w0 implements j0 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i0 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private k applicationInfo_;
    private int bitField0_;
    private x gaugeMetric_;
    private f0 networkRequestMetric_;
    private t0 traceMetric_;
    private y0 transportInfo_;

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        com.google.protobuf.w0.registerDefaultInstance(i0.class, i0Var);
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static i0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationInfo(k kVar) {
        kVar.getClass();
        k kVar2 = this.applicationInfo_;
        if (kVar2 == null || kVar2 == k.getDefaultInstance()) {
            this.applicationInfo_ = kVar;
        } else {
            i iVarNewBuilder = k.newBuilder(this.applicationInfo_);
            iVarNewBuilder.f(kVar);
            this.applicationInfo_ = (k) iVarNewBuilder.b();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetric(x xVar) {
        xVar.getClass();
        x xVar2 = this.gaugeMetric_;
        if (xVar2 == null || xVar2 == x.getDefaultInstance()) {
            this.gaugeMetric_ = xVar;
        } else {
            w wVarNewBuilder = x.newBuilder(this.gaugeMetric_);
            wVarNewBuilder.f(xVar);
            this.gaugeMetric_ = (x) wVarNewBuilder.b();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkRequestMetric(f0 f0Var) {
        f0Var.getClass();
        f0 f0Var2 = this.networkRequestMetric_;
        if (f0Var2 == null || f0Var2 == f0.getDefaultInstance()) {
            this.networkRequestMetric_ = f0Var;
        } else {
            z zVarNewBuilder = f0.newBuilder(this.networkRequestMetric_);
            zVarNewBuilder.f(f0Var);
            this.networkRequestMetric_ = (f0) zVarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceMetric(t0 t0Var) {
        t0Var.getClass();
        t0 t0Var2 = this.traceMetric_;
        if (t0Var2 == null || t0Var2 == t0.getDefaultInstance()) {
            this.traceMetric_ = t0Var;
        } else {
            q0 q0VarNewBuilder = t0.newBuilder(this.traceMetric_);
            q0VarNewBuilder.f(t0Var);
            this.traceMetric_ = (t0) q0VarNewBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(y0 y0Var) {
        y0Var.getClass();
        y0 y0Var2 = this.transportInfo_;
        if (y0Var2 == null || y0Var2 == y0.getDefaultInstance()) {
            this.transportInfo_ = y0Var;
        } else {
            w0 w0VarNewBuilder = y0.newBuilder(this.transportInfo_);
            w0VarNewBuilder.f(y0Var);
            this.transportInfo_ = (y0) w0VarNewBuilder.b();
        }
        this.bitField0_ |= 16;
    }

    public static h0 newBuilder() {
        return (h0) DEFAULT_INSTANCE.createBuilder();
    }

    public static i0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (i0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationInfo(k kVar) {
        kVar.getClass();
        this.applicationInfo_ = kVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetric(x xVar) {
        xVar.getClass();
        this.gaugeMetric_ = xVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRequestMetric(f0 f0Var) {
        f0Var.getClass();
        this.networkRequestMetric_ = f0Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceMetric(t0 t0Var) {
        t0Var.getClass();
        this.traceMetric_ = t0Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(y0 y0Var) {
        y0Var.getClass();
        this.transportInfo_ = y0Var;
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (g0.f304727a[v0Var.ordinal()]) {
            case 1:
                return new i0();
            case 2:
                return new h0(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (i0.class) {
                    try {
                        q0Var = PARSER;
                        if (q0Var == null) {
                            q0Var = new com.google.protobuf.q0(DEFAULT_INSTANCE);
                            PARSER = q0Var;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return q0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public k getApplicationInfo() {
        k kVar = this.applicationInfo_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    @Override // xf.j0
    public x getGaugeMetric() {
        x xVar = this.gaugeMetric_;
        return xVar == null ? x.getDefaultInstance() : xVar;
    }

    @Override // xf.j0
    public f0 getNetworkRequestMetric() {
        f0 f0Var = this.networkRequestMetric_;
        return f0Var == null ? f0.getDefaultInstance() : f0Var;
    }

    @Override // xf.j0
    public t0 getTraceMetric() {
        t0 t0Var = this.traceMetric_;
        return t0Var == null ? t0.getDefaultInstance() : t0Var;
    }

    public y0 getTransportInfo() {
        y0 y0Var = this.transportInfo_;
        return y0Var == null ? y0.getDefaultInstance() : y0Var;
    }

    public boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // xf.j0
    public boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // xf.j0
    public boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // xf.j0
    public boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public static h0 newBuilder(i0 i0Var) {
        return (h0) DEFAULT_INSTANCE.createBuilder(i0Var);
    }

    public static i0 parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (i0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static i0 parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static i0 parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static i0 parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static i0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i0 parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static i0 parseFrom(InputStream inputStream) throws IOException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i0 parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static i0 parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static i0 parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (i0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
