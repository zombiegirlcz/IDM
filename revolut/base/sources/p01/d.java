package p01;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements k01.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f231422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f231423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f231424c;
    public final l d;
    public final k01.c e;

    public d(a0 header, Image image, l lVar, l lVar2, k01.c clickResponse) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(clickResponse, "clickResponse");
        this.f231422a = header;
        this.f231423b = image;
        this.f231424c = lVar;
        this.d = lVar2;
        this.e = clickResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // k01.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(jid.z r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p01.d.a(jid.z, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f231422a.equals(dVar.f231422a) && Intrinsics.f(this.f231423b, dVar.f231423b) && this.f231424c.equals(dVar.f231424c) && this.d.equals(dVar.d) && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f231422a.hashCode() * 31;
        Image image = this.f231423b;
        return this.e.f179898a.hashCode() + ((this.d.hashCode() + ((this.f231424c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31)) * 31);
    }
}
