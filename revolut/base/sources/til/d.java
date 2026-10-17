package til;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import wp5.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d extends yji.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public abstract void Z2(SharedStep sharedStep);

    public abstract g b3(SharedStep sharedStep, plc.i iVar);

    public abstract ViewController c3(dj0.d dVar, List list, boolean z, String str, String str2, String str3, wuh.h hVar);

    public abstract ViewController d3(SdkVendorInfo sdkVendorInfo, v vVar);
}
