package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e2;
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
public final class f0 extends com.google.protobuf.w0 implements e2 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final f0 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile m2 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private y1 customAttributes_ = y1.f49836b;
    private String url_ = "";
    private String responseContentType_ = "";
    private i1 perfSessions_ = com.google.protobuf.w0.emptyProtobufList();

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        com.google.protobuf.w0.registerDefaultInstance(f0.class, f0Var);
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends m0> iterable) {
        ensurePerfSessionsIsMutable();
        com.google.protobuf.b.addAll(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(m0 m0Var) {
        m0Var.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = com.google.protobuf.w0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        i1 i1Var = this.perfSessions_;
        if (((com.google.protobuf.c) i1Var).f49688a) {
            return;
        }
        this.perfSessions_ = com.google.protobuf.w0.mutableCopy(i1Var);
    }

    public static f0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private y1 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private y1 internalGetMutableCustomAttributes() {
        y1 y1Var = this.customAttributes_;
        if (!y1Var.f49837a) {
            this.customAttributes_ = y1Var.c();
        }
        return this.customAttributes_;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static f0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setClientStartTimeUs(long j2) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpMethod(d0 d0Var) {
        this.httpMethod_ = d0Var.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpResponseCode(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkClientErrorReason(e0 e0Var) {
        this.networkClientErrorReason_ = e0Var.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i, m0 m0Var) {
        m0Var.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestPayloadBytes(long j2) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentType(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentTypeBytes(com.google.protobuf.p pVar) {
        this.responseContentType_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponsePayloadBytes(long j2) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j2) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j2) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j2) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.protobuf.p pVar) {
        this.url_ = pVar.m();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (y.f304742a[v0Var.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new z();
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", c0.f304723b, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", c0.f304724c, "customAttributes_", a0.f304721a, "perfSessions_", m0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (f0.class) {
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

    public d0 getHttpMethod() {
        d0 d0VarA = d0.a(this.httpMethod_);
        return d0VarA == null ? d0.HTTP_METHOD_UNKNOWN : d0VarA;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public e0 getNetworkClientErrorReason() {
        e0 e0VarA = e0.a(this.networkClientErrorReason_);
        return e0VarA == null ? e0.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : e0VarA;
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

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public com.google.protobuf.p getResponseContentTypeBytes() {
        return com.google.protobuf.p.d(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.protobuf.p getUrlBytes() {
        return com.google.protobuf.p.d(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static z newBuilder(f0 f0Var) {
        return (z) DEFAULT_INSTANCE.createBuilder(f0Var);
    }

    public static f0 parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (f0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static f0 parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static f0 parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i, m0 m0Var) {
        m0Var.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, m0Var);
    }

    public static f0 parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static f0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f0 parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static f0 parseFrom(InputStream inputStream) throws IOException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f0 parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static f0 parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static f0 parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (f0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
