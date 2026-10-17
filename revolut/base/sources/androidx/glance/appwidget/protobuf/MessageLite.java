package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite buildPartial();
    }

    int getSerializedSize();

    Builder newBuilderForType();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
