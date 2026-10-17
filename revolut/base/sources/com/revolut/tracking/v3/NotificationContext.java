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
import grl.d7;
import grl.f7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class NotificationContext extends w0 implements e2 {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CATEGORYID_FIELD_NUMBER = 3;
    public static final int CATEGORY_FIELD_NUMBER = 2;
    private static final NotificationContext DEFAULT_INSTANCE;
    public static final int GROUPID_FIELD_NUMBER = 4;
    public static final int MESSAGEID_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int PUSHID_FIELD_NUMBER = 7;
    public static final int TEMPLATEID_FIELD_NUMBER = 6;
    private int action_;
    private int bitField0_;
    private String category_ = "";
    private String categoryId_ = "";
    private String groupId_ = "";
    private String messageId_ = "";
    private String templateId_ = "";
    private String pushId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(NotificationContext.DEFAULT_INSTANCE);
        }
    }

    static {
        NotificationContext notificationContext = new NotificationContext();
        DEFAULT_INSTANCE = notificationContext;
        w0.registerDefaultInstance(NotificationContext.class, notificationContext);
    }

    private NotificationContext() {
    }

    private void clearAction() {
        this.bitField0_ &= -2;
        this.action_ = 0;
    }

    private void clearCategory() {
        this.bitField0_ &= -3;
        this.category_ = getDefaultInstance().getCategory();
    }

    private void clearCategoryId() {
        this.bitField0_ &= -5;
        this.categoryId_ = getDefaultInstance().getCategoryId();
    }

    private void clearGroupId() {
        this.bitField0_ &= -9;
        this.groupId_ = getDefaultInstance().getGroupId();
    }

    private void clearMessageId() {
        this.bitField0_ &= -17;
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    private void clearPushId() {
        this.bitField0_ &= -65;
        this.pushId_ = getDefaultInstance().getPushId();
    }

    private void clearTemplateId() {
        this.bitField0_ &= -33;
        this.templateId_ = getDefaultInstance().getTemplateId();
    }

    public static NotificationContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(f7 f7Var) {
        this.action_ = f7Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setActionValue(int i) {
        this.bitField0_ |= 1;
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.category_ = str;
    }

    private void setCategoryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.category_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setCategoryId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.categoryId_ = str;
    }

    private void setCategoryIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.categoryId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.groupId_ = str;
    }

    private void setGroupIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.groupId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.messageId_ = str;
    }

    private void setMessageIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.messageId_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushId(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.pushId_ = str;
    }

    private void setPushIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.pushId_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemplateId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.templateId_ = str;
    }

    private void setTemplateIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.templateId_ = pVar.m();
        this.bitField0_ |= 32;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (d7.f146078a[v0Var.ordinal()]) {
            case 1:
                return new NotificationContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006", new Object[]{"bitField0_", "action_", "category_", "categoryId_", "groupId_", "messageId_", "templateId_", "pushId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (NotificationContext.class) {
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

    public f7 getAction() {
        f7 f7VarA = f7.a(this.action_);
        return f7VarA == null ? f7.UNRECOGNIZED : f7VarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getCategory() {
        return this.category_;
    }

    public p getCategoryBytes() {
        return p.d(this.category_);
    }

    public String getCategoryId() {
        return this.categoryId_;
    }

    public p getCategoryIdBytes() {
        return p.d(this.categoryId_);
    }

    public String getGroupId() {
        return this.groupId_;
    }

    public p getGroupIdBytes() {
        return p.d(this.groupId_);
    }

    public String getMessageId() {
        return this.messageId_;
    }

    public p getMessageIdBytes() {
        return p.d(this.messageId_);
    }

    public String getPushId() {
        return this.pushId_;
    }

    public p getPushIdBytes() {
        return p.d(this.pushId_);
    }

    public String getTemplateId() {
        return this.templateId_;
    }

    public p getTemplateIdBytes() {
        return p.d(this.templateId_);
    }

    public boolean hasAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCategoryId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGroupId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMessageId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPushId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTemplateId() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(NotificationContext notificationContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(notificationContext);
    }

    public static NotificationContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (NotificationContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static NotificationContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static NotificationContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static NotificationContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static NotificationContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static NotificationContext parseFrom(InputStream inputStream) throws IOException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static NotificationContext parseFrom(t tVar) throws IOException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static NotificationContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (NotificationContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
