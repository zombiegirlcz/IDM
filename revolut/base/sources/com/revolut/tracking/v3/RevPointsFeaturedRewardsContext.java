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
import grl.q9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RevPointsFeaturedRewardsContext extends w0 implements e2 {
    private static final RevPointsFeaturedRewardsContext DEFAULT_INSTANCE;
    public static final int ITEMS_SHOWN_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String itemsShown_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RevPointsFeaturedRewardsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RevPointsFeaturedRewardsContext revPointsFeaturedRewardsContext = new RevPointsFeaturedRewardsContext();
        DEFAULT_INSTANCE = revPointsFeaturedRewardsContext;
        w0.registerDefaultInstance(RevPointsFeaturedRewardsContext.class, revPointsFeaturedRewardsContext);
    }

    private RevPointsFeaturedRewardsContext() {
    }

    private void clearItemsShown() {
        this.bitField0_ &= -2;
        this.itemsShown_ = getDefaultInstance().getItemsShown();
    }

    public static RevPointsFeaturedRewardsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RevPointsFeaturedRewardsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RevPointsFeaturedRewardsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemsShown(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.itemsShown_ = str;
    }

    private void setItemsShownBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.itemsShown_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (q9.f146183a[v0Var.ordinal()]) {
            case 1:
                return new RevPointsFeaturedRewardsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "itemsShown_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RevPointsFeaturedRewardsContext.class) {
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

    public String getItemsShown() {
        return this.itemsShown_;
    }

    public p getItemsShownBytes() {
        return p.d(this.itemsShown_);
    }

    public boolean hasItemsShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(RevPointsFeaturedRewardsContext revPointsFeaturedRewardsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(revPointsFeaturedRewardsContext);
    }

    public static RevPointsFeaturedRewardsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsFeaturedRewardsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(InputStream inputStream) throws IOException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(t tVar) throws IOException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RevPointsFeaturedRewardsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RevPointsFeaturedRewardsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
