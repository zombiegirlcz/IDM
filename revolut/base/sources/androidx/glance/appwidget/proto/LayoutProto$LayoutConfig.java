package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.proto.LayoutProto$LayoutDefinition;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import androidx.glance.appwidget.protobuf.Internal;
import androidx.glance.appwidget.protobuf.MessageLiteOrBuilder;
import androidx.glance.appwidget.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class LayoutProto$LayoutConfig extends GeneratedMessageLite<LayoutProto$LayoutConfig, Builder> implements MessageLiteOrBuilder {
    private static final LayoutProto$LayoutConfig DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile Parser<LayoutProto$LayoutConfig> PARSER;
    private Internal.ProtobufList<LayoutProto$LayoutDefinition> layout_ = GeneratedMessageLite.emptyProtobufList();
    private int nextIndex_;

    public static final class Builder extends GeneratedMessageLite.Builder<LayoutProto$LayoutConfig, Builder> implements MessageLiteOrBuilder {
        public /* synthetic */ Builder(LayoutProto$1 layoutProto$1) {
            this();
        }

        public Builder addLayout(LayoutProto$LayoutDefinition.Builder builder) {
            copyOnWrite();
            ((LayoutProto$LayoutConfig) this.instance).addLayout(builder.build());
            return this;
        }

        public Builder clearLayout() {
            copyOnWrite();
            ((LayoutProto$LayoutConfig) this.instance).clearLayout();
            return this;
        }

        public int getNextIndex() {
            return ((LayoutProto$LayoutConfig) this.instance).getNextIndex();
        }

        public Builder setNextIndex(int i) {
            copyOnWrite();
            ((LayoutProto$LayoutConfig) this.instance).setNextIndex(i);
            return this;
        }

        private Builder() {
            super(LayoutProto$LayoutConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        LayoutProto$LayoutConfig layoutProto$LayoutConfig = new LayoutProto$LayoutConfig();
        DEFAULT_INSTANCE = layoutProto$LayoutConfig;
        GeneratedMessageLite.registerDefaultInstance(LayoutProto$LayoutConfig.class, layoutProto$LayoutConfig);
    }

    private LayoutProto$LayoutConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayout(LayoutProto$LayoutDefinition layoutProto$LayoutDefinition) {
        layoutProto$LayoutDefinition.getClass();
        ensureLayoutIsMutable();
        this.layout_.add(layoutProto$LayoutDefinition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayout() {
        this.layout_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLayoutIsMutable() {
        Internal.ProtobufList<LayoutProto$LayoutDefinition> protobufList = this.layout_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.layout_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LayoutProto$LayoutConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LayoutProto$LayoutConfig parseFrom(InputStream inputStream) throws IOException {
        return (LayoutProto$LayoutConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextIndex(int i) {
        this.nextIndex_ = i;
    }

    @Override // androidx.glance.appwidget.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj2, Object obj3) {
        Parser defaultInstanceBasedParser;
        LayoutProto$1 layoutProto$1 = null;
        switch (LayoutProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new LayoutProto$LayoutConfig();
            case 2:
                return new Builder(layoutProto$1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", LayoutProto$LayoutDefinition.class, "nextIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayoutProto$LayoutConfig> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LayoutProto$LayoutConfig.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public List<LayoutProto$LayoutDefinition> getLayoutList() {
        return this.layout_;
    }

    public int getNextIndex() {
        return this.nextIndex_;
    }
}
