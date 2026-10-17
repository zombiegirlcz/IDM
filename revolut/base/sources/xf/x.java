package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e2;
import com.google.protobuf.i1;
import com.google.protobuf.m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x extends com.google.protobuf.w0 implements e2 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final x DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private u gaugeMetadata_;
    private String sessionId_ = "";
    private i1 cpuMetricReadings_ = com.google.protobuf.w0.emptyProtobufList();
    private i1 androidMemoryReadings_ = com.google.protobuf.w0.emptyProtobufList();

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.protobuf.w0.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends f> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        com.google.protobuf.b.addAll(iterable, this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends q> iterable) {
        ensureCpuMetricReadingsIsMutable();
        com.google.protobuf.b.addAll(iterable, this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(f fVar) {
        fVar.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(q qVar) {
        qVar.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = com.google.protobuf.w0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = com.google.protobuf.w0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        i1 i1Var = this.androidMemoryReadings_;
        if (((com.google.protobuf.c) i1Var).f49688a) {
            return;
        }
        this.androidMemoryReadings_ = com.google.protobuf.w0.mutableCopy(i1Var);
    }

    private void ensureCpuMetricReadingsIsMutable() {
        i1 i1Var = this.cpuMetricReadings_;
        if (((com.google.protobuf.c) i1Var).f49688a) {
            return;
        }
        this.cpuMetricReadings_ = com.google.protobuf.w0.mutableCopy(i1Var);
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetadata(u uVar) {
        uVar.getClass();
        u uVar2 = this.gaugeMetadata_;
        if (uVar2 == null || uVar2 == u.getDefaultInstance()) {
            this.gaugeMetadata_ = uVar;
        } else {
            t tVarNewBuilder = u.newBuilder(this.gaugeMetadata_);
            tVarNewBuilder.f(uVar);
            this.gaugeMetadata_ = (u) tVarNewBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (x) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCpuMetricReadings(int i) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i, f fVar) {
        fVar.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuMetricReadings(int i, q qVar) {
        qVar.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetadata(u uVar) {
        uVar.getClass();
        this.gaugeMetadata_ = uVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.protobuf.p pVar) {
        this.sessionId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v.f304740a[v0Var.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new w();
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", q.class, "gaugeMetadata_", "androidMemoryReadings_", f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (x.class) {
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

    public f getAndroidMemoryReadings(int i) {
        return (f) this.androidMemoryReadings_.get(i);
    }

    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    public List<f> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public g getAndroidMemoryReadingsOrBuilder(int i) {
        return (g) this.androidMemoryReadings_.get(i);
    }

    public List<? extends g> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    public q getCpuMetricReadings(int i) {
        return (q) this.cpuMetricReadings_.get(i);
    }

    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    public List<q> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public r getCpuMetricReadingsOrBuilder(int i) {
        return (r) this.cpuMetricReadings_.get(i);
    }

    public List<? extends r> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    public u getGaugeMetadata() {
        u uVar = this.gaugeMetadata_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.protobuf.p getSessionIdBytes() {
        return com.google.protobuf.p.d(this.sessionId_);
    }

    public boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static w newBuilder(x xVar) {
        return (w) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (x) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static x parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static x parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i, f fVar) {
        fVar.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(int i, q qVar) {
        qVar.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i, qVar);
    }

    public static x parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static x parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static x parseFrom(InputStream inputStream) throws IOException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static x parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static x parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (x) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
