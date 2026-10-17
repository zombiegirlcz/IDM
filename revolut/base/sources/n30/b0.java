package n30;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mx0.x8;
import org.jetbrains.annotations.NotNull;
import v30.e1;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 implements z {

    @NotNull
    public static final a0 Companion = new a0();
    public static final e1 e = new e1(10000, 60000, new e1.a(0.3d, 500, MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, 600000));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e30.b f211610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e30.e f211611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f211612c;
    public final Lazy d;

    public b0(e30.b webSocketDelegate, n chatInteractor, e30.e wsRepository, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(webSocketDelegate, "webSocketDelegate");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(wsRepository, "wsRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f211610a = webSocketDelegate;
        this.f211611b = wsRepository;
        this.f211612c = coroutineScope;
        this.d = yhm.j.b(new x8(this, 16));
    }
}
