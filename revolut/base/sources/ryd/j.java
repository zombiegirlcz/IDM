package ryd;

import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.Recorder;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements kfm.o, kfm.p, kfm.g, kfm.c, ImageCapture.ScreenFlashListener, SurfaceRequest.TransformationInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f258347b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f258346a = i;
        this.f258347b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((k) this.f258347b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f258346a) {
            case 0:
                rxb.b bVar = (rxb.b) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar.invoke(p0);
            case 1:
                k kVar = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) kVar.invoke(p0);
            case 2:
                e eVar = (e) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar.invoke(p0);
            case 3:
                f fVar = (f) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
            case 4:
                k kVar2 = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) kVar2.invoke(p0);
            case 5:
                i iVar = (i) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) iVar.invoke(p0);
            case 6:
                rsl.p pVar = (rsl.p) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) pVar.invoke(p0);
            case 7:
            case 11:
            case 12:
            case 14:
            case 17:
            case 18:
            default:
                s08.f fVar2 = (s08.f) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) fVar2.invoke(p0);
            case 8:
                rz4.a aVar = (rz4.a) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 9:
                rz4.a aVar2 = (rz4.a) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) aVar2.invoke(p0);
            case 10:
                rsl.p pVar2 = (rsl.p) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) pVar2.invoke(p0);
            case 13:
                i iVar2 = (i) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) iVar2.invoke(p0);
            case 15:
                k kVar3 = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar3.invoke(p0);
            case 16:
                k kVar4 = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) kVar4.invoke(p0);
            case 19:
                pud.b bVar2 = (pud.b) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) bVar2.invoke(p0);
            case 20:
                ael.s sVar = (ael.s) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar.invoke(p0);
            case 21:
                k kVar5 = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (s06.u) kVar5.invoke(p0);
            case 22:
                k kVar6 = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) kVar6.invoke(p0);
            case 23:
                ard.t tVar = (ard.t) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) tVar.invoke(p0);
            case 24:
                s06.e eVar2 = (s06.e) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                eVar2.invoke(p0);
                return Boolean.TRUE;
            case 25:
                s06.k kVar7 = (s06.k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) kVar7.invoke(p0);
            case 26:
                s06.k kVar8 = (s06.k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) kVar8.invoke(p0);
            case 27:
                s06.k kVar9 = (s06.k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) kVar9.invoke(p0);
            case 28:
                s06.k kVar10 = (s06.k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) kVar10.invoke(p0);
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
    public void onCompleted() {
        FlashControl.applyScreenFlash$lambda$0((skm.r) this.f258347b);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((Recorder) this.f258347b).lambda$configureInternal$9(transformationInfo);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f258346a) {
            case 7:
                k kVar = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar.invoke(p0)).booleanValue();
            default:
                k kVar2 = (k) this.f258347b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar2.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        l lVar = (l) this.f258347b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Boolean) lVar.invoke(p0, p17);
    }
}
