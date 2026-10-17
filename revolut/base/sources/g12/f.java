package g12;

import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrFlowInputData f139520a;

    public f(QrFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f139520a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f139520a, ((f) obj2).f139520a);
    }

    public final int hashCode() {
        return this.f139520a.hashCode();
    }
}
