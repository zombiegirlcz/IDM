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
import grl.p4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class HelpCenterSearchContext extends w0 implements e2 {
    private static final HelpCenterSearchContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SEARCH_RESULT_FIELD_NUMBER = 2;
    public static final int SELECTED_KEY_FIELD_NUMBER = 1;
    private int bitField0_;
    private y1 searchResult_ = y1.f49836b;
    private String selectedKey_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(HelpCenterSearchContext.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106784a = new x1(k4.INT32, 0, k4.STRING, "");

        private b() {
        }
    }

    static {
        HelpCenterSearchContext helpCenterSearchContext = new HelpCenterSearchContext();
        DEFAULT_INSTANCE = helpCenterSearchContext;
        w0.registerDefaultInstance(HelpCenterSearchContext.class, helpCenterSearchContext);
    }

    private HelpCenterSearchContext() {
    }

    private void clearSelectedKey() {
        this.bitField0_ &= -2;
        this.selectedKey_ = getDefaultInstance().getSelectedKey();
    }

    public static HelpCenterSearchContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> getMutableSearchResultMap() {
        return internalGetMutableSearchResult();
    }

    private y1 internalGetMutableSearchResult() {
        y1 y1Var = this.searchResult_;
        if (!y1Var.f49837a) {
            this.searchResult_ = y1Var.c();
        }
        return this.searchResult_;
    }

    private y1 internalGetSearchResult() {
        return this.searchResult_;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static HelpCenterSearchContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HelpCenterSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HelpCenterSearchContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSelectedKey(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.selectedKey_ = str;
    }

    private void setSelectedKeyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.selectedKey_ = pVar.m();
        this.bitField0_ |= 1;
    }

    public boolean containsSearchResult(int i) {
        return internalGetSearchResult().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (p4.f146169a[v0Var.ordinal()]) {
            case 1:
                return new HelpCenterSearchContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"bitField0_", "selectedKey_", "searchResult_", b.f106784a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (HelpCenterSearchContext.class) {
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
    public Map<Integer, String> getSearchResult() {
        return getSearchResultMap();
    }

    public int getSearchResultCount() {
        return internalGetSearchResult().size();
    }

    public Map<Integer, String> getSearchResultMap() {
        return Collections.unmodifiableMap(internalGetSearchResult());
    }

    public String getSearchResultOrDefault(int i, String str) {
        y1 y1VarInternalGetSearchResult = internalGetSearchResult();
        return y1VarInternalGetSearchResult.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetSearchResult.get(Integer.valueOf(i)) : str;
    }

    public String getSearchResultOrThrow(int i) {
        y1 y1VarInternalGetSearchResult = internalGetSearchResult();
        if (y1VarInternalGetSearchResult.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetSearchResult.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public String getSelectedKey() {
        return this.selectedKey_;
    }

    public p getSelectedKeyBytes() {
        return p.d(this.selectedKey_);
    }

    public boolean hasSelectedKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(HelpCenterSearchContext helpCenterSearchContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(helpCenterSearchContext);
    }

    public static HelpCenterSearchContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HelpCenterSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HelpCenterSearchContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static HelpCenterSearchContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static HelpCenterSearchContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static HelpCenterSearchContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HelpCenterSearchContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static HelpCenterSearchContext parseFrom(InputStream inputStream) throws IOException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HelpCenterSearchContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HelpCenterSearchContext parseFrom(t tVar) throws IOException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static HelpCenterSearchContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (HelpCenterSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
