package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.j3;
import com.google.protobuf.k3;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.n6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class ItemPickerSearchContext extends w0 implements e2 {
    private static final ItemPickerSearchContext DEFAULT_INSTANCE;
    public static final int EVENT_START_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int SELECTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private k3 eventStartTimestamp_;
    private String query_ = "";
    private String items_ = "";
    private String selection_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ItemPickerSearchContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ItemPickerSearchContext itemPickerSearchContext = new ItemPickerSearchContext();
        DEFAULT_INSTANCE = itemPickerSearchContext;
        w0.registerDefaultInstance(ItemPickerSearchContext.class, itemPickerSearchContext);
    }

    private ItemPickerSearchContext() {
    }

    private void clearEventStartTimestamp() {
        this.eventStartTimestamp_ = null;
        this.bitField0_ &= -2;
    }

    private void clearItems() {
        this.bitField0_ &= -5;
        this.items_ = getDefaultInstance().getItems();
    }

    private void clearQuery() {
        this.bitField0_ &= -3;
        this.query_ = getDefaultInstance().getQuery();
    }

    private void clearSelection() {
        this.bitField0_ &= -9;
        this.selection_ = getDefaultInstance().getSelection();
    }

    public static ItemPickerSearchContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEventStartTimestamp(k3 k3Var) {
        k3Var.getClass();
        k3 k3Var2 = this.eventStartTimestamp_;
        if (k3Var2 == null || k3Var2 == k3.getDefaultInstance()) {
            this.eventStartTimestamp_ = k3Var;
        } else {
            j3 j3VarNewBuilder = k3.newBuilder(this.eventStartTimestamp_);
            j3VarNewBuilder.f(k3Var);
            this.eventStartTimestamp_ = (k3) j3VarNewBuilder.b();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ItemPickerSearchContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ItemPickerSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ItemPickerSearchContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventStartTimestamp(k3 k3Var) {
        k3Var.getClass();
        this.eventStartTimestamp_ = k3Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.items_ = str;
    }

    private void setItemsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.items_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.query_ = str;
    }

    private void setQueryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.query_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelection(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.selection_ = str;
    }

    private void setSelectionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.selection_ = pVar.m();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (n6.f146152a[v0Var.ordinal()]) {
            case 1:
                return new ItemPickerSearchContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "eventStartTimestamp_", "query_", "items_", "selection_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ItemPickerSearchContext.class) {
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

    public k3 getEventStartTimestamp() {
        k3 k3Var = this.eventStartTimestamp_;
        return k3Var == null ? k3.getDefaultInstance() : k3Var;
    }

    public String getItems() {
        return this.items_;
    }

    public p getItemsBytes() {
        return p.d(this.items_);
    }

    public String getQuery() {
        return this.query_;
    }

    public p getQueryBytes() {
        return p.d(this.query_);
    }

    public String getSelection() {
        return this.selection_;
    }

    public p getSelectionBytes() {
        return p.d(this.selection_);
    }

    public boolean hasEventStartTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasItems() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasQuery() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSelection() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(ItemPickerSearchContext itemPickerSearchContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(itemPickerSearchContext);
    }

    public static ItemPickerSearchContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ItemPickerSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ItemPickerSearchContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ItemPickerSearchContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ItemPickerSearchContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ItemPickerSearchContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ItemPickerSearchContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ItemPickerSearchContext parseFrom(InputStream inputStream) throws IOException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ItemPickerSearchContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ItemPickerSearchContext parseFrom(t tVar) throws IOException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ItemPickerSearchContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ItemPickerSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
