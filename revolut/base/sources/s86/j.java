package s86;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f260909a;

    public j(l lVar) {
        this.f260909a = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List<UserDevice> devices = (List) obj2;
        Intrinsics.checkNotNullParameter(devices, "devices");
        for (UserDevice userDevice : devices) {
            if (Intrinsics.f(userDevice.f71914a, this.f260909a.o.f71932a)) {
                return userDevice;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
