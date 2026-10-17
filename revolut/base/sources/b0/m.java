package b0;

import androidx.camera.core.SessionConfig;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;
import com.revolut.feature.push.PushDispatcherActivity;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class m implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11520a;

    public /* synthetic */ m(int i) {
        this.f11520a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f11520a) {
            case 0:
                SessionConfig.featureSelectionListener$lambda$0((Set) obj2);
                break;
            case 1:
                String str = (String) obj2;
                PushDispatcherActivity.a aVar = PushDispatcherActivity.Companion;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.WARNING;
                Intrinsics.h(str);
                rd0.d.b(cVar, "PushDispatcher", str, null, null, 16);
                break;
            case 2:
                DeviceQuirks.lambda$static$0((QuirkSettings) obj2);
                break;
            case 3:
                androidx.camera.camera2.compat.quirk.DeviceQuirks._init_$lambda$0((QuirkSettings) obj2);
                break;
            case 4:
                Recorder.lambda$composeRecorderMediaSpec$10((VideoSpec.Builder) obj2);
                break;
            case 5:
                androidx.camera.video.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj2);
                break;
            default:
                androidx.camera.view.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj2);
                break;
        }
    }
}
