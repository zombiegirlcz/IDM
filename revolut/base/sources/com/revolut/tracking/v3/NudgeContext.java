package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.g7;
import grl.i7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class NudgeContext extends w0 implements e2 {
    public static final int ACTION_FIELD_NUMBER = 5;
    private static final NudgeContext DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INTERRUPTED_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private long duration_;
    private boolean interrupted_;
    private String id_ = "";
    private String type_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(NudgeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        NudgeContext nudgeContext = new NudgeContext();
        DEFAULT_INSTANCE = nudgeContext;
        w0.registerDefaultInstance(NudgeContext.class, nudgeContext);
    }

    private NudgeContext() {
    }

    private void clearAction() {
        this.bitField0_ &= -17;
        this.action_ = 0;
    }

    private void clearDuration() {
        this.bitField0_ &= -9;
        this.duration_ = 0L;
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearInterrupted() {
        this.bitField0_ &= -5;
        this.interrupted_ = false;
    }

    private void clearType() {
        this.bitField0_ &= -3;
        this.type_ = getDefaultInstance().getType();
    }

    public static NudgeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static NudgeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NudgeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NudgeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(i7 i7Var) {
        this.action_ = i7Var.getNumber();
        this.bitField0_ |= 16;
    }

    private void setActionValue(int i) {
        this.bitField0_ |= 16;
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j2) {
        this.bitField0_ |= 8;
        this.duration_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    private void setIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.id_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterrupted(boolean z) {
        this.bitField0_ |= 4;
        this.interrupted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.type_ = str;
    }

    private void setTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.type_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (g7.f146099a[v0Var.ordinal()]) {
            case 1:
                return new NudgeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "id_", "type_", "interrupted_", "duration_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (NudgeContext.class) {
                    try {
                        q0Var = PARSER;
                        if (q0Var == null) {
                            q0Var = new q0(DEFAULT_INSTANCE);
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

    public i7 getAction() {
        int i = this.action_;
        i7 i7Var = i != 0 ? i != 1 ? null : i7.Disappeared : i7.Appeared;
        return i7Var == null ? i7.UNRECOGNIZED : i7Var;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public boolean getInterrupted() {
        return this.interrupted_;
    }

    public String getType() {
        return this.type_;
    }

    public p getTypeBytes() {
        return p.d(this.type_);
    }

    public boolean hasAction() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDuration() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInterrupted() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(NudgeContext nudgeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(nudgeContext);
    }

    public static NudgeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (NudgeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static NudgeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static NudgeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static NudgeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static NudgeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NudgeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static NudgeContext parseFrom(InputStream inputStream) throws IOException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NudgeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static NudgeContext parseFrom(t tVar) throws IOException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static NudgeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (NudgeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
