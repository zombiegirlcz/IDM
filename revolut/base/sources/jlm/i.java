package jlm;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes14.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f175881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f175882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175883c;
    public l d;
    public boolean e;
    public i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f175884g;

    public i() {
        this.f175881a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final /* synthetic */ int a() {
        return this.f175881a.length - this.f175883c;
    }

    public final /* synthetic */ int b() {
        return this.f175883c - this.f175882b;
    }

    public final byte c(int i) {
        return this.f175881a[this.f175882b + i];
    }

    public final i d() {
        i iVar = this.f;
        i iVar2 = this.f175884g;
        if (iVar2 != null) {
            Intrinsics.h(iVar2);
            iVar2.f = this.f;
        }
        i iVar3 = this.f;
        if (iVar3 != null) {
            Intrinsics.h(iVar3);
            iVar3.f175884g = this.f175884g;
        }
        this.f = null;
        this.f175884g = null;
        return iVar;
    }

    public final void e(i segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f175884g = this;
        segment.f = this.f;
        i iVar = this.f;
        if (iVar != null) {
            iVar.f175884g = segment;
        }
        this.f = segment;
    }

    public final i f() {
        l gVar = this.d;
        if (gVar == null) {
            i iVar = j.f175885a;
            gVar = new g();
            this.d = gVar;
        }
        int i = this.f175882b;
        int i2 = this.f175883c;
        g.f175879c.incrementAndGet((g) gVar);
        Unit unit = Unit.f186387a;
        return new i(this.f175881a, i, i2, gVar);
    }

    public final void g(i sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.f175883c + i > 8192) {
            l lVar = sink.d;
            if (lVar != null && ((g) lVar).f175880b > 0) {
                throw new IllegalArgumentException();
            }
            int i2 = sink.f175883c;
            int i3 = sink.f175882b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f175881a;
            p.j(bArr, bArr, 0, i3, i2, 2);
            sink.f175883c -= sink.f175882b;
            sink.f175882b = 0;
        }
        byte[] bArr2 = this.f175881a;
        byte[] bArr3 = sink.f175881a;
        int i5 = sink.f175883c;
        int i6 = this.f175882b;
        p.e(i5, bArr2, i6, bArr3, i6 + i);
        sink.f175883c += i;
        this.f175882b += i;
    }

    public i(byte[] bArr, int i, int i2, l lVar) {
        this.f175881a = bArr;
        this.f175882b = i;
        this.f175883c = i2;
        this.d = lVar;
        this.e = false;
    }
}
