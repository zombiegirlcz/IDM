package b0;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.VideoCapture;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements SessionConfig.ErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11510b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f11509a = i;
        this.f11510b = obj2;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        switch (this.f11509a) {
            case 0:
                ((ImageCapture) this.f11510b).lambda$createPipeline$4(sessionConfig, sessionError);
                break;
            case 1:
                ((Preview) this.f11510b).lambda$addCameraSurfaceAndErrorListener$1(sessionConfig, sessionError);
                break;
            case 2:
                ((SessionConfig.ValidatingBuilder) this.f11510b).lambda$build$0(sessionConfig, sessionError);
                break;
            default:
                ((VideoCapture) this.f11510b).lambda$createPipeline$3(sessionConfig, sessionError);
                break;
        }
    }
}
