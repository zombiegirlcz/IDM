package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.j3;
import com.google.protobuf.k3;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.revolut.tracking.v3.App;
import com.revolut.tracking.v3.MobileDevice;
import com.revolut.tracking.v3.Ownership;
import com.revolut.tracking.v3.ScreenMetadata;
import com.revolut.tracking.v3.UiInteraction;
import com.revolut.tracking.v3.UserInfo;
import com.revolut.tracking.v3.WebDevice;
import com.revolut.tracking.v3.WidgetDescription;
import grl.d9;
import grl.e3;
import grl.e8;
import grl.h;
import grl.h8;
import grl.h9;
import grl.ia;
import grl.k9;
import grl.kc;
import grl.ld;
import grl.nc;
import grl.ne;
import grl.o8;
import grl.od;
import grl.p3;
import grl.q;
import grl.q6;
import grl.r8;
import grl.s;
import grl.t3;
import grl.t6;
import grl.u7;
import grl.w2;
import grl.x0;
import grl.x4;
import grl.y1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class AnalyticEvent extends w0 implements e2 {
    public static final int ACTION_FIELD_NUMBER = 14;
    public static final int ANY_CONTEXT_FIELD_NUMBER = 23;
    public static final int APP_FIELD_NUMBER = 7;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 5;
    private static final AnalyticEvent DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 8;
    public static final int FEATURE_FLAGS_FIELD_NUMBER = 11;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEM_POSITION_FIELD_NUMBER = 17;
    public static final int METADATA_FIELD_NUMBER = 21;
    public static final int OWNERSHIP_FIELD_NUMBER = 24;
    private static volatile m2 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 20;
    public static final int PRODUCT_FIELD_NUMBER = 12;
    public static final int SCREEN_FIELD_NUMBER = 13;
    public static final int SECTION_FIELD_NUMBER = 15;
    public static final int SECTION_POSITION_FIELD_NUMBER = 16;
    public static final int SERVER_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int USER_ID_FIELD_NUMBER = 2;
    public static final int USER_INFO_FIELD_NUMBER = 22;
    public static final int VERSION_FIELD_NUMBER = 6;
    public static final int WIDGET_FIELD_NUMBER = 18;
    private Action action_;
    private com.google.protobuf.g anyContext_;
    private App app_;
    private int bitField0_;
    private k3 clientTimestamp_;
    private Device device_;
    private h3 featureFlags_;
    private int itemPosition_;
    private Metadata metadata_;
    private Ownership ownership_;
    private Product product_;
    private int sectionPosition_;
    private k3 serverTimestamp_;
    private UserInfo userInfo_;
    private int version_;
    private WidgetDescription widget_;
    private String id_ = "";
    private String userId_ = "";
    private String sessionId_ = "";
    private String screen_ = "";
    private String section_ = "";
    private String path_ = "";

    public static final class Action extends w0 implements e2 {
        private static final Action DEFAULT_INSTANCE;
        public static final int DYNAMIC_FIELD_NUMBER = 2;
        private static volatile m2 PARSER = null;
        public static final int STATIC_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        public static final class a extends p0 implements e2 {
            public /* synthetic */ a(int i) {
                this();
            }

            private a() {
                super(Action.DEFAULT_INSTANCE);
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            w0.registerDefaultInstance(Action.class, action);
        }

        private Action() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearDynamic() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearStatic() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Action parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Action) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamic(String str) {
            str.getClass();
            this.actionCase_ = 2;
            this.action_ = str;
        }

        private void setDynamicBytes(p pVar) {
            com.google.protobuf.b.checkByteStringIsUtf8(pVar);
            this.action_ = pVar.m();
            this.actionCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatic(s sVar) {
            this.action_ = Integer.valueOf(sVar.getNumber());
            this.actionCase_ = 1;
        }

        private void setStaticValue(int i) {
            this.actionCase_ = 1;
            this.action_ = Integer.valueOf(i);
        }

        @Override // com.google.protobuf.w0
        public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
            m2 q0Var;
            switch (q.f146178a[v0Var.ordinal()]) {
                case 1:
                    return new Action();
                case 2:
                    return new a(0);
                case 3:
                    return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000", new Object[]{"action_", "actionCase_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Action.class) {
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

        public com.revolut.tracking.v3.a getActionCase() {
            return com.revolut.tracking.v3.a.a(this.actionCase_);
        }

        public String getDynamic() {
            return this.actionCase_ == 2 ? (String) this.action_ : "";
        }

        public p getDynamicBytes() {
            return p.d(this.actionCase_ == 2 ? (String) this.action_ : "");
        }

        public s getStatic() {
            if (this.actionCase_ != 1) {
                return s.view;
            }
            s sVarA = s.a(((Integer) this.action_).intValue());
            return sVarA == null ? s.UNRECOGNIZED : sVarA;
        }

        public int getStaticValue() {
            if (this.actionCase_ == 1) {
                return ((Integer) this.action_).intValue();
            }
            return 0;
        }

        public boolean hasDynamic() {
            return this.actionCase_ == 2;
        }

        public boolean hasStatic() {
            return this.actionCase_ == 1;
        }

        public static a newBuilder(Action action) {
            return (a) DEFAULT_INSTANCE.createBuilder(action);
        }

        public static Action parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Action) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Action parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
        }

        public static Action parseFrom(p pVar) throws InvalidProtocolBufferException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static Action parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
        }

        public static Action parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Action parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
        }

        public static Action parseFrom(InputStream inputStream) throws IOException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Action parseFrom(t tVar) throws IOException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, tVar);
        }

        public static Action parseFrom(t tVar, d0 d0Var) throws IOException {
            return (Action) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
        }
    }

    public static final class Device extends w0 implements e2 {
        private static final Device DEFAULT_INSTANCE;
        public static final int MOBILE_FIELD_NUMBER = 9;
        private static volatile m2 PARSER = null;
        public static final int WEB_FIELD_NUMBER = 10;
        private int deviceCase_ = 0;
        private Object device_;

        public static final class a extends p0 implements e2 {
            public /* synthetic */ a(int i) {
                this();
            }

            private a() {
                super(Device.DEFAULT_INSTANCE);
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            w0.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        private void clearDevice() {
            this.deviceCase_ = 0;
            this.device_ = null;
        }

        private void clearMobile() {
            if (this.deviceCase_ == 9) {
                this.deviceCase_ = 0;
                this.device_ = null;
            }
        }

        private void clearWeb() {
            if (this.deviceCase_ == 10) {
                this.deviceCase_ = 0;
                this.device_ = null;
            }
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeMobile(MobileDevice mobileDevice) {
            mobileDevice.getClass();
            if (this.deviceCase_ != 9 || this.device_ == MobileDevice.getDefaultInstance()) {
                this.device_ = mobileDevice;
            } else {
                MobileDevice.a aVarNewBuilder = MobileDevice.newBuilder((MobileDevice) this.device_);
                aVarNewBuilder.f(mobileDevice);
                this.device_ = aVarNewBuilder.b();
            }
            this.deviceCase_ = 9;
        }

        private void mergeWeb(WebDevice webDevice) {
            webDevice.getClass();
            if (this.deviceCase_ != 10 || this.device_ == WebDevice.getDefaultInstance()) {
                this.device_ = webDevice;
            } else {
                WebDevice.a aVarNewBuilder = WebDevice.newBuilder((WebDevice) this.device_);
                aVarNewBuilder.f(webDevice);
                this.device_ = aVarNewBuilder.b();
            }
            this.deviceCase_ = 10;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMobile(MobileDevice mobileDevice) {
            mobileDevice.getClass();
            this.device_ = mobileDevice;
            this.deviceCase_ = 9;
        }

        private void setWeb(WebDevice webDevice) {
            webDevice.getClass();
            this.device_ = webDevice;
            this.deviceCase_ = 10;
        }

        @Override // com.google.protobuf.w0
        public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
            m2 q0Var;
            switch (q.f146178a[v0Var.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new a(0);
                case 3:
                    return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\t\n\u0002\u0000\u0000\u0000\t<\u0000\n<\u0000", new Object[]{"device_", "deviceCase_", MobileDevice.class, WebDevice.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Device.class) {
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

        public b getDeviceCase() {
            return b.a(this.deviceCase_);
        }

        public MobileDevice getMobile() {
            return this.deviceCase_ == 9 ? (MobileDevice) this.device_ : MobileDevice.getDefaultInstance();
        }

        public WebDevice getWeb() {
            return this.deviceCase_ == 10 ? (WebDevice) this.device_ : WebDevice.getDefaultInstance();
        }

        public boolean hasMobile() {
            return this.deviceCase_ == 9;
        }

        public boolean hasWeb() {
            return this.deviceCase_ == 10;
        }

        public static a newBuilder(Device device) {
            return (a) DEFAULT_INSTANCE.createBuilder(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Device) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
        }

        public static Device parseFrom(p pVar) throws InvalidProtocolBufferException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static Device parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Device parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Device parseFrom(t tVar) throws IOException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, tVar);
        }

        public static Device parseFrom(t tVar, d0 d0Var) throws IOException {
            return (Device) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
        }
    }

    public static final class Metadata extends w0 implements e2 {
        private static final Metadata DEFAULT_INSTANCE;
        private static volatile m2 PARSER = null;
        public static final int SCREEN_METADATA_FIELD_NUMBER = 2;
        public static final int UI_INTERACTION_FIELD_NUMBER = 1;
        private int metadataCase_ = 0;
        private Object metadata_;

        public static final class a extends p0 implements e2 {
            public /* synthetic */ a(int i) {
                this();
            }

            private a() {
                super(Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            w0.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        private void clearMetadata() {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }

        private void clearScreenMetadata() {
            if (this.metadataCase_ == 2) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        private void clearUiInteraction() {
            if (this.metadataCase_ == 1) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeScreenMetadata(ScreenMetadata screenMetadata) {
            screenMetadata.getClass();
            if (this.metadataCase_ != 2 || this.metadata_ == ScreenMetadata.getDefaultInstance()) {
                this.metadata_ = screenMetadata;
            } else {
                ScreenMetadata.a aVarNewBuilder = ScreenMetadata.newBuilder((ScreenMetadata) this.metadata_);
                aVarNewBuilder.f(screenMetadata);
                this.metadata_ = aVarNewBuilder.b();
            }
            this.metadataCase_ = 2;
        }

        private void mergeUiInteraction(UiInteraction uiInteraction) {
            uiInteraction.getClass();
            if (this.metadataCase_ != 1 || this.metadata_ == UiInteraction.getDefaultInstance()) {
                this.metadata_ = uiInteraction;
            } else {
                UiInteraction.a aVarNewBuilder = UiInteraction.newBuilder((UiInteraction) this.metadata_);
                aVarNewBuilder.f(uiInteraction);
                this.metadata_ = aVarNewBuilder.b();
            }
            this.metadataCase_ = 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenMetadata(ScreenMetadata screenMetadata) {
            screenMetadata.getClass();
            this.metadata_ = screenMetadata;
            this.metadataCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUiInteraction(UiInteraction uiInteraction) {
            uiInteraction.getClass();
            this.metadata_ = uiInteraction;
            this.metadataCase_ = 1;
        }

        @Override // com.google.protobuf.w0
        public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
            m2 q0Var;
            switch (q.f146178a[v0Var.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return new a(0);
                case 3:
                    return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"metadata_", "metadataCase_", UiInteraction.class, ScreenMetadata.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Metadata.class) {
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

        public c getMetadataCase() {
            return c.a(this.metadataCase_);
        }

        public ScreenMetadata getScreenMetadata() {
            return this.metadataCase_ == 2 ? (ScreenMetadata) this.metadata_ : ScreenMetadata.getDefaultInstance();
        }

        public UiInteraction getUiInteraction() {
            return this.metadataCase_ == 1 ? (UiInteraction) this.metadata_ : UiInteraction.getDefaultInstance();
        }

        public boolean hasScreenMetadata() {
            return this.metadataCase_ == 2;
        }

        public boolean hasUiInteraction() {
            return this.metadataCase_ == 1;
        }

        public static a newBuilder(Metadata metadata) {
            return (a) DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Metadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
        }

        public static Metadata parseFrom(p pVar) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static Metadata parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
        }

        public static Metadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
        }

        public static Metadata parseFrom(InputStream inputStream) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Metadata parseFrom(t tVar) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, tVar);
        }

        public static Metadata parseFrom(t tVar, d0 d0Var) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
        }
    }

    public static final class Product extends w0 implements e2 {
        public static final int ACQUIRING_FIELD_NUMBER = 7;
        public static final int AI_FIELD_NUMBER = 24;
        public static final int BACKOFFICE_FIELD_NUMBER = 4;
        public static final int BUSINESS_FIELD_NUMBER = 2;
        public static final int CHAT_UI_FIELD_NUMBER = 20;
        public static final int CRYPTO_EXCHANGE_FIELD_NUMBER = 9;
        public static final int DANTE_FIELD_NUMBER = 17;
        public static final int DATA_CATALOG_FIELD_NUMBER = 23;
        private static final Product DEFAULT_INSTANCE;
        public static final int DOCS_FIELD_NUMBER = 12;
        public static final int EOR_FIELD_NUMBER = 18;
        public static final int IDAVE_FIELD_NUMBER = 22;
        public static final int JUNIOR_FIELD_NUMBER = 8;
        public static final int KYC_FIELD_NUMBER = 13;
        private static volatile m2 PARSER = null;
        public static final int PEOPLE_FIELD_NUMBER = 5;
        public static final int PIGEON_FIELD_NUMBER = 14;
        public static final int POS_FIELD_NUMBER = 11;
        public static final int PROCESSING_FIELD_NUMBER = 10;
        public static final int RAMP_FIELD_NUMBER = 15;
        public static final int RELEASE_PLATFORM_FIELD_NUMBER = 21;
        public static final int RESERVATIONS_FIELD_NUMBER = 26;
        public static final int RETAIL_FIELD_NUMBER = 1;
        public static final int SHOPPER_FIELD_NUMBER = 16;
        public static final int SHOP_FIELD_NUMBER = 25;
        public static final int SSO_FIELD_NUMBER = 3;
        public static final int TEEN_FIELD_NUMBER = 27;
        public static final int TERMINAL_FIELD_NUMBER = 6;
        public static final int WEB_UI_KIT_FIELD_NUMBER = 19;
        private int productCase_ = 0;
        private Object product_;

        public static final class a extends p0 implements e2 {
            public /* synthetic */ a(int i) {
                this();
            }

            private a() {
                super(Product.DEFAULT_INSTANCE);
            }
        }

        static {
            Product product = new Product();
            DEFAULT_INSTANCE = product;
            w0.registerDefaultInstance(Product.class, product);
        }

        private Product() {
        }

        private void clearAcquiring() {
            if (this.productCase_ == 7) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearAi() {
            if (this.productCase_ == 24) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearBackoffice() {
            if (this.productCase_ == 4) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearBusiness() {
            if (this.productCase_ == 2) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearChatUi() {
            if (this.productCase_ == 20) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearCryptoExchange() {
            if (this.productCase_ == 9) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearDante() {
            if (this.productCase_ == 17) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearDataCatalog() {
            if (this.productCase_ == 23) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearDocs() {
            if (this.productCase_ == 12) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearEor() {
            if (this.productCase_ == 18) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearIdave() {
            if (this.productCase_ == 22) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearJunior() {
            if (this.productCase_ == 8) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearKyc() {
            if (this.productCase_ == 13) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearPeople() {
            if (this.productCase_ == 5) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearPigeon() {
            if (this.productCase_ == 14) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearPos() {
            if (this.productCase_ == 11) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearProcessing() {
            if (this.productCase_ == 10) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearProduct() {
            this.productCase_ = 0;
            this.product_ = null;
        }

        private void clearRamp() {
            if (this.productCase_ == 15) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearReleasePlatform() {
            if (this.productCase_ == 21) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearReservations() {
            if (this.productCase_ == 26) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearRetail() {
            if (this.productCase_ == 1) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearShop() {
            if (this.productCase_ == 25) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearShopper() {
            if (this.productCase_ == 16) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearSso() {
            if (this.productCase_ == 3) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearTeen() {
            if (this.productCase_ == 27) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearTerminal() {
            if (this.productCase_ == 6) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        private void clearWebUiKit() {
            if (this.productCase_ == 19) {
                this.productCase_ = 0;
                this.product_ = null;
            }
        }

        public static Product getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Product parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Product) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Product parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAcquiring(h hVar) {
            this.product_ = Integer.valueOf(hVar.getNumber());
            this.productCase_ = 7;
        }

        private void setAcquiringValue(int i) {
            this.productCase_ = 7;
            this.product_ = Integer.valueOf(i);
        }

        private void setAi(grl.c cVar) {
            this.product_ = Integer.valueOf(cVar.getNumber());
            this.productCase_ = 24;
        }

        private void setAiValue(int i) {
            this.productCase_ = 24;
            this.product_ = Integer.valueOf(i);
        }

        private void setBackoffice(grl.q0 q0Var) {
            this.product_ = Integer.valueOf(q0Var.getNumber());
            this.productCase_ = 4;
        }

        private void setBackofficeValue(int i) {
            this.productCase_ = 4;
            this.product_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBusiness(x0 x0Var) {
            this.product_ = Integer.valueOf(x0Var.getNumber());
            this.productCase_ = 2;
        }

        private void setBusinessValue(int i) {
            this.productCase_ = 2;
            this.product_ = Integer.valueOf(i);
        }

        private void setChatUi(y1 y1Var) {
            this.product_ = Integer.valueOf(y1Var.getNumber());
            this.productCase_ = 20;
        }

        private void setChatUiValue(int i) {
            this.productCase_ = 20;
            this.product_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCryptoExchange(w2 w2Var) {
            this.product_ = Integer.valueOf(w2Var.getNumber());
            this.productCase_ = 9;
        }

        private void setCryptoExchangeValue(int i) {
            this.productCase_ = 9;
            this.product_ = Integer.valueOf(i);
        }

        private void setDante(e3 e3Var) {
            this.product_ = Integer.valueOf(e3Var.getNumber());
            this.productCase_ = 17;
        }

        private void setDanteValue(int i) {
            this.productCase_ = 17;
            this.product_ = Integer.valueOf(i);
        }

        private void setDataCatalog(grl.h3 h3Var) {
            this.product_ = Integer.valueOf(h3Var.getNumber());
            this.productCase_ = 23;
        }

        private void setDataCatalogValue(int i) {
            this.productCase_ = 23;
            this.product_ = Integer.valueOf(i);
        }

        private void setDocs(p3 p3Var) {
            this.product_ = Integer.valueOf(p3Var.getNumber());
            this.productCase_ = 12;
        }

        private void setDocsValue(int i) {
            this.productCase_ = 12;
            this.product_ = Integer.valueOf(i);
        }

        private void setEor(t3 t3Var) {
            this.product_ = Integer.valueOf(t3Var.getNumber());
            this.productCase_ = 18;
        }

        private void setEorValue(int i) {
            this.productCase_ = 18;
            this.product_ = Integer.valueOf(i);
        }

        private void setIdave(x4 x4Var) {
            this.product_ = Integer.valueOf(x4Var.getNumber());
            this.productCase_ = 22;
        }

        private void setIdaveValue(int i) {
            this.productCase_ = 22;
            this.product_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJunior(q6 q6Var) {
            this.product_ = Integer.valueOf(q6Var.getNumber());
            this.productCase_ = 8;
        }

        private void setJuniorValue(int i) {
            this.productCase_ = 8;
            this.product_ = Integer.valueOf(i);
        }

        private void setKyc(t6 t6Var) {
            this.product_ = Integer.valueOf(t6Var.getNumber());
            this.productCase_ = 13;
        }

        private void setKycValue(int i) {
            this.productCase_ = 13;
            this.product_ = Integer.valueOf(i);
        }

        private void setPeople(e8 e8Var) {
            this.product_ = Integer.valueOf(e8Var.getNumber());
            this.productCase_ = 5;
        }

        private void setPeopleValue(int i) {
            this.productCase_ = 5;
            this.product_ = Integer.valueOf(i);
        }

        private void setPigeon(h8 h8Var) {
            this.product_ = Integer.valueOf(h8Var.getNumber());
            this.productCase_ = 14;
        }

        private void setPigeonValue(int i) {
            this.productCase_ = 14;
            this.product_ = Integer.valueOf(i);
        }

        private void setPos(u7 u7Var) {
            this.product_ = Integer.valueOf(u7Var.getNumber());
            this.productCase_ = 11;
        }

        private void setPosValue(int i) {
            this.productCase_ = 11;
            this.product_ = Integer.valueOf(i);
        }

        private void setProcessing(o8 o8Var) {
            this.product_ = Integer.valueOf(o8Var.getNumber());
            this.productCase_ = 10;
        }

        private void setProcessingValue(int i) {
            this.productCase_ = 10;
            this.product_ = Integer.valueOf(i);
        }

        private void setRamp(r8 r8Var) {
            this.product_ = Integer.valueOf(r8Var.getNumber());
            this.productCase_ = 15;
        }

        private void setRampValue(int i) {
            this.productCase_ = 15;
            this.product_ = Integer.valueOf(i);
        }

        private void setReleasePlatform(d9 d9Var) {
            this.product_ = Integer.valueOf(d9Var.getNumber());
            this.productCase_ = 21;
        }

        private void setReleasePlatformValue(int i) {
            this.productCase_ = 21;
            this.product_ = Integer.valueOf(i);
        }

        private void setReservations(h9 h9Var) {
            this.product_ = Integer.valueOf(h9Var.getNumber());
            this.productCase_ = 26;
        }

        private void setReservationsValue(int i) {
            this.productCase_ = 26;
            this.product_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetail(k9 k9Var) {
            this.product_ = Integer.valueOf(k9Var.getNumber());
            this.productCase_ = 1;
        }

        private void setRetailValue(int i) {
            this.productCase_ = 1;
            this.product_ = Integer.valueOf(i);
        }

        private void setShop(kc kcVar) {
            this.product_ = Integer.valueOf(kcVar.getNumber());
            this.productCase_ = 25;
        }

        private void setShopValue(int i) {
            this.productCase_ = 25;
            this.product_ = Integer.valueOf(i);
        }

        private void setShopper(nc ncVar) {
            this.product_ = Integer.valueOf(ncVar.getNumber());
            this.productCase_ = 16;
        }

        private void setShopperValue(int i) {
            this.productCase_ = 16;
            this.product_ = Integer.valueOf(i);
        }

        private void setSso(ia iaVar) {
            this.product_ = Integer.valueOf(iaVar.getNumber());
            this.productCase_ = 3;
        }

        private void setSsoValue(int i) {
            this.productCase_ = 3;
            this.product_ = Integer.valueOf(i);
        }

        private void setTeen(ld ldVar) {
            this.product_ = Integer.valueOf(ldVar.getNumber());
            this.productCase_ = 27;
        }

        private void setTeenValue(int i) {
            this.productCase_ = 27;
            this.product_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTerminal(od odVar) {
            this.product_ = Integer.valueOf(odVar.getNumber());
            this.productCase_ = 6;
        }

        private void setTerminalValue(int i) {
            this.productCase_ = 6;
            this.product_ = Integer.valueOf(i);
        }

        private void setWebUiKit(ne neVar) {
            this.product_ = Integer.valueOf(neVar.getNumber());
            this.productCase_ = 19;
        }

        private void setWebUiKitValue(int i) {
            this.productCase_ = 19;
            this.product_ = Integer.valueOf(i);
        }

        @Override // com.google.protobuf.w0
        public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
            m2 q0Var;
            switch (q.f146178a[v0Var.ordinal()]) {
                case 1:
                    return new Product();
                case 2:
                    return new a(0);
                case 3:
                    return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0001\u0000\u0001\u001b\u001b\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019?\u0000\u001a?\u0000\u001b?\u0000", new Object[]{"product_", "productCase_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Product.class) {
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

        public h getAcquiring() {
            if (this.productCase_ != 7) {
                return h.ProductUnspecified;
            }
            h hVarA = h.a(((Integer) this.product_).intValue());
            return hVarA == null ? h.UNRECOGNIZED : hVarA;
        }

        public int getAcquiringValue() {
            if (this.productCase_ == 7) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public grl.c getAi() {
            if (this.productCase_ != 24) {
                return grl.c.ModelGovernance;
            }
            grl.c cVarA = grl.c.a(((Integer) this.product_).intValue());
            return cVarA == null ? grl.c.UNRECOGNIZED : cVarA;
        }

        public int getAiValue() {
            if (this.productCase_ == 24) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public grl.q0 getBackoffice() {
            if (this.productCase_ != 4) {
                return grl.q0.ProductUnspecified;
            }
            grl.q0 q0VarA = grl.q0.a(((Integer) this.product_).intValue());
            return q0VarA == null ? grl.q0.UNRECOGNIZED : q0VarA;
        }

        public int getBackofficeValue() {
            if (this.productCase_ == 4) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public x0 getBusiness() {
            if (this.productCase_ != 2) {
                return x0.ProductUnspecified;
            }
            x0 x0VarA = x0.a(((Integer) this.product_).intValue());
            return x0VarA == null ? x0.UNRECOGNIZED : x0VarA;
        }

        public int getBusinessValue() {
            if (this.productCase_ == 2) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public y1 getChatUi() {
            if (this.productCase_ != 20) {
                return y1.ChatUi;
            }
            y1 y1VarA = y1.a(((Integer) this.product_).intValue());
            return y1VarA == null ? y1.UNRECOGNIZED : y1VarA;
        }

        public int getChatUiValue() {
            if (this.productCase_ == 20) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public w2 getCryptoExchange() {
            if (this.productCase_ != 9) {
                return w2.ProductUnspecified;
            }
            w2 w2VarA = w2.a(((Integer) this.product_).intValue());
            return w2VarA == null ? w2.UNRECOGNIZED : w2VarA;
        }

        public int getCryptoExchangeValue() {
            if (this.productCase_ == 9) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public e3 getDante() {
            if (this.productCase_ != 17) {
                return e3.Dante;
            }
            e3 e3VarA = e3.a(((Integer) this.product_).intValue());
            return e3VarA == null ? e3.UNRECOGNIZED : e3VarA;
        }

        public int getDanteValue() {
            if (this.productCase_ == 17) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public grl.h3 getDataCatalog() {
            if (this.productCase_ != 23) {
                return grl.h3.Datasets;
            }
            grl.h3 h3VarA = grl.h3.a(((Integer) this.product_).intValue());
            return h3VarA == null ? grl.h3.UNRECOGNIZED : h3VarA;
        }

        public int getDataCatalogValue() {
            if (this.productCase_ == 23) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public p3 getDocs() {
            if (this.productCase_ != 12) {
                return p3.Docs;
            }
            p3 p3VarA = p3.a(((Integer) this.product_).intValue());
            return p3VarA == null ? p3.UNRECOGNIZED : p3VarA;
        }

        public int getDocsValue() {
            if (this.productCase_ == 12) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public t3 getEor() {
            if (this.productCase_ != 18) {
                return t3.Auth;
            }
            t3 t3VarA = t3.a(((Integer) this.product_).intValue());
            return t3VarA == null ? t3.UNRECOGNIZED : t3VarA;
        }

        public int getEorValue() {
            if (this.productCase_ == 18) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public x4 getIdave() {
            if (this.productCase_ != 22) {
                return x4.IDave;
            }
            x4 x4VarA = x4.a(((Integer) this.product_).intValue());
            return x4VarA == null ? x4.UNRECOGNIZED : x4VarA;
        }

        public int getIdaveValue() {
            if (this.productCase_ == 22) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public q6 getJunior() {
            if (this.productCase_ != 8) {
                return q6.ProductUnspecified;
            }
            q6 q6VarA = q6.a(((Integer) this.product_).intValue());
            return q6VarA == null ? q6.UNRECOGNIZED : q6VarA;
        }

        public int getJuniorValue() {
            if (this.productCase_ == 8) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public t6 getKyc() {
            if (this.productCase_ != 13) {
                return t6.SelfieSignIn;
            }
            t6 t6VarA = t6.a(((Integer) this.product_).intValue());
            return t6VarA == null ? t6.UNRECOGNIZED : t6VarA;
        }

        public int getKycValue() {
            if (this.productCase_ == 13) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public e8 getPeople() {
            if (this.productCase_ != 5) {
                return e8.ProductUnspecified;
            }
            e8 e8VarA = e8.a(((Integer) this.product_).intValue());
            return e8VarA == null ? e8.UNRECOGNIZED : e8VarA;
        }

        public int getPeopleValue() {
            if (this.productCase_ == 5) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public h8 getPigeon() {
            if (this.productCase_ != 14) {
                return h8.ProductUnspecified;
            }
            h8 h8VarA = h8.a(((Integer) this.product_).intValue());
            return h8VarA == null ? h8.UNRECOGNIZED : h8VarA;
        }

        public int getPigeonValue() {
            if (this.productCase_ == 14) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public u7 getPos() {
            if (this.productCase_ != 11) {
                return u7.ProductUnspecified;
            }
            u7 u7VarA = u7.a(((Integer) this.product_).intValue());
            return u7VarA == null ? u7.UNRECOGNIZED : u7VarA;
        }

        public int getPosValue() {
            if (this.productCase_ == 11) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public o8 getProcessing() {
            if (this.productCase_ != 10) {
                return o8.Poseidon;
            }
            o8 o8VarA = o8.a(((Integer) this.product_).intValue());
            return o8VarA == null ? o8.UNRECOGNIZED : o8VarA;
        }

        public int getProcessingValue() {
            if (this.productCase_ == 10) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public d getProductCase() {
            return d.a(this.productCase_);
        }

        public r8 getRamp() {
            if (this.productCase_ != 15) {
                return r8.Ramp;
            }
            r8 r8VarA = r8.a(((Integer) this.product_).intValue());
            return r8VarA == null ? r8.UNRECOGNIZED : r8VarA;
        }

        public int getRampValue() {
            if (this.productCase_ == 15) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public d9 getReleasePlatform() {
            if (this.productCase_ != 21) {
                return d9.FeatureFlags;
            }
            d9 d9VarA = d9.a(((Integer) this.product_).intValue());
            return d9VarA == null ? d9.UNRECOGNIZED : d9VarA;
        }

        public int getReleasePlatformValue() {
            if (this.productCase_ == 21) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public h9 getReservations() {
            if (this.productCase_ != 26) {
                return h9.Reservations;
            }
            h9 h9VarA = h9.a(((Integer) this.product_).intValue());
            return h9VarA == null ? h9.UNRECOGNIZED : h9VarA;
        }

        public int getReservationsValue() {
            if (this.productCase_ == 26) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public k9 getRetail() {
            if (this.productCase_ != 1) {
                return k9.ProductUnspecified;
            }
            k9 k9VarA = k9.a(((Integer) this.product_).intValue());
            return k9VarA == null ? k9.UNRECOGNIZED : k9VarA;
        }

        public int getRetailValue() {
            if (this.productCase_ == 1) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public kc getShop() {
            if (this.productCase_ != 25) {
                return kc.RevolutShop;
            }
            kc kcVarA = kc.a(((Integer) this.product_).intValue());
            return kcVarA == null ? kc.UNRECOGNIZED : kcVarA;
        }

        public int getShopValue() {
            if (this.productCase_ == 25) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public nc getShopper() {
            if (this.productCase_ != 16) {
                return nc.WebExtension;
            }
            nc ncVarA = nc.a(((Integer) this.product_).intValue());
            return ncVarA == null ? nc.UNRECOGNIZED : ncVarA;
        }

        public int getShopperValue() {
            if (this.productCase_ == 16) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public ia getSso() {
            if (this.productCase_ != 3) {
                return ia.SignIn;
            }
            ia iaVarA = ia.a(((Integer) this.product_).intValue());
            return iaVarA == null ? ia.UNRECOGNIZED : iaVarA;
        }

        public int getSsoValue() {
            if (this.productCase_ == 3) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public ld getTeen() {
            if (this.productCase_ != 27) {
                return ld.Activation;
            }
            ld ldVarA = ld.a(((Integer) this.product_).intValue());
            return ldVarA == null ? ld.UNRECOGNIZED : ldVarA;
        }

        public int getTeenValue() {
            if (this.productCase_ == 27) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public od getTerminal() {
            if (this.productCase_ != 6) {
                return od.ProductUnspecified;
            }
            od odVarA = od.a(((Integer) this.product_).intValue());
            return odVarA == null ? od.UNRECOGNIZED : odVarA;
        }

        public int getTerminalValue() {
            if (this.productCase_ == 6) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public ne getWebUiKit() {
            if (this.productCase_ != 19) {
                return ne.Metrics;
            }
            ne neVarA = ne.a(((Integer) this.product_).intValue());
            return neVarA == null ? ne.UNRECOGNIZED : neVarA;
        }

        public int getWebUiKitValue() {
            if (this.productCase_ == 19) {
                return ((Integer) this.product_).intValue();
            }
            return 0;
        }

        public boolean hasAcquiring() {
            return this.productCase_ == 7;
        }

        public boolean hasAi() {
            return this.productCase_ == 24;
        }

        public boolean hasBackoffice() {
            return this.productCase_ == 4;
        }

        public boolean hasBusiness() {
            return this.productCase_ == 2;
        }

        public boolean hasChatUi() {
            return this.productCase_ == 20;
        }

        public boolean hasCryptoExchange() {
            return this.productCase_ == 9;
        }

        public boolean hasDante() {
            return this.productCase_ == 17;
        }

        public boolean hasDataCatalog() {
            return this.productCase_ == 23;
        }

        public boolean hasDocs() {
            return this.productCase_ == 12;
        }

        public boolean hasEor() {
            return this.productCase_ == 18;
        }

        public boolean hasIdave() {
            return this.productCase_ == 22;
        }

        public boolean hasJunior() {
            return this.productCase_ == 8;
        }

        public boolean hasKyc() {
            return this.productCase_ == 13;
        }

        public boolean hasPeople() {
            return this.productCase_ == 5;
        }

        public boolean hasPigeon() {
            return this.productCase_ == 14;
        }

        public boolean hasPos() {
            return this.productCase_ == 11;
        }

        public boolean hasProcessing() {
            return this.productCase_ == 10;
        }

        public boolean hasRamp() {
            return this.productCase_ == 15;
        }

        public boolean hasReleasePlatform() {
            return this.productCase_ == 21;
        }

        public boolean hasReservations() {
            return this.productCase_ == 26;
        }

        public boolean hasRetail() {
            return this.productCase_ == 1;
        }

        public boolean hasShop() {
            return this.productCase_ == 25;
        }

        public boolean hasShopper() {
            return this.productCase_ == 16;
        }

        public boolean hasSso() {
            return this.productCase_ == 3;
        }

        public boolean hasTeen() {
            return this.productCase_ == 27;
        }

        public boolean hasTerminal() {
            return this.productCase_ == 6;
        }

        public boolean hasWebUiKit() {
            return this.productCase_ == 19;
        }

        public static a newBuilder(Product product) {
            return (a) DEFAULT_INSTANCE.createBuilder(product);
        }

        public static Product parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Product) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Product parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
        }

        public static Product parseFrom(p pVar) throws InvalidProtocolBufferException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static Product parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
        }

        public static Product parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Product parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
        }

        public static Product parseFrom(InputStream inputStream) throws IOException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Product parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Product parseFrom(t tVar) throws IOException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, tVar);
        }

        public static Product parseFrom(t tVar, d0 d0Var) throws IOException {
            return (Product) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
        }
    }

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AnalyticEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        AnalyticEvent analyticEvent = new AnalyticEvent();
        DEFAULT_INSTANCE = analyticEvent;
        w0.registerDefaultInstance(AnalyticEvent.class, analyticEvent);
    }

    private AnalyticEvent() {
    }

    private void clearAction() {
        this.action_ = null;
        this.bitField0_ &= -2049;
    }

    private void clearAnyContext() {
        this.anyContext_ = null;
        this.bitField0_ &= -524289;
    }

    private void clearApp() {
        this.app_ = null;
        this.bitField0_ &= -65;
    }

    private void clearClientTimestamp() {
        this.clientTimestamp_ = null;
        this.bitField0_ &= -17;
    }

    private void clearDevice() {
        this.device_ = null;
        this.bitField0_ &= -129;
    }

    private void clearFeatureFlags() {
        this.featureFlags_ = null;
        this.bitField0_ &= -257;
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearItemPosition() {
        this.bitField0_ &= -16385;
        this.itemPosition_ = 0;
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -131073;
    }

    private void clearOwnership() {
        this.ownership_ = null;
        this.bitField0_ &= -1048577;
    }

    private void clearPath() {
        this.bitField0_ &= -65537;
        this.path_ = getDefaultInstance().getPath();
    }

    private void clearProduct() {
        this.product_ = null;
        this.bitField0_ &= -513;
    }

    private void clearScreen() {
        this.bitField0_ &= -1025;
        this.screen_ = getDefaultInstance().getScreen();
    }

    private void clearSection() {
        this.bitField0_ &= -4097;
        this.section_ = getDefaultInstance().getSection();
    }

    private void clearSectionPosition() {
        this.bitField0_ &= -8193;
        this.sectionPosition_ = 0;
    }

    private void clearServerTimestamp() {
        this.serverTimestamp_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSessionId() {
        this.bitField0_ &= -5;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void clearUserId() {
        this.bitField0_ &= -3;
        this.userId_ = getDefaultInstance().getUserId();
    }

    private void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -262145;
    }

    private void clearVersion() {
        this.bitField0_ &= -33;
        this.version_ = 0;
    }

    private void clearWidget() {
        this.widget_ = null;
        this.bitField0_ &= -32769;
    }

    public static AnalyticEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAction(Action action) {
        action.getClass();
        Action action2 = this.action_;
        if (action2 == null || action2 == Action.getDefaultInstance()) {
            this.action_ = action;
        } else {
            Action.a aVarNewBuilder = Action.newBuilder(this.action_);
            aVarNewBuilder.f(action);
            this.action_ = (Action) aVarNewBuilder.b();
        }
        this.bitField0_ |= 2048;
    }

    private void mergeAnyContext(com.google.protobuf.g gVar) {
        gVar.getClass();
        com.google.protobuf.g gVar2 = this.anyContext_;
        if (gVar2 == null || gVar2 == com.google.protobuf.g.getDefaultInstance()) {
            this.anyContext_ = gVar;
        } else {
            com.google.protobuf.f fVarNewBuilder = com.google.protobuf.g.newBuilder(this.anyContext_);
            fVarNewBuilder.f(gVar);
            this.anyContext_ = (com.google.protobuf.g) fVarNewBuilder.b();
        }
        this.bitField0_ |= 524288;
    }

    private void mergeApp(App app) {
        app.getClass();
        App app2 = this.app_;
        if (app2 == null || app2 == App.getDefaultInstance()) {
            this.app_ = app;
        } else {
            App.a aVarNewBuilder = App.newBuilder(this.app_);
            aVarNewBuilder.f(app);
            this.app_ = (App) aVarNewBuilder.b();
        }
        this.bitField0_ |= 64;
    }

    private void mergeClientTimestamp(k3 k3Var) {
        k3Var.getClass();
        k3 k3Var2 = this.clientTimestamp_;
        if (k3Var2 == null || k3Var2 == k3.getDefaultInstance()) {
            this.clientTimestamp_ = k3Var;
        } else {
            j3 j3VarNewBuilder = k3.newBuilder(this.clientTimestamp_);
            j3VarNewBuilder.f(k3Var);
            this.clientTimestamp_ = (k3) j3VarNewBuilder.b();
        }
        this.bitField0_ |= 16;
    }

    private void mergeDevice(Device device) {
        device.getClass();
        Device device2 = this.device_;
        if (device2 == null || device2 == Device.getDefaultInstance()) {
            this.device_ = device;
        } else {
            Device.a aVarNewBuilder = Device.newBuilder(this.device_);
            aVarNewBuilder.f(device);
            this.device_ = (Device) aVarNewBuilder.b();
        }
        this.bitField0_ |= 128;
    }

    private void mergeFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.featureFlags_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.featureFlags_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.featureFlags_);
            f3VarNewBuilder.f(h3Var);
            this.featureFlags_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 256;
    }

    private void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            Metadata.a aVarNewBuilder = Metadata.newBuilder(this.metadata_);
            aVarNewBuilder.f(metadata);
            this.metadata_ = (Metadata) aVarNewBuilder.b();
        }
        this.bitField0_ |= 131072;
    }

    private void mergeOwnership(Ownership ownership) {
        ownership.getClass();
        Ownership ownership2 = this.ownership_;
        if (ownership2 == null || ownership2 == Ownership.getDefaultInstance()) {
            this.ownership_ = ownership;
        } else {
            Ownership.a aVarNewBuilder = Ownership.newBuilder(this.ownership_);
            aVarNewBuilder.f(ownership);
            this.ownership_ = (Ownership) aVarNewBuilder.b();
        }
        this.bitField0_ |= PKIFailureInfo.badCertTemplate;
    }

    private void mergeProduct(Product product) {
        product.getClass();
        Product product2 = this.product_;
        if (product2 == null || product2 == Product.getDefaultInstance()) {
            this.product_ = product;
        } else {
            Product.a aVarNewBuilder = Product.newBuilder(this.product_);
            aVarNewBuilder.f(product);
            this.product_ = (Product) aVarNewBuilder.b();
        }
        this.bitField0_ |= 512;
    }

    private void mergeServerTimestamp(k3 k3Var) {
        k3Var.getClass();
        k3 k3Var2 = this.serverTimestamp_;
        if (k3Var2 == null || k3Var2 == k3.getDefaultInstance()) {
            this.serverTimestamp_ = k3Var;
        } else {
            j3 j3VarNewBuilder = k3.newBuilder(this.serverTimestamp_);
            j3VarNewBuilder.f(k3Var);
            this.serverTimestamp_ = (k3) j3VarNewBuilder.b();
        }
        this.bitField0_ |= 8;
    }

    private void mergeUserInfo(UserInfo userInfo) {
        userInfo.getClass();
        UserInfo userInfo2 = this.userInfo_;
        if (userInfo2 == null || userInfo2 == UserInfo.getDefaultInstance()) {
            this.userInfo_ = userInfo;
        } else {
            UserInfo.a aVarNewBuilder = UserInfo.newBuilder(this.userInfo_);
            aVarNewBuilder.f(userInfo);
            this.userInfo_ = (UserInfo) aVarNewBuilder.b();
        }
        this.bitField0_ |= 262144;
    }

    private void mergeWidget(WidgetDescription widgetDescription) {
        widgetDescription.getClass();
        WidgetDescription widgetDescription2 = this.widget_;
        if (widgetDescription2 == null || widgetDescription2 == WidgetDescription.getDefaultInstance()) {
            this.widget_ = widgetDescription;
        } else {
            WidgetDescription.a aVarNewBuilder = WidgetDescription.newBuilder(this.widget_);
            aVarNewBuilder.f(widgetDescription);
            this.widget_ = (WidgetDescription) aVarNewBuilder.b();
        }
        this.bitField0_ |= 32768;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AnalyticEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AnalyticEvent) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(Action action) {
        action.getClass();
        this.action_ = action;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnyContext(com.google.protobuf.g gVar) {
        gVar.getClass();
        this.anyContext_ = gVar;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApp(App app) {
        app.getClass();
        this.app_ = app;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimestamp(k3 k3Var) {
        k3Var.getClass();
        this.clientTimestamp_ = k3Var;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(Device device) {
        device.getClass();
        this.device_ = device;
        this.bitField0_ |= 128;
    }

    private void setFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        this.featureFlags_ = h3Var;
        this.bitField0_ |= 256;
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
    public void setItemPosition(int i) {
        this.bitField0_ |= 16384;
        this.itemPosition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnership(Ownership ownership) {
        ownership.getClass();
        this.ownership_ = ownership;
        this.bitField0_ |= PKIFailureInfo.badCertTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.path_ = str;
    }

    private void setPathBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.path_ = pVar.m();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(Product product) {
        product.getClass();
        this.product_ = product;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreen(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.screen_ = str;
    }

    private void setScreenBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.screen_ = pVar.m();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSection(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.section_ = str;
    }

    private void setSectionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.section_ = pVar.m();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectionPosition(int i) {
        this.bitField0_ |= 8192;
        this.sectionPosition_ = i;
    }

    private void setServerTimestamp(k3 k3Var) {
        k3Var.getClass();
        this.serverTimestamp_ = k3Var;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.sessionId_ = str;
    }

    private void setSessionIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.sessionId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.userId_ = str;
    }

    private void setUserIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.userId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(UserInfo userInfo) {
        userInfo.getClass();
        this.userInfo_ = userInfo;
        this.bitField0_ |= 262144;
    }

    private void setVersion(int i) {
        this.bitField0_ |= 32;
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidget(WidgetDescription widgetDescription) {
        widgetDescription.getClass();
        this.widget_ = widgetDescription;
        this.bitField0_ |= 32768;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (q.f146178a[v0Var.ordinal()]) {
            case 1:
                return new AnalyticEvent();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဋ\u0005\u0007ဉ\u0006\bဉ\u0007\u000bဉ\b\fဉ\t\rለ\n\u000eဉ\u000b\u000fለ\f\u0010င\r\u0011င\u000e\u0012ဉ\u000f\u0014ለ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0014", new Object[]{"bitField0_", "id_", "userId_", "sessionId_", "serverTimestamp_", "clientTimestamp_", "version_", "app_", "device_", "featureFlags_", "product_", "screen_", "action_", "section_", "sectionPosition_", "itemPosition_", "widget_", "path_", "metadata_", "userInfo_", "anyContext_", "ownership_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AnalyticEvent.class) {
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

    public Action getAction() {
        Action action = this.action_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    public com.google.protobuf.g getAnyContext() {
        com.google.protobuf.g gVar = this.anyContext_;
        return gVar == null ? com.google.protobuf.g.getDefaultInstance() : gVar;
    }

    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    public k3 getClientTimestamp() {
        k3 k3Var = this.clientTimestamp_;
        return k3Var == null ? k3.getDefaultInstance() : k3Var;
    }

    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    public h3 getFeatureFlags() {
        h3 h3Var = this.featureFlags_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public int getItemPosition() {
        return this.itemPosition_;
    }

    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    public Ownership getOwnership() {
        Ownership ownership = this.ownership_;
        return ownership == null ? Ownership.getDefaultInstance() : ownership;
    }

    public String getPath() {
        return this.path_;
    }

    public p getPathBytes() {
        return p.d(this.path_);
    }

    public Product getProduct() {
        Product product = this.product_;
        return product == null ? Product.getDefaultInstance() : product;
    }

    public String getScreen() {
        return this.screen_;
    }

    public p getScreenBytes() {
        return p.d(this.screen_);
    }

    public String getSection() {
        return this.section_;
    }

    public p getSectionBytes() {
        return p.d(this.section_);
    }

    public int getSectionPosition() {
        return this.sectionPosition_;
    }

    public k3 getServerTimestamp() {
        k3 k3Var = this.serverTimestamp_;
        return k3Var == null ? k3.getDefaultInstance() : k3Var;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public p getSessionIdBytes() {
        return p.d(this.sessionId_);
    }

    public String getUserId() {
        return this.userId_;
    }

    public p getUserIdBytes() {
        return p.d(this.userId_);
    }

    public UserInfo getUserInfo() {
        UserInfo userInfo = this.userInfo_;
        return userInfo == null ? UserInfo.getDefaultInstance() : userInfo;
    }

    public int getVersion() {
        return this.version_;
    }

    public WidgetDescription getWidget() {
        WidgetDescription widgetDescription = this.widget_;
        return widgetDescription == null ? WidgetDescription.getDefaultInstance() : widgetDescription;
    }

    public boolean hasAction() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasAnyContext() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasApp() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasClientTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasFeatureFlags() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasItemPosition() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasOwnership() {
        return (this.bitField0_ & PKIFailureInfo.badCertTemplate) != 0;
    }

    public boolean hasPath() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasProduct() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasScreen() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasSection() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSectionPosition() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasServerTimestamp() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasWidget() {
        return (this.bitField0_ & 32768) != 0;
    }

    public static a newBuilder(AnalyticEvent analyticEvent) {
        return (a) DEFAULT_INSTANCE.createBuilder(analyticEvent);
    }

    public static AnalyticEvent parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AnalyticEvent) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AnalyticEvent parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AnalyticEvent parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AnalyticEvent parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AnalyticEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnalyticEvent parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AnalyticEvent parseFrom(InputStream inputStream) throws IOException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticEvent parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AnalyticEvent parseFrom(t tVar) throws IOException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AnalyticEvent parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AnalyticEvent) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
