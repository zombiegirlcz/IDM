package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile MessageLite f187512a;

    public int getSerializedSize() {
        return this.f187512a.getSerializedSize();
    }

    public MessageLite getValue(MessageLite messageLite) {
        if (this.f187512a == null) {
            synchronized (this) {
                if (this.f187512a == null) {
                    try {
                        this.f187512a = messageLite;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f187512a;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.f187512a;
        this.f187512a = messageLite;
        return messageLite2;
    }
}
