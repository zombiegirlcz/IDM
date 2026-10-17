package j8d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FaqFormChooserScreenContract$InputData f172174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f172175q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, FaqFormChooserScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f172174p = inputData;
        this.f172175q = new c(inputData.f86257b);
    }

    @Override // jki.g
    public final i r2() {
        return this.f172175q;
    }
}
