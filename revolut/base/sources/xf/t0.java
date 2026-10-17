package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.i1;
import com.google.protobuf.m2;
import com.google.protobuf.y1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends com.google.protobuf.w0 implements u0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final t0 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private y1 counters_;
    private y1 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private i1 perfSessions_;
    private i1 subtraces_;

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        com.google.protobuf.w0.registerDefaultInstance(t0.class, t0Var);
    }

    private t0() {
        y1 y1Var = y1.f49836b;
        this.counters_ = y1Var;
        this.customAttributes_ = y1Var;
        this.name_ = "";
        this.subtraces_ = com.google.protobuf.w0.emptyProtobufList();
        this.perfSessions_ = com.google.protobuf.w0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends m0> iterable) {
        ensurePerfSessionsIsMutable();
        com.google.protobuf.b.addAll(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends t0> iterable) {
        ensureSubtracesIsMutable();
        com.google.protobuf.b.addAll(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(m0 m0Var) {
        m0Var.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(t0 t0Var) {
        t0Var.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = com.google.protobuf.w0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = com.google.protobuf.w0.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        i1 i1Var = this.perfSessions_;
        if (((com.google.protobuf.c) i1Var).f49688a) {
            return;
        }
        this.perfSessions_ = com.google.protobuf.w0.mutableCopy(i1Var);
    }

    private void ensureSubtracesIsMutable() {
        i1 i1Var = this.subtraces_;
        if (((com.google.protobuf.c) i1Var).f49688a) {
            return;
        }
        this.subtraces_ = com.google.protobuf.w0.mutableCopy(i1Var);
    }

    public static t0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private y1 internalGetCounters() {
        return this.counters_;
    }

    private y1 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private y1 internalGetMutableCounters() {
        y1 y1Var = this.counters_;
        if (!y1Var.f49837a) {
            this.counters_ = y1Var.c();
        }
        return this.counters_;
    }

    private y1 internalGetMutableCustomAttributes() {
        y1 y1Var = this.customAttributes_;
        if (!y1Var.f49837a) {
            this.customAttributes_ = y1Var.c();
        }
        return this.customAttributes_;
    }

    public static q0 newBuilder() {
        return (q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static t0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (t0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubtraces(int i) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j2) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationUs(long j2) {
        this.bitField0_ |= 8;
        this.durationUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.protobuf.p pVar) {
        this.name_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i, m0 m0Var) {
        m0Var.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtraces(int i, t0 t0Var) {
        t0Var.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.set(i, t0Var);
    }

    public boolean containsCounters(String str) {
        str.getClass();
        return internalGetCounters().containsKey(str);
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (p0.f304736a[v0Var.ordinal()]) {
            case 1:
                return new t0();
            case 2:
                return new q0(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", r0.f304737a, "subtraces_", t0.class, "customAttributes_", s0.f304739a, "perfSessions_", m0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (t0.class) {
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

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Deprecated
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    public int getCountersCount() {
        return internalGetCounters().size();
    }

    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    public long getCountersOrDefault(String str, long j2) {
        str.getClass();
        y1 y1VarInternalGetCounters = internalGetCounters();
        return y1VarInternalGetCounters.containsKey(str) ? ((Long) y1VarInternalGetCounters.get(str)).longValue() : j2;
    }

    public long getCountersOrThrow(String str) {
        str.getClass();
        y1 y1VarInternalGetCounters = internalGetCounters();
        if (y1VarInternalGetCounters.containsKey(str)) {
            return ((Long) y1VarInternalGetCounters.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        y1 y1VarInternalGetCustomAttributes = internalGetCustomAttributes();
        return y1VarInternalGetCustomAttributes.containsKey(str) ? (String) y1VarInternalGetCustomAttributes.get(str) : str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        y1 y1VarInternalGetCustomAttributes = internalGetCustomAttributes();
        if (y1VarInternalGetCustomAttributes.containsKey(str)) {
            return (String) y1VarInternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.protobuf.p getNameBytes() {
        return com.google.protobuf.p.d(this.name_);
    }

    public m0 getPerfSessions(int i) {
        return (m0) this.perfSessions_.get(i);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<m0> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public n0 getPerfSessionsOrBuilder(int i) {
        return (n0) this.perfSessions_.get(i);
    }

    public List<? extends n0> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public t0 getSubtraces(int i) {
        return (t0) this.subtraces_.get(i);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List<t0> getSubtracesList() {
        return this.subtraces_;
    }

    public u0 getSubtracesOrBuilder(int i) {
        return (u0) this.subtraces_.get(i);
    }

    public List<? extends u0> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static q0 newBuilder(t0 t0Var) {
        return (q0) DEFAULT_INSTANCE.createBuilder(t0Var);
    }

    public static t0 parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (t0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static t0 parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static t0 parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i, m0 m0Var) {
        m0Var.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(int i, t0 t0Var) {
        t0Var.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(i, t0Var);
    }

    public static t0 parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static t0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t0 parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static t0 parseFrom(InputStream inputStream) throws IOException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t0 parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static t0 parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static t0 parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (t0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
