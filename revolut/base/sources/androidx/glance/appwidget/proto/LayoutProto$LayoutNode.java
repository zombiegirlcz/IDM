package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractMessageLite;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import androidx.glance.appwidget.protobuf.Internal;
import androidx.glance.appwidget.protobuf.MessageLiteOrBuilder;
import androidx.glance.appwidget.protobuf.Parser;

/* JADX INFO: loaded from: classes15.dex */
public final class LayoutProto$LayoutNode extends GeneratedMessageLite<LayoutProto$LayoutNode, Builder> implements MessageLiteOrBuilder {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final LayoutProto$LayoutNode DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile Parser<LayoutProto$LayoutNode> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private Internal.ProtobufList<LayoutProto$LayoutNode> children_ = GeneratedMessageLite.emptyProtobufList();
    private boolean hasAction_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    public static final class Builder extends GeneratedMessageLite.Builder<LayoutProto$LayoutNode, Builder> implements MessageLiteOrBuilder {
        public /* synthetic */ Builder(LayoutProto$1 layoutProto$1) {
            this();
        }

        public Builder addAllChildren(Iterable<? extends LayoutProto$LayoutNode> iterable) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).addAllChildren(iterable);
            return this;
        }

        public Builder setHasAction(boolean z) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setHasAction(z);
            return this;
        }

        public Builder setHasImageDescription(boolean z) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setHasImageDescription(z);
            return this;
        }

        public Builder setHeight(LayoutProto$DimensionType layoutProto$DimensionType) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setHeight(layoutProto$DimensionType);
            return this;
        }

        public Builder setHorizontalAlignment(LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignment) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setHorizontalAlignment(layoutProto$HorizontalAlignment);
            return this;
        }

        public Builder setIdentity(LayoutProto$NodeIdentity layoutProto$NodeIdentity) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setIdentity(layoutProto$NodeIdentity);
            return this;
        }

        public Builder setImageScale(LayoutProto$ContentScale layoutProto$ContentScale) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setImageScale(layoutProto$ContentScale);
            return this;
        }

        public Builder setType(LayoutProto$LayoutType layoutProto$LayoutType) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setType(layoutProto$LayoutType);
            return this;
        }

        public Builder setVerticalAlignment(LayoutProto$VerticalAlignment layoutProto$VerticalAlignment) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setVerticalAlignment(layoutProto$VerticalAlignment);
            return this;
        }

        public Builder setWidth(LayoutProto$DimensionType layoutProto$DimensionType) {
            copyOnWrite();
            ((LayoutProto$LayoutNode) this.instance).setWidth(layoutProto$DimensionType);
            return this;
        }

        private Builder() {
            super(LayoutProto$LayoutNode.DEFAULT_INSTANCE);
        }
    }

    static {
        LayoutProto$LayoutNode layoutProto$LayoutNode = new LayoutProto$LayoutNode();
        DEFAULT_INSTANCE = layoutProto$LayoutNode;
        GeneratedMessageLite.registerDefaultInstance(LayoutProto$LayoutNode.class, layoutProto$LayoutNode);
    }

    private LayoutProto$LayoutNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildren(Iterable<? extends LayoutProto$LayoutNode> iterable) {
        ensureChildrenIsMutable();
        AbstractMessageLite.addAll(iterable, this.children_);
    }

    private void ensureChildrenIsMutable() {
        Internal.ProtobufList<LayoutProto$LayoutNode> protobufList = this.children_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.children_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LayoutProto$LayoutNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasAction(boolean z) {
        this.hasAction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasImageDescription(boolean z) {
        this.hasImageDescription_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(LayoutProto$DimensionType layoutProto$DimensionType) {
        this.height_ = layoutProto$DimensionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalAlignment(LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignment) {
        this.horizontalAlignment_ = layoutProto$HorizontalAlignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(LayoutProto$NodeIdentity layoutProto$NodeIdentity) {
        this.identity_ = layoutProto$NodeIdentity.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageScale(LayoutProto$ContentScale layoutProto$ContentScale) {
        this.imageScale_ = layoutProto$ContentScale.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(LayoutProto$LayoutType layoutProto$LayoutType) {
        this.type_ = layoutProto$LayoutType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticalAlignment(LayoutProto$VerticalAlignment layoutProto$VerticalAlignment) {
        this.verticalAlignment_ = layoutProto$VerticalAlignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(LayoutProto$DimensionType layoutProto$DimensionType) {
        this.width_ = layoutProto$DimensionType.getNumber();
    }

    @Override // androidx.glance.appwidget.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj2, Object obj3) {
        Parser defaultInstanceBasedParser;
        LayoutProto$1 layoutProto$1 = null;
        switch (LayoutProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new LayoutProto$LayoutNode();
            case 2:
                return new Builder(layoutProto$1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", LayoutProto$LayoutNode.class, "identity_", "hasAction_", "hasImageDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LayoutProto$LayoutNode> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LayoutProto$LayoutNode.class) {
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
}
