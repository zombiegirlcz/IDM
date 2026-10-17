package hcm;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements icm.b {
    public static final Logger d = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f151267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final icm.b f151268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cpi.g f151269c;

    public f(t tVar, c cVar) {
        Level level = Level.FINE;
        this.f151269c = new cpi.g(13);
        this.f151267a = (e) Preconditions.checkNotNull(tVar, "transportExceptionHandler");
        this.f151268b = (icm.b) Preconditions.checkNotNull(cVar, "frameWriter");
    }

    @Override // icm.b
    public final void D9(boolean z, int i, mmm.h hVar, int i2) {
        u uVar = u.OUTBOUND;
        hVar.getClass();
        this.f151269c.z(uVar, i, hVar, i2, z);
        try {
            this.f151268b.D9(z, i, hVar, i2);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final int H7() {
        return this.f151268b.H7();
    }

    @Override // icm.b
    public final void J7(icm.a aVar, byte[] bArr) {
        icm.b bVar = this.f151268b;
        u uVar = u.OUTBOUND;
        mmm.m.Companion.getClass();
        this.f151269c.A(uVar, 0, aVar, mmm.l.e(bArr));
        try {
            bVar.J7(aVar, bArr);
            bVar.flush();
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void O8(int i, int i2, boolean z) {
        cpi.g gVar = this.f151269c;
        if (z) {
            u uVar = u.OUTBOUND;
            long j2 = (BodyPartID.bodyIdMax & ((long) i2)) | (((long) i) << 32);
            if (gVar.x()) {
                ((Logger) gVar.f107954b).log((Level) gVar.f107955c, uVar + " PING: ack=true bytes=" + j2);
            }
        } else {
            gVar.C(u.OUTBOUND, (BodyPartID.bodyIdMax & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f151268b.O8(i, i2, z);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void T9(int i, icm.a aVar) {
        this.f151269c.D(u.OUTBOUND, i, aVar);
        try {
            this.f151268b.T9(i, aVar);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void V7(icm.m mVar) {
        this.f151269c.E(u.OUTBOUND, mVar);
        try {
            this.f151268b.V7(mVar);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void a2(int i, List list, boolean z) {
        try {
            this.f151268b.a2(i, list, z);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void c8(icm.m mVar) {
        u uVar = u.OUTBOUND;
        cpi.g gVar = this.f151269c;
        if (gVar.x()) {
            ((Logger) gVar.f107954b).log((Level) gVar.f107955c, uVar + " SETTINGS: ack=true");
        }
        try {
            this.f151268b.c8(mVar);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f151268b.close();
        } catch (IOException e) {
            d.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    @Override // icm.b
    public final void flush() {
        try {
            this.f151268b.flush();
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void q6(int i, long j2) {
        this.f151269c.F(u.OUTBOUND, i, j2);
        try {
            this.f151268b.q6(i, j2);
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }

    @Override // icm.b
    public final void w1() {
        try {
            this.f151268b.w1();
        } catch (IOException e) {
            ((t) this.f151267a).n(e);
        }
    }
}
