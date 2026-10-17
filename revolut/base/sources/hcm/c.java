package hcm;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements icm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final icm.b f151253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f151254b;

    public c(d dVar, icm.j jVar) {
        this.f151254b = dVar;
        this.f151253a = (icm.b) Preconditions.checkNotNull(jVar, "delegate");
    }

    @Override // icm.b
    public final void D9(boolean z, int i, mmm.h hVar, int i2) {
        this.f151253a.D9(z, i, hVar, i2);
    }

    @Override // icm.b
    public final int H7() {
        return this.f151253a.H7();
    }

    @Override // icm.b
    public final void J7(icm.a aVar, byte[] bArr) {
        this.f151253a.J7(aVar, bArr);
    }

    @Override // icm.b
    public final void O8(int i, int i2, boolean z) {
        if (z) {
            this.f151254b.f151261l++;
        }
        this.f151253a.O8(i, i2, z);
    }

    @Override // icm.b
    public final void T9(int i, icm.a aVar) {
        this.f151254b.f151261l++;
        this.f151253a.T9(i, aVar);
    }

    @Override // icm.b
    public final void V7(icm.m mVar) {
        this.f151253a.V7(mVar);
    }

    @Override // icm.b
    public final void a2(int i, List list, boolean z) {
        this.f151253a.a2(i, list, z);
    }

    @Override // icm.b
    public final void c8(icm.m mVar) {
        this.f151254b.f151261l++;
        this.f151253a.c8(mVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f151253a.close();
    }

    @Override // icm.b
    public final void flush() {
        this.f151253a.flush();
    }

    @Override // icm.b
    public final void q6(int i, long j2) {
        this.f151253a.q6(i, j2);
    }

    @Override // icm.b
    public final void w1() {
        this.f151253a.w1();
    }
}
