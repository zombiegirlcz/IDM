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
import grl.o4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class HelpCenterContext extends w0 implements e2 {
    public static final int ACTIVE_REQUESTS_FIELD_NUMBER = 2;
    public static final int CHAT_BUTTON_FIELD_NUMBER = 6;
    private static final HelpCenterContext DEFAULT_INSTANCE;
    public static final int DIRECT_TO_CHAT_FIELD_NUMBER = 8;
    public static final int FAQ_TREE_FIELD_NUMBER = 5;
    public static final int MY_REQUESTS_FIELD_NUMBER = 7;
    public static final int OUTAGE_BANNER_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int PROACTIVE_SUPPORT_TROUBLESHOOTER_FIELD_NUMBER = 4;
    public static final int QUICK_HELP_FIELD_NUMBER = 10;
    public static final int SEARCH_FIELD_NUMBER = 1;
    public static final int SUGGESTED_ARTICLES_FIELD_NUMBER = 9;
    private boolean activeRequests_;
    private int bitField0_;
    private boolean chatButton_;
    private boolean directToChat_;
    private boolean faqTree_;
    private boolean myRequests_;
    private boolean outageBanner_;
    private boolean proactiveSupportTroubleshooter_;
    private boolean quickHelp_;
    private boolean search_;
    private boolean suggestedArticles_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(HelpCenterContext.DEFAULT_INSTANCE);
        }
    }

    static {
        HelpCenterContext helpCenterContext = new HelpCenterContext();
        DEFAULT_INSTANCE = helpCenterContext;
        w0.registerDefaultInstance(HelpCenterContext.class, helpCenterContext);
    }

    private HelpCenterContext() {
    }

    private void clearActiveRequests() {
        this.bitField0_ &= -3;
        this.activeRequests_ = false;
    }

    private void clearChatButton() {
        this.bitField0_ &= -33;
        this.chatButton_ = false;
    }

    private void clearDirectToChat() {
        this.bitField0_ &= -129;
        this.directToChat_ = false;
    }

    private void clearFaqTree() {
        this.bitField0_ &= -17;
        this.faqTree_ = false;
    }

    private void clearMyRequests() {
        this.bitField0_ &= -65;
        this.myRequests_ = false;
    }

    private void clearOutageBanner() {
        this.bitField0_ &= -5;
        this.outageBanner_ = false;
    }

    private void clearProactiveSupportTroubleshooter() {
        this.bitField0_ &= -9;
        this.proactiveSupportTroubleshooter_ = false;
    }

    private void clearQuickHelp() {
        this.bitField0_ &= -513;
        this.quickHelp_ = false;
    }

    private void clearSearch() {
        this.bitField0_ &= -2;
        this.search_ = false;
    }

    private void clearSuggestedArticles() {
        this.bitField0_ &= -257;
        this.suggestedArticles_ = false;
    }

    public static HelpCenterContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static HelpCenterContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HelpCenterContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HelpCenterContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveRequests(boolean z) {
        this.bitField0_ |= 2;
        this.activeRequests_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatButton(boolean z) {
        this.bitField0_ |= 32;
        this.chatButton_ = z;
    }

    private void setDirectToChat(boolean z) {
        this.bitField0_ |= 128;
        this.directToChat_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaqTree(boolean z) {
        this.bitField0_ |= 16;
        this.faqTree_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMyRequests(boolean z) {
        this.bitField0_ |= 64;
        this.myRequests_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutageBanner(boolean z) {
        this.bitField0_ |= 4;
        this.outageBanner_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProactiveSupportTroubleshooter(boolean z) {
        this.bitField0_ |= 8;
        this.proactiveSupportTroubleshooter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuickHelp(boolean z) {
        this.bitField0_ |= 512;
        this.quickHelp_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearch(boolean z) {
        this.bitField0_ |= 1;
        this.search_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedArticles(boolean z) {
        this.bitField0_ |= 256;
        this.suggestedArticles_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o4.f146158a[v0Var.ordinal()]) {
            case 1:
                return new HelpCenterContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"bitField0_", "search_", "activeRequests_", "outageBanner_", "proactiveSupportTroubleshooter_", "faqTree_", "chatButton_", "myRequests_", "directToChat_", "suggestedArticles_", "quickHelp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (HelpCenterContext.class) {
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

    public boolean getActiveRequests() {
        return this.activeRequests_;
    }

    public boolean getChatButton() {
        return this.chatButton_;
    }

    public boolean getDirectToChat() {
        return this.directToChat_;
    }

    public boolean getFaqTree() {
        return this.faqTree_;
    }

    public boolean getMyRequests() {
        return this.myRequests_;
    }

    public boolean getOutageBanner() {
        return this.outageBanner_;
    }

    public boolean getProactiveSupportTroubleshooter() {
        return this.proactiveSupportTroubleshooter_;
    }

    public boolean getQuickHelp() {
        return this.quickHelp_;
    }

    public boolean getSearch() {
        return this.search_;
    }

    public boolean getSuggestedArticles() {
        return this.suggestedArticles_;
    }

    public boolean hasActiveRequests() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasChatButton() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDirectToChat() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasFaqTree() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMyRequests() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasOutageBanner() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProactiveSupportTroubleshooter() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasQuickHelp() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasSearch() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSuggestedArticles() {
        return (this.bitField0_ & 256) != 0;
    }

    public static a newBuilder(HelpCenterContext helpCenterContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(helpCenterContext);
    }

    public static HelpCenterContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HelpCenterContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HelpCenterContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static HelpCenterContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static HelpCenterContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static HelpCenterContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HelpCenterContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static HelpCenterContext parseFrom(InputStream inputStream) throws IOException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HelpCenterContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HelpCenterContext parseFrom(t tVar) throws IOException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static HelpCenterContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (HelpCenterContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
