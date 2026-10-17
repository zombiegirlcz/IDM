package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProcessingNode f6857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProcessingNode.InputPacket f6858c;

    public /* synthetic */ e(ProcessingNode processingNode, ProcessingNode.InputPacket inputPacket, int i) {
        this.f6856a = i;
        this.f6857b = processingNode;
        this.f6858c = inputPacket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6856a) {
            case 0:
                this.f6857b.lambda$transform$2(this.f6858c);
                break;
            case 1:
                this.f6857b.lambda$transform$0(this.f6858c);
                break;
            default:
                this.f6857b.lambda$processInputPacket$6(this.f6858c);
                break;
        }
    }
}
