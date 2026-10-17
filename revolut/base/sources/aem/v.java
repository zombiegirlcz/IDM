package aem;

import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.core.internal.security.NativeSecurityChecker;
import com.fourthline.orca.core.internal.test.TestDocumentListSource;
import com.fourthline.orca.workflow.SessionBuilderKt;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.internal.ab;
import com.fourthline.vision.internal.bb;
import com.fourthline.vision.internal.za;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3785a;

    public /* synthetic */ v(int i) {
        this.f3785a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3785a) {
            case 0:
                return a1m.e.a("io.ktor.client.plugins.SaveBody");
            case 1:
                return Unit.f186387a;
            case 2:
                return Unit.f186387a;
            case 3:
                return Unit.f186387a;
            case 4:
                return MotionFrame.a();
            case 5:
                return MotionFrame.b();
            case 6:
                return MotionFrame.c();
            case 7:
                return MotionFrame.d();
            case 8:
                return MotionFrame.e();
            case 9:
                return Long.valueOf(SessionBuilderKt.a());
            case 10:
                return MotionData._childSerializers$_anonymous_();
            case 11:
                return MotionData._childSerializers$_anonymous_$0();
            case 12:
                return Long.valueOf(ab._init_$lambda$0());
            case 13:
                return Integer.valueOf(bb.currentRandomnessLivenessStepIndexFactory$lambda$0());
            case 14:
                return com.fourthline.vision.internal.g.recorder_delegate$lambda$0();
            case 15:
                return com.fourthline.vision.internal.x.contentDetectionAreaProvider$lambda$0();
            case 16:
                return Unit.f186387a;
            case 17:
                return Unit.f186387a;
            case 18:
                return za.stepFlowRepository_delegate$lambda$0();
            case 19:
                return new LinkedHashMap();
            case 20:
                return Unit.f186387a;
            case 21:
                return Unit.f186387a;
            case 22:
                return Unit.f186387a;
            case 23:
                return Unit.f186387a;
            case 24:
                return Boolean.valueOf(NativeSecurityChecker.libraryLoaded_delegate$lambda$0());
            case 25:
                return new ArrayList();
            case 26:
                return new ArrayList();
            case 27:
                return TestDocumentListSource.a();
            case 28:
                return qlm.j1.b("io.ktor.util.date.WeekDay", qem.h.values());
            default:
                return qlm.j1.b("io.ktor.util.date.Month", qem.f.values());
        }
    }
}
