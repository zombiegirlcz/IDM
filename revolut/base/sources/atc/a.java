package atc;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f9024a;

    public a(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f9024a = uiKitResources;
    }

    public final String b(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        return this.f9024a.b(clause).toString();
    }
}
