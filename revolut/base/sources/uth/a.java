package uth;

import cli.j;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ProductClosurePrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductClosurePrompt f283103a;

    public a(ProductClosurePrompt promptData) {
        Intrinsics.checkNotNullParameter(promptData, "promptData");
        this.f283103a = promptData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f283103a, ((a) obj2).f283103a);
    }

    public final int hashCode() {
        return this.f283103a.hashCode();
    }
}
