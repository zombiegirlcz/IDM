package c2m;

import abm.c;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.View;
import com.trustdockekyc.core.backend.presentation.DevelopmentAlertActivity;
import com.trustdockekyc.core.backend.presentation.view.TutorialView;
import fbm.d;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.view.CameraView;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import n2m.e;
import sam.f;
import uam.i;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20836h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, int i) {
        super(1);
        this.f = i;
        this.f20836h = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        int i = this.f;
        int i2 = 1;
        Object obj3 = this.f20836h;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                if (aVar != null && (objA = aVar.a()) != null) {
                    ((e) obj3).invoke(objA);
                }
                return Unit.f186387a;
            case 1:
                f orientationState = (f) obj2;
                Intrinsics.checkNotNullParameter(orientationState, "orientationState");
                qam.e eVar = (qam.e) obj3;
                eVar.e.B(new mam.a(true, new c(eVar, orientationState, i2)));
                return Unit.f186387a;
            case 2:
                d dVar = new d(obj2, 0);
                for (Function1 function1 : (Function1[]) obj3) {
                    Object objInvoke = dVar.invoke(function1);
                    if (objInvoke != null) {
                        return objInvoke;
                    }
                }
                return null;
            case 3:
                SurfaceTexture $receiver = (SurfaceTexture) obj2;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                CameraView cameraView = (CameraView) obj3;
                cameraView.d = $receiver;
                cameraView.f162987a.countDown();
                return Unit.f186387a;
            case 4:
                View it8 = (View) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                DevelopmentAlertActivity developmentAlertActivity = (DevelopmentAlertActivity) obj3;
                developmentAlertActivity.setResult(-1);
                developmentAlertActivity.finish();
                return Unit.f186387a;
            case 5:
                CameraException cameraException = (CameraException) obj2;
                Function1 function12 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(cameraException, "cameraException");
                if (Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                    function12.invoke(cameraException);
                } else {
                    c function = new c(function12, cameraException, 4);
                    ExecutorService executorService = qam.f.f244072a;
                    Intrinsics.checkNotNullParameter(function, "function");
                    qam.f.f244073b.post(new o6.a(function));
                }
                return Unit.f186387a;
            case 6:
                int iIntValue = ((Number) obj2).intValue();
                sam.e eVar2 = (sam.e) obj3;
                f fVar = new f(xam.a.D((((iIntValue / 90) + (iIntValue % 90 > 45 ? 1 : 0)) * 90) % 360), eVar2.f261462b.b());
                if (!fVar.equals(eVar2.d)) {
                    Intrinsics.checkNotNullParameter(fVar, "<set-?>");
                    eVar2.d = fVar;
                    b bVar = eVar2.f261463c;
                    if (bVar == null) {
                        Intrinsics.r("listener");
                        throw null;
                    }
                    bVar.invoke(fVar);
                }
                return Unit.f186387a;
            case 7:
                View it9 = (View) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                TutorialView tutorialView = (TutorialView) obj3;
                View.OnClickListener buttonClickListener = tutorialView.getButtonClickListener();
                if (buttonClickListener != null) {
                    buttonClickListener.onClick(tutorialView);
                }
                return Unit.f186387a;
            default:
                i it10 = (i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.a() <= ((i) obj3).a());
        }
    }
}
