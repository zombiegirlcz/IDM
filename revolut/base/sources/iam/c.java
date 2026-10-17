package iam;

import hx7.q;
import i26.l;
import io.fotoapparat.exception.camera.CameraException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f160062h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i) {
        super(0);
        this.f = i;
        this.f160062h = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        switch (this.f) {
            case 0:
                e eVar = this.f160062h;
                qam.e eVar2 = eVar.d;
                sam.e orientationSensor = (sam.e) eVar.e.getValue();
                c2m.b mainThreadErrorCallback = eVar.f160066c;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
                Intrinsics.checkNotNullParameter(mainThreadErrorCallback, "mainThreadErrorCallback");
                if (eVar2.f244071h.isCompleted()) {
                    throw new IllegalStateException("Camera has already started!");
                }
                try {
                    q.X(eVar2, orientationSensor);
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
                    c2m.b listener = new c2m.b(eVar2, 1);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    orientationSensor.f261463c = listener;
                    orientationSensor.f261461a.enable();
                    break;
                } catch (CameraException e) {
                    mainThreadErrorCallback.invoke(e);
                }
                return Unit.f186387a;
            default:
                e eVar3 = this.f160062h;
                qam.e eVar4 = eVar3.d;
                sam.e orientationSensor2 = (sam.e) eVar3.e.getValue();
                Intrinsics.checkNotNullParameter(eVar4, "<this>");
                Intrinsics.checkNotNullParameter(orientationSensor2, "orientationSensor");
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(orientationSensor2, "<this>");
                orientationSensor2.f261461a.disable();
                l.t(eVar4, eVar4.c());
                return Unit.f186387a;
        }
    }
}
