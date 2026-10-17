package z2a;

import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferPersonalisationStyleSelectorContract$InputData f319038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2a.a f319039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f319040c;

    public d(TransferPersonalisationStyleSelectorContract$InputData inputData, r2a.a personalisationUiInfoMapper, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalisationUiInfoMapper, "personalisationUiInfoMapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f319038a = inputData;
        this.f319039b = personalisationUiInfoMapper;
        this.f319040c = uriHelper;
    }
}
