package a70;

import android.net.Uri;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.util.Consumer;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import dw.e;
import dw.h;
import dw.u;
import ht0.b0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1709b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f1708a = i;
        this.f1709b = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f1708a) {
            case 0:
                c cVar = (c) this.f1709b;
                MultiWindowModeChangedInfo it8 = (MultiWindowModeChangedInfo) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                BaseDelegatesActivity baseDelegatesActivity = cVar.f1712a;
                if (baseDelegatesActivity != null) {
                    baseDelegatesActivity.setRequestedOrientation(it8.getIsInMultiWindowMode() ? -1 : 1);
                    break;
                }
                break;
            case 1:
                h hVar = ((dw.b) this.f1709b).f118164b;
                hVar.d.execute(new e(hVar, 1));
                break;
            case 2:
                h hVar2 = ((u) this.f1709b).f118224b;
                hVar2.d.execute(new e(hVar2, 1));
                break;
            case 3:
                SurfaceProcessorNode.lambda$setUpRotationUpdates$1((Map) this.f1709b, (SurfaceRequest.TransformationInfo) obj2);
                break;
            case 4:
                ((Recorder) this.f1709b).lambda$setupAndStartMuxer$11((Uri) obj2);
                break;
            case 5:
                ((VideoSpec.Builder) obj2).setQualitySelector((QualitySelector) this.f1709b);
                break;
            default:
                b0 b0Var = (b0) this.f1709b;
                Intrinsics.checkNotNullParameter((MultiWindowModeChangedInfo) obj2, "it");
                b0Var.invoke();
                break;
        }
    }
}
