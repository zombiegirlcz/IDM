package bli;

import android.content.Intent;
import androidx.camera.core.CameraInfo;
import androidx.camera.video.EncoderProfilesResolverFactory;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import bmm.u;
import com.revolut.kompot.navigable.screen.BaseScreen;
import dki.r;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import yji.d;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16702c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj2, Object obj3, int i2, int i3) {
        this.f16700a = i3;
        this.d = obj2;
        this.f16701b = i;
        this.f16702c = i2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16700a) {
            case 0:
                b bVar = (b) this.d;
                int i = this.f16701b;
                int i2 = this.f16702c;
                Intent intent = (Intent) this.e;
                Iterator it8 = bVar.f16703a.getAll().iterator();
                while (it8.hasNext()) {
                    com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
                    if (aVar != null) {
                        aVar.onActivityResult(i, i2, intent);
                        Unit unit = Unit.f186387a;
                    }
                }
                return Unit.f186387a;
            case 1:
                u uVar = (u) this.d;
                int i3 = this.f16701b;
                h source = (h) this.e;
                int i5 = this.f16702c;
                try {
                    uVar.k.getClass();
                    Intrinsics.checkNotNullParameter(source, "source");
                    source.skip(i5);
                    uVar.f16976x.i(i3, bmm.b.CANCEL);
                    synchronized (uVar) {
                        uVar.z.remove(Integer.valueOf(i3));
                        Unit unit2 = Unit.f186387a;
                    }
                } catch (IOException unused) {
                }
                return Unit.f186387a;
            case 2:
                r rVar = (r) this.d;
                int i6 = this.f16701b;
                int i21 = this.f16702c;
                Intent intent2 = (Intent) this.e;
                rVar.d.invoke(Integer.valueOf(i6), Integer.valueOf(i21), intent2);
                Iterator it9 = ((Iterable) rVar.f115554c.invoke()).iterator();
                while (it9.hasNext()) {
                    com.revolut.kompot.navigable.a aVar2 = ((com.revolut.kompot.navigable.b) it9.next()).k;
                    if (aVar2 != null) {
                        aVar2.onActivityResult(i6, i21, intent2);
                        Unit unit3 = Unit.f186387a;
                    }
                }
                return Unit.f186387a;
            case 3:
                ((BaseScreen) this.d).U2(this.f16701b, this.f16702c, (Intent) this.e);
                return Unit.f186387a;
            case 4:
                return EncoderProfilesResolverFactory.getResolver$lambda$0((CameraInfo) this.d, this.f16701b, this.f16702c, (VideoEncoderInfo.Finder) this.e);
            default:
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) this.d;
                int i22 = this.f16701b;
                int i32 = this.f16702c;
                Intent intent3 = (Intent) this.e;
                Iterator it10 = aVar3.o2().iterator();
                while (it10.hasNext()) {
                    ((d) it10.next()).onActivityResult(i22, i32, intent3);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(u uVar, int i, h hVar, int i2, boolean z) {
        this.f16700a = 1;
        this.d = uVar;
        this.f16701b = i;
        this.e = hVar;
        this.f16702c = i2;
    }
}
