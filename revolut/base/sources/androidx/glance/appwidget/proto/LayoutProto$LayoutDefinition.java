package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import androidx.glance.appwidget.protobuf.MessageLiteOrBuilder;
import androidx.glance.appwidget.protobuf.Parser;

/* JADX INFO: loaded from: classes15.dex */
public final class LayoutProto$LayoutDefinition extends GeneratedMessageLite<LayoutProto$LayoutDefinition, Builder> implements MessageLiteOrBuilder {
    private static final LayoutProto$LayoutDefinition DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile Parser<LayoutProto$LayoutDefinition> PARSER;
    private int layoutIndex_;
    private LayoutProto$LayoutNode layout_;

    public static final class Builder extends GeneratedMessageLite.Builder<LayoutProto$LayoutDefinition, Builder> implements MessageLiteOrBuilder {
        public /* synthetic */ Builder(LayoutProto$1 layoutProto$1) {
            this();
        }

        public Builder setLayout(LayoutProto$LayoutNode layoutProto$LayoutNode) {
            copyOnWrite();
            ((LayoutProto$LayoutDefinition) this.instance).setLayout(layoutProto$LayoutNode);
            return this;
        }

        public Builder setLayoutIndex(int i) {
            copyOnWrite();
            ((LayoutProto$LayoutDefinition) this.instance).setLayoutIndex(i);
            return this;
        }

        private Builder() {
            super(LayoutProto$LayoutDefinition.DEFAULT_INSTANCE);
        }
    }

    static {
        LayoutProto$LayoutDefinition layoutProto$LayoutDefinition = new LayoutProto$LayoutDefinition();
        DEFAULT_INSTANCE = layoutProto$LayoutDefinition;
        GeneratedMessageLite.registerDefaultInstance(LayoutProto$LayoutDefinition.class, layoutProto$LayoutDefinition);
    }

    private LayoutProto$LayoutDefinition() {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayout(LayoutProto$LayoutNode layoutProto$LayoutNode) {
        layoutProto$LayoutNode.getClass();
        this.layout_ = layoutProto$LayoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutIndex(int i) {
        this.layoutIndex_ = i;
    }

    @Override // androidx.glance.appwidget.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj2, Object obj3) {
        Parser defaultInstanceBasedParser;
        LayoutProto$1 layoutProto$1 = null;
        switch (LayoutProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new LayoutProto$LayoutDefinition();
            case 2:
                return new Builder(layoutProto$1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0004", new Object[]{"layout_", "layoutIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayoutProto$LayoutDefinition> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LayoutProto$LayoutDefinition.class) {
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

    public LayoutProto$LayoutNode getLayout() {
        LayoutProto$LayoutNode layoutProto$LayoutNode = this.layout_;
        return layoutProto$LayoutNode == null ? LayoutProto$LayoutNode.getDefaultInstance() : layoutProto$LayoutNode;
    }

    public int getLayoutIndex() {
        return this.layoutIndex_;
    }
}
