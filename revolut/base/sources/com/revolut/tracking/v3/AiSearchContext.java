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
import grl.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class AiSearchContext extends w0 implements e2 {
    public static final int ANIMATION_COMPLETED_FIELD_NUMBER = 8;
    public static final int ANSWER_EXPLAINER_FIELD_NUMBER = 7;
    public static final int ARTICLES_FIELD_NUMBER = 5;
    private static final AiSearchContext DEFAULT_INSTANCE;
    public static final int FEATURE_FEEDBACK_VISIBLE_FIELD_NUMBER = 9;
    private static volatile m2 PARSER = null;
    public static final int SEARCH_BAR_CONTENT_FIELD_NUMBER = 1;
    public static final int SEARCH_REQUEST_ID_FIELD_NUMBER = 2;
    public static final int SELECTED_FAQ_KEY_FIELD_NUMBER = 4;
    public static final int SELECTED_SUGGESTION_STRING_FIELD_NUMBER = 3;
    public static final int SHORT_ANSWER_FIELD_NUMBER = 6;
    private boolean animationCompleted_;
    private int bitField0_;
    private boolean featureFeedbackVisible_;
    private y1 articles_ = y1.f49836b;
    private String searchBarContent_ = "";
    private String searchRequestId_ = "";
    private String selectedSuggestionString_ = "";
    private String selectedFaqKey_ = "";
    private String shortAnswer_ = "";
    private String answerExplainer_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106780a = new x1(k4.INT32, 0, k4.STRING, "");

        private a() {
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b extends p0 implements e2 {
        public /* synthetic */ b(int i) {
            this();
        }

        private b() {
            super(AiSearchContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AiSearchContext aiSearchContext = new AiSearchContext();
        DEFAULT_INSTANCE = aiSearchContext;
        w0.registerDefaultInstance(AiSearchContext.class, aiSearchContext);
    }

    private AiSearchContext() {
    }

    private void clearAnimationCompleted() {
        this.bitField0_ &= -65;
        this.animationCompleted_ = false;
    }

    private void clearAnswerExplainer() {
        this.bitField0_ &= -33;
        this.answerExplainer_ = getDefaultInstance().getAnswerExplainer();
    }

    private void clearFeatureFeedbackVisible() {
        this.bitField0_ &= -129;
        this.featureFeedbackVisible_ = false;
    }

    private void clearSearchBarContent() {
        this.bitField0_ &= -2;
        this.searchBarContent_ = getDefaultInstance().getSearchBarContent();
    }

    private void clearSearchRequestId() {
        this.bitField0_ &= -3;
        this.searchRequestId_ = getDefaultInstance().getSearchRequestId();
    }

    private void clearSelectedFaqKey() {
        this.bitField0_ &= -9;
        this.selectedFaqKey_ = getDefaultInstance().getSelectedFaqKey();
    }

    private void clearSelectedSuggestionString() {
        this.bitField0_ &= -5;
        this.selectedSuggestionString_ = getDefaultInstance().getSelectedSuggestionString();
    }

    private void clearShortAnswer() {
        this.bitField0_ &= -17;
        this.shortAnswer_ = getDefaultInstance().getShortAnswer();
    }

    public static AiSearchContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> getMutableArticlesMap() {
        return internalGetMutableArticles();
    }

    private y1 internalGetArticles() {
        return this.articles_;
    }

    private y1 internalGetMutableArticles() {
        y1 y1Var = this.articles_;
        if (!y1Var.f49837a) {
            this.articles_ = y1Var.c();
        }
        return this.articles_;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AiSearchContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AiSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AiSearchContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationCompleted(boolean z) {
        this.bitField0_ |= 64;
        this.animationCompleted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerExplainer(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.answerExplainer_ = str;
    }

    private void setAnswerExplainerBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.answerExplainer_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureFeedbackVisible(boolean z) {
        this.bitField0_ |= 128;
        this.featureFeedbackVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchBarContent(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.searchBarContent_ = str;
    }

    private void setSearchBarContentBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.searchBarContent_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchRequestId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.searchRequestId_ = str;
    }

    private void setSearchRequestIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.searchRequestId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedFaqKey(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.selectedFaqKey_ = str;
    }

    private void setSelectedFaqKeyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.selectedFaqKey_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedSuggestionString(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.selectedSuggestionString_ = str;
    }

    private void setSelectedSuggestionStringBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.selectedSuggestionString_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortAnswer(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.shortAnswer_ = str;
    }

    private void setShortAnswerBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.shortAnswer_ = pVar.m();
        this.bitField0_ |= 16;
    }

    public boolean containsArticles(int i) {
        return internalGetArticles().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (m.f146140a[v0Var.ordinal()]) {
            case 1:
                return new AiSearchContext();
            case 2:
                return new b(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u00052\u0006ለ\u0004\u0007ለ\u0005\bဇ\u0006\tဇ\u0007", new Object[]{"bitField0_", "searchBarContent_", "searchRequestId_", "selectedSuggestionString_", "selectedFaqKey_", "articles_", a.f106780a, "shortAnswer_", "answerExplainer_", "animationCompleted_", "featureFeedbackVisible_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AiSearchContext.class) {
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

    public boolean getAnimationCompleted() {
        return this.animationCompleted_;
    }

    public String getAnswerExplainer() {
        return this.answerExplainer_;
    }

    public p getAnswerExplainerBytes() {
        return p.d(this.answerExplainer_);
    }

    @Deprecated
    public Map<Integer, String> getArticles() {
        return getArticlesMap();
    }

    public int getArticlesCount() {
        return internalGetArticles().size();
    }

    public Map<Integer, String> getArticlesMap() {
        return Collections.unmodifiableMap(internalGetArticles());
    }

    public String getArticlesOrDefault(int i, String str) {
        y1 y1VarInternalGetArticles = internalGetArticles();
        return y1VarInternalGetArticles.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetArticles.get(Integer.valueOf(i)) : str;
    }

    public String getArticlesOrThrow(int i) {
        y1 y1VarInternalGetArticles = internalGetArticles();
        if (y1VarInternalGetArticles.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetArticles.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public boolean getFeatureFeedbackVisible() {
        return this.featureFeedbackVisible_;
    }

    public String getSearchBarContent() {
        return this.searchBarContent_;
    }

    public p getSearchBarContentBytes() {
        return p.d(this.searchBarContent_);
    }

    public String getSearchRequestId() {
        return this.searchRequestId_;
    }

    public p getSearchRequestIdBytes() {
        return p.d(this.searchRequestId_);
    }

    public String getSelectedFaqKey() {
        return this.selectedFaqKey_;
    }

    public p getSelectedFaqKeyBytes() {
        return p.d(this.selectedFaqKey_);
    }

    public String getSelectedSuggestionString() {
        return this.selectedSuggestionString_;
    }

    public p getSelectedSuggestionStringBytes() {
        return p.d(this.selectedSuggestionString_);
    }

    public String getShortAnswer() {
        return this.shortAnswer_;
    }

    public p getShortAnswerBytes() {
        return p.d(this.shortAnswer_);
    }

    public boolean hasAnimationCompleted() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasAnswerExplainer() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFeatureFeedbackVisible() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSearchBarContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSearchRequestId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSelectedFaqKey() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSelectedSuggestionString() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasShortAnswer() {
        return (this.bitField0_ & 16) != 0;
    }

    public static b newBuilder(AiSearchContext aiSearchContext) {
        return (b) DEFAULT_INSTANCE.createBuilder(aiSearchContext);
    }

    public static AiSearchContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AiSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AiSearchContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AiSearchContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AiSearchContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AiSearchContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AiSearchContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AiSearchContext parseFrom(InputStream inputStream) throws IOException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AiSearchContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AiSearchContext parseFrom(t tVar) throws IOException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AiSearchContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AiSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
