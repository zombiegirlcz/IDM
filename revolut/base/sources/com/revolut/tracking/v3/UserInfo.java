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
import grl.xd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class UserInfo extends w0 implements e2 {
    public static final int CUSTOM_ID_FIELD_NUMBER = 3;
    private static final UserInfo DEFAULT_INSTANCE;
    public static final int IDENTITY_ID_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int REGISTERED_IDENTITY_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String identityId_ = "";
    private String registeredIdentityId_ = "";
    private String customId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(UserInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        UserInfo userInfo = new UserInfo();
        DEFAULT_INSTANCE = userInfo;
        w0.registerDefaultInstance(UserInfo.class, userInfo);
    }

    private UserInfo() {
    }

    private void clearCustomId() {
        this.bitField0_ &= -5;
        this.customId_ = getDefaultInstance().getCustomId();
    }

    private void clearIdentityId() {
        this.bitField0_ &= -2;
        this.identityId_ = getDefaultInstance().getIdentityId();
    }

    private void clearRegisteredIdentityId() {
        this.bitField0_ &= -3;
        this.registeredIdentityId_ = getDefaultInstance().getRegisteredIdentityId();
    }

    public static UserInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserInfo) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCustomId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.customId_ = str;
    }

    private void setCustomIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.customId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.identityId_ = str;
    }

    private void setIdentityIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.identityId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisteredIdentityId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.registeredIdentityId_ = str;
    }

    private void setRegisteredIdentityIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.registeredIdentityId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (xd.f146235a[v0Var.ordinal()]) {
            case 1:
                return new UserInfo();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "identityId_", "registeredIdentityId_", "customId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (UserInfo.class) {
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

    public String getCustomId() {
        return this.customId_;
    }

    public p getCustomIdBytes() {
        return p.d(this.customId_);
    }

    public String getIdentityId() {
        return this.identityId_;
    }

    public p getIdentityIdBytes() {
        return p.d(this.identityId_);
    }

    public String getRegisteredIdentityId() {
        return this.registeredIdentityId_;
    }

    public p getRegisteredIdentityIdBytes() {
        return p.d(this.registeredIdentityId_);
    }

    public boolean hasCustomId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdentityId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRegisteredIdentityId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(UserInfo userInfo) {
        return (a) DEFAULT_INSTANCE.createBuilder(userInfo);
    }

    public static UserInfo parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (UserInfo) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static UserInfo parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static UserInfo parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static UserInfo parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static UserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserInfo parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static UserInfo parseFrom(InputStream inputStream) throws IOException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfo parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static UserInfo parseFrom(t tVar) throws IOException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static UserInfo parseFrom(t tVar, d0 d0Var) throws IOException {
        return (UserInfo) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
