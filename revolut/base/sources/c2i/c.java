package c2i;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import c5a.w;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import efm.h0;
import efm.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements kfm.o, kfm.d, kfm.p, kfm.c, kfm.g, u, BinarySearchSeeker.SeekTimestampConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20795b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f20794a = i;
        this.f20795b = obj2;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        c49.d dVar = (c49.d) this.f20795b;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        c49.c receiver = new c49.c(emitter, dVar, 0);
        i4b.f fVar = dVar.f21125g;
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        ContextCompat.registerReceiver((Context) fVar.f158330b, receiver, new IntentFilter("android.location.PROVIDERS_CHANGED"), 4);
        emitter.d(new b80.a(dVar, receiver, 1));
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((byc.a) this.f20795b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f20794a) {
            case 0:
                a aVar = (a) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 1:
                d dVar = (d) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 2:
                c2d.n nVar = (c2d.n) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) nVar.invoke(p0);
            case 3:
            case 4:
            case 7:
            case 9:
            case 14:
            case 21:
            case 24:
            default:
                w wVar = (w) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) wVar.invoke(p0);
            case 5:
                c2d.n nVar2 = (c2d.n) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) nVar2.invoke(p0);
            case 6:
                c2d.n nVar3 = (c2d.n) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) nVar3.invoke(p0);
            case 8:
                bd2.b bVar = (bd2.b) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c71.b) bVar.invoke(p0);
            case 10:
                bzg.t tVar = (bzg.t) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c71.a) tVar.invoke(p0);
            case 11:
                c34.a aVar2 = (c34.a) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar2.invoke(p0);
            case 12:
                bzg.t tVar2 = (bzg.t) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (pu3.g) tVar2.invoke(p0);
            case 13:
                bzg.t tVar3 = (bzg.t) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) tVar3.invoke(p0);
            case 15:
                bzg.t tVar4 = (bzg.t) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) tVar4.invoke(p0);
            case 16:
                c2d.n nVar4 = (c2d.n) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) nVar4.invoke(p0);
            case 17:
                bwc.i iVar = (bwc.i) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n38.r) iVar.invoke(p0);
            case 18:
                c42.j jVar = (c42.j) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocationDomain) jVar.invoke(p0);
            case 19:
                c42.j jVar2 = (c42.j) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x39.a) jVar2.invoke(p0);
            case 20:
                c42.j jVar3 = (c42.j) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocationDomain) jVar3.invoke(p0);
            case 22:
                c49.a aVar3 = (c49.a) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar3.invoke(p0);
            case 23:
                c49.a aVar4 = (c49.a) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) aVar4.invoke(p0);
            case 25:
                c42.j jVar4 = (c42.j) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocationDomain) jVar4.invoke(p0);
            case 26:
                bwc.i iVar2 = (bwc.i) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar2.invoke(p0);
            case 27:
                byc.a aVar5 = (byc.a) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar5.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f20794a) {
            case 4:
                c2d.n nVar = (c2d.n) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) nVar.invoke(p0)).booleanValue();
            default:
                c49.a aVar = (c49.a) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
        }
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j2) {
        return ((FlacStreamMetadata) this.f20795b).getSampleNumber(j2);
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        c2f.m mVar = (c2f.m) this.f20795b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) mVar.invoke(p0, p17)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f20794a) {
            case 7:
                c2f.m mVar = (c2f.m) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (ExchangeOrderDraft) mVar.invoke(p0, p17);
            default:
                c2f.m mVar2 = (c2f.m) this.f20795b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (Boolean) mVar2.invoke(p0, p17);
        }
    }
}
