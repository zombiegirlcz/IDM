package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageLite f187511a;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f187511a = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public MessageLite getUnfinishedMessage() {
        return this.f187511a;
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite) {
        this.f187511a = messageLite;
        return this;
    }
}
