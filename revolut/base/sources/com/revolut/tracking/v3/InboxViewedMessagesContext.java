package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.k4;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import grl.g5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxViewedMessagesContext extends w0 implements e2 {
    private static final InboxViewedMessagesContext DEFAULT_INSTANCE;
    public static final int MESSAGE_IDS_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private y1 messageIds_ = y1.f49836b;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InboxViewedMessagesContext.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106785a = new x1(k4.INT32, 0, k4.STRING, "");

        private b() {
        }
    }

    static {
        InboxViewedMessagesContext inboxViewedMessagesContext = new InboxViewedMessagesContext();
        DEFAULT_INSTANCE = inboxViewedMessagesContext;
        w0.registerDefaultInstance(InboxViewedMessagesContext.class, inboxViewedMessagesContext);
    }

    private InboxViewedMessagesContext() {
    }

    public static InboxViewedMessagesContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<Integer, String> getMutableMessageIdsMap() {
        return internalGetMutableMessageIds();
    }

    private y1 internalGetMessageIds() {
        return this.messageIds_;
    }

    private y1 internalGetMutableMessageIds() {
        y1 y1Var = this.messageIds_;
        if (!y1Var.f49837a) {
            this.messageIds_ = y1Var.c();
        }
        return this.messageIds_;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InboxViewedMessagesContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InboxViewedMessagesContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxViewedMessagesContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsMessageIds(int i) {
        return internalGetMessageIds().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (g5.f146098a[v0Var.ordinal()]) {
            case 1:
                return new InboxViewedMessagesContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"messageIds_", b.f106785a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InboxViewedMessagesContext.class) {
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

    @Deprecated
    public Map<Integer, String> getMessageIds() {
        return getMessageIdsMap();
    }

    public int getMessageIdsCount() {
        return internalGetMessageIds().size();
    }

    public Map<Integer, String> getMessageIdsMap() {
        return Collections.unmodifiableMap(internalGetMessageIds());
    }

    public String getMessageIdsOrDefault(int i, String str) {
        y1 y1VarInternalGetMessageIds = internalGetMessageIds();
        return y1VarInternalGetMessageIds.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetMessageIds.get(Integer.valueOf(i)) : str;
    }

    public String getMessageIdsOrThrow(int i) {
        y1 y1VarInternalGetMessageIds = internalGetMessageIds();
        if (y1VarInternalGetMessageIds.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetMessageIds.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public static a newBuilder(InboxViewedMessagesContext inboxViewedMessagesContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(inboxViewedMessagesContext);
    }

    public static InboxViewedMessagesContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InboxViewedMessagesContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InboxViewedMessagesContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InboxViewedMessagesContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InboxViewedMessagesContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InboxViewedMessagesContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InboxViewedMessagesContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InboxViewedMessagesContext parseFrom(InputStream inputStream) throws IOException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxViewedMessagesContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InboxViewedMessagesContext parseFrom(t tVar) throws IOException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InboxViewedMessagesContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InboxViewedMessagesContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
