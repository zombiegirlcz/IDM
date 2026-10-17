package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class x implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f49430b = new x(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49431a;

    public /* synthetic */ x(int i) {
        this.f49431a = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final boolean isSupported(Class cls) {
        switch (this.f49431a) {
            case 0:
                return b0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final f1 messageInfoFor(Class cls) {
        switch (this.f49431a) {
            case 0:
                if (!b0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (f1) b0.i(cls.asSubclass(b0.class)).h(a0.BUILD_MESSAGE_INFO);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
