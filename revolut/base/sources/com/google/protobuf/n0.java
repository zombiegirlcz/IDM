package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f49751b = new n0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49752a;

    public /* synthetic */ n0(int i) {
        this.f49752a = i;
    }

    @Override // com.google.protobuf.b2
    public final boolean isSupported(Class cls) {
        switch (this.f49752a) {
            case 0:
                return w0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.b2
    public final r2 messageInfoFor(Class cls) {
        switch (this.f49752a) {
            case 0:
                if (!w0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (r2) w0.getDefaultInstance(cls.asSubclass(w0.class)).buildMessageInfo();
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
