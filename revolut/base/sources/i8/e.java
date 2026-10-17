package i8;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159357b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f159356a = i;
        this.f159357b = obj2;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f159356a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f159357b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        switch (this.f159356a) {
        }
        return c8.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.f159356a) {
            case 0:
                try {
                    dVar.d(y8.b.a((File) this.f159357b));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    }
                    dVar.e(e);
                    return;
                }
                break;
            default:
                dVar.d(this.f159357b);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f159356a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        int i = this.f159356a;
    }
}
